package com.example.trashfinder;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends Activity {

	String phone1,phone2;
	EditText messagewritten;
	TextView position;
    Button resetmessageit,sendsms;
    LocationListener loc ;
    String me,mylocation1;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity3);
	    
         displayLocation();
		
		messagewritten=(EditText)findViewById(R.id.editText1);
		position=(TextView)findViewById(R.id.textView2);
		resetmessageit=(Button)findViewById(R.id.button1);
		sendsms=(Button)findViewById(R.id.button2);
		
		
		      
        
       

        sendsms.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
               
            	
                String message = me;
                
                if (message.length()>0)
                    {
                	
                    // send to database. 
                    
                     
                    }
                else
                    Toast.makeText(getBaseContext(),
                            "Please enter the message.",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void displayLocation() {
		
		loc = new LocationListener() {
		
		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}
		
		
		public void onLocationChanged(Location location) {
			String latitude= Double.toString(location.getLatitude());
			String longitude=Double.toString(location.getLongitude());
		    
						
			
		if (latitude!=null && longitude!=null ) {
			position.setText("https://www.google.co.id/maps?q="+latitude+","+longitude+"&z=18" );
			me=messagewritten.getText().toString() + position.getText().toString();
			

		} else {

		    position
		            .setText("(Couldn't get the location. Make sure location is enabled on the device)");
		}
		

		}

		
	};
	
	
	
    LocationManager m =(LocationManager)getSystemService(Context.LOCATION_SERVICE);
    Criteria cri=new Criteria();
	cri.setAccuracy(Criteria.ACCURACY_FINE);
	cri.setPowerRequirement(Criteria.POWER_LOW);
	String provider=m.getBestProvider(cri, true);
	m.requestLocationUpdates(provider, 2000, 2, loc);
	 
    }
    
    

public void resetmessage(View abc){
		
	    messagewritten.setText("");	
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_activity3, menu);
		return true;
	}

		


}
    
    
    
        
        
        
		
	

	
	