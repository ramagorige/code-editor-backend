package com.example.editor.model;

import java.util.List;

public class CompletionResponse {
    private List<Suggestion> suggestions;

    public List<Suggestion> getSuggestions() { return suggestions; }
    public void setSuggestions(List<Suggestion> suggestions) { this.suggestions = suggestions; }

    public static class Suggestion {
        private String title;
        private String content;
        private String source;

        public Suggestion() {}

        public Suggestion(String title, String content, String source) {
            this.title = title;
            this.content = content;
            this.source = source;
        }

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getContent() { return content; }
        public void setContent(String content) { this.content = content; }

        public String getSource() { return source; }
        public void setSource(String source) { this.source = source; }
    }
}
