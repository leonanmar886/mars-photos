package com.example.marsphotos.network

import retrofit2.http.GET

/**
 * Retrofit service object for creating api calls
 */
interface MarsApiService {
  @GET("photos")
  suspend fun getPhotos(): List<MarsPhoto>
}