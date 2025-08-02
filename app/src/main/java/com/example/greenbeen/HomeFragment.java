package com.example.greenbeen;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnRequest = view.findViewById(R.id.btnRequestPickup);

        btnRequest.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), RequestPickupActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
