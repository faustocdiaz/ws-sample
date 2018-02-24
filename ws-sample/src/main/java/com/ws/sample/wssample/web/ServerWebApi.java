package com.ws.sample.wssample.web;


import com.ws.sample.wssample.model.Server;
import com.ws.sample.wssample.services.ServerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api")
public class ServerWebApi {

	private final ServerService serverService;

	public ServerWebApi(ServerService serverService) {
		this.serverService = serverService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Server> list() {
		return this.serverService.list();
	}

	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<Server> add(@RequestBody Server server) {
		return ResponseEntity.ok(this.serverService.addServer(server));
	}

}