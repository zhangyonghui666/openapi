package com.qianfeng.openapi.order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PopOrderDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PopOrderDataExample() {
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

        public Criteria andIdCompanyBranchIsNull() {
            addCriterion("id_company_branch is null");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchIsNotNull() {
            addCriterion("id_company_branch is not null");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchEqualTo(Long value) {
            addCriterion("id_company_branch =", value, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchNotEqualTo(Long value) {
            addCriterion("id_company_branch <>", value, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchGreaterThan(Long value) {
            addCriterion("id_company_branch >", value, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("id_company_branch >=", value, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchLessThan(Long value) {
            addCriterion("id_company_branch <", value, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchLessThanOrEqualTo(Long value) {
            addCriterion("id_company_branch <=", value, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchIn(List<Long> values) {
            addCriterion("id_company_branch in", values, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchNotIn(List<Long> values) {
            addCriterion("id_company_branch not in", values, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchBetween(Long value1, Long value2) {
            addCriterion("id_company_branch between", value1, value2, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andIdCompanyBranchNotBetween(Long value1, Long value2) {
            addCriterion("id_company_branch not between", value1, value2, "idCompanyBranch");
            return (Criteria) this;
        }

        public Criteria andCky2IsNull() {
            addCriterion("cky2 is null");
            return (Criteria) this;
        }

        public Criteria andCky2IsNotNull() {
            addCriterion("cky2 is not null");
            return (Criteria) this;
        }

        public Criteria andCky2EqualTo(String value) {
            addCriterion("cky2 =", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2NotEqualTo(String value) {
            addCriterion("cky2 <>", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2GreaterThan(String value) {
            addCriterion("cky2 >", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2GreaterThanOrEqualTo(String value) {
            addCriterion("cky2 >=", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2LessThan(String value) {
            addCriterion("cky2 <", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2LessThanOrEqualTo(String value) {
            addCriterion("cky2 <=", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2Like(String value) {
            addCriterion("cky2 like", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2NotLike(String value) {
            addCriterion("cky2 not like", value, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2In(List<String> values) {
            addCriterion("cky2 in", values, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2NotIn(List<String> values) {
            addCriterion("cky2 not in", values, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2Between(String value1, String value2) {
            addCriterion("cky2 between", value1, value2, "cky2");
            return (Criteria) this;
        }

        public Criteria andCky2NotBetween(String value1, String value2) {
            addCriterion("cky2 not between", value1, value2, "cky2");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Long value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Long value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Long value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Long value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Long value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Long> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Long> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Long value1, Long value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Long value1, Long value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Long value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Long value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Long value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Long value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Long value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Long> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Long> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Long value1, Long value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Long value1, Long value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Long value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Long value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Long value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Long value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Long value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Long value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Long> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Long> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Long value1, Long value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Long value1, Long value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeIsNull() {
            addCriterion("paysum_type is null");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeIsNotNull() {
            addCriterion("paysum_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeEqualTo(Long value) {
            addCriterion("paysum_type =", value, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeNotEqualTo(Long value) {
            addCriterion("paysum_type <>", value, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeGreaterThan(Long value) {
            addCriterion("paysum_type >", value, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("paysum_type >=", value, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeLessThan(Long value) {
            addCriterion("paysum_type <", value, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeLessThanOrEqualTo(Long value) {
            addCriterion("paysum_type <=", value, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeIn(List<Long> values) {
            addCriterion("paysum_type in", values, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeNotIn(List<Long> values) {
            addCriterion("paysum_type not in", values, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeBetween(Long value1, Long value2) {
            addCriterion("paysum_type between", value1, value2, "paysumType");
            return (Criteria) this;
        }

        public Criteria andPaysumTypeNotBetween(Long value1, Long value2) {
            addCriterion("paysum_type not between", value1, value2, "paysumType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Long value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Long value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Long value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Long value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Long value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Long value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Long> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Long> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Long value1, Long value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Long value1, Long value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andOrderSignIsNull() {
            addCriterion("order_sign is null");
            return (Criteria) this;
        }

        public Criteria andOrderSignIsNotNull() {
            addCriterion("order_sign is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSignEqualTo(String value) {
            addCriterion("order_sign =", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignNotEqualTo(String value) {
            addCriterion("order_sign <>", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignGreaterThan(String value) {
            addCriterion("order_sign >", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignGreaterThanOrEqualTo(String value) {
            addCriterion("order_sign >=", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignLessThan(String value) {
            addCriterion("order_sign <", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignLessThanOrEqualTo(String value) {
            addCriterion("order_sign <=", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignLike(String value) {
            addCriterion("order_sign like", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignNotLike(String value) {
            addCriterion("order_sign not like", value, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignIn(List<String> values) {
            addCriterion("order_sign in", values, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignNotIn(List<String> values) {
            addCriterion("order_sign not in", values, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignBetween(String value1, String value2) {
            addCriterion("order_sign between", value1, value2, "orderSign");
            return (Criteria) this;
        }

        public Criteria andOrderSignNotBetween(String value1, String value2) {
            addCriterion("order_sign not between", value1, value2, "orderSign");
            return (Criteria) this;
        }

        public Criteria andPopSendPayIsNull() {
            addCriterion("pop_send_pay is null");
            return (Criteria) this;
        }

        public Criteria andPopSendPayIsNotNull() {
            addCriterion("pop_send_pay is not null");
            return (Criteria) this;
        }

        public Criteria andPopSendPayEqualTo(String value) {
            addCriterion("pop_send_pay =", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayNotEqualTo(String value) {
            addCriterion("pop_send_pay <>", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayGreaterThan(String value) {
            addCriterion("pop_send_pay >", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayGreaterThanOrEqualTo(String value) {
            addCriterion("pop_send_pay >=", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayLessThan(String value) {
            addCriterion("pop_send_pay <", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayLessThanOrEqualTo(String value) {
            addCriterion("pop_send_pay <=", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayLike(String value) {
            addCriterion("pop_send_pay like", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayNotLike(String value) {
            addCriterion("pop_send_pay not like", value, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayIn(List<String> values) {
            addCriterion("pop_send_pay in", values, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayNotIn(List<String> values) {
            addCriterion("pop_send_pay not in", values, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayBetween(String value1, String value2) {
            addCriterion("pop_send_pay between", value1, value2, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andPopSendPayNotBetween(String value1, String value2) {
            addCriterion("pop_send_pay not between", value1, value2, "popSendPay");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNull() {
            addCriterion("order_create_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNotNull() {
            addCriterion("order_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateEqualTo(Date value) {
            addCriterion("order_create_date =", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotEqualTo(Date value) {
            addCriterion("order_create_date <>", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThan(Date value) {
            addCriterion("order_create_date >", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_date >=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThan(Date value) {
            addCriterion("order_create_date <", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("order_create_date <=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIn(List<Date> values) {
            addCriterion("order_create_date in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotIn(List<Date> values) {
            addCriterion("order_create_date not in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateBetween(Date value1, Date value2) {
            addCriterion("order_create_date between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("order_create_date not between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateIsNull() {
            addCriterion("outbound_date is null");
            return (Criteria) this;
        }

        public Criteria andOutboundDateIsNotNull() {
            addCriterion("outbound_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundDateEqualTo(Date value) {
            addCriterion("outbound_date =", value, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateNotEqualTo(Date value) {
            addCriterion("outbound_date <>", value, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateGreaterThan(Date value) {
            addCriterion("outbound_date >", value, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateGreaterThanOrEqualTo(Date value) {
            addCriterion("outbound_date >=", value, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateLessThan(Date value) {
            addCriterion("outbound_date <", value, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateLessThanOrEqualTo(Date value) {
            addCriterion("outbound_date <=", value, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateIn(List<Date> values) {
            addCriterion("outbound_date in", values, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateNotIn(List<Date> values) {
            addCriterion("outbound_date not in", values, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateBetween(Date value1, Date value2) {
            addCriterion("outbound_date between", value1, value2, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOutboundDateNotBetween(Date value1, Date value2) {
            addCriterion("outbound_date not between", value1, value2, "outboundDate");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeIsNull() {
            addCriterion("order_completetime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeIsNotNull() {
            addCriterion("order_completetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeEqualTo(Date value) {
            addCriterion("order_completetime =", value, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeNotEqualTo(Date value) {
            addCriterion("order_completetime <>", value, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeGreaterThan(Date value) {
            addCriterion("order_completetime >", value, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_completetime >=", value, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeLessThan(Date value) {
            addCriterion("order_completetime <", value, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_completetime <=", value, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeIn(List<Date> values) {
            addCriterion("order_completetime in", values, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeNotIn(List<Date> values) {
            addCriterion("order_completetime not in", values, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeBetween(Date value1, Date value2) {
            addCriterion("order_completetime between", value1, value2, "orderCompletetime");
            return (Criteria) this;
        }

        public Criteria andOrderCompletetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_completetime not between", value1, value2, "orderCompletetime");
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

        public Criteria andPaymentConfirmTimeIsNull() {
            addCriterion("payment_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeIsNotNull() {
            addCriterion("payment_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeEqualTo(Date value) {
            addCriterion("payment_confirm_time =", value, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeNotEqualTo(Date value) {
            addCriterion("payment_confirm_time <>", value, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeGreaterThan(Date value) {
            addCriterion("payment_confirm_time >", value, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_confirm_time >=", value, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeLessThan(Date value) {
            addCriterion("payment_confirm_time <", value, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_confirm_time <=", value, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeIn(List<Date> values) {
            addCriterion("payment_confirm_time in", values, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeNotIn(List<Date> values) {
            addCriterion("payment_confirm_time not in", values, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("payment_confirm_time between", value1, value2, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andPaymentConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_confirm_time not between", value1, value2, "paymentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andSupposePayIsNull() {
            addCriterion("suppose_pay is null");
            return (Criteria) this;
        }

        public Criteria andSupposePayIsNotNull() {
            addCriterion("suppose_pay is not null");
            return (Criteria) this;
        }

        public Criteria andSupposePayEqualTo(Long value) {
            addCriterion("suppose_pay =", value, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayNotEqualTo(Long value) {
            addCriterion("suppose_pay <>", value, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayGreaterThan(Long value) {
            addCriterion("suppose_pay >", value, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayGreaterThanOrEqualTo(Long value) {
            addCriterion("suppose_pay >=", value, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayLessThan(Long value) {
            addCriterion("suppose_pay <", value, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayLessThanOrEqualTo(Long value) {
            addCriterion("suppose_pay <=", value, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayIn(List<Long> values) {
            addCriterion("suppose_pay in", values, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayNotIn(List<Long> values) {
            addCriterion("suppose_pay not in", values, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayBetween(Long value1, Long value2) {
            addCriterion("suppose_pay between", value1, value2, "supposePay");
            return (Criteria) this;
        }

        public Criteria andSupposePayNotBetween(Long value1, Long value2) {
            addCriterion("suppose_pay not between", value1, value2, "supposePay");
            return (Criteria) this;
        }

        public Criteria andShouldPayIsNull() {
            addCriterion("should_pay is null");
            return (Criteria) this;
        }

        public Criteria andShouldPayIsNotNull() {
            addCriterion("should_pay is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPayEqualTo(Long value) {
            addCriterion("should_pay =", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayNotEqualTo(Long value) {
            addCriterion("should_pay <>", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayGreaterThan(Long value) {
            addCriterion("should_pay >", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayGreaterThanOrEqualTo(Long value) {
            addCriterion("should_pay >=", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayLessThan(Long value) {
            addCriterion("should_pay <", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayLessThanOrEqualTo(Long value) {
            addCriterion("should_pay <=", value, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayIn(List<Long> values) {
            addCriterion("should_pay in", values, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayNotIn(List<Long> values) {
            addCriterion("should_pay not in", values, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayBetween(Long value1, Long value2) {
            addCriterion("should_pay between", value1, value2, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andShouldPayNotBetween(Long value1, Long value2) {
            addCriterion("should_pay not between", value1, value2, "shouldPay");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeIsNull() {
            addCriterion("deligood_type is null");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeIsNotNull() {
            addCriterion("deligood_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeEqualTo(Long value) {
            addCriterion("deligood_type =", value, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeNotEqualTo(Long value) {
            addCriterion("deligood_type <>", value, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeGreaterThan(Long value) {
            addCriterion("deligood_type >", value, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("deligood_type >=", value, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeLessThan(Long value) {
            addCriterion("deligood_type <", value, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeLessThanOrEqualTo(Long value) {
            addCriterion("deligood_type <=", value, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeIn(List<Long> values) {
            addCriterion("deligood_type in", values, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeNotIn(List<Long> values) {
            addCriterion("deligood_type not in", values, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeBetween(Long value1, Long value2) {
            addCriterion("deligood_type between", value1, value2, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andDeligoodTypeNotBetween(Long value1, Long value2) {
            addCriterion("deligood_type not between", value1, value2, "deligoodType");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeIsNull() {
            addCriterion("id_shipmenttype is null");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeIsNotNull() {
            addCriterion("id_shipmenttype is not null");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeEqualTo(Long value) {
            addCriterion("id_shipmenttype =", value, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeNotEqualTo(Long value) {
            addCriterion("id_shipmenttype <>", value, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeGreaterThan(Long value) {
            addCriterion("id_shipmenttype >", value, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeGreaterThanOrEqualTo(Long value) {
            addCriterion("id_shipmenttype >=", value, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeLessThan(Long value) {
            addCriterion("id_shipmenttype <", value, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeLessThanOrEqualTo(Long value) {
            addCriterion("id_shipmenttype <=", value, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeIn(List<Long> values) {
            addCriterion("id_shipmenttype in", values, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeNotIn(List<Long> values) {
            addCriterion("id_shipmenttype not in", values, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeBetween(Long value1, Long value2) {
            addCriterion("id_shipmenttype between", value1, value2, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andIdShipmenttypeNotBetween(Long value1, Long value2) {
            addCriterion("id_shipmenttype not between", value1, value2, "idShipmenttype");
            return (Criteria) this;
        }

        public Criteria andAreaNumIsNull() {
            addCriterion("area_num is null");
            return (Criteria) this;
        }

        public Criteria andAreaNumIsNotNull() {
            addCriterion("area_num is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNumEqualTo(Long value) {
            addCriterion("area_num =", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotEqualTo(Long value) {
            addCriterion("area_num <>", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumGreaterThan(Long value) {
            addCriterion("area_num >", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumGreaterThanOrEqualTo(Long value) {
            addCriterion("area_num >=", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumLessThan(Long value) {
            addCriterion("area_num <", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumLessThanOrEqualTo(Long value) {
            addCriterion("area_num <=", value, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumIn(List<Long> values) {
            addCriterion("area_num in", values, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotIn(List<Long> values) {
            addCriterion("area_num not in", values, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumBetween(Long value1, Long value2) {
            addCriterion("area_num between", value1, value2, "areaNum");
            return (Criteria) this;
        }

        public Criteria andAreaNumNotBetween(Long value1, Long value2) {
            addCriterion("area_num not between", value1, value2, "areaNum");
            return (Criteria) this;
        }

        public Criteria andConsNameIsNull() {
            addCriterion("cons_name is null");
            return (Criteria) this;
        }

        public Criteria andConsNameIsNotNull() {
            addCriterion("cons_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsNameEqualTo(String value) {
            addCriterion("cons_name =", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotEqualTo(String value) {
            addCriterion("cons_name <>", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameGreaterThan(String value) {
            addCriterion("cons_name >", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cons_name >=", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameLessThan(String value) {
            addCriterion("cons_name <", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameLessThanOrEqualTo(String value) {
            addCriterion("cons_name <=", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameLike(String value) {
            addCriterion("cons_name like", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotLike(String value) {
            addCriterion("cons_name not like", value, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameIn(List<String> values) {
            addCriterion("cons_name in", values, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotIn(List<String> values) {
            addCriterion("cons_name not in", values, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameBetween(String value1, String value2) {
            addCriterion("cons_name between", value1, value2, "consName");
            return (Criteria) this;
        }

        public Criteria andConsNameNotBetween(String value1, String value2) {
            addCriterion("cons_name not between", value1, value2, "consName");
            return (Criteria) this;
        }

        public Criteria andConsAddressIsNull() {
            addCriterion("cons_address is null");
            return (Criteria) this;
        }

        public Criteria andConsAddressIsNotNull() {
            addCriterion("cons_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsAddressEqualTo(String value) {
            addCriterion("cons_address =", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressNotEqualTo(String value) {
            addCriterion("cons_address <>", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressGreaterThan(String value) {
            addCriterion("cons_address >", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cons_address >=", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressLessThan(String value) {
            addCriterion("cons_address <", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressLessThanOrEqualTo(String value) {
            addCriterion("cons_address <=", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressLike(String value) {
            addCriterion("cons_address like", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressNotLike(String value) {
            addCriterion("cons_address not like", value, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressIn(List<String> values) {
            addCriterion("cons_address in", values, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressNotIn(List<String> values) {
            addCriterion("cons_address not in", values, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressBetween(String value1, String value2) {
            addCriterion("cons_address between", value1, value2, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsAddressNotBetween(String value1, String value2) {
            addCriterion("cons_address not between", value1, value2, "consAddress");
            return (Criteria) this;
        }

        public Criteria andConsPhoneIsNull() {
            addCriterion("cons_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsPhoneIsNotNull() {
            addCriterion("cons_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsPhoneEqualTo(String value) {
            addCriterion("cons_phone =", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneNotEqualTo(String value) {
            addCriterion("cons_phone <>", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneGreaterThan(String value) {
            addCriterion("cons_phone >", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cons_phone >=", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneLessThan(String value) {
            addCriterion("cons_phone <", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneLessThanOrEqualTo(String value) {
            addCriterion("cons_phone <=", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneLike(String value) {
            addCriterion("cons_phone like", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneNotLike(String value) {
            addCriterion("cons_phone not like", value, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneIn(List<String> values) {
            addCriterion("cons_phone in", values, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneNotIn(List<String> values) {
            addCriterion("cons_phone not in", values, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneBetween(String value1, String value2) {
            addCriterion("cons_phone between", value1, value2, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsPhoneNotBetween(String value1, String value2) {
            addCriterion("cons_phone not between", value1, value2, "consPhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneIsNull() {
            addCriterion("cons_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneIsNotNull() {
            addCriterion("cons_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneEqualTo(String value) {
            addCriterion("cons_mobile_phone =", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneNotEqualTo(String value) {
            addCriterion("cons_mobile_phone <>", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneGreaterThan(String value) {
            addCriterion("cons_mobile_phone >", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cons_mobile_phone >=", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneLessThan(String value) {
            addCriterion("cons_mobile_phone <", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("cons_mobile_phone <=", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneLike(String value) {
            addCriterion("cons_mobile_phone like", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneNotLike(String value) {
            addCriterion("cons_mobile_phone not like", value, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneIn(List<String> values) {
            addCriterion("cons_mobile_phone in", values, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneNotIn(List<String> values) {
            addCriterion("cons_mobile_phone not in", values, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneBetween(String value1, String value2) {
            addCriterion("cons_mobile_phone between", value1, value2, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("cons_mobile_phone not between", value1, value2, "consMobilePhone");
            return (Criteria) this;
        }

        public Criteria andConsEmailIsNull() {
            addCriterion("cons_email is null");
            return (Criteria) this;
        }

        public Criteria andConsEmailIsNotNull() {
            addCriterion("cons_email is not null");
            return (Criteria) this;
        }

        public Criteria andConsEmailEqualTo(String value) {
            addCriterion("cons_email =", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailNotEqualTo(String value) {
            addCriterion("cons_email <>", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailGreaterThan(String value) {
            addCriterion("cons_email >", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cons_email >=", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailLessThan(String value) {
            addCriterion("cons_email <", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailLessThanOrEqualTo(String value) {
            addCriterion("cons_email <=", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailLike(String value) {
            addCriterion("cons_email like", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailNotLike(String value) {
            addCriterion("cons_email not like", value, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailIn(List<String> values) {
            addCriterion("cons_email in", values, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailNotIn(List<String> values) {
            addCriterion("cons_email not in", values, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailBetween(String value1, String value2) {
            addCriterion("cons_email between", value1, value2, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsEmailNotBetween(String value1, String value2) {
            addCriterion("cons_email not between", value1, value2, "consEmail");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeIsNull() {
            addCriterion("cons_postcode is null");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeIsNotNull() {
            addCriterion("cons_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeEqualTo(String value) {
            addCriterion("cons_postcode =", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeNotEqualTo(String value) {
            addCriterion("cons_postcode <>", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeGreaterThan(String value) {
            addCriterion("cons_postcode >", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cons_postcode >=", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeLessThan(String value) {
            addCriterion("cons_postcode <", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeLessThanOrEqualTo(String value) {
            addCriterion("cons_postcode <=", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeLike(String value) {
            addCriterion("cons_postcode like", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeNotLike(String value) {
            addCriterion("cons_postcode not like", value, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeIn(List<String> values) {
            addCriterion("cons_postcode in", values, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeNotIn(List<String> values) {
            addCriterion("cons_postcode not in", values, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeBetween(String value1, String value2) {
            addCriterion("cons_postcode between", value1, value2, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andConsPostcodeNotBetween(String value1, String value2) {
            addCriterion("cons_postcode not between", value1, value2, "consPostcode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andJiFenIsNull() {
            addCriterion("ji_fen is null");
            return (Criteria) this;
        }

        public Criteria andJiFenIsNotNull() {
            addCriterion("ji_fen is not null");
            return (Criteria) this;
        }

        public Criteria andJiFenEqualTo(Long value) {
            addCriterion("ji_fen =", value, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenNotEqualTo(Long value) {
            addCriterion("ji_fen <>", value, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenGreaterThan(Long value) {
            addCriterion("ji_fen >", value, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenGreaterThanOrEqualTo(Long value) {
            addCriterion("ji_fen >=", value, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenLessThan(Long value) {
            addCriterion("ji_fen <", value, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenLessThanOrEqualTo(Long value) {
            addCriterion("ji_fen <=", value, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenIn(List<Long> values) {
            addCriterion("ji_fen in", values, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenNotIn(List<Long> values) {
            addCriterion("ji_fen not in", values, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenBetween(Long value1, Long value2) {
            addCriterion("ji_fen between", value1, value2, "jiFen");
            return (Criteria) this;
        }

        public Criteria andJiFenNotBetween(Long value1, Long value2) {
            addCriterion("ji_fen not between", value1, value2, "jiFen");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {
            addCriterion("carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {
            addCriterion("carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {
            addCriterion("carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {
            addCriterion("carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {
            addCriterion("carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {
            addCriterion("carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {
            addCriterion("carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {
            addCriterion("carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {
            addCriterion("carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {
            addCriterion("carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andOrderSumIsNull() {
            addCriterion("order_sum is null");
            return (Criteria) this;
        }

        public Criteria andOrderSumIsNotNull() {
            addCriterion("order_sum is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSumEqualTo(Long value) {
            addCriterion("order_sum =", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotEqualTo(Long value) {
            addCriterion("order_sum <>", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumGreaterThan(Long value) {
            addCriterion("order_sum >", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumGreaterThanOrEqualTo(Long value) {
            addCriterion("order_sum >=", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumLessThan(Long value) {
            addCriterion("order_sum <", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumLessThanOrEqualTo(Long value) {
            addCriterion("order_sum <=", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumIn(List<Long> values) {
            addCriterion("order_sum in", values, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotIn(List<Long> values) {
            addCriterion("order_sum not in", values, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumBetween(Long value1, Long value2) {
            addCriterion("order_sum between", value1, value2, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotBetween(Long value1, Long value2) {
            addCriterion("order_sum not between", value1, value2, "orderSum");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdIsNull() {
            addCriterion("invoice_content_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdIsNotNull() {
            addCriterion("invoice_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdEqualTo(Long value) {
            addCriterion("invoice_content_id =", value, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdNotEqualTo(Long value) {
            addCriterion("invoice_content_id <>", value, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdGreaterThan(Long value) {
            addCriterion("invoice_content_id >", value, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("invoice_content_id >=", value, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdLessThan(Long value) {
            addCriterion("invoice_content_id <", value, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdLessThanOrEqualTo(Long value) {
            addCriterion("invoice_content_id <=", value, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdIn(List<Long> values) {
            addCriterion("invoice_content_id in", values, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdNotIn(List<Long> values) {
            addCriterion("invoice_content_id not in", values, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdBetween(Long value1, Long value2) {
            addCriterion("invoice_content_id between", value1, value2, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIdNotBetween(Long value1, Long value2) {
            addCriterion("invoice_content_id not between", value1, value2, "invoiceContentId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumIsNull() {
            addCriterion("seller_order_sum is null");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumIsNotNull() {
            addCriterion("seller_order_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumEqualTo(Long value) {
            addCriterion("seller_order_sum =", value, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumNotEqualTo(Long value) {
            addCriterion("seller_order_sum <>", value, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumGreaterThan(Long value) {
            addCriterion("seller_order_sum >", value, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_order_sum >=", value, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumLessThan(Long value) {
            addCriterion("seller_order_sum <", value, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumLessThanOrEqualTo(Long value) {
            addCriterion("seller_order_sum <=", value, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumIn(List<Long> values) {
            addCriterion("seller_order_sum in", values, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumNotIn(List<Long> values) {
            addCriterion("seller_order_sum not in", values, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumBetween(Long value1, Long value2) {
            addCriterion("seller_order_sum between", value1, value2, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andSellerOrderSumNotBetween(Long value1, Long value2) {
            addCriterion("seller_order_sum not between", value1, value2, "sellerOrderSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumIsNull() {
            addCriterion("coupon_event_sum is null");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumIsNotNull() {
            addCriterion("coupon_event_sum is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumEqualTo(Long value) {
            addCriterion("coupon_event_sum =", value, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumNotEqualTo(Long value) {
            addCriterion("coupon_event_sum <>", value, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumGreaterThan(Long value) {
            addCriterion("coupon_event_sum >", value, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_event_sum >=", value, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumLessThan(Long value) {
            addCriterion("coupon_event_sum <", value, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumLessThanOrEqualTo(Long value) {
            addCriterion("coupon_event_sum <=", value, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumIn(List<Long> values) {
            addCriterion("coupon_event_sum in", values, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumNotIn(List<Long> values) {
            addCriterion("coupon_event_sum not in", values, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumBetween(Long value1, Long value2) {
            addCriterion("coupon_event_sum between", value1, value2, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andCouponEventSumNotBetween(Long value1, Long value2) {
            addCriterion("coupon_event_sum not between", value1, value2, "couponEventSum");
            return (Criteria) this;
        }

        public Criteria andDispathIdIsNull() {
            addCriterion("dispath_id is null");
            return (Criteria) this;
        }

        public Criteria andDispathIdIsNotNull() {
            addCriterion("dispath_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispathIdEqualTo(Long value) {
            addCriterion("dispath_id =", value, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdNotEqualTo(Long value) {
            addCriterion("dispath_id <>", value, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdGreaterThan(Long value) {
            addCriterion("dispath_id >", value, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dispath_id >=", value, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdLessThan(Long value) {
            addCriterion("dispath_id <", value, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdLessThanOrEqualTo(Long value) {
            addCriterion("dispath_id <=", value, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdIn(List<Long> values) {
            addCriterion("dispath_id in", values, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdNotIn(List<Long> values) {
            addCriterion("dispath_id not in", values, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdBetween(Long value1, Long value2) {
            addCriterion("dispath_id between", value1, value2, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathIdNotBetween(Long value1, Long value2) {
            addCriterion("dispath_id not between", value1, value2, "dispathId");
            return (Criteria) this;
        }

        public Criteria andDispathNameIsNull() {
            addCriterion("dispath_name is null");
            return (Criteria) this;
        }

        public Criteria andDispathNameIsNotNull() {
            addCriterion("dispath_name is not null");
            return (Criteria) this;
        }

        public Criteria andDispathNameEqualTo(String value) {
            addCriterion("dispath_name =", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameNotEqualTo(String value) {
            addCriterion("dispath_name <>", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameGreaterThan(String value) {
            addCriterion("dispath_name >", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameGreaterThanOrEqualTo(String value) {
            addCriterion("dispath_name >=", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameLessThan(String value) {
            addCriterion("dispath_name <", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameLessThanOrEqualTo(String value) {
            addCriterion("dispath_name <=", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameLike(String value) {
            addCriterion("dispath_name like", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameNotLike(String value) {
            addCriterion("dispath_name not like", value, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameIn(List<String> values) {
            addCriterion("dispath_name in", values, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameNotIn(List<String> values) {
            addCriterion("dispath_name not in", values, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameBetween(String value1, String value2) {
            addCriterion("dispath_name between", value1, value2, "dispathName");
            return (Criteria) this;
        }

        public Criteria andDispathNameNotBetween(String value1, String value2) {
            addCriterion("dispath_name not between", value1, value2, "dispathName");
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

        public Criteria andProvinceEqualTo(Long value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Long value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Long value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Long value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Long value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Long value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Long> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Long> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Long value1, Long value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Long value1, Long value2) {
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

        public Criteria andCityEqualTo(Long value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Long value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Long value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Long value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Long value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Long value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Long> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Long> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Long value1, Long value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Long value1, Long value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(Long value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(Long value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(Long value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(Long value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(Long value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(Long value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<Long> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<Long> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(Long value1, Long value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(Long value1, Long value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(Long value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(Long value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(Long value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(Long value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(Long value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(Long value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<Long> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<Long> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(Long value1, Long value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(Long value1, Long value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateIsNull() {
            addCriterion("invoice_state is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateIsNotNull() {
            addCriterion("invoice_state is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateEqualTo(Long value) {
            addCriterion("invoice_state =", value, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateNotEqualTo(Long value) {
            addCriterion("invoice_state <>", value, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateGreaterThan(Long value) {
            addCriterion("invoice_state >", value, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateGreaterThanOrEqualTo(Long value) {
            addCriterion("invoice_state >=", value, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateLessThan(Long value) {
            addCriterion("invoice_state <", value, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateLessThanOrEqualTo(Long value) {
            addCriterion("invoice_state <=", value, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateIn(List<Long> values) {
            addCriterion("invoice_state in", values, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateNotIn(List<Long> values) {
            addCriterion("invoice_state not in", values, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateBetween(Long value1, Long value2) {
            addCriterion("invoice_state between", value1, value2, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andInvoiceStateNotBetween(Long value1, Long value2) {
            addCriterion("invoice_state not between", value1, value2, "invoiceState");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedIsNull() {
            addCriterion("balance_used is null");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedIsNotNull() {
            addCriterion("balance_used is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedEqualTo(Long value) {
            addCriterion("balance_used =", value, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedNotEqualTo(Long value) {
            addCriterion("balance_used <>", value, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedGreaterThan(Long value) {
            addCriterion("balance_used >", value, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("balance_used >=", value, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedLessThan(Long value) {
            addCriterion("balance_used <", value, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedLessThanOrEqualTo(Long value) {
            addCriterion("balance_used <=", value, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedIn(List<Long> values) {
            addCriterion("balance_used in", values, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedNotIn(List<Long> values) {
            addCriterion("balance_used not in", values, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedBetween(Long value1, Long value2) {
            addCriterion("balance_used between", value1, value2, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andBalanceUsedNotBetween(Long value1, Long value2) {
            addCriterion("balance_used not between", value1, value2, "balanceUsed");
            return (Criteria) this;
        }

        public Criteria andConsIndexIsNull() {
            addCriterion("cons_index is null");
            return (Criteria) this;
        }

        public Criteria andConsIndexIsNotNull() {
            addCriterion("cons_index is not null");
            return (Criteria) this;
        }

        public Criteria andConsIndexEqualTo(String value) {
            addCriterion("cons_index =", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexNotEqualTo(String value) {
            addCriterion("cons_index <>", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexGreaterThan(String value) {
            addCriterion("cons_index >", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexGreaterThanOrEqualTo(String value) {
            addCriterion("cons_index >=", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexLessThan(String value) {
            addCriterion("cons_index <", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexLessThanOrEqualTo(String value) {
            addCriterion("cons_index <=", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexLike(String value) {
            addCriterion("cons_index like", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexNotLike(String value) {
            addCriterion("cons_index not like", value, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexIn(List<String> values) {
            addCriterion("cons_index in", values, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexNotIn(List<String> values) {
            addCriterion("cons_index not in", values, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexBetween(String value1, String value2) {
            addCriterion("cons_index between", value1, value2, "consIndex");
            return (Criteria) this;
        }

        public Criteria andConsIndexNotBetween(String value1, String value2) {
            addCriterion("cons_index not between", value1, value2, "consIndex");
            return (Criteria) this;
        }

        public Criteria andPinIsNull() {
            addCriterion("pin is null");
            return (Criteria) this;
        }

        public Criteria andPinIsNotNull() {
            addCriterion("pin is not null");
            return (Criteria) this;
        }

        public Criteria andPinEqualTo(String value) {
            addCriterion("pin =", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotEqualTo(String value) {
            addCriterion("pin <>", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinGreaterThan(String value) {
            addCriterion("pin >", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinGreaterThanOrEqualTo(String value) {
            addCriterion("pin >=", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLessThan(String value) {
            addCriterion("pin <", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLessThanOrEqualTo(String value) {
            addCriterion("pin <=", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLike(String value) {
            addCriterion("pin like", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotLike(String value) {
            addCriterion("pin not like", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinIn(List<String> values) {
            addCriterion("pin in", values, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotIn(List<String> values) {
            addCriterion("pin not in", values, "pin");
            return (Criteria) this;
        }

        public Criteria andPinBetween(String value1, String value2) {
            addCriterion("pin between", value1, value2, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotBetween(String value1, String value2) {
            addCriterion("pin not between", value1, value2, "pin");
            return (Criteria) this;
        }

        public Criteria andCustomeripIsNull() {
            addCriterion("customerip is null");
            return (Criteria) this;
        }

        public Criteria andCustomeripIsNotNull() {
            addCriterion("customerip is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeripEqualTo(String value) {
            addCriterion("customerip =", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripNotEqualTo(String value) {
            addCriterion("customerip <>", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripGreaterThan(String value) {
            addCriterion("customerip >", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripGreaterThanOrEqualTo(String value) {
            addCriterion("customerip >=", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripLessThan(String value) {
            addCriterion("customerip <", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripLessThanOrEqualTo(String value) {
            addCriterion("customerip <=", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripLike(String value) {
            addCriterion("customerip like", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripNotLike(String value) {
            addCriterion("customerip not like", value, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripIn(List<String> values) {
            addCriterion("customerip in", values, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripNotIn(List<String> values) {
            addCriterion("customerip not in", values, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripBetween(String value1, String value2) {
            addCriterion("customerip between", value1, value2, "customerip");
            return (Criteria) this;
        }

        public Criteria andCustomeripNotBetween(String value1, String value2) {
            addCriterion("customerip not between", value1, value2, "customerip");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNull() {
            addCriterion("center_id is null");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNotNull() {
            addCriterion("center_id is not null");
            return (Criteria) this;
        }

        public Criteria andCenterIdEqualTo(Long value) {
            addCriterion("center_id =", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotEqualTo(Long value) {
            addCriterion("center_id <>", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThan(Long value) {
            addCriterion("center_id >", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("center_id >=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThan(Long value) {
            addCriterion("center_id <", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("center_id <=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdIn(List<Long> values) {
            addCriterion("center_id in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotIn(List<Long> values) {
            addCriterion("center_id not in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdBetween(Long value1, Long value2) {
            addCriterion("center_id between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("center_id not between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Long value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Long value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Long value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Long value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Long value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Long value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Long> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Long> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Long value1, Long value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Long value1, Long value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andVatInfoIsNull() {
            addCriterion("vat_info is null");
            return (Criteria) this;
        }

        public Criteria andVatInfoIsNotNull() {
            addCriterion("vat_info is not null");
            return (Criteria) this;
        }

        public Criteria andVatInfoEqualTo(String value) {
            addCriterion("vat_info =", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoNotEqualTo(String value) {
            addCriterion("vat_info <>", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoGreaterThan(String value) {
            addCriterion("vat_info >", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoGreaterThanOrEqualTo(String value) {
            addCriterion("vat_info >=", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoLessThan(String value) {
            addCriterion("vat_info <", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoLessThanOrEqualTo(String value) {
            addCriterion("vat_info <=", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoLike(String value) {
            addCriterion("vat_info like", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoNotLike(String value) {
            addCriterion("vat_info not like", value, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoIn(List<String> values) {
            addCriterion("vat_info in", values, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoNotIn(List<String> values) {
            addCriterion("vat_info not in", values, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoBetween(String value1, String value2) {
            addCriterion("vat_info between", value1, value2, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andVatInfoNotBetween(String value1, String value2) {
            addCriterion("vat_info not between", value1, value2, "vatInfo");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdIsNull() {
            addCriterion("recommend_delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdIsNotNull() {
            addCriterion("recommend_delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdEqualTo(Long value) {
            addCriterion("recommend_delivery_id =", value, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdNotEqualTo(Long value) {
            addCriterion("recommend_delivery_id <>", value, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdGreaterThan(Long value) {
            addCriterion("recommend_delivery_id >", value, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recommend_delivery_id >=", value, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdLessThan(Long value) {
            addCriterion("recommend_delivery_id <", value, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdLessThanOrEqualTo(Long value) {
            addCriterion("recommend_delivery_id <=", value, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdIn(List<Long> values) {
            addCriterion("recommend_delivery_id in", values, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdNotIn(List<Long> values) {
            addCriterion("recommend_delivery_id not in", values, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdBetween(Long value1, Long value2) {
            addCriterion("recommend_delivery_id between", value1, value2, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andRecommendDeliveryIdNotBetween(Long value1, Long value2) {
            addCriterion("recommend_delivery_id not between", value1, value2, "recommendDeliveryId");
            return (Criteria) this;
        }

        public Criteria andSalesPinIsNull() {
            addCriterion("sales_pin is null");
            return (Criteria) this;
        }

        public Criteria andSalesPinIsNotNull() {
            addCriterion("sales_pin is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPinEqualTo(String value) {
            addCriterion("sales_pin =", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinNotEqualTo(String value) {
            addCriterion("sales_pin <>", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinGreaterThan(String value) {
            addCriterion("sales_pin >", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinGreaterThanOrEqualTo(String value) {
            addCriterion("sales_pin >=", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinLessThan(String value) {
            addCriterion("sales_pin <", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinLessThanOrEqualTo(String value) {
            addCriterion("sales_pin <=", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinLike(String value) {
            addCriterion("sales_pin like", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinNotLike(String value) {
            addCriterion("sales_pin not like", value, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinIn(List<String> values) {
            addCriterion("sales_pin in", values, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinNotIn(List<String> values) {
            addCriterion("sales_pin not in", values, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinBetween(String value1, String value2) {
            addCriterion("sales_pin between", value1, value2, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSalesPinNotBetween(String value1, String value2) {
            addCriterion("sales_pin not between", value1, value2, "salesPin");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(Long value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(Long value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(Long value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(Long value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(Long value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<Long> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<Long> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(Long value1, Long value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(Long value1, Long value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
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