package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends q0 {

    /* renamed from: a */
    public long[] f19902a;

    /* renamed from: b */
    public int f19903b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f19902a, this.f19903b);
        AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        long[] jArr = this.f19902a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
            this.f19902a = jArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19903b;
    }
}
