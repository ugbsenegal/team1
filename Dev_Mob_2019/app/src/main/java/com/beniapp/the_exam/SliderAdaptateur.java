package com.beniapp.the_exam;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by beni on 09/04/19.
 */

public class SliderAdaptateur extends PagerAdapter{
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdaptateur(Context context){
        this.context = context;
    }
    // Tableaux d'images
    public int[] slide_images = {
            R.drawable.poulet,
            R.drawable.poulet,
            R.drawable.poulet,
    };
    // Tableau de noms de plat
    public String[] slide_nom_plat = {
            "Yassa",
            "Guinar",
            "Thiep",
    };

    // Tableau de desciption de plat
    public String[] slide_desc_plat = {
            "dfymjebthhhhdbhhfjhhfgh\nczlrugg  lerhgdsf\nqsukchsdg\n",
            "dfymjebthhhhdbhhfjhhfgh\nczlrugg  lerhgdsf\nqsukchsdg\n",
            "dfymjebthhhhdbhhfjhhfgh\nczlrugg  lerhgdsf\nqsukchsdg\n",
    };
    @Override
    public int getCount() {
        return slide_nom_plat.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_poulet);
        TextView slideNom_plat = (TextView) view.findViewById(R.id.nom_plat);
        TextView slideDesc_plat = (TextView) view.findViewById(R.id.desc_plat);

        slideImageView.setImageResource(slide_images[position]);
        slideNom_plat.setText(slide_nom_plat[position]);
        slideNom_plat.setText(slide_desc_plat[position]);

        container.addView(view);

        return view;
    };

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);

    }
}
