package com.onesignal.core.internal.config;

import com.google.android.gms.location.DeviceOrientationRequest;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class ConfigModel$opRepoPostCreateDelay$2 extends kf9 implements uk7 {
    public static final ConfigModel$opRepoPostCreateDelay$2 INSTANCE = new ConfigModel$opRepoPostCreateDelay$2();

    public ConfigModel$opRepoPostCreateDelay$2() {
        super(0);
    }

    @Override // p001o.uk7
    public final Long invoke() {
        return Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
    }
}
