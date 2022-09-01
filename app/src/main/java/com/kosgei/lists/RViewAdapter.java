package com.kosgei.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.kosgei.lists.databinding.ListItemBinding;
public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.MyViewHolder> {
    private Context context;
    private ListItemBinding binding;

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt=itemView.findViewById(R.id.textView2);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View  view = inflater.inflate(R.layout.list_item,parent,false);
        return new RViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt.setText("I am counting..."+position);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    //Context and Data
    public RViewAdapter(Context context){
        this.context = context;
    }


}
