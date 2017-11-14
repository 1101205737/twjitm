package com.twjitm.common.entity.chat;

import com.twjitm.common.annotation.MessageCommandAnntation;
import com.twjitm.common.entity.BaseMessage;
import com.twjitm.common.enums.MessageComm;

/**
 * Created by 文江 on 2017/11/8.
 */

/**
 * 正常返回消息对象
 */
@MessageCommandAnntation(messagecmd = MessageComm.MESSAGE_TRUE_RETURN)
public class ResponseMessage extends BaseMessage {

    public void decodeBody(Object in) {

    }

    public void encodeBody(Object out) {

    }
}
