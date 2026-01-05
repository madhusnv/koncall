package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class AgentVerificationContact extends GenericJson {

    @Key
    private String brandContactEmailAddress;

    @Key
    private String brandContactName;

    @Key
    private String brandWebsiteUrl;

    @Key
    private String partnerEmailAddress;

    @Key
    private String partnerName;

    public String getBrandContactEmailAddress() {
        return this.brandContactEmailAddress;
    }

    public String getBrandContactName() {
        return this.brandContactName;
    }

    public String getBrandWebsiteUrl() {
        return this.brandWebsiteUrl;
    }

    public String getPartnerEmailAddress() {
        return this.partnerEmailAddress;
    }

    public String getPartnerName() {
        return this.partnerName;
    }

    public AgentVerificationContact setBrandContactEmailAddress(String str) {
        this.brandContactEmailAddress = str;
        return this;
    }

    public AgentVerificationContact setBrandContactName(String str) {
        this.brandContactName = str;
        return this;
    }

    public AgentVerificationContact setBrandWebsiteUrl(String str) {
        this.brandWebsiteUrl = str;
        return this;
    }

    public AgentVerificationContact setPartnerEmailAddress(String str) {
        this.partnerEmailAddress = str;
        return this;
    }

    public AgentVerificationContact setPartnerName(String str) {
        this.partnerName = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public AgentVerificationContact set(String str, Object obj) {
        return (AgentVerificationContact) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AgentVerificationContact clone() {
        return (AgentVerificationContact) super.clone();
    }
}
