package com.dxc.cassandra.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "com.dxc.cassandra.repository")
public class CassandraConfiguration extends AbstractCassandraConfiguration{
	 @Value("${spring.data.cassandra.keyspace-name}")
     private String keySpace;

     @Value("${spring.data.cassandra.contact-points}")
     private String contactPoints;

     @Value("${spring.data.cassandra.port}")
     private int port;

	@Override
	protected String getKeyspaceName() {
		return keySpace;
	}

	@Override
	protected String getContactPoints() {
		return contactPoints;
	}

	@Override
	protected int getPort() {
		return port;
	}
}
