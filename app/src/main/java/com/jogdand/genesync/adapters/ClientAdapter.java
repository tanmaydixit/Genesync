package com.jogdand.genesync.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jogdand.genesync.R;
import com.jogdand.genesync.models.Client;
import com.jogdand.genesync.viewholders.ClientViewHolder;

/**
 * @author Rushikesh Jogdand.
 */

public class ClientAdapter extends RecyclerView.Adapter<ClientViewHolder> {

    private Client[] clients;

    public ClientAdapter(Client[] clients){

        this.clients=clients;
    }

    @Override
    public ClientViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View newView=layoutInflater.inflate(R.layout.item_format,parent,false);
        return new ClientViewHolder(newView);
    }

    @Override
    public void onBindViewHolder(ClientViewHolder clientViewHolder, int position) {

        //todo complete this
        //clientViewHolder.nameTextView.setText()
        //clientViewHolder.nameTextView.setText()

    }

    @Override
    public int getItemCount() {
        return clients.length;
    }
}
