package com.example.trashfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Activity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_activity1, menu);
		return true;
	}

	public void click(View a){
		Intent myIntent=new Intent(getApplicationContext(),MainActivity2.class);
		myIntent.putExtra("White",0);
		startActivity(myIntent);
	}
	
	public void Admin(View v){
		Intent myIntent=new Intent(getApplicationContext(),MainActivity1.class);
		myIntent.putExtra("Black",0);
		startActivity(myIntent);
	}

}
