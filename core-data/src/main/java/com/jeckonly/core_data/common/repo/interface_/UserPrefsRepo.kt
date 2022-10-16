package com.jeckonly.core_data.common.repo.interface_

import com.jeckonly.core_model.datastore.DownloadState
import com.jeckonly.core_model.domain.ResourceState
import com.jeckonly.core_model.ui.home.PokemonInfoUI
import kotlinx.coroutines.flow.*

interface UserPrefsRepo {

    fun getDownloadStateFlow(): Flow<DownloadState>

    suspend fun updateDownloadStateToStart()

    suspend fun updateDownloadStateToFinish()
}


