package com.jcsla.korailsrt.presentation.data.api

import com.jcsla.korailsrt.presentation.entity.dto.response.LoginResponse
import com.jcsla.korailsrt.presentation.entity.dto.response.ScheduleViewResponse
import com.jcsla.korailsrt.presentation.entity.dto.response.TicketReservationResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.QueryMap

interface KorailApi {

    @POST("com.korail.mobile.login.Login")
    fun login(@Body requestBody: RequestBody): Call<LoginResponse>

    @GET("com.korail.mobile.seatMovie.ScheduleView")
    fun searchTrain(@QueryMap paramsMap: Map<String, String>): Call<ScheduleViewResponse>

    @GET("com.korail.mobile.certification.TicketReservation")
    fun reserveTicket(@QueryMap paramsMap: Map<String, String>): Call<TicketReservationResponse>
}