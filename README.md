Real-Time Code Editor Backend (Spring Boot + Gemini AI)

This is a Java Spring Boot backend application for a real-time collaborative code editor.  
It uses Google Gemini API to provide AI-powered code completion suggestions based on the input

Features

-  AI code completion using Gemini API
-  RESTful API built with Spring Boot
-  Clean modular structure (Controller, Service, Model)
-  Configurable API key via `application.yml`
-  JSON-based request and response for easy frontend integration
-  Supports multiple programming languages (JS, TS, Java, etc.)



## Tech Stack

Technology: 

 Language | Java 17+ 
 Framework | Spring Boot 3.x 
 Build Tool | Maven |
 HTTP Client | Java 11+ `HttpClient
 JSON Parser | Jackson (`ObjectMapper`)
  AI API | Google Gemini (Generative Language API) 
  IDE | Eclipse

Configuration

Update your `application.yml` file:

server:
  port: 8085

gemini:
  api:
    key: "YOUR_GEMINI_API_KEY"