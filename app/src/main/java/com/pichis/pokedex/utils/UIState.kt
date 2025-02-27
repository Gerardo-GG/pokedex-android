package com.pichis.pokedex.utils

sealed class UIState<T> {
    data class Success<T>( val response: T ) : UIState<T>()
    data class Error<T>( val message: String, val response: T? = null ) : UIState<T>()
    data class Loading<T>( val response: T? = null ): UIState<T>()
}