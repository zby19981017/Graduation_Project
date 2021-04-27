package com.park.pojo;

import java.util.ArrayList;
import java.util.List;

public class CountrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountrecordExample() {
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

        public Criteria andCountidIsNull() {
            addCriterion("CountID is null");
            return (Criteria) this;
        }

        public Criteria andCountidIsNotNull() {
            addCriterion("CountID is not null");
            return (Criteria) this;
        }

        public Criteria andCountidEqualTo(Integer value) {
            addCriterion("CountID =", value, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidNotEqualTo(Integer value) {
            addCriterion("CountID <>", value, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidGreaterThan(Integer value) {
            addCriterion("CountID >", value, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CountID >=", value, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidLessThan(Integer value) {
            addCriterion("CountID <", value, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidLessThanOrEqualTo(Integer value) {
            addCriterion("CountID <=", value, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidIn(List<Integer> values) {
            addCriterion("CountID in", values, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidNotIn(List<Integer> values) {
            addCriterion("CountID not in", values, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidBetween(Integer value1, Integer value2) {
            addCriterion("CountID between", value1, value2, "countid");
            return (Criteria) this;
        }

        public Criteria andCountidNotBetween(Integer value1, Integer value2) {
            addCriterion("CountID not between", value1, value2, "countid");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberIsNull() {
            addCriterion("CountCarNumber is null");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberIsNotNull() {
            addCriterion("CountCarNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberEqualTo(String value) {
            addCriterion("CountCarNumber =", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberNotEqualTo(String value) {
            addCriterion("CountCarNumber <>", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberGreaterThan(String value) {
            addCriterion("CountCarNumber >", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CountCarNumber >=", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberLessThan(String value) {
            addCriterion("CountCarNumber <", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberLessThanOrEqualTo(String value) {
            addCriterion("CountCarNumber <=", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberLike(String value) {
            addCriterion("CountCarNumber like", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberNotLike(String value) {
            addCriterion("CountCarNumber not like", value, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberIn(List<String> values) {
            addCriterion("CountCarNumber in", values, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberNotIn(List<String> values) {
            addCriterion("CountCarNumber not in", values, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberBetween(String value1, String value2) {
            addCriterion("CountCarNumber between", value1, value2, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountcarnumberNotBetween(String value1, String value2) {
            addCriterion("CountCarNumber not between", value1, value2, "countcarnumber");
            return (Criteria) this;
        }

        public Criteria andCountpayIsNull() {
            addCriterion("CountPay is null");
            return (Criteria) this;
        }

        public Criteria andCountpayIsNotNull() {
            addCriterion("CountPay is not null");
            return (Criteria) this;
        }

        public Criteria andCountpayEqualTo(Integer value) {
            addCriterion("CountPay =", value, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayNotEqualTo(Integer value) {
            addCriterion("CountPay <>", value, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayGreaterThan(Integer value) {
            addCriterion("CountPay >", value, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("CountPay >=", value, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayLessThan(Integer value) {
            addCriterion("CountPay <", value, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayLessThanOrEqualTo(Integer value) {
            addCriterion("CountPay <=", value, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayIn(List<Integer> values) {
            addCriterion("CountPay in", values, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayNotIn(List<Integer> values) {
            addCriterion("CountPay not in", values, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayBetween(Integer value1, Integer value2) {
            addCriterion("CountPay between", value1, value2, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountpayNotBetween(Integer value1, Integer value2) {
            addCriterion("CountPay not between", value1, value2, "countpay");
            return (Criteria) this;
        }

        public Criteria andCountlevelIsNull() {
            addCriterion("CountLevel is null");
            return (Criteria) this;
        }

        public Criteria andCountlevelIsNotNull() {
            addCriterion("CountLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCountlevelEqualTo(String value) {
            addCriterion("CountLevel =", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelNotEqualTo(String value) {
            addCriterion("CountLevel <>", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelGreaterThan(String value) {
            addCriterion("CountLevel >", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CountLevel >=", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelLessThan(String value) {
            addCriterion("CountLevel <", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelLessThanOrEqualTo(String value) {
            addCriterion("CountLevel <=", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelLike(String value) {
            addCriterion("CountLevel like", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelNotLike(String value) {
            addCriterion("CountLevel not like", value, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelIn(List<String> values) {
            addCriterion("CountLevel in", values, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelNotIn(List<String> values) {
            addCriterion("CountLevel not in", values, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelBetween(String value1, String value2) {
            addCriterion("CountLevel between", value1, value2, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountlevelNotBetween(String value1, String value2) {
            addCriterion("CountLevel not between", value1, value2, "countlevel");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthIsNull() {
            addCriterion("CountYearMonth is null");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthIsNotNull() {
            addCriterion("CountYearMonth is not null");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthEqualTo(String value) {
            addCriterion("CountYearMonth =", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthNotEqualTo(String value) {
            addCriterion("CountYearMonth <>", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthGreaterThan(String value) {
            addCriterion("CountYearMonth >", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthGreaterThanOrEqualTo(String value) {
            addCriterion("CountYearMonth >=", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthLessThan(String value) {
            addCriterion("CountYearMonth <", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthLessThanOrEqualTo(String value) {
            addCriterion("CountYearMonth <=", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthLike(String value) {
            addCriterion("CountYearMonth like", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthNotLike(String value) {
            addCriterion("CountYearMonth not like", value, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthIn(List<String> values) {
            addCriterion("CountYearMonth in", values, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthNotIn(List<String> values) {
            addCriterion("CountYearMonth not in", values, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthBetween(String value1, String value2) {
            addCriterion("CountYearMonth between", value1, value2, "countyearmonth");
            return (Criteria) this;
        }

        public Criteria andCountyearmonthNotBetween(String value1, String value2) {
            addCriterion("CountYearMonth not between", value1, value2, "countyearmonth");
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