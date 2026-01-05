package e0;

import c0.b2;
import c0.k1;
import c0.v0;
import i0.w2;
import kotlin.jvm.internal.AbstractC4154l;
import m0.C4612f;
import u0.C7294d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e0.e */
/* loaded from: classes.dex */
public final class C1896e {
    /* renamed from: a */
    public static EnumC1898g m5515a(b2 b2Var) {
        AbstractC4154l.m8923f(b2Var, "<this>");
        return b2Var instanceof k1 ? EnumC1898g.PREVIEW : b2Var instanceof v0 ? EnumC1898g.IMAGE_CAPTURE : C4612f.m9481B(b2Var) ? EnumC1898g.VIDEO_CAPTURE : b2Var instanceof C7294d ? EnumC1898g.STREAM_SHARING : EnumC1898g.UNDEFINED;
    }

    /* renamed from: b */
    public static EnumC1898g m5516b(w2 w2Var) {
        AbstractC4154l.m8923f(w2Var, "<this>");
        int i10 = AbstractC1895d.f8916a[w2Var.mo7421E().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? EnumC1898g.UNDEFINED : EnumC1898g.STREAM_SHARING : EnumC1898g.VIDEO_CAPTURE : EnumC1898g.PREVIEW : EnumC1898g.IMAGE_CAPTURE;
    }
}
