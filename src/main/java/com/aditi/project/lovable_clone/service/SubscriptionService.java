package com.aditi.project.lovable_clone.service;

import com.aditi.project.lovable_clone.dto.subscription.CheckOutRequest;
import com.aditi.project.lovable_clone.dto.subscription.CheckOutResponse;
import com.aditi.project.lovable_clone.dto.subscription.PortalResponse;
import com.aditi.project.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentResponse(Long userId);

 CheckOutResponse createCheckOutSessionUrl(CheckOutRequest request, Long userId);

 PortalResponse openCustomerPortal(Long userId);
}
