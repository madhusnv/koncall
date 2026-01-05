package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class BusinessMessagesAgent extends GenericJson {

    @Key
    private List<SupportedAgentInteraction> additionalAgentInteractions;

    @Key
    private String agentTestUrl;

    @Key
    private Map<String, ConversationalSetting> conversationalSettings;

    @Key
    private String customAgentId;

    @Key
    private String defaultLocale;

    @Key
    private List<BusinessMessagesEntryPointConfig> entryPointConfigs;

    @Key
    private String logoUrl;

    @Key
    private Phone phone;

    @Key
    private SupportedAgentInteraction primaryAgentInteraction;

    @Key
    private List<TestUrl> testUrls;

    public List<SupportedAgentInteraction> getAdditionalAgentInteractions() {
        return this.additionalAgentInteractions;
    }

    public String getAgentTestUrl() {
        return this.agentTestUrl;
    }

    public Map<String, ConversationalSetting> getConversationalSettings() {
        return this.conversationalSettings;
    }

    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public String getDefaultLocale() {
        return this.defaultLocale;
    }

    public List<BusinessMessagesEntryPointConfig> getEntryPointConfigs() {
        return this.entryPointConfigs;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public SupportedAgentInteraction getPrimaryAgentInteraction() {
        return this.primaryAgentInteraction;
    }

    public List<TestUrl> getTestUrls() {
        return this.testUrls;
    }

    public BusinessMessagesAgent setAdditionalAgentInteractions(List<SupportedAgentInteraction> list) {
        this.additionalAgentInteractions = list;
        return this;
    }

    public BusinessMessagesAgent setAgentTestUrl(String str) {
        this.agentTestUrl = str;
        return this;
    }

    public BusinessMessagesAgent setConversationalSettings(Map<String, ConversationalSetting> map) {
        this.conversationalSettings = map;
        return this;
    }

    public BusinessMessagesAgent setCustomAgentId(String str) {
        this.customAgentId = str;
        return this;
    }

    public BusinessMessagesAgent setDefaultLocale(String str) {
        this.defaultLocale = str;
        return this;
    }

    public BusinessMessagesAgent setEntryPointConfigs(List<BusinessMessagesEntryPointConfig> list) {
        this.entryPointConfigs = list;
        return this;
    }

    public BusinessMessagesAgent setLogoUrl(String str) {
        this.logoUrl = str;
        return this;
    }

    public BusinessMessagesAgent setPhone(Phone phone) {
        this.phone = phone;
        return this;
    }

    public BusinessMessagesAgent setPrimaryAgentInteraction(SupportedAgentInteraction supportedAgentInteraction) {
        this.primaryAgentInteraction = supportedAgentInteraction;
        return this;
    }

    public BusinessMessagesAgent setTestUrls(List<TestUrl> list) {
        this.testUrls = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public BusinessMessagesAgent set(String str, Object obj) {
        return (BusinessMessagesAgent) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public BusinessMessagesAgent clone() {
        return (BusinessMessagesAgent) super.clone();
    }
}
