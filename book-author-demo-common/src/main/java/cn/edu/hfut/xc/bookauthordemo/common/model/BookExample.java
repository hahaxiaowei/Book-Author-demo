package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookClassIdIsNull() {
            addCriterion("book_class_id is null");
            return (Criteria) this;
        }

        public Criteria andBookClassIdIsNotNull() {
            addCriterion("book_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookClassIdEqualTo(String value) {
            addCriterion("book_class_id =", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdNotEqualTo(String value) {
            addCriterion("book_class_id <>", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdGreaterThan(String value) {
            addCriterion("book_class_id >", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_class_id >=", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdLessThan(String value) {
            addCriterion("book_class_id <", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdLessThanOrEqualTo(String value) {
            addCriterion("book_class_id <=", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdLike(String value) {
            addCriterion("book_class_id like", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdNotLike(String value) {
            addCriterion("book_class_id not like", value, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdIn(List<String> values) {
            addCriterion("book_class_id in", values, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdNotIn(List<String> values) {
            addCriterion("book_class_id not in", values, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdBetween(String value1, String value2) {
            addCriterion("book_class_id between", value1, value2, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andBookClassIdNotBetween(String value1, String value2) {
            addCriterion("book_class_id not between", value1, value2, "bookClassId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNull() {
            addCriterion("publisher_id is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNotNull() {
            addCriterion("publisher_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdEqualTo(String value) {
            addCriterion("publisher_id =", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotEqualTo(String value) {
            addCriterion("publisher_id <>", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThan(String value) {
            addCriterion("publisher_id >", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_id >=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThan(String value) {
            addCriterion("publisher_id <", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThanOrEqualTo(String value) {
            addCriterion("publisher_id <=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLike(String value) {
            addCriterion("publisher_id like", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotLike(String value) {
            addCriterion("publisher_id not like", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIn(List<String> values) {
            addCriterion("publisher_id in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotIn(List<String> values) {
            addCriterion("publisher_id not in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdBetween(String value1, String value2) {
            addCriterion("publisher_id between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotBetween(String value1, String value2) {
            addCriterion("publisher_id not between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNull() {
            addCriterion("book_code is null");
            return (Criteria) this;
        }

        public Criteria andBookCodeIsNotNull() {
            addCriterion("book_code is not null");
            return (Criteria) this;
        }

        public Criteria andBookCodeEqualTo(String value) {
            addCriterion("book_code =", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotEqualTo(String value) {
            addCriterion("book_code <>", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThan(String value) {
            addCriterion("book_code >", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeGreaterThanOrEqualTo(String value) {
            addCriterion("book_code >=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThan(String value) {
            addCriterion("book_code <", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLessThanOrEqualTo(String value) {
            addCriterion("book_code <=", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeLike(String value) {
            addCriterion("book_code like", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotLike(String value) {
            addCriterion("book_code not like", value, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeIn(List<String> values) {
            addCriterion("book_code in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotIn(List<String> values) {
            addCriterion("book_code not in", values, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeBetween(String value1, String value2) {
            addCriterion("book_code between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andBookCodeNotBetween(String value1, String value2) {
            addCriterion("book_code not between", value1, value2, "bookCode");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNull() {
            addCriterion("publication_date is null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNotNull() {
            addCriterion("publication_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateEqualTo(String value) {
            addCriterion("publication_date =", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotEqualTo(String value) {
            addCriterion("publication_date <>", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThan(String value) {
            addCriterion("publication_date >", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThanOrEqualTo(String value) {
            addCriterion("publication_date >=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThan(String value) {
            addCriterion("publication_date <", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThanOrEqualTo(String value) {
            addCriterion("publication_date <=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLike(String value) {
            addCriterion("publication_date like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotLike(String value) {
            addCriterion("publication_date not like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIn(List<String> values) {
            addCriterion("publication_date in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotIn(List<String> values) {
            addCriterion("publication_date not in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateBetween(String value1, String value2) {
            addCriterion("publication_date between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotBetween(String value1, String value2) {
            addCriterion("publication_date not between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressIsNull() {
            addCriterion("published_address is null");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressIsNotNull() {
            addCriterion("published_address is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressEqualTo(String value) {
            addCriterion("published_address =", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressNotEqualTo(String value) {
            addCriterion("published_address <>", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressGreaterThan(String value) {
            addCriterion("published_address >", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("published_address >=", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressLessThan(String value) {
            addCriterion("published_address <", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressLessThanOrEqualTo(String value) {
            addCriterion("published_address <=", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressLike(String value) {
            addCriterion("published_address like", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressNotLike(String value) {
            addCriterion("published_address not like", value, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressIn(List<String> values) {
            addCriterion("published_address in", values, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressNotIn(List<String> values) {
            addCriterion("published_address not in", values, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressBetween(String value1, String value2) {
            addCriterion("published_address between", value1, value2, "publishedAddress");
            return (Criteria) this;
        }

        public Criteria andPublishedAddressNotBetween(String value1, String value2) {
            addCriterion("published_address not between", value1, value2, "publishedAddress");
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