package com.aditi.project.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewRunning,
        int previewLimit
) {
}
