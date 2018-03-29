package com.dx.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPersonalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPersonalExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPIdcardIsNull() {
            addCriterion("p_idcard is null");
            return (Criteria) this;
        }

        public Criteria andPIdcardIsNotNull() {
            addCriterion("p_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andPIdcardEqualTo(String value) {
            addCriterion("p_idcard =", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardNotEqualTo(String value) {
            addCriterion("p_idcard <>", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardGreaterThan(String value) {
            addCriterion("p_idcard >", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("p_idcard >=", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardLessThan(String value) {
            addCriterion("p_idcard <", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardLessThanOrEqualTo(String value) {
            addCriterion("p_idcard <=", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardLike(String value) {
            addCriterion("p_idcard like", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardNotLike(String value) {
            addCriterion("p_idcard not like", value, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardIn(List<String> values) {
            addCriterion("p_idcard in", values, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardNotIn(List<String> values) {
            addCriterion("p_idcard not in", values, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardBetween(String value1, String value2) {
            addCriterion("p_idcard between", value1, value2, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPIdcardNotBetween(String value1, String value2) {
            addCriterion("p_idcard not between", value1, value2, "pIdcard");
            return (Criteria) this;
        }

        public Criteria andPPhoneIsNull() {
            addCriterion("p_phone is null");
            return (Criteria) this;
        }

        public Criteria andPPhoneIsNotNull() {
            addCriterion("p_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPPhoneEqualTo(String value) {
            addCriterion("p_phone =", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotEqualTo(String value) {
            addCriterion("p_phone <>", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneGreaterThan(String value) {
            addCriterion("p_phone >", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("p_phone >=", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLessThan(String value) {
            addCriterion("p_phone <", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLessThanOrEqualTo(String value) {
            addCriterion("p_phone <=", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLike(String value) {
            addCriterion("p_phone like", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotLike(String value) {
            addCriterion("p_phone not like", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneIn(List<String> values) {
            addCriterion("p_phone in", values, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotIn(List<String> values) {
            addCriterion("p_phone not in", values, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneBetween(String value1, String value2) {
            addCriterion("p_phone between", value1, value2, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotBetween(String value1, String value2) {
            addCriterion("p_phone not between", value1, value2, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdIsNull() {
            addCriterion("p_school_id is null");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdIsNotNull() {
            addCriterion("p_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdEqualTo(String value) {
            addCriterion("p_school_id =", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdNotEqualTo(String value) {
            addCriterion("p_school_id <>", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdGreaterThan(String value) {
            addCriterion("p_school_id >", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_school_id >=", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdLessThan(String value) {
            addCriterion("p_school_id <", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdLessThanOrEqualTo(String value) {
            addCriterion("p_school_id <=", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdLike(String value) {
            addCriterion("p_school_id like", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdNotLike(String value) {
            addCriterion("p_school_id not like", value, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdIn(List<String> values) {
            addCriterion("p_school_id in", values, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdNotIn(List<String> values) {
            addCriterion("p_school_id not in", values, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdBetween(String value1, String value2) {
            addCriterion("p_school_id between", value1, value2, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andPSchoolIdNotBetween(String value1, String value2) {
            addCriterion("p_school_id not between", value1, value2, "pSchoolId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPLevelIsNull() {
            addCriterion("p_level is null");
            return (Criteria) this;
        }

        public Criteria andPLevelIsNotNull() {
            addCriterion("p_level is not null");
            return (Criteria) this;
        }

        public Criteria andPLevelEqualTo(Integer value) {
            addCriterion("p_level =", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotEqualTo(Integer value) {
            addCriterion("p_level <>", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelGreaterThan(Integer value) {
            addCriterion("p_level >", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_level >=", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelLessThan(Integer value) {
            addCriterion("p_level <", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelLessThanOrEqualTo(Integer value) {
            addCriterion("p_level <=", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelIn(List<Integer> values) {
            addCriterion("p_level in", values, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotIn(List<Integer> values) {
            addCriterion("p_level not in", values, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelBetween(Integer value1, Integer value2) {
            addCriterion("p_level between", value1, value2, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("p_level not between", value1, value2, "pLevel");
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