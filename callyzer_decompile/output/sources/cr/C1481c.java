package cr;

import d3.C1565s;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5416r;
import uv.AbstractC7548a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cr.c */
/* loaded from: classes3.dex */
public final class C1481c {

    /* renamed from: a */
    public final C5416r f7556a;

    /* renamed from: b */
    public final String f7557b;

    /* renamed from: c */
    public final int f7558c;

    public C1481c(C5416r analysisData, String str) {
        AbstractC4154l.m8923f(analysisData, "analysisData");
        this.f7556a = analysisData;
        this.f7557b = str;
        this.f7558c = analysisData.f27213a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: a */
    public final long m5058a(InterfaceC3962k interfaceC3962k) {
        String str = this.f7557b;
        switch (str.hashCode()) {
            case -1990013253:
                if (str.equals("Missed")) {
                    C3966o c3966o = (C3966o) interfaceC3962k;
                    c3966o.m8607Y(1274069682);
                    c3966o.m8623p(false);
                    return AbstractC7548a.f36342O;
                }
                break;
            case -543852386:
                if (str.equals("Rejected")) {
                    C3966o c3966o2 = (C3966o) interfaceC3962k;
                    c3966o2.m8607Y(1274070996);
                    c3966o2.m8623p(false);
                    return AbstractC7548a.f36343P;
                }
                break;
            case 80997156:
                if (str.equals("Total")) {
                    C3966o c3966o3 = (C3966o) interfaceC3962k;
                    c3966o3.m8607Y(1274073109);
                    long j6 = ((v1) c3966o3.m8618k(y1.f13286a)).f12970q;
                    c3966o3.m8623p(false);
                    return j6;
                }
                break;
            case 126326668:
                if (str.equals("Outgoing")) {
                    C3966o c3966o4 = (C3966o) interfaceC3962k;
                    c3966o4.m8607Y(1274068372);
                    c3966o4.m8623p(false);
                    return AbstractC7548a.f36341N;
                }
                break;
            case 157441094:
                if (str.equals("Incoming")) {
                    C3966o c3966o5 = (C3966o) interfaceC3962k;
                    c3966o5.m8607Y(1274066996);
                    c3966o5.m8623p(false);
                    return AbstractC7548a.f36340M;
                }
                break;
        }
        C3966o c3966o6 = (C3966o) interfaceC3962k;
        c3966o6.m8607Y(1274074263);
        c3966o6.m8623p(false);
        return C1565s.f7817j;
    }

    /* renamed from: b */
    public final o0 m5059b(InterfaceC3962k interfaceC3962k) {
        if (this.f7557b.equals("Total")) {
            C3966o c3966o = (C3966o) interfaceC3962k;
            c3966o.m8607Y(1190518708);
            o0 o0Var = ((vd) c3966o.m8618k(xd.f13268a)).f13052h;
            c3966o.m8623p(false);
            return o0Var;
        }
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.m8607Y(1190520531);
        o0 o0Var2 = ((vd) c3966o2.m8618k(xd.f13268a)).f13055k;
        c3966o2.m8623p(false);
        return o0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1481c)) {
            return false;
        }
        C1481c c1481c = (C1481c) obj;
        return AbstractC4154l.m8918a(this.f7556a, c1481c.f7556a) && AbstractC4154l.m8918a(this.f7557b, c1481c.f7557b);
    }

    public final int hashCode() {
        return this.f7557b.hashCode() + (this.f7556a.hashCode() * 31);
    }

    public final String toString() {
        return "ContactDetailSummaryUIModel(analysisData=" + this.f7556a + ", title=" + this.f7557b + ")";
    }
}
