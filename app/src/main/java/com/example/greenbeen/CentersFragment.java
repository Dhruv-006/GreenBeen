package com.example.greenbeen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CentersFragment extends Fragment {

    public CentersFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_centers, container, false);

        Button btnFindCenters = view.findViewById(R.id.btnFindCenters);

        btnFindCenters.setOnClickListener(v -> {
            String mapQuery = Uri.encode("E-Waste Collection Center near me");
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + mapQuery);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");

            if (mapIntent.resolveActivity(requireActivity().getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        });

        return view;
    }
}
