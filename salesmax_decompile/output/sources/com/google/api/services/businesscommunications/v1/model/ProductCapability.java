package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class ProductCapability extends GenericJson {

    @Key
    private BusinessMessagesCapability businessMessagesCapability;

    @Key
    private String product;

    @Key
    private VerifiedSmsCapability verifiedSmsCapability;

    public BusinessMessagesCapability getBusinessMessagesCapability() {
        return this.businessMessagesCapability;
    }

    public String getProduct() {
        return this.product;
    }

    public VerifiedSmsCapability getVerifiedSmsCapability() {
        return this.verifiedSmsCapability;
    }

    public ProductCapability setBusinessMessagesCapability(BusinessMessagesCapability businessMessagesCapability) {
        this.businessMessagesCapability = businessMessagesCapability;
        return this;
    }

    public ProductCapability setProduct(String str) {
        this.product = str;
        return this;
    }

    public ProductCapability setVerifiedSmsCapability(VerifiedSmsCapability verifiedSmsCapability) {
        this.verifiedSmsCapability = verifiedSmsCapability;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ProductCapability set(String str, Object obj) {
        return (ProductCapability) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ProductCapability clone() {
        return (ProductCapability) super.clone();
    }
}
