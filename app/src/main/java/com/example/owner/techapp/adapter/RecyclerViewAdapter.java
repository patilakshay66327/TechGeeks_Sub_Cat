package com.example.owner.techapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.owner.techapp.activities.DetailsActivity;
import com.example.owner.techapp.datamodel.Article;
import com.example.owner.techapp.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>
{

    Context mContext;
    List<Article> mData;

    public RecyclerViewAdapter(Context mContext, List<Article> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_article,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position)
    {
        holder.tv_name.setText(mData.get(position).getArticleName());
        holder.img.setImageResource(mData.get(position).getPhoto());

        holder.linearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(mContext, " You click on "+ mData.get(position).toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext,DetailsActivity.class);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_name;
        private ImageView img;
        private LinearLayout linearLayout;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.name_article);
            img = (ImageView)itemView.findViewById(R.id.img_article);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.Linear_Layout);
    }
    }
}
