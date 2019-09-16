package gilKag.groupshop;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {
    private ArrayList<Button> productsButtons;
    private Activity mActivity;

    public ProductsAdapter(Activity activity, ArrayList<Button> buttons) {
        productsButtons = buttons;
        mActivity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return productsButtons.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        Button mBtn;
        public MyViewHolder(@NonNull Button btn) {
            super(btn);
            mBtn = btn;
        }
    }
}
