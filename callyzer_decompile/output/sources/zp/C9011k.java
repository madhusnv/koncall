package zp;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.k */
/* loaded from: classes3.dex */
public final class C9011k {

    /* renamed from: a */
    public final String f43407a;

    /* renamed from: b */
    public final String f43408b;

    /* renamed from: c */
    public final int f43409c;

    /* renamed from: d */
    public final int f43410d;

    /* renamed from: e */
    public final int f43411e;

    /* renamed from: f */
    public final String f43412f;

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
    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9011k(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp.C9011k.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9011k)) {
            return false;
        }
        C9011k c9011k = (C9011k) obj;
        return AbstractC4154l.m8918a(this.f43407a, c9011k.f43407a) && AbstractC4154l.m8918a(this.f43408b, c9011k.f43408b);
    }

    public final int hashCode() {
        return this.f43408b.hashCode() + (this.f43407a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("TopCallDetailUIModel(dataType=", this.f43407a, ", data=", this.f43408b, ")");
    }
}
