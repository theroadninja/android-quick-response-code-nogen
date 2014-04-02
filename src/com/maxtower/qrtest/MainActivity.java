package com.maxtower.qrtest;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.jwetherell.quick_response_code.DecoderActivity;
import com.jwetherell.quick_response_code.data.Contents;
import com.jwetherell.quick_response_code.qrcode.QRCodeEncoder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {

	static final int QR_STRING_RESULT = 7;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		
		
	}
	
	public void onClickEncode(View v)
	{
		Log.i("MAX", "clicked");
		//Encode with a QR Code image
		EditText etEncode = (EditText) findViewById(R.id.etEncode);
		QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(etEncode.getText().toString(),
		                                                null, 
		                                                Contents.Type.TEXT,  
		                                                BarcodeFormat.QR_CODE.toString(), 
		                                                300);
		try {
			Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();
			ImageView ivQRCode = (ImageView) findViewById(R.id.ivQRCode);		
			ivQRCode.setImageBitmap(bitmap);
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onClickDecode(View v)
	{
		Intent myIntent = new Intent(this, DecoderActivity.class);
	    startActivityForResult(myIntent, QR_STRING_RESULT);
		TextView tvDecode = (TextView) findViewById(R.id.tvDecode);
		
		tvDecode.setText("TEST");
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    // Check which request we're responding to
	    if (requestCode == QR_STRING_RESULT) {
	        // Make sure the request was successful
	        if (resultCode == RESULT_OK) {
	        	TextView tvDecode = (TextView) findViewById(R.id.tvDecode);
	        	if (data.hasExtra("QR_STRING")) {
	        	      Toast.makeText(this, data.getExtras().getString("QR_STRING"), Toast.LENGTH_LONG);
	        	      String str = data.getExtras().getString("QR_STRING");
	  	    		  tvDecode.setText(str);
	        	}
	        }
	    }
	}


}
