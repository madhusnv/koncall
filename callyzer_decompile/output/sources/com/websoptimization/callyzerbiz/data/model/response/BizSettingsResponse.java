package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class BizSettingsResponse {

    @InterfaceC4485b("appSettings")
    private final AppSettings appSettings;

    @InterfaceC4485b("empSettings")
    private final EmpSettings empSettings;

    @InterfaceC4485b("settings")
    private final Settings settings;

    public BizSettingsResponse(AppSettings appSettings, Settings settings, EmpSettings empSettings) {
        AbstractC4154l.m8923f(appSettings, "appSettings");
        AbstractC4154l.m8923f(settings, "settings");
        this.appSettings = appSettings;
        this.settings = settings;
        this.empSettings = empSettings;
    }

    /* renamed from: a */
    public final AppSettings m4736a() {
        return this.appSettings;
    }

    /* renamed from: b */
    public final EmpSettings m4737b() {
        return this.empSettings;
    }

    /* renamed from: c */
    public final Settings m4738c() {
        return this.settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizSettingsResponse)) {
            return false;
        }
        BizSettingsResponse bizSettingsResponse = (BizSettingsResponse) obj;
        return AbstractC4154l.m8918a(this.appSettings, bizSettingsResponse.appSettings) && AbstractC4154l.m8918a(this.settings, bizSettingsResponse.settings) && AbstractC4154l.m8918a(this.empSettings, bizSettingsResponse.empSettings);
    }

    public final int hashCode() {
        int iHashCode = (this.settings.hashCode() + (this.appSettings.hashCode() * 31)) * 31;
        EmpSettings empSettings = this.empSettings;
        return iHashCode + (empSettings == null ? 0 : empSettings.hashCode());
    }

    public final String toString() {
        return "BizSettingsResponse(appSettings=" + this.appSettings + ", settings=" + this.settings + ", empSettings=" + this.empSettings + ")";
    }
}
