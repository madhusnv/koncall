package ng;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d3.h0;
import k2.C3966o;
import k2.InterfaceC3962k;
import mb.c2;
import mb.d2;
import mb.e2;
import mb.f2;
import mb.g2;
import mb.h2;
import mb.i2;
import og.s0;
import t5.AbstractC7052j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.s */
/* loaded from: classes.dex */
public abstract class AbstractC5068s {

    /* renamed from: a */
    public static C5067r f24861a;

    /* renamed from: a */
    public static final long m9996a(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        Resources resourcesM10885b = s0.m10885b(c3966o);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = AbstractC7052j.f34088a;
        return h0.m5131c(resourcesM10885b.getColor(i10, theme));
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
    public static i2 m9997b(String str) {
        switch (str.hashCode()) {
            case 35394935:
                if (str.equals("PENDING")) {
                    return f2.f23240b;
                }
                break;
            case 183181625:
                if (str.equals("COMPLETE")) {
                    return c2.f23221b;
                }
                break;
            case 1383663147:
                if (str.equals("COMPLETED")) {
                    return d2.f23227b;
                }
                break;
            case 1812487320:
                if (str.equals("REPLICA")) {
                    return g2.f23245b;
                }
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    return e2.f23233b;
                }
                break;
        }
        return new h2(str);
    }
}
