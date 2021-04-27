package com.park.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysrecordExample() {
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

        public Criteria andSysidIsNull() {
            addCriterion("SysID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("SysID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(Integer value) {
            addCriterion("SysID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(Integer value) {
            addCriterion("SysID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(Integer value) {
            addCriterion("SysID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SysID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(Integer value) {
            addCriterion("SysID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(Integer value) {
            addCriterion("SysID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<Integer> values) {
            addCriterion("SysID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<Integer> values) {
            addCriterion("SysID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(Integer value1, Integer value2) {
            addCriterion("SysID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(Integer value1, Integer value2) {
            addCriterion("SysID not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andMintimeIsNull() {
            addCriterion("MinTime is null");
            return (Criteria) this;
        }

        public Criteria andMintimeIsNotNull() {
            addCriterion("MinTime is not null");
            return (Criteria) this;
        }

        public Criteria andMintimeEqualTo(Integer value) {
            addCriterion("MinTime =", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeNotEqualTo(Integer value) {
            addCriterion("MinTime <>", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeGreaterThan(Integer value) {
            addCriterion("MinTime >", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MinTime >=", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeLessThan(Integer value) {
            addCriterion("MinTime <", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeLessThanOrEqualTo(Integer value) {
            addCriterion("MinTime <=", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeIn(List<Integer> values) {
            addCriterion("MinTime in", values, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeNotIn(List<Integer> values) {
            addCriterion("MinTime not in", values, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeBetween(Integer value1, Integer value2) {
            addCriterion("MinTime between", value1, value2, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("MinTime not between", value1, value2, "mintime");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("VIPPrice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("VIPPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Integer value) {
            addCriterion("VIPPrice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Integer value) {
            addCriterion("VIPPrice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Integer value) {
            addCriterion("VIPPrice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIPPrice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Integer value) {
            addCriterion("VIPPrice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Integer value) {
            addCriterion("VIPPrice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Integer> values) {
            addCriterion("VIPPrice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Integer> values) {
            addCriterion("VIPPrice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Integer value1, Integer value2) {
            addCriterion("VIPPrice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Integer value1, Integer value2) {
            addCriterion("VIPPrice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceIsNull() {
            addCriterion("UsualPrice is null");
            return (Criteria) this;
        }

        public Criteria andUsualpriceIsNotNull() {
            addCriterion("UsualPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUsualpriceEqualTo(Integer value) {
            addCriterion("UsualPrice =", value, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceNotEqualTo(Integer value) {
            addCriterion("UsualPrice <>", value, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceGreaterThan(Integer value) {
            addCriterion("UsualPrice >", value, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsualPrice >=", value, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceLessThan(Integer value) {
            addCriterion("UsualPrice <", value, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceLessThanOrEqualTo(Integer value) {
            addCriterion("UsualPrice <=", value, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceIn(List<Integer> values) {
            addCriterion("UsualPrice in", values, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceNotIn(List<Integer> values) {
            addCriterion("UsualPrice not in", values, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceBetween(Integer value1, Integer value2) {
            addCriterion("UsualPrice between", value1, value2, "usualprice");
            return (Criteria) this;
        }

        public Criteria andUsualpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("UsualPrice not between", value1, value2, "usualprice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSyscontrolIsNull() {
            addCriterion("SysControl is null");
            return (Criteria) this;
        }

        public Criteria andSyscontrolIsNotNull() {
            addCriterion("SysControl is not null");
            return (Criteria) this;
        }

        public Criteria andSyscontrolEqualTo(Integer value) {
            addCriterion("SysControl =", value, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolNotEqualTo(Integer value) {
            addCriterion("SysControl <>", value, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolGreaterThan(Integer value) {
            addCriterion("SysControl >", value, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("SysControl >=", value, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolLessThan(Integer value) {
            addCriterion("SysControl <", value, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolLessThanOrEqualTo(Integer value) {
            addCriterion("SysControl <=", value, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolIn(List<Integer> values) {
            addCriterion("SysControl in", values, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolNotIn(List<Integer> values) {
            addCriterion("SysControl not in", values, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolBetween(Integer value1, Integer value2) {
            addCriterion("SysControl between", value1, value2, "syscontrol");
            return (Criteria) this;
        }

        public Criteria andSyscontrolNotBetween(Integer value1, Integer value2) {
            addCriterion("SysControl not between", value1, value2, "syscontrol");
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