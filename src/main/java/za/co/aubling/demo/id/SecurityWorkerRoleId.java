package za.co.aubling.demo.id;

import java.io.Serializable;
import java.util.Objects;

public class SecurityWorkerRoleId implements Serializable {

    private String roleId;
    private String workerId;

    public SecurityWorkerRoleId() {
    }

    public SecurityWorkerRoleId(String workerId, String roleId) {
        this.roleId = roleId;
        this.workerId = workerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityWorkerRoleId securityRoleWorkerRoleId = (SecurityWorkerRoleId) o;
        return workerId.equals(securityRoleWorkerRoleId.workerId)
                && roleId.equals(securityRoleWorkerRoleId.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId, roleId);
    }
}