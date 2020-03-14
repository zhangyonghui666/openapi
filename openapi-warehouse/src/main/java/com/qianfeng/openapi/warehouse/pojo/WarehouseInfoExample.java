package com.qianfeng.openapi.warehouse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseInfoExample() {
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

        public Criteria andWarehouseSnIsNull() {
            addCriterion("warehouse_sn is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnIsNotNull() {
            addCriterion("warehouse_sn is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnEqualTo(String value) {
            addCriterion("warehouse_sn =", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnNotEqualTo(String value) {
            addCriterion("warehouse_sn <>", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnGreaterThan(String value) {
            addCriterion("warehouse_sn >", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_sn >=", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnLessThan(String value) {
            addCriterion("warehouse_sn <", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnLessThanOrEqualTo(String value) {
            addCriterion("warehouse_sn <=", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnLike(String value) {
            addCriterion("warehouse_sn like", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnNotLike(String value) {
            addCriterion("warehouse_sn not like", value, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnIn(List<String> values) {
            addCriterion("warehouse_sn in", values, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnNotIn(List<String> values) {
            addCriterion("warehouse_sn not in", values, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnBetween(String value1, String value2) {
            addCriterion("warehouse_sn between", value1, value2, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseSnNotBetween(String value1, String value2) {
            addCriterion("warehouse_sn not between", value1, value2, "warehouseSn");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameIsNull() {
            addCriterion("warehoust_name is null");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameIsNotNull() {
            addCriterion("warehoust_name is not null");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameEqualTo(String value) {
            addCriterion("warehoust_name =", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameNotEqualTo(String value) {
            addCriterion("warehoust_name <>", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameGreaterThan(String value) {
            addCriterion("warehoust_name >", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameGreaterThanOrEqualTo(String value) {
            addCriterion("warehoust_name >=", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameLessThan(String value) {
            addCriterion("warehoust_name <", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameLessThanOrEqualTo(String value) {
            addCriterion("warehoust_name <=", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameLike(String value) {
            addCriterion("warehoust_name like", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameNotLike(String value) {
            addCriterion("warehoust_name not like", value, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameIn(List<String> values) {
            addCriterion("warehoust_name in", values, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameNotIn(List<String> values) {
            addCriterion("warehoust_name not in", values, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameBetween(String value1, String value2) {
            addCriterion("warehoust_name between", value1, value2, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehoustNameNotBetween(String value1, String value2) {
            addCriterion("warehoust_name not between", value1, value2, "warehoustName");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneIsNull() {
            addCriterion("warehouse_phone is null");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneIsNotNull() {
            addCriterion("warehouse_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneEqualTo(String value) {
            addCriterion("warehouse_phone =", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotEqualTo(String value) {
            addCriterion("warehouse_phone <>", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneGreaterThan(String value) {
            addCriterion("warehouse_phone >", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_phone >=", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneLessThan(String value) {
            addCriterion("warehouse_phone <", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneLessThanOrEqualTo(String value) {
            addCriterion("warehouse_phone <=", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneLike(String value) {
            addCriterion("warehouse_phone like", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotLike(String value) {
            addCriterion("warehouse_phone not like", value, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneIn(List<String> values) {
            addCriterion("warehouse_phone in", values, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotIn(List<String> values) {
            addCriterion("warehouse_phone not in", values, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneBetween(String value1, String value2) {
            addCriterion("warehouse_phone between", value1, value2, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andWarehousePhoneNotBetween(String value1, String value2) {
            addCriterion("warehouse_phone not between", value1, value2, "warehousePhone");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Short value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Short value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Short value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Short value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Short value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Short value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Short> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Short> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Short value1, Short value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Short value1, Short value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Short value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Short value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Short value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Short value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Short value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Short value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Short> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Short> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Short value1, Short value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Short value1, Short value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrctIsNull() {
            addCriterion("distrct is null");
            return (Criteria) this;
        }

        public Criteria andDistrctIsNotNull() {
            addCriterion("distrct is not null");
            return (Criteria) this;
        }

        public Criteria andDistrctEqualTo(Short value) {
            addCriterion("distrct =", value, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctNotEqualTo(Short value) {
            addCriterion("distrct <>", value, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctGreaterThan(Short value) {
            addCriterion("distrct >", value, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctGreaterThanOrEqualTo(Short value) {
            addCriterion("distrct >=", value, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctLessThan(Short value) {
            addCriterion("distrct <", value, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctLessThanOrEqualTo(Short value) {
            addCriterion("distrct <=", value, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctIn(List<Short> values) {
            addCriterion("distrct in", values, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctNotIn(List<Short> values) {
            addCriterion("distrct not in", values, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctBetween(Short value1, Short value2) {
            addCriterion("distrct between", value1, value2, "distrct");
            return (Criteria) this;
        }

        public Criteria andDistrctNotBetween(Short value1, Short value2) {
            addCriterion("distrct not between", value1, value2, "distrct");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusIsNull() {
            addCriterion("warehouse_status is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusIsNotNull() {
            addCriterion("warehouse_status is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusEqualTo(Byte value) {
            addCriterion("warehouse_status =", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotEqualTo(Byte value) {
            addCriterion("warehouse_status <>", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusGreaterThan(Byte value) {
            addCriterion("warehouse_status >", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("warehouse_status >=", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusLessThan(Byte value) {
            addCriterion("warehouse_status <", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusLessThanOrEqualTo(Byte value) {
            addCriterion("warehouse_status <=", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusIn(List<Byte> values) {
            addCriterion("warehouse_status in", values, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotIn(List<Byte> values) {
            addCriterion("warehouse_status not in", values, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusBetween(Byte value1, Byte value2) {
            addCriterion("warehouse_status between", value1, value2, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("warehouse_status not between", value1, value2, "warehouseStatus");
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