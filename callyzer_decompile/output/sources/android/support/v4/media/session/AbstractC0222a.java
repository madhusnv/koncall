package android.support.v4.media.session;

import android.view.View;
import hq.d0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import mx.AbstractC4913i;
import og.te;
import pg.w9;
import s4.C6745a;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public abstract class AbstractC0222a {
    /* renamed from: a */
    public static final long m548a(long j6, boolean z6, int i10, float f6) {
        int iM12918i = ((z6 || i10 == 2 || i10 == 4 || i10 == 5) && C6745a.m12914e(j6)) ? C6745a.m12918i(j6) : Integer.MAX_VALUE;
        if (C6745a.m12920k(j6) != iM12918i) {
            iM12918i = w9.m11912c(r0.m15457q(f6), C6745a.m12920k(j6), iM12918i);
        }
        return te.m10936b(0, iM12918i, 0, C6745a.m12917h(j6));
    }

    /* renamed from: b */
    public static final a0 m549b(View view) {
        AbstractC4154l.m8923f(view, "view");
        a0 a0Var = (a0) AbstractC4913i.m9808d(AbstractC4913i.m9812h(AbstractC4913i.m9809e(new d0(13), view), new d0(14)));
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
