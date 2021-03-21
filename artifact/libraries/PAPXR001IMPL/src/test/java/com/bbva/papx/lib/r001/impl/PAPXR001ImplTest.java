package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.customer.CustomerDTO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PAPXR001ImplTest {

    private PAPXR001Impl papxr001;

    @Before
    public void setup(){
        papxr001 = new PAPXR001Impl();
    }

    @Test
    public void executeGetCustomerNULL() {
        CustomerDTO customerDTO = papxr001.execute(null);
        assertNull(customerDTO);
    }

    @Test
    public void executeGetCustomerOK() {
        CustomerDTO customerDTO = papxr001.execute("123456789");
        assertNotNull(customerDTO);
    }
}