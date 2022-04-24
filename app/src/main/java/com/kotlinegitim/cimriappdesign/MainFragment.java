package com.kotlinegitim.cimriappdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kotlinegitim.cimriappdesign.adapter.CategoriesAdapter;
import com.kotlinegitim.cimriappdesign.databinding.FragmentMainBinding;
import com.kotlinegitim.cimriappdesign.entity.Categories;

import java.util.ArrayList;


public class MainFragment extends Fragment {
    private FragmentMainBinding design;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        design = FragmentMainBinding.inflate(inflater, container, false);

        design.rv.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Categories> categoryList = new ArrayList<>();
        Categories c1 = new Categories(1, "Elektronik," + "\n" + "Cep Telefonu", "iphone");
        Categories c2 = new Categories(2, "Ev, Yaşam," + "\n" + "Ofis, Kırtasiye", "koltuk");
        Categories c3 = new Categories(3, "Anne, Bebek," + "\n" + "Oyuncak", "baby");
        Categories c4 = new Categories(4, "Saat, Moda," + "\n" + "Takı, Ayakkabı", "tshirt");
        Categories c5 = new Categories(5, "Kitap," + "\n" + "Müzik, Hobi", "kitap");
        Categories c6 = new Categories(6, "Spor," + "\n" + "Outdoor", "bisiklet");
        Categories c7 = new Categories(7, "Sağlık, Bakım," + "\n" + "Kozmetik", "kozmetikk");
        Categories c8 = new Categories(8, "Oto, Bahçe," + "\n" + "Yapı Market", "matkap");
        Categories c9 = new Categories(9, "Petshop" + "\n" + "", "petshop");
        categoryList.add(c1);
        categoryList.add(c2);
        categoryList.add(c3);
        categoryList.add(c4);
        categoryList.add(c5);
        categoryList.add(c6);
        categoryList.add(c7);
        categoryList.add(c8);
        categoryList.add(c9);

        CategoriesAdapter adapter = new CategoriesAdapter(requireContext(), categoryList);
        design.rv.setAdapter(adapter);

        return design.getRoot();
    }
}