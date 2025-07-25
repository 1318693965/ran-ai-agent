package com.xiaoyu.ranaiagent.AIService;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

/**
 * @author xiaozhi
 * @date 2025/7/25
 */
public class LangChainAiInvoke {

    public static void main(String[] args) {
        // 替换为你的API密钥
        String apiKey = "你的通义千问API密钥";

        // 创建Qwen聊天模型
//        ChatLanguageModel model = QwenChatModel.builder()
//                .apiKey(apiKey)
//                .modelName("qwen-max") // 模型名称，如qwen-max、qwen-plus等
//                .temperature(0.7F)     // 可设置温度参数，控制生成内容的随机性
//                .build();
//
//        // 发送消息并获取响应
//        String prompt = "我是程序员鱼皮，这是编程导航 codefather.cn 的原创项目教程";
//        String response = model.generate(prompt);

        // 输出结果
//        System.out.println("问题: " + prompt);
//        System.out.println("回答: " + response);
    }
}
