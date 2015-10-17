package com.example.trashfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_activity2, menu);
		return true;
	}
	
	public void click1(View a){
		Intent myIntent=new Intent(getApplicationContext(),Activity3.class);
		myIntent.putExtra("White",0);
		startActivity(myIntent);
	}

}
