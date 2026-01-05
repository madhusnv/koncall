package js;

import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: js.b */
/* loaded from: classes3.dex */
public final class C3846b {

    /* renamed from: a */
    public final LastCallDetails f19803a;

    /* renamed from: b */
    public final int f19804b;

    /* renamed from: c */
    public final String f19805c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3846b(com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.f19803a = r3
            if (r3 == 0) goto Lc
            java.lang.String r0 = r3.m4905c()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L4b
            int r1 = r0.hashCode()
            switch(r1) {
                case -1990013253: goto L3e;
                case -543852386: goto L31;
                case 126326668: goto L24;
                case 157441094: goto L17;
                default: goto L16;
            }
        L16:
            goto L4b
        L17:
            java.lang.String r1 = "Incoming"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            r0 = 2131231048(0x7f080148, float:1.8078166E38)
            goto L4e
        L24:
            java.lang.String r1 = "Outgoing"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L4b
        L2d:
            r0 = 2131231080(0x7f080168, float:1.807823E38)
            goto L4e
        L31:
            java.lang.String r1 = "Rejected"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            goto L4b
        L3a:
            r0 = 2131231089(0x7f080171, float:1.807825E38)
            goto L4e
        L3e:
            java.lang.String r1 = "Missed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L4b
        L47:
            r0 = 2131231062(0x7f080156, float:1.8078194E38)
            goto L4e
        L4b:
            r0 = 2131230998(0x7f080116, float:1.8078065E38)
        L4e:
            r2.f19804b = r0
            if (r3 == 0) goto L5f
            j$.time.LocalDateTime r3 = r3.m4904b()
            if (r3 == 0) goto L5f
            yv.o r0 = yv.C8800o.f42459a
            java.lang.String r3 = yv.C8800o.m16188L(r3)
            goto L61
        L5f:
            java.lang.String r3 = ""
        L61:
            r2.f19805c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: js.C3846b.<init>(com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3846b) && AbstractC4154l.m8918a(this.f19803a, ((C3846b) obj).f19803a);
    }

    public final int hashCode() {
        LastCallDetails lastCallDetails = this.f19803a;
        if (lastCallDetails == null) {
            return 0;
        }
        return lastCallDetails.hashCode();
    }

    public final String toString() {
        return "LastCallDetailUIModel(lastCallDetails=" + this.f19803a + ")";
    }
}
