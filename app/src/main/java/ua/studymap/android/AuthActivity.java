package ua.studymap.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.TextInputLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class AuthActivity extends Activity implements View.OnClickListener {

    private TextInputLayout textInputLayout;
    private EditText etName, etPass;
    private Button btnLogin;
    private Dialog dialogTransparent;
    private String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        etName = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case
            R.id.btnLogin:
                Log.d(TAG, "btnLogin");
                final Intent intent = new Intent(this, ListActivity.class);;
                setProgressBar();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(2000);
                        dialogTransparent.dismiss();
                        startActivity(intent);
                    }
                });
                thread.start();
                break;
            default:
                break;
        }
    }

    public void setProgressBar(){
        dialogTransparent = new Dialog(this, android.R.style.Theme_Black);
        View view = LayoutInflater.from(this).inflate(
                R.layout.remove_border, null);
        dialogTransparent.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogTransparent.getWindow().setBackgroundDrawableResource(
                R.color.transparent);
        dialogTransparent.setContentView(view);
        dialogTransparent.show();
    }
}
