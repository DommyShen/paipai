package com.sbkj.paipai.api.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.sbkj.paipai.api.DefaultPaipaiClient;
import com.sbkj.paipai.api.OpenApiException;
import com.sbkj.paipai.api.request.attr.GetAttrOptionListRequest;
import com.sbkj.paipai.api.request.attr.GetAttributeListRequest;
import com.sbkj.paipai.api.request.attr.GetNavByNavMapIdRequest;
import com.sbkj.paipai.api.request.attr.GetNavigationChildListRequest;
import com.sbkj.paipai.api.response.attr.GetAttrOptionListResponse;
import com.sbkj.paipai.api.response.attr.GetAttributeListResponse;
import com.sbkj.paipai.api.response.attr.GetNavByNavMapIdResponse;
import com.sbkj.paipai.api.response.attr.GetNavigationChildListResponse;
import com.sbkj.paipai.api.utils.Constants;

public class PaipaiApiAttrTest extends TestCase{
	
	private DefaultPaipaiClient client = new DefaultPaipaiClient(Constants.REQUEST_URL, "700203479", "3VXbUHLMKk2RMWk7", "1192447308");
	
	private String sessionKey = "697e8cb548aa553ec19cb21f74ec2afd";
	
	@Test
	public void testGetNavigationChildList() throws OpenApiException{
		GetNavigationChildListRequest req = new GetNavigationChildListRequest();
		req.setNavigationId(500014l);
		GetNavigationChildListResponse response = client.execute(req, sessionKey);
		System.out.println(response.getBody());
		assertEquals(true, response.isSuccess());
	}
	
	@Test
	public void testGetNavByNavMapId() throws OpenApiException{
		GetNavByNavMapIdRequest req = new GetNavByNavMapIdRequest();
		req.setMapId(0l);
		req.setNavId(0l);
		GetNavByNavMapIdResponse response = client.execute(req, sessionKey); 
		System.out.println(response.getBody());
		assertEquals(true, response.isSuccess());
	}
	
	@Test
	public void testGetAttrOptionList() throws OpenApiException{
		GetAttrOptionListRequest req = new GetAttrOptionListRequest();
		req.setClassId(231089l);
		req.setAttrId(1l);
		GetAttrOptionListResponse response = client.execute(req, sessionKey);
		System.out.println(response.getBody());
		assertEquals(true, response.isSuccess());
	}
	
	@Test
	public void testGetAttributeList() throws OpenApiException{
		GetAttributeListRequest req = new GetAttributeListRequest();
		req.setClassId(211687l);
		GetAttributeListResponse response = client.execute(req, sessionKey);
		System.out.println(response.getBody());
		assertEquals(true, response.isSuccess());
	}
	
}
