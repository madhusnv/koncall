package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AddDeviceRequest {

    /* renamed from: a */
    public final int f7344a;

    @InterfaceC4485b("androidVersion")
    private final String androidVersion;

    @InterfaceC4485b("appVersion")
    private final String appVersion;

    @InterfaceC4485b("board")
    private final String board;

    @InterfaceC4485b("companyCode")
    private final String companyCode;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("deviceBrand")
    private final String deviceBrand;

    @InterfaceC4485b("deviceModel")
    private final String deviceModel;

    @InterfaceC4485b("employeeCode")
    private final String employeeCode;

    @InterfaceC4485b("fcmId")
    private final String fcmId;

    @InterfaceC4485b("mobile")
    private final String mobile;

    @InterfaceC4485b("sdkVersion")
    private final int sdkVersion;

    @InterfaceC4485b("uniqueSimId")
    private final String uniqueSimId;

    @InterfaceC4485b("userName")
    private final String userName;

    @InterfaceC4485b("versionCode")
    private final int versionCode;

    public AddDeviceRequest(String userName, String employeeCode, String mobile, int i10, String deviceModel, String deviceBrand, String companyCode, String appVersion, String fcmId, int i11, String board, String androidVersion, int i12, String uniqueSimId, int i13) {
        AbstractC4154l.m8923f(userName, "userName");
        AbstractC4154l.m8923f(employeeCode, "employeeCode");
        AbstractC4154l.m8923f(mobile, "mobile");
        AbstractC4154l.m8923f(deviceModel, "deviceModel");
        AbstractC4154l.m8923f(deviceBrand, "deviceBrand");
        AbstractC4154l.m8923f(companyCode, "companyCode");
        AbstractC4154l.m8923f(appVersion, "appVersion");
        AbstractC4154l.m8923f(fcmId, "fcmId");
        AbstractC4154l.m8923f(board, "board");
        AbstractC4154l.m8923f(androidVersion, "androidVersion");
        AbstractC4154l.m8923f(uniqueSimId, "uniqueSimId");
        this.userName = userName;
        this.employeeCode = employeeCode;
        this.mobile = mobile;
        this.countryCode = i10;
        this.deviceModel = deviceModel;
        this.deviceBrand = deviceBrand;
        this.companyCode = companyCode;
        this.appVersion = appVersion;
        this.fcmId = fcmId;
        this.versionCode = i11;
        this.board = board;
        this.androidVersion = androidVersion;
        this.sdkVersion = i12;
        this.uniqueSimId = uniqueSimId;
        this.f7344a = i13;
    }

    /* renamed from: a */
    public final String m4633a() {
        return this.companyCode;
    }

    /* renamed from: b */
    public final int m4634b() {
        return this.countryCode;
    }

    /* renamed from: c */
    public final String m4635c() {
        return this.employeeCode;
    }

    /* renamed from: d */
    public final String m4636d() {
        return this.mobile;
    }

    /* renamed from: e */
    public final String m4637e() {
        return this.uniqueSimId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddDeviceRequest)) {
            return false;
        }
        AddDeviceRequest addDeviceRequest = (AddDeviceRequest) obj;
        return AbstractC4154l.m8918a(this.userName, addDeviceRequest.userName) && AbstractC4154l.m8918a(this.employeeCode, addDeviceRequest.employeeCode) && AbstractC4154l.m8918a(this.mobile, addDeviceRequest.mobile) && this.countryCode == addDeviceRequest.countryCode && AbstractC4154l.m8918a(this.deviceModel, addDeviceRequest.deviceModel) && AbstractC4154l.m8918a(this.deviceBrand, addDeviceRequest.deviceBrand) && AbstractC4154l.m8918a(this.companyCode, addDeviceRequest.companyCode) && AbstractC4154l.m8918a(this.appVersion, addDeviceRequest.appVersion) && AbstractC4154l.m8918a(this.fcmId, addDeviceRequest.fcmId) && this.versionCode == addDeviceRequest.versionCode && AbstractC4154l.m8918a(this.board, addDeviceRequest.board) && AbstractC4154l.m8918a(this.androidVersion, addDeviceRequest.androidVersion) && this.sdkVersion == addDeviceRequest.sdkVersion && AbstractC4154l.m8918a(this.uniqueSimId, addDeviceRequest.uniqueSimId) && this.f7344a == addDeviceRequest.f7344a;
    }

    /* renamed from: f */
    public final String m4638f() {
        return this.userName;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7344a) + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.sdkVersion, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.versionCode, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(AbstractC0030c.m113d(this.userName.hashCode() * 31, 31, this.employeeCode), 31, this.mobile), 31), 31, this.deviceModel), 31, this.deviceBrand), 31, this.companyCode), 31, this.appVersion), 31, this.fcmId), 31), 31, this.board), 31, this.androidVersion), 31), 31, this.uniqueSimId);
    }

    public final String toString() {
        String str = this.userName;
        String str2 = this.employeeCode;
        String str3 = this.mobile;
        int i10 = this.countryCode;
        String str4 = this.deviceModel;
        String str5 = this.deviceBrand;
        String str6 = this.companyCode;
        String str7 = this.appVersion;
        String str8 = this.fcmId;
        int i11 = this.versionCode;
        String str9 = this.board;
        String str10 = this.androidVersion;
        int i12 = this.sdkVersion;
        String str11 = this.uniqueSimId;
        StringBuilder sbM127r = AbstractC0030c.m127r("AddDeviceRequest(userName=", str, ", employeeCode=", str2, ", mobile=");
        AbstractC1452a.m4551B(sbM127r, str3, ", countryCode=", i10, ", deviceModel=");
        a1.m14319B(sbM127r, str4, ", deviceBrand=", str5, ", companyCode=");
        a1.m14319B(sbM127r, str6, ", appVersion=", str7, ", fcmId=");
        AbstractC1452a.m4551B(sbM127r, str8, ", versionCode=", i11, ", board=");
        a1.m14319B(sbM127r, str9, ", androidVersion=", str10, ", sdkVersion=");
        AbstractC1452a.m4550A(sbM127r, i12, ", uniqueSimId=", str11, ", simSlot=");
        return AbstractC5601a.m11233d(this.f7344a, ")", sbM127r);
    }
}
