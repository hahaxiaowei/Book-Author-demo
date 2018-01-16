package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class BookWithNationalityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookWithNationalityExample() {
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

        public Criteria andNationalityIdIsNull() {
            addCriterion("nationality_id is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIdIsNotNull() {
            addCriterion("nationality_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityIdEqualTo(String value) {
            addCriterion("nationality_id =", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotEqualTo(String value) {
            addCriterion("nationality_id <>", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdGreaterThan(String value) {
            addCriterion("nationality_id >", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_id >=", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdLessThan(String value) {
            addCriterion("nationality_id <", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdLessThanOrEqualTo(String value) {
            addCriterion("nationality_id <=", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdLike(String value) {
            addCriterion("nationality_id like", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotLike(String value) {
            addCriterion("nationality_id not like", value, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdIn(List<String> values) {
            addCriterion("nationality_id in", values, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotIn(List<String> values) {
            addCriterion("nationality_id not in", values, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdBetween(String value1, String value2) {
            addCriterion("nationality_id between", value1, value2, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andNationalityIdNotBetween(String value1, String value2) {
            addCriterion("nationality_id not between", value1, value2, "nationalityId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
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