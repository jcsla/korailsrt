package presentation

import entity.dto.request.LoginRequest
import entity.dto.request.ScheduleViewRequest
import entity.dto.request.TicketReservationRequest
import entity.dto.response.LoginResponse
import entity.dto.response.ScheduleViewResponse
import entity.dto.response.TicketReservationResponse
import entity.dto.response.Train
import presentation.di.DaggerAppComponent

object Korail {

    private val appComponent = lazy {
        val appComponent = DaggerAppComponent.builder().build()
        appComponent
    }

    private val api =  lazy {
        appComponent.value.korailApi()
    }

    fun login(id: String, pwd: String): LoginResponse? {
        return api.value.login(LoginRequest(id, pwd).getRequestBody()).execute().body()
    }

    fun searchTrain(date: String, time: String, trainType: String, adultCount: String): ScheduleViewResponse? {
        return api.value.searchTrain(ScheduleViewRequest(date, time, trainType, adultCount).getRequestBody()).execute().body()
    }

    fun reserveTicket(train: Train): TicketReservationResponse? {
        return api.value.reserveTicket(TicketReservationRequest(train).getRequestBody()).execute().body()
    }
}