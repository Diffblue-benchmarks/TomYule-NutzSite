package io.nutz.nutzsite.module.sys.models;

import io.nutz.nutzsite.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

/**
 * 角色表
 */
@Table("sys_role")
public class Role  extends Model implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column
    @Name
    @Comment("ID")
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Prev(els = {@EL("uuid()")})
    private String id;

    /** 角色名称 */
    @Column("role_name")
    @Comment("角色名称 ")
    private String roleName;

    /** 角色权限 */
    @Column("role_key")
    @Comment("角色权限 ")
    private String roleKey;

    /** 角色排序 */
    @Column("role_sort")
    @Comment("角色排序 ")
    private String roleSort;

    /** 数据范围（1：所有数据权限；2：自定义数据权限） */
    @Column("data_scope")
    @Comment("数据范围 ")
    private String dataScope;

    /** 角色状态（0正常 1停用） */
    @Column("status")
    @Comment("角色状态（0正常 1停用） ")
    private boolean status;

    /** 删除标志（0代表存在 1代表删除） */
    @Column("del_flag")
    @Comment("删除标记")
    @Prev(els = @EL("$me.flag()"))
    @ColDefine(type = ColType.BOOLEAN)
    private boolean delFlag;

    /** 菜单组 */
    private Long[] menuIds;

    /** 部门组（数据权限） */
    private Long[] deptIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(String roleSort) {
        this.roleSort = roleSort;
    }

    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Long[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(Long[] menuIds) {
        this.menuIds = menuIds;
    }

    public Long[] getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(Long[] deptIds) {
        this.deptIds = deptIds;
    }
}
