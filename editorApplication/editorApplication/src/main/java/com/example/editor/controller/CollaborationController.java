package com.example.editor.controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CollaborationController {

    private final SimpMessagingTemplate messagingTemplate = null;

    @MessageMapping("/edit/{roomId}")
    public void handleEdit(@DestinationVariable String roomId, String content) {
        messagingTemplate.convertAndSend("/topic/room/" + roomId, content);
    }
}
