package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {
  suspend fun getPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotoRepository(
  private val marsApiService: MarsApiService
) : MarsPhotoRepository {
  override suspend fun getPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}