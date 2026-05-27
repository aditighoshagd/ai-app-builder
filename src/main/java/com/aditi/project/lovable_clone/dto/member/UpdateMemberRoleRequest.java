package com.aditi.project.lovable_clone.dto.member;

import com.aditi.project.lovable_clone.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
