package com.ws.sample.wssample.services;

import com.ws.sample.wssample.model.Server;

import java.util.List;

public interface ServerService {
	List<Server> list();
	Server findOne(Long id);
	Server save(Server server);
	Server addServer(Server server);
}
