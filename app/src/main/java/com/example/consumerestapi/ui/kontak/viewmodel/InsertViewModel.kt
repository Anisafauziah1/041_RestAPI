package com.example.consumerestapi.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.consumerestapi.repository.KontakRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel() {

    var insertKotakState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertKontakState(insertUiEvent: InsertUiEvent){

    }

    suspend fun insertKontak() {
        viewModelScope.launch {
            try {
                kontakRepository.insertKontak(insertKotakState.insertUiEvent.toKontak())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val telepon: String = "",
    val alamat: String = "",

)