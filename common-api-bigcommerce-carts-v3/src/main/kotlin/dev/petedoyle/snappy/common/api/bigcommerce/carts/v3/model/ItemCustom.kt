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
 * Add a custom item to the shoppers cart.  * Custom items are not added to the catalog. * The price should be set to match the store settings for taxes.
 *
 * @param id Id of the custom item
 * @param sku Custom item sku
 * @param name Item name
 * @param quantity 
 * @param listPrice Price of the item. With or without tax, depending on your store's setup. Optional price override.
 */
@JsonClass(generateAdapter = true)
data class ItemCustom (

    /* Id of the custom item */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Custom item sku */
    @Json(name = "sku")
    val sku: kotlin.String? = null,

    /* Item name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "quantity")
    val quantity: kotlin.String? = null,

    /* Price of the item. With or without tax, depending on your store's setup. Optional price override. */
    @Json(name = "list_price")
    val listPrice: kotlin.String? = null

)
