package o6;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.x */
/* loaded from: classes.dex */
public final class C5322x {

    /* renamed from: a */
    public final m1 f26193a;

    public C5322x() {
        this.f26193a = wx.c1.m15372c(c1.f26013b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vw.EnumC7794a m10466a(g2.e4 r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z7.C8886o
            if (r0 == 0) goto L13
            r0 = r6
            z7.o r0 = (z7.C8886o) r0
            int r1 = r0.f42797c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42797c = r1
            goto L18
        L13:
            z7.o r0 = new z7.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f42795a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f42797c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            og.od.m10798c(r6)
            goto L3d
        L2f:
            og.od.m10798c(r6)
            r0.f42797c = r3
            wx.m1 r6 = r4.f26193a
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5322x.m10466a(g2.e4, ww.c):vw.a");
    }

    /* renamed from: b */
    public b1 m10467b() {
        return (b1) this.f26193a.getValue();
    }

    /* renamed from: c */
    public void m10468c(Set tableIds) {
        m1 m1Var;
        Object value;
        int[] iArr;
        AbstractC4154l.m8923f(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            m1Var = this.f26193a;
            value = m1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!m1Var.m15397i(value, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10469d(o6.b1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
        L5:
            wx.m1 r0 = r5.f26193a
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            o6.b1 r2 = (o6.b1) r2
            boolean r3 = r2 instanceof o6.u0
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            o6.c1 r3 = o6.c1.f26013b
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L27
        L1d:
            boolean r3 = r2 instanceof o6.C5302d
            if (r3 == 0) goto L29
            int r3 = r6.f26007a
            int r4 = r2.f26007a
            if (r3 <= r4) goto L2d
        L27:
            r2 = r6
            goto L2d
        L29:
            boolean r3 = r2 instanceof o6.i0
            if (r3 == 0) goto L34
        L2d:
            boolean r0 = r0.m15397i(r1, r2)
            if (r0 == 0) goto L5
            return
        L34:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5322x.m10469d(o6.b1):void");
    }

    public C5322x(int i10) {
        this.f26193a = wx.c1.m15372c(new int[i10]);
    }
}
