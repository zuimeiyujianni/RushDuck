package com.rushduck.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRelationidIsNull() {
            addCriterion("relationId is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("relationId is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(Integer value) {
            addCriterion("relationId =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(Integer value) {
            addCriterion("relationId <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(Integer value) {
            addCriterion("relationId >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("relationId >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(Integer value) {
            addCriterion("relationId <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(Integer value) {
            addCriterion("relationId <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<Integer> values) {
            addCriterion("relationId in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<Integer> values) {
            addCriterion("relationId not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(Integer value1, Integer value2) {
            addCriterion("relationId between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(Integer value1, Integer value2) {
            addCriterion("relationId not between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeIsNull() {
            addCriterion("relationCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeIsNotNull() {
            addCriterion("relationCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("relationCreateTime =", value, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("relationCreateTime <>", value, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("relationCreateTime >", value, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("relationCreateTime >=", value, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("relationCreateTime <", value, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("relationCreateTime <=", value, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("relationCreateTime in", values, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("relationCreateTime not in", values, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("relationCreateTime between", value1, value2, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("relationCreateTime not between", value1, value2, "relationcreatetime");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridIsNull() {
            addCriterion("relationFollowUserId is null");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridIsNotNull() {
            addCriterion("relationFollowUserId is not null");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridEqualTo(Integer value) {
            addCriterion("relationFollowUserId =", value, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridNotEqualTo(Integer value) {
            addCriterion("relationFollowUserId <>", value, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridGreaterThan(Integer value) {
            addCriterion("relationFollowUserId >", value, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("relationFollowUserId >=", value, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridLessThan(Integer value) {
            addCriterion("relationFollowUserId <", value, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridLessThanOrEqualTo(Integer value) {
            addCriterion("relationFollowUserId <=", value, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridIn(List<Integer> values) {
            addCriterion("relationFollowUserId in", values, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridNotIn(List<Integer> values) {
            addCriterion("relationFollowUserId not in", values, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridBetween(Integer value1, Integer value2) {
            addCriterion("relationFollowUserId between", value1, value2, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationfollowuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("relationFollowUserId not between", value1, value2, "relationfollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridIsNull() {
            addCriterion("relationBeFollowUserId is null");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridIsNotNull() {
            addCriterion("relationBeFollowUserId is not null");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridEqualTo(Integer value) {
            addCriterion("relationBeFollowUserId =", value, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridNotEqualTo(Integer value) {
            addCriterion("relationBeFollowUserId <>", value, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridGreaterThan(Integer value) {
            addCriterion("relationBeFollowUserId >", value, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("relationBeFollowUserId >=", value, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridLessThan(Integer value) {
            addCriterion("relationBeFollowUserId <", value, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridLessThanOrEqualTo(Integer value) {
            addCriterion("relationBeFollowUserId <=", value, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridIn(List<Integer> values) {
            addCriterion("relationBeFollowUserId in", values, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridNotIn(List<Integer> values) {
            addCriterion("relationBeFollowUserId not in", values, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridBetween(Integer value1, Integer value2) {
            addCriterion("relationBeFollowUserId between", value1, value2, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationbefollowuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("relationBeFollowUserId not between", value1, value2, "relationbefollowuserid");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIsNull() {
            addCriterion("relationType is null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIsNotNull() {
            addCriterion("relationType is not null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeEqualTo(String value) {
            addCriterion("relationType =", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotEqualTo(String value) {
            addCriterion("relationType <>", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeGreaterThan(String value) {
            addCriterion("relationType >", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("relationType >=", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeLessThan(String value) {
            addCriterion("relationType <", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeLessThanOrEqualTo(String value) {
            addCriterion("relationType <=", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeLike(String value) {
            addCriterion("relationType like", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotLike(String value) {
            addCriterion("relationType not like", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIn(List<String> values) {
            addCriterion("relationType in", values, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotIn(List<String> values) {
            addCriterion("relationType not in", values, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeBetween(String value1, String value2) {
            addCriterion("relationType between", value1, value2, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotBetween(String value1, String value2) {
            addCriterion("relationType not between", value1, value2, "relationtype");
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