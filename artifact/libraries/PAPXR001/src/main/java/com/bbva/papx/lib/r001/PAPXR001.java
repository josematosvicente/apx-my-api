package com.bbva.papx.lib.r001;

import com.bbva.papx.dto.customer.CustomerDTO;

public interface PAPXR001 {

	CustomerDTO executeGetCustomer(String customerId);

}
