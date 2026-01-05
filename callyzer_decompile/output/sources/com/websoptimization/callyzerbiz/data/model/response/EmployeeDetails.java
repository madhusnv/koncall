package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class EmployeeDetails {

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

    @InterfaceC4485b("isDownloadReport")
    private final boolean isDownloadReport;

    @InterfaceC4485b("isSyncLeadOnly")
    private final boolean isSyncLeadOnly;

    @InterfaceC4485b("lastSyncCallTime")
    private final LocalDateTime lastSyncCallTime;

    public EmployeeDetails(LocalDateTime localDateTime, String companyName, String customerCountry, int i10, boolean z6, String str, String employeeId, boolean z10) {
        AbstractC4154l.m8923f(companyName, "companyName");
        AbstractC4154l.m8923f(customerCountry, "customerCountry");
        AbstractC4154l.m8923f(employeeId, "employeeId");
        this.lastSyncCallTime = localDateTime;
        this.companyName = companyName;
        this.customerCountry = customerCountry;
        this.customerCountryCode = i10;
        this.isDownloadReport = z6;
        this.employeeCode = str;
        this.employeeId = employeeId;
        this.isSyncLeadOnly = z10;
    }

    /* renamed from: a */
    public final String m4770a() {
        return this.companyName;
    }

    /* renamed from: b */
    public final String m4771b() {
        return this.customerCountry;
    }

    /* renamed from: c */
    public final int m4772c() {
        return this.customerCountryCode;
    }

    /* renamed from: d */
    public final String m4773d() {
        return this.employeeCode;
    }

    /* renamed from: e */
    public final String m4774e() {
        return this.employeeId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeDetails)) {
            return false;
        }
        EmployeeDetails employeeDetails = (EmployeeDetails) obj;
        return AbstractC4154l.m8918a(this.lastSyncCallTime, employeeDetails.lastSyncCallTime) && AbstractC4154l.m8918a(this.companyName, employeeDetails.companyName) && AbstractC4154l.m8918a(this.customerCountry, employeeDetails.customerCountry) && this.customerCountryCode == employeeDetails.customerCountryCode && this.isDownloadReport == employeeDetails.isDownloadReport && AbstractC4154l.m8918a(this.employeeCode, employeeDetails.employeeCode) && AbstractC4154l.m8918a(this.employeeId, employeeDetails.employeeId) && this.isSyncLeadOnly == employeeDetails.isSyncLeadOnly;
    }

    /* renamed from: f */
    public final LocalDateTime m4775f() {
        return this.lastSyncCallTime;
    }

    /* renamed from: g */
    public final boolean m4776g() {
        return this.isDownloadReport;
    }

    /* renamed from: h */
    public final boolean m4777h() {
        return this.isSyncLeadOnly;
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.lastSyncCallTime;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.customerCountryCode, AbstractC0030c.m113d(AbstractC0030c.m113d((localDateTime == null ? 0 : localDateTime.hashCode()) * 31, 31, this.companyName), 31, this.customerCountry), 31), 31, this.isDownloadReport);
        String str = this.employeeCode;
        return Boolean.hashCode(this.isSyncLeadOnly) + AbstractC0030c.m113d((iM4558e + (str != null ? str.hashCode() : 0)) * 31, 31, this.employeeId);
    }

    public final String toString() {
        LocalDateTime localDateTime = this.lastSyncCallTime;
        String str = this.companyName;
        String str2 = this.customerCountry;
        int i10 = this.customerCountryCode;
        boolean z6 = this.isDownloadReport;
        String str3 = this.employeeCode;
        String str4 = this.employeeId;
        boolean z10 = this.isSyncLeadOnly;
        StringBuilder sb2 = new StringBuilder("EmployeeDetails(lastSyncCallTime=");
        sb2.append(localDateTime);
        sb2.append(", companyName=");
        sb2.append(str);
        sb2.append(", customerCountry=");
        AbstractC1452a.m4551B(sb2, str2, ", customerCountryCode=", i10, ", isDownloadReport=");
        AbstractC4801l.m9751y(sb2, z6, ", employeeCode=", str3, ", employeeId=");
        sb2.append(str4);
        sb2.append(", isSyncLeadOnly=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EmployeeDetails(LocalDateTime localDateTime, String str, String str2, int i10, boolean z6, String str3, String str4, boolean z10, int i11, AbstractC4148f abstractC4148f) {
        boolean z11;
        String str5;
        String str6;
        localDateTime = (i11 & 1) != 0 ? null : localDateTime;
        if ((i11 & 32) != 0) {
            z11 = z10;
            str5 = str4;
            str6 = null;
        } else {
            z11 = z10;
            str5 = str4;
            str6 = str3;
        }
        this(localDateTime, str, str2, i10, z6, str6, str5, z11);
    }
}
