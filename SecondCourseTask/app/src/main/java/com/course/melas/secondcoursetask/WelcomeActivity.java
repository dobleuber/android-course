package com.course.melas.secondcoursetask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);

    Intent signUpIntent = getIntent();
    String firstName = signUpIntent.getStringExtra("firstName");
    String lastName = signUpIntent.getStringExtra("lastName");
    TextView firstNameTxt = (TextView) findViewById(R.id.firstNameTxt);
    TextView lastNameTxt = (TextView) findViewById(R.id.lastNameTxt);
    firstNameTxt.setText(firstName);
    lastNameTxt.setText(lastName);

    Toast toast = Toast.makeText(this, "User created", Toast.LENGTH_SHORT);
    toast.setGravity(Gravity.TOP, 0, 100);
    toast.show();

  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.welcome, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    return id == R.id.action_settings || super.onOptionsItemSelected(item);
  }
}
