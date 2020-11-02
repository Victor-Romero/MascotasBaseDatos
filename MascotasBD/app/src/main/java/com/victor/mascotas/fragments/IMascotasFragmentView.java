package com.victor.mascotas.fragments;

import com.victor.mascotas.adapters.MascotaAdaptador;
import com.victor.mascotas.classes.Mascota;

import java.util.ArrayList;

public interface IMascotasFragmentView {
    public void generateLinearLayot();
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas );
    public void initAdaptadorRV( MascotaAdaptador adaptador );
}
