package com.ibm.abn.hackathon.bot.interfaces;

public interface Accesstokens {
		
												   
	public static final String page_access_token="XXXXX";
	public static final String page_receipent_token="111111";
	public static final String fb_postback_url="https://graph.facebook.com/v2.6/me/messages?access_token=";
	public static final String url= fb_postback_url+page_access_token;
	public static final String urlForGettingProfilepart1= "https://graph.facebook.com/v2.6/";
	public static final String urlForGettingProfilepart2= "?fields=first_name,last_name,locale,timezone,gender&access_token=";
	public static final String GET_STARTED_PAYLOAD= "GET_STARTED_PAYLOAD";
	public static final String ABOUT_DREAM= "ABOUT_DREAM";
	public static final String START= "START";
	public static final String TALK_ME= "TALK_ME";
	public static final String PANELS= "PANELS";
	//public static final String TALK_ME= "TALK_ME";
	public static final String POSTCODE = "1111";
	

}
