package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends q0 {

    /* renamed from: a */
    public int[] f19872a;

    /* renamed from: b */
    public int f19873b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f19872a, this.f19873b);
        AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        int[] iArr = this.f19872a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f19872a = iArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19873b;
    }
}
