package com.jwetherell.quick_response_code;

public class Configurations {
	
	  public static int transparent = 0x00000000;
	  
	  public static int contents_text = 0xff000000;
	  
	  public static int encode_view = 0xffffffff;

	  public static int possible_result_points = 0xc07FFF00;
	  
	  public static int result_image_border = 0xff526F35;
	  public static int result_minor_text = 0xffc0c0c0;
	  public static int result_points = 0xc07FFF00;
	  public static int result_text = 0xffffffff;
	  public static int result_view = 0xb0000000;

	  public static int status_view = 0x50000000;
	  public static int status_text = 0xffffffff;

	  public static int viewfinder_frame = 0xff526F35;
	  public static int viewfinder_laser = 0xff7FFF00;
	  public static int viewfinder_mask = 0x607CFC00;

	  public static final int auto_focus = 101;
	  public static final int decode = 102;
	  public static final int decode_failed = 103;
	  public static final int decode_succeeded = 104;
	  public static final int quit = 105;
	  public static final int restart_preview = 106; 
	  public static final int return_scan_result = 107;
	  
	  
	  public static final String contents_contact = "Contact info";
	  public static final String contents_email = "Email address";
	  public static final String contents_location = "Geographic coordinates";
	  public static final String contents_phone = "Phone number";
	  public static final String contents_sms = "SMS address";
	  public static final String contents_text_str = "Plain text";

	  public static final String msg_default_contents = "Contents";
	  public static final String msg_default_format = "Format";
	  public static final String msg_default_meta = "Metadata";
	  public static final String msg_default_mms_subject = "Hi";
	  public static final String msg_default_status = "Place a barcode inside the viewfinder rectangle to scan it.";
	  public static final String msg_default_time = "Time";
	  public static final String msg_default_type = "Type";

	  public static final String result_address_book = "Found contact info";
	  public static final String result_calendar = "Found calendar event";
	  public static final String result_email_address = "Found email address";
	  public static final String result_geo = "Found geographic coordinates";
	  public static final String result_isbn = "Found book";
	  public static final String result_product = "Found product";
	  public static final String result_sms = "Found SMS address";
	  public static final String result_tel = "Found phone number";
	  public static final String result_text_str = "Found plain text";
	  public static final String result_uri = "Found URL";
	  public static final String result_wifi = "Found WLAN Configuration";

	  public static final String wifi_changing_network = "Changing Network";
	  public static final String wifi_ssid_label = "Network Name";
	  public static final String wifi_type_label = "Type";

	  public static final String barcode_image = "Barcode Image";
	  
}
