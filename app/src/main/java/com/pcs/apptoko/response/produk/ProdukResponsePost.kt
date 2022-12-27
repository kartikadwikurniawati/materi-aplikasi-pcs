package com.pcs.apptoko.response.produk

data class ProdukResponsePost (
    val `data`: DataPoduk,
    val message: String,
    val success: Boolean
        )

data class DataPoduk (
    val `produk`: Produk
        )
