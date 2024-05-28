package jp.co.rakuten.ticket.checkinstation.api.requestBody

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class RefreshOrder2Body(
        @Json(name = "order_no") val orderNo: String,
        val tel: String
)
