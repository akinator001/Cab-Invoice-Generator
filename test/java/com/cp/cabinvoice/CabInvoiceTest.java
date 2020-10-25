package com.cp.cabinvoice;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	@Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
    	CabInvoice cabInvoice = new CabInvoice();
    	double distance = 2.0;
    	int time = 5;
    	double fare = cabInvoice.calculateFare(distance, time);
    	Assert.assertEquals(25, fare, 0.0);
    }
}
