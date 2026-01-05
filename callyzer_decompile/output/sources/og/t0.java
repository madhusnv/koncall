package og;

import java.util.Arrays;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t0 {
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
    public static mb.m3 m10918a(String str) {
        switch (str.hashCode()) {
            case -1400230653:
                if (str.equals("EXPRESS_ONEZONE")) {
                    return mb.a3.f23192b;
                }
                break;
            case -1285524091:
                if (str.equals("ONEZONE_IA")) {
                    return mb.f3.f23241b;
                }
                break;
            case -456762289:
                if (str.equals("DEEP_ARCHIVE")) {
                    return mb.z2.f23603b;
                }
                break;
            case 2550147:
                if (str.equals("SNOW")) {
                    return mb.j3.f23263b;
                }
                break;
            case 246938206:
                if (str.equals("REDUCED_REDUNDANCY")) {
                    return mb.h3.f23251b;
                }
                break;
            case 826164623:
                if (str.equals("GLACIER")) {
                    return mb.c3.f23222b;
                }
                break;
            case 852630853:
                if (str.equals("OUTPOSTS")) {
                    return mb.g3.f23246b;
                }
                break;
            case 988907994:
                if (str.equals("STANDARD_IA")) {
                    return mb.l3.f23313b;
                }
                break;
            case 1305227448:
                if (str.equals("INTELLIGENT_TIERING")) {
                    return mb.e3.f23234b;
                }
                break;
            case 1307540745:
                if (str.equals("FSX_OPENZFS")) {
                    return mb.b3.f23213b;
                }
                break;
            case 2095255229:
                if (str.equals("STANDARD")) {
                    return mb.k3.f23270b;
                }
                break;
            case 2107771353:
                if (str.equals("GLACIER_IR")) {
                    return mb.d3.f23228b;
                }
                break;
        }
        return new mb.i3(str);
    }

    /* renamed from: b */
    public static final String m10919b(int i10, Object[] objArr, InterfaceC3962k interfaceC3962k) {
        return s0.m10885b(interfaceC3962k).getString(i10, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: c */
    public static final String m10920c(InterfaceC3962k interfaceC3962k, int i10) {
        return s0.m10885b(interfaceC3962k).getString(i10);
    }
}
