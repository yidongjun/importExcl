package com.example.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Byte value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Byte value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Byte value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Byte value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Byte value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Byte> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Byte> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Byte value1, Byte value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdIsNull() {
            addCriterion("category_one_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdIsNotNull() {
            addCriterion("category_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdEqualTo(Long value) {
            addCriterion("category_one_id =", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdNotEqualTo(Long value) {
            addCriterion("category_one_id <>", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdGreaterThan(Long value) {
            addCriterion("category_one_id >", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_one_id >=", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdLessThan(Long value) {
            addCriterion("category_one_id <", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdLessThanOrEqualTo(Long value) {
            addCriterion("category_one_id <=", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdIn(List<Long> values) {
            addCriterion("category_one_id in", values, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdNotIn(List<Long> values) {
            addCriterion("category_one_id not in", values, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdBetween(Long value1, Long value2) {
            addCriterion("category_one_id between", value1, value2, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdNotBetween(Long value1, Long value2) {
            addCriterion("category_one_id not between", value1, value2, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIsNull() {
            addCriterion("category_two_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIsNotNull() {
            addCriterion("category_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdEqualTo(Long value) {
            addCriterion("category_two_id =", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotEqualTo(Long value) {
            addCriterion("category_two_id <>", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdGreaterThan(Long value) {
            addCriterion("category_two_id >", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_two_id >=", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLessThan(Long value) {
            addCriterion("category_two_id <", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLessThanOrEqualTo(Long value) {
            addCriterion("category_two_id <=", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIn(List<Long> values) {
            addCriterion("category_two_id in", values, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotIn(List<Long> values) {
            addCriterion("category_two_id not in", values, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdBetween(Long value1, Long value2) {
            addCriterion("category_two_id between", value1, value2, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotBetween(Long value1, Long value2) {
            addCriterion("category_two_id not between", value1, value2, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdIsNull() {
            addCriterion("category_three_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdIsNotNull() {
            addCriterion("category_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdEqualTo(Long value) {
            addCriterion("category_three_id =", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdNotEqualTo(Long value) {
            addCriterion("category_three_id <>", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdGreaterThan(Long value) {
            addCriterion("category_three_id >", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_three_id >=", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdLessThan(Long value) {
            addCriterion("category_three_id <", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdLessThanOrEqualTo(Long value) {
            addCriterion("category_three_id <=", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdIn(List<Long> values) {
            addCriterion("category_three_id in", values, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdNotIn(List<Long> values) {
            addCriterion("category_three_id not in", values, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdBetween(Long value1, Long value2) {
            addCriterion("category_three_id between", value1, value2, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdNotBetween(Long value1, Long value2) {
            addCriterion("category_three_id not between", value1, value2, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIsNull() {
            addCriterion("last_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIsNotNull() {
            addCriterion("last_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserEqualTo(Long value) {
            addCriterion("last_modify_user =", value, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserNotEqualTo(Long value) {
            addCriterion("last_modify_user <>", value, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserGreaterThan(Long value) {
            addCriterion("last_modify_user >", value, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserGreaterThanOrEqualTo(Long value) {
            addCriterion("last_modify_user >=", value, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserLessThan(Long value) {
            addCriterion("last_modify_user <", value, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserLessThanOrEqualTo(Long value) {
            addCriterion("last_modify_user <=", value, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIn(List<Long> values) {
            addCriterion("last_modify_user in", values, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserNotIn(List<Long> values) {
            addCriterion("last_modify_user not in", values, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserBetween(Long value1, Long value2) {
            addCriterion("last_modify_user between", value1, value2, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserNotBetween(Long value1, Long value2) {
            addCriterion("last_modify_user not between", value1, value2, "lastModifyUser");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Long value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Long value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Long value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Long value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Long value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Long value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Long> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Long> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Long value1, Long value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Long value1, Long value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}