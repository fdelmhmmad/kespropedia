package com.example.kespropedia;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MensFragment extends Fragment {

    public MediaPlayer mp;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mens, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.youtube_player_mens).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp = MediaPlayer.create(getActivity(),R.raw.sound1);
                    mp.start();
                }
                catch(Exception e) { e.printStackTrace(); }
                NavHostFragment.findNavController(MensFragment.this)
                        .navigate(R.id.action_mensFragment_to_ytMens);
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
                NavHostFragment.findNavController(MensFragment.this)
                        .navigate(R.id.action_mensFragment_to_materiFragment);
            }
        });
    }
}