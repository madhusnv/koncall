package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;
import mm.C4802m;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DeviceSettingRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7348b;

    @InterfaceC4485b("callRecordingLocation")
    private final String callRecordingLocation;

    @InterfaceC4485b("defaultDialerName")
    private final String defaultDialerName;

    @InterfaceC4485b("defaultDialerPackageName")
    private final String defaultDialerPackage;

    @InterfaceC4485b("defaultDialerPackageVersion")
    private final String defaultDialerVersion;

    @InterfaceC4485b("defaultHomeScreen")
    private final String defaultHomeScreen;

    @InterfaceC4485b("deviceBrand")
    private final String deviceBrand;

    @InterfaceC4485b("deviceModel")
    private final String deviceModel;

    @InterfaceC4485b("enableNoteDialog")
    private final String enableNoteDialog;

    @InterfaceC4485b("isLogEnabled")
    private final String isLogEnabled;

    @InterfaceC4485b("isRecordingPathLocked")
    private final boolean isRecordingPathLocked;

    @InterfaceC4485b("theme")
    private final String theme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingRequest(String defaultHomeScreen, String enableNoteDialog, String isLogEnabled, String theme, String str, String str2, String str3, String defaultDialerName, String deviceBrand, boolean z6, String deviceModel, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(defaultHomeScreen, "defaultHomeScreen");
        AbstractC4154l.m8923f(enableNoteDialog, "enableNoteDialog");
        AbstractC4154l.m8923f(isLogEnabled, "isLogEnabled");
        AbstractC4154l.m8923f(theme, "theme");
        AbstractC4154l.m8923f(defaultDialerName, "defaultDialerName");
        AbstractC4154l.m8923f(deviceBrand, "deviceBrand");
        AbstractC4154l.m8923f(deviceModel, "deviceModel");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.defaultHomeScreen = defaultHomeScreen;
        this.enableNoteDialog = enableNoteDialog;
        this.isLogEnabled = isLogEnabled;
        this.theme = theme;
        this.callRecordingLocation = str;
        this.defaultDialerPackage = str2;
        this.defaultDialerVersion = str3;
        this.defaultDialerName = defaultDialerName;
        this.deviceBrand = deviceBrand;
        this.isRecordingPathLocked = z6;
        this.deviceModel = deviceModel;
        this.f7348b = userSimDetail;
    }

    /* renamed from: N */
    public final String m4646N() {
        return this.callRecordingLocation;
    }

    /* renamed from: O */
    public final String m4647O() {
        return this.defaultDialerName;
    }

    /* renamed from: P */
    public final String m4648P() {
        return this.defaultDialerPackage;
    }

    /* renamed from: Q */
    public final String m4649Q() {
        return this.defaultDialerVersion;
    }

    /* renamed from: R */
    public final String m4650R() {
        return this.defaultHomeScreen;
    }

    /* renamed from: S */
    public final String m4651S() {
        return this.deviceBrand;
    }

    /* renamed from: T */
    public final String m4652T() {
        return this.deviceModel;
    }

    /* renamed from: U */
    public final String m4653U() {
        return this.enableNoteDialog;
    }

    /* renamed from: V */
    public final String m4654V() {
        return this.theme;
    }

    /* renamed from: W */
    public final String m4655W() {
        return this.isLogEnabled;
    }

    /* renamed from: X */
    public final boolean m4656X() {
        return this.isRecordingPathLocked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceSettingRequest)) {
            return false;
        }
        DeviceSettingRequest deviceSettingRequest = (DeviceSettingRequest) obj;
        return AbstractC4154l.m8918a(this.defaultHomeScreen, deviceSettingRequest.defaultHomeScreen) && AbstractC4154l.m8918a(this.enableNoteDialog, deviceSettingRequest.enableNoteDialog) && AbstractC4154l.m8918a(this.isLogEnabled, deviceSettingRequest.isLogEnabled) && AbstractC4154l.m8918a(this.theme, deviceSettingRequest.theme) && AbstractC4154l.m8918a(this.callRecordingLocation, deviceSettingRequest.callRecordingLocation) && AbstractC4154l.m8918a(this.defaultDialerPackage, deviceSettingRequest.defaultDialerPackage) && AbstractC4154l.m8918a(this.defaultDialerVersion, deviceSettingRequest.defaultDialerVersion) && AbstractC4154l.m8918a(this.defaultDialerName, deviceSettingRequest.defaultDialerName) && AbstractC4154l.m8918a(this.deviceBrand, deviceSettingRequest.deviceBrand) && this.isRecordingPathLocked == deviceSettingRequest.isRecordingPathLocked && AbstractC4154l.m8918a(this.deviceModel, deviceSettingRequest.deviceModel) && AbstractC4154l.m8918a(this.f7348b, deviceSettingRequest.f7348b);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.defaultHomeScreen.hashCode() * 31, 31, this.enableNoteDialog), 31, this.isLogEnabled), 31, this.theme);
        String str = this.callRecordingLocation;
        int iHashCode = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultDialerPackage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultDialerVersion;
        return this.f7348b.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.defaultDialerName), 31, this.deviceBrand), 31, this.isRecordingPathLocked), 31, this.deviceModel);
    }

    public final String toString() {
        String str = this.defaultHomeScreen;
        String str2 = this.enableNoteDialog;
        String str3 = this.isLogEnabled;
        String str4 = this.theme;
        String str5 = this.callRecordingLocation;
        String str6 = this.defaultDialerPackage;
        String str7 = this.defaultDialerVersion;
        String str8 = this.defaultDialerName;
        String str9 = this.deviceBrand;
        boolean z6 = this.isRecordingPathLocked;
        String str10 = this.deviceModel;
        StringBuilder sbM127r = AbstractC0030c.m127r("DeviceSettingRequest(defaultHomeScreen=", str, ", enableNoteDialog=", str2, ", isLogEnabled=");
        a1.m14319B(sbM127r, str3, ", theme=", str4, ", callRecordingLocation=");
        a1.m14319B(sbM127r, str5, ", defaultDialerPackage=", str6, ", defaultDialerVersion=");
        a1.m14319B(sbM127r, str7, ", defaultDialerName=", str8, ", deviceBrand=");
        AbstractC4801l.m9749w(sbM127r, str9, ", isRecordingPathLocked=", z6, ", deviceModel=");
        sbM127r.append(str10);
        sbM127r.append(", userSimDetail=");
        sbM127r.append(this.f7348b);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
