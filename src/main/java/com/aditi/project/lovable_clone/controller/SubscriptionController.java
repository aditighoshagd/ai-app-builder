package com.aditi.project.lovable_clone.controller;

import com.aditi.project.lovable_clone.dto.subscription.*;
import com.aditi.project.lovable_clone.service.PlanService;
import com.aditi.project.lovable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SubscriptionController {
    private final SubscriptionService subscriptionService;
    private final PlanService planService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
        Long userId=1L;
        return ResponseEntity.ok(subscriptionService.getCurrentResponse(userId));
    }
    @PostMapping("api/stripe/checkout")
    public ResponseEntity<CheckOutResponse> createcheckoutResponse(
            @RequestBody CheckOutRequest request
    ){
       Long userId= 1L;
       return ResponseEntity.ok(subscriptionService.createCheckOutSessionUrl(request,userId));
    }
    @PostMapping("api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal(){
        Long userId=1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }




}
