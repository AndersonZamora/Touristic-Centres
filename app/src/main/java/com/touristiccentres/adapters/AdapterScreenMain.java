package com.touristiccentres.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.touristiccentres.R;
import com.touristiccentres.entities.TouristicModel;
import com.touristiccentres.view.ScreenDetailTouristActivity;

import java.util.List;

public class AdapterScreenMain extends RecyclerView.Adapter<AdapterScreenMain.ViewAdapterScreenMain> {

    List<TouristicModel> list;
    Context context;

    public AdapterScreenMain(List<TouristicModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewAdapterScreenMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewAdapterScreenMain(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_touristic, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapterScreenMain holder, int position) {

        TouristicModel model = list.get(position);

        holder.cardView.setOnClickListener(view -> {
            holder.title.setText(model.getName());
            holder.second.setVisibility(View.VISIBLE);
        });

        holder.second.setOnClickListener(view -> context.startActivity(new Intent(context, ScreenDetailTouristActivity.class)));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewAdapterScreenMain extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView title;
        LinearLayout second;

        public ViewAdapterScreenMain(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_tour);
            title = itemView.findViewById(R.id.title);
            second = itemView.findViewById(R.id.second_background);
        }
    }
}
