package com.riddhidamani.civil_advocacy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu_items, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.about) {
            // Invoke About Activity
            openAboutActivity();
            return true;
        }
        else if(menuItem.getItemId() == R.id.search) {
            setManualLocation();
            return true;
        }
        else {
            Log.d(TAG, "onOptionsItemSelected: Unknown Item: " + menuItem.getTitle());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    // When search icon is clicked, Dialog Pops up!
    private void setManualLocation() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Enter a City, State, or a Zip Code:");
        final EditText manualLoc = new EditText(this);
        manualLoc.setGravity(Gravity.CENTER_HORIZONTAL);
        manualLoc.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(manualLoc);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // nothing to cancel the dialog
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    // When info icon is clicked, About Activity is opened
    private void openAboutActivity() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}