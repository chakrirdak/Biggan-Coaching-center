package com.vigyan.coaching.data.repo

import com.vigyan.coaching.data.local.Student
import com.vigyan.coaching.data.local.StudentDao
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class Repository(private val studentDao: StudentDao, private val firestore: FirebaseFirestore) {
    fun getStudents() = studentDao.getAll()

    suspend fun addStudent(student: Student) {
        studentDao.insert(student)
        // Firestore sync (placeholder)
        try {
            firestore.collection("students").document(student.id).set(student).await()
        } catch (e: Exception) {
            // log or mark unsynced
        }
    }
}
