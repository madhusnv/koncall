package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SyncResponse {

    @InterfaceC4485b("callLogs")
    private final List<CallLogResponse> callLogs;

    @InterfaceC4485b("companyCode")
    private final String companyCode;

    @InterfaceC4485b("isLeadEnable")
    private final boolean isLeadEnable;

    @InterfaceC4485b("isSyncOnlyLeadNumber")
    private final boolean isSyncOnlyLeadNumber;

    @InterfaceC4485b("lastCallTime")
    private final String lastCallTime;

    @InterfaceC4485b("mobile")
    private final String mobile;

    public SyncResponse(String mobile, String companyCode, String str, boolean z6, boolean z10, List<CallLogResponse> callLogs) {
        AbstractC4154l.m8923f(mobile, "mobile");
        AbstractC4154l.m8923f(companyCode, "companyCode");
        AbstractC4154l.m8923f(callLogs, "callLogs");
        this.mobile = mobile;
        this.companyCode = companyCode;
        this.lastCallTime = str;
        this.isLeadEnable = z6;
        this.isSyncOnlyLeadNumber = z10;
        this.callLogs = callLogs;
    }

    /* renamed from: a */
    public final List m4843a() {
        return this.callLogs;
    }

    /* renamed from: b */
    public final String m4844b() {
        return this.lastCallTime;
    }

    /* renamed from: c */
    public final String m4845c() {
        return this.mobile;
    }

    /* renamed from: d */
    public final boolean m4846d() {
        return this.isLeadEnable;
    }

    /* renamed from: e */
    public final boolean m4847e() {
        return this.isSyncOnlyLeadNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncResponse)) {
            return false;
        }
        SyncResponse syncResponse = (SyncResponse) obj;
        return AbstractC4154l.m8918a(this.mobile, syncResponse.mobile) && AbstractC4154l.m8918a(this.companyCode, syncResponse.companyCode) && AbstractC4154l.m8918a(this.lastCallTime, syncResponse.lastCallTime) && this.isLeadEnable == syncResponse.isLeadEnable && this.isSyncOnlyLeadNumber == syncResponse.isSyncOnlyLeadNumber && AbstractC4154l.m8918a(this.callLogs, syncResponse.callLogs);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.mobile.hashCode() * 31, 31, this.companyCode);
        String str = this.lastCallTime;
        return this.callLogs.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLeadEnable), 31, this.isSyncOnlyLeadNumber);
    }

    public final String toString() {
        String str = this.mobile;
        String str2 = this.companyCode;
        String str3 = this.lastCallTime;
        boolean z6 = this.isLeadEnable;
        boolean z10 = this.isSyncOnlyLeadNumber;
        List<CallLogResponse> list = this.callLogs;
        StringBuilder sbM127r = AbstractC0030c.m127r("SyncResponse(mobile=", str, ", companyCode=", str2, ", lastCallTime=");
        AbstractC4801l.m9749w(sbM127r, str3, ", isLeadEnable=", z6, ", isSyncOnlyLeadNumber=");
        sbM127r.append(z10);
        sbM127r.append(", callLogs=");
        sbM127r.append(list);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
