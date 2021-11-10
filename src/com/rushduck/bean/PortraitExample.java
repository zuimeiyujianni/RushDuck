package com.rushduck.bean;

import java.util.ArrayList;
import java.util.List;

public class PortraitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PortraitExample() {
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

        public Criteria andPortraitidIsNull() {
            addCriterion("portraitId is null");
            return (Criteria) this;
        }

        public Criteria andPortraitidIsNotNull() {
            addCriterion("portraitId is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitidEqualTo(Integer value) {
            addCriterion("portraitId =", value, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidNotEqualTo(Integer value) {
            addCriterion("portraitId <>", value, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidGreaterThan(Integer value) {
            addCriterion("portraitId >", value, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("portraitId >=", value, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidLessThan(Integer value) {
            addCriterion("portraitId <", value, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidLessThanOrEqualTo(Integer value) {
            addCriterion("portraitId <=", value, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidIn(List<Integer> values) {
            addCriterion("portraitId in", values, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidNotIn(List<Integer> values) {
            addCriterion("portraitId not in", values, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidBetween(Integer value1, Integer value2) {
            addCriterion("portraitId between", value1, value2, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraitidNotBetween(Integer value1, Integer value2) {
            addCriterion("portraitId not between", value1, value2, "portraitid");
            return (Criteria) this;
        }

        public Criteria andPortraiturlIsNull() {
            addCriterion("portraitUrl is null");
            return (Criteria) this;
        }

        public Criteria andPortraiturlIsNotNull() {
            addCriterion("portraitUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPortraiturlEqualTo(String value) {
            addCriterion("portraitUrl =", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotEqualTo(String value) {
            addCriterion("portraitUrl <>", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlGreaterThan(String value) {
            addCriterion("portraitUrl >", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlGreaterThanOrEqualTo(String value) {
            addCriterion("portraitUrl >=", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlLessThan(String value) {
            addCriterion("portraitUrl <", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlLessThanOrEqualTo(String value) {
            addCriterion("portraitUrl <=", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlLike(String value) {
            addCriterion("portraitUrl like", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotLike(String value) {
            addCriterion("portraitUrl not like", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlIn(List<String> values) {
            addCriterion("portraitUrl in", values, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotIn(List<String> values) {
            addCriterion("portraitUrl not in", values, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlBetween(String value1, String value2) {
            addCriterion("portraitUrl between", value1, value2, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotBetween(String value1, String value2) {
            addCriterion("portraitUrl not between", value1, value2, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraittypeIsNull() {
            addCriterion("portraitType is null");
            return (Criteria) this;
        }

        public Criteria andPortraittypeIsNotNull() {
            addCriterion("portraitType is not null");
            return (Criteria) this;
        }

        public Criteria andPortraittypeEqualTo(String value) {
            addCriterion("portraitType =", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeNotEqualTo(String value) {
            addCriterion("portraitType <>", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeGreaterThan(String value) {
            addCriterion("portraitType >", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeGreaterThanOrEqualTo(String value) {
            addCriterion("portraitType >=", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeLessThan(String value) {
            addCriterion("portraitType <", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeLessThanOrEqualTo(String value) {
            addCriterion("portraitType <=", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeLike(String value) {
            addCriterion("portraitType like", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeNotLike(String value) {
            addCriterion("portraitType not like", value, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeIn(List<String> values) {
            addCriterion("portraitType in", values, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeNotIn(List<String> values) {
            addCriterion("portraitType not in", values, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeBetween(String value1, String value2) {
            addCriterion("portraitType between", value1, value2, "portraittype");
            return (Criteria) this;
        }

        public Criteria andPortraittypeNotBetween(String value1, String value2) {
            addCriterion("portraitType not between", value1, value2, "portraittype");
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