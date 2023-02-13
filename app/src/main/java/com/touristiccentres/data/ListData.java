package com.touristiccentres.data;

import androidx.annotation.NonNull;

import com.touristiccentres.entities.TouristicModel;

import java.util.ArrayList;
import java.util.List;

public class ListData {

    public ListData() {
        // Build Required
    }

    @NonNull
    public List<TouristicModel> Touristic() {

        List<TouristicModel> list = new ArrayList<>();

        TouristicModel model1 = new TouristicModel();
        model1.setName("VENTANILLAS DE ARASCORGUE");
        list.add(model1);

        TouristicModel model2 = new TouristicModel();
        model2.setName("LA COLPA");
        list.add(model2);

        TouristicModel model3 = new TouristicModel();
        model3.setName("OTUSCO");
        list.add(model3);

        TouristicModel model4 = new TouristicModel();
        model4.setName("CUMBEMAYO");
        list.add(model4);

        return list;
    }
}
