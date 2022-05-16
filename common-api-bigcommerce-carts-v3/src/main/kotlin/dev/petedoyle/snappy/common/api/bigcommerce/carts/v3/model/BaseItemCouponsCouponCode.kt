/**
 * Carts
 *
 * Create a cart using BigCommerce cart logic.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The coupon code
 *
 * @param id Coupon Id
 * @param code The coupon code. Required in a /POST request.
 * @param name Name given to the coupon in the Control Panel
 * @param discountType The discount type.  - type 0: per_item_discount - type 1: percentage_discount - type 2: per_total_discount - type 3: shipping_discount - type 4: free_shipping
 * @param discountAmount The amount of the discount based on the coupon. For example, 3 percent off will show a 3.
 * @param expiresDate Returns 0 if a expiration date is not set
 * @param totalDiscount Total discount amount off cart
 */
@JsonClass(generateAdapter = true)
data class BaseItemCouponsCouponCode (

    /* Coupon Id */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The coupon code. Required in a /POST request. */
    @Json(name = "code")
    val code: kotlin.String? = null,

    /* Name given to the coupon in the Control Panel */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The discount type.  - type 0: per_item_discount - type 1: percentage_discount - type 2: per_total_discount - type 3: shipping_discount - type 4: free_shipping */
    @Json(name = "discountType")
    val discountType: kotlin.Int? = null,

    /* The amount of the discount based on the coupon. For example, 3 percent off will show a 3. */
    @Json(name = "discountAmount")
    val discountAmount: kotlin.Int? = null,

    /* Returns 0 if a expiration date is not set */
    @Json(name = "expiresDate")
    val expiresDate: kotlin.Int? = null,

    /* Total discount amount off cart */
    @Json(name = "totalDiscount")
    val totalDiscount: java.math.BigDecimal? = null

)
