package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeIsNull() {
            addCriterion("shop_creation_time is null");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeIsNotNull() {
            addCriterion("shop_creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeEqualTo(String value) {
            addCriterion("shop_creation_time =", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotEqualTo(String value) {
            addCriterion("shop_creation_time <>", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeGreaterThan(String value) {
            addCriterion("shop_creation_time >", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_creation_time >=", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeLessThan(String value) {
            addCriterion("shop_creation_time <", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeLessThanOrEqualTo(String value) {
            addCriterion("shop_creation_time <=", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeLike(String value) {
            addCriterion("shop_creation_time like", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotLike(String value) {
            addCriterion("shop_creation_time not like", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeIn(List<String> values) {
            addCriterion("shop_creation_time in", values, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotIn(List<String> values) {
            addCriterion("shop_creation_time not in", values, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeBetween(String value1, String value2) {
            addCriterion("shop_creation_time between", value1, value2, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotBetween(String value1, String value2) {
            addCriterion("shop_creation_time not between", value1, value2, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopLifeIsNull() {
            addCriterion("shop_life is null");
            return (Criteria) this;
        }

        public Criteria andShopLifeIsNotNull() {
            addCriterion("shop_life is not null");
            return (Criteria) this;
        }

        public Criteria andShopLifeEqualTo(String value) {
            addCriterion("shop_life =", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeNotEqualTo(String value) {
            addCriterion("shop_life <>", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeGreaterThan(String value) {
            addCriterion("shop_life >", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_life >=", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeLessThan(String value) {
            addCriterion("shop_life <", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeLessThanOrEqualTo(String value) {
            addCriterion("shop_life <=", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeLike(String value) {
            addCriterion("shop_life like", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeNotLike(String value) {
            addCriterion("shop_life not like", value, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeIn(List<String> values) {
            addCriterion("shop_life in", values, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeNotIn(List<String> values) {
            addCriterion("shop_life not in", values, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeBetween(String value1, String value2) {
            addCriterion("shop_life between", value1, value2, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopLifeNotBetween(String value1, String value2) {
            addCriterion("shop_life not between", value1, value2, "shopLife");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdIsNull() {
            addCriterion("shop_nationality_id is null");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdIsNotNull() {
            addCriterion("shop_nationality_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdEqualTo(String value) {
            addCriterion("shop_nationality_id =", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdNotEqualTo(String value) {
            addCriterion("shop_nationality_id <>", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdGreaterThan(String value) {
            addCriterion("shop_nationality_id >", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_nationality_id >=", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdLessThan(String value) {
            addCriterion("shop_nationality_id <", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdLessThanOrEqualTo(String value) {
            addCriterion("shop_nationality_id <=", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdLike(String value) {
            addCriterion("shop_nationality_id like", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdNotLike(String value) {
            addCriterion("shop_nationality_id not like", value, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdIn(List<String> values) {
            addCriterion("shop_nationality_id in", values, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdNotIn(List<String> values) {
            addCriterion("shop_nationality_id not in", values, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdBetween(String value1, String value2) {
            addCriterion("shop_nationality_id between", value1, value2, "shopNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopNationalityIdNotBetween(String value1, String value2) {
            addCriterion("shop_nationality_id not between", value1, value2, "shopNationalityId");
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