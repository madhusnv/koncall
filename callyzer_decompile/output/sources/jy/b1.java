package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6369s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b1 extends q0 {

    /* renamed from: a */
    public byte[] f19874a;

    /* renamed from: b */
    public int f19875b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f19874a, this.f19875b);
        AbstractC4154l.m8922e(bArrCopyOf, "copyOf(...)");
        return new C6369s(bArrCopyOf);
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        byte[] bArr = this.f19874a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            AbstractC4154l.m8922e(bArrCopyOf, "copyOf(...)");
            this.f19874a = bArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19875b;
    }
}
