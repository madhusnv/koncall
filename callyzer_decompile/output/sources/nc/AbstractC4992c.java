package nc;

import b2.y0;
import c3.C0848c;
import ex.InterfaceC2139c;
import k0.AbstractC3898h;
import mb.j1;
import mb.k1;
import mb.l1;
import mb.m1;
import mb.n1;
import mb.o1;
import mb.p1;
import mb.q1;
import mb.r1;
import mb.s1;
import mb.t1;
import mb.u1;
import mb.v1;
import mb.w1;
import pc.C5887o;
import pc.C5888p;
import pc.C5889q;
import t3.InterfaceC7033t;
import x1.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.c */
/* loaded from: classes.dex */
public abstract class AbstractC4992c {
    /* renamed from: a */
    public static final C5887o m9900a(InterfaceC2139c interfaceC2139c) {
        if (interfaceC2139c == null) {
            return new C5887o(C5889q.f28716k);
        }
        int i10 = C5887o.f28703g;
        C5888p c5888p = new C5888p();
        interfaceC2139c.invoke(c5888p);
        return new C5887o(new C5889q(c5888p));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9901b(boolean r16, r4.EnumC6455j r17, b2.y0 r18, k2.InterfaceC3962k r19, int r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.AbstractC4992c.m9901b(boolean, r4.j, b2.y0, k2.k, int):void");
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
    /* renamed from: c */
    public static w1 m9902c(String str) {
        switch (str.hashCode()) {
            case -1400230653:
                if (str.equals("EXPRESS_ONEZONE")) {
                    return k1.f23268b;
                }
                break;
            case -1285524091:
                if (str.equals("ONEZONE_IA")) {
                    return p1.f23424b;
                }
                break;
            case -456762289:
                if (str.equals("DEEP_ARCHIVE")) {
                    return j1.f23261b;
                }
                break;
            case 2550147:
                if (str.equals("SNOW")) {
                    return t1.f23471b;
                }
                break;
            case 246938206:
                if (str.equals("REDUCED_REDUNDANCY")) {
                    return r1.f23445b;
                }
                break;
            case 826164623:
                if (str.equals("GLACIER")) {
                    return m1.f23354b;
                }
                break;
            case 852630853:
                if (str.equals("OUTPOSTS")) {
                    return q1.f23441b;
                }
                break;
            case 988907994:
                if (str.equals("STANDARD_IA")) {
                    return v1.f23502b;
                }
                break;
            case 1305227448:
                if (str.equals("INTELLIGENT_TIERING")) {
                    return o1.f23370b;
                }
                break;
            case 1307540745:
                if (str.equals("FSX_OPENZFS")) {
                    return l1.f23311b;
                }
                break;
            case 2095255229:
                if (str.equals("STANDARD")) {
                    return u1.f23494b;
                }
                break;
            case 2107771353:
                if (str.equals("GLACIER_IR")) {
                    return n1.f23360b;
                }
                break;
        }
        return new s1(str);
    }

    /* renamed from: d */
    public static final boolean m9903d(y0 y0Var, boolean z6) {
        InterfaceC7033t interfaceC7033tM15479c;
        v0 v0Var = y0Var.f3869d;
        if (v0Var == null || (interfaceC7033tM15479c = v0Var.m15479c()) == null) {
            return false;
        }
        C0848c c0848cM8431b = AbstractC3898h.m8431b(interfaceC7033tM15479c);
        long jM1700j = y0Var.m1700j(z6);
        float f6 = c0848cM8431b.f5354a;
        float f10 = c0848cM8431b.f5356c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM1700j >> 32));
        if (f6 > fIntBitsToFloat || fIntBitsToFloat > f10) {
            return false;
        }
        float f11 = c0848cM8431b.f5355b;
        float f12 = c0848cM8431b.f5357d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM1700j & 4294967295L));
        return f11 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f12;
    }
}
