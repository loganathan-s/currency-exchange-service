package com.logan.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

// Model Name -> ExchangeValue
// ID data type -> Long
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	//
	// Query Methods
	// Only some querymethods are provide by JPA
	ExchangeValue  findByFromAndTo(String from, String to);
}
