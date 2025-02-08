## This program uses an API from: https://valorant-api.com
>>
1. Gives Information about your chosen Agent (in-game character)
2. JDK version 21
3. coded using Windows
4. Java, Springboot, Maven
## Valorant Agent Information Given
>>
1. Agent ID/UUID
2. Agent Name
3. Agent Developer Name
4. Agent Background
## How to run this program:
>>
1. download the folder
2. unzip
3. open file in IntelliJ (Select the folder that has a tiny black box on it. Not the parent folder)
4. run the main method (named: DemoApplication.java)
5. Open postman and host
## What to host: (GET)
>>
1. "http://localhost:8080/agents/list" (To get the list of Agent uuIDs)
2. pick one of the UUIDs and copy
3. "http://localhost:8080/agents/{uuid}" (paste where {uuid} is}
4. read the fun facts about the agent you got !
