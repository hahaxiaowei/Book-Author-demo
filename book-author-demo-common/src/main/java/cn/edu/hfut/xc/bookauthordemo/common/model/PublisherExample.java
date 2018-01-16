package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class PublisherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublisherExample() {
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

        public Criteria andPublisherNameIsNull() {
            addCriterion("publisher_name is null");
            return (Criteria) this;
        }

        public Criteria andPublisherNameIsNotNull() {
            addCriterion("publisher_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherNameEqualTo(String value) {
            addCriterion("publisher_name =", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotEqualTo(String value) {
            addCriterion("publisher_name <>", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameGreaterThan(String value) {
            addCriterion("publisher_name >", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_name >=", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameLessThan(String value) {
            addCriterion("publisher_name <", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameLessThanOrEqualTo(String value) {
            addCriterion("publisher_name <=", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameLike(String value) {
            addCriterion("publisher_name like", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotLike(String value) {
            addCriterion("publisher_name not like", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameIn(List<String> values) {
            addCriterion("publisher_name in", values, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotIn(List<String> values) {
            addCriterion("publisher_name not in", values, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameBetween(String value1, String value2) {
            addCriterion("publisher_name between", value1, value2, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotBetween(String value1, String value2) {
            addCriterion("publisher_name not between", value1, value2, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressIsNull() {
            addCriterion("publisher_address is null");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressIsNotNull() {
            addCriterion("publisher_address is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressEqualTo(String value) {
            addCriterion("publisher_address =", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotEqualTo(String value) {
            addCriterion("publisher_address <>", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressGreaterThan(String value) {
            addCriterion("publisher_address >", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_address >=", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressLessThan(String value) {
            addCriterion("publisher_address <", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressLessThanOrEqualTo(String value) {
            addCriterion("publisher_address <=", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressLike(String value) {
            addCriterion("publisher_address like", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotLike(String value) {
            addCriterion("publisher_address not like", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressIn(List<String> values) {
            addCriterion("publisher_address in", values, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotIn(List<String> values) {
            addCriterion("publisher_address not in", values, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressBetween(String value1, String value2) {
            addCriterion("publisher_address between", value1, value2, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotBetween(String value1, String value2) {
            addCriterion("publisher_address not between", value1, value2, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdIsNull() {
            addCriterion("publisher_nationality_id is null");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdIsNotNull() {
            addCriterion("publisher_nationality_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdEqualTo(String value) {
            addCriterion("publisher_nationality_id =", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdNotEqualTo(String value) {
            addCriterion("publisher_nationality_id <>", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdGreaterThan(String value) {
            addCriterion("publisher_nationality_id >", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_nationality_id >=", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdLessThan(String value) {
            addCriterion("publisher_nationality_id <", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdLessThanOrEqualTo(String value) {
            addCriterion("publisher_nationality_id <=", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdLike(String value) {
            addCriterion("publisher_nationality_id like", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdNotLike(String value) {
            addCriterion("publisher_nationality_id not like", value, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdIn(List<String> values) {
            addCriterion("publisher_nationality_id in", values, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdNotIn(List<String> values) {
            addCriterion("publisher_nationality_id not in", values, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdBetween(String value1, String value2) {
            addCriterion("publisher_nationality_id between", value1, value2, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherNationalityIdNotBetween(String value1, String value2) {
            addCriterion("publisher_nationality_id not between", value1, value2, "publisherNationalityId");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeIsNull() {
            addCriterion("publisher_creation_time is null");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeIsNotNull() {
            addCriterion("publisher_creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeEqualTo(String value) {
            addCriterion("publisher_creation_time =", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeNotEqualTo(String value) {
            addCriterion("publisher_creation_time <>", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeGreaterThan(String value) {
            addCriterion("publisher_creation_time >", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_creation_time >=", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeLessThan(String value) {
            addCriterion("publisher_creation_time <", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeLessThanOrEqualTo(String value) {
            addCriterion("publisher_creation_time <=", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeLike(String value) {
            addCriterion("publisher_creation_time like", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeNotLike(String value) {
            addCriterion("publisher_creation_time not like", value, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeIn(List<String> values) {
            addCriterion("publisher_creation_time in", values, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeNotIn(List<String> values) {
            addCriterion("publisher_creation_time not in", values, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeBetween(String value1, String value2) {
            addCriterion("publisher_creation_time between", value1, value2, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherCreationTimeNotBetween(String value1, String value2) {
            addCriterion("publisher_creation_time not between", value1, value2, "publisherCreationTime");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeIsNull() {
            addCriterion("publisher_life is null");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeIsNotNull() {
            addCriterion("publisher_life is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeEqualTo(String value) {
            addCriterion("publisher_life =", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeNotEqualTo(String value) {
            addCriterion("publisher_life <>", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeGreaterThan(String value) {
            addCriterion("publisher_life >", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_life >=", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeLessThan(String value) {
            addCriterion("publisher_life <", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeLessThanOrEqualTo(String value) {
            addCriterion("publisher_life <=", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeLike(String value) {
            addCriterion("publisher_life like", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeNotLike(String value) {
            addCriterion("publisher_life not like", value, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeIn(List<String> values) {
            addCriterion("publisher_life in", values, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeNotIn(List<String> values) {
            addCriterion("publisher_life not in", values, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeBetween(String value1, String value2) {
            addCriterion("publisher_life between", value1, value2, "publisherLife");
            return (Criteria) this;
        }

        public Criteria andPublisherLifeNotBetween(String value1, String value2) {
            addCriterion("publisher_life not between", value1, value2, "publisherLife");
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