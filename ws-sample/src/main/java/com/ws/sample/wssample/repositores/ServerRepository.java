package com.ws.sample.wssample.repositores;

import com.ws.sample.wssample.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServerRepository extends JpaRepository<Server, Long> {

	@Query(value = "SELECT addserver(?1, ?2, ?3, ?4)", nativeQuery = true)
	Long addServer(String name, String description, String location, int quantity);
}
