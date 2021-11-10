package com.rushduck.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageId is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageId =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageId <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageId >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageId >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageId <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageId <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageId in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageId not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageId between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageId not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNull() {
            addCriterion("messageType is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNotNull() {
            addCriterion("messageType is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeEqualTo(String value) {
            addCriterion("messageType =", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotEqualTo(String value) {
            addCriterion("messageType <>", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThan(String value) {
            addCriterion("messageType >", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("messageType >=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThan(String value) {
            addCriterion("messageType <", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThanOrEqualTo(String value) {
            addCriterion("messageType <=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLike(String value) {
            addCriterion("messageType like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotLike(String value) {
            addCriterion("messageType not like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIn(List<String> values) {
            addCriterion("messageType in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotIn(List<String> values) {
            addCriterion("messageType not in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeBetween(String value1, String value2) {
            addCriterion("messageType between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotBetween(String value1, String value2) {
            addCriterion("messageType not between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNull() {
            addCriterion("messageTime is null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNotNull() {
            addCriterion("messageTime is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeEqualTo(Date value) {
            addCriterionForJDBCDate("messageTime =", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("messageTime <>", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("messageTime >", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("messageTime >=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThan(Date value) {
            addCriterionForJDBCDate("messageTime <", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("messageTime <=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIn(List<Date> values) {
            addCriterionForJDBCDate("messageTime in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("messageTime not in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("messageTime between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("messageTime not between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessageinfoIsNull() {
            addCriterion("messageInfo is null");
            return (Criteria) this;
        }

        public Criteria andMessageinfoIsNotNull() {
            addCriterion("messageInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMessageinfoEqualTo(String value) {
            addCriterion("messageInfo =", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotEqualTo(String value) {
            addCriterion("messageInfo <>", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoGreaterThan(String value) {
            addCriterion("messageInfo >", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoGreaterThanOrEqualTo(String value) {
            addCriterion("messageInfo >=", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoLessThan(String value) {
            addCriterion("messageInfo <", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoLessThanOrEqualTo(String value) {
            addCriterion("messageInfo <=", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoLike(String value) {
            addCriterion("messageInfo like", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotLike(String value) {
            addCriterion("messageInfo not like", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoIn(List<String> values) {
            addCriterion("messageInfo in", values, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotIn(List<String> values) {
            addCriterion("messageInfo not in", values, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoBetween(String value1, String value2) {
            addCriterion("messageInfo between", value1, value2, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotBetween(String value1, String value2) {
            addCriterion("messageInfo not between", value1, value2, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesIsNull() {
            addCriterion("messageReadingTimes is null");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesIsNotNull() {
            addCriterion("messageReadingTimes is not null");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesEqualTo(Integer value) {
            addCriterion("messageReadingTimes =", value, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesNotEqualTo(Integer value) {
            addCriterion("messageReadingTimes <>", value, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesGreaterThan(Integer value) {
            addCriterion("messageReadingTimes >", value, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageReadingTimes >=", value, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesLessThan(Integer value) {
            addCriterion("messageReadingTimes <", value, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesLessThanOrEqualTo(Integer value) {
            addCriterion("messageReadingTimes <=", value, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesIn(List<Integer> values) {
            addCriterion("messageReadingTimes in", values, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesNotIn(List<Integer> values) {
            addCriterion("messageReadingTimes not in", values, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesBetween(Integer value1, Integer value2) {
            addCriterion("messageReadingTimes between", value1, value2, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagereadingtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("messageReadingTimes not between", value1, value2, "messagereadingtimes");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherIsNull() {
            addCriterion("messagePublisher is null");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherIsNotNull() {
            addCriterion("messagePublisher is not null");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherEqualTo(Integer value) {
            addCriterion("messagePublisher =", value, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherNotEqualTo(Integer value) {
            addCriterion("messagePublisher <>", value, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherGreaterThan(Integer value) {
            addCriterion("messagePublisher >", value, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherGreaterThanOrEqualTo(Integer value) {
            addCriterion("messagePublisher >=", value, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherLessThan(Integer value) {
            addCriterion("messagePublisher <", value, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherLessThanOrEqualTo(Integer value) {
            addCriterion("messagePublisher <=", value, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherIn(List<Integer> values) {
            addCriterion("messagePublisher in", values, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherNotIn(List<Integer> values) {
            addCriterion("messagePublisher not in", values, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherBetween(Integer value1, Integer value2) {
            addCriterion("messagePublisher between", value1, value2, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepublisherNotBetween(Integer value1, Integer value2) {
            addCriterion("messagePublisher not between", value1, value2, "messagepublisher");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1IsNull() {
            addCriterion("messagePictureId1 is null");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1IsNotNull() {
            addCriterion("messagePictureId1 is not null");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1EqualTo(Integer value) {
            addCriterion("messagePictureId1 =", value, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1NotEqualTo(Integer value) {
            addCriterion("messagePictureId1 <>", value, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1GreaterThan(Integer value) {
            addCriterion("messagePictureId1 >", value, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("messagePictureId1 >=", value, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1LessThan(Integer value) {
            addCriterion("messagePictureId1 <", value, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1LessThanOrEqualTo(Integer value) {
            addCriterion("messagePictureId1 <=", value, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1In(List<Integer> values) {
            addCriterion("messagePictureId1 in", values, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1NotIn(List<Integer> values) {
            addCriterion("messagePictureId1 not in", values, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1Between(Integer value1, Integer value2) {
            addCriterion("messagePictureId1 between", value1, value2, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid1NotBetween(Integer value1, Integer value2) {
            addCriterion("messagePictureId1 not between", value1, value2, "messagepictureid1");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2IsNull() {
            addCriterion("messagePictureId2 is null");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2IsNotNull() {
            addCriterion("messagePictureId2 is not null");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2EqualTo(Integer value) {
            addCriterion("messagePictureId2 =", value, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2NotEqualTo(Integer value) {
            addCriterion("messagePictureId2 <>", value, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2GreaterThan(Integer value) {
            addCriterion("messagePictureId2 >", value, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("messagePictureId2 >=", value, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2LessThan(Integer value) {
            addCriterion("messagePictureId2 <", value, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2LessThanOrEqualTo(Integer value) {
            addCriterion("messagePictureId2 <=", value, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2In(List<Integer> values) {
            addCriterion("messagePictureId2 in", values, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2NotIn(List<Integer> values) {
            addCriterion("messagePictureId2 not in", values, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2Between(Integer value1, Integer value2) {
            addCriterion("messagePictureId2 between", value1, value2, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid2NotBetween(Integer value1, Integer value2) {
            addCriterion("messagePictureId2 not between", value1, value2, "messagepictureid2");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3IsNull() {
            addCriterion("messagePictureId3 is null");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3IsNotNull() {
            addCriterion("messagePictureId3 is not null");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3EqualTo(Integer value) {
            addCriterion("messagePictureId3 =", value, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3NotEqualTo(Integer value) {
            addCriterion("messagePictureId3 <>", value, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3GreaterThan(Integer value) {
            addCriterion("messagePictureId3 >", value, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3GreaterThanOrEqualTo(Integer value) {
            addCriterion("messagePictureId3 >=", value, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3LessThan(Integer value) {
            addCriterion("messagePictureId3 <", value, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3LessThanOrEqualTo(Integer value) {
            addCriterion("messagePictureId3 <=", value, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3In(List<Integer> values) {
            addCriterion("messagePictureId3 in", values, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3NotIn(List<Integer> values) {
            addCriterion("messagePictureId3 not in", values, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3Between(Integer value1, Integer value2) {
            addCriterion("messagePictureId3 between", value1, value2, "messagepictureid3");
            return (Criteria) this;
        }

        public Criteria andMessagepictureid3NotBetween(Integer value1, Integer value2) {
            addCriterion("messagePictureId3 not between", value1, value2, "messagepictureid3");
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