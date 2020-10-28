package com.example.kespropedia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MateriFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.bt_anatomi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_anatomiFragment);
            }
        });

        view.findViewById(R.id.bt_pubertas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_pubertasFragment);
            }
        });

        view.findViewById(R.id.bt_menstruasi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_mensFragment);
            }
        });

        view.findViewById(R.id.bt_infeksi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_infeksiFragment);
            }
        });

        view.findViewById(R.id.bt_hygiene).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_hygieneFragment);
            }
        });

        view.findViewById(R.id.bt_hamil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_aborsiFragment);
            }
        });
    }
}