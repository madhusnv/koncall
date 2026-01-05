package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6373w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h1 extends q0 {

    /* renamed from: a */
    public long[] f19904a;

    /* renamed from: b */
    public int f19905b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f19904a, this.f19905b);
        AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
        return new C6373w(jArrCopyOf);
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        long[] jArr = this.f19904a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
            this.f19904a = jArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19905b;
    }
}
