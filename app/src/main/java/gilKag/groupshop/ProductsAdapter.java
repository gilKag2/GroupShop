package gilKag.groupshop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {
    private ArrayList<Product> mProducts;

    public ProductsAdapter(ArrayList<Product> products) {
        mProducts = products;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mTextView;
        MyViewHolder(@NonNull View v) {
            super(v);
            mImageView= v.findViewById(R.id.product_img);
            mTextView = v.findViewById(R.id.product_name);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//LayoutInflater layoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product product = mProducts.get(position);

        holder.mImageView.setImageResource(product.getImgResource());
        holder.mTextView.setText(product.getItem());
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }
}
