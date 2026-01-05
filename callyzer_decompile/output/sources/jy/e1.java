package jy;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6371u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e1 extends q0 {

    /* renamed from: a */
    public int[] f19889a;

    /* renamed from: b */
    public int f19890b;

    @Override // jy.q0
    /* renamed from: a */
    public final Object mo8414a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f19889a, this.f19890b);
        AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
        return new C6371u(iArrCopyOf);
    }

    @Override // jy.q0
    /* renamed from: b */
    public final void mo8415b(int i10) {
        int[] iArr = this.f19889a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f19889a = iArrCopyOf;
        }
    }

    @Override // jy.q0
    /* renamed from: d */
    public final int mo8416d() {
        return this.f19890b;
    }
}
