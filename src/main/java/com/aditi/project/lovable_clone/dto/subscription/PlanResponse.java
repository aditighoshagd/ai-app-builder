package com.aditi.project.lovable_clone.dto.subscription;

public record PlanResponse(
        Long id,

        String name,
        String price,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Integer maxPreviews, // max no of previews allowed per plan
        Boolean unlimitedAi
) {
}
