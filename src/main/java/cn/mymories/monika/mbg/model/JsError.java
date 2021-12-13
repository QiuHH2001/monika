package cn.mymories.monika.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class JsError implements Serializable {
    /**
     * 项目ID，将JS Error与项目对应
     *
     * @mbg.generated
     */
    private String pkProjectId;

    /**
     * 会话ID，用来判定不同的用户
     *
     * @mbg.generated
     */
    private String sessionId;

    /**
     * 错误名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 错误信息
     *
     * @mbg.generated
     */
    private String message;

    /**
     * 错误内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 错误对应的浏览器
     *
     * @mbg.generated
     */
    private String platform;

    /**
     * 错误对应的操作系统
     *
     * @mbg.generated
     */
    private String os;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        sb.append(", name=").append(name);
        sb.append(", message=").append(message);
        sb.append(", content=").append(content);
        sb.append(", platform=").append(platform);
        sb.append(", os=").append(os);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}