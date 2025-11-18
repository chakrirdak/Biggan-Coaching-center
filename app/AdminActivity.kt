package com.vigyan.coaching.ui.admin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vigyan.coaching.databinding.ActivityAdminBinding
import com.vigyan.coaching.data.local.SchoolInfo
import com.vigyan.coaching.data.local.Student
import java.util.*

class AdminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveSchool.setOnClickListener {
            binding.tvStatus.text = "Demo: saved locally (implement Room save)"
        }

        binding.btnAddStudent.setOnClickListener {
            val name = binding.etStudentName.text.toString()
            val guardian = binding.etGuardianName.text.toString()
            val cls = binding.etClass.text.toString()
            val status = "Saved student (demo): $name, guardian: $guardian, class: $cls"
            binding.tvStatus.text = status
        }
    }
}
