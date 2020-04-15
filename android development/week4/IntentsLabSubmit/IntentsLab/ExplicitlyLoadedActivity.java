package course.labs.intentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExplicitlyLoadedActivity extends AppCompatActivity {

    static private final String TAG = "Lab-Intents";

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.explicitly_loaded_activity);

        // Get a reference to the EditText field
        mEditText = (EditText) findViewById(R.id.editText);

        // Declare and setup "Enter" button
        Button enterButton = (Button) findViewById(R.id.enter_button);
        enterButton.setOnClickListener(new View.OnClickListener() {

            // Call enterClicked() when pressed

            @Override
            public void onClick(View v) {

                enterClicked();

            }
        });

    }

    // Sets result to send back to calling Activity and finishes

    private void enterClicked() {

        Log.i(TAG,"Entered enterClicked()");

        // TODO - Save user provided input from the EditText field
        String text = mEditText.getText().toString();
        // TODO - Create a new intent and save the input from the EditText field as an extra
        Intent data = new Intent();
        data.putExtra("editText",text);
        // TODO - Set Activity's result with result code RESULT_OK
        setResult(RESULT_OK,data);
        // TODO - Finish the Activity
        finish();
    }
}
