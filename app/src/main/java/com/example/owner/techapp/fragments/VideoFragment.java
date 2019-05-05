package com.example.owner.techapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owner.techapp.R;
import com.example.owner.techapp.adapter.RecyclerViewAdapter;
import com.example.owner.techapp.datamodel.Article;

import java.util.ArrayList;
import java.util.List;

public class VideoFragment extends Fragment
{
    public static final String Tag = "VideoFragement";

    private RecyclerView myrecyclerview;
    private List<Article> lstVideo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
       View view = inflater.inflate(R.layout.video_fragment,container,false);

        myrecyclerview = (RecyclerView)view.findViewById(R.id.video_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstVideo);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        lstVideo = new ArrayList<>();

        lstVideo.add(new Article("Video on Java1",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java2",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java3",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java4",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java5",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java6",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java7",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java8",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java9",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java10",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java11",R.drawable.ic_launcher_background));
        lstVideo.add(new Article("Video on Java12",R.drawable.ic_launcher_background));


    }
}
