package com.vigyan.coaching.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class SyncWorker(context: Context, params: WorkerParameters) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        // Implement sync unsynced local data to Firestore
        return Result.success()
    }
}
