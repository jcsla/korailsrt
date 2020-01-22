package entity.dto.response

data class LoginResponse(
    override val h_msg_cd: String,
    override val h_msg_txt: String,
    override val strResult: String,
    val Key: String,
    val strDiscCouponFlg: String,
    val encryptMbCrdNo: String,
    val encryptCustNo: String,
    val strPrsCnqeMsgCd: String,
    val strCustMgSrtCd: String,
    val strDiscCrdReisuFlg: String,
    val strCustSrtCd: String,
    val strGoffStnNm: String,
    val strHdcpFlg: String,
    val strBtdt: String,
    val strEvtTgtFlg: String,
    val strEmailAdr: String,
    val strSexDvCd: String,
    val strCustLeadFlgNm: String,
    val strAthnFlg: String,
    val strMbCrdNo: String,
    val strLognTpCd1: String,
    val strCustLeadFlg: String,
    val strAthnFlg2: String,
    val strSubtDcsClCd: String,
    val strAbrdStnCd: String,
    val strCpNo: String,
    val strCustNo: String,
    val strCustDvCd: String,
    val strLognTpCd2: String,
    val strCustNm: String,
    val strCustClCd: String,
    val strHdcpTpCd: String,
    val strYouthAgrFlg: String,
    val strHdcpTpCdNm: String,
    val strAbrdStnNm: String,
    val strGoffStnCd: String
) : Response(h_msg_cd, strResult, h_msg_txt)