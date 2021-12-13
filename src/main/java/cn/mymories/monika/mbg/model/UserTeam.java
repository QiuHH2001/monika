package cn.mymories.monika.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserTeam implements Serializable {
    private String id;

    private String pkUserId;

    private String pkTeamId;

    private Date createTime;

    private Date deleteTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPkUserId() {
        return pkUserId;
    }

    public void setPkUserId(String pkUserId) {
        this.pkUserId = pkUserId;
    }

    public String getPkTeamId() {
        return pkTeamId;
    }

    public void setPkTeamId(String pkTeamId) {
        this.pkTeamId = pkTeamId;
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
        sb.append(", id=").append(id);
        sb.append(", pkUserId=").append(pkUserId);
        sb.append(", pkTeamId=").append(pkTeamId);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}