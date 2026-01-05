package sc;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6661k;
import yc.AbstractC8617f;
import yc.EnumC8616e;
import yc.InterfaceC8613b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.h */
/* loaded from: classes.dex */
public final class C6788h implements InterfaceC8613b {

    /* renamed from: a */
    public final /* synthetic */ int f32290a;

    /* renamed from: b */
    public final Object f32291b;

    public /* synthetic */ C6788h(int i10, Object obj) {
        this.f32290a = i10;
        this.f32291b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // yc.InterfaceC8613b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo12192a(java.lang.Object r6, wc.InterfaceC7971e r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            int r0 = r5.f32290a
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L84;
                case 2: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f32291b
            rw.k r0 = (rw.C6661k) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            java.lang.Object r6 = r7.mo8275a(r6, r8)
            goto L2c
        L14:
            r1 = 0
            yc.b[] r1 = new yc.InterfaceC8613b[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            yc.b[] r0 = (yc.InterfaceC8613b[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            yc.b[] r0 = (yc.InterfaceC8613b[]) r0
            wc.e r7 = pg.i8.m11698a(r7, r0)
            java.lang.Object r6 = r7.mo8275a(r6, r8)
        L2c:
            return r6
        L2d:
            boolean r0 = r8 instanceof yc.C8615d
            if (r0 == 0) goto L40
            r0 = r8
            yc.d r0 = (yc.C8615d) r0
            int r1 = r0.f41882d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L40
            int r1 = r1 - r2
            r0.f41882d = r1
            goto L45
        L40:
            yc.d r0 = new yc.d
            r0.<init>(r5, r8)
        L45:
            java.lang.Object r8 = r0.f41880b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41882d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L5f
            if (r2 != r3) goto L57
            og.od.m10798c(r8)
            goto L83
        L57:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L5f:
            wc.e r7 = r0.f41879a
            og.od.m10798c(r8)
            goto L77
        L65:
            og.od.m10798c(r8)
            java.lang.Object r8 = r5.f32291b
            sc.p r8 = (sc.InterfaceC6796p) r8
            r0.f41879a = r7
            r0.f41882d = r4
            java.lang.Object r8 = r8.mo7561b(r6, r0)
            if (r8 != r1) goto L77
            goto L82
        L77:
            r6 = 0
            r0.f41879a = r6
            r0.f41882d = r3
            java.lang.Object r8 = r7.mo8275a(r8, r0)
            if (r8 != r1) goto L83
        L82:
            r8 = r1
        L83:
            return r8
        L84:
            sc.v r6 = (sc.C6802v) r6
            java.lang.Object r6 = r5.m12979b(r6, r7, r8)
            return r6
        L8b:
            sc.v r6 = (sc.C6802v) r6
            java.lang.Object r6 = r5.m12979b(r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.C6788h.mo12192a(java.lang.Object, wc.e, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r4v2, types: [vw.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, pc.l] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m12979b(sc.C6802v r10, wc.InterfaceC7971e r11, uw.InterfaceC7559c r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.C6788h.m12979b(sc.v, wc.e, uw.c):java.lang.Object");
    }

    /* renamed from: c */
    public void m12980c(InterfaceC8613b interfaceC8613b, EnumC8616e order) {
        C6661k c6661k = (C6661k) this.f32291b;
        AbstractC4154l.m8923f(order, "order");
        int i10 = AbstractC8617f.f41883a[order.ordinal()];
        if (i10 == 1) {
            c6661k.addFirst(interfaceC8613b);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c6661k.addLast(interfaceC8613b);
        }
    }

    public C6788h(int i10) {
        this.f32290a = i10;
        switch (i10) {
            case 3:
                this.f32291b = new C6661k();
                break;
            default:
                this.f32291b = new ArrayList();
                break;
        }
    }
}
