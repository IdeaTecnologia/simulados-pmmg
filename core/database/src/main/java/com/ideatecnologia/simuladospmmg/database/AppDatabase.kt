package com.ideatecnologia.simuladospmmg.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ideatecnologia.simuladospmmg.database.dao.AlternativaDao
import com.ideatecnologia.simuladospmmg.database.dao.MateriaDao
import com.ideatecnologia.simuladospmmg.database.dao.QuestaoDao
import com.ideatecnologia.simuladospmmg.database.dao.TentativaDao
import com.ideatecnologia.simuladospmmg.database.model.AlternativaEntity
import com.ideatecnologia.simuladospmmg.database.model.MateriaEntity
import com.ideatecnologia.simuladospmmg.database.model.QuestaoEntity
import com.ideatecnologia.simuladospmmg.database.model.TentativaEntity
import com.ideatecnologia.simuladospmmg.database.util.InstantConverter

@Database(
    entities = [MateriaEntity::class, QuestaoEntity::class, AlternativaEntity::class, TentativaEntity::class],
    version = 1
)
@TypeConverters(
    InstantConverter::class,
)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun materiaDao(): MateriaDao
    abstract fun questaoDao(): QuestaoDao
    abstract fun alternativaDao(): AlternativaDao
    abstract fun tentativaDao(): TentativaDao
}