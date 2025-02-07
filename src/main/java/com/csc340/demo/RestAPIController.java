package com.csc340.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


@RestController
public class RestAPIController {
    @GetMapping("agents/{id}")
    public Object getAgents(@RequestParam String agentID) {
        try {
            String url = "https://valorant-api.com/v1/agents/" + agentID;
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();


            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);

            Agents agent = new Agents(root.get("agentID").asText(), root.get("name").asText(), root.get("age").asInt(),
                    root.get("role").asText());

            return agent;

        } catch (JsonProcessingException ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return "error in /agent";
        }

    }}


