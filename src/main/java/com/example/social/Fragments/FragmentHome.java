package com.example.social.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.social.R;
import com.example.social.model.Row;
import com.example.social.model.StaggeredRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {
    private RecyclerView recyclerView;
    StaggeredRecyclerAdapter adapter;
    StaggeredGridLayoutManager manager;
    public FragmentHome() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView=v.findViewById(R.id.homerecycler);
        manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        List<Row> lst =new ArrayList<>();
        lst.add(new Row(R.drawable.img1));
        lst.add(new Row(R.drawable.img2));
        lst.add(new Row(R.drawable.img3));
        lst.add(new Row(R.drawable.img4));
        lst.add(new Row(R.drawable.img5));
        lst.add(new Row(R.drawable.img6));
        lst.add(new Row(R.drawable.img7));
        lst.add(new Row(R.drawable.img8));
        lst.add(new Row(R.drawable.img9));
        lst.add(new Row(R.drawable.img10));
        lst.add(new Row(R.drawable.img11));
        lst.add(new Row(R.drawable.img12));
        lst.add(new Row(R.drawable.img13));
        lst.add(new Row(R.drawable.img14));
        lst.add(new Row(R.drawable.img15));
        lst.add(new Row(R.drawable.img16));
        lst.add(new Row(R.drawable.img17));

        adapter=new StaggeredRecyclerAdapter(getContext(),lst);
        recyclerView.setAdapter(adapter);
        return v;

    }
}