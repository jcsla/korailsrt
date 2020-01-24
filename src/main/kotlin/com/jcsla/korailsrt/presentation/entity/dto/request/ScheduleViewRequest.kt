package com.jcsla.korailsrt.presentation.entity.dto.request

data class ScheduleViewRequest(
    override var Device: String = "AD",
    override var Version: String = "190617001",
    override var Key: String = "korail01234567890",
    val radJobId: String = "1",
    val selGoTrain: String,
    val txtCardPsgCnt: String = "0",
    val txtGdNo: String = "",
    val txtGoAbrdDt: String,
    val txtGoEnd: String,
    val txtGoHour: String,
    val txtGoStart: String,
    val txtJobDv: String = "",
    val txtMenuId: String = "11",
    val txtPsgFlg_1: String,
    val txtPsgFlg_2: String = "0",
    val txtPsgFlg_3: String = "0",
    val txtPsgFlg_4: String = "0",
    val txtPsgFlg_5: String = "0",
    val txtSeatAttCd_2: String = "000",
    val txtSeatAttCd_3: String = "000",
    val txtSeatAttCd_4: String = "015",
    val txtTrnGpCd: String
) : Request {

    constructor(date: String, time: String, trainType: String, adultCount: String) : this(
        selGoTrain = trainType,
        txtGoAbrdDt = date,
        txtGoHour = time,
        txtGoStart = "서울",
        txtGoEnd = "부산",
        txtPsgFlg_1 = adultCount,
        txtTrnGpCd = trainType
    )

    override fun getRequestBody(): Map<String, String> {
        return mapOf(
            ::Key.name to Key,
            ::Device.name to Device,
            ::Version.name to Version,
            ::radJobId.name to radJobId,
            ::selGoTrain.name to selGoTrain,
            ::txtCardPsgCnt.name to txtCardPsgCnt,
            ::txtGdNo.name to txtGdNo,
            ::txtGoAbrdDt.name to txtGoAbrdDt,
            ::txtGoEnd.name to txtGoEnd,
            ::txtGoHour.name to txtGoHour,
            ::txtGoStart.name to txtGoStart,
            ::txtJobDv.name to txtJobDv,
            ::txtMenuId.name to txtMenuId,
            ::txtPsgFlg_1.name to txtPsgFlg_1,
            ::txtPsgFlg_2.name to txtPsgFlg_2,
            ::txtPsgFlg_3.name to txtPsgFlg_3,
            ::txtPsgFlg_4.name to txtPsgFlg_4,
            ::txtPsgFlg_5.name to txtPsgFlg_5,
            ::txtSeatAttCd_2.name to txtSeatAttCd_2,
            ::txtSeatAttCd_3.name to txtSeatAttCd_3,
            ::txtSeatAttCd_4.name to txtSeatAttCd_4,
            ::txtTrnGpCd.name to txtTrnGpCd
        )
    }
}