package com.park.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PositionrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionrecordExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("PositionName is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("PositionName is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("PositionName =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("PositionName <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("PositionName >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("PositionName >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("PositionName <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("PositionName <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("PositionName like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("PositionName not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("PositionName in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("PositionName not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("PositionName between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("PositionName not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionstateIsNull() {
            addCriterion("PositionState is null");
            return (Criteria) this;
        }

        public Criteria andPositionstateIsNotNull() {
            addCriterion("PositionState is not null");
            return (Criteria) this;
        }

        public Criteria andPositionstateEqualTo(Integer value) {
            addCriterion("PositionState =", value, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateNotEqualTo(Integer value) {
            addCriterion("PositionState <>", value, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateGreaterThan(Integer value) {
            addCriterion("PositionState >", value, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PositionState >=", value, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateLessThan(Integer value) {
            addCriterion("PositionState <", value, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateLessThanOrEqualTo(Integer value) {
            addCriterion("PositionState <=", value, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateIn(List<Integer> values) {
            addCriterion("PositionState in", values, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateNotIn(List<Integer> values) {
            addCriterion("PositionState not in", values, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateBetween(Integer value1, Integer value2) {
            addCriterion("PositionState between", value1, value2, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstateNotBetween(Integer value1, Integer value2) {
            addCriterion("PositionState not between", value1, value2, "positionstate");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesIsNull() {
            addCriterion("PositionStateDes is null");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesIsNotNull() {
            addCriterion("PositionStateDes is not null");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesEqualTo(String value) {
            addCriterion("PositionStateDes =", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesNotEqualTo(String value) {
            addCriterion("PositionStateDes <>", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesGreaterThan(String value) {
            addCriterion("PositionStateDes >", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesGreaterThanOrEqualTo(String value) {
            addCriterion("PositionStateDes >=", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesLessThan(String value) {
            addCriterion("PositionStateDes <", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesLessThanOrEqualTo(String value) {
            addCriterion("PositionStateDes <=", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesLike(String value) {
            addCriterion("PositionStateDes like", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesNotLike(String value) {
            addCriterion("PositionStateDes not like", value, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesIn(List<String> values) {
            addCriterion("PositionStateDes in", values, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesNotIn(List<String> values) {
            addCriterion("PositionStateDes not in", values, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesBetween(String value1, String value2) {
            addCriterion("PositionStateDes between", value1, value2, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andPositionstatedesNotBetween(String value1, String value2) {
            addCriterion("PositionStateDes not between", value1, value2, "positionstatedes");
            return (Criteria) this;
        }

        public Criteria andBstimeIsNull() {
            addCriterion("BSTime is null");
            return (Criteria) this;
        }

        public Criteria andBstimeIsNotNull() {
            addCriterion("BSTime is not null");
            return (Criteria) this;
        }

        public Criteria andBstimeEqualTo(Date value) {
            addCriterion("BSTime =", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeNotEqualTo(Date value) {
            addCriterion("BSTime <>", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeGreaterThan(Date value) {
            addCriterion("BSTime >", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BSTime >=", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeLessThan(Date value) {
            addCriterion("BSTime <", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeLessThanOrEqualTo(Date value) {
            addCriterion("BSTime <=", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeIn(List<Date> values) {
            addCriterion("BSTime in", values, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeNotIn(List<Date> values) {
            addCriterion("BSTime not in", values, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeBetween(Date value1, Date value2) {
            addCriterion("BSTime between", value1, value2, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeNotBetween(Date value1, Date value2) {
            addCriterion("BSTime not between", value1, value2, "bstime");
            return (Criteria) this;
        }

        public Criteria andBetimeIsNull() {
            addCriterion("BETime is null");
            return (Criteria) this;
        }

        public Criteria andBetimeIsNotNull() {
            addCriterion("BETime is not null");
            return (Criteria) this;
        }

        public Criteria andBetimeEqualTo(Date value) {
            addCriterion("BETime =", value, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeNotEqualTo(Date value) {
            addCriterion("BETime <>", value, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeGreaterThan(Date value) {
            addCriterion("BETime >", value, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BETime >=", value, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeLessThan(Date value) {
            addCriterion("BETime <", value, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeLessThanOrEqualTo(Date value) {
            addCriterion("BETime <=", value, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeIn(List<Date> values) {
            addCriterion("BETime in", values, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeNotIn(List<Date> values) {
            addCriterion("BETime not in", values, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeBetween(Date value1, Date value2) {
            addCriterion("BETime between", value1, value2, "betime");
            return (Criteria) this;
        }

        public Criteria andBetimeNotBetween(Date value1, Date value2) {
            addCriterion("BETime not between", value1, value2, "betime");
            return (Criteria) this;
        }

        public Criteria andBstimestringIsNull() {
            addCriterion("BSTimeString is null");
            return (Criteria) this;
        }

        public Criteria andBstimestringIsNotNull() {
            addCriterion("BSTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andBstimestringEqualTo(String value) {
            addCriterion("BSTimeString =", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringNotEqualTo(String value) {
            addCriterion("BSTimeString <>", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringGreaterThan(String value) {
            addCriterion("BSTimeString >", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringGreaterThanOrEqualTo(String value) {
            addCriterion("BSTimeString >=", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringLessThan(String value) {
            addCriterion("BSTimeString <", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringLessThanOrEqualTo(String value) {
            addCriterion("BSTimeString <=", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringLike(String value) {
            addCriterion("BSTimeString like", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringNotLike(String value) {
            addCriterion("BSTimeString not like", value, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringIn(List<String> values) {
            addCriterion("BSTimeString in", values, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringNotIn(List<String> values) {
            addCriterion("BSTimeString not in", values, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringBetween(String value1, String value2) {
            addCriterion("BSTimeString between", value1, value2, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBstimestringNotBetween(String value1, String value2) {
            addCriterion("BSTimeString not between", value1, value2, "bstimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringIsNull() {
            addCriterion("BETimeString is null");
            return (Criteria) this;
        }

        public Criteria andBetimestringIsNotNull() {
            addCriterion("BETimeString is not null");
            return (Criteria) this;
        }

        public Criteria andBetimestringEqualTo(String value) {
            addCriterion("BETimeString =", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringNotEqualTo(String value) {
            addCriterion("BETimeString <>", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringGreaterThan(String value) {
            addCriterion("BETimeString >", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringGreaterThanOrEqualTo(String value) {
            addCriterion("BETimeString >=", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringLessThan(String value) {
            addCriterion("BETimeString <", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringLessThanOrEqualTo(String value) {
            addCriterion("BETimeString <=", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringLike(String value) {
            addCriterion("BETimeString like", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringNotLike(String value) {
            addCriterion("BETimeString not like", value, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringIn(List<String> values) {
            addCriterion("BETimeString in", values, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringNotIn(List<String> values) {
            addCriterion("BETimeString not in", values, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringBetween(String value1, String value2) {
            addCriterion("BETimeString between", value1, value2, "betimestring");
            return (Criteria) this;
        }

        public Criteria andBetimestringNotBetween(String value1, String value2) {
            addCriterion("BETimeString not between", value1, value2, "betimestring");
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