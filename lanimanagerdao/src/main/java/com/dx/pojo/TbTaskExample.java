package com.dx.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTaskExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTAddressIsNull() {
            addCriterion("t_address is null");
            return (Criteria) this;
        }

        public Criteria andTAddressIsNotNull() {
            addCriterion("t_address is not null");
            return (Criteria) this;
        }

        public Criteria andTAddressEqualTo(String value) {
            addCriterion("t_address =", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotEqualTo(String value) {
            addCriterion("t_address <>", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressGreaterThan(String value) {
            addCriterion("t_address >", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressGreaterThanOrEqualTo(String value) {
            addCriterion("t_address >=", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLessThan(String value) {
            addCriterion("t_address <", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLessThanOrEqualTo(String value) {
            addCriterion("t_address <=", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLike(String value) {
            addCriterion("t_address like", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotLike(String value) {
            addCriterion("t_address not like", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressIn(List<String> values) {
            addCriterion("t_address in", values, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotIn(List<String> values) {
            addCriterion("t_address not in", values, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressBetween(String value1, String value2) {
            addCriterion("t_address between", value1, value2, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotBetween(String value1, String value2) {
            addCriterion("t_address not between", value1, value2, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("t_type is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("t_type is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(Integer value) {
            addCriterion("t_type =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(Integer value) {
            addCriterion("t_type <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(Integer value) {
            addCriterion("t_type >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_type >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(Integer value) {
            addCriterion("t_type <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(Integer value) {
            addCriterion("t_type <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<Integer> values) {
            addCriterion("t_type in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<Integer> values) {
            addCriterion("t_type not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(Integer value1, Integer value2) {
            addCriterion("t_type between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_type not between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTimeIsNull() {
            addCriterion("t_time is null");
            return (Criteria) this;
        }

        public Criteria andTTimeIsNotNull() {
            addCriterion("t_time is not null");
            return (Criteria) this;
        }

        public Criteria andTTimeEqualTo(Date value) {
            addCriterionForJDBCDate("t_time =", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_time <>", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("t_time >", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_time >=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThan(Date value) {
            addCriterionForJDBCDate("t_time <", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_time <=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeIn(List<Date> values) {
            addCriterionForJDBCDate("t_time in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_time not in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_time between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_time not between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterionForJDBCDate("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterionForJDBCDate("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andTPriceIsNull() {
            addCriterion("t_price is null");
            return (Criteria) this;
        }

        public Criteria andTPriceIsNotNull() {
            addCriterion("t_price is not null");
            return (Criteria) this;
        }

        public Criteria andTPriceEqualTo(Long value) {
            addCriterion("t_price =", value, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceNotEqualTo(Long value) {
            addCriterion("t_price <>", value, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceGreaterThan(Long value) {
            addCriterion("t_price >", value, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("t_price >=", value, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceLessThan(Long value) {
            addCriterion("t_price <", value, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceLessThanOrEqualTo(Long value) {
            addCriterion("t_price <=", value, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceIn(List<Long> values) {
            addCriterion("t_price in", values, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceNotIn(List<Long> values) {
            addCriterion("t_price not in", values, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceBetween(Long value1, Long value2) {
            addCriterion("t_price between", value1, value2, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTPriceNotBetween(Long value1, Long value2) {
            addCriterion("t_price not between", value1, value2, "tPrice");
            return (Criteria) this;
        }

        public Criteria andTCostIsNull() {
            addCriterion("t_cost is null");
            return (Criteria) this;
        }

        public Criteria andTCostIsNotNull() {
            addCriterion("t_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTCostEqualTo(BigDecimal value) {
            addCriterion("t_cost =", value, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostNotEqualTo(BigDecimal value) {
            addCriterion("t_cost <>", value, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostGreaterThan(BigDecimal value) {
            addCriterion("t_cost >", value, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_cost >=", value, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostLessThan(BigDecimal value) {
            addCriterion("t_cost <", value, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_cost <=", value, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostIn(List<BigDecimal> values) {
            addCriterion("t_cost in", values, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostNotIn(List<BigDecimal> values) {
            addCriterion("t_cost not in", values, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_cost between", value1, value2, "tCost");
            return (Criteria) this;
        }

        public Criteria andTCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_cost not between", value1, value2, "tCost");
            return (Criteria) this;
        }

        public Criteria andTStateIsNull() {
            addCriterion("t_state is null");
            return (Criteria) this;
        }

        public Criteria andTStateIsNotNull() {
            addCriterion("t_state is not null");
            return (Criteria) this;
        }

        public Criteria andTStateEqualTo(Integer value) {
            addCriterion("t_state =", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotEqualTo(Integer value) {
            addCriterion("t_state <>", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThan(Integer value) {
            addCriterion("t_state >", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_state >=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThan(Integer value) {
            addCriterion("t_state <", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThanOrEqualTo(Integer value) {
            addCriterion("t_state <=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateIn(List<Integer> values) {
            addCriterion("t_state in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotIn(List<Integer> values) {
            addCriterion("t_state not in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateBetween(Integer value1, Integer value2) {
            addCriterion("t_state between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotBetween(Integer value1, Integer value2) {
            addCriterion("t_state not between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTPictureIsNull() {
            addCriterion("t_picture is null");
            return (Criteria) this;
        }

        public Criteria andTPictureIsNotNull() {
            addCriterion("t_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTPictureEqualTo(String value) {
            addCriterion("t_picture =", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotEqualTo(String value) {
            addCriterion("t_picture <>", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureGreaterThan(String value) {
            addCriterion("t_picture >", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureGreaterThanOrEqualTo(String value) {
            addCriterion("t_picture >=", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureLessThan(String value) {
            addCriterion("t_picture <", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureLessThanOrEqualTo(String value) {
            addCriterion("t_picture <=", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureLike(String value) {
            addCriterion("t_picture like", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotLike(String value) {
            addCriterion("t_picture not like", value, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureIn(List<String> values) {
            addCriterion("t_picture in", values, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotIn(List<String> values) {
            addCriterion("t_picture not in", values, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureBetween(String value1, String value2) {
            addCriterion("t_picture between", value1, value2, "tPicture");
            return (Criteria) this;
        }

        public Criteria andTPictureNotBetween(String value1, String value2) {
            addCriterion("t_picture not between", value1, value2, "tPicture");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andUiIdIsNull() {
            addCriterion("uI_id is null");
            return (Criteria) this;
        }

        public Criteria andUiIdIsNotNull() {
            addCriterion("uI_id is not null");
            return (Criteria) this;
        }

        public Criteria andUiIdEqualTo(Integer value) {
            addCriterion("uI_id =", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdNotEqualTo(Integer value) {
            addCriterion("uI_id <>", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdGreaterThan(Integer value) {
            addCriterion("uI_id >", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uI_id >=", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdLessThan(Integer value) {
            addCriterion("uI_id <", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdLessThanOrEqualTo(Integer value) {
            addCriterion("uI_id <=", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdIn(List<Integer> values) {
            addCriterion("uI_id in", values, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdNotIn(List<Integer> values) {
            addCriterion("uI_id not in", values, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdBetween(Integer value1, Integer value2) {
            addCriterion("uI_id between", value1, value2, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uI_id not between", value1, value2, "uiId");
            return (Criteria) this;
        }

        public Criteria andUyIdIsNull() {
            addCriterion("uY_id is null");
            return (Criteria) this;
        }

        public Criteria andUyIdIsNotNull() {
            addCriterion("uY_id is not null");
            return (Criteria) this;
        }

        public Criteria andUyIdEqualTo(Integer value) {
            addCriterion("uY_id =", value, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdNotEqualTo(Integer value) {
            addCriterion("uY_id <>", value, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdGreaterThan(Integer value) {
            addCriterion("uY_id >", value, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uY_id >=", value, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdLessThan(Integer value) {
            addCriterion("uY_id <", value, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdLessThanOrEqualTo(Integer value) {
            addCriterion("uY_id <=", value, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdIn(List<Integer> values) {
            addCriterion("uY_id in", values, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdNotIn(List<Integer> values) {
            addCriterion("uY_id not in", values, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdBetween(Integer value1, Integer value2) {
            addCriterion("uY_id between", value1, value2, "uyId");
            return (Criteria) this;
        }

        public Criteria andUyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uY_id not between", value1, value2, "uyId");
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