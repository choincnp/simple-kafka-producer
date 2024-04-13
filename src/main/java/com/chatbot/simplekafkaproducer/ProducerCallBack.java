package com.chatbot.simplekafkaproducer;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ProducerCallBack implements Callback {
	private final static Logger logger = LoggerFactory.getLogger(ProducerCallBack.class);
	@Override
	public void onCompletion(RecordMetadata metadata, Exception exception) {
		if (exception != null){
			logger.error(exception.getMessage(), exception);
		} else {
			logger.info(metadata.toString());
		}
	}
}
