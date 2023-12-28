package com.example.consumerestapi.model

import kotlinx.serialization.Serializable

@Serializable //supaya bisa menggunakan converter dari json
data class Kontak (
    val id: Int,
    //    @SerialName(value = "nama") ==== ini untuk convert dari gson tetapi masih harus menambahkan dependensi (jika namanya tidak sesuai dengan yang ada di web)
    val nama: String,
    val alamat: String,
    val telpon: String
)



