package com.example.mvvmproject.data.model

data class Problem(
    val name: String,
    val medications: List<Medication>,
    val labs: List<Lab>
)