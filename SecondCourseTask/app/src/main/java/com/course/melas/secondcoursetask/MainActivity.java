package com.course.melas.secondcoursetask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements UserDataDialogFragment.DataManager {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
      return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

  public void getNameClick(View view) {
    UserDataDialogFragment uddf = new UserDataDialogFragment();
    uddf.show(getFragmentManager(), "getUserData");
  }

  @Override
  public void setBundle(Bundle bundle) {
    TextView firstNameTxt = (TextView) findViewById(R.id.firstNameTxt);
    TextView lastNameTxt = (TextView) findViewById(R.id.lastNameTxt);
    firstNameTxt.setText(bundle.getString("firstName"));
    lastNameTxt.setText(bundle.getString("lastName"));
    Button calDialogBtn = (Button) findViewById(R.id.calDialogBtn);
    Button gotoSecondBtn = (Button) findViewById(R.id.gotoSecondBtn);
    calDialogBtn.setVisibility(View.GONE);
    gotoSecondBtn.setVisibility(View.VISIBLE);
  }

  public void gotoSecond(View view) {
    Intent welcomeIntent = new Intent(this, WelcomeActivity.class);
    TextView firstNameTxt = (TextView) findViewById(R.id.firstNameTxt);
    TextView lastNameTxt = (TextView) findViewById(R.id.lastNameTxt);
    welcomeIntent.putExtra("firstName", firstNameTxt.getText().toString());
    welcomeIntent.putExtra("lastName", lastNameTxt.getText().toString());
    startActivity(welcomeIntent);
  }
}
