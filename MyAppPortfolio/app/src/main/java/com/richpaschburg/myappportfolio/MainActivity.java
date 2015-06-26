package com.richpaschburg.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    /** Called when the user touches the first button */
    public void app1(View view) {

        Context context = getApplicationContext();
        CharSequence appText = getResources().getString(R.string.toastapp1);
        CharSequence text = "This button will launch my " + appText + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Do remaining actions in response to button click
    }

    /** Called when the user touches the second button */
    public void app2a(View view) {

        Context context = getApplicationContext();
        CharSequence appText = getResources().getString(R.string.toastapp2a);
        CharSequence text = "This button will launch the " + appText + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Do remaining actions in response to button click
    }

    /** Called when the user touches the third button */
    public void app2b(View view) {

        Context context = getApplicationContext();
        CharSequence appText = getResources().getString(R.string.toastapp2b);
        CharSequence text = "This button will launch the " + appText + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Do remaining actions in response to button click
    }

    /** Called when the user touches the fourth button */
    public void app3(View view) {

        Context context = getApplicationContext();
        CharSequence appText = getResources().getString(R.string.toastapp3);
        CharSequence text = "This button will launch my " + appText + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Do remaining actions in response to button click
    }

    /** Called when the user touches the fifth button */
    public void app4(View view) {

        Context context = getApplicationContext();
        CharSequence appText = getResources().getString(R.string.toastapp4);
        CharSequence text = "This button will launch my " + appText + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Do remaining actions in response to button click
    }

    /** Called when the user touches the sixth button */
    public void app5(View view) {

        Context context = getApplicationContext();
        CharSequence appText = getResources().getString(R.string.toastapp5);
        CharSequence text = "This button will launch my " + appText + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Do remaining actions in response to button click
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
