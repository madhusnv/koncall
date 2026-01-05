package com.google.api.services.calendar.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class ConferenceSolutionKey extends GenericJson {

    /* renamed from: type, reason: collision with root package name */
    @Key
    private String f58149type;

    public String getType() {
        return this.f58149type;
    }

    public ConferenceSolutionKey setType(String str) {
        this.f58149type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ConferenceSolutionKey set(String str, Object obj) {
        return (ConferenceSolutionKey) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ConferenceSolutionKey clone() {
        return (ConferenceSolutionKey) super.clone();
    }
}
