package com.onesignal.core.internal.backend;

import p001o.id5;

/* loaded from: classes6.dex */
public final class FCMParamsObject {
    private final String apiKey;
    private final String appId;
    private final String projectId;

    public FCMParamsObject() {
        this(null, null, null, 7, null);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public FCMParamsObject(String str, String str2, String str3) {
        this.projectId = str;
        this.appId = str2;
        this.apiKey = str3;
    }

    public /* synthetic */ FCMParamsObject(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
