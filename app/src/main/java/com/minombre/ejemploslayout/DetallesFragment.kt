package com.minombre.ejemploslayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.minombre.ejemploslayout.R
import com.minombre.ejemploslayout.Pelicula

class DetallesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detalles, container, false)

        val pelicula = arguments?.getSerializable("pel") as Pelicula

        view.findViewById<TextView>(R.id.adTvTitulo).text = "Titulo: ${pelicula.titulo}"
        view.findViewById<TextView>(R.id.adTvDirector).text = "Director: ${pelicula.director}"
        view.findViewById<TextView>(R.id.adTvGenero).text = "Género: ${pelicula.genero}"
        view.findViewById<TextView>(R.id.adTvDuracion).text = "Duración: ${pelicula.duracion} minutos"
        view.findViewById<TextView>(R.id.adTvCalificacion).text = "Calificación: ${pelicula.calificacion}"
        view.findViewById<TextView>(R.id.adTvFecha).text = "Fecha: ${pelicula.fecha}"
        view.findViewById<TextView>(R.id.adTvSinopsis).text = "Sinopsis: ${pelicula.sinopsis}"

        return view
    }

    companion object {
        fun newInstance(pelicula: Pelicula): DetallesFragment {
            val fragment = DetallesFragment()
            val args = Bundle()
            args.putSerializable("pel", pelicula)
            fragment.arguments = args
            return fragment
        }
    }
}
