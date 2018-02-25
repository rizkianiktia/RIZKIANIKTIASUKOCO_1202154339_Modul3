package com.example.rizkianiktia.rizkianik_1202154339_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AquaAdapter extends RecyclerView.Adapter<AquaAdapter.AquaViewHolder> {
public ArrayList<AquaItem> datas; //membuar array

public AquaAdapter(ArrayList<AquaItem>datas) {
    this.datas = datas;

  Log.d("JUMLAH_ARRAYLIST","Items "+getItemCount());
}

    @Override
    public AquaAdapter.AquaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from((parent.getContext()));
        View view = layoutInflater.inflate(R.layout.activity_aqua_item,parent,false);
        return new AquaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AquaAdapter.AquaViewHolder holder, int position) {
        final AquaItem item = datas.get(position);
        holder.bindTo(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext().getApplicationContext(), DetailMenu.class);
                intent.putExtra("etitle", item.getNama());
                intent.putExtra("edesc", item.getDeskripsi());
                intent.putExtra("eimg", item.getGambar());
                view.getContext().startActivity(intent);
            }

        });
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }
    class AquaViewHolder extends RecyclerView.ViewHolder{ //membuat view holder

        private TextView mMinumanJudul;
        private TextView mMinumanInfo;
        private ImageView mMinumanImg;
        private Context mContext;
        private AquaItem mCurrentAqua;

        public AquaViewHolder(View itemView) {
            super(itemView);
            mMinumanJudul = (TextView)itemView.findViewById(R.id.ItemJudul);
            mMinumanInfo = (TextView)itemView.findViewById(R.id.ItemDeskripsi);
            mMinumanImg = (ImageView) itemView.findViewById(R.id.Itemimage);

        }
        public void bindTo(AquaItem aqua) {
            mCurrentAqua = aqua;
            mMinumanImg.setImageResource(aqua.getGambar());
            mMinumanJudul.setText(aqua.getNama());
            mMinumanInfo.setText(aqua.getInfo());
        }

    }
}
