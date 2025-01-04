package com.ideatecnologia.simuladospmmg.data.datasource.firestore

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject
import com.ideatecnologia.simuladospmmg.data.model.AlternativaResponse
import com.ideatecnologia.simuladospmmg.data.model.MateriaResponse
import com.ideatecnologia.simuladospmmg.data.model.QuestaoResponse
import com.ideatecnologia.simuladospmmg.data.model.TentativaResponse
import kotlinx.coroutines.tasks.await

class SimuladosRemoteDataSourceImpl(
    private val firestore: FirebaseFirestore
) : SimuladosRemoteDataSource {
    override suspend fun getMaterias(): List<MateriaResponse> {
        val snapshot = firestore.collection("materia").get().await()
        return snapshot.documents.mapNotNull { document ->
            Log.d("XXX", "document: $document")
            document.toObject<MateriaResponse>()
        }
    }

    override suspend fun getQuestoes(): List<QuestaoResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getAlternativas(questaoId: Int): List<AlternativaResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getTentativas(): List<TentativaResponse> {
        TODO("Not yet implemented")
    }
}