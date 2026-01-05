package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingPathSuggestionRequest extends AbstractC0151h {

    @InterfaceC4485b("androidVersion")
    private final String androidVersion;

    /* renamed from: b */
    public final C4802m f7345b;

    @InterfaceC4485b("deviceBrand")
    private final String deviceBrand;

    @InterfaceC4485b("deviceModel")
    private final String deviceModel;

    @InterfaceC4485b("dialerPackageName")
    private final String dialerPackageName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRecordingPathSuggestionRequest(C4802m userSimDetail, String deviceModel, String androidVersion, String deviceBrand, String dialerPackageName) {
        super(userSimDetail);
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        AbstractC4154l.m8923f(deviceModel, "deviceModel");
        AbstractC4154l.m8923f(androidVersion, "androidVersion");
        AbstractC4154l.m8923f(deviceBrand, "deviceBrand");
        AbstractC4154l.m8923f(dialerPackageName, "dialerPackageName");
        this.f7345b = userSimDetail;
        this.deviceModel = deviceModel;
        this.androidVersion = androidVersion;
        this.deviceBrand = deviceBrand;
        this.dialerPackageName = dialerPackageName;
    }

    /* renamed from: N */
    public final String m4639N() {
        return this.androidVersion;
    }

    /* renamed from: O */
    public final String m4640O() {
        return this.deviceBrand;
    }

    /* renamed from: P */
    public final String m4641P() {
        return this.deviceModel;
    }

    /* renamed from: Q */
    public final String m4642Q() {
        return this.dialerPackageName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallRecordingPathSuggestionRequest)) {
            return false;
        }
        CallRecordingPathSuggestionRequest callRecordingPathSuggestionRequest = (CallRecordingPathSuggestionRequest) obj;
        return AbstractC4154l.m8918a(this.f7345b, callRecordingPathSuggestionRequest.f7345b) && AbstractC4154l.m8918a(this.deviceModel, callRecordingPathSuggestionRequest.deviceModel) && AbstractC4154l.m8918a(this.androidVersion, callRecordingPathSuggestionRequest.androidVersion) && AbstractC4154l.m8918a(this.deviceBrand, callRecordingPathSuggestionRequest.deviceBrand) && AbstractC4154l.m8918a(this.dialerPackageName, callRecordingPathSuggestionRequest.dialerPackageName);
    }

    public final int hashCode() {
        return this.dialerPackageName.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f7345b.hashCode() * 31, 31, this.deviceModel), 31, this.androidVersion), 31, this.deviceBrand);
    }

    public final String toString() {
        String str = this.deviceModel;
        String str2 = this.androidVersion;
        String str3 = this.deviceBrand;
        String str4 = this.dialerPackageName;
        StringBuilder sb2 = new StringBuilder("CallRecordingPathSuggestionRequest(userSimDetail=");
        sb2.append(this.f7345b);
        sb2.append(", deviceModel=");
        sb2.append(str);
        sb2.append(", androidVersion=");
        a1.m14319B(sb2, str2, ", deviceBrand=", str3, ", dialerPackageName=");
        return AbstractC1452a.m4564k(sb2, str4, ")");
    }
}
