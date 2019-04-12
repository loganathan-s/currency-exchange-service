package com.logan.microservices.currencyexchangeservice;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor()
@NoArgsConstructor
@Entity
public class ExchangeValue {

	@Id
	@NonNull private Long id;

	@Column(name="currency_from")
	@NonNull	private String from;
	@Column(name="currency_to")
	@NonNull private String to;
	@NonNull private BigDecimal conversionMultiple;

	// Field added to return the port number of the instance which is sending response
	// added for development purpose, not a good practice for production
	private int port;
}
