package com.csc340.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



@RestController
public class RestAPIController {

    //Get list of agent uuids
    @GetMapping("/agents/list")
    public Object getAllAgents() {
        try {
            String url = "https://valorant-api.com/v1/agents/";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);

            ArrayList<Object> agentsUUIDs = new ArrayList<>();
            for (JsonNode agentNode : root.path("data")) {
                String uuid = agentNode.path("uuid").asText();
                agentsUUIDs.add(uuid);
            }

            return agentsUUIDs;

        } catch (JsonProcessingException ex) {
            Logger.getLogger(RestAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return "Error fetching agent UUIDs";
        }
    }


    //get agent info with uuid
    @GetMapping("/agents/{uuid}")
    public Object agents(@PathVariable String uuid ) {
        try {
            String url = "https://valorant-api.com/v1/agents/" + uuid;
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);


            Agents agent = new Agents(
                    root.path("data").path("uuid").asText(),
                    root.path("data").path("displayName").asText(),
                    root.path("data").path("developerName").asText(),
                    root.path("data").path("description").asText()
            );

            return agent;

        } catch (JsonProcessingException ex) {
            Logger.getLogger(RestAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return "Error in /agents/{uuid}";
        }
    }
}
