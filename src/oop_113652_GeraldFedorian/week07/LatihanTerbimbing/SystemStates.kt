package oop_113652_GeraldFedorian.week07.LatihanTerbimbing

enum class AppState {
    STARTING,
    RUNNING,
    STOPPED
}

sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}