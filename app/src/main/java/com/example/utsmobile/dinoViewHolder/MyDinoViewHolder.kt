package com.example.utsmobile.dinoViewHolder

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.utsmobile.R
import com.example.utsmobile.model.dino

class MyDinoViewHolder : ViewModel(){
    var dinoMutableLiveData: MutableLiveData<ArrayList<dino>?> = MutableLiveData()
    var dinoArrayList: ArrayList<dino>? = null

    fun init(){
        dinoList()
        dinoMutableLiveData.value = dinoArrayList
    }
    fun dinoList(){
        var dino = dino("Tyronnosaurus Rex", R.drawable.t_rex,"Tyronnosaurus Rex atau disingkat T-Rex, bisa jadi merupakan jenis dinosaurus paling populer terutama berkat pengaruh film-film Hollywood tentang dinosaurus. Hewan ini menjadi karnivora darat terbesar sepanjang sejarah. T-Rex pun dikenal sebagai predator ganas dengan gigitan tertajam di antara hewan purba.")
        dinoArrayList = ArrayList()
        dinoArrayList!!.add(dino)
        dino = dino("Brontosaurus",R.drawable.bronto,"Brontosaurus menjadi salah satu jenis jenis dinosaurus.Jenis aslinya bernama Apatosaurus, namun sering disebut Brontosaurus. Jenis dinosaurus ini memiliki leher yang panjang dan tubuhnya bisa mencapai 26 meter dengan berat 32 ton. Habitat Brontosaurus ada di tepi danau dan hutan serta termasuk hewan herbivora.")
        dinoArrayList!!.add(dino)
        dino = dino("Triceratops",R.drawable.triceratops,"Triceratops merupakan salah satu jenis dinosaurus yang terkenal dan biasa disebut Tritop.jenis dinosaurus bertanduk tiga yang berbadan besar.\n" +
                "        Tanduknya pun bisa berfungsi sebagai penyerangan atau pertahanan dari musuh. Panjangnya bisa mencapai 9 meter, dengan tinggi 3,8 meter,dan beratnya mencapai 6,8 ton.")
        dinoArrayList!!.add(dino)
        dino = dino("Velociraptor",R.drawable.velociraptor,"Velociraptor atau biasa disingkat Raptor saja, merupakan jenis dinosaurus pemangsa yang mirip dengan T-Rex, hanya saja dalam ukuran yang lebih kecil.\n" +
                "        Jenis Velociraptor biasa hidup berkelompok dan tergolong sebagai jenis dinosaurus yang cerdas. Mereka memangsa dengan menggunakan strategi pengalih perhatian.")
        dinoArrayList!!.add(dino)
        dino = dino("Pterodactyl",R.drawable.pterodactyl,"Pterodactyl atau biasa disebut juga Pterosaurus dan Pterodactylus, memiliki arti kadal bersayap Pterosaurus adalah vertebrata paling awal yang diketahui memiliki kemampuan terbang yang kuat.")
        dinoArrayList!!.add(dino)
        dino = dino("Compsognathus",R.drawable.compsognatus,"Compsognathus merupakan salah satu dari macam-macam dinosaurus dengan ukuran yang kecil.\n" +
                "        Bahkan ukurannya hanya mencapai 60 cm atau sebesar ayam saja, sehingga Compsognathus diperkirakan sebagai jenis dinosaurus terkecil di dunia. Mereka hidup secara berkelompok dan mirip dengan Tyronnasaurus Rex atau Velociraptor.")
        dinoArrayList!!.add(dino)
        dino = dino("Spinosaurus",R.drawable.spinosaurus,"Salah satu jenis dinosaurus terbesar di dunia sepanjang sejarah adalah Spinosaurus. Spinosaurus merupakan theropoda raksasa yang dapat tumbuh hingga 15 meter dengan tinggi sekitar 5 meter dan berat mencapai 7,6 ton.\n" +
                "        Panjang tengkorak Spinosaurus 1,75 m dengan seratus gigi-gigi runcing yang lurus sepanjang kira-kira 17 cm.")
        dinoArrayList!!.add(dino)
        dino = dino("Ankylosaurus",R.drawable.nama_nama_dinosaurus_ankylosaurus,"Ankylosaurus adalah salah satu dari jenis-jenis dinosaurus dengan tubuh sepanjang 9 meter. Sedangkan berat Ankylosaurus bisa sampai 9 ton.\n" +
                "        Dinosaurus ini memiliki cangkang tubuh yang keras sebagai perisai pertahanan. Di bagian ekornya, terdapat bola dari batu dengan berat sekitar 5 kg sebagai alat untuk menyerang lawan.")
        dinoArrayList!!.add(dino)
        dino = dino("Megalosaurus",R.drawable.megalosaurus,"Megalosaurus dianggap sebagai salah satu jenis dinosaurus yang pertama ditemukan. Dinosaurus jenis ini merupakan dinosaurus terbesar pada zaman pertengahan jurasik.\n" +
                "        Ukuran Megalosaurus bisa tumbuh hingga mencapai 9 meter sedangkan tingginya mencapai 3 sampai 4 meter dengan berat sekitar 3,5 ton.")
        dinoArrayList!!.add(dino)
        dino = dino("Stegosaurus",R.drawable.nama_nama_dinosaurus_stegosaurus,"Stegosaurus menjadi salah satu bentuk dinosaurus yang paling mudah diidentifikasi.\n" +
                "        Hal ini karena ciri-ciri dinosaurus ini yang mudah dikenali, yakni kedua baris sisik yang saling silang yang ada di punggung serta 2 pasang duri panjang yang ada di ekor Stegosaurus.")
        dinoArrayList!!.add(dino)
    }
    init {
        init()
    }
    fun setdatadino(Dino: dino,context: Context){
        dinoArrayList
    }
}