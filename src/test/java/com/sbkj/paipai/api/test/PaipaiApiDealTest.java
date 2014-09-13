package com.sbkj.paipai.api.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;

import com.sbkj.paipai.api.DefaultPaipaiClient;
import com.sbkj.paipai.api.OpenApiException;
import com.sbkj.paipai.api.request.deal.SellerSearchDealListRequest;
import com.sbkj.paipai.api.response.deal.SellerSearchDealListResponse;
import com.sbkj.paipai.api.utils.Constants;

public class PaipaiApiDealTest extends TestCase{
private DefaultPaipaiClient client = new DefaultPaipaiClient(Constants.REQUEST_URL, "700203181", "zDusQYtPHsTaqrP4", "1605118934");
	
	private String sessionKey = "189d73ebb180b3e4c3b15ba433cc5a72";
	
	@Test
	public void testSellerSearchDealList() throws ParseException, OpenApiException{
		SellerSearchDealListRequest req = new SellerSearchDealListRequest();
		req.setSellerUin("1605118934");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date start = format.parse("2014-09-01 00:00:00");
		Date end = format.parse("2014-08-01 00:00:00");
		req.setTimeBegin(start);
		req.setTimeEnd(end);
		req.setTimeType("ee");
		SellerSearchDealListResponse response = client.execute(req, sessionKey);
		System.out.println(response.getBody());
	}
	
}
