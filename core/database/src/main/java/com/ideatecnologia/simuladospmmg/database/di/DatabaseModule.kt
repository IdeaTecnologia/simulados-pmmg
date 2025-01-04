package com.ideatecnologia.simuladospmmg.database.di

import androidx.room.Room
import com.ideatecnologia.simuladospmmg.database.AppDatabase
import com.ideatecnologia.simuladospmmg.database.dao.AlternativaDao
import com.ideatecnologia.simuladospmmg.database.dao.MateriaDao
import com.ideatecnologia.simuladospmmg.database.dao.QuestaoDao
import com.ideatecnologia.simuladospmmg.database.dao.TentativaDao
import org.koin.core.module.Module
import org.koin.dsl.module

object DatabaseModule {
    val module: Module = module {
        single<AppDatabase> {
            Room.databaseBuilder(
                get(),
                AppDatabase::class.java, "simulados-pmmg-database"
            ).build()
        }

        single<MateriaDao> { get<AppDatabase>().materiaDao() }
        single<QuestaoDao> { get<AppDatabase>().questaoDao() }
        single<AlternativaDao> { get<AppDatabase>().alternativaDao() }
        single<TentativaDao> { get<AppDatabase>().tentativaDao() }
    }
}