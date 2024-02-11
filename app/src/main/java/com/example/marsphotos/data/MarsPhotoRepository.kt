package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {
  suspend fun getPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotoRepository() : MarsPhotoRepository {
  override suspend fun getPhotos(): List<MarsPhoto> {
    return MarsApi.retrofitService.getPhotos()
  }
}