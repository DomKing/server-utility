package org.prcode.basedomain.base;

import java.util.Date;

/**
 * @ClassName: BaseDomain
 * @Date: 2017-3-25 19:45
 * @Auther: kangduo
 * @Description: (数据库表需要继承的基类)
 */
public class BaseDomain {

    private Date sys0AddTime;
    private Date sys0UpdTime;
    private Long sysDelUser;
    private Long sys0AddUser;
    private Long sys0UpdUser;
    private Long sys0DelUser;
    private Byte sysDelState;

    public Date getSys0AddTime() {
        return sys0AddTime;
    }

    public void setSys0AddTime(Date sys0AddTime) {
        this.sys0AddTime = sys0AddTime;
    }

    public Date getSys0UpdTime() {
        return sys0UpdTime;
    }

    public void setSys0UpdTime(Date sys0UpdTime) {
        this.sys0UpdTime = sys0UpdTime;
    }

    public Long getSysDelUser() {
        return sysDelUser;
    }

    public void setSysDelUser(Long sysDelUser) {
        this.sysDelUser = sysDelUser;
    }

    public Long getSys0AddUser() {
        return sys0AddUser;
    }

    public void setSys0AddUser(Long sys0AddUser) {
        this.sys0AddUser = sys0AddUser;
    }

    public Long getSys0UpdUser() {
        return sys0UpdUser;
    }

    public void setSys0UpdUser(Long sys0UpdUser) {
        this.sys0UpdUser = sys0UpdUser;
    }

    public Long getSys0DelUser() {
        return sys0DelUser;
    }

    public void setSys0DelUser(Long sys0DelUser) {
        this.sys0DelUser = sys0DelUser;
    }

    public Byte getSysDelState() {
        return sysDelState;
    }

    public void setSysDelState(Byte sysDelState) {
        this.sysDelState = sysDelState;
    }
}
