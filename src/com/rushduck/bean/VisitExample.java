package com.rushduck.bean;

import java.util.ArrayList;
import java.util.List;

public class VisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitExample() {
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

        public Criteria andVisitidIsNull() {
            addCriterion("visitId is null");
            return (Criteria) this;
        }

        public Criteria andVisitidIsNotNull() {
            addCriterion("visitId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitidEqualTo(Integer value) {
            addCriterion("visitId =", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotEqualTo(Integer value) {
            addCriterion("visitId <>", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidGreaterThan(Integer value) {
            addCriterion("visitId >", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitId >=", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLessThan(Integer value) {
            addCriterion("visitId <", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLessThanOrEqualTo(Integer value) {
            addCriterion("visitId <=", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidIn(List<Integer> values) {
            addCriterion("visitId in", values, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotIn(List<Integer> values) {
            addCriterion("visitId not in", values, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidBetween(Integer value1, Integer value2) {
            addCriterion("visitId between", value1, value2, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitId not between", value1, value2, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisiteridIsNull() {
            addCriterion("visiterId is null");
            return (Criteria) this;
        }

        public Criteria andVisiteridIsNotNull() {
            addCriterion("visiterId is not null");
            return (Criteria) this;
        }

        public Criteria andVisiteridEqualTo(Integer value) {
            addCriterion("visiterId =", value, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridNotEqualTo(Integer value) {
            addCriterion("visiterId <>", value, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridGreaterThan(Integer value) {
            addCriterion("visiterId >", value, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("visiterId >=", value, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridLessThan(Integer value) {
            addCriterion("visiterId <", value, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridLessThanOrEqualTo(Integer value) {
            addCriterion("visiterId <=", value, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridIn(List<Integer> values) {
            addCriterion("visiterId in", values, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridNotIn(List<Integer> values) {
            addCriterion("visiterId not in", values, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridBetween(Integer value1, Integer value2) {
            addCriterion("visiterId between", value1, value2, "visiterid");
            return (Criteria) this;
        }

        public Criteria andVisiteridNotBetween(Integer value1, Integer value2) {
            addCriterion("visiterId not between", value1, value2, "visiterid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidIsNull() {
            addCriterion("beVisitedId is null");
            return (Criteria) this;
        }

        public Criteria andBevisitedidIsNotNull() {
            addCriterion("beVisitedId is not null");
            return (Criteria) this;
        }

        public Criteria andBevisitedidEqualTo(Integer value) {
            addCriterion("beVisitedId =", value, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidNotEqualTo(Integer value) {
            addCriterion("beVisitedId <>", value, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidGreaterThan(Integer value) {
            addCriterion("beVisitedId >", value, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("beVisitedId >=", value, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidLessThan(Integer value) {
            addCriterion("beVisitedId <", value, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidLessThanOrEqualTo(Integer value) {
            addCriterion("beVisitedId <=", value, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidIn(List<Integer> values) {
            addCriterion("beVisitedId in", values, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidNotIn(List<Integer> values) {
            addCriterion("beVisitedId not in", values, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidBetween(Integer value1, Integer value2) {
            addCriterion("beVisitedId between", value1, value2, "bevisitedid");
            return (Criteria) this;
        }

        public Criteria andBevisitedidNotBetween(Integer value1, Integer value2) {
            addCriterion("beVisitedId not between", value1, value2, "bevisitedid");
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