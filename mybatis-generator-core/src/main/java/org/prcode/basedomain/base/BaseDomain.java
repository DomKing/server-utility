package org.prcode.basedomain.base;

import java.util.Date;

/**
 * @ClassName: BaseDomain
 * @Date: 2017-3-25 19:45
 * @Auther: kangduo
 * @Description: (数据库表需要继承的基类)
 */
public class BaseDomain {

    private Date sysAddTime;
    private Date sysUpdTime;
    private Long sysAddUser;
    private Long sysUpdUser;
    private Boolean sysDelState;

    public Date getSysAddTime() {
        return sysAddTime;
    }

    public void setSysAddTime(Date sysAddTime) {
        this.sysAddTime = sysAddTime;
    }

    public Date getSysUpdTime() {
        return sysUpdTime;
    }

    public void setSysUpdTime(Date sysUpdTime) {
        this.sysUpdTime = sysUpdTime;
    }

    public Long getSysAddUser() {
        return sysAddUser;
    }

    public void setSysAddUser(Long sysAddUser) {
        this.sysAddUser = sysAddUser;
    }

    public Long getSysUpdUser() {
        return sysUpdUser;
    }

    public void setSysUpdUser(Long sysUpdUser) {
        this.sysUpdUser = sysUpdUser;
    }

    public Boolean getSysDelState() {
        return sysDelState;
    }

    public void setSysDelState(Boolean sysDelState) {
        this.sysDelState = sysDelState;
    }
}
