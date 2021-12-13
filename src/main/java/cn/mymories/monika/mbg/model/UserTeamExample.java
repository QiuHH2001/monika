package cn.mymories.monika.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTeamExample() {
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

        public Criteria andPkUserIdIsNull() {
            addCriterion("pk_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPkUserIdIsNotNull() {
            addCriterion("pk_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkUserIdEqualTo(String value) {
            addCriterion("pk_user_id =", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotEqualTo(String value) {
            addCriterion("pk_user_id <>", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdGreaterThan(String value) {
            addCriterion("pk_user_id >", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_user_id >=", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdLessThan(String value) {
            addCriterion("pk_user_id <", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdLessThanOrEqualTo(String value) {
            addCriterion("pk_user_id <=", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdLike(String value) {
            addCriterion("pk_user_id like", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotLike(String value) {
            addCriterion("pk_user_id not like", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdIn(List<String> values) {
            addCriterion("pk_user_id in", values, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotIn(List<String> values) {
            addCriterion("pk_user_id not in", values, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdBetween(String value1, String value2) {
            addCriterion("pk_user_id between", value1, value2, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotBetween(String value1, String value2) {
            addCriterion("pk_user_id not between", value1, value2, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdIsNull() {
            addCriterion("pk_team_id is null");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdIsNotNull() {
            addCriterion("pk_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdEqualTo(String value) {
            addCriterion("pk_team_id =", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdNotEqualTo(String value) {
            addCriterion("pk_team_id <>", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdGreaterThan(String value) {
            addCriterion("pk_team_id >", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_team_id >=", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdLessThan(String value) {
            addCriterion("pk_team_id <", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdLessThanOrEqualTo(String value) {
            addCriterion("pk_team_id <=", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdLike(String value) {
            addCriterion("pk_team_id like", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdNotLike(String value) {
            addCriterion("pk_team_id not like", value, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdIn(List<String> values) {
            addCriterion("pk_team_id in", values, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdNotIn(List<String> values) {
            addCriterion("pk_team_id not in", values, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdBetween(String value1, String value2) {
            addCriterion("pk_team_id between", value1, value2, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andPkTeamIdNotBetween(String value1, String value2) {
            addCriterion("pk_team_id not between", value1, value2, "pkTeamId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
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