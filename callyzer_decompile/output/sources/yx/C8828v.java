package yx;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import tx.t0;
import tx.u0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.v */
/* loaded from: classes3.dex */
public class C8828v {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42525b = AtomicIntegerFieldUpdater.newUpdater(C8828v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public t0[] f42526a;

    /* renamed from: a */
    public final void m16279a(t0 t0Var) {
        t0Var.m13576c((u0) this);
        t0[] t0VarArr = this.f42526a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42525b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f42526a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            t0VarArr = (t0[]) objArrCopyOf;
            this.f42526a = t0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        t0VarArr[i10] = t0Var;
        t0Var.f34679b = i10;
        m16281c(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tx.t0 m16280b(int r9) {
        /*
            r8 = this;
            tx.t0[] r0 = r8.f42526a
            kotlin.jvm.internal.AbstractC4154l.m8920c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = yx.C8828v.f42525b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m16282d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m16282d(r9, r2)
            r8.m16281c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            tx.t0[] r5 = r8.f42526a
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m16282d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.AbstractC4154l.m8920c(r9)
            r2 = 0
            r9.m13576c(r2)
            r9.f34679b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.C8828v.m16280b(int):tx.t0");
    }

    /* renamed from: c */
    public final void m16281c(int i10) {
        while (i10 > 0) {
            t0[] t0VarArr = this.f42526a;
            AbstractC4154l.m8920c(t0VarArr);
            int i11 = (i10 - 1) / 2;
            t0 t0Var = t0VarArr[i11];
            AbstractC4154l.m8920c(t0Var);
            t0 t0Var2 = t0VarArr[i10];
            AbstractC4154l.m8920c(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            m16282d(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: d */
    public final void m16282d(int i10, int i11) {
        t0[] t0VarArr = this.f42526a;
        AbstractC4154l.m8920c(t0VarArr);
        t0 t0Var = t0VarArr[i11];
        AbstractC4154l.m8920c(t0Var);
        t0 t0Var2 = t0VarArr[i10];
        AbstractC4154l.m8920c(t0Var2);
        t0VarArr[i10] = t0Var;
        t0VarArr[i11] = t0Var2;
        t0Var.f34679b = i10;
        t0Var2.f34679b = i11;
    }
}
