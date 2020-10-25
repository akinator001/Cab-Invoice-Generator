package com.cp.cabinvoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceTest {
	CabInvoice cabInvoice = null;

	@Before
	public void setUp() throws Exception {
		cabInvoice = new CabInvoice();
	}

	@Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
    	CabInvoice cabInvoice = new CabInvoice();
    	double distance = 2.0;
    	int time = 5;
    	double fare = cabInvoice.calculateFare(distance, time);
    	Assert.assertEquals(25, fare, 0.0);
    }
	@Test
    public void givenMultipleRide_ShouldReturnTotalFare() {
    	CabInvoice cabInvoice = new CabInvoice();
    	Ride rides[] = {new Ride(2.0, 5),
    				   new Ride(0.1, 1)};
    	InvoiceSummary invoiceSummary = cabInvoice.calculateFare(rides);
    	InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
    	Assert.assertEquals(expectedInvoiceSummary, invoiceSummary);
    }	
}
