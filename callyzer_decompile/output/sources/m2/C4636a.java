package m2;

import e1.e0;
import e1.j0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m2.a */
/* loaded from: classes.dex */
public final class C4636a {

    /* renamed from: a */
    public final j0 f22877a;

    public /* synthetic */ C4636a(j0 j0Var) {
        this.f22877a = j0Var;
    }

    /* renamed from: a */
    public static final Object m9503a(j0 j0Var) {
        Object objM5574g = j0Var.m5574g(null);
        if (objM5574g == null) {
            return null;
        }
        if (!(objM5574g instanceof e0)) {
            j0Var.m5577j(null);
            return objM5574g;
        }
        e0 e0Var = (e0) objM5574g;
        if (e0Var.m5549g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = e0Var.f8957b - 1;
        Object objM5547e = e0Var.m5547e(i10);
        e0Var.m5552j(i10);
        AbstractC4154l.m8921d(objM5547e, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (e0Var.m5549g()) {
            j0Var.m5577j(null);
        }
        if (e0Var.f8957b == 1) {
            j0Var.m5579l(null, e0Var.m5546d());
        }
        return objM5547e;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e1.e0 m9504b(e1.j0 r15) {
        /*
            boolean r0 = r15.m5576i()
            if (r0 == 0) goto Le
            e1.e0 r15 = e1.p0.f9036b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r15, r0)
            return r15
        Le:
            e1.e0 r0 = new e1.e0
            r0.<init>()
            java.lang.Object[] r1 = r15.f9000c
            long[] r15 = r15.f8998a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L88
            r3 = 0
            r4 = r3
        L1e:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L83
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L81
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof e1.e0
            if (r11 == 0) goto L75
            e1.e0 r10 = (e1.e0) r10
            boolean r11 = r10.m5549g()
            if (r11 == 0) goto L55
            goto L7d
        L55:
            int r11 = r0.f8957b
            int r12 = r10.f8957b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.f8956a
            int r13 = r12.length
            if (r13 >= r11) goto L62
            r0.m5554l(r11, r12)
        L62:
            java.lang.Object[] r11 = r0.f8956a
            java.lang.Object[] r12 = r10.f8956a
            int r13 = r0.f8957b
            int r14 = r10.f8957b
            rw.AbstractC6662l.m12715e(r13, r3, r14, r12, r11)
            int r11 = r0.f8957b
            int r10 = r10.f8957b
            int r11 = r11 + r10
            r0.f8957b = r11
            goto L7d
        L75:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r10, r11)
            r0.m5543a(r10)
        L7d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L81:
            if (r7 != r8) goto L88
        L83:
            if (r4 == r2) goto L88
            int r4 = r4 + 1
            goto L1e
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C4636a.m9504b(e1.j0):e1.e0");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4636a) {
            return AbstractC4154l.m8918a(this.f22877a, ((C4636a) obj).f22877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22877a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f22877a + ')';
    }
}
