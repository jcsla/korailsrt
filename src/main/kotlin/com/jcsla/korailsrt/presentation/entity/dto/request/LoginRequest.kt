package com.jcsla.korailsrt.presentation.entity.dto.request

import okhttp3.MultipartBody

data class LoginRequest(
    override var Key: String = "korail01234567890",
    override var Device: String = "AD",
    override var Version: String = "150718001",
    val txtInputFlg: String = "2",
    val txtMemberNo: String,
    val txtPwd: String) : Request {

    constructor(memberNo: String, pwd: String) : this(txtMemberNo = memberNo, txtPwd = pwd)

    override fun getRequestBody(): MultipartBody {
        return MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart(::Key.name, Key)
            .addFormDataPart(::Device.name, Device)
            .addFormDataPart(::Version.name, Version)
            .addFormDataPart(::txtInputFlg.name, "2")
            .addFormDataPart(::txtMemberNo.name, txtMemberNo)
            .addFormDataPart(::txtPwd.name, txtPwd)
            .build()
    }
}