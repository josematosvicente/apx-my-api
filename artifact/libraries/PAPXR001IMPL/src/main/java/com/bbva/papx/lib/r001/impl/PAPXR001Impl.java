package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.customer.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PAPXR001Impl extends PAPXR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR001Impl.class);


	@Override
	public CustomerDTO execute(String customerId) {

		if (customerId == null) {
			return null;
		}

		

		//Simulacion de obtencion de un cliente
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerId(customerId);
		customerDTO.setFirstName("Richard");
		customerDTO.setLastName("Feynman");

		LOGGER.info("[PAPXR001] executeGetCustomer:: END ");
		LOGGER.debug(customerDTO.toString());

		return customerDTO;
	}
}
