package com.jcsla.korailsrt

import com.jcsla.korailsrt.di.DaggerComponent
import com.jcsla.korailsrt.entity.dto.request.LoginRequest
import com.jcsla.korailsrt.entity.dto.request.ScheduleViewRequest
import com.jcsla.korailsrt.entity.dto.request.TicketReservationRequest
import com.jcsla.korailsrt.entity.dto.response.LoginResponse
import com.jcsla.korailsrt.entity.dto.response.ScheduleViewResponse
import com.jcsla.korailsrt.entity.dto.response.TicketReservationResponse
import com.jcsla.korailsrt.entity.dto.response.Train

object Korail {

    private val appComponent = lazy {
        val appComponent = DaggerComponent.builder().build()
        appComponent
    }

    private val api = lazy {
        appComponent.value.korailApi()
    }

    fun login(id: String, pwd: String): LoginResponse? {
        return api.value.login(
            LoginRequest(
                id,
                pwd
            ).getRequestBody()).execute().body()
    }

    fun searchTrain(date: String, time: String, trainType: String, adultCount: String): ScheduleViewResponse? {
        return api.value.searchTrain(
            ScheduleViewRequest(
                date,
                time,
                trainType,
                adultCount
            ).getRequestBody()).execute().body()
    }

    fun reserveTicket(train: Train): TicketReservationResponse? {
        return api.value.reserveTicket(
            TicketReservationRequest(
                train
            ).getRequestBody()).execute().body()
    }
}