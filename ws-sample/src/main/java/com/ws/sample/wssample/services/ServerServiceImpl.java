package com.ws.sample.wssample.services;

import com.ws.sample.wssample.model.Server;
import com.ws.sample.wssample.repositores.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {
	private final ServerRepository serverRepository;

	@Autowired
	public ServerServiceImpl(ServerRepository serverRepository) {
		this.serverRepository = serverRepository;
	}

	@Override
	public List<Server> list() {
		return this.serverRepository.findAll();
	}

	@Override
	public Server findOne(Long id) {
		return this.serverRepository.findOne(id);
	}

	@Override
	public Server save(Server server) {
		return this.serverRepository.save(server);
	}

	@Override
	public Server addServer(Server server) {
		Long serverId = this.serverRepository.addServer(
				server.getName(),
				server.getDescription(),
				server.getLocation(),
				server.getQuantity());

		return this.serverRepository.findOne(serverId);
	}

}
