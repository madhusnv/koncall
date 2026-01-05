package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.v */
/* loaded from: classes3.dex */
public final class C3885v extends q0 {

    /* renamed from: a */
    public float[] f19972a;

    /* renamed from: b */
    public int f19973b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f19972a, this.f19973b);
        AbstractC4154l.m8922e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        float[] fArr = this.f19972a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            AbstractC4154l.m8922e(fArrCopyOf, "copyOf(...)");
            this.f19972a = fArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19973b;
    }
}
