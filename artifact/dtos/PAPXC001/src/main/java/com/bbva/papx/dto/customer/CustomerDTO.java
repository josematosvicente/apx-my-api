package com.bbva.papx.dto.customer;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class Name: CustomerDTO
 * Description: Initial class to develop the DTO
 */

public class CustomerDTO extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

    // Attributes section for the DTO
	private String customerId;
	private String firstName;
	private String lastName;

	public CustomerDTO() {
		super();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CustomerDTO{");
		sb.append("customerId='").append(customerId).append('\'');
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
