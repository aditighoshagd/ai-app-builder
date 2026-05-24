package com.aditi.project.lovable_clone.entity;

import com.aditi.project.lovable_clone.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    Project project;
    User user;
    ProjectMemberId id;
    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
