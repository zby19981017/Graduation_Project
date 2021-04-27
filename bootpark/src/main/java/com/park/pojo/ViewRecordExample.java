package com.park.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewRecordExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNull() {
            addCriterion("CarNumber is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("CarNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("CarNumber =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("CarNumber <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("CarNumber >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CarNumber >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("CarNumber <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("CarNumber <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("CarNumber like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("CarNumber not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("CarNumber in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("CarNumber not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("CarNumber between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("CarNumber not between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andParkpriceIsNull() {
            addCriterion("ParkPrice is null");
            return (Criteria) this;
        }

        public Criteria andParkpriceIsNotNull() {
            addCriterion("ParkPrice is not null");
            return (Criteria) this;
        }

        public Criteria andParkpriceEqualTo(Integer value) {
            addCriterion("ParkPrice =", value, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceNotEqualTo(Integer value) {
            addCriterion("ParkPrice <>", value, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceGreaterThan(Integer value) {
            addCriterion("ParkPrice >", value, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParkPrice >=", value, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceLessThan(Integer value) {
            addCriterion("ParkPrice <", value, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceLessThanOrEqualTo(Integer value) {
            addCriterion("ParkPrice <=", value, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceIn(List<Integer> values) {
            addCriterion("ParkPrice in", values, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceNotIn(List<Integer> values) {
            addCriterion("ParkPrice not in", values, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceBetween(Integer value1, Integer value2) {
            addCriterion("ParkPrice between", value1, value2, "parkprice");
            return (Criteria) this;
        }

        public Criteria andParkpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ParkPrice not between", value1, value2, "parkprice");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("InTime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("InTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterion("InTime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterion("InTime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterion("InTime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InTime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterion("InTime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterion("InTime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterion("InTime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterion("InTime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterion("InTime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterion("InTime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("OutTime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("OutTime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterion("OutTime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterion("OutTime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterion("OutTime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OutTime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterion("OutTime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterion("OutTime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterion("OutTime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterion("OutTime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterion("OutTime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterion("OutTime not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNull() {
            addCriterion("CarState is null");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNotNull() {
            addCriterion("CarState is not null");
            return (Criteria) this;
        }

        public Criteria andCarstateEqualTo(Integer value) {
            addCriterion("CarState =", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotEqualTo(Integer value) {
            addCriterion("CarState <>", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThan(Integer value) {
            addCriterion("CarState >", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarState >=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThan(Integer value) {
            addCriterion("CarState <", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThanOrEqualTo(Integer value) {
            addCriterion("CarState <=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateIn(List<Integer> values) {
            addCriterion("CarState in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotIn(List<Integer> values) {
            addCriterion("CarState not in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateBetween(Integer value1, Integer value2) {
            addCriterion("CarState between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotBetween(Integer value1, Integer value2) {
            addCriterion("CarState not between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstatedesIsNull() {
            addCriterion("CarStateDes is null");
            return (Criteria) this;
        }

        public Criteria andCarstatedesIsNotNull() {
            addCriterion("CarStateDes is not null");
            return (Criteria) this;
        }

        public Criteria andCarstatedesEqualTo(String value) {
            addCriterion("CarStateDes =", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesNotEqualTo(String value) {
            addCriterion("CarStateDes <>", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesGreaterThan(String value) {
            addCriterion("CarStateDes >", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesGreaterThanOrEqualTo(String value) {
            addCriterion("CarStateDes >=", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesLessThan(String value) {
            addCriterion("CarStateDes <", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesLessThanOrEqualTo(String value) {
            addCriterion("CarStateDes <=", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesLike(String value) {
            addCriterion("CarStateDes like", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesNotLike(String value) {
            addCriterion("CarStateDes not like", value, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesIn(List<String> values) {
            addCriterion("CarStateDes in", values, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesNotIn(List<String> values) {
            addCriterion("CarStateDes not in", values, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesBetween(String value1, String value2) {
            addCriterion("CarStateDes between", value1, value2, "carstatedes");
            return (Criteria) this;
        }

        public Criteria andCarstatedesNotBetween(String value1, String value2) {
            addCriterion("CarStateDes not between", value1, value2, "carstatedes");
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

        public Criteria andLveldesIsNull() {
            addCriterion("LvelDes is null");
            return (Criteria) this;
        }

        public Criteria andLveldesIsNotNull() {
            addCriterion("LvelDes is not null");
            return (Criteria) this;
        }

        public Criteria andLveldesEqualTo(String value) {
            addCriterion("LvelDes =", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesNotEqualTo(String value) {
            addCriterion("LvelDes <>", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesGreaterThan(String value) {
            addCriterion("LvelDes >", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesGreaterThanOrEqualTo(String value) {
            addCriterion("LvelDes >=", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesLessThan(String value) {
            addCriterion("LvelDes <", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesLessThanOrEqualTo(String value) {
            addCriterion("LvelDes <=", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesLike(String value) {
            addCriterion("LvelDes like", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesNotLike(String value) {
            addCriterion("LvelDes not like", value, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesIn(List<String> values) {
            addCriterion("LvelDes in", values, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesNotIn(List<String> values) {
            addCriterion("LvelDes not in", values, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesBetween(String value1, String value2) {
            addCriterion("LvelDes between", value1, value2, "lveldes");
            return (Criteria) this;
        }

        public Criteria andLveldesNotBetween(String value1, String value2) {
            addCriterion("LvelDes not between", value1, value2, "lveldes");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
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

        public Criteria andStarttimestringIsNull() {
            addCriterion("StartTimeString is null");
            return (Criteria) this;
        }

        public Criteria andStarttimestringIsNotNull() {
            addCriterion("StartTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimestringEqualTo(String value) {
            addCriterion("StartTimeString =", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringNotEqualTo(String value) {
            addCriterion("StartTimeString <>", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringGreaterThan(String value) {
            addCriterion("StartTimeString >", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringGreaterThanOrEqualTo(String value) {
            addCriterion("StartTimeString >=", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringLessThan(String value) {
            addCriterion("StartTimeString <", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringLessThanOrEqualTo(String value) {
            addCriterion("StartTimeString <=", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringLike(String value) {
            addCriterion("StartTimeString like", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringNotLike(String value) {
            addCriterion("StartTimeString not like", value, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringIn(List<String> values) {
            addCriterion("StartTimeString in", values, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringNotIn(List<String> values) {
            addCriterion("StartTimeString not in", values, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringBetween(String value1, String value2) {
            addCriterion("StartTimeString between", value1, value2, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andStarttimestringNotBetween(String value1, String value2) {
            addCriterion("StartTimeString not between", value1, value2, "starttimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringIsNull() {
            addCriterion("EndTimeString is null");
            return (Criteria) this;
        }

        public Criteria andEndtimestringIsNotNull() {
            addCriterion("EndTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimestringEqualTo(String value) {
            addCriterion("EndTimeString =", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringNotEqualTo(String value) {
            addCriterion("EndTimeString <>", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringGreaterThan(String value) {
            addCriterion("EndTimeString >", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringGreaterThanOrEqualTo(String value) {
            addCriterion("EndTimeString >=", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringLessThan(String value) {
            addCriterion("EndTimeString <", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringLessThanOrEqualTo(String value) {
            addCriterion("EndTimeString <=", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringLike(String value) {
            addCriterion("EndTimeString like", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringNotLike(String value) {
            addCriterion("EndTimeString not like", value, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringIn(List<String> values) {
            addCriterion("EndTimeString in", values, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringNotIn(List<String> values) {
            addCriterion("EndTimeString not in", values, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringBetween(String value1, String value2) {
            addCriterion("EndTimeString between", value1, value2, "endtimestring");
            return (Criteria) this;
        }

        public Criteria andEndtimestringNotBetween(String value1, String value2) {
            addCriterion("EndTimeString not between", value1, value2, "endtimestring");
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

        public Criteria andIntimestringIsNull() {
            addCriterion("InTimeString is null");
            return (Criteria) this;
        }

        public Criteria andIntimestringIsNotNull() {
            addCriterion("InTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andIntimestringEqualTo(String value) {
            addCriterion("InTimeString =", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringNotEqualTo(String value) {
            addCriterion("InTimeString <>", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringGreaterThan(String value) {
            addCriterion("InTimeString >", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringGreaterThanOrEqualTo(String value) {
            addCriterion("InTimeString >=", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringLessThan(String value) {
            addCriterion("InTimeString <", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringLessThanOrEqualTo(String value) {
            addCriterion("InTimeString <=", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringLike(String value) {
            addCriterion("InTimeString like", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringNotLike(String value) {
            addCriterion("InTimeString not like", value, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringIn(List<String> values) {
            addCriterion("InTimeString in", values, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringNotIn(List<String> values) {
            addCriterion("InTimeString not in", values, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringBetween(String value1, String value2) {
            addCriterion("InTimeString between", value1, value2, "intimestring");
            return (Criteria) this;
        }

        public Criteria andIntimestringNotBetween(String value1, String value2) {
            addCriterion("InTimeString not between", value1, value2, "intimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringIsNull() {
            addCriterion("OutTimeString is null");
            return (Criteria) this;
        }

        public Criteria andOuttimestringIsNotNull() {
            addCriterion("OutTimeString is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimestringEqualTo(String value) {
            addCriterion("OutTimeString =", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringNotEqualTo(String value) {
            addCriterion("OutTimeString <>", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringGreaterThan(String value) {
            addCriterion("OutTimeString >", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringGreaterThanOrEqualTo(String value) {
            addCriterion("OutTimeString >=", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringLessThan(String value) {
            addCriterion("OutTimeString <", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringLessThanOrEqualTo(String value) {
            addCriterion("OutTimeString <=", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringLike(String value) {
            addCriterion("OutTimeString like", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringNotLike(String value) {
            addCriterion("OutTimeString not like", value, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringIn(List<String> values) {
            addCriterion("OutTimeString in", values, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringNotIn(List<String> values) {
            addCriterion("OutTimeString not in", values, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringBetween(String value1, String value2) {
            addCriterion("OutTimeString between", value1, value2, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andOuttimestringNotBetween(String value1, String value2) {
            addCriterion("OutTimeString not between", value1, value2, "outtimestring");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("Frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("Frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("Frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("Frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("Frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("Frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("Frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Integer> values) {
            addCriterion("Frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Integer> values) {
            addCriterion("Frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("Frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("Frequency not between", value1, value2, "frequency");
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