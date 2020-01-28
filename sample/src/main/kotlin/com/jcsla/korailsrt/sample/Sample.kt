package com.jcsla.korailsrt.sample

import com.jcsla.korailsrt.Korail
import com.jcsla.korailsrt.entity.TrainType

fun main(args: Array<String>) {

    Korail.login("enter your id", "enter your password")
    val searchTrainResult = Korail.searchTrain("20200128", "192500", TrainType.ALL.value, "1")
    if (searchTrainResult != null) {
        Korail.reserveTicket(searchTrainResult.trn_infos.trn_info.first())
    }
}