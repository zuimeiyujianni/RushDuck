package com.rushduck.bean;

import java.util.ArrayList;
import java.util.List;

public class ForwardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForwardExample() {
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

        public Criteria andForwardidIsNull() {
            addCriterion("forwardId is null");
            return (Criteria) this;
        }

        public Criteria andForwardidIsNotNull() {
            addCriterion("forwardId is not null");
            return (Criteria) this;
        }

        public Criteria andForwardidEqualTo(Integer value) {
            addCriterion("forwardId =", value, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidNotEqualTo(Integer value) {
            addCriterion("forwardId <>", value, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidGreaterThan(Integer value) {
            addCriterion("forwardId >", value, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("forwardId >=", value, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidLessThan(Integer value) {
            addCriterion("forwardId <", value, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidLessThanOrEqualTo(Integer value) {
            addCriterion("forwardId <=", value, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidIn(List<Integer> values) {
            addCriterion("forwardId in", values, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidNotIn(List<Integer> values) {
            addCriterion("forwardId not in", values, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidBetween(Integer value1, Integer value2) {
            addCriterion("forwardId between", value1, value2, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwardidNotBetween(Integer value1, Integer value2) {
            addCriterion("forwardId not between", value1, value2, "forwardid");
            return (Criteria) this;
        }

        public Criteria andForwarderIsNull() {
            addCriterion("forwarder is null");
            return (Criteria) this;
        }

        public Criteria andForwarderIsNotNull() {
            addCriterion("forwarder is not null");
            return (Criteria) this;
        }

        public Criteria andForwarderEqualTo(Integer value) {
            addCriterion("forwarder =", value, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderNotEqualTo(Integer value) {
            addCriterion("forwarder <>", value, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderGreaterThan(Integer value) {
            addCriterion("forwarder >", value, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderGreaterThanOrEqualTo(Integer value) {
            addCriterion("forwarder >=", value, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderLessThan(Integer value) {
            addCriterion("forwarder <", value, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderLessThanOrEqualTo(Integer value) {
            addCriterion("forwarder <=", value, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderIn(List<Integer> values) {
            addCriterion("forwarder in", values, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderNotIn(List<Integer> values) {
            addCriterion("forwarder not in", values, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderBetween(Integer value1, Integer value2) {
            addCriterion("forwarder between", value1, value2, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwarderNotBetween(Integer value1, Integer value2) {
            addCriterion("forwarder not between", value1, value2, "forwarder");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidIsNull() {
            addCriterion("forwardMessageId is null");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidIsNotNull() {
            addCriterion("forwardMessageId is not null");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidEqualTo(Integer value) {
            addCriterion("forwardMessageId =", value, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidNotEqualTo(Integer value) {
            addCriterion("forwardMessageId <>", value, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidGreaterThan(Integer value) {
            addCriterion("forwardMessageId >", value, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("forwardMessageId >=", value, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidLessThan(Integer value) {
            addCriterion("forwardMessageId <", value, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidLessThanOrEqualTo(Integer value) {
            addCriterion("forwardMessageId <=", value, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidIn(List<Integer> values) {
            addCriterion("forwardMessageId in", values, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidNotIn(List<Integer> values) {
            addCriterion("forwardMessageId not in", values, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidBetween(Integer value1, Integer value2) {
            addCriterion("forwardMessageId between", value1, value2, "forwardmessageid");
            return (Criteria) this;
        }

        public Criteria andForwardmessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("forwardMessageId not between", value1, value2, "forwardmessageid");
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