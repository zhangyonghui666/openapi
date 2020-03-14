package com.qianfeng.openapi.order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PopOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PopOrderItemExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdIsNull() {
            addCriterion("vender_id is null");
            return (Criteria) this;
        }

        public Criteria andVenderIdIsNotNull() {
            addCriterion("vender_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenderIdEqualTo(Long value) {
            addCriterion("vender_id =", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdNotEqualTo(Long value) {
            addCriterion("vender_id <>", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdGreaterThan(Long value) {
            addCriterion("vender_id >", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vender_id >=", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdLessThan(Long value) {
            addCriterion("vender_id <", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdLessThanOrEqualTo(Long value) {
            addCriterion("vender_id <=", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdIn(List<Long> values) {
            addCriterion("vender_id in", values, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdNotIn(List<Long> values) {
            addCriterion("vender_id not in", values, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdBetween(Long value1, Long value2) {
            addCriterion("vender_id between", value1, value2, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdNotBetween(Long value1, Long value2) {
            addCriterion("vender_id not between", value1, value2, "venderId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNull() {
            addCriterion("warranty is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNotNull() {
            addCriterion("warranty is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(String value) {
            addCriterion("warranty =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(String value) {
            addCriterion("warranty <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(String value) {
            addCriterion("warranty >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(String value) {
            addCriterion("warranty >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(String value) {
            addCriterion("warranty <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(String value) {
            addCriterion("warranty <=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLike(String value) {
            addCriterion("warranty like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotLike(String value) {
            addCriterion("warranty not like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyIn(List<String> values) {
            addCriterion("warranty in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<String> values) {
            addCriterion("warranty not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(String value1, String value2) {
            addCriterion("warranty between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(String value1, String value2) {
            addCriterion("warranty not between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNull() {
            addCriterion("give_point is null");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNotNull() {
            addCriterion("give_point is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointEqualTo(Long value) {
            addCriterion("give_point =", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotEqualTo(Long value) {
            addCriterion("give_point <>", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThan(Long value) {
            addCriterion("give_point >", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThanOrEqualTo(Long value) {
            addCriterion("give_point >=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThan(Long value) {
            addCriterion("give_point <", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThanOrEqualTo(Long value) {
            addCriterion("give_point <=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIn(List<Long> values) {
            addCriterion("give_point in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotIn(List<Long> values) {
            addCriterion("give_point not in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointBetween(Long value1, Long value2) {
            addCriterion("give_point between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotBetween(Long value1, Long value2) {
            addCriterion("give_point not between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andWareIdIsNull() {
            addCriterion("ware_id is null");
            return (Criteria) this;
        }

        public Criteria andWareIdIsNotNull() {
            addCriterion("ware_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareIdEqualTo(Long value) {
            addCriterion("ware_id =", value, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdNotEqualTo(Long value) {
            addCriterion("ware_id <>", value, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdGreaterThan(Long value) {
            addCriterion("ware_id >", value, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ware_id >=", value, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdLessThan(Long value) {
            addCriterion("ware_id <", value, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdLessThanOrEqualTo(Long value) {
            addCriterion("ware_id <=", value, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdIn(List<Long> values) {
            addCriterion("ware_id in", values, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdNotIn(List<Long> values) {
            addCriterion("ware_id not in", values, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdBetween(Long value1, Long value2) {
            addCriterion("ware_id between", value1, value2, "wareId");
            return (Criteria) this;
        }

        public Criteria andWareIdNotBetween(Long value1, Long value2) {
            addCriterion("ware_id not between", value1, value2, "wareId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNull() {
            addCriterion("outer_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNotNull() {
            addCriterion("outer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterIdEqualTo(String value) {
            addCriterion("outer_id =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(String value) {
            addCriterion("outer_id <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(String value) {
            addCriterion("outer_id >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_id >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(String value) {
            addCriterion("outer_id <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(String value) {
            addCriterion("outer_id <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLike(String value) {
            addCriterion("outer_id like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotLike(String value) {
            addCriterion("outer_id not like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<String> values) {
            addCriterion("outer_id in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<String> values) {
            addCriterion("outer_id not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(String value1, String value2) {
            addCriterion("outer_id between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(String value1, String value2) {
            addCriterion("outer_id not between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNull() {
            addCriterion("item_num is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("item_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(String value) {
            addCriterion("item_num =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(String value) {
            addCriterion("item_num <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(String value) {
            addCriterion("item_num >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(String value) {
            addCriterion("item_num >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(String value) {
            addCriterion("item_num <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(String value) {
            addCriterion("item_num <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLike(String value) {
            addCriterion("item_num like", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotLike(String value) {
            addCriterion("item_num not like", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<String> values) {
            addCriterion("item_num in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<String> values) {
            addCriterion("item_num not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(String value1, String value2) {
            addCriterion("item_num between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(String value1, String value2) {
            addCriterion("item_num not between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemExtIsNull() {
            addCriterion("item_ext is null");
            return (Criteria) this;
        }

        public Criteria andItemExtIsNotNull() {
            addCriterion("item_ext is not null");
            return (Criteria) this;
        }

        public Criteria andItemExtEqualTo(String value) {
            addCriterion("item_ext =", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtNotEqualTo(String value) {
            addCriterion("item_ext <>", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtGreaterThan(String value) {
            addCriterion("item_ext >", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtGreaterThanOrEqualTo(String value) {
            addCriterion("item_ext >=", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtLessThan(String value) {
            addCriterion("item_ext <", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtLessThanOrEqualTo(String value) {
            addCriterion("item_ext <=", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtLike(String value) {
            addCriterion("item_ext like", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtNotLike(String value) {
            addCriterion("item_ext not like", value, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtIn(List<String> values) {
            addCriterion("item_ext in", values, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtNotIn(List<String> values) {
            addCriterion("item_ext not in", values, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtBetween(String value1, String value2) {
            addCriterion("item_ext between", value1, value2, "itemExt");
            return (Criteria) this;
        }

        public Criteria andItemExtNotBetween(String value1, String value2) {
            addCriterion("item_ext not between", value1, value2, "itemExt");
            return (Criteria) this;
        }
    }

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