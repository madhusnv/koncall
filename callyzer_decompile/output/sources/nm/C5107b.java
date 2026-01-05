package nm;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nm.b */
/* loaded from: classes3.dex */
public final class C5107b {

    /* renamed from: a */
    public final String f25010a;

    /* renamed from: b */
    public final String f25011b;

    /* renamed from: c */
    public final String f25012c;

    /* renamed from: d */
    public final String f25013d;

    public C5107b(String toNumber, String fromNumber, String dateTime, String callType) {
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(callType, "callType");
        this.f25010a = toNumber;
        this.f25011b = fromNumber;
        this.f25012c = dateTime;
        this.f25013d = callType;
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
    public final zm.EnumC8994d m10037a() {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            java.lang.String r1 = r2.f25013d
            kotlin.jvm.internal.AbstractC4154l.m8923f(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1990013253: goto L33;
                case -543852386: goto L27;
                case 126326668: goto L1b;
                case 157441094: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3b
        Lf:
            java.lang.String r0 = "Incoming"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L18
            goto L3b
        L18:
            zm.d r0 = zm.EnumC8994d.INCOMING
            goto L3f
        L1b:
            java.lang.String r0 = "Outgoing"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L24
            goto L3b
        L24:
            zm.d r0 = zm.EnumC8994d.OUTGOING
            goto L3f
        L27:
            java.lang.String r0 = "Rejected"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            goto L3b
        L30:
            zm.d r0 = zm.EnumC8994d.REJECTED
            goto L3f
        L33:
            java.lang.String r0 = "Missed"
            boolean r0 = r1.equals(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: nm.C5107b.m10037a():zm.d");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5107b)) {
            return false;
        }
        C5107b c5107b = (C5107b) obj;
        return AbstractC4154l.m8918a(this.f25010a, c5107b.f25010a) && AbstractC4154l.m8918a(this.f25011b, c5107b.f25011b) && AbstractC4154l.m8918a(this.f25012c, c5107b.f25012c) && AbstractC4154l.m8918a(this.f25013d, c5107b.f25013d);
    }

    public final int hashCode() {
        return this.f25013d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(this.f25010a.hashCode() * 31, 31, this.f25011b), 31, this.f25012c);
    }

    public final String toString() {
        return AbstractC0030c.m124o(AbstractC0030c.m127r("CallLogIdentificationParams(toNumber=", this.f25010a, ", fromNumber=", this.f25011b, ", dateTime="), this.f25012c, ", callType=", this.f25013d, ")");
    }
}
