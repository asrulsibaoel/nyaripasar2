package com.penguin.padang.pasir.nyaripasar.adapters;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.penguin.padang.pasir.nyaripasar.R;
import com.penguin.padang.pasir.nyaripasar.model.Product;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jowy on 7/5/16.
 */
public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder> {

    private List<Product> productList;

    public ProductListAdapter() {
        this.productList = new ArrayList<>();
    }

    private void add(Product item){
        productList.add(item);
        notifyItemInserted(productList.size() - 1);
    }

    public void addAll(List<Product> productList){
        for (Product product : productList){
            add(product);
        }
    }

    public void remove(Product item){
        int position = productList.indexOf(item);
        if(position >= 0){
            productList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear(){
        while(getItemCount() > 0){
            remove(getItem(0));
        }
    }

    public Product getItem(int position){
        return productList.get(position);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_product, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);

        return productViewHolder;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        final Product product = productList.get(position);

//        holder.productImage.setImageResource(product.getImage());
        holder.productName.setText(product.getProductName());
        holder.productPrice.setText(product.getPrice().toString());
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView productImage;
        TextView productName;
        TextView productPrice;

        public ProductViewHolder(View itemView) {
            super(itemView);

            productImage = (ImageView) itemView.findViewById(R.id.product_img);
            productName = (TextView) itemView.findViewById(R.id.product_name);
            productPrice = (TextView) itemView.findViewById(R.id.product_price);
        }
    }
}
