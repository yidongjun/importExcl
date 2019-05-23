package com.example.services;

import java.io.Serializable;
import java.util.Date;

/**
 * item
 * @author 
 */
public class Item implements Serializable {
    private Long id;

    /**
     * 所属店铺ID . fk shop.id
     */
    private Long shopId;

    /**
     * 商品类型 .
0 . 简单类型，比如：书
1 . 多规格类型：比如：衣服
参考 : https://learnwoo.com/woocommerce-different-product-types/
     */
    private Integer itemType;

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 一级分类 . fk item_category.id
     */
    private Long categoryOneId;

    /**
     * 二级分类 . fk item_category.id
     */
    private Long categoryTwoId;

    /**
     * 三级分类 . fk item_category.id
     */
    private Long categoryThreeId;

    private Date createTime;

    private Long createUser;

    private Date lastModifyTime;

    private Long lastModifyUser;

    private Long isDeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getCategoryOneId() {
        return categoryOneId;
    }

    public void setCategoryOneId(Long categoryOneId) {
        this.categoryOneId = categoryOneId;
    }

    public Long getCategoryTwoId() {
        return categoryTwoId;
    }

    public void setCategoryTwoId(Long categoryTwoId) {
        this.categoryTwoId = categoryTwoId;
    }

    public Long getCategoryThreeId() {
        return categoryThreeId;
    }

    public void setCategoryThreeId(Long categoryThreeId) {
        this.categoryThreeId = categoryThreeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Long getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(Long lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public Long getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Long isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getItemType() == null ? other.getItemType() == null : this.getItemType().equals(other.getItemType()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getCategoryOneId() == null ? other.getCategoryOneId() == null : this.getCategoryOneId().equals(other.getCategoryOneId()))
            && (this.getCategoryTwoId() == null ? other.getCategoryTwoId() == null : this.getCategoryTwoId().equals(other.getCategoryTwoId()))
            && (this.getCategoryThreeId() == null ? other.getCategoryThreeId() == null : this.getCategoryThreeId().equals(other.getCategoryThreeId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getLastModifyTime() == null ? other.getLastModifyTime() == null : this.getLastModifyTime().equals(other.getLastModifyTime()))
            && (this.getLastModifyUser() == null ? other.getLastModifyUser() == null : this.getLastModifyUser().equals(other.getLastModifyUser()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getItemType() == null) ? 0 : getItemType().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getCategoryOneId() == null) ? 0 : getCategoryOneId().hashCode());
        result = prime * result + ((getCategoryTwoId() == null) ? 0 : getCategoryTwoId().hashCode());
        result = prime * result + ((getCategoryThreeId() == null) ? 0 : getCategoryThreeId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getLastModifyTime() == null) ? 0 : getLastModifyTime().hashCode());
        result = prime * result + ((getLastModifyUser() == null) ? 0 : getLastModifyUser().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemName=").append(itemName);
        sb.append(", categoryOneId=").append(categoryOneId);
        sb.append(", categoryTwoId=").append(categoryTwoId);
        sb.append(", categoryThreeId=").append(categoryThreeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyUser=").append(lastModifyUser);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}