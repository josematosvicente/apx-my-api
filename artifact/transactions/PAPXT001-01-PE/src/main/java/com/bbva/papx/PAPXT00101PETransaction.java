package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.papx.dto.customer.CustomerDTO;
import com.bbva.papx.lib.r001.PAPXR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Transaction to Get a Customer
 *
 */
public class PAPXT00101PETransaction extends AbstractPAPXT00101PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00101PETransaction.class);

	@Override
	public void execute() {
		PAPXR001 papxR001 = getServiceLibrary(PAPXR001.class);

		String customerId = this.getCustomerid();
		LOGGER.debug("CustomerId from Consumer: {}", customerId);

		CustomerDTO customerDB = papxR001.executeGetCustomer(customerId);

		if(customerDB == null){
			this.setSeverity(Severity.ENR);
		}else{
			this.setCustomer(customerDB);
			this.setSeverity(Severity.OK);
		}
	}

}
