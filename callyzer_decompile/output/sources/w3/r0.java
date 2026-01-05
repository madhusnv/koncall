package w3;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import tx.InterfaceC7266z;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 implements InterfaceC7266z {

    /* renamed from: a */
    public final View f37945a;

    /* renamed from: b */
    public final l4.a0 f37946b;

    /* renamed from: c */
    public final InterfaceC7266z f37947c;

    /* renamed from: d */
    public final AtomicReference f37948d = new AtomicReference(null);

    public r0(View view, l4.a0 a0Var, InterfaceC7266z interfaceC7266z) {
        this.f37945a = view;
        this.f37946b = a0Var;
        this.f37947c = interfaceC7266z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vw.EnumC7794a m15001a(z1.C8854n r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w3.q0
            if (r0 == 0) goto L13
            r0 = r7
            w3.q0 r0 = (w3.q0) r0
            int r1 = r0.f37921c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37921c = r1
            goto L18
        L13:
            w3.q0 r0 = new w3.q0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f37919a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f37921c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            og.od.m10798c(r7)
            goto L51
        L2f:
            og.od.m10798c(r7)
            r1.p r7 = new r1.p
            r2 = 24
            r7.<init>(r2, r6, r5)
            u7.a r6 = new u7.a
            r2 = 9
            r4 = 0
            r6.<init>(r5, r4, r2)
            r0.f37921c = r3
            ao.t r2 = new ao.t
            java.util.concurrent.atomic.AtomicReference r3 = r5.f37948d
            r2.<init>(r7, r3, r6, r4)
            java.lang.Object r6 = tx.c0.m13488k(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.r0.m15001a(z1.n, ww.c):vw.a");
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f37947c.mo1865w();
    }
}
