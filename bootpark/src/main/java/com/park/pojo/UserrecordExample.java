package com.park.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserrecordExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPriceaccessIsNull() {
            addCriterion("PriceAccess is null");
            return (Criteria) this;
        }

        public Criteria andPriceaccessIsNotNull() {
            addCriterion("PriceAccess is not null");
            return (Criteria) this;
        }

        public Criteria andPriceaccessEqualTo(Integer value) {
            addCriterion("PriceAccess =", value, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessNotEqualTo(Integer value) {
            addCriterion("PriceAccess <>", value, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessGreaterThan(Integer value) {
            addCriterion("PriceAccess >", value, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceAccess >=", value, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessLessThan(Integer value) {
            addCriterion("PriceAccess <", value, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessLessThanOrEqualTo(Integer value) {
            addCriterion("PriceAccess <=", value, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessIn(List<Integer> values) {
            addCriterion("PriceAccess in", values, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessNotIn(List<Integer> values) {
            addCriterion("PriceAccess not in", values, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessBetween(Integer value1, Integer value2) {
            addCriterion("PriceAccess between", value1, value2, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andPriceaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceAccess not between", value1, value2, "priceaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessIsNull() {
            addCriterion("DiscountAccess is null");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessIsNotNull() {
            addCriterion("DiscountAccess is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessEqualTo(Integer value) {
            addCriterion("DiscountAccess =", value, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessNotEqualTo(Integer value) {
            addCriterion("DiscountAccess <>", value, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessGreaterThan(Integer value) {
            addCriterion("DiscountAccess >", value, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscountAccess >=", value, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessLessThan(Integer value) {
            addCriterion("DiscountAccess <", value, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessLessThanOrEqualTo(Integer value) {
            addCriterion("DiscountAccess <=", value, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessIn(List<Integer> values) {
            addCriterion("DiscountAccess in", values, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessNotIn(List<Integer> values) {
            addCriterion("DiscountAccess not in", values, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessBetween(Integer value1, Integer value2) {
            addCriterion("DiscountAccess between", value1, value2, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andDiscountaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscountAccess not between", value1, value2, "discountaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessIsNull() {
            addCriterion("FreeAccess is null");
            return (Criteria) this;
        }

        public Criteria andFreeaccessIsNotNull() {
            addCriterion("FreeAccess is not null");
            return (Criteria) this;
        }

        public Criteria andFreeaccessEqualTo(Integer value) {
            addCriterion("FreeAccess =", value, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessNotEqualTo(Integer value) {
            addCriterion("FreeAccess <>", value, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessGreaterThan(Integer value) {
            addCriterion("FreeAccess >", value, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("FreeAccess >=", value, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessLessThan(Integer value) {
            addCriterion("FreeAccess <", value, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessLessThanOrEqualTo(Integer value) {
            addCriterion("FreeAccess <=", value, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessIn(List<Integer> values) {
            addCriterion("FreeAccess in", values, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessNotIn(List<Integer> values) {
            addCriterion("FreeAccess not in", values, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessBetween(Integer value1, Integer value2) {
            addCriterion("FreeAccess between", value1, value2, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andFreeaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("FreeAccess not between", value1, value2, "freeaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessIsNull() {
            addCriterion("ControlAccess is null");
            return (Criteria) this;
        }

        public Criteria andControlaccessIsNotNull() {
            addCriterion("ControlAccess is not null");
            return (Criteria) this;
        }

        public Criteria andControlaccessEqualTo(Integer value) {
            addCriterion("ControlAccess =", value, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessNotEqualTo(Integer value) {
            addCriterion("ControlAccess <>", value, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessGreaterThan(Integer value) {
            addCriterion("ControlAccess >", value, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("ControlAccess >=", value, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessLessThan(Integer value) {
            addCriterion("ControlAccess <", value, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessLessThanOrEqualTo(Integer value) {
            addCriterion("ControlAccess <=", value, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessIn(List<Integer> values) {
            addCriterion("ControlAccess in", values, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessNotIn(List<Integer> values) {
            addCriterion("ControlAccess not in", values, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessBetween(Integer value1, Integer value2) {
            addCriterion("ControlAccess between", value1, value2, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andControlaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("ControlAccess not between", value1, value2, "controlaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessIsNull() {
            addCriterion("NewsAccess is null");
            return (Criteria) this;
        }

        public Criteria andNewsaccessIsNotNull() {
            addCriterion("NewsAccess is not null");
            return (Criteria) this;
        }

        public Criteria andNewsaccessEqualTo(Integer value) {
            addCriterion("NewsAccess =", value, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessNotEqualTo(Integer value) {
            addCriterion("NewsAccess <>", value, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessGreaterThan(Integer value) {
            addCriterion("NewsAccess >", value, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsAccess >=", value, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessLessThan(Integer value) {
            addCriterion("NewsAccess <", value, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessLessThanOrEqualTo(Integer value) {
            addCriterion("NewsAccess <=", value, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessIn(List<Integer> values) {
            addCriterion("NewsAccess in", values, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessNotIn(List<Integer> values) {
            addCriterion("NewsAccess not in", values, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessBetween(Integer value1, Integer value2) {
            addCriterion("NewsAccess between", value1, value2, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andNewsaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsAccess not between", value1, value2, "newsaccess");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("UserState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("UserState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Integer value) {
            addCriterion("UserState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Integer value) {
            addCriterion("UserState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Integer value) {
            addCriterion("UserState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Integer value) {
            addCriterion("UserState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Integer value) {
            addCriterion("UserState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Integer> values) {
            addCriterion("UserState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Integer> values) {
            addCriterion("UserState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Integer value1, Integer value2) {
            addCriterion("UserState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Integer value1, Integer value2) {
            addCriterion("UserState not between", value1, value2, "userstate");
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