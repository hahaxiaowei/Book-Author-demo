package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class NationalityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NationalityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNationalityNameIsNull() {
            addCriterion("nationality_name is null");
            return (Criteria) this;
        }

        public Criteria andNationalityNameIsNotNull() {
            addCriterion("nationality_name is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityNameEqualTo(String value) {
            addCriterion("nationality_name =", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameNotEqualTo(String value) {
            addCriterion("nationality_name <>", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameGreaterThan(String value) {
            addCriterion("nationality_name >", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_name >=", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameLessThan(String value) {
            addCriterion("nationality_name <", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameLessThanOrEqualTo(String value) {
            addCriterion("nationality_name <=", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameLike(String value) {
            addCriterion("nationality_name like", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameNotLike(String value) {
            addCriterion("nationality_name not like", value, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameIn(List<String> values) {
            addCriterion("nationality_name in", values, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameNotIn(List<String> values) {
            addCriterion("nationality_name not in", values, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameBetween(String value1, String value2) {
            addCriterion("nationality_name between", value1, value2, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityNameNotBetween(String value1, String value2) {
            addCriterion("nationality_name not between", value1, value2, "nationalityName");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeIsNull() {
            addCriterion("nationality_life is null");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeIsNotNull() {
            addCriterion("nationality_life is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeEqualTo(String value) {
            addCriterion("nationality_life =", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeNotEqualTo(String value) {
            addCriterion("nationality_life <>", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeGreaterThan(String value) {
            addCriterion("nationality_life >", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_life >=", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeLessThan(String value) {
            addCriterion("nationality_life <", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeLessThanOrEqualTo(String value) {
            addCriterion("nationality_life <=", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeLike(String value) {
            addCriterion("nationality_life like", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeNotLike(String value) {
            addCriterion("nationality_life not like", value, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeIn(List<String> values) {
            addCriterion("nationality_life in", values, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeNotIn(List<String> values) {
            addCriterion("nationality_life not in", values, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeBetween(String value1, String value2) {
            addCriterion("nationality_life between", value1, value2, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityLifeNotBetween(String value1, String value2) {
            addCriterion("nationality_life not between", value1, value2, "nationalityLife");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeIsNull() {
            addCriterion("nationality_created_time is null");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeIsNotNull() {
            addCriterion("nationality_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeEqualTo(String value) {
            addCriterion("nationality_created_time =", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeNotEqualTo(String value) {
            addCriterion("nationality_created_time <>", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeGreaterThan(String value) {
            addCriterion("nationality_created_time >", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_created_time >=", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeLessThan(String value) {
            addCriterion("nationality_created_time <", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("nationality_created_time <=", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeLike(String value) {
            addCriterion("nationality_created_time like", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeNotLike(String value) {
            addCriterion("nationality_created_time not like", value, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeIn(List<String> values) {
            addCriterion("nationality_created_time in", values, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeNotIn(List<String> values) {
            addCriterion("nationality_created_time not in", values, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeBetween(String value1, String value2) {
            addCriterion("nationality_created_time between", value1, value2, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("nationality_created_time not between", value1, value2, "nationalityCreatedTime");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationIsNull() {
            addCriterion("nationality_location is null");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationIsNotNull() {
            addCriterion("nationality_location is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationEqualTo(String value) {
            addCriterion("nationality_location =", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationNotEqualTo(String value) {
            addCriterion("nationality_location <>", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationGreaterThan(String value) {
            addCriterion("nationality_location >", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_location >=", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationLessThan(String value) {
            addCriterion("nationality_location <", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationLessThanOrEqualTo(String value) {
            addCriterion("nationality_location <=", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationLike(String value) {
            addCriterion("nationality_location like", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationNotLike(String value) {
            addCriterion("nationality_location not like", value, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationIn(List<String> values) {
            addCriterion("nationality_location in", values, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationNotIn(List<String> values) {
            addCriterion("nationality_location not in", values, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationBetween(String value1, String value2) {
            addCriterion("nationality_location between", value1, value2, "nationalityLocation");
            return (Criteria) this;
        }

        public Criteria andNationalityLocationNotBetween(String value1, String value2) {
            addCriterion("nationality_location not between", value1, value2, "nationalityLocation");
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