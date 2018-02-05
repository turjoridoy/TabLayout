package com.ridoy.tablayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ridoy.tablayout.R;


public class CallFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){

        return inflater.inflate(R.layout.call_layout, null);
    }
}
