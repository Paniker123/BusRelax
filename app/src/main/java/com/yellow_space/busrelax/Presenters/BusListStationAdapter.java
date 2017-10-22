package com.yellow_space.busrelax.Presenters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yellow_space.busrelax.Models.BusItem;
import com.yellow_space.busrelax.R;

import java.util.ArrayList;

/**
 * Created by Zver on 22.10.2017.
 */

public class BusListStationAdapter extends RecyclerView.Adapter<BusListStationAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BusItem> busItems;

    public BusListStationAdapter(Context context, ArrayList<BusItem> busItems) {
        this.context = context;
        this.busItems = busItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bus_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BusItem busItem = new BusItem();
        holder.nameStation.setText(busItem.getName());
        holder.distans.setText((int) busItem.getDistance());
    }

    @Override
    public int getItemCount() {
        return busItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameStation;
        private TextView distans;

        public ViewHolder(View itemView) {
            super(itemView);

            nameStation = (TextView) itemView.findViewById(R.id.name_station_listItem);
            distans = (TextView) itemView.findViewById(R.id.distanceListItem);
        }
    }
}
