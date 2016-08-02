package com.penguin.padang.pasir.nyaripasar.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jowy on 7/1/16.
 */
public class Product {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("product_name")
    @Expose
    private String productName;

    @SerializedName("product_line_id")
    @Expose
    private Integer productLineId;

    @SerializedName("product_scale")
    @Expose
    private String productScale;

    @SerializedName("product_vendor")
    @Expose
    private String productVendor;

    @SerializedName("product_description")
    @Expose
    private String productDescription;

    @SerializedName("quantity_in_stock")
    @Expose
    private Float quantityInStock;

    @SerializedName("price")
    @Expose
    private Float price;

    @SerializedName("msrp")
    @Expose
    private Float msrp;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName The product_name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return The productLineId
     */
    public Integer getProductLineId() {
        return productLineId;
    }

    /**
     * @param productLineId The product_line_id
     */
    public void setProductLineId(String productLineId) {
        this.productLineId = Integer.parseInt(productLineId);
    }

    /**
     * @return The productScale
     */
    public String getProductScale() {
        return productScale;
    }

    /**
     * @param productScale The product_scale
     */
    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    /**
     * @return The productVendor
     */
    public String getProductVendor() {
        return productVendor;
    }

    /**
     * @param productVendor The product_vendor
     */
    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    /**
     * @return The productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * @param productDescription The product_description
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * @return The quantityInStock
     */
    public Float getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * @param quantityInStock The quantity_in_stock
     */
    public void setQuantityInStock(String quantityInStock) {
        this.quantityInStock = Float.parseFloat(quantityInStock);
    }

    /**
     * @return The price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(String price) {
        this.price = Float.parseFloat(price);
    }

    /**
     * @return The msrp
     */
    public Float getMsrp() {
        return msrp;
    }

    /**
     * @param msrp The msrp
     */
    public void setMsrp(String msrp) {
        this.msrp = Float.parseFloat(msrp);
    }

    /**
     *
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
