package com.qianfeng.openapi.order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponDetailExample() {
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

        public Criteria andRfCodeIsNull() {
            addCriterion("rf_code is null");
            return (Criteria) this;
        }

        public Criteria andRfCodeIsNotNull() {
            addCriterion("rf_code is not null");
            return (Criteria) this;
        }

        public Criteria andRfCodeEqualTo(String value) {
            addCriterion("rf_code =", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeNotEqualTo(String value) {
            addCriterion("rf_code <>", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeGreaterThan(String value) {
            addCriterion("rf_code >", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rf_code >=", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeLessThan(String value) {
            addCriterion("rf_code <", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeLessThanOrEqualTo(String value) {
            addCriterion("rf_code <=", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeLike(String value) {
            addCriterion("rf_code like", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeNotLike(String value) {
            addCriterion("rf_code not like", value, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeIn(List<String> values) {
            addCriterion("rf_code in", values, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeNotIn(List<String> values) {
            addCriterion("rf_code not in", values, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeBetween(String value1, String value2) {
            addCriterion("rf_code between", value1, value2, "rfCode");
            return (Criteria) this;
        }

        public Criteria andRfCodeNotBetween(String value1, String value2) {
            addCriterion("rf_code not between", value1, value2, "rfCode");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Long value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Long value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Long value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Long value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Long value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Long> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Long> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Long value1, Long value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Long value1, Long value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(Long value) {
            addCriterion("coupon_price =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(Long value) {
            addCriterion("coupon_price <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(Long value) {
            addCriterion("coupon_price >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_price >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(Long value) {
            addCriterion("coupon_price <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(Long value) {
            addCriterion("coupon_price <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<Long> values) {
            addCriterion("coupon_price in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<Long> values) {
            addCriterion("coupon_price not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(Long value1, Long value2) {
            addCriterion("coupon_price between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(Long value1, Long value2) {
            addCriterion("coupon_price not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("use_date is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("use_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(Date value) {
            addCriterion("use_date =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(Date value) {
            addCriterion("use_date <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(Date value) {
            addCriterion("use_date >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("use_date >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(Date value) {
            addCriterion("use_date <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(Date value) {
            addCriterion("use_date <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<Date> values) {
            addCriterion("use_date in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<Date> values) {
            addCriterion("use_date not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(Date value1, Date value2) {
            addCriterion("use_date between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(Date value1, Date value2) {
            addCriterion("use_date not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andOperateUserIsNull() {
            addCriterion("operate_user is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIsNotNull() {
            addCriterion("operate_user is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserEqualTo(String value) {
            addCriterion("operate_user =", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotEqualTo(String value) {
            addCriterion("operate_user <>", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserGreaterThan(String value) {
            addCriterion("operate_user >", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserGreaterThanOrEqualTo(String value) {
            addCriterion("operate_user >=", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserLessThan(String value) {
            addCriterion("operate_user <", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserLessThanOrEqualTo(String value) {
            addCriterion("operate_user <=", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserLike(String value) {
            addCriterion("operate_user like", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotLike(String value) {
            addCriterion("operate_user not like", value, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserIn(List<String> values) {
            addCriterion("operate_user in", values, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotIn(List<String> values) {
            addCriterion("operate_user not in", values, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserBetween(String value1, String value2) {
            addCriterion("operate_user between", value1, value2, "operateUser");
            return (Criteria) this;
        }

        public Criteria andOperateUserNotBetween(String value1, String value2) {
            addCriterion("operate_user not between", value1, value2, "operateUser");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("yn is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("yn is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(Long value) {
            addCriterion("yn =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(Long value) {
            addCriterion("yn <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(Long value) {
            addCriterion("yn >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Long value) {
            addCriterion("yn >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(Long value) {
            addCriterion("yn <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(Long value) {
            addCriterion("yn <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<Long> values) {
            addCriterion("yn in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<Long> values) {
            addCriterion("yn not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(Long value1, Long value2) {
            addCriterion("yn between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(Long value1, Long value2) {
            addCriterion("yn not between", value1, value2, "yn");
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