package com.qianfeng.openapi.warehouse.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseProductExample() {
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

        public Criteria andWpIdIsNull() {
            addCriterion("wp_id is null");
            return (Criteria) this;
        }

        public Criteria andWpIdIsNotNull() {
            addCriterion("wp_id is not null");
            return (Criteria) this;
        }

        public Criteria andWpIdEqualTo(Integer value) {
            addCriterion("wp_id =", value, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdNotEqualTo(Integer value) {
            addCriterion("wp_id <>", value, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdGreaterThan(Integer value) {
            addCriterion("wp_id >", value, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wp_id >=", value, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdLessThan(Integer value) {
            addCriterion("wp_id <", value, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdLessThanOrEqualTo(Integer value) {
            addCriterion("wp_id <=", value, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdIn(List<Integer> values) {
            addCriterion("wp_id in", values, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdNotIn(List<Integer> values) {
            addCriterion("wp_id not in", values, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdBetween(Integer value1, Integer value2) {
            addCriterion("wp_id between", value1, value2, "wpId");
            return (Criteria) this;
        }

        public Criteria andWpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wp_id not between", value1, value2, "wpId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andWIdIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Short value) {
            addCriterion("w_id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Short value) {
            addCriterion("w_id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Short value) {
            addCriterion("w_id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Short value) {
            addCriterion("w_id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Short value) {
            addCriterion("w_id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Short value) {
            addCriterion("w_id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Short> values) {
            addCriterion("w_id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Short> values) {
            addCriterion("w_id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Short value1, Short value2) {
            addCriterion("w_id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Short value1, Short value2) {
            addCriterion("w_id not between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andCurrentCntIsNull() {
            addCriterion("current_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCntIsNotNull() {
            addCriterion("current_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCntEqualTo(Integer value) {
            addCriterion("current_cnt =", value, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntNotEqualTo(Integer value) {
            addCriterion("current_cnt <>", value, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntGreaterThan(Integer value) {
            addCriterion("current_cnt >", value, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_cnt >=", value, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntLessThan(Integer value) {
            addCriterion("current_cnt <", value, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntLessThanOrEqualTo(Integer value) {
            addCriterion("current_cnt <=", value, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntIn(List<Integer> values) {
            addCriterion("current_cnt in", values, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntNotIn(List<Integer> values) {
            addCriterion("current_cnt not in", values, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntBetween(Integer value1, Integer value2) {
            addCriterion("current_cnt between", value1, value2, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andCurrentCntNotBetween(Integer value1, Integer value2) {
            addCriterion("current_cnt not between", value1, value2, "currentCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntIsNull() {
            addCriterion("lock_cnt is null");
            return (Criteria) this;
        }

        public Criteria andLockCntIsNotNull() {
            addCriterion("lock_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andLockCntEqualTo(Integer value) {
            addCriterion("lock_cnt =", value, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntNotEqualTo(Integer value) {
            addCriterion("lock_cnt <>", value, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntGreaterThan(Integer value) {
            addCriterion("lock_cnt >", value, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_cnt >=", value, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntLessThan(Integer value) {
            addCriterion("lock_cnt <", value, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntLessThanOrEqualTo(Integer value) {
            addCriterion("lock_cnt <=", value, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntIn(List<Integer> values) {
            addCriterion("lock_cnt in", values, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntNotIn(List<Integer> values) {
            addCriterion("lock_cnt not in", values, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntBetween(Integer value1, Integer value2) {
            addCriterion("lock_cnt between", value1, value2, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andLockCntNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_cnt not between", value1, value2, "lockCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntIsNull() {
            addCriterion("in_transit_cnt is null");
            return (Criteria) this;
        }

        public Criteria andInTransitCntIsNotNull() {
            addCriterion("in_transit_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andInTransitCntEqualTo(Integer value) {
            addCriterion("in_transit_cnt =", value, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntNotEqualTo(Integer value) {
            addCriterion("in_transit_cnt <>", value, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntGreaterThan(Integer value) {
            addCriterion("in_transit_cnt >", value, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_transit_cnt >=", value, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntLessThan(Integer value) {
            addCriterion("in_transit_cnt <", value, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntLessThanOrEqualTo(Integer value) {
            addCriterion("in_transit_cnt <=", value, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntIn(List<Integer> values) {
            addCriterion("in_transit_cnt in", values, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntNotIn(List<Integer> values) {
            addCriterion("in_transit_cnt not in", values, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntBetween(Integer value1, Integer value2) {
            addCriterion("in_transit_cnt between", value1, value2, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andInTransitCntNotBetween(Integer value1, Integer value2) {
            addCriterion("in_transit_cnt not between", value1, value2, "inTransitCnt");
            return (Criteria) this;
        }

        public Criteria andAverageCostIsNull() {
            addCriterion("average_cost is null");
            return (Criteria) this;
        }

        public Criteria andAverageCostIsNotNull() {
            addCriterion("average_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAverageCostEqualTo(BigDecimal value) {
            addCriterion("average_cost =", value, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostNotEqualTo(BigDecimal value) {
            addCriterion("average_cost <>", value, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostGreaterThan(BigDecimal value) {
            addCriterion("average_cost >", value, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("average_cost >=", value, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostLessThan(BigDecimal value) {
            addCriterion("average_cost <", value, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("average_cost <=", value, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostIn(List<BigDecimal> values) {
            addCriterion("average_cost in", values, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostNotIn(List<BigDecimal> values) {
            addCriterion("average_cost not in", values, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_cost between", value1, value2, "averageCost");
            return (Criteria) this;
        }

        public Criteria andAverageCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_cost not between", value1, value2, "averageCost");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
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