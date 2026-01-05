package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class Brand extends GenericJson {

    @Key
    private String displayName;

    @Key
    private String name;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getName() {
        return this.name;
    }

    public Brand setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public Brand setName(String str) {
        this.name = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Brand set(String str, Object obj) {
        return (Brand) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Brand clone() {
        return (Brand) super.clone();
    }
}
