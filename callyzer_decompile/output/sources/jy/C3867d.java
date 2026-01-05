package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.d */
/* loaded from: classes3.dex */
public final class C3867d extends q0 {

    /* renamed from: a */
    public boolean[] f19880a;

    /* renamed from: b */
    public int f19881b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f19880a, this.f19881b);
        AbstractC4154l.m8922e(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        boolean[] zArr = this.f19880a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            AbstractC4154l.m8922e(zArrCopyOf, "copyOf(...)");
            this.f19880a = zArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19881b;
    }
}
