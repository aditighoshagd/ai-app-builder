package com.aditi.project.lovable_clone.controller;

import com.aditi.project.lovable_clone.service.FinalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {

    private final FinalService finalService;

    @GetMapping
    public ResponseEntity


}
