package io.mdcom.recyclerviewjava;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MhsAdapter extends RecyclerView.Adapter<MhsAdapter.MhsHolder>{
    private ArrayList<MhsModel> mData = new ArrayList<>();
    private Context context;
    private LayoutInflater mInflater;

    public MhsAdapter(Context context) {
        this.context = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public MhsAdapter.MhsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mhs, viewGroup, false);
        return new MhsHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull MhsAdapter.MhsHolder mhsHolder, int i) {
        mhsHolder.nama.setText(mData.get(i).getNama());
        mhsHolder.npm.setText(mData.get(i).getNpm());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public void addItem(ArrayList<MhsModel> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }


    public class MhsHolder extends RecyclerView.ViewHolder {
        TextView nama,npm;
        public MhsHolder(@NonNull View itemView, Context context) {
            super(itemView);
            nama = itemView.findViewById(R.id.mhs_nama);
            npm = itemView.findViewById(R.id.mhs_npm);
        }
    }
}
