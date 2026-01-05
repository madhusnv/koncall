package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class OnAppUpdatedResponse {

    @InterfaceC4485b("callRecordingEndDateTime")
    private final LocalDateTime callRecordingEndDateTime;

    @InterfaceC4485b("callRecordingStartDateTime")
    private final LocalDateTime callRecordingStartDateTime;

    @InterfaceC4485b("companyName")
    private final String companyName;

    @InterfaceC4485b("customerCountry")
    private final String customerCountry;

    @InterfaceC4485b("customerCountryCode")
    private final int customerCountryCode;

    @InterfaceC4485b("employeeCode")
    private final String employeeCode;

    @InterfaceC4485b("employeeId")
    private final String employeeId;

    @InterfaceC4485b("endDateTime")
    private final LocalDateTime endDateTime;

    @InterfaceC4485b("isCallRecordingEnabled")
    private final boolean isCallRecordingEnabled;

    @InterfaceC4485b("isDownloadReport")
    private final boolean isDownloadReport;

    @InterfaceC4485b("isLeadEnabled")
    private final boolean isLeadEnabled;

    @InterfaceC4485b("lastSyncCallTime")
    private final String lastSyncCallTime;

    @InterfaceC4485b("startDateTime")
    private final LocalDateTime startDateTime;

    public OnAppUpdatedResponse(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, String companyName, String str2, int i10, boolean z6, String str3, boolean z10, LocalDateTime localDateTime3, LocalDateTime localDateTime4, String employeeId, boolean z11) {
        AbstractC4154l.m8923f(companyName, "companyName");
        AbstractC4154l.m8923f(employeeId, "employeeId");
        this.lastSyncCallTime = str;
        this.endDateTime = localDateTime;
        this.startDateTime = localDateTime2;
        this.companyName = companyName;
        this.customerCountry = str2;
        this.customerCountryCode = i10;
        this.isDownloadReport = z6;
        this.employeeCode = str3;
        this.isCallRecordingEnabled = z10;
        this.callRecordingStartDateTime = localDateTime3;
        this.callRecordingEndDateTime = localDateTime4;
        this.employeeId = employeeId;
        this.isLeadEnabled = z11;
    }

    /* renamed from: a */
    public final LocalDateTime m4830a() {
        return this.callRecordingEndDateTime;
    }

    /* renamed from: b */
    public final LocalDateTime m4831b() {
        return this.callRecordingStartDateTime;
    }

    /* renamed from: c */
    public final String m4832c() {
        return this.employeeCode;
    }

    /* renamed from: d */
    public final String m4833d() {
        return this.employeeId;
    }

    /* renamed from: e */
    public final LocalDateTime m4834e() {
        return this.endDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnAppUpdatedResponse)) {
            return false;
        }
        OnAppUpdatedResponse onAppUpdatedResponse = (OnAppUpdatedResponse) obj;
        return AbstractC4154l.m8918a(this.lastSyncCallTime, onAppUpdatedResponse.lastSyncCallTime) && AbstractC4154l.m8918a(this.endDateTime, onAppUpdatedResponse.endDateTime) && AbstractC4154l.m8918a(this.startDateTime, onAppUpdatedResponse.startDateTime) && AbstractC4154l.m8918a(this.companyName, onAppUpdatedResponse.companyName) && AbstractC4154l.m8918a(this.customerCountry, onAppUpdatedResponse.customerCountry) && this.customerCountryCode == onAppUpdatedResponse.customerCountryCode && this.isDownloadReport == onAppUpdatedResponse.isDownloadReport && AbstractC4154l.m8918a(this.employeeCode, onAppUpdatedResponse.employeeCode) && this.isCallRecordingEnabled == onAppUpdatedResponse.isCallRecordingEnabled && AbstractC4154l.m8918a(this.callRecordingStartDateTime, onAppUpdatedResponse.callRecordingStartDateTime) && AbstractC4154l.m8918a(this.callRecordingEndDateTime, onAppUpdatedResponse.callRecordingEndDateTime) && AbstractC4154l.m8918a(this.employeeId, onAppUpdatedResponse.employeeId) && this.isLeadEnabled == onAppUpdatedResponse.isLeadEnabled;
    }

    /* renamed from: f */
    public final String m4835f() {
        return this.lastSyncCallTime;
    }

    /* renamed from: g */
    public final LocalDateTime m4836g() {
        return this.startDateTime;
    }

    /* renamed from: h */
    public final boolean m4837h() {
        return this.isCallRecordingEnabled;
    }

    public final int hashCode() {
        String str = this.lastSyncCallTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDateTime localDateTime = this.endDateTime;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.startDateTime;
        int iM113d = AbstractC0030c.m113d((iHashCode2 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31, 31, this.companyName);
        String str2 = this.customerCountry;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.customerCountryCode, (iM113d + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.isDownloadReport);
        String str3 = this.employeeCode;
        int iM4558e2 = AbstractC1452a.m4558e((iM4558e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isCallRecordingEnabled);
        LocalDateTime localDateTime3 = this.callRecordingStartDateTime;
        int iHashCode3 = (iM4558e2 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
        LocalDateTime localDateTime4 = this.callRecordingEndDateTime;
        return Boolean.hashCode(this.isLeadEnabled) + AbstractC0030c.m113d((iHashCode3 + (localDateTime4 != null ? localDateTime4.hashCode() : 0)) * 31, 31, this.employeeId);
    }

    /* renamed from: i */
    public final boolean m4838i() {
        return this.isLeadEnabled;
    }

    public final String toString() {
        String str = this.lastSyncCallTime;
        LocalDateTime localDateTime = this.endDateTime;
        LocalDateTime localDateTime2 = this.startDateTime;
        String str2 = this.companyName;
        String str3 = this.customerCountry;
        int i10 = this.customerCountryCode;
        boolean z6 = this.isDownloadReport;
        String str4 = this.employeeCode;
        boolean z10 = this.isCallRecordingEnabled;
        LocalDateTime localDateTime3 = this.callRecordingStartDateTime;
        LocalDateTime localDateTime4 = this.callRecordingEndDateTime;
        String str5 = this.employeeId;
        boolean z11 = this.isLeadEnabled;
        StringBuilder sb2 = new StringBuilder("OnAppUpdatedResponse(lastSyncCallTime=");
        sb2.append(str);
        sb2.append(", endDateTime=");
        sb2.append(localDateTime);
        sb2.append(", startDateTime=");
        sb2.append(localDateTime2);
        sb2.append(", companyName=");
        sb2.append(str2);
        sb2.append(", customerCountry=");
        AbstractC1452a.m4551B(sb2, str3, ", customerCountryCode=", i10, ", isDownloadReport=");
        AbstractC4801l.m9751y(sb2, z6, ", employeeCode=", str4, ", isCallRecordingEnabled=");
        sb2.append(z10);
        sb2.append(", callRecordingStartDateTime=");
        sb2.append(localDateTime3);
        sb2.append(", callRecordingEndDateTime=");
        sb2.append(localDateTime4);
        sb2.append(", employeeId=");
        sb2.append(str5);
        sb2.append(", isLeadEnabled=");
        return AbstractC5601a.m11242m(sb2, z11, ")");
    }

    public /* synthetic */ OnAppUpdatedResponse(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str2, String str3, int i10, boolean z6, String str4, boolean z10, LocalDateTime localDateTime3, LocalDateTime localDateTime4, String str5, boolean z11, int i11, AbstractC4148f abstractC4148f) {
        this(str, localDateTime, localDateTime2, str2, str3, i10, z6, (i11 & 128) != 0 ? null : str4, z10, localDateTime3, localDateTime4, str5, z11);
    }
}
