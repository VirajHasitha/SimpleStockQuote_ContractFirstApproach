/**
 * StockQuoteSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */
package net.webservicex.www;

/**
 *  StockQuoteSkeleton java skeleton for the axisService
 */

import java.lang.String;

public class StockQuoteSkeleton {

	String symbolFromQuote;
	// public net.webservicex.www.GetQuoteResponse getQuote
	public net.webservicex.www.GetQuoteResponse getQuote(net.webservicex.www.GetQuote getQuote) {
		
		
		
		
		GetQuoteResponse response = new GetQuoteResponse();
        response.setGetQuoteResult(getQuote.getSymbol());
        return response;

//		try{
//			symbolFromQuote = getQuote.getSymbol();
//			// net.webservicex.www.GetQuote getQuote
//			// TODO : fill this with the necessary business logic
//
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		


//		throw new java.lang.UnsupportedOperationException("Please implement "
//				+ this.getClass().getName() + "#getQuote");
	}

}
