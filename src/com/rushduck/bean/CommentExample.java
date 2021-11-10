package com.rushduck.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentinfoIsNull() {
            addCriterion("commentInfo is null");
            return (Criteria) this;
        }

        public Criteria andCommentinfoIsNotNull() {
            addCriterion("commentInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCommentinfoEqualTo(String value) {
            addCriterion("commentInfo =", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotEqualTo(String value) {
            addCriterion("commentInfo <>", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoGreaterThan(String value) {
            addCriterion("commentInfo >", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoGreaterThanOrEqualTo(String value) {
            addCriterion("commentInfo >=", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoLessThan(String value) {
            addCriterion("commentInfo <", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoLessThanOrEqualTo(String value) {
            addCriterion("commentInfo <=", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoLike(String value) {
            addCriterion("commentInfo like", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotLike(String value) {
            addCriterion("commentInfo not like", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoIn(List<String> values) {
            addCriterion("commentInfo in", values, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotIn(List<String> values) {
            addCriterion("commentInfo not in", values, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoBetween(String value1, String value2) {
            addCriterion("commentInfo between", value1, value2, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotBetween(String value1, String value2) {
            addCriterion("commentInfo not between", value1, value2, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterionForJDBCDate("commentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterionForJDBCDate("commentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterionForJDBCDate("commentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherIsNull() {
            addCriterion("commentPublisher is null");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherIsNotNull() {
            addCriterion("commentPublisher is not null");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherEqualTo(Integer value) {
            addCriterion("commentPublisher =", value, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherNotEqualTo(Integer value) {
            addCriterion("commentPublisher <>", value, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherGreaterThan(Integer value) {
            addCriterion("commentPublisher >", value, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentPublisher >=", value, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherLessThan(Integer value) {
            addCriterion("commentPublisher <", value, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherLessThanOrEqualTo(Integer value) {
            addCriterion("commentPublisher <=", value, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherIn(List<Integer> values) {
            addCriterion("commentPublisher in", values, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherNotIn(List<Integer> values) {
            addCriterion("commentPublisher not in", values, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherBetween(Integer value1, Integer value2) {
            addCriterion("commentPublisher between", value1, value2, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentpublisherNotBetween(Integer value1, Integer value2) {
            addCriterion("commentPublisher not between", value1, value2, "commentpublisher");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidIsNull() {
            addCriterion("commentMessageId is null");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidIsNotNull() {
            addCriterion("commentMessageId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidEqualTo(Integer value) {
            addCriterion("commentMessageId =", value, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidNotEqualTo(Integer value) {
            addCriterion("commentMessageId <>", value, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidGreaterThan(Integer value) {
            addCriterion("commentMessageId >", value, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentMessageId >=", value, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidLessThan(Integer value) {
            addCriterion("commentMessageId <", value, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidLessThanOrEqualTo(Integer value) {
            addCriterion("commentMessageId <=", value, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidIn(List<Integer> values) {
            addCriterion("commentMessageId in", values, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidNotIn(List<Integer> values) {
            addCriterion("commentMessageId not in", values, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidBetween(Integer value1, Integer value2) {
            addCriterion("commentMessageId between", value1, value2, "commentmessageid");
            return (Criteria) this;
        }

        public Criteria andCommentmessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentMessageId not between", value1, value2, "commentmessageid");
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