package og;

import eb.C1993q;
import eb.C1994r;
import eb.C1995s;
import eb.C1996t;
import eb.C1997u;
import eb.C1998v;
import eb.C1999w;
import eb.C2000x;
import eb.C2001y;
import eb.C2002z;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class sd {
    /* JADX WARN: Removed duplicated region for block: B:177:0x0271  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10911a(w2.InterfaceC7879r r37, r1.C6440y r38, r1.C6420e r39, o1.h1 r40, k1.k0 r41, boolean r42, i1.C3128g r43, o1.InterfaceC5249h r44, o1.InterfaceC5247f r45, ex.InterfaceC2139c r46, k2.InterfaceC3962k r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.sd.m10911a(w2.r, r1.y, r1.e, o1.h1, k1.k0, boolean, i1.g, o1.h, o1.f, ex.c, k2.k, int, int):void");
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
    /* renamed from: b */
    public static eb.h0 m10912b(String value) {
        AbstractC4154l.m8923f(value, "value");
        switch (value.hashCode()) {
            case -1737337862:
                if (value.equals("PASSWORD_VERIFIER")) {
                    return C2002z.f9524b;
                }
                break;
            case -1409329619:
                if (value.equals("PASSWORD_SRP")) {
                    return C2001y.f9517b;
                }
                break;
            case -1406772517:
                if (value.equals("WEB_AUTHN")) {
                    return eb.g0.f9318b;
                }
                break;
            case -1362602558:
                if (value.equals("SMS_MFA")) {
                    return eb.d0.f9287b;
                }
                break;
            case -1362600187:
                if (value.equals("SMS_OTP")) {
                    return eb.e0.f9299b;
                }
                break;
            case 161754570:
                if (value.equals("SOFTWARE_TOKEN_MFA")) {
                    return eb.f0.f9309b;
                }
                break;
            case 325396255:
                if (value.equals("DEVICE_SRP_AUTH")) {
                    return C1996t.f9457b;
                }
                break;
            case 338106308:
                if (value.equals("NEW_PASSWORD_REQUIRED")) {
                    return C1999w.f9502b;
                }
                break;
            case 359356710:
                if (value.equals("MFA_SETUP")) {
                    return C1998v.f9480b;
                }
                break;
            case 613324744:
                if (value.equals("EMAIL_OTP")) {
                    return C1997u.f9478b;
                }
                break;
            case 645737717:
                if (value.equals("CUSTOM_CHALLENGE")) {
                    return C1994r.f9431b;
                }
                break;
            case 823370944:
                if (value.equals("SELECT_CHALLENGE")) {
                    return eb.b0.f9274b;
                }
                break;
            case 872896308:
                if (value.equals("SELECT_MFA_TYPE")) {
                    return eb.c0.f9282b;
                }
                break;
            case 1330737924:
                if (value.equals("ADMIN_NO_SRP_AUTH")) {
                    return C1993q.f9419b;
                }
                break;
            case 1362077265:
                if (value.equals("DEVICE_PASSWORD_VERIFIER")) {
                    return C1995s.f9438b;
                }
                break;
            case 1999612571:
                if (value.equals("PASSWORD")) {
                    return C2000x.f9505b;
                }
                break;
        }
        return new eb.a0(value);
    }
}
