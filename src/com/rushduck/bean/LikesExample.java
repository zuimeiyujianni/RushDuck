package com.rushduck.bean;

import java.util.ArrayList;
import java.util.List;

public class LikesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikesExample() {
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

        public Criteria andLikeidIsNull() {
            addCriterion("likeId is null");
            return (Criteria) this;
        }

        public Criteria andLikeidIsNotNull() {
            addCriterion("likeId is not null");
            return (Criteria) this;
        }

        public Criteria andLikeidEqualTo(Integer value) {
            addCriterion("likeId =", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotEqualTo(Integer value) {
            addCriterion("likeId <>", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidGreaterThan(Integer value) {
            addCriterion("likeId >", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeId >=", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLessThan(Integer value) {
            addCriterion("likeId <", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidLessThanOrEqualTo(Integer value) {
            addCriterion("likeId <=", value, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidIn(List<Integer> values) {
            addCriterion("likeId in", values, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotIn(List<Integer> values) {
            addCriterion("likeId not in", values, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidBetween(Integer value1, Integer value2) {
            addCriterion("likeId between", value1, value2, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikeidNotBetween(Integer value1, Integer value2) {
            addCriterion("likeId not between", value1, value2, "likeid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidIsNull() {
            addCriterion("likeMessageId is null");
            return (Criteria) this;
        }

        public Criteria andLikemessageidIsNotNull() {
            addCriterion("likeMessageId is not null");
            return (Criteria) this;
        }

        public Criteria andLikemessageidEqualTo(Integer value) {
            addCriterion("likeMessageId =", value, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidNotEqualTo(Integer value) {
            addCriterion("likeMessageId <>", value, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidGreaterThan(Integer value) {
            addCriterion("likeMessageId >", value, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeMessageId >=", value, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidLessThan(Integer value) {
            addCriterion("likeMessageId <", value, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidLessThanOrEqualTo(Integer value) {
            addCriterion("likeMessageId <=", value, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidIn(List<Integer> values) {
            addCriterion("likeMessageId in", values, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidNotIn(List<Integer> values) {
            addCriterion("likeMessageId not in", values, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidBetween(Integer value1, Integer value2) {
            addCriterion("likeMessageId between", value1, value2, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikemessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("likeMessageId not between", value1, value2, "likemessageid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridIsNull() {
            addCriterion("likeUserId is null");
            return (Criteria) this;
        }

        public Criteria andLikeuseridIsNotNull() {
            addCriterion("likeUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLikeuseridEqualTo(Integer value) {
            addCriterion("likeUserId =", value, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridNotEqualTo(Integer value) {
            addCriterion("likeUserId <>", value, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridGreaterThan(Integer value) {
            addCriterion("likeUserId >", value, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeUserId >=", value, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridLessThan(Integer value) {
            addCriterion("likeUserId <", value, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridLessThanOrEqualTo(Integer value) {
            addCriterion("likeUserId <=", value, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridIn(List<Integer> values) {
            addCriterion("likeUserId in", values, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridNotIn(List<Integer> values) {
            addCriterion("likeUserId not in", values, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridBetween(Integer value1, Integer value2) {
            addCriterion("likeUserId between", value1, value2, "likeuserid");
            return (Criteria) this;
        }

        public Criteria andLikeuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("likeUserId not between", value1, value2, "likeuserid");
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