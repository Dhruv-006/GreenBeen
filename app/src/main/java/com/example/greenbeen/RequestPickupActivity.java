package com.example.greenbeen;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RequestPickupActivity extends AppCompatActivity {

    EditText etItemName, etAddress, etPhone, etDate;
    Button btnSubmit, btnChooseImage;
    ImageView ivPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_pickup);

        etItemName = findViewById(R.id.etItemName);
        etAddress = findViewById(R.id.etAddress);
        etPhone = findViewById(R.id.etPhone);
        etDate = findViewById(R.id.etDate);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnChooseImage = findViewById(R.id.btnChooseImage);
        ivPreview = findViewById(R.id.ivPreview);

        btnSubmit.setOnClickListener(v -> {
            String name = etItemName.getText().toString().trim();
            String address = etAddress.getText().toString().trim();
            String phone = etPhone.getText().toString().trim();
            String date = etDate.getText().toString().trim();

            if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || date.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                // TODO: Upload to Firebase tomorrow
                Toast.makeText(this, "Request Submitted!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        // TODO: Add image picker tomorrow
    }
}
