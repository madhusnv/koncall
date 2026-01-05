package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class VerifiedSmsAgent extends GenericJson {

    @Key
    private String description;

    @Key
    private String logoUrl;

    @Key
    private List<Sender> senders;

    public String getDescription() {
        return this.description;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public List<Sender> getSenders() {
        return this.senders;
    }

    public VerifiedSmsAgent setDescription(String str) {
        this.description = str;
        return this;
    }

    public VerifiedSmsAgent setLogoUrl(String str) {
        this.logoUrl = str;
        return this;
    }

    public VerifiedSmsAgent setSenders(List<Sender> list) {
        this.senders = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VerifiedSmsAgent set(String str, Object obj) {
        return (VerifiedSmsAgent) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VerifiedSmsAgent clone() {
        return (VerifiedSmsAgent) super.clone();
    }
}
