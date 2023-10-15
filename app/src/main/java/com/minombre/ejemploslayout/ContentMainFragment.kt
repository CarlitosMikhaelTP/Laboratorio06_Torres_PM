package com.minombre.ejemploslayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.minombre.ejemploslayout.AdaptadorPeliculasFragment
import com.minombre.ejemploslayout.Pelicula
import com.minombre.ejemploslayout.R

class ContentMainFragment : Fragment() {

    private lateinit var rvPeli: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.content_main, container, false)

        rvPeli = view.findViewById(R.id.amRvPeliculas)
        rvPeli.layoutManager = LinearLayoutManager(activity)
        rvPeli.adapter = AdaptadorPeliculasFragment(generarDatosPrueba(), requireContext())

        return view
    }

    private fun generarDatosPrueba() : ArrayList<Pelicula> {
        var lista = ArrayList<Pelicula>()
        lista.add(Pelicula(R.drawable.peli1,
            "Catastrofe en Corea",
            "Ping Sunjong",
            "Accion",
            4.3,
            169,
            "2023",
            "Esta es la historia de una familia se muda a un nuevo " +
                    "edificio de apartamentos. Organizan una fiesta de inauguración " +
                    "cuando durante la noche una gran tormenta desestabiliza el " +
                    "terreno creando un hueco profundo succionando todo el edificio " +
                    "y hundiéndose este a 500 metros bajo tierra."))
        lista.add(Pelicula(R.drawable.peli2,
            "Guardianes del Museo",
            "Vasiliy Rovenskiy",
            "Aventura",
            4.0,
            80,
            "2023",
            "Nuestra historia es protagonizada por un joven gato llamado Vincent, " +
                    "quien forma equipo con la rata Maurice en su intento de escapar de una " +
                    "inundación en un viejo piano. Tras recoger el instrumento, un grupo de " +
                    "marineros lo envía a un museo, donde Vincent conoce a una brigada gatuna " +
                    "dedicada a proteger obras maestras de la amenaza de los roedores y " +
                    "otras alimañas. Vincent sueña con pertenecer a una verdadera familia " +
                    "felina, pero como no quiere perder a Maurice ?quien le salvó la vida?, " +
                    "se ve obligado a esconderlo de los otros gatos. Sin embargo, su amigo " +
                    "tiene una gran debilidad: roer famosas obras maestras. Todo se complica " +
                    "aún más cuando una de las pinturas más importantes del mundo, " +
                    "la \"Mona Lisa\" o \"La Gioconda\", llega al museo: ¡y roerla es el " +
                    "sueño de todas las ratas y ratones! Pero ni Vincent, ni Maurice, " +
                    "ni los gatos del museo se imaginaban que alguien querría robarla, " +
                    "por lo que Vincent tendrá que reunir todo su valor e ingenio para " +
                    "salvar la obra maestra de Da Vinci, proteger la reputación del museo y " +
                    "ganarse el corazón de Cleopatra, una hermosa gata de la sala egipcia del museo."))
        lista.add(Pelicula(R.drawable.peli3,
            "La Conspiración del Diablo",
            "Nathan Frankowski",
            "Terror",
            3.3,
            111,
            "2023",
            "Una secta satánica roba el sudario de Turín para obtener el ADN de " +
                    "Jesucristo y, de esta forma, ofrecérselo al señor de las tinieblas. " +
                    "Sin embargo, el arcángel Miguel desciende a la Tierra para evitar que " +
                    "el mal triunfe"))
        lista.add(Pelicula(R.drawable.peli4,
            "La Desición de Amelia",
            "Francisco José Lombardi",
            "Drama",
            3.9,
            96,
            "2023",
            "Amelia (Mayella Lloclla) es una joven auxiliar de enfermería " +
                    "que consigue trabajo en el cuidado de don Víctor (Gustavo Bueno), " +
                    "un anciano millonario y amargado. Conforme pasan los días, ambos " +
                    "amplían sus conversaciones y hablan desde sus distintas " +
                    "perspectivas de concebir la vida."))
        lista.add(Pelicula(R.drawable.peli5,
            "La Presentadora",
            "Ferris Becker",
            "Terror",
            2.8,
            120,
            "2023",
            "Una famosa presentadora de noticias recibe una llamada " +
                    "justo cinco minutos antes de su transmisión en vivo. " +
                    "La voz al otro lado del teléfono le dice que será asesinada " +
                    "y le pide que cubra la historia de su muerte"))
        lista.add(Pelicula(R.drawable.peli6,
            "Sonidos de Libertad",
            "Alejandro Monteverde",
            "Drama",
            4.9,
            120,
            "2023",
            "Un ex agente federal se embarca en una peligrosa misión para " +
                    "salvar a una niña de unos despiadados traficantes de menores. " +
                    "Se le acaba el tiempo y se adentra en la selva colombiana, " +
                    "arriesgando su vida para liberarla de un destino peor que la muerte."))

        return lista
    }
}
