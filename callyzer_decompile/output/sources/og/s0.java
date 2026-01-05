package og;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import k2.C3966o;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class s0 {
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
    public static mb.w2 m10884a(String str) {
        switch (str.hashCode()) {
            case -591552690:
                if (str.equals("aws:fsx")) {
                    return mb.s2.f23453b;
                }
                break;
            case -591548076:
                if (str.equals("aws:kms")) {
                    return mb.t2.f23472b;
                }
                break;
            case 769689991:
                if (str.equals("aws:kms:dsse")) {
                    return mb.u2.f23495b;
                }
                break;
            case 1927140164:
                if (str.equals("AES256")) {
                    return mb.r2.f23446b;
                }
                break;
        }
        return new mb.v2(str);
    }

    /* renamed from: b */
    public static final Resources m10885b(InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8618k(AndroidCompositionLocals_androidKt.f2133a);
        return ((Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b)).getResources();
    }
}
