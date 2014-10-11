package com.dreamoval.aml.neo4j;

import com.dreamoval.aml.model.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dreamadmin on 10/11/14.
 */
@Component
public class NeoRestClient {

    String baseUrl = "http://192.168.0.235:7474/db/data/";

    public String addCustomer(){
        return "";
    }

    public String addAccount(){
        return "";
    }

    public String addTransaction(){
        return "";
    }

    public String addFinancialInstitute(){
        return "";
    }

    public String addNode(MultiValueMap<String,String> map){
        String url = baseUrl+"/node";
        try{
            RestTemplate rest = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
//            map.add("name","Steve");
//            HttpEntity<String> entity = new HttpEntity<String>(node,headers);

            ResponseEntity<String> result = rest.postForEntity(url,map,String.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    public Response runQuery(MultiValueMap<String,String> map){
        String url = baseUrl+"/cypher";
        try{
            RestTemplate rest = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);

//            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
//            map.add("name","Steve");
//            HttpEntity<String> entity = new HttpEntity<String>(node,headers);

            ResponseEntity<Response> result = rest.postForEntity(url,map,Response.class);
            return result.getBody();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String call(RestTemplate rest){

        return "";
    }
}
