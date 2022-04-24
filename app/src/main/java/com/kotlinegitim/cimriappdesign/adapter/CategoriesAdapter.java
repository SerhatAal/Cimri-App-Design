package com.kotlinegitim.cimriappdesign.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kotlinegitim.cimriappdesign.databinding.CardviewDesignBinding;
import com.kotlinegitim.cimriappdesign.entity.Categories;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CardViewDesign> {
    private Context mContext;
    private List<Categories> categoryList;

    public CategoriesAdapter(Context mContext, List<Categories> categoryList) {
        this.mContext = mContext;
        this.categoryList = categoryList;
    }


    public class CardViewDesign extends RecyclerView.ViewHolder {
        private CardviewDesignBinding designBinding;

        public CardViewDesign(CardviewDesignBinding designBinding) {
            super(designBinding.getRoot());
            this.designBinding = designBinding;
        }
    }

    @NonNull
    @Override
    public CardViewDesign onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardviewDesignBinding designBinding = CardviewDesignBinding
                .inflate(layoutInflater, parent, false);
        return new CardViewDesign(designBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewDesign holder, int position) {
        Categories category = categoryList.get(position);
        CardviewDesignBinding d = holder.designBinding;

        d.imageViewCategoryImage.setImageResource(mContext
                .getResources()
                .getIdentifier(category.getCategory_image(), "drawable", mContext.getPackageName()));

        d.textViewCategoryName.setText(category.getCategory_name());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
