package cn.mymories.monika.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerformanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerformanceExample() {
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

        public Criteria andPkProjectIdIsNull() {
            addCriterion("pk_project_id is null");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdIsNotNull() {
            addCriterion("pk_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdEqualTo(String value) {
            addCriterion("pk_project_id =", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdNotEqualTo(String value) {
            addCriterion("pk_project_id <>", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdGreaterThan(String value) {
            addCriterion("pk_project_id >", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_project_id >=", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdLessThan(String value) {
            addCriterion("pk_project_id <", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdLessThanOrEqualTo(String value) {
            addCriterion("pk_project_id <=", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdLike(String value) {
            addCriterion("pk_project_id like", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdNotLike(String value) {
            addCriterion("pk_project_id not like", value, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdIn(List<String> values) {
            addCriterion("pk_project_id in", values, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdNotIn(List<String> values) {
            addCriterion("pk_project_id not in", values, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdBetween(String value1, String value2) {
            addCriterion("pk_project_id between", value1, value2, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andPkProjectIdNotBetween(String value1, String value2) {
            addCriterion("pk_project_id not between", value1, value2, "pkProjectId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andConnectedEndIsNull() {
            addCriterion("connected_end is null");
            return (Criteria) this;
        }

        public Criteria andConnectedEndIsNotNull() {
            addCriterion("connected_end is not null");
            return (Criteria) this;
        }

        public Criteria andConnectedEndEqualTo(Long value) {
            addCriterion("connected_end =", value, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndNotEqualTo(Long value) {
            addCriterion("connected_end <>", value, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndGreaterThan(Long value) {
            addCriterion("connected_end >", value, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndGreaterThanOrEqualTo(Long value) {
            addCriterion("connected_end >=", value, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndLessThan(Long value) {
            addCriterion("connected_end <", value, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndLessThanOrEqualTo(Long value) {
            addCriterion("connected_end <=", value, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndIn(List<Long> values) {
            addCriterion("connected_end in", values, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndNotIn(List<Long> values) {
            addCriterion("connected_end not in", values, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndBetween(Long value1, Long value2) {
            addCriterion("connected_end between", value1, value2, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedEndNotBetween(Long value1, Long value2) {
            addCriterion("connected_end not between", value1, value2, "connectedEnd");
            return (Criteria) this;
        }

        public Criteria andConnectedStartIsNull() {
            addCriterion("connected_start is null");
            return (Criteria) this;
        }

        public Criteria andConnectedStartIsNotNull() {
            addCriterion("connected_start is not null");
            return (Criteria) this;
        }

        public Criteria andConnectedStartEqualTo(Long value) {
            addCriterion("connected_start =", value, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartNotEqualTo(Long value) {
            addCriterion("connected_start <>", value, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartGreaterThan(Long value) {
            addCriterion("connected_start >", value, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartGreaterThanOrEqualTo(Long value) {
            addCriterion("connected_start >=", value, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartLessThan(Long value) {
            addCriterion("connected_start <", value, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartLessThanOrEqualTo(Long value) {
            addCriterion("connected_start <=", value, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartIn(List<Long> values) {
            addCriterion("connected_start in", values, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartNotIn(List<Long> values) {
            addCriterion("connected_start not in", values, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartBetween(Long value1, Long value2) {
            addCriterion("connected_start between", value1, value2, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andConnectedStartNotBetween(Long value1, Long value2) {
            addCriterion("connected_start not between", value1, value2, "connectedStart");
            return (Criteria) this;
        }

        public Criteria andDomCompleteIsNull() {
            addCriterion("dom_complete is null");
            return (Criteria) this;
        }

        public Criteria andDomCompleteIsNotNull() {
            addCriterion("dom_complete is not null");
            return (Criteria) this;
        }

        public Criteria andDomCompleteEqualTo(Long value) {
            addCriterion("dom_complete =", value, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteNotEqualTo(Long value) {
            addCriterion("dom_complete <>", value, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteGreaterThan(Long value) {
            addCriterion("dom_complete >", value, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteGreaterThanOrEqualTo(Long value) {
            addCriterion("dom_complete >=", value, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteLessThan(Long value) {
            addCriterion("dom_complete <", value, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteLessThanOrEqualTo(Long value) {
            addCriterion("dom_complete <=", value, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteIn(List<Long> values) {
            addCriterion("dom_complete in", values, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteNotIn(List<Long> values) {
            addCriterion("dom_complete not in", values, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteBetween(Long value1, Long value2) {
            addCriterion("dom_complete between", value1, value2, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomCompleteNotBetween(Long value1, Long value2) {
            addCriterion("dom_complete not between", value1, value2, "domComplete");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndIsNull() {
            addCriterion("dom_content_loaded_envent_end is null");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndIsNotNull() {
            addCriterion("dom_content_loaded_envent_end is not null");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndEqualTo(Long value) {
            addCriterion("dom_content_loaded_envent_end =", value, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndNotEqualTo(Long value) {
            addCriterion("dom_content_loaded_envent_end <>", value, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndGreaterThan(Long value) {
            addCriterion("dom_content_loaded_envent_end >", value, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndGreaterThanOrEqualTo(Long value) {
            addCriterion("dom_content_loaded_envent_end >=", value, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndLessThan(Long value) {
            addCriterion("dom_content_loaded_envent_end <", value, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndLessThanOrEqualTo(Long value) {
            addCriterion("dom_content_loaded_envent_end <=", value, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndIn(List<Long> values) {
            addCriterion("dom_content_loaded_envent_end in", values, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndNotIn(List<Long> values) {
            addCriterion("dom_content_loaded_envent_end not in", values, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndBetween(Long value1, Long value2) {
            addCriterion("dom_content_loaded_envent_end between", value1, value2, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEnventEndNotBetween(Long value1, Long value2) {
            addCriterion("dom_content_loaded_envent_end not between", value1, value2, "domContentLoadedEnventEnd");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartIsNull() {
            addCriterion("dom_content_loaded_event_start is null");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartIsNotNull() {
            addCriterion("dom_content_loaded_event_start is not null");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartEqualTo(Long value) {
            addCriterion("dom_content_loaded_event_start =", value, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartNotEqualTo(Long value) {
            addCriterion("dom_content_loaded_event_start <>", value, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartGreaterThan(Long value) {
            addCriterion("dom_content_loaded_event_start >", value, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartGreaterThanOrEqualTo(Long value) {
            addCriterion("dom_content_loaded_event_start >=", value, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartLessThan(Long value) {
            addCriterion("dom_content_loaded_event_start <", value, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartLessThanOrEqualTo(Long value) {
            addCriterion("dom_content_loaded_event_start <=", value, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartIn(List<Long> values) {
            addCriterion("dom_content_loaded_event_start in", values, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartNotIn(List<Long> values) {
            addCriterion("dom_content_loaded_event_start not in", values, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartBetween(Long value1, Long value2) {
            addCriterion("dom_content_loaded_event_start between", value1, value2, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomContentLoadedEventStartNotBetween(Long value1, Long value2) {
            addCriterion("dom_content_loaded_event_start not between", value1, value2, "domContentLoadedEventStart");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveIsNull() {
            addCriterion("dom_interactive is null");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveIsNotNull() {
            addCriterion("dom_interactive is not null");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveEqualTo(Long value) {
            addCriterion("dom_interactive =", value, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveNotEqualTo(Long value) {
            addCriterion("dom_interactive <>", value, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveGreaterThan(Long value) {
            addCriterion("dom_interactive >", value, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveGreaterThanOrEqualTo(Long value) {
            addCriterion("dom_interactive >=", value, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveLessThan(Long value) {
            addCriterion("dom_interactive <", value, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveLessThanOrEqualTo(Long value) {
            addCriterion("dom_interactive <=", value, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveIn(List<Long> values) {
            addCriterion("dom_interactive in", values, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveNotIn(List<Long> values) {
            addCriterion("dom_interactive not in", values, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveBetween(Long value1, Long value2) {
            addCriterion("dom_interactive between", value1, value2, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomInteractiveNotBetween(Long value1, Long value2) {
            addCriterion("dom_interactive not between", value1, value2, "domInteractive");
            return (Criteria) this;
        }

        public Criteria andDomLoadingIsNull() {
            addCriterion("dom_loading is null");
            return (Criteria) this;
        }

        public Criteria andDomLoadingIsNotNull() {
            addCriterion("dom_loading is not null");
            return (Criteria) this;
        }

        public Criteria andDomLoadingEqualTo(Long value) {
            addCriterion("dom_loading =", value, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingNotEqualTo(Long value) {
            addCriterion("dom_loading <>", value, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingGreaterThan(Long value) {
            addCriterion("dom_loading >", value, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingGreaterThanOrEqualTo(Long value) {
            addCriterion("dom_loading >=", value, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingLessThan(Long value) {
            addCriterion("dom_loading <", value, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingLessThanOrEqualTo(Long value) {
            addCriterion("dom_loading <=", value, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingIn(List<Long> values) {
            addCriterion("dom_loading in", values, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingNotIn(List<Long> values) {
            addCriterion("dom_loading not in", values, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingBetween(Long value1, Long value2) {
            addCriterion("dom_loading between", value1, value2, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomLoadingNotBetween(Long value1, Long value2) {
            addCriterion("dom_loading not between", value1, value2, "domLoading");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndIsNull() {
            addCriterion("domain_lookup_end is null");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndIsNotNull() {
            addCriterion("domain_lookup_end is not null");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndEqualTo(Long value) {
            addCriterion("domain_lookup_end =", value, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndNotEqualTo(Long value) {
            addCriterion("domain_lookup_end <>", value, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndGreaterThan(Long value) {
            addCriterion("domain_lookup_end >", value, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndGreaterThanOrEqualTo(Long value) {
            addCriterion("domain_lookup_end >=", value, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndLessThan(Long value) {
            addCriterion("domain_lookup_end <", value, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndLessThanOrEqualTo(Long value) {
            addCriterion("domain_lookup_end <=", value, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndIn(List<Long> values) {
            addCriterion("domain_lookup_end in", values, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndNotIn(List<Long> values) {
            addCriterion("domain_lookup_end not in", values, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndBetween(Long value1, Long value2) {
            addCriterion("domain_lookup_end between", value1, value2, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupEndNotBetween(Long value1, Long value2) {
            addCriterion("domain_lookup_end not between", value1, value2, "domainLookupEnd");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartIsNull() {
            addCriterion("domain_lookup_start is null");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartIsNotNull() {
            addCriterion("domain_lookup_start is not null");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartEqualTo(Long value) {
            addCriterion("domain_lookup_start =", value, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartNotEqualTo(Long value) {
            addCriterion("domain_lookup_start <>", value, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartGreaterThan(Long value) {
            addCriterion("domain_lookup_start >", value, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartGreaterThanOrEqualTo(Long value) {
            addCriterion("domain_lookup_start >=", value, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartLessThan(Long value) {
            addCriterion("domain_lookup_start <", value, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartLessThanOrEqualTo(Long value) {
            addCriterion("domain_lookup_start <=", value, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartIn(List<Long> values) {
            addCriterion("domain_lookup_start in", values, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartNotIn(List<Long> values) {
            addCriterion("domain_lookup_start not in", values, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartBetween(Long value1, Long value2) {
            addCriterion("domain_lookup_start between", value1, value2, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andDomainLookupStartNotBetween(Long value1, Long value2) {
            addCriterion("domain_lookup_start not between", value1, value2, "domainLookupStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartIsNull() {
            addCriterion("fetch_start is null");
            return (Criteria) this;
        }

        public Criteria andFetchStartIsNotNull() {
            addCriterion("fetch_start is not null");
            return (Criteria) this;
        }

        public Criteria andFetchStartEqualTo(Long value) {
            addCriterion("fetch_start =", value, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartNotEqualTo(Long value) {
            addCriterion("fetch_start <>", value, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartGreaterThan(Long value) {
            addCriterion("fetch_start >", value, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartGreaterThanOrEqualTo(Long value) {
            addCriterion("fetch_start >=", value, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartLessThan(Long value) {
            addCriterion("fetch_start <", value, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartLessThanOrEqualTo(Long value) {
            addCriterion("fetch_start <=", value, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartIn(List<Long> values) {
            addCriterion("fetch_start in", values, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartNotIn(List<Long> values) {
            addCriterion("fetch_start not in", values, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartBetween(Long value1, Long value2) {
            addCriterion("fetch_start between", value1, value2, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andFetchStartNotBetween(Long value1, Long value2) {
            addCriterion("fetch_start not between", value1, value2, "fetchStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndIsNull() {
            addCriterion("load_event_end is null");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndIsNotNull() {
            addCriterion("load_event_end is not null");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndEqualTo(Long value) {
            addCriterion("load_event_end =", value, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndNotEqualTo(Long value) {
            addCriterion("load_event_end <>", value, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndGreaterThan(Long value) {
            addCriterion("load_event_end >", value, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndGreaterThanOrEqualTo(Long value) {
            addCriterion("load_event_end >=", value, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndLessThan(Long value) {
            addCriterion("load_event_end <", value, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndLessThanOrEqualTo(Long value) {
            addCriterion("load_event_end <=", value, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndIn(List<Long> values) {
            addCriterion("load_event_end in", values, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndNotIn(List<Long> values) {
            addCriterion("load_event_end not in", values, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndBetween(Long value1, Long value2) {
            addCriterion("load_event_end between", value1, value2, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventEndNotBetween(Long value1, Long value2) {
            addCriterion("load_event_end not between", value1, value2, "loadEventEnd");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartIsNull() {
            addCriterion("load_event_start is null");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartIsNotNull() {
            addCriterion("load_event_start is not null");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartEqualTo(Long value) {
            addCriterion("load_event_start =", value, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartNotEqualTo(Long value) {
            addCriterion("load_event_start <>", value, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartGreaterThan(Long value) {
            addCriterion("load_event_start >", value, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartGreaterThanOrEqualTo(Long value) {
            addCriterion("load_event_start >=", value, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartLessThan(Long value) {
            addCriterion("load_event_start <", value, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartLessThanOrEqualTo(Long value) {
            addCriterion("load_event_start <=", value, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartIn(List<Long> values) {
            addCriterion("load_event_start in", values, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartNotIn(List<Long> values) {
            addCriterion("load_event_start not in", values, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartBetween(Long value1, Long value2) {
            addCriterion("load_event_start between", value1, value2, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andLoadEventStartNotBetween(Long value1, Long value2) {
            addCriterion("load_event_start not between", value1, value2, "loadEventStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartIsNull() {
            addCriterion("navigation_start is null");
            return (Criteria) this;
        }

        public Criteria andNavigationStartIsNotNull() {
            addCriterion("navigation_start is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationStartEqualTo(Long value) {
            addCriterion("navigation_start =", value, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartNotEqualTo(Long value) {
            addCriterion("navigation_start <>", value, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartGreaterThan(Long value) {
            addCriterion("navigation_start >", value, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartGreaterThanOrEqualTo(Long value) {
            addCriterion("navigation_start >=", value, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartLessThan(Long value) {
            addCriterion("navigation_start <", value, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartLessThanOrEqualTo(Long value) {
            addCriterion("navigation_start <=", value, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartIn(List<Long> values) {
            addCriterion("navigation_start in", values, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartNotIn(List<Long> values) {
            addCriterion("navigation_start not in", values, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartBetween(Long value1, Long value2) {
            addCriterion("navigation_start between", value1, value2, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andNavigationStartNotBetween(Long value1, Long value2) {
            addCriterion("navigation_start not between", value1, value2, "navigationStart");
            return (Criteria) this;
        }

        public Criteria andRedirectEndIsNull() {
            addCriterion("redirect_end is null");
            return (Criteria) this;
        }

        public Criteria andRedirectEndIsNotNull() {
            addCriterion("redirect_end is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectEndEqualTo(Long value) {
            addCriterion("redirect_end =", value, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndNotEqualTo(Long value) {
            addCriterion("redirect_end <>", value, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndGreaterThan(Long value) {
            addCriterion("redirect_end >", value, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndGreaterThanOrEqualTo(Long value) {
            addCriterion("redirect_end >=", value, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndLessThan(Long value) {
            addCriterion("redirect_end <", value, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndLessThanOrEqualTo(Long value) {
            addCriterion("redirect_end <=", value, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndIn(List<Long> values) {
            addCriterion("redirect_end in", values, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndNotIn(List<Long> values) {
            addCriterion("redirect_end not in", values, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndBetween(Long value1, Long value2) {
            addCriterion("redirect_end between", value1, value2, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectEndNotBetween(Long value1, Long value2) {
            addCriterion("redirect_end not between", value1, value2, "redirectEnd");
            return (Criteria) this;
        }

        public Criteria andRedirectStartIsNull() {
            addCriterion("redirect_start is null");
            return (Criteria) this;
        }

        public Criteria andRedirectStartIsNotNull() {
            addCriterion("redirect_start is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectStartEqualTo(Long value) {
            addCriterion("redirect_start =", value, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartNotEqualTo(Long value) {
            addCriterion("redirect_start <>", value, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartGreaterThan(Long value) {
            addCriterion("redirect_start >", value, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartGreaterThanOrEqualTo(Long value) {
            addCriterion("redirect_start >=", value, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartLessThan(Long value) {
            addCriterion("redirect_start <", value, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartLessThanOrEqualTo(Long value) {
            addCriterion("redirect_start <=", value, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartIn(List<Long> values) {
            addCriterion("redirect_start in", values, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartNotIn(List<Long> values) {
            addCriterion("redirect_start not in", values, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartBetween(Long value1, Long value2) {
            addCriterion("redirect_start between", value1, value2, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRedirectStartNotBetween(Long value1, Long value2) {
            addCriterion("redirect_start not between", value1, value2, "redirectStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartIsNull() {
            addCriterion("request_start is null");
            return (Criteria) this;
        }

        public Criteria andRequestStartIsNotNull() {
            addCriterion("request_start is not null");
            return (Criteria) this;
        }

        public Criteria andRequestStartEqualTo(Long value) {
            addCriterion("request_start =", value, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartNotEqualTo(Long value) {
            addCriterion("request_start <>", value, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartGreaterThan(Long value) {
            addCriterion("request_start >", value, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartGreaterThanOrEqualTo(Long value) {
            addCriterion("request_start >=", value, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartLessThan(Long value) {
            addCriterion("request_start <", value, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartLessThanOrEqualTo(Long value) {
            addCriterion("request_start <=", value, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartIn(List<Long> values) {
            addCriterion("request_start in", values, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartNotIn(List<Long> values) {
            addCriterion("request_start not in", values, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartBetween(Long value1, Long value2) {
            addCriterion("request_start between", value1, value2, "requestStart");
            return (Criteria) this;
        }

        public Criteria andRequestStartNotBetween(Long value1, Long value2) {
            addCriterion("request_start not between", value1, value2, "requestStart");
            return (Criteria) this;
        }

        public Criteria andResponseEndIsNull() {
            addCriterion("response_end is null");
            return (Criteria) this;
        }

        public Criteria andResponseEndIsNotNull() {
            addCriterion("response_end is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEndEqualTo(Long value) {
            addCriterion("response_end =", value, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndNotEqualTo(Long value) {
            addCriterion("response_end <>", value, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndGreaterThan(Long value) {
            addCriterion("response_end >", value, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndGreaterThanOrEqualTo(Long value) {
            addCriterion("response_end >=", value, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndLessThan(Long value) {
            addCriterion("response_end <", value, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndLessThanOrEqualTo(Long value) {
            addCriterion("response_end <=", value, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndIn(List<Long> values) {
            addCriterion("response_end in", values, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndNotIn(List<Long> values) {
            addCriterion("response_end not in", values, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndBetween(Long value1, Long value2) {
            addCriterion("response_end between", value1, value2, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseEndNotBetween(Long value1, Long value2) {
            addCriterion("response_end not between", value1, value2, "responseEnd");
            return (Criteria) this;
        }

        public Criteria andResponseStartIsNull() {
            addCriterion("response_start is null");
            return (Criteria) this;
        }

        public Criteria andResponseStartIsNotNull() {
            addCriterion("response_start is not null");
            return (Criteria) this;
        }

        public Criteria andResponseStartEqualTo(Long value) {
            addCriterion("response_start =", value, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartNotEqualTo(Long value) {
            addCriterion("response_start <>", value, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartGreaterThan(Long value) {
            addCriterion("response_start >", value, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartGreaterThanOrEqualTo(Long value) {
            addCriterion("response_start >=", value, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartLessThan(Long value) {
            addCriterion("response_start <", value, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartLessThanOrEqualTo(Long value) {
            addCriterion("response_start <=", value, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartIn(List<Long> values) {
            addCriterion("response_start in", values, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartNotIn(List<Long> values) {
            addCriterion("response_start not in", values, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartBetween(Long value1, Long value2) {
            addCriterion("response_start between", value1, value2, "responseStart");
            return (Criteria) this;
        }

        public Criteria andResponseStartNotBetween(Long value1, Long value2) {
            addCriterion("response_start not between", value1, value2, "responseStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartIsNull() {
            addCriterion("secure_connection_start is null");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartIsNotNull() {
            addCriterion("secure_connection_start is not null");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartEqualTo(Long value) {
            addCriterion("secure_connection_start =", value, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartNotEqualTo(Long value) {
            addCriterion("secure_connection_start <>", value, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartGreaterThan(Long value) {
            addCriterion("secure_connection_start >", value, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartGreaterThanOrEqualTo(Long value) {
            addCriterion("secure_connection_start >=", value, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartLessThan(Long value) {
            addCriterion("secure_connection_start <", value, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartLessThanOrEqualTo(Long value) {
            addCriterion("secure_connection_start <=", value, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartIn(List<Long> values) {
            addCriterion("secure_connection_start in", values, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartNotIn(List<Long> values) {
            addCriterion("secure_connection_start not in", values, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartBetween(Long value1, Long value2) {
            addCriterion("secure_connection_start between", value1, value2, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andSecureConnectionStartNotBetween(Long value1, Long value2) {
            addCriterion("secure_connection_start not between", value1, value2, "secureConnectionStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndIsNull() {
            addCriterion("unload_event_end is null");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndIsNotNull() {
            addCriterion("unload_event_end is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndEqualTo(Long value) {
            addCriterion("unload_event_end =", value, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndNotEqualTo(Long value) {
            addCriterion("unload_event_end <>", value, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndGreaterThan(Long value) {
            addCriterion("unload_event_end >", value, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndGreaterThanOrEqualTo(Long value) {
            addCriterion("unload_event_end >=", value, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndLessThan(Long value) {
            addCriterion("unload_event_end <", value, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndLessThanOrEqualTo(Long value) {
            addCriterion("unload_event_end <=", value, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndIn(List<Long> values) {
            addCriterion("unload_event_end in", values, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndNotIn(List<Long> values) {
            addCriterion("unload_event_end not in", values, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndBetween(Long value1, Long value2) {
            addCriterion("unload_event_end between", value1, value2, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventEndNotBetween(Long value1, Long value2) {
            addCriterion("unload_event_end not between", value1, value2, "unloadEventEnd");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartIsNull() {
            addCriterion("unload_event_start is null");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartIsNotNull() {
            addCriterion("unload_event_start is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartEqualTo(Long value) {
            addCriterion("unload_event_start =", value, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartNotEqualTo(Long value) {
            addCriterion("unload_event_start <>", value, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartGreaterThan(Long value) {
            addCriterion("unload_event_start >", value, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartGreaterThanOrEqualTo(Long value) {
            addCriterion("unload_event_start >=", value, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartLessThan(Long value) {
            addCriterion("unload_event_start <", value, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartLessThanOrEqualTo(Long value) {
            addCriterion("unload_event_start <=", value, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartIn(List<Long> values) {
            addCriterion("unload_event_start in", values, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartNotIn(List<Long> values) {
            addCriterion("unload_event_start not in", values, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartBetween(Long value1, Long value2) {
            addCriterion("unload_event_start between", value1, value2, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andUnloadEventStartNotBetween(Long value1, Long value2) {
            addCriterion("unload_event_start not between", value1, value2, "unloadEventStart");
            return (Criteria) this;
        }

        public Criteria andMetricFpIsNull() {
            addCriterion("metric_fp is null");
            return (Criteria) this;
        }

        public Criteria andMetricFpIsNotNull() {
            addCriterion("metric_fp is not null");
            return (Criteria) this;
        }

        public Criteria andMetricFpEqualTo(Long value) {
            addCriterion("metric_fp =", value, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpNotEqualTo(Long value) {
            addCriterion("metric_fp <>", value, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpGreaterThan(Long value) {
            addCriterion("metric_fp >", value, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_fp >=", value, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpLessThan(Long value) {
            addCriterion("metric_fp <", value, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpLessThanOrEqualTo(Long value) {
            addCriterion("metric_fp <=", value, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpIn(List<Long> values) {
            addCriterion("metric_fp in", values, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpNotIn(List<Long> values) {
            addCriterion("metric_fp not in", values, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpBetween(Long value1, Long value2) {
            addCriterion("metric_fp between", value1, value2, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFpNotBetween(Long value1, Long value2) {
            addCriterion("metric_fp not between", value1, value2, "metricFp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpIsNull() {
            addCriterion("metric_fcp is null");
            return (Criteria) this;
        }

        public Criteria andMetricFcpIsNotNull() {
            addCriterion("metric_fcp is not null");
            return (Criteria) this;
        }

        public Criteria andMetricFcpEqualTo(Long value) {
            addCriterion("metric_fcp =", value, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpNotEqualTo(Long value) {
            addCriterion("metric_fcp <>", value, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpGreaterThan(Long value) {
            addCriterion("metric_fcp >", value, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_fcp >=", value, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpLessThan(Long value) {
            addCriterion("metric_fcp <", value, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpLessThanOrEqualTo(Long value) {
            addCriterion("metric_fcp <=", value, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpIn(List<Long> values) {
            addCriterion("metric_fcp in", values, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpNotIn(List<Long> values) {
            addCriterion("metric_fcp not in", values, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpBetween(Long value1, Long value2) {
            addCriterion("metric_fcp between", value1, value2, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricFcpNotBetween(Long value1, Long value2) {
            addCriterion("metric_fcp not between", value1, value2, "metricFcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpIsNull() {
            addCriterion("metric_lcp is null");
            return (Criteria) this;
        }

        public Criteria andMetricLcpIsNotNull() {
            addCriterion("metric_lcp is not null");
            return (Criteria) this;
        }

        public Criteria andMetricLcpEqualTo(Long value) {
            addCriterion("metric_lcp =", value, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpNotEqualTo(Long value) {
            addCriterion("metric_lcp <>", value, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpGreaterThan(Long value) {
            addCriterion("metric_lcp >", value, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_lcp >=", value, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpLessThan(Long value) {
            addCriterion("metric_lcp <", value, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpLessThanOrEqualTo(Long value) {
            addCriterion("metric_lcp <=", value, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpIn(List<Long> values) {
            addCriterion("metric_lcp in", values, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpNotIn(List<Long> values) {
            addCriterion("metric_lcp not in", values, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpBetween(Long value1, Long value2) {
            addCriterion("metric_lcp between", value1, value2, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricLcpNotBetween(Long value1, Long value2) {
            addCriterion("metric_lcp not between", value1, value2, "metricLcp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpIsNull() {
            addCriterion("metric_fmp is null");
            return (Criteria) this;
        }

        public Criteria andMetricFmpIsNotNull() {
            addCriterion("metric_fmp is not null");
            return (Criteria) this;
        }

        public Criteria andMetricFmpEqualTo(Long value) {
            addCriterion("metric_fmp =", value, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpNotEqualTo(Long value) {
            addCriterion("metric_fmp <>", value, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpGreaterThan(Long value) {
            addCriterion("metric_fmp >", value, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_fmp >=", value, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpLessThan(Long value) {
            addCriterion("metric_fmp <", value, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpLessThanOrEqualTo(Long value) {
            addCriterion("metric_fmp <=", value, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpIn(List<Long> values) {
            addCriterion("metric_fmp in", values, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpNotIn(List<Long> values) {
            addCriterion("metric_fmp not in", values, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpBetween(Long value1, Long value2) {
            addCriterion("metric_fmp between", value1, value2, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricFmpNotBetween(Long value1, Long value2) {
            addCriterion("metric_fmp not between", value1, value2, "metricFmp");
            return (Criteria) this;
        }

        public Criteria andMetricClsIsNull() {
            addCriterion("metric_cls is null");
            return (Criteria) this;
        }

        public Criteria andMetricClsIsNotNull() {
            addCriterion("metric_cls is not null");
            return (Criteria) this;
        }

        public Criteria andMetricClsEqualTo(Long value) {
            addCriterion("metric_cls =", value, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsNotEqualTo(Long value) {
            addCriterion("metric_cls <>", value, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsGreaterThan(Long value) {
            addCriterion("metric_cls >", value, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_cls >=", value, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsLessThan(Long value) {
            addCriterion("metric_cls <", value, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsLessThanOrEqualTo(Long value) {
            addCriterion("metric_cls <=", value, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsIn(List<Long> values) {
            addCriterion("metric_cls in", values, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsNotIn(List<Long> values) {
            addCriterion("metric_cls not in", values, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsBetween(Long value1, Long value2) {
            addCriterion("metric_cls between", value1, value2, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricClsNotBetween(Long value1, Long value2) {
            addCriterion("metric_cls not between", value1, value2, "metricCls");
            return (Criteria) this;
        }

        public Criteria andMetricFidIsNull() {
            addCriterion("metric_fid is null");
            return (Criteria) this;
        }

        public Criteria andMetricFidIsNotNull() {
            addCriterion("metric_fid is not null");
            return (Criteria) this;
        }

        public Criteria andMetricFidEqualTo(Long value) {
            addCriterion("metric_fid =", value, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidNotEqualTo(Long value) {
            addCriterion("metric_fid <>", value, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidGreaterThan(Long value) {
            addCriterion("metric_fid >", value, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_fid >=", value, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidLessThan(Long value) {
            addCriterion("metric_fid <", value, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidLessThanOrEqualTo(Long value) {
            addCriterion("metric_fid <=", value, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidIn(List<Long> values) {
            addCriterion("metric_fid in", values, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidNotIn(List<Long> values) {
            addCriterion("metric_fid not in", values, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidBetween(Long value1, Long value2) {
            addCriterion("metric_fid between", value1, value2, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricFidNotBetween(Long value1, Long value2) {
            addCriterion("metric_fid not between", value1, value2, "metricFid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidIsNull() {
            addCriterion("metric_mpfid is null");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidIsNotNull() {
            addCriterion("metric_mpfid is not null");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidEqualTo(Long value) {
            addCriterion("metric_mpfid =", value, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidNotEqualTo(Long value) {
            addCriterion("metric_mpfid <>", value, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidGreaterThan(Long value) {
            addCriterion("metric_mpfid >", value, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_mpfid >=", value, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidLessThan(Long value) {
            addCriterion("metric_mpfid <", value, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidLessThanOrEqualTo(Long value) {
            addCriterion("metric_mpfid <=", value, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidIn(List<Long> values) {
            addCriterion("metric_mpfid in", values, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidNotIn(List<Long> values) {
            addCriterion("metric_mpfid not in", values, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidBetween(Long value1, Long value2) {
            addCriterion("metric_mpfid between", value1, value2, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricMpfidNotBetween(Long value1, Long value2) {
            addCriterion("metric_mpfid not between", value1, value2, "metricMpfid");
            return (Criteria) this;
        }

        public Criteria andMetricTtiIsNull() {
            addCriterion("metric_tti is null");
            return (Criteria) this;
        }

        public Criteria andMetricTtiIsNotNull() {
            addCriterion("metric_tti is not null");
            return (Criteria) this;
        }

        public Criteria andMetricTtiEqualTo(Long value) {
            addCriterion("metric_tti =", value, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiNotEqualTo(Long value) {
            addCriterion("metric_tti <>", value, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiGreaterThan(Long value) {
            addCriterion("metric_tti >", value, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_tti >=", value, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiLessThan(Long value) {
            addCriterion("metric_tti <", value, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiLessThanOrEqualTo(Long value) {
            addCriterion("metric_tti <=", value, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiIn(List<Long> values) {
            addCriterion("metric_tti in", values, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiNotIn(List<Long> values) {
            addCriterion("metric_tti not in", values, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiBetween(Long value1, Long value2) {
            addCriterion("metric_tti between", value1, value2, "metricTti");
            return (Criteria) this;
        }

        public Criteria andMetricTtiNotBetween(Long value1, Long value2) {
            addCriterion("metric_tti not between", value1, value2, "metricTti");
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