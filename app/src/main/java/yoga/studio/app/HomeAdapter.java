package yoga.studio.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeVH> {

    ArrayList<PopularPoses> arrayList;
    Listener listener;

    public HomeAdapter(ArrayList<PopularPoses> arrayList, Listener listener) {
        this.arrayList = arrayList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HomeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home, parent,false);
        return new HomeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVH holder, int position) {
        PopularPoses popularPoses = arrayList.get(position);
        holder.txtHomeItemName.setText(popularPoses.name);
        holder.imgHomeItem.setImageResource(popularPoses.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(popularPoses);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class HomeVH extends RecyclerView.ViewHolder{

        TextView txtHomeItemName;
        ImageView imgHomeItem;

        public HomeVH(@NonNull View itemView) {
            super(itemView);

            txtHomeItemName = itemView.findViewById(R.id.Txt_home_item_name);
            imgHomeItem = itemView.findViewById(R.id.Img_home_item);
        }
    }
    interface Listener{
        void onClick(PopularPoses popularPoses);
    }
}
