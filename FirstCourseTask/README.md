FirstCourseTask -> Android course
=================================

In this session we worked with activities and intents.
This exercise get user data and send it to the welcome activity. The welcome activity get this data and show it.

View controls used:
* RelativeLayout
* TextView
* EditText
* Button


##### Create an intent for calling the welcome activity
Intent welcomeIntent = new Intent(this, WelcomeActivity.class);


##### Setting data to the intent
welcomeIntent.putExtra("myData", "set data in the intent");


##### Starts the activity with the intent
startActivity(welcomeIntent);


##### Getting the caller intent
Intent signUpIntent = getIntent();


##### Getting data from the intent through of the bundle
String myData = signUpIntent.getStringExtra("myData");


##### How to get a control in an activity
EditText controlTxt = (EditText) findViewById(R.id.myControlId);


##### How to set data to a control
controlTxt.setText("My greeting text");