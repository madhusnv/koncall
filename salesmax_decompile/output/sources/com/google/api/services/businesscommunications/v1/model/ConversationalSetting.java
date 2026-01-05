package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConversationalSetting extends GenericJson {

    @Key
    private List<ConversationStarters> conversationStarters;

    @Key
    private OfflineMessage offlineMessage;

    @Key
    private PrivacyPolicy privacyPolicy;

    @Key
    private WelcomeMessage welcomeMessage;

    public List<ConversationStarters> getConversationStarters() {
        return this.conversationStarters;
    }

    public OfflineMessage getOfflineMessage() {
        return this.offlineMessage;
    }

    public PrivacyPolicy getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    public WelcomeMessage getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public ConversationalSetting setConversationStarters(List<ConversationStarters> list) {
        this.conversationStarters = list;
        return this;
    }

    public ConversationalSetting setOfflineMessage(OfflineMessage offlineMessage) {
        this.offlineMessage = offlineMessage;
        return this;
    }

    public ConversationalSetting setPrivacyPolicy(PrivacyPolicy privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        return this;
    }

    public ConversationalSetting setWelcomeMessage(WelcomeMessage welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ConversationalSetting set(String str, Object obj) {
        return (ConversationalSetting) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ConversationalSetting clone() {
        return (ConversationalSetting) super.clone();
    }
}
