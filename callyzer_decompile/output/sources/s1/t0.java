package s1;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.Map;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i2;
import r1.C6431p;
import s2.C6734c;
import t2.AbstractC7011j;
import t2.C7010i;
import t2.InterfaceC7003b;
import t2.InterfaceC7008g;
import t2.InterfaceC7009h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 implements InterfaceC7009h, InterfaceC7003b {

    /* renamed from: a */
    public final C7010i f32135a;

    /* renamed from: b */
    public final InterfaceC7003b f32136b;

    /* renamed from: c */
    public final e1.k0 f32137c;

    public t0(InterfaceC7009h interfaceC7009h, Map map, InterfaceC7003b interfaceC7003b) {
        C6725t c6725t = new C6725t(2, interfaceC7009h);
        i2 i2Var = AbstractC7011j.f33948a;
        this.f32135a = new C7010i(map, c6725t);
        this.f32136b = interfaceC7003b;
        int i10 = e1.t0.f9058a;
        this.f32137c = new e1.k0();
    }

    @Override // t2.InterfaceC7003b
    /* renamed from: a */
    public final void mo12855a(Object obj, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-697180401);
        this.f32136b.mo12855a(obj, c6734c, c3966o, i10 & 126);
        boolean zM8616i = c3966o.m8616i(this) | c3966o.m8616i(obj);
        Object objM8596M = c3966o.m8596M();
        if (zM8616i || objM8596M == C3961j.f20408a) {
            objM8596M = new C6431p(5, this, obj);
            c3966o.j0(objM8596M);
        }
        C3953b.m8500c(obj, (InterfaceC2139c) objM8596M, c3966o);
        c3966o.m8623p(false);
    }

    @Override // t2.InterfaceC7009h
    /* renamed from: b */
    public final boolean mo12856b(Object obj) {
        return this.f32135a.mo12856b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // t2.InterfaceC7009h
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo12857c() {
        /*
            r14 = this;
            e1.k0 r0 = r14.f32137c
            java.lang.Object[] r1 = r0.f9006b
            long[] r0 = r0.f9005a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            t2.b r11 = r14.f32136b
            r11.mo12860f(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            t2.i r0 = r14.f32135a
            java.util.Map r0 = r0.mo12857c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.t0.mo12857c():java.util.Map");
    }

    @Override // t2.InterfaceC7009h
    /* renamed from: d */
    public final Object mo12858d(String str) {
        return this.f32135a.mo12858d(str);
    }

    @Override // t2.InterfaceC7009h
    /* renamed from: e */
    public final InterfaceC7008g mo12859e(String str, InterfaceC2137a interfaceC2137a) {
        return this.f32135a.mo12859e(str, interfaceC2137a);
    }

    @Override // t2.InterfaceC7003b
    /* renamed from: f */
    public final void mo12860f(Object obj) {
        this.f32136b.mo12860f(obj);
    }
}
