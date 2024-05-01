package com.example.sparewheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sparewheels.databinding.ActivityUserprofileinBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Userprofilein extends AppCompatActivity {

    ActivityUserprofileinBinding binding;
    String NameU, PhoneNumberU, AadharNumberU, DrivingLicenseU, PanCardnoU, LocationU;
    FirebaseDatabase db;
    DatabaseReference refrence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserprofileinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.saveup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NameU = binding.NameU.getText().toString();
                PhoneNumberU = binding.PhoneNumberU.getText().toString();
                AadharNumberU= binding.AadharNumberU.getText().toString();
                DrivingLicenseU= binding.DrivingLicenseU.getText().toString();
                PanCardnoU = binding.PanCardnoU.getText().toString();
                LocationU = binding.LocationU.getText().toString();

                if (!NameU.isEmpty() && !PhoneNumberU.isEmpty() && !AadharNumberU.isEmpty() && !DrivingLicenseU.isEmpty() && !PanCardnoU.isEmpty() && !LocationU.isEmpty()){
                    UserHelper users = new UserHelper(NameU,PhoneNumberU,AadharNumberU,DrivingLicenseU,PanCardnoU,LocationU);
                    db = FirebaseDatabase.getInstance();
                    refrence = db.getReference("user details");
                    refrence.child(NameU).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.NameU.setText("");
                            binding.PhoneNumberU.setText("");
                            binding.AadharNumberU.setText("");
                            binding.DrivingLicenseU.setText("");
                            binding.PanCardnoU.setText("");
                            binding.LocationU.setText("");

                            Toast.makeText(Userprofilein.this,"succesfully uploaded",Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(Userprofilein.this, MainActivity2.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }else {
                    Toast.makeText(Userprofilein.this,"All Fields are Must to be Added",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}
