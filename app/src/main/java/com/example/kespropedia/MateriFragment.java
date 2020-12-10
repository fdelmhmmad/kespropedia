package com.example.kespropedia;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MateriFragment extends Fragment {

    public MediaPlayer mp;

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
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_anatomiFragment);
            }
        });

        view.findViewById(R.id.bt_pubertas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_pubertasFragment);
            }
        });

        view.findViewById(R.id.bt_menstruasi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_mensFragment);
            }
        });

        view.findViewById(R.id.bt_infeksi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_infeksiFragment);
            }
        });

        view.findViewById(R.id.bt_hygiene).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_hygieneFragment);
            }
        });

        view.findViewById(R.id.bt_aborsi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_aborsiFragment);
            }
        });

        view.findViewById(R.id.bt_hamil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_kehamilanFragment);
            }
        });

        view.findViewById(R.id.bt_pranikah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_pranikahFragment);
            }
        });

        view.findViewById(R.id.bt_prev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MateriFragment.this)
                        .navigate(R.id.action_materiFragment_to_homeFragment);
            }
        });
    }
}