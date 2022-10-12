package com.fyaman.movie.data

import android.os.Parcelable
import com.fyaman.movie.R
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieModel(
    val id: Int,
    val movieName: String,
    val year: Int,
    val time: Int,
    val genre: String,
    val rate: String,
    val description: String,
    val image: Int,
    val banner: Int
) : Parcelable{
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object{
        fun fromJson(jsonValue: String): MovieModel{
            return Gson().fromJson(jsonValue,MovieModel::class.java)
        }
    }
}

val mockMovieData = mutableListOf<MovieModel>(
    MovieModel(
        1,
        "Jurassic World Domination",
        2022,
        147,
        "Action",
        "5.7",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie1,
        R.drawable.movie1banner
    ),
    MovieModel(
        2,
        "Spiderman No Way Home",
        2021,
        148,
        "Action",
        "9.5",
        "From DC Comics comes the Suicide Squad, an antihero team of incarcerated supervillains who act as deniable assets for the United States government, undertaking high-risk black ops missions in exchange for commuted prison sentences.",
        R.drawable.movie2,
        R.drawable.movie2banner
    ),
    MovieModel(
        3,
        "Iron Man",
        2008,
        126,
        "Adventure",
        "7/9",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie3,
        R.drawable.movie3banner
    ),
    MovieModel(
        4,
        "Avengers: Endgame",
        2019,
        181,
        "Drama",
        "8.4",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie4,
        R.drawable.movie4banner
    ),
    MovieModel(
        5,
        "Bir Zamanlar Anadolu'da",
        2011,
        157,
        "Crime,Drama",
        "9.5",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie5,
        R.drawable.movie5banner
    ),
    MovieModel(
        6,
        "Leon: The Professional",
        1994,
        110,
        "Action,Crime,Drama",
        "9.5",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie6,
        R.drawable.movie6banner
    ),
    MovieModel(
        1,
        "Jurassic World Domination",
        2022,
        147,
        "Action",
        "5.7",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie1,
        R.drawable.movie1banner
    ),
    MovieModel(
        2,
        "Spiderman No Way Home",
        2021,
        148,
        "Action",
        "9.5",
        "From DC Comics comes the Suicide Squad, an antihero team of incarcerated supervillains who act as deniable assets for the United States government, undertaking high-risk black ops missions in exchange for commuted prison sentences.",
        R.drawable.movie2,
        R.drawable.movie2banner
    ),
    MovieModel(
        3,
        "Iron Man",
        2008,
        126,
        "Adventure",
        "7/9",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie3,
        R.drawable.movie3banner
    ),
    MovieModel(
        4,
        "Avengers: Endgame",
        2019,
        181,
        "Drama",
        "8.4",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie4,
        R.drawable.movie4banner
    ),
    MovieModel(
        5,
        "Bir Zamanlar Anadolu'da",
        2011,
        157,
        "Crime,Drama",
        "9.5",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie5,
        R.drawable.movie5banner
    ),
    MovieModel(
        6,
        "Leon: The Professional",
        1994,
        110,
        "Action,Crime,Drama",
        "9.5",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie6,
        R.drawable.movie6banner
    ),    MovieModel(
        1,
        "Jurassic World Domination",
        2022,
        147,
        "Action",
        "5.7",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie1,
        R.drawable.movie1banner
    ),
    MovieModel(
        2,
        "Spiderman No Way Home",
        2021,
        148,
        "Action",
        "9.5",
        "From DC Comics comes the Suicide Squad, an antihero team of incarcerated supervillains who act as deniable assets for the United States government, undertaking high-risk black ops missions in exchange for commuted prison sentences.",
        R.drawable.movie2,
        R.drawable.movie2banner
    ),
    MovieModel(
        3,
        "Iron Man",
        2008,
        126,
        "Adventure",
        "7/9",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie3,
        R.drawable.movie3banner
    ),
    MovieModel(
        4,
        "Avengers: Endgame",
        2019,
        181,
        "Drama",
        "8.4",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie4,
        R.drawable.movie4banner
    ),
    MovieModel(
        5,
        "Bir Zamanlar Anadolu'da",
        2011,
        157,
        "Crime,Drama",
        "9.5",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie5,
        R.drawable.movie5banner
    ),
    MovieModel(
        6,
        "Leon: The Professional",
        1994,
        110,
        "Action,Crime,Drama",
        "9.5",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Arcu bibendum at varius vel pharetra vel. Placerat in egestas erat imperdiet sed euismod. Enim neque volutpat ac tincidunt. Malesuada pellentesque elit eget gravida cum sociis natoque. Consectetur lorem donec massa sapien faucibus et. Vestibulum morbi blandit cursus risus. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Varius vel pharetra vel turpis nunc eget.",
        R.drawable.movie6,
        R.drawable.movie6banner
    )
)