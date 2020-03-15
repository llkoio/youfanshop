package com.youfan.model;

/**
 * product name
 */
public class ProductType {
    private int id;
    private String productTypeName;
    private String productTypeDescription;
    private String productTypeGrade; // category，1，2，3，1 is the biggest one
    private Integer productTypeParentId; // if the category is 1,parentid id is -1

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getProductTypeDescription() {
        return productTypeDescription;
    }

    public void setProductTypeDescription(String productTypeDescription) {
        this.productTypeDescription = productTypeDescription;
    }

    public String getProductTypeGrade() {
        return productTypeGrade;
    }

    public void setProductTypeGrade(String productTypeGrade) {
        this.productTypeGrade = productTypeGrade;
    }

    public Integer getProductTypeParentId() {
        return productTypeParentId;
    }

    public void setProductTypeParentId(Integer productTypeParentId) {
        this.productTypeParentId = productTypeParentId;
    }
}
