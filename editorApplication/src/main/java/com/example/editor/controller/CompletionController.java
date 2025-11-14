package com.example.editor.controller;

import com.example.editor.model.CompletionRequest;
import com.example.editor.model.CompletionResponse;
import com.example.editor.service.GeminiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CompletionController {

    private final GeminiService geminiService = new GeminiService();

    @PostMapping("/complete")
    public ResponseEntity<CompletionResponse> complete(@RequestBody CompletionRequest req) {
        CompletionResponse res = geminiService.getCompletion(req);
        return ResponseEntity.ok(res);
    }
}
