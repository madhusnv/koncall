package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x0 extends q0 {

    /* renamed from: a */
    public short[] f19980a;

    /* renamed from: b */
    public int f19981b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f19980a, this.f19981b);
        AbstractC4154l.m8922e(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        short[] sArr = this.f19980a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            AbstractC4154l.m8922e(sArrCopyOf, "copyOf(...)");
            this.f19980a = sArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19981b;
    }
}
