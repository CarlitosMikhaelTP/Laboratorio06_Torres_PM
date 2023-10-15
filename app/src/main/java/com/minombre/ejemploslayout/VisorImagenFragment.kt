package com.minombre.ejemploslayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.minombre.ejemploslayout.Pelicula
import com.minombre.ejemploslayout.R

class VisorImagenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_visor_imagen, container, false)

        val pelicula = arguments?.getSerializable("pel") as Pelicula
        view.findViewById<ImageView>(R.id.avilvPelicula).setImageResource(pelicula.idImagen)

        return view
    }
}
