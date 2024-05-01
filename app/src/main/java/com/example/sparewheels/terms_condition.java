package com.example.sparewheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class terms_condition extends AppCompatActivity {

    private CheckBox checkBoxAgree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_condition);

        checkBoxAgree = findViewById(R.id.checkBoxAgree);
        Button btnAccept = findViewById(R.id.Acceptbutton);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxAgree.isChecked()) {
                    // Perform action upon accepting terms and conditions
                    Toast.makeText(terms_condition.this, "Terms and conditions accepted!", Toast.LENGTH_SHORT).show();
                    // Here you can proceed with the next step in your application flow
                    startActivity(new Intent(terms_condition.this, Userprofilein.class));

                } else {
                    Toast.makeText(terms_condition.this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to handle accept button click directly from XML
    public void onAcceptClicked(View view) {
        if (checkBoxAgree.isChecked()) {
            // Perform action upon accepting terms and conditions
            Toast.makeText(this, "Terms and conditions accepted!", Toast.LENGTH_SHORT).show();
            // Here you can proceed with the next step in your application flow
        } else {
            Toast.makeText(this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
        }
    }
}
