SecondCourseTask
=================================

In this session we worked with Dialogs
This exercise get user data in a dialog and send it to back to the window.

View controls used:
* RelativeLayout
* TextView
* EditText
* Button


##### Create a class for my dialog
public class MyDialogFragment extends DialogFragment {...}


##### Setting a basic dialog: use the onCreateDialog method and use the setter methods for customize
http://developer.android.com/reference/android/app/DialogFragment.html#AlertDialog
public Dialog onCreateDialog(Bundle savedInstanceState) {...}


##### Setting a complex dialog: it's better create a fragment layout, then use the onCreateView for inflate the layout and setting up
http://developer.android.com/reference/android/app/DialogFragment.html#BasicDialog
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {...}


##### For getting data from the dialog use an interface, implements this interface in the caller activity 
##### and when you need use this method for set this data back to the view
public interface DataManager {
    void setBundle(Bundle bundle);
}


##### Use the method onAttach for set the interface in the dialog
public void onAttach(Activity activity) {
  super.onAttach(activity);
  mDataManager = (DataManager)activity;
}

##### the use set bundle for set this data to the caller activity 
mDataManager.setBundle(b);


##### To call a dialog, creates an instance and the call the show method, with the fragment manager and any Tag
MyDialogFragment uddf = new MyDialogFragment();
uddf.show(getFragmentManager(), "getUserData");