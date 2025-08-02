package com.example.greenbeen;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckerFragment extends Fragment {

    EditText etItemName;
    Button btnCheck;
    TextView tvResult;

    public CheckerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_checker, container, false);

        etItemName = view.findViewById(R.id.etItemName);
        btnCheck = view.findViewById(R.id.btnCheck);
        tvResult = view.findViewById(R.id.tvResult);

        btnCheck.setOnClickListener(v -> {
            String item = etItemName.getText().toString().toLowerCase();

            if (item.contains("phone") || item.contains("laptop") || item.contains("charger") || item.contains("battery")) {
                tvResult.setText("✅ This item is recyclable. Please submit a pickup request.");
            } else {
                tvResult.setText("❌ This item is not currently supported for e-waste pickup.");
            }
        });

        return view;
    }
}
