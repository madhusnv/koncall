package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.k */
/* loaded from: classes3.dex */
public final class C3874k extends q0 {

    /* renamed from: a */
    public char[] f19914a;

    /* renamed from: b */
    public int f19915b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f19914a, this.f19915b);
        AbstractC4154l.m8922e(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        char[] cArr = this.f19914a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            AbstractC4154l.m8922e(cArrCopyOf, "copyOf(...)");
            this.f19914a = cArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19915b;
    }
}
