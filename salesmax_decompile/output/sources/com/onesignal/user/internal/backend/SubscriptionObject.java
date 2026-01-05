package com.onesignal.user.internal.backend;

import p001o.id5;

/* loaded from: classes6.dex */
public final class SubscriptionObject {
    private final String appVersion;
    private final String carrier;
    private final String deviceModel;
    private final String deviceOS;
    private final Boolean enabled;
    private final String id;
    private final Integer netType;
    private final Integer notificationTypes;
    private final Boolean rooted;
    private final String sdk;
    private final String token;

    /* renamed from: type, reason: collision with root package name */
    private final SubscriptionObjectType f58163type;

    public SubscriptionObject() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getNetType() {
        return this.netType;
    }

    public final Integer getNotificationTypes() {
        return this.notificationTypes;
    }

    public final Boolean getRooted() {
        return this.rooted;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getToken() {
        return this.token;
    }

    public final SubscriptionObjectType getType() {
        return this.f58163type;
    }

    public SubscriptionObject(String str, SubscriptionObjectType subscriptionObjectType, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7) {
        this.id = str;
        this.f58163type = subscriptionObjectType;
        this.token = str2;
        this.enabled = bool;
        this.notificationTypes = num;
        this.sdk = str3;
        this.deviceModel = str4;
        this.deviceOS = str5;
        this.rooted = bool2;
        this.netType = num2;
        this.carrier = str6;
        this.appVersion = str7;
    }

    public /* synthetic */ SubscriptionObject(String str, SubscriptionObjectType subscriptionObjectType, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : subscriptionObjectType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str6, (i & 2048) == 0 ? str7 : null);
    }
}
