package cn.mymories.monika.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Performance implements Serializable {
    /**
     * 项目ID，将performance与项目对应
     *
     * @mbg.generated
     */
    private String pkProjectId;

    /**
     * 会话ID
     *
     * @mbg.generated
     */
    private String sessionId;

    /**
     * 对应的浏览器
     *
     * @mbg.generated
     */
    private String platform;

    /**
     * 对应的操作系统
     *
     * @mbg.generated
     */
    private String os;

    /**
     * TCP连接结束时间
     *
     * @mbg.generated
     */
    private Long connectedEnd;

    /**
     * TCP连接开始时间
     *
     * @mbg.generated
     */
    private Long connectedStart;

    /**
     * dom树解析完成
     *
     * @mbg.generated
     */
    private Long domComplete;

    /**
     * domContentLoaded事件结束时间
     *
     * @mbg.generated
     */
    private Long domContentLoadedEnventEnd;

    /**
     * domContentLoaded事件开始时间
     *
     * @mbg.generated
     */
    private Long domContentLoadedEventStart;

    /**
     * dom树开始解析
     *
     * @mbg.generated
     */
    private Long domInteractive;

    /**
     * 解析开始时间
     *
     * @mbg.generated
     */
    private Long domLoading;

    /**
     * DNS结束查询时间
     *
     * @mbg.generated
     */
    private Long domainLookupEnd;

    /**
     * DNS开始查询时间
     *
     * @mbg.generated
     */
    private Long domainLookupStart;

    /**
     * 开始检查缓存或获取资源的时间
     *
     * @mbg.generated
     */
    private Long fetchStart;

    /**
     * onload结束时间
     *
     * @mbg.generated
     */
    private Long loadEventEnd;

    /**
     * onload开始时间
     *
     * @mbg.generated
     */
    private Long loadEventStart;

    /**
     * 开始加载页面的时间
     *
     * @mbg.generated
     */
    private Long navigationStart;

    /**
     * 重定向结束时间
     *
     * @mbg.generated
     */
    private Long redirectEnd;

    /**
     * 重定向开始时间
     *
     * @mbg.generated
     */
    private Long redirectStart;

    /**
     * 请求开始时间
     *
     * @mbg.generated
     */
    private Long requestStart;

    /**
     * 响应结束时间
     *
     * @mbg.generated
     */
    private Long responseEnd;

    /**
     * 响应开始时间
     *
     * @mbg.generated
     */
    private Long responseStart;

    /**
     * 安全连接开始时间
     *
     * @mbg.generated
     */
    private Long secureConnectionStart;

    /**
     * 前一个文档unload结束的时间
     *
     * @mbg.generated
     */
    private Long unloadEventEnd;

    /**
     * 前一个文档unload开始的时间
     *
     * @mbg.generated
     */
    private Long unloadEventStart;

    /**
     * 首次渲染的时间
     *
     * @mbg.generated
     */
    private Long metricFp;

    /**
     * 首次有内容渲染的时间
     *
     * @mbg.generated
     */
    private Long metricFcp;

    /**
     * 最大内容绘制时间
     *
     * @mbg.generated
     */
    private Long metricLcp;

    /**
     * 首次有效绘制时间
     *
     * @mbg.generated
     */
    private Long metricFmp;

    /**
     * 页面布局变化的累计偏移指标
     *
     * @mbg.generated
     */
    private Long metricCls;

    /**
     * 用户与页面首次交互所需时间
     *
     * @mbg.generated
     */
    private Long metricFid;

    /**
     * 用户与页面首次交互可能花费最长时间
     *
     * @mbg.generated
     */
    private Long metricMpfid;

    /**
     * 完全可交互时间
     *
     * @mbg.generated
     */
    private Long metricTti;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 删除时间
     *
     * @mbg.generated
     */
    private Date deleteTime;

    private static final long serialVersionUID = 1L;

    public String getPkProjectId() {
        return pkProjectId;
    }

    public void setPkProjectId(String pkProjectId) {
        this.pkProjectId = pkProjectId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Long getConnectedEnd() {
        return connectedEnd;
    }

    public void setConnectedEnd(Long connectedEnd) {
        this.connectedEnd = connectedEnd;
    }

    public Long getConnectedStart() {
        return connectedStart;
    }

    public void setConnectedStart(Long connectedStart) {
        this.connectedStart = connectedStart;
    }

    public Long getDomComplete() {
        return domComplete;
    }

    public void setDomComplete(Long domComplete) {
        this.domComplete = domComplete;
    }

    public Long getDomContentLoadedEnventEnd() {
        return domContentLoadedEnventEnd;
    }

    public void setDomContentLoadedEnventEnd(Long domContentLoadedEnventEnd) {
        this.domContentLoadedEnventEnd = domContentLoadedEnventEnd;
    }

    public Long getDomContentLoadedEventStart() {
        return domContentLoadedEventStart;
    }

    public void setDomContentLoadedEventStart(Long domContentLoadedEventStart) {
        this.domContentLoadedEventStart = domContentLoadedEventStart;
    }

    public Long getDomInteractive() {
        return domInteractive;
    }

    public void setDomInteractive(Long domInteractive) {
        this.domInteractive = domInteractive;
    }

    public Long getDomLoading() {
        return domLoading;
    }

    public void setDomLoading(Long domLoading) {
        this.domLoading = domLoading;
    }

    public Long getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public void setDomainLookupEnd(Long domainLookupEnd) {
        this.domainLookupEnd = domainLookupEnd;
    }

    public Long getDomainLookupStart() {
        return domainLookupStart;
    }

    public void setDomainLookupStart(Long domainLookupStart) {
        this.domainLookupStart = domainLookupStart;
    }

    public Long getFetchStart() {
        return fetchStart;
    }

    public void setFetchStart(Long fetchStart) {
        this.fetchStart = fetchStart;
    }

    public Long getLoadEventEnd() {
        return loadEventEnd;
    }

    public void setLoadEventEnd(Long loadEventEnd) {
        this.loadEventEnd = loadEventEnd;
    }

    public Long getLoadEventStart() {
        return loadEventStart;
    }

    public void setLoadEventStart(Long loadEventStart) {
        this.loadEventStart = loadEventStart;
    }

    public Long getNavigationStart() {
        return navigationStart;
    }

    public void setNavigationStart(Long navigationStart) {
        this.navigationStart = navigationStart;
    }

    public Long getRedirectEnd() {
        return redirectEnd;
    }

    public void setRedirectEnd(Long redirectEnd) {
        this.redirectEnd = redirectEnd;
    }

    public Long getRedirectStart() {
        return redirectStart;
    }

    public void setRedirectStart(Long redirectStart) {
        this.redirectStart = redirectStart;
    }

    public Long getRequestStart() {
        return requestStart;
    }

    public void setRequestStart(Long requestStart) {
        this.requestStart = requestStart;
    }

    public Long getResponseEnd() {
        return responseEnd;
    }

    public void setResponseEnd(Long responseEnd) {
        this.responseEnd = responseEnd;
    }

    public Long getResponseStart() {
        return responseStart;
    }

    public void setResponseStart(Long responseStart) {
        this.responseStart = responseStart;
    }

    public Long getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public void setSecureConnectionStart(Long secureConnectionStart) {
        this.secureConnectionStart = secureConnectionStart;
    }

    public Long getUnloadEventEnd() {
        return unloadEventEnd;
    }

    public void setUnloadEventEnd(Long unloadEventEnd) {
        this.unloadEventEnd = unloadEventEnd;
    }

    public Long getUnloadEventStart() {
        return unloadEventStart;
    }

    public void setUnloadEventStart(Long unloadEventStart) {
        this.unloadEventStart = unloadEventStart;
    }

    public Long getMetricFp() {
        return metricFp;
    }

    public void setMetricFp(Long metricFp) {
        this.metricFp = metricFp;
    }

    public Long getMetricFcp() {
        return metricFcp;
    }

    public void setMetricFcp(Long metricFcp) {
        this.metricFcp = metricFcp;
    }

    public Long getMetricLcp() {
        return metricLcp;
    }

    public void setMetricLcp(Long metricLcp) {
        this.metricLcp = metricLcp;
    }

    public Long getMetricFmp() {
        return metricFmp;
    }

    public void setMetricFmp(Long metricFmp) {
        this.metricFmp = metricFmp;
    }

    public Long getMetricCls() {
        return metricCls;
    }

    public void setMetricCls(Long metricCls) {
        this.metricCls = metricCls;
    }

    public Long getMetricFid() {
        return metricFid;
    }

    public void setMetricFid(Long metricFid) {
        this.metricFid = metricFid;
    }

    public Long getMetricMpfid() {
        return metricMpfid;
    }

    public void setMetricMpfid(Long metricMpfid) {
        this.metricMpfid = metricMpfid;
    }

    public Long getMetricTti() {
        return metricTti;
    }

    public void setMetricTti(Long metricTti) {
        this.metricTti = metricTti;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkProjectId=").append(pkProjectId);
        sb.append(", sessionId=").append(sessionId);
        sb.append(", platform=").append(platform);
        sb.append(", os=").append(os);
        sb.append(", connectedEnd=").append(connectedEnd);
        sb.append(", connectedStart=").append(connectedStart);
        sb.append(", domComplete=").append(domComplete);
        sb.append(", domContentLoadedEnventEnd=").append(domContentLoadedEnventEnd);
        sb.append(", domContentLoadedEventStart=").append(domContentLoadedEventStart);
        sb.append(", domInteractive=").append(domInteractive);
        sb.append(", domLoading=").append(domLoading);
        sb.append(", domainLookupEnd=").append(domainLookupEnd);
        sb.append(", domainLookupStart=").append(domainLookupStart);
        sb.append(", fetchStart=").append(fetchStart);
        sb.append(", loadEventEnd=").append(loadEventEnd);
        sb.append(", loadEventStart=").append(loadEventStart);
        sb.append(", navigationStart=").append(navigationStart);
        sb.append(", redirectEnd=").append(redirectEnd);
        sb.append(", redirectStart=").append(redirectStart);
        sb.append(", requestStart=").append(requestStart);
        sb.append(", responseEnd=").append(responseEnd);
        sb.append(", responseStart=").append(responseStart);
        sb.append(", secureConnectionStart=").append(secureConnectionStart);
        sb.append(", unloadEventEnd=").append(unloadEventEnd);
        sb.append(", unloadEventStart=").append(unloadEventStart);
        sb.append(", metricFp=").append(metricFp);
        sb.append(", metricFcp=").append(metricFcp);
        sb.append(", metricLcp=").append(metricLcp);
        sb.append(", metricFmp=").append(metricFmp);
        sb.append(", metricCls=").append(metricCls);
        sb.append(", metricFid=").append(metricFid);
        sb.append(", metricMpfid=").append(metricMpfid);
        sb.append(", metricTti=").append(metricTti);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}