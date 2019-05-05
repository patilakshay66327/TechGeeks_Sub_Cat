package com.example.owner.techapp.adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.owner.techapp.R;
import com.example.owner.techapp.activities.MainActivity;
import com.example.owner.techapp.activities.StartingActivity;

public class StartingAdapdter extends RecyclerView.Adapter<StartingAdapdter.MyViewHolder>
{

    public LinearLayout linearLayout;
    Context context;
    String[] data;

    public StartingAdapdter(Context mContext, String[] data)
    {
        this.context = mContext;
        this.data = data;
    }


    @NonNull
    @Override
    public StartingAdapdter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_article,parent,false);
        StartingAdapdter.MyViewHolder startingViewHolder = new StartingAdapdter.MyViewHolder(view);

        return startingViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StartingAdapdter.MyViewHolder holder, final int position)
    {

        holder.tv_name.setText(data[position]);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(context, "Here we are in "+data[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,MainActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_name;
        private LinearLayout linearLayout;

        public MyViewHolder(View itemView)
        {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.name_article);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.Linear_Layout);
        }
    }
}
