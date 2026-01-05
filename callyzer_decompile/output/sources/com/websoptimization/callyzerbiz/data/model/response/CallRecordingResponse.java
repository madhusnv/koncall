package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4791b;
import nm.C5107b;
import p020v.a1;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingResponse {

    /* renamed from: a */
    public C4791b f7376a;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final long duration;

    @InterfaceC4485b("isCallRecordingUpdate")
    private final boolean isCallRecordingUpdate;

    @InterfaceC4485b("toNumber")
    private final String number;

    @InterfaceC4485b("fromNumber")
    private final String simNumber;

    public CallRecordingResponse(String number, String simNumber, String callType, String dateTime, long j6, int i10, boolean z6) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        this.number = number;
        this.simNumber = simNumber;
        this.callType = callType;
        this.dateTime = dateTime;
        this.duration = j6;
        this.countryCode = i10;
        this.isCallRecordingUpdate = z6;
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
    public final zm.EnumC8994d m4757a() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse.m4757a():zm.d");
    }

    /* renamed from: b */
    public final LocalDateTime m4758b() {
        C8800o c8800o = C8800o.f42459a;
        return C8800o.m16183G(this.dateTime);
    }

    /* renamed from: c */
    public final String m4759c() {
        return this.number;
    }

    /* renamed from: d */
    public final String m4760d() {
        return this.simNumber;
    }

    /* renamed from: e */
    public final boolean m4761e() {
        return this.isCallRecordingUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallRecordingResponse)) {
            return false;
        }
        CallRecordingResponse callRecordingResponse = (CallRecordingResponse) obj;
        return AbstractC4154l.m8918a(this.number, callRecordingResponse.number) && AbstractC4154l.m8918a(this.simNumber, callRecordingResponse.simNumber) && AbstractC4154l.m8918a(this.callType, callRecordingResponse.callType) && AbstractC4154l.m8918a(this.dateTime, callRecordingResponse.dateTime) && this.duration == callRecordingResponse.duration && this.countryCode == callRecordingResponse.countryCode && this.isCallRecordingUpdate == callRecordingResponse.isCallRecordingUpdate;
    }

    /* renamed from: f */
    public final C5107b m4762f() {
        return new C5107b(this.number, this.simNumber, this.dateTime, this.callType);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCallRecordingUpdate) + AbstractC1452a.m4556c(this.countryCode, AbstractC1452a.m4557d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.number.hashCode() * 31, 31, this.simNumber), 31, this.callType), 31, this.dateTime), 31, this.duration), 31);
    }

    public final String toString() {
        String str = this.number;
        String str2 = this.simNumber;
        String str3 = this.callType;
        String str4 = this.dateTime;
        long j6 = this.duration;
        int i10 = this.countryCode;
        boolean z6 = this.isCallRecordingUpdate;
        StringBuilder sbM127r = AbstractC0030c.m127r("CallRecordingResponse(number=", str, ", simNumber=", str2, ", callType=");
        a1.m14319B(sbM127r, str3, ", dateTime=", str4, ", duration=");
        sbM127r.append(j6);
        sbM127r.append(", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", isCallRecordingUpdate=");
        sbM127r.append(z6);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
