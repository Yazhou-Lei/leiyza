package com.leiyza.communicate;


import com.leiyza.model.User;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 6L;
    private MessageHead messageHead;
    private TextMessage textMessage;
    private ImageMessage imageMessage;
    private FileMessage fileMessage;
    private boolean isMsgNull;
    public Message(){
        messageHead=new MessageHead();
        textMessage=new TextMessage();
        imageMessage=new ImageMessage();
        fileMessage=new FileMessage();
    }
    public MessageHead getMessageHead() {
        return messageHead;
    }

    public void setMessageHead(MessageHead messageHead) {
        this.messageHead = messageHead;
    }

    public TextMessage getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(TextMessage textMessage) {
        this.textMessage = textMessage;
    }

    public ImageMessage getImageMessage() {
        return imageMessage;
    }

    public void setImageMessage(ImageMessage imageMessage) {
        this.imageMessage = imageMessage;
    }

    public FileMessage getFileMessage() {
        return fileMessage;
    }

    public void setFileMessage(FileMessage fileMessage) {
        this.fileMessage = fileMessage;
    }

    public boolean isMsgNull() {
        return isMsgNull;
    }

    public void setMsgNull(boolean msgNull) {
        isMsgNull = msgNull;
    }


    public static class MessageHead implements Serializable {
        private static final long serialVersionUID = 5L;

        private String commandType;
        private User from;
        private User to;
        private boolean successFlag=false;
        public String getCommandType() {
            return commandType;
        }

        public void setCommandType(String commandType) {
            this.commandType = commandType;
        }

        public User getFrom() {
            return from;
        }

        public void setFrom(User from) {
            this.from = from;
        }

        public User getTo() {
            return to;
        }

        public void setTo(User to) {
            this.to = to;
        }

        public boolean isSuccessFlag() {
            return successFlag;
        }

        public void setSuccessFlag(boolean successFlag) {
            this.successFlag = successFlag;
        }
    }
    public static class TextMessage implements Serializable {
        private static final long serialVersionUID = 2L;

        private String messageContent;
        public String getMessageContent() {
            return messageContent;
        }
        public void setMessageContent(String messageContent) {
            this.messageContent = messageContent;
        }
    }
    public static class ImageMessage implements Serializable {
        private static final long serialVersionUID = 3L;


    }
    public static class FileMessage implements Serializable {
        private static final long serialVersionUID = 4L;


    }

}
