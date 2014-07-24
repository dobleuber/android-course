package com.course.melas.secondcoursetask;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by wbertcastro on 7/23/14.
 */
public class UserDataDialogFragment extends DialogFragment {
  public interface DataManager {
    void setBundle(Bundle bundle);
  }
  
  private DataManager mDataManager;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    //This final is important without it, I cant access the view from the click event
    final View v = inflater.inflate(R.layout.fragment_user_data, container, false);
    Button okButton = (Button) v.findViewById(R.id.okBtn);
    okButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View vi) {
        dismiss();
        Bundle b = new Bundle();
        EditText firstNameTxt = (EditText) v.findViewById(R.id.firstNameEdit);
        EditText lastNameTxt = (EditText) v.findViewById(R.id.lastNameEdit);

        b.putString("firstName", firstNameTxt.getText().toString());
        b.putString("lastName", lastNameTxt.getText().toString());

        mDataManager.setBundle(b);
      }
    });

    return v;
  }

  @Override
  public void onAttach(Activity activity) {
    super.onAttach(activity);
    mDataManager = (DataManager)activity;
  }
}
