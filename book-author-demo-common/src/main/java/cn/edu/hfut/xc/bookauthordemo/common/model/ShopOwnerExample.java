package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class ShopOwnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOwnerExample() {
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

        public Criteria andShopOwnerSexIsNull() {
            addCriterion("shop_owner_sex is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexIsNotNull() {
            addCriterion("shop_owner_sex is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexEqualTo(String value) {
            addCriterion("shop_owner_sex =", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexNotEqualTo(String value) {
            addCriterion("shop_owner_sex <>", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexGreaterThan(String value) {
            addCriterion("shop_owner_sex >", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_sex >=", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexLessThan(String value) {
            addCriterion("shop_owner_sex <", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_sex <=", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexLike(String value) {
            addCriterion("shop_owner_sex like", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexNotLike(String value) {
            addCriterion("shop_owner_sex not like", value, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexIn(List<String> values) {
            addCriterion("shop_owner_sex in", values, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexNotIn(List<String> values) {
            addCriterion("shop_owner_sex not in", values, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexBetween(String value1, String value2) {
            addCriterion("shop_owner_sex between", value1, value2, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerSexNotBetween(String value1, String value2) {
            addCriterion("shop_owner_sex not between", value1, value2, "shopOwnerSex");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeIsNull() {
            addCriterion("shop_owner_age is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeIsNotNull() {
            addCriterion("shop_owner_age is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeEqualTo(String value) {
            addCriterion("shop_owner_age =", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeNotEqualTo(String value) {
            addCriterion("shop_owner_age <>", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeGreaterThan(String value) {
            addCriterion("shop_owner_age >", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_age >=", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeLessThan(String value) {
            addCriterion("shop_owner_age <", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_age <=", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeLike(String value) {
            addCriterion("shop_owner_age like", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeNotLike(String value) {
            addCriterion("shop_owner_age not like", value, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeIn(List<String> values) {
            addCriterion("shop_owner_age in", values, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeNotIn(List<String> values) {
            addCriterion("shop_owner_age not in", values, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeBetween(String value1, String value2) {
            addCriterion("shop_owner_age between", value1, value2, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAgeNotBetween(String value1, String value2) {
            addCriterion("shop_owner_age not between", value1, value2, "shopOwnerAge");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressIsNull() {
            addCriterion("shop_owner_address is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressIsNotNull() {
            addCriterion("shop_owner_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressEqualTo(String value) {
            addCriterion("shop_owner_address =", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressNotEqualTo(String value) {
            addCriterion("shop_owner_address <>", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressGreaterThan(String value) {
            addCriterion("shop_owner_address >", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_address >=", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressLessThan(String value) {
            addCriterion("shop_owner_address <", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_address <=", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressLike(String value) {
            addCriterion("shop_owner_address like", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressNotLike(String value) {
            addCriterion("shop_owner_address not like", value, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressIn(List<String> values) {
            addCriterion("shop_owner_address in", values, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressNotIn(List<String> values) {
            addCriterion("shop_owner_address not in", values, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressBetween(String value1, String value2) {
            addCriterion("shop_owner_address between", value1, value2, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerAddressNotBetween(String value1, String value2) {
            addCriterion("shop_owner_address not between", value1, value2, "shopOwnerAddress");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationIsNull() {
            addCriterion("shop_owner_nation is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationIsNotNull() {
            addCriterion("shop_owner_nation is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationEqualTo(String value) {
            addCriterion("shop_owner_nation =", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationNotEqualTo(String value) {
            addCriterion("shop_owner_nation <>", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationGreaterThan(String value) {
            addCriterion("shop_owner_nation >", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_nation >=", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationLessThan(String value) {
            addCriterion("shop_owner_nation <", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_nation <=", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationLike(String value) {
            addCriterion("shop_owner_nation like", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationNotLike(String value) {
            addCriterion("shop_owner_nation not like", value, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationIn(List<String> values) {
            addCriterion("shop_owner_nation in", values, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationNotIn(List<String> values) {
            addCriterion("shop_owner_nation not in", values, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationBetween(String value1, String value2) {
            addCriterion("shop_owner_nation between", value1, value2, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationNotBetween(String value1, String value2) {
            addCriterion("shop_owner_nation not between", value1, value2, "shopOwnerNation");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdIsNull() {
            addCriterion("shop_owner_nationality_id is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdIsNotNull() {
            addCriterion("shop_owner_nationality_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdEqualTo(String value) {
            addCriterion("shop_owner_nationality_id =", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdNotEqualTo(String value) {
            addCriterion("shop_owner_nationality_id <>", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdGreaterThan(String value) {
            addCriterion("shop_owner_nationality_id >", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_nationality_id >=", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdLessThan(String value) {
            addCriterion("shop_owner_nationality_id <", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_nationality_id <=", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdLike(String value) {
            addCriterion("shop_owner_nationality_id like", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdNotLike(String value) {
            addCriterion("shop_owner_nationality_id not like", value, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdIn(List<String> values) {
            addCriterion("shop_owner_nationality_id in", values, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdNotIn(List<String> values) {
            addCriterion("shop_owner_nationality_id not in", values, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdBetween(String value1, String value2) {
            addCriterion("shop_owner_nationality_id between", value1, value2, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerNationalityIdNotBetween(String value1, String value2) {
            addCriterion("shop_owner_nationality_id not between", value1, value2, "shopOwnerNationalityId");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkIsNull() {
            addCriterion("shop_owner_remark is null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkIsNotNull() {
            addCriterion("shop_owner_remark is not null");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkEqualTo(String value) {
            addCriterion("shop_owner_remark =", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkNotEqualTo(String value) {
            addCriterion("shop_owner_remark <>", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkGreaterThan(String value) {
            addCriterion("shop_owner_remark >", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("shop_owner_remark >=", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkLessThan(String value) {
            addCriterion("shop_owner_remark <", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkLessThanOrEqualTo(String value) {
            addCriterion("shop_owner_remark <=", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkLike(String value) {
            addCriterion("shop_owner_remark like", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkNotLike(String value) {
            addCriterion("shop_owner_remark not like", value, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkIn(List<String> values) {
            addCriterion("shop_owner_remark in", values, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkNotIn(List<String> values) {
            addCriterion("shop_owner_remark not in", values, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkBetween(String value1, String value2) {
            addCriterion("shop_owner_remark between", value1, value2, "shopOwnerRemark");
            return (Criteria) this;
        }

        public Criteria andShopOwnerRemarkNotBetween(String value1, String value2) {
            addCriterion("shop_owner_remark not between", value1, value2, "shopOwnerRemark");
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