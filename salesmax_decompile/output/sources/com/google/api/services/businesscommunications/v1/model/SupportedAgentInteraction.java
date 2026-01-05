package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class SupportedAgentInteraction extends GenericJson {

    @Key
    private BotRepresentative botRepresentative;

    @Key
    private HumanRepresentative humanRepresentative;

    @Key
    private String interactionType;

    public BotRepresentative getBotRepresentative() {
        return this.botRepresentative;
    }

    public HumanRepresentative getHumanRepresentative() {
        return this.humanRepresentative;
    }

    public String getInteractionType() {
        return this.interactionType;
    }

    public SupportedAgentInteraction setBotRepresentative(BotRepresentative botRepresentative) {
        this.botRepresentative = botRepresentative;
        return this;
    }

    public SupportedAgentInteraction setHumanRepresentative(HumanRepresentative humanRepresentative) {
        this.humanRepresentative = humanRepresentative;
        return this;
    }

    public SupportedAgentInteraction setInteractionType(String str) {
        this.interactionType = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SupportedAgentInteraction set(String str, Object obj) {
        return (SupportedAgentInteraction) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SupportedAgentInteraction clone() {
        return (SupportedAgentInteraction) super.clone();
    }
}
