package com.example.demo;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service04entity.Application;
import com.example.demo.service04entity.Input;
import com.example.demo.service04entity.Parameters;
import com.example.demo.service04entity.Security;
import com.example.demo.service04entity.Service04;
import com.example.demo.service04entity.subjectCodes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@Api
public class demoappController {

	@GetMapping(path = "/servicio4")
	public Service04 servicio4() {

		Service04 service = new Service04(new Input(new Application("string", "string", "string", "string"),
				new Parameters("string"), new subjectCodes("258068459")), new Security("user", "xxx"));

		return service;
	}

	@PostMapping(path = "/servicio5")
	public Service04 servicio5(@RequestBody Service04 service) {

		// Service04 service = new Service04(new Input(new
		// Application("string","string","string","string"), new Parameters("string"),
		// new subjectCodes("258068459")), new Security("user","xxx"));

		return service;
	}

	@GetMapping(path = "/dolaresapp")
	public JsonNode servicioConsumer() throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String response = restTemplate
				.exchange("https://apps.bolchile.com/api/v1/dolarstatd2", HttpMethod.GET, entity, String.class)
				.getBody();

		ObjectMapper mapper = new ObjectMapper();
		JsonNode actualObj;

		actualObj = mapper.readTree(response);
		return actualObj;

	}
	
	@PostMapping(path = "/consumerPost")
	public JsonNode servicioConsumerPost(@RequestBody Service04 service) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Service04> entity = new HttpEntity<Service04>(service, headers);
		String response = restTemplate
				.exchange("https://apps.bolchile.com/api/v1/dolarstatd2", HttpMethod.POST, entity, String.class)
				.getBody();

		ObjectMapper mapper = new ObjectMapper();
		JsonNode actualObj;

		actualObj = mapper.readTree(response);
		return actualObj;

	}
	
}
