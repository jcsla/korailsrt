package entity.dto.response

open class Response(
    @Transient open val h_msg_cd: String,
    @Transient open val strResult: String,
    @Transient open val h_msg_txt: String
)