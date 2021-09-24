//package com.example.weatherrecyclerviewretrofitmytry.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.weatherrecyclerviewretrofitmytry.R;
//import com.example.weatherrecyclerviewretrofitmytry.models.Example;
//
//import java.util.List;
//
//public class WAdapter extends RecyclerView.Adapter<WAdapter.WViewHolder> {
//
//    List<Example> weatherDataModelList;
//    Context context;
//
//    public WAdapter( Context context, List<Example>  weatherDataModelList) {
//        this.weatherDataModelList = weatherDataModelList;
//        this.context = context;
//    }
//
//
//    //
//    @NonNull
//    @Override
//    public WViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
//        return new WViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull WViewHolder holder, int position) {
//        // instance of Model class
//        Example weatherResponse = weatherDataModelList.get(position);
//        //
//        holder.name.setText(" " + weatherResponse.getName());
//        holder.id.setText("ID: "+weatherResponse.getId());
//        holder.dt.setText( "Dt: "+weatherResponse.getDt());
//    }
//
//    @Override
//    public int getItemCount() {
//        return weatherDataModelList.size();
//    }
//
//    public class WViewHolder extends RecyclerView.ViewHolder {
//
//        TextView dt, id, name, coord;
//
//        public WViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//
//
//            name = itemView.findViewById(R.id.textView);
//            id = itemView.findViewById(R.id.textView2);
//            dt = itemView.findViewById(R.id.textView3);
//
//        }
//    }
//}
