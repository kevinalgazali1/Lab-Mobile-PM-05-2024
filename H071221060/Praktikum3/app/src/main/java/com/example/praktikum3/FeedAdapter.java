package com.example.praktikum3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

    private ArrayList<University> universities;

    public FeedAdapter(ArrayList<University> universities){this.universities = universities;}

    @NonNull
    @Override
    public FeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed, parent, false);
        return new FeedAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.ViewHolder holder, int position) {

        University university = universities.get(position);

        holder.tv_namaProfile.setText(university.getNama());
        holder.ivProfile.setImageResource(university.getImageprofile());
        holder.ivFeed.setImageResource(university.getImagefeed());
        holder.tv_caption.setText(university.getCaption());

        holder.ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(holder.context, MainActivity2.class);

                    intent.putExtra("university", university);
                    holder.context.startActivity(intent);
            }
        });

        holder.tv_namaProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    // Membuat intent
                    Intent intent = new Intent(holder.context, MainActivity3.class);
                    // Mengirim data melalui intent
                    intent.putExtra("university", university);

                    holder.context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return universities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFeed, ivProfile;
        TextView tv_caption, tv_namaProfile;
        Context context;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFeed = itemView.findViewById(R.id.iv_feed);
            ivProfile = itemView.findViewById(R.id.iv_profile);
            tv_namaProfile = itemView.findViewById(R.id.tv_namaprofile);
            tv_caption = itemView.findViewById(R.id.tv_caption);
            context = itemView.getContext();

        }
    }
}
