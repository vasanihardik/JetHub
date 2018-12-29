package com.takusemba.jethub.api

import com.takusemba.jethub.api.response.RepositoryResponse
import com.takusemba.jethub.model.Repository
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

class RepoApiClient(retrofit: Retrofit) : RepoApi {

  interface Service {

    @GET("repos/{owner}/{repo}")
    fun getRepo(
      @Path("owner") owner: String,
      @Path("repo") repo: String
    ): Deferred<RepositoryResponse>
  }

  private val service = retrofit.create(Service::class.java)

  override suspend fun getRepo(owner: String, repo: String): Repository {
    return service.getRepo(owner, repo).await().toModel()
  }
}