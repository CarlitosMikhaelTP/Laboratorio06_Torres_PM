package com.minombre.ejemploslayout

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.minombre.ejemploslayout.Pelicula
import com.minombre.ejemploslayout.R
import com.minombre.ejemploslayout.DetallesFragment
import com.minombre.ejemploslayout.VisorImagenFragment


class AdaptadorPeliculasFragment(private var lista: ArrayList<Pelicula>, private var contexto: Context): RecyclerView.Adapter<AdaptadorPeliculasFragment.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_elemento_lista_pelicula,parent,false),
            this.contexto
        )
    }


    override fun getItemCount(): Int {
        /*Le decimos cuantos elementos se retornan en la lista*/
        return this.lista.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(this.lista[position])
    }

    class ViewHolder(var vista: View, var contexto: Context): RecyclerView.ViewHolder(vista){
        fun bind(pelicula: Pelicula){
            vista.findViewById<ImageView>(R.id.elpIvPelicula).setImageResource(pelicula.idImagen)
            vista.findViewById<TextView>(R.id.elpTvTitulo).setText(pelicula.titulo)
            vista.findViewById<TextView>(R.id.elpTvGenero).setText(pelicula.genero)
            vista.findViewById<RatingBar>(R.id.ratingBar).setRating(pelicula.calificacion.toFloat())

            vista.findViewById<ImageView>(R.id.elpIvPelicula).setOnClickListener {
                contexto.startActivity(Intent(contexto, VisorImagenFragment::class.java).putExtra("pel", pelicula))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, DetallesFragment::class.java).putExtra("pel", pelicula))
            }

        }

    }

}