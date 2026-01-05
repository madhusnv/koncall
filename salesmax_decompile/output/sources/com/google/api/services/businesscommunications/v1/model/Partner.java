package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* loaded from: classes3.dex */
public final class Partner extends GenericJson {

    @Key
    private String company;

    @Key
    private List<String> contactEmails;

    @Key
    private String displayName;

    @Key
    private String name;

    @Key
    private List<ProductCapability> productCapabilities;

    public String getCompany() {
        return this.company;
    }

    public List<String> getContactEmails() {
        return this.contactEmails;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getName() {
        return this.name;
    }

    public List<ProductCapability> getProductCapabilities() {
        return this.productCapabilities;
    }

    public Partner setCompany(String str) {
        this.company = str;
        return this;
    }

    public Partner setContactEmails(List<String> list) {
        this.contactEmails = list;
        return this;
    }

    public Partner setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public Partner setName(String str) {
        this.name = str;
        return this;
    }

    public Partner setProductCapabilities(List<ProductCapability> list) {
        this.productCapabilities = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Partner set(String str, Object obj) {
        return (Partner) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Partner clone() {
        return (Partner) super.clone();
    }
}
