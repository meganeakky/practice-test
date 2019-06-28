package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

import com.example.config.IntegrationConfig;

@SpringBootApplication
public class HelloWorld {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	public static void main(String[] args) {
//		integrationにすることを宣言したIntegrationConfigクラスを引数にしたAbstractApplicationContext型のオブジェクト「context」
		try (AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(IntegrationConfig.class)) {

//			contextの時のMessageChannelクラスがinputChannel(Beanから取り込む)
			MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);

            PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);
//            今回はGenericMessage〈String〉型のオブジェクトをメッセージとして送っている
            inputChannel.send(new GenericMessage<String>("Spring Integration"));
//          Sendしたデータを受け取りログとして出力する(今回は加工せずStringのまま)現場ではログを見ることが多くなるとのことなので
//            六の生成の仕方も覚えておくこと
            logger.info(outputChannel.receive().getPayload().toString());
		}
	}

}