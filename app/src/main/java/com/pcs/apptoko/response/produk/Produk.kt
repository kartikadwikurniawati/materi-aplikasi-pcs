package com.pcs.apptoko.response.produk

import android.os.Parcelable

data class Produk (
    val admin_id: String,
    val harga: String,
    val id: String,
    val nama: String,
    val nama_admin: String,
    val stok: String
        ):Parcelable