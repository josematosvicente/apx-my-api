package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.customer.CustomerDTO;

public abstract class AbstractPAPXT00101PETransaction extends AbstractTransaction {

	public AbstractPAPXT00101PETransaction(){
	}


	/**
	 * Return value for input parameter customerId
	 */
	protected String getCustomerid(){
		return (String)this.getParameter("customerId");
	}

	/**
	 * Set value for CustomerDTO output parameter customer
	 */
	protected void setCustomer(final CustomerDTO field){
		this.addParameter("customer", field);
	}
}
