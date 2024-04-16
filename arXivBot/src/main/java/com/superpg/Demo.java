package com.superpg;

import dev.langchain4j.model.openai.OpenAiChatModel;

public class Demo {
    private static final String apiKey = "demo";

    public static void main(String[] args) {
        OpenAiChatModel model = OpenAiChatModel.withApiKey(apiKey);

        String answer = model.generate("What is a chatbot?");
        System.out.println(answer);
    }
}
