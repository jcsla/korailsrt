package entity.dto.request

interface Request {

    var Device: String
    var Version: String
    var Key: String

    fun getRequestBody(): Any
}