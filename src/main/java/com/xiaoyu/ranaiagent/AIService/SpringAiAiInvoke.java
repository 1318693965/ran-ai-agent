package com.xiaoyu.ranaiagent.AIService;



import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.StreamingChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

/**
 * @author xiaozhi
 * @date 2025/7/25
 */
// 取消注释即可在 SpringBoot 项目启动时执行
//@Component
public class SpringAiAiInvoke implements CommandLineRunner {

    @Resource
    private StreamingChatModel dashscopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        Flux<AssistantMessage> output = dashscopeChatModel.stream(new Prompt("你好，我是张浩然"))
                .map(response -> response.getResult().getOutput());
        System.out.println("Response: ");
        output.subscribe(message -> System.out.print(message.getText()));
        Thread.sleep(5000); // 等待流式响应完成
    }
}