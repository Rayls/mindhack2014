package com.example.mindhack2014;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    	super.onActivityResult(requestCode, resultCode, data);

    	if (requestCode == 0) {

    		if (resultCode == RESULT_OK) {

    			String contents = data.getStringExtra("SCAN_RESULT");

    			Log.v(INPUT_SERVICE, contents);

    		}

    		if (resultCode == RESULT_CANCELED) {

    			// handle cancel

    		}

    	}

    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    Button button;
    
    public void addListenerOnButton() {

    	// finds the button view and associate it to the button object

    	button = (Button) findViewById(R.id.ScanQR);

    	button.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View arg0) {


    			try {

    				Intent intent = new Intent(
    						"com.google.zxing.client.android.SCAN");

    				intent.putExtra("SCAN_MODE", "QR_CODE_MODE"); // "PRODUCT_MODE
    				// for bar
    				// codes

    				startActivityForResult(intent, 0);

    			} catch (Exception e) {

    				Uri marketUri = Uri
    						.parse("market://details?id=com.google.zxing.client.android");

    				Intent marketIntent = new Intent(Intent.ACTION_VIEW,
    						marketUri);

    				startActivity(marketIntent);

    			}

    		}

    	});

    }
    
    ///////// CUSTOM CODE
    
   public void aboutListener(View view) {
	   Intent aboutIntent = new Intent(this, AboutActivity.class);
	   startActivity(aboutIntent);
   }
   
   public void inventoryListener(View view) {
	   Intent intent = new Intent(this, InventoryActivity.class);
	   startActivity(intent);
   }
}
