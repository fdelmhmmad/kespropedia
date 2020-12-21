package com.example.kespropedia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.MediaPlayer;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class HomeFragment extends Fragment {

    public MediaPlayer mp;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.bt_materi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_materiFragment);
            }
        });

        view.findViewById(R.id.bt_post).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_kuisFragment);
            }
        });

        view.findViewById(R.id.bt_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_ThirdFragment);
            }
        });

        view.findViewById(R.id.bt_pre).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_preTest);
            }
        });

        view.findViewById(R.id.bt_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_postTest);
            }
        });

        view.findViewById(R.id.bt_exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}