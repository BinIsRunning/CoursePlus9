package com.example.core.http

import androidx.annotation.NonNull
import androidx.annotation.Nullable

interface EntityCallback<T> {
    fun onSuccess(@NonNull entity: T)

    fun onFailure(@Nullable message: String)
}