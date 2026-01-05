package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class SuggestedAction extends GenericJson {

    @Key
    private OpenUrlAction openUrlAction;

    @Key
    private String postbackData;

    @Key
    private String text;

    public OpenUrlAction getOpenUrlAction() {
        return this.openUrlAction;
    }

    public String getPostbackData() {
        return this.postbackData;
    }

    public String getText() {
        return this.text;
    }

    public SuggestedAction setOpenUrlAction(OpenUrlAction openUrlAction) {
        this.openUrlAction = openUrlAction;
        return this;
    }

    public SuggestedAction setPostbackData(String str) {
        this.postbackData = str;
        return this;
    }

    public SuggestedAction setText(String str) {
        this.text = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SuggestedAction set(String str, Object obj) {
        return (SuggestedAction) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SuggestedAction clone() {
        return (SuggestedAction) super.clone();
    }
}
