package com.twjitm.common.entity.chat;

import com.twjitm.common.annotation.MessageCommandAnntation;
import com.twjitm.common.enums.MessageComm;
import com.twjitm.common.netstack.entity.AbstractNettyNetProtoBufMessage;
import io.netty.handler.codec.CodecException;

/**
 * Created by 文江 on 2017/11/8.
 */

/**
 * 正常返回消息对象
 */
@MessageCommandAnntation(messagecmd = MessageComm.MESSAGE_TRUE_RETURN)
public class ResponseMessage extends AbstractNettyNetProtoBufMessage {


    public ResponseMessage(String json) {
        super(json);
    }

    public void release() throws CodecException {

    }

    public void encodeNetProtoBufMessageBody() throws CodecException, Exception {

    }

    public void decoderNetProtoBufMessageBody() throws CodecException, Exception {

    }

    public void decoderNetJsonMessageBody(String json) {

    }

    public void encodeNetJsonMessageBody(String json) {

    }
}
