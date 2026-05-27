package com.aditi.project.lovable_clone.controller;

import com.aditi.project.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.aditi.project.lovable_clone.dto.subscription.UsageTodayResponse;
import com.aditi.project.lovable_clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {
    private final UsageService usageService;
    //to get the usage for today
    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }

    //to get the limits of plan in the current cycle
    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse> getPlanLimit(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
