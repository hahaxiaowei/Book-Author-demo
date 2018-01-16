package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibraryExample() {
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

        public Criteria andLibraryNameIsNull() {
            addCriterion("library_name is null");
            return (Criteria) this;
        }

        public Criteria andLibraryNameIsNotNull() {
            addCriterion("library_name is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryNameEqualTo(String value) {
            addCriterion("library_name =", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotEqualTo(String value) {
            addCriterion("library_name <>", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameGreaterThan(String value) {
            addCriterion("library_name >", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameGreaterThanOrEqualTo(String value) {
            addCriterion("library_name >=", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameLessThan(String value) {
            addCriterion("library_name <", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameLessThanOrEqualTo(String value) {
            addCriterion("library_name <=", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameLike(String value) {
            addCriterion("library_name like", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotLike(String value) {
            addCriterion("library_name not like", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameIn(List<String> values) {
            addCriterion("library_name in", values, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotIn(List<String> values) {
            addCriterion("library_name not in", values, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameBetween(String value1, String value2) {
            addCriterion("library_name between", value1, value2, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotBetween(String value1, String value2) {
            addCriterion("library_name not between", value1, value2, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressIsNull() {
            addCriterion("library_address is null");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressIsNotNull() {
            addCriterion("library_address is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressEqualTo(String value) {
            addCriterion("library_address =", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotEqualTo(String value) {
            addCriterion("library_address <>", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressGreaterThan(String value) {
            addCriterion("library_address >", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("library_address >=", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressLessThan(String value) {
            addCriterion("library_address <", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressLessThanOrEqualTo(String value) {
            addCriterion("library_address <=", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressLike(String value) {
            addCriterion("library_address like", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotLike(String value) {
            addCriterion("library_address not like", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressIn(List<String> values) {
            addCriterion("library_address in", values, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotIn(List<String> values) {
            addCriterion("library_address not in", values, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressBetween(String value1, String value2) {
            addCriterion("library_address between", value1, value2, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotBetween(String value1, String value2) {
            addCriterion("library_address not between", value1, value2, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdIsNull() {
            addCriterion("library_nationality_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdIsNotNull() {
            addCriterion("library_nationality_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdEqualTo(String value) {
            addCriterion("library_nationality_id =", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdNotEqualTo(String value) {
            addCriterion("library_nationality_id <>", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdGreaterThan(String value) {
            addCriterion("library_nationality_id >", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdGreaterThanOrEqualTo(String value) {
            addCriterion("library_nationality_id >=", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdLessThan(String value) {
            addCriterion("library_nationality_id <", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdLessThanOrEqualTo(String value) {
            addCriterion("library_nationality_id <=", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdLike(String value) {
            addCriterion("library_nationality_id like", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdNotLike(String value) {
            addCriterion("library_nationality_id not like", value, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdIn(List<String> values) {
            addCriterion("library_nationality_id in", values, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdNotIn(List<String> values) {
            addCriterion("library_nationality_id not in", values, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdBetween(String value1, String value2) {
            addCriterion("library_nationality_id between", value1, value2, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryNationalityIdNotBetween(String value1, String value2) {
            addCriterion("library_nationality_id not between", value1, value2, "libraryNationalityId");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeIsNull() {
            addCriterion("library_bulid_time is null");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeIsNotNull() {
            addCriterion("library_bulid_time is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeEqualTo(String value) {
            addCriterion("library_bulid_time =", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeNotEqualTo(String value) {
            addCriterion("library_bulid_time <>", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeGreaterThan(String value) {
            addCriterion("library_bulid_time >", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("library_bulid_time >=", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeLessThan(String value) {
            addCriterion("library_bulid_time <", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeLessThanOrEqualTo(String value) {
            addCriterion("library_bulid_time <=", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeLike(String value) {
            addCriterion("library_bulid_time like", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeNotLike(String value) {
            addCriterion("library_bulid_time not like", value, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeIn(List<String> values) {
            addCriterion("library_bulid_time in", values, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeNotIn(List<String> values) {
            addCriterion("library_bulid_time not in", values, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeBetween(String value1, String value2) {
            addCriterion("library_bulid_time between", value1, value2, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryBulidTimeNotBetween(String value1, String value2) {
            addCriterion("library_bulid_time not between", value1, value2, "libraryBulidTime");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeIsNull() {
            addCriterion("library_life is null");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeIsNotNull() {
            addCriterion("library_life is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeEqualTo(String value) {
            addCriterion("library_life =", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeNotEqualTo(String value) {
            addCriterion("library_life <>", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeGreaterThan(String value) {
            addCriterion("library_life >", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeGreaterThanOrEqualTo(String value) {
            addCriterion("library_life >=", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeLessThan(String value) {
            addCriterion("library_life <", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeLessThanOrEqualTo(String value) {
            addCriterion("library_life <=", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeLike(String value) {
            addCriterion("library_life like", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeNotLike(String value) {
            addCriterion("library_life not like", value, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeIn(List<String> values) {
            addCriterion("library_life in", values, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeNotIn(List<String> values) {
            addCriterion("library_life not in", values, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeBetween(String value1, String value2) {
            addCriterion("library_life between", value1, value2, "libraryLife");
            return (Criteria) this;
        }

        public Criteria andLibraryLifeNotBetween(String value1, String value2) {
            addCriterion("library_life not between", value1, value2, "libraryLife");
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