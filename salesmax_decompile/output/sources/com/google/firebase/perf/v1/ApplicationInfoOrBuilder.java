package com.google.firebase.perf.v1;

import java.util.Map;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes6.dex */
public interface ApplicationInfoOrBuilder extends tcb {
    boolean containsCustomAttributes(String str);

    AndroidApplicationInfo getAndroidAppInfo();

    String getAppInstanceId();

    xq1 getAppInstanceIdBytes();

    ApplicationProcessState getApplicationProcessState();

    @Deprecated
    Map<String, String> getCustomAttributes();

    int getCustomAttributesCount();

    Map<String, String> getCustomAttributesMap();

    String getCustomAttributesOrDefault(String str, String str2);

    String getCustomAttributesOrThrow(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getGoogleAppId();

    xq1 getGoogleAppIdBytes();

    boolean hasAndroidAppInfo();

    boolean hasAppInstanceId();

    boolean hasApplicationProcessState();

    boolean hasGoogleAppId();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
