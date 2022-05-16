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

import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.AppliedCoupon
import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.AppliedDiscount
import dev.petedoyle.snappy.common.api.bigcommerce.carts.v3.model.Currency1

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A cart contains a collection of items, prices, discounts, etc.. It does not contain customer-related data.
 *
 * @param id Cart ID, provided after creating a cart with a POST.
 * @param parentId Bundled items will have their parent's item Id.
 * @param customerId ID of the customer to which the cart belongs.
 * @param email The cart's email. This is the same email that is used in the billing address
 * @param currency 
 * @param taxIncluded 
 * @param baseAmount Sum of cart line-item amounts before cart-level discounts, coupons, or taxes.
 * @param discountAmount Discounted amount.
 * @param cartAmount Sum of cart line-item amounts minus cart-level discounts and coupons. This amount includes taxes (where applicable).
 * @param coupons 
 * @param discounts 
 * @param lineItems 
 * @param createdTime Time when the cart was created.
 * @param updatedTime Time when the cart was last updated.
 * @param channelId If no channel is specified, defaults to 1. 
 * @param locale Locale of the cart.
 */
@JsonClass(generateAdapter = true)
data class CartFull (

    /* Cart ID, provided after creating a cart with a POST. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Bundled items will have their parent's item Id. */
    @Json(name = "parent_id")
    val parentId: kotlin.String? = null,

    /* ID of the customer to which the cart belongs. */
    @Json(name = "customer_id")
    val customerId: kotlin.Int? = null,

    /* The cart's email. This is the same email that is used in the billing address */
    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "currency")
    val currency: Currency1? = null,

    @Json(name = "tax_included")
    val taxIncluded: kotlin.Boolean? = null,

    /* Sum of cart line-item amounts before cart-level discounts, coupons, or taxes. */
    @Json(name = "base_amount")
    val baseAmount: java.math.BigDecimal? = null,

    /* Discounted amount. */
    @Json(name = "discount_amount")
    val discountAmount: java.math.BigDecimal? = null,

    /* Sum of cart line-item amounts minus cart-level discounts and coupons. This amount includes taxes (where applicable). */
    @Json(name = "cart_amount")
    val cartAmount: java.math.BigDecimal? = null,

    @Json(name = "coupons")
    val coupons: kotlin.collections.List<AppliedCoupon>? = null,

    @Json(name = "discounts")
    val discounts: kotlin.collections.List<AppliedDiscount>? = null,

    @Json(name = "line_items")
    val lineItems: kotlin.Any? = null,

    /* Time when the cart was created. */
    @Json(name = "created_time")
    val createdTime: kotlin.String? = null,

    /* Time when the cart was last updated. */
    @Json(name = "updated_time")
    val updatedTime: kotlin.String? = null,

    /* If no channel is specified, defaults to 1.  */
    @Json(name = "channel_id")
    val channelId: kotlin.Int? = null,

    /* Locale of the cart. */
    @Json(name = "locale")
    val locale: kotlin.String? = null

)
