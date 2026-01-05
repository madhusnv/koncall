package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.o */
/* loaded from: classes3.dex */
public final class C3878o extends q0 {

    /* renamed from: a */
    public double[] f19934a;

    /* renamed from: b */
    public int f19935b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f19934a, this.f19935b);
        AbstractC4154l.m8922e(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        double[] dArr = this.f19934a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            AbstractC4154l.m8922e(dArrCopyOf, "copyOf(...)");
            this.f19934a = dArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19935b;
    }
}
