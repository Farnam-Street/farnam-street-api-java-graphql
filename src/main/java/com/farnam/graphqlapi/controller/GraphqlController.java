package com.farnam.graphqlapi.controller;

import com.farnam.graphqlapi.helper.APIHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.http.ResponseEntity;
@RestController
public class GraphqlController {
//    @Autowired
//    GraphqlController(GraphQlUtility graphQlUtility) throws IOException {
//        this.graphQlUtility = graphQlUtility;
//        graphQL = graphQlUtility.createGraphQlObject();
//    }

    @GetMapping(value = "/info")
    public ResponseEntity info(){
//        ExecutionResult result = graphQL.execute(query);

        return ResponseEntity.ok(APIHelper.Message("info"));
    }
}
