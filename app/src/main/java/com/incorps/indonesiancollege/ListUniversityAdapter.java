package com.incorps.indonesiancollege;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListUniversityAdapter extends RecyclerView.Adapter<ListUniversityAdapter.ListViewHolder> {

    private ArrayList<University> listUniversity;

    public ListUniversityAdapter(ArrayList<University> list) {
        this.listUniversity = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        University hero = listUniversity.get(position);
        holder.imgPhoto.setImageResource(hero.getLogo());
        holder.tvName.setText(hero.getName());
        holder.tvDesc.setText(hero.getDesc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intentDetail = new Intent(context, DetailActivity.class);
                intentDetail.putExtra("logo", listUniversity.get(holder.getAdapterPosition()).getLogo());
                intentDetail.putExtra("name", listUniversity.get(holder.getAdapterPosition()).getName());
                intentDetail.putExtra("desc", listUniversity.get(holder.getAdapterPosition()).getDesc());
                intentDetail.putExtra("faculty", listUniversity.get(holder.getAdapterPosition()).getFaculty());
                intentDetail.putExtra("address", listUniversity.get(holder.getAdapterPosition()).getAddress());
                intentDetail.putExtra("website", listUniversity.get(holder.getAdapterPosition()).getWebsite());
                context.startActivity(intentDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listUniversity.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
        }
    }
}