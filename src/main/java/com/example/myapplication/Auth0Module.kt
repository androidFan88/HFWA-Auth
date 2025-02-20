package com.example.myapplication

import android.content.Context
import com.auth0.android.Auth0
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Auth0Module {



    @Provides
    @Singleton
    fun provideAuth0(@ApplicationContext context: Context): Auth0 {
        return Auth0.getInstance(context.getString(R.string.auth0_client_id), context.getString(R.string.auth0_domain))
    }




}