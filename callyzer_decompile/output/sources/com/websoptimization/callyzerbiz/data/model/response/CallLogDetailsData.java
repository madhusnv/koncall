package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallLogDetailsData {

    @InterfaceC4485b("bucketUrl")
    private final String callRecordBucketUrl;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final int duration;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC4485b("isLeadCallLog")
    private final boolean isLeadCallLog;

    @InterfaceC4485b("notes")
    private final String notes;

    @InterfaceC4485b("syncStatus")
    private final EnumC8993c syncStatus;

    @InterfaceC4485b("toName")
    private final String toName;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public CallLogDetailsData(String toName, String callType, String fromNumber, String toNumber, String dateTime, int i10, int i11, EnumC8993c enumC8993c, String str, String str2, boolean z6) {
        AbstractC4154l.m8923f(toName, "toName");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        this.toName = toName;
        this.callType = callType;
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.dateTime = dateTime;
        this.duration = i10;
        this.countryCode = i11;
        this.syncStatus = enumC8993c;
        this.callRecordBucketUrl = str;
        this.notes = str2;
        this.isLeadCallLog = z6;
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
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mm.C4791b m4739a() {
        /*
            r11 = this;
            mm.c r0 = new mm.c
            java.lang.String r1 = r11.toName
            java.lang.String r2 = r11.toNumber
            int r3 = r11.countryCode
            java.lang.String r4 = r11.callType
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r5)
            int r5 = r4.hashCode()
            switch(r5) {
                case -1990013253: goto L3b;
                case -543852386: goto L2f;
                case 126326668: goto L23;
                case 157441094: goto L17;
                default: goto L16;
            }
        L16:
            goto L43
        L17:
            java.lang.String r5 = "Incoming"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L20
            goto L43
        L20:
            zm.d r4 = zm.EnumC8994d.INCOMING
            goto L47
        L23:
            java.lang.String r5 = "Outgoing"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2c
            goto L43
        L2c:
            zm.d r4 = zm.EnumC8994d.OUTGOING
            goto L47
        L2f:
            java.lang.String r5 = "Rejected"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L38
            goto L43
        L38:
            zm.d r4 = zm.EnumC8994d.REJECTED
            goto L47
        L3b:
            java.lang.String r5 = "Missed"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L45
        L43:
            r4 = 0
            goto L47
        L45:
            zm.d r4 = zm.EnumC8994d.MISSED
        L47:
            yv.o r5 = yv.C8800o.f42459a
            java.lang.String r5 = r11.dateTime
            j$.time.LocalDateTime r5 = yv.C8800o.m16183G(r5)
            java.lang.String r6 = r11.fromNumber
            int r7 = r11.duration
            long r7 = (long) r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r10 = 258(0x102, float:3.62E-43)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            java.lang.String r1 = r11.dateTime
            j$.time.LocalDateTime r3 = yv.C8800o.m16183G(r1)
            java.lang.String r5 = r11.notes
            boolean r6 = r11.isLeadCallLog
            zm.a r1 = zm.EnumC8991a.SYNC_DONE
            java.util.EnumSet r4 = java.util.EnumSet.of(r1)
            java.lang.String r1 = "of(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r4, r1)
            r2 = r0
            mm.b r0 = new mm.b
            r1 = 0
            r7 = 2544(0x9f0, float:3.565E-42)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            zm.c r1 = r11.syncStatus
            if (r1 == 0) goto La8
            zm.c r2 = zm.EnumC8993c.SUCCESS
            if (r1 != r2) goto L98
            yv.f r1 = yv.C8791f.f42457a
            java.lang.String r1 = r11.callRecordBucketUrl
            boolean r1 = yv.C8791f.m16171d(r1)
            if (r1 == 0) goto L98
            zm.c r1 = r11.syncStatus
            r0.f23836e = r1
            java.lang.String r1 = r11.callRecordBucketUrl
            r0.f23839h = r1
            return r0
        L98:
            zm.c r1 = r11.syncStatus
            zm.c r2 = zm.EnumC8993c.NOT_FOUND
            if (r1 == r2) goto La6
            zm.c r2 = zm.EnumC8993c.DELETED
            if (r1 == r2) goto La6
            zm.c r2 = zm.EnumC8993c.LARGE_SIZE
            if (r1 != r2) goto La8
        La6:
            r0.f23836e = r1
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.data.model.response.CallLogDetailsData.m4739a():mm.b");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallLogDetailsData)) {
            return false;
        }
        CallLogDetailsData callLogDetailsData = (CallLogDetailsData) obj;
        return AbstractC4154l.m8918a(this.toName, callLogDetailsData.toName) && AbstractC4154l.m8918a(this.callType, callLogDetailsData.callType) && AbstractC4154l.m8918a(this.fromNumber, callLogDetailsData.fromNumber) && AbstractC4154l.m8918a(this.toNumber, callLogDetailsData.toNumber) && AbstractC4154l.m8918a(this.dateTime, callLogDetailsData.dateTime) && this.duration == callLogDetailsData.duration && this.countryCode == callLogDetailsData.countryCode && this.syncStatus == callLogDetailsData.syncStatus && AbstractC4154l.m8918a(this.callRecordBucketUrl, callLogDetailsData.callRecordBucketUrl) && AbstractC4154l.m8918a(this.notes, callLogDetailsData.notes) && this.isLeadCallLog == callLogDetailsData.isLeadCallLog;
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.countryCode, AbstractC1452a.m4556c(this.duration, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.toName.hashCode() * 31, 31, this.callType), 31, this.fromNumber), 31, this.toNumber), 31, this.dateTime), 31), 31);
        EnumC8993c enumC8993c = this.syncStatus;
        int iHashCode = (iM4556c + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str = this.callRecordBucketUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notes;
        return Boolean.hashCode(this.isLeadCallLog) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.toName;
        String str2 = this.callType;
        String str3 = this.fromNumber;
        String str4 = this.toNumber;
        String str5 = this.dateTime;
        int i10 = this.duration;
        int i11 = this.countryCode;
        EnumC8993c enumC8993c = this.syncStatus;
        String str6 = this.callRecordBucketUrl;
        String str7 = this.notes;
        boolean z6 = this.isLeadCallLog;
        StringBuilder sbM127r = AbstractC0030c.m127r("CallLogDetailsData(toName=", str, ", callType=", str2, ", fromNumber=");
        a1.m14319B(sbM127r, str3, ", toNumber=", str4, ", dateTime=");
        AbstractC1452a.m4551B(sbM127r, str5, ", duration=", i10, ", countryCode=");
        sbM127r.append(i11);
        sbM127r.append(", syncStatus=");
        sbM127r.append(enumC8993c);
        sbM127r.append(", callRecordBucketUrl=");
        a1.m14319B(sbM127r, str6, ", notes=", str7, ", isLeadCallLog=");
        return AbstractC5601a.m11242m(sbM127r, z6, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallLogDetailsData(String str, String str2, String str3, String str4, String str5, int i10, int i11, EnumC8993c enumC8993c, String str6, String str7, boolean z6, int i12, AbstractC4148f abstractC4148f) {
        boolean z10;
        String str8;
        enumC8993c = (i12 & 128) != 0 ? null : enumC8993c;
        str6 = (i12 & 256) != 0 ? null : str6;
        if ((i12 & 512) != 0) {
            z10 = z6;
            str8 = null;
        } else {
            z10 = z6;
            str8 = str7;
        }
        this(str, str2, str3, str4, str5, i10, i11, enumC8993c, str6, str8, z10);
    }
}
