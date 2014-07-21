package com.course.melas.firstcoursetask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class ActivityOne extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_activity_one);
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_one, menu);
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

  public void signUpBtnClick(View view) {
    Intent welcomeIntent = new Intent(this, WelcomeActivity.class);
    EditText firstNameTxt = (EditText) findViewById(R.id.firstNameTxt);
    EditText lastNameTxt = (EditText) findViewById(R.id.lastNameTxt);
    welcomeIntent.putExtra("firstName", firstNameTxt.getText().toString());
    welcomeIntent.putExtra("lastName", lastNameTxt.getText().toString());
    startActivity(welcomeIntent);
  }
}
