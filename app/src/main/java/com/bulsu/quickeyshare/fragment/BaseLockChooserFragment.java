package com.bulsu.quickeyshare.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bulsu.quickeyshare.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseLockChooserFragment extends Fragment {


    public BaseLockChooserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base_lock_chooser, container, false);
    }

}
