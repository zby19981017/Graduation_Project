package com.park.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsrecordExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("NewsID is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("NewsID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("NewsID =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("NewsID <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("NewsID >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsID >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("NewsID <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("NewsID <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("NewsID in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("NewsID not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("NewsID between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsID not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("Message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("Message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("Message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("Message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("Message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("Message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("Message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("Message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("Message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("Message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("Message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("Message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("Message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("Message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("CreatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("CreatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("CreatTime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("CreatTime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("CreatTime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatTime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("CreatTime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("CreatTime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("CreatTime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("CreatTime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("CreatTime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("CreatTime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("FinishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("FinishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("FinishTime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("FinishTime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("FinishTime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FinishTime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("FinishTime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("FinishTime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("FinishTime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("FinishTime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("FinishTime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("FinishTime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andNewsstateIsNull() {
            addCriterion("NewsState is null");
            return (Criteria) this;
        }

        public Criteria andNewsstateIsNotNull() {
            addCriterion("NewsState is not null");
            return (Criteria) this;
        }

        public Criteria andNewsstateEqualTo(Integer value) {
            addCriterion("NewsState =", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateNotEqualTo(Integer value) {
            addCriterion("NewsState <>", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateGreaterThan(Integer value) {
            addCriterion("NewsState >", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsState >=", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateLessThan(Integer value) {
            addCriterion("NewsState <", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateLessThanOrEqualTo(Integer value) {
            addCriterion("NewsState <=", value, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateIn(List<Integer> values) {
            addCriterion("NewsState in", values, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateNotIn(List<Integer> values) {
            addCriterion("NewsState not in", values, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateBetween(Integer value1, Integer value2) {
            addCriterion("NewsState between", value1, value2, "newsstate");
            return (Criteria) this;
        }

        public Criteria andNewsstateNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsState not between", value1, value2, "newsstate");
            return (Criteria) this;
        }

        public Criteria andCreattimestringIsNull() {
            addCriterion("CreatTimeString is null");
            return (Criteria) this;
        }

        public Criteria andCreattimestringIsNotNull() {
            addCriterion("CreatTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimestringEqualTo(String value) {
            addCriterion("CreatTimeString =", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringNotEqualTo(String value) {
            addCriterion("CreatTimeString <>", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringGreaterThan(String value) {
            addCriterion("CreatTimeString >", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringGreaterThanOrEqualTo(String value) {
            addCriterion("CreatTimeString >=", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringLessThan(String value) {
            addCriterion("CreatTimeString <", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringLessThanOrEqualTo(String value) {
            addCriterion("CreatTimeString <=", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringLike(String value) {
            addCriterion("CreatTimeString like", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringNotLike(String value) {
            addCriterion("CreatTimeString not like", value, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringIn(List<String> values) {
            addCriterion("CreatTimeString in", values, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringNotIn(List<String> values) {
            addCriterion("CreatTimeString not in", values, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringBetween(String value1, String value2) {
            addCriterion("CreatTimeString between", value1, value2, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andCreattimestringNotBetween(String value1, String value2) {
            addCriterion("CreatTimeString not between", value1, value2, "creattimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringIsNull() {
            addCriterion("FinishTimeString is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringIsNotNull() {
            addCriterion("FinishTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringEqualTo(String value) {
            addCriterion("FinishTimeString =", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringNotEqualTo(String value) {
            addCriterion("FinishTimeString <>", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringGreaterThan(String value) {
            addCriterion("FinishTimeString >", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringGreaterThanOrEqualTo(String value) {
            addCriterion("FinishTimeString >=", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringLessThan(String value) {
            addCriterion("FinishTimeString <", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringLessThanOrEqualTo(String value) {
            addCriterion("FinishTimeString <=", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringLike(String value) {
            addCriterion("FinishTimeString like", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringNotLike(String value) {
            addCriterion("FinishTimeString not like", value, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringIn(List<String> values) {
            addCriterion("FinishTimeString in", values, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringNotIn(List<String> values) {
            addCriterion("FinishTimeString not in", values, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringBetween(String value1, String value2) {
            addCriterion("FinishTimeString between", value1, value2, "finishtimestring");
            return (Criteria) this;
        }

        public Criteria andFinishtimestringNotBetween(String value1, String value2) {
            addCriterion("FinishTimeString not between", value1, value2, "finishtimestring");
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