package com.example.utsmobile.Data

import com.example.utsmobile.R
import com.example.utsmobile.model.dino

class DataDino {
    fun loadDino(): List<dino> {
        return listOf<dino>(
            dino(R.string.dino1, R.drawable.t_rex,R.string.dinodesc1),
            dino(R.string.dino2, R.drawable.bronto,R.string.dinodesc2),
            dino(R.string.dino3, R.drawable.triceratops,R.string.dinodesc3),
            dino(R.string.dino4, R.drawable.velociraptor,R.string.dinodesc4),
            dino(R.string.dino5, R.drawable.pterodactyl,R.string.dinodesc5),
            dino(R.string.dino6, R.drawable.compsognatus,R.string.dinodesc6),
            dino(R.string.dino7, R.drawable.spinosaurus,R.string.dinodesc7),
            dino(R.string.dino8, R.drawable.nama_nama_dinosaurus_ankylosaurus,R.string.dinodesc8),
            dino(R.string.dino9, R.drawable.megalosaurus,R.string.dinodesc9),
            dino(R.string.dino10, R.drawable.nama_nama_dinosaurus_stegosaurus,R.string.dinodesc10),
            dino(R.string.dino11,R.drawable.liopleurodon,R.string.dinodesc11),
            dino(R.string.dino12,R.drawable.parasaurolophus,R.string.dinodesc12),
            dino(R.string.dino13,R.drawable.brachiosaurus,R.string.dinodesc13),
            dino(R.string.dino14,R.drawable.carcharodontosaurus,R.string.dinodesc14)
        )
    }

}
