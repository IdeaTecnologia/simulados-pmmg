package com.ideatecnologia.simuladospmmg.di

import com.ideatecnologia.simuladospmmg.data.datasource.database.SimuladosLocalDataSource
import com.ideatecnologia.simuladospmmg.data.datasource.database.SimuladosLocalDataSourceImpl
import com.ideatecnologia.simuladospmmg.data.datasource.firestore.SimuladosRemoteDataSource
import com.ideatecnologia.simuladospmmg.data.datasource.firestore.SimuladosRemoteDataSourceImpl
import com.ideatecnologia.simuladospmmg.data.repository.SimuladosRepositoryImpl
import com.ideatecnologia.simuladospmmg.domain.repository.SimuladosRepository
import com.ideatecnologia.simuladospmmg.domain.usecase.GetMateriasUseCase
import com.ideatecnologia.simuladospmmg.domain.usecase.SyncMateriasUseCase
import com.ideatecnologia.simuladospmmg.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

object MainModule : BaseFeatureModule() {
    override fun dataModule(): Module = module {
        factory<SimuladosRemoteDataSource> { SimuladosRemoteDataSourceImpl(get()) }
        factory<SimuladosLocalDataSource> { SimuladosLocalDataSourceImpl(get()) }
        factory<SimuladosRepository> { SimuladosRepositoryImpl(get(), get()) }
    }

    override fun domainModule(): Module = module {
        factoryOf(::GetMateriasUseCase)
        factoryOf(::SyncMateriasUseCase)
    }

    override fun presentationModule(): Module = module {
        viewModelOf(::MainViewModel)
    }
}