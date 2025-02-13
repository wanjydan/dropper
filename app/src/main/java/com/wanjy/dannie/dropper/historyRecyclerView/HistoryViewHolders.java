package com.wanjy.dannie.dropper.historyRecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.wanjy.dannie.dropper.HistorySingleActivity;
import com.wanjy.dannie.dropper.R;

/**
 * Created by manel on 10/10/2017.
 */

public class HistoryViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView deliveryId;
    public TextView time;
    public HistoryViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        deliveryId = (TextView) itemView.findViewById(R.id.deliveryId);
        time = (TextView) itemView.findViewById(R.id.time);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), HistorySingleActivity.class);
        Bundle b = new Bundle();
        b.putString("deliveryId", deliveryId.getText().toString());
        intent.putExtras(b);
        v.getContext().startActivity(intent);
    }
}
