package com.example.android.mobiledevelopment7;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<President> mPresidents;
    private LayoutInflater mInflater;

    public PresidentAdapter (Context context, ArrayList<President> presidents) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mPresidents = presidents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.item_list_president, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.mTextName.setText(mPresidents.get(i).getName());
        viewHolder.mTextRemarks.setText(mPresidents.get(i).getRemarks());
        Glide.with(mContext)
                .load(mPresidents.get(i).getPhotoURL())
                .override(80,80)
                .crossFade()
                .into(viewHolder.mImagePhoto);
    }


    @Override
    public int getItemCount() {
        return mPresidents.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImagePhoto;
        TextView mTextName, mTextRemarks;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImagePhoto = itemView.findViewById(R.id.item_photo);
            mTextName = itemView.findViewById(R.id.item_name);
            mTextRemarks = itemView.findViewById(R.id.item_remarks);
        }
    }
}
