package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class ShopWithShopOwnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopWithShopOwnerExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIsNull() {
            addCriterion("shop_owner is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIsNotNull() {
            addCriterion("shop_owner is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerEqualTo(String value) {
            addCriterion("shop_owner =", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNotEqualTo(String value) {
            addCriterion("shop_owner <>", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerGreaterThan(String value) {
            addCriterion("shop_owner >", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner >=", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerLessThan(String value) {
            addCriterion("shop_owner <", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerLessThanOrEqualTo(String value) {
            addCriterion("shop_owner <=", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerLike(String value) {
            addCriterion("shop_owner like", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNotLike(String value) {
            addCriterion("shop_owner not like", value, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerIn(List<String> values) {
            addCriterion("shop_owner in", values, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNotIn(List<String> values) {
            addCriterion("shop_owner not in", values, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerBetween(String value1, String value2) {
            addCriterion("shop_owner between", value1, value2, "shopOwner");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNotBetween(String value1, String value2) {
            addCriterion("shop_owner not between", value1, value2, "shopOwner");
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

        public Criteria andShopOwnerNameIsNull() {
            addCriterion("shop_owner_name is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameIsNotNull() {
            addCriterion("shop_owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameEqualTo(String value) {
            addCriterion("shop_owner_name =", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameNotEqualTo(String value) {
            addCriterion("shop_owner_name <>", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameGreaterThan(String value) {
            addCriterion("shop_owner_name >", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_name >=", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameLessThan(String value) {
            addCriterion("shop_owner_name <", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_name <=", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameLike(String value) {
            addCriterion("shop_owner_name like", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameNotLike(String value) {
            addCriterion("shop_owner_name not like", value, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameIn(List<String> values) {
            addCriterion("shop_owner_name in", values, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameNotIn(List<String> values) {
            addCriterion("shop_owner_name not in", values, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameBetween(String value1, String value2) {
            addCriterion("shop_owner_name between", value1, value2, "shopOwnerName");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNameNotBetween(String value1, String value2) {
            addCriterion("shop_owner_name not between", value1, value2, "shopOwnerName");
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