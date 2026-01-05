package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;
import mm.C4791b;
import mm.C4792c;
import nm.C5107b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallLogResponse {

    /* renamed from: a */
    public C4791b f7375a;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC4485b("isCallRecordingDeleted")
    private final boolean isCallRecordingsDeleted;

    @InterfaceC4485b("isAssignedLead")
    private final boolean isLeadCallLog;

    @InterfaceC4485b("isSync")
    private final Boolean isSync;

    @InterfaceC4485b("toName")
    private final String toName;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public CallLogResponse(String toName, String toNumber, int i10, Boolean bool, boolean z6, String dateTime, String callType, String fromNumber, boolean z10) {
        AbstractC4154l.m8923f(toName, "toName");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        this.toName = toName;
        this.toNumber = toNumber;
        this.countryCode = i10;
        this.isSync = bool;
        this.isLeadCallLog = z6;
        this.dateTime = dateTime;
        this.callType = callType;
        this.fromNumber = fromNumber;
        this.isCallRecordingsDeleted = z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zm.EnumC8994d m4745a() {
        /*
            r2 = this;
            java.lang.String r0 = r2.callType
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1990013253: goto L33;
                case -543852386: goto L27;
                case 126326668: goto L1b;
                case 157441094: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3b
        Lf:
            java.lang.String r1 = "Incoming"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L3b
        L18:
            zm.d r0 = zm.EnumC8994d.INCOMING
            goto L3f
        L1b:
            java.lang.String r1 = "Outgoing"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L3b
        L24:
            zm.d r0 = zm.EnumC8994d.OUTGOING
            goto L3f
        L27:
            java.lang.String r1 = "Rejected"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L3b
        L30:
            zm.d r0 = zm.EnumC8994d.REJECTED
            goto L3f
        L33:
            java.lang.String r1 = "Missed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
        L3b:
            r0 = 0
            goto L3f
        L3d:
            zm.d r0 = zm.EnumC8994d.MISSED
        L3f:
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.data.model.response.CallLogResponse.m4745a():zm.d");
    }

    /* renamed from: b */
    public final LocalDateTime m4746b() {
        C8800o c8800o = C8800o.f42459a;
        return C8800o.m16183G(this.dateTime);
    }

    /* renamed from: c */
    public final String m4747c() {
        return this.callType;
    }

    /* renamed from: d */
    public final String m4748d() {
        return this.dateTime;
    }

    /* renamed from: e */
    public final String m4749e() {
        return this.fromNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallLogResponse)) {
            return false;
        }
        CallLogResponse callLogResponse = (CallLogResponse) obj;
        return AbstractC4154l.m8918a(this.toName, callLogResponse.toName) && AbstractC4154l.m8918a(this.toNumber, callLogResponse.toNumber) && this.countryCode == callLogResponse.countryCode && AbstractC4154l.m8918a(this.isSync, callLogResponse.isSync) && this.isLeadCallLog == callLogResponse.isLeadCallLog && AbstractC4154l.m8918a(this.dateTime, callLogResponse.dateTime) && AbstractC4154l.m8918a(this.callType, callLogResponse.callType) && AbstractC4154l.m8918a(this.fromNumber, callLogResponse.fromNumber) && this.isCallRecordingsDeleted == callLogResponse.isCallRecordingsDeleted;
    }

    /* renamed from: f */
    public final String m4750f() {
        return this.toName;
    }

    /* renamed from: g */
    public final String m4751g() {
        return this.toNumber;
    }

    /* renamed from: h */
    public final boolean m4752h() {
        return this.isCallRecordingsDeleted;
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.toName.hashCode() * 31, 31, this.toNumber), 31);
        Boolean bool = this.isSync;
        return Boolean.hashCode(this.isCallRecordingsDeleted) + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM4556c + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isLeadCallLog), 31, this.dateTime), 31, this.callType), 31, this.fromNumber);
    }

    /* renamed from: i */
    public final boolean m4753i() {
        return this.isLeadCallLog;
    }

    /* renamed from: j */
    public final Boolean m4754j() {
        return this.isSync;
    }

    /* renamed from: k */
    public final void m4755k(C4791b c4791b) {
        if (c4791b == null) {
            return;
        }
        C4792c c4792c = c4791b.f23833b;
        if (c4792c.f23846c.contentEquals(this.toNumber) && c4792c.f23848e == m4745a() && c4792c.f23849f.isEqual(m4746b())) {
            this.f7375a = c4791b;
        }
    }

    /* renamed from: l */
    public final C5107b m4756l() {
        return new C5107b(this.toNumber, this.fromNumber, this.dateTime, this.callType);
    }

    public final String toString() {
        String str = this.toName;
        String str2 = this.toNumber;
        int i10 = this.countryCode;
        Boolean bool = this.isSync;
        boolean z6 = this.isLeadCallLog;
        String str3 = this.dateTime;
        String str4 = this.callType;
        String str5 = this.fromNumber;
        boolean z10 = this.isCallRecordingsDeleted;
        StringBuilder sbM127r = AbstractC0030c.m127r("CallLogResponse(toName=", str, ", toNumber=", str2, ", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", isSync=");
        sbM127r.append(bool);
        sbM127r.append(", isLeadCallLog=");
        AbstractC4801l.m9751y(sbM127r, z6, ", dateTime=", str3, ", callType=");
        a1.m14319B(sbM127r, str4, ", fromNumber=", str5, ", isCallRecordingsDeleted=");
        return AbstractC5601a.m11242m(sbM127r, z10, ")");
    }
}
