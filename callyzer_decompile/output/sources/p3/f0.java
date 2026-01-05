package p3;

import com.skydoves.balloon.internals.DefinitionKt;
import pg.n6;
import s4.InterfaceC6747c;
import tx.C7251k;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import v3.AbstractC7634f;
import vw.EnumC7794a;
import w3.t2;
import ww.AbstractC8191a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 implements InterfaceC6747c, InterfaceC7559c {

    /* renamed from: a */
    public final C7251k f28439a;

    /* renamed from: b */
    public final /* synthetic */ h0 f28440b;

    /* renamed from: c */
    public C7251k f28441c;

    /* renamed from: d */
    public EnumC5813k f28442d = EnumC5813k.Main;

    /* renamed from: e */
    public final C7565i f28443e = C7565i.f36440a;

    /* renamed from: f */
    public final /* synthetic */ h0 f28444f;

    public f0(h0 h0Var, C7251k c7251k) {
        this.f28444f = h0Var;
        this.f28439a = c7251k;
        this.f28440b = h0Var;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: A */
    public final long mo8432A(float f6) {
        return this.f28440b.mo8432A(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: F */
    public final float mo8433F(int i10) {
        return this.f28440b.mo8433F(i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: J */
    public final float mo8434J(float f6) {
        return f6 / this.f28440b.mo155a();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f28440b.mo154O();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: T */
    public final float mo8435T(float f6) {
        return this.f28440b.mo155a() * f6;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: Z */
    public final int mo8436Z(long j6) {
        return this.f28440b.mo8436Z(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f28440b.mo155a();
    }

    /* renamed from: b */
    public final Object m11384b(EnumC5813k enumC5813k, AbstractC8191a abstractC8191a) {
        C7251k c7251k = new C7251k(1, n6.m11797c(abstractC8191a));
        c7251k.m13540p();
        this.f28442d = enumC5813k;
        this.f28441c = c7251k;
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* renamed from: c */
    public final long m11385c() {
        h0 h0Var = this.f28444f;
        h0Var.getClass();
        long jL0 = h0Var.l0(AbstractC7634f.m14563x(h0Var).f36827E.mo14530d());
        long j6 = h0Var.f28455C;
        float fMax = Math.max(DefinitionKt.NO_Float_VALUE, Float.intBitsToFloat((int) (jL0 >> 32)) - ((int) (j6 >> 32))) / 2.0f;
        float fMax2 = Math.max(DefinitionKt.NO_Float_VALUE, Float.intBitsToFloat((int) (jL0 & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    /* renamed from: d */
    public final t2 m11386d() {
        h0 h0Var = this.f28444f;
        h0Var.getClass();
        return AbstractC7634f.m14563x(h0Var).f36827E;
    }

    @Override // s4.InterfaceC6747c
    public final int e0(float f6) {
        return this.f28440b.e0(f6);
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f28443e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11387h(long r11, ex.InterfaceC2141e r13, ww.AbstractC8193c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof p3.d0
            if (r0 == 0) goto L13
            r0 = r14
            p3.d0 r0 = (p3.d0) r0
            int r1 = r0.f28429d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28429d = r1
            goto L18
        L13:
            p3.d0 r0 = new p3.d0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f28427b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f28429d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            tx.s1 r11 = r0.f28426a
            og.od.m10798c(r14)     // Catch: java.lang.Throwable -> L2a
            r7 = r10
            goto L6e
        L2a:
            r0 = move-exception
            r12 = r0
            r7 = r10
            goto L76
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            og.od.m10798c(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L4f
            tx.k r14 = r10.f28441c
            if (r14 == 0) goto L4f
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r11)
            qw.m r2 = og.od.m10796a(r2)
            r14.resumeWith(r2)
        L4f:
            p3.h0 r14 = r10.f28444f
            tx.z r14 = r14.z0()
            b2.k0 r4 = new b2.k0
            r9 = 2
            r8 = 0
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r11 = 3
            tx.s1 r11 = tx.c0.m13502y(r14, r8, r8, r4, r11)
            r0.f28426a = r11     // Catch: java.lang.Throwable -> L74
            r0.f28429d = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L74
            if (r14 != r1) goto L6e
            return r1
        L6e:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f2122a
            r11.mo13510j(r12)
            return r14
        L74:
            r0 = move-exception
            r12 = r0
        L76:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f2122a
            r11.mo13510j(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.f0.m11387h(long, ex.e, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11388j(long r5, k1.z1 r7, ww.AbstractC8191a r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p3.e0
            if (r0 == 0) goto L13
            r0 = r8
            p3.e0 r0 = (p3.e0) r0
            int r1 = r0.f28432c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28432c = r1
            goto L18
        L13:
            p3.e0 r0 = new p3.e0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f28430a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f28432c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r8)
            r0.f28432c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
            java.lang.Object r5 = r4.m11387h(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.f0.m11388j(long, k1.z1, ww.a):java.lang.Object");
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: l */
    public final long mo8441l(float f6) {
        return this.f28440b.mo8441l(f6);
    }

    @Override // s4.InterfaceC6747c
    public final long l0(long j6) {
        return this.f28440b.l0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: m */
    public final long mo8442m(long j6) {
        return this.f28440b.mo8442m(j6);
    }

    @Override // s4.InterfaceC6747c
    public final float n0(long j6) {
        return this.f28440b.n0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: p */
    public final float mo8443p(long j6) {
        return this.f28440b.mo8443p(j6);
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        h0 h0Var = this.f28444f;
        synchronized (h0Var.f28463y) {
            h0Var.f28462x.m9514l(this);
        }
        this.f28439a.resumeWith(obj);
    }
}
