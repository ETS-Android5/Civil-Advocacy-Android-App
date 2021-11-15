package com.riddhidamani.civil_advocacy;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OfficeAdapter extends RecyclerView.Adapter<OfficeViewHolder>{

    private static final String TAG = "OfficeAdapter";
    private List<Office> officialList;
    private MainActivity mainActivity;

    public OfficeAdapter(List<Office> officialList, MainActivity mainActivity){
        this.officialList = officialList;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public OfficeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: Making a new ViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.office_entry, parent, false);
        //itemView.setOnClickListener(mainActivity);
        //itemView.setOnLongClickListener(mainActivity);
        return new OfficeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfficeViewHolder holder, int position) {
        Office office = officialList.get(position);
        holder.office.setText(office.getOffice());
        String str = office.getName() + " (" + office.getParty() + ")";
        holder.partyName.setText(str);
    }

    @Override
    public int getItemCount() {
        return officialList.size();
    }
}
