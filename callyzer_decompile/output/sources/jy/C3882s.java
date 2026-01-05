package jy;

import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.s */
/* loaded from: classes3.dex */
public final class C3882s {

    /* renamed from: e */
    public static final long[] f19957e = new long[0];

    /* renamed from: a */
    public final InterfaceC3055f f19958a;

    /* renamed from: b */
    public final i1.e0 f19959b;

    /* renamed from: c */
    public long f19960c;

    /* renamed from: d */
    public final long[] f19961d;

    public C3882s(InterfaceC3055f descriptor, i1.e0 e0Var) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        this.f19958a = descriptor;
        this.f19959b = e0Var;
        int iMo7281f = descriptor.mo7281f();
        if (iMo7281f <= 64) {
            this.f19960c = iMo7281f != 64 ? (-1) << iMo7281f : 0L;
            this.f19961d = f19957e;
            return;
        }
        this.f19960c = 0L;
        int i10 = (iMo7281f - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iMo7281f & 63) != 0) {
            jArr[i10 - 1] = (-1) << iMo7281f;
        }
        this.f19961d = jArr;
    }
}
