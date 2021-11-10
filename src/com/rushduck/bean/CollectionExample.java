package com.rushduck.bean;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andCollectidIsNull() {
            addCriterion("collectId is null");
            return (Criteria) this;
        }

        public Criteria andCollectidIsNotNull() {
            addCriterion("collectId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectidEqualTo(Integer value) {
            addCriterion("collectId =", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotEqualTo(Integer value) {
            addCriterion("collectId <>", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThan(Integer value) {
            addCriterion("collectId >", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectId >=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThan(Integer value) {
            addCriterion("collectId <", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidLessThanOrEqualTo(Integer value) {
            addCriterion("collectId <=", value, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidIn(List<Integer> values) {
            addCriterion("collectId in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotIn(List<Integer> values) {
            addCriterion("collectId not in", values, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidBetween(Integer value1, Integer value2) {
            addCriterion("collectId between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectidNotBetween(Integer value1, Integer value2) {
            addCriterion("collectId not between", value1, value2, "collectid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridIsNull() {
            addCriterion("collectUserId is null");
            return (Criteria) this;
        }

        public Criteria andCollectuseridIsNotNull() {
            addCriterion("collectUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectuseridEqualTo(Integer value) {
            addCriterion("collectUserId =", value, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridNotEqualTo(Integer value) {
            addCriterion("collectUserId <>", value, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridGreaterThan(Integer value) {
            addCriterion("collectUserId >", value, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectUserId >=", value, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridLessThan(Integer value) {
            addCriterion("collectUserId <", value, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridLessThanOrEqualTo(Integer value) {
            addCriterion("collectUserId <=", value, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridIn(List<Integer> values) {
            addCriterion("collectUserId in", values, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridNotIn(List<Integer> values) {
            addCriterion("collectUserId not in", values, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridBetween(Integer value1, Integer value2) {
            addCriterion("collectUserId between", value1, value2, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("collectUserId not between", value1, value2, "collectuserid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidIsNull() {
            addCriterion("collectMessageId is null");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidIsNotNull() {
            addCriterion("collectMessageId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidEqualTo(Integer value) {
            addCriterion("collectMessageId =", value, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidNotEqualTo(Integer value) {
            addCriterion("collectMessageId <>", value, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidGreaterThan(Integer value) {
            addCriterion("collectMessageId >", value, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectMessageId >=", value, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidLessThan(Integer value) {
            addCriterion("collectMessageId <", value, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidLessThanOrEqualTo(Integer value) {
            addCriterion("collectMessageId <=", value, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidIn(List<Integer> values) {
            addCriterion("collectMessageId in", values, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidNotIn(List<Integer> values) {
            addCriterion("collectMessageId not in", values, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidBetween(Integer value1, Integer value2) {
            addCriterion("collectMessageId between", value1, value2, "collectmessageid");
            return (Criteria) this;
        }

        public Criteria andCollectmessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("collectMessageId not between", value1, value2, "collectmessageid");
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