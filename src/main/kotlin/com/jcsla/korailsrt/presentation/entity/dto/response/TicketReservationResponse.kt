package com.jcsla.korailsrt.presentation.entity.dto.response

data class TicketReservationResponse(
    override val h_msg_cd: String,
    override val h_msg_txt: String,
    override val strResult: String,
    val strJobId: String,
    val h_menu_id: String,
    val h_gd_no: String,
    val h_seat_cnt_first: String,
    val h_seat_cnt_second: String,
    val h_next_pg_flg: String,
    val txtGoHour_first: String,
    val h_rslt_cnt: String,
    val h_agree_txt: String,
    val trn_infos: TrainInfos,
    val h_notice_msg: String
) : Response(h_msg_cd, strResult, h_msg_txt)