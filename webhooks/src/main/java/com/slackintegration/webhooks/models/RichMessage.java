package com.slackintegration.webhooks.models;



/**
 * @author srinidhi
 * @version 01/04/2021
 */
public class RichMessage {
    private String text;
    private Attachment[] attachments;

    public RichMessage() {
    }

    public RichMessage(String text) {
        this.text = text;
    }
    
    public RichMessage encodedMessage() {
        this.setText(this.getText().replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;"));
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAttachments(Attachment[] attachments) {
        this.attachments = attachments;
    }
}
