package be;

import a1.C0004c;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Range;
import android.view.Surface;
import c0.b1;
import c0.o0;
import c0.p0;
import ge.C2577i;
import ge.C2579k;
import he.C2916g;
import i0.AbstractC3084o;
import i0.C3076g;
import i0.C3082m;
import i0.InterfaceC3093x;
import i0.c1;
import i0.d1;
import i0.j1;
import i0.l1;
import i0.o1;
import i0.q0;
import i0.r2;
import i0.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import wd.C7995c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: be.j */
/* loaded from: classes.dex */
public final class C0655j implements d1 {

    /* renamed from: a */
    public int f4191a;

    /* renamed from: b */
    public boolean f4192b;

    /* renamed from: c */
    public final Object f4193c;

    /* renamed from: d */
    public Object f4194d;

    /* renamed from: e */
    public final Object f4195e;

    /* renamed from: f */
    public Object f4196f;

    /* renamed from: g */
    public Object f4197g;

    public C0655j(C2577i c2577i, List list, int i10, C2577i c2577i2, C2916g c2916g, C7995c c7995c, boolean z6) {
        this.f4193c = c2577i;
        this.f4195e = list;
        this.f4191a = i10;
        this.f4194d = c2577i2;
        this.f4196f = c2916g;
        this.f4197g = c7995c;
        this.f4192b = z6;
    }

    @Override // i0.d1
    /* renamed from: D */
    public b1 mo1870D() {
        p0 p0Var;
        synchronized (this.f4193c) {
            b1 b1VarMo1870D = ((d1) this.f4194d).mo1870D();
            if (b1VarMo1870D != null) {
                this.f4191a++;
                p0Var = new p0(b1VarMo1870D);
                p0Var.m2179h((o0) this.f4197g);
            } else {
                p0Var = null;
            }
        }
        return p0Var;
    }

    @Override // i0.d1
    /* renamed from: a */
    public void mo1871a(c1 c1Var, Executor executor) {
        synchronized (this.f4193c) {
            ((d1) this.f4194d).mo1871a(new C0004c(8, this, c1Var), executor);
        }
    }

    @Override // i0.d1
    /* renamed from: b */
    public int mo1872b() {
        int iMo1872b;
        synchronized (this.f4193c) {
            iMo1872b = ((d1) this.f4194d).mo1872b();
        }
        return iMo1872b;
    }

    /* renamed from: c */
    public void m1873c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m1874d((AbstractC3084o) it.next());
        }
    }

    @Override // i0.d1
    public void close() {
        synchronized (this.f4193c) {
            try {
                Surface surface = (Surface) this.f4195e;
                if (surface != null) {
                    surface.release();
                }
                ((d1) this.f4194d).close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m1874d(AbstractC3084o abstractC3084o) {
        ArrayList arrayList = (ArrayList) this.f4195e;
        if (arrayList.contains(abstractC3084o)) {
            return;
        }
        arrayList.add(abstractC3084o);
    }

    /* renamed from: e */
    public void m1875e(s0 s0Var) {
        for (C3076g c3076g : s0Var.mo7403h()) {
            j1 j1Var = (j1) this.f4194d;
            j1Var.getClass();
            try {
                j1Var.mo7406k(c3076g);
            } catch (IllegalArgumentException unused) {
            }
            ((j1) this.f4194d).m7351m(c3076g, s0Var.mo7407l(c3076g), s0Var.mo7406k(c3076g));
        }
    }

    /* renamed from: f */
    public q0 m1876f() {
        ArrayList arrayList = new ArrayList((HashSet) this.f4193c);
        o1 o1VarM7399a = o1.m7399a((j1) this.f4194d);
        int i10 = this.f4191a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f4195e);
        boolean z6 = this.f4192b;
        l1 l1Var = (l1) this.f4196f;
        r2 r2Var = r2.f16576b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : l1Var.f16577a.keySet()) {
            arrayMap.put(str, l1Var.f16577a.get(str));
        }
        return new q0(arrayList, o1VarM7399a, i10, arrayList2, z6, new r2(arrayMap), (InterfaceC3093x) this.f4197g);
    }

    /* renamed from: g */
    public void m1877g(C2577i c2577i, C0653h c0653h) {
        Context context = c2577i.f14018a;
        C2577i c2577i2 = (C2577i) this.f4193c;
        if (context != c2577i2.f14018a) {
            throw new IllegalStateException(("Interceptor '" + c0653h + "' cannot modify the request's context.").toString());
        }
        if (c2577i.f14019b == C2579k.f14044a) {
            throw new IllegalStateException(("Interceptor '" + c0653h + "' cannot set the request's data to null.").toString());
        }
        if (c2577i.f14020c != c2577i2.f14020c) {
            throw new IllegalStateException(("Interceptor '" + c0653h + "' cannot modify the request's target.").toString());
        }
        if (c2577i.f14038u != c2577i2.f14038u) {
            throw new IllegalStateException(("Interceptor '" + c0653h + "' cannot modify the request's lifecycle.").toString());
        }
        if (c2577i.f14039v == c2577i2.f14039v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + c0653h + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    @Override // i0.d1
    public int getHeight() {
        int height;
        synchronized (this.f4193c) {
            height = ((d1) this.f4194d).getHeight();
        }
        return height;
    }

    @Override // i0.d1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f4193c) {
            surface = ((d1) this.f4194d).getSurface();
        }
        return surface;
    }

    @Override // i0.d1
    /* renamed from: h */
    public b1 mo1878h() {
        p0 p0Var;
        synchronized (this.f4193c) {
            b1 b1VarMo1878h = ((d1) this.f4194d).mo1878h();
            if (b1VarMo1878h != null) {
                this.f4191a++;
                p0Var = new p0(b1VarMo1878h);
                p0Var.m2179h((o0) this.f4197g);
            } else {
                p0Var = null;
            }
        }
        return p0Var;
    }

    /* renamed from: i */
    public Range m1879i() {
        j1 j1Var = (j1) this.f4194d;
        C3076g c3076g = q0.f16564j;
        Object objMo7406k = C3082m.f16521h;
        j1Var.getClass();
        try {
            objMo7406k = j1Var.mo7406k(c3076g);
        } catch (IllegalArgumentException unused) {
        }
        return (Range) objMo7406k;
    }

    @Override // i0.d1
    /* renamed from: j */
    public int mo1880j() {
        int iMo1880j;
        synchronized (this.f4193c) {
            iMo1880j = ((d1) this.f4194d).mo1880j();
        }
        return iMo1880j;
    }

    @Override // i0.d1
    /* renamed from: k */
    public void mo1881k() {
        synchronized (this.f4193c) {
            ((d1) this.f4194d).mo1881k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m1882l(ge.C2577i r17, ww.AbstractC8193c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.Object r2 = r0.f4195e
            java.util.List r2 = (java.util.List) r2
            int r3 = r0.f4191a
            boolean r4 = r1 instanceof be.C0654i
            if (r4 == 0) goto L1d
            r4 = r1
            be.i r4 = (be.C0654i) r4
            int r5 = r4.f4190e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.f4190e = r5
            goto L22
        L1d:
            be.i r4 = new be.i
            r4.<init>(r0, r1)
        L22:
            java.lang.Object r1 = r4.f4188c
            vw.a r5 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r6 = r4.f4190e
            r7 = 1
            if (r6 == 0) goto L3d
            if (r6 != r7) goto L35
            be.h r2 = r4.f4187b
            be.j r3 = r4.f4186a
            og.od.m10798c(r1)
            goto L84
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            og.od.m10798c(r1)
            if (r3 <= 0) goto L50
            int r1 = r3 + (-1)
            java.lang.Object r1 = r2.get(r1)
            be.h r1 = (be.C0653h) r1
            r12 = r17
            r0.m1877g(r12, r1)
            goto L52
        L50:
            r12 = r17
        L52:
            java.lang.Object r1 = r2.get(r3)
            r2 = r1
            be.h r2 = (be.C0653h) r2
            int r11 = r3 + 1
            java.lang.Object r1 = r0.f4196f
            r13 = r1
            he.g r13 = (he.C2916g) r13
            be.j r8 = new be.j
            java.lang.Object r1 = r0.f4193c
            r9 = r1
            ge.i r9 = (ge.C2577i) r9
            java.lang.Object r1 = r0.f4195e
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.f4197g
            r14 = r1
            wd.c r14 = (wd.C7995c) r14
            boolean r15 = r0.f4192b
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4.f4186a = r0
            r4.f4187b = r2
            r4.f4190e = r7
            java.lang.Object r1 = r2.m1869d(r8, r4)
            if (r1 != r5) goto L83
            return r5
        L83:
            r3 = r0
        L84:
            ge.j r1 = (ge.AbstractC2578j) r1
            ge.i r4 = r1.mo6573a()
            r3.m1877g(r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.C0655j.m1882l(ge.i, ww.c):java.lang.Object");
    }

    /* renamed from: m */
    public void m1883m() {
        synchronized (this.f4193c) {
            try {
                this.f4192b = true;
                ((d1) this.f4194d).mo1881k();
                if (this.f4191a == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i0.d1
    /* renamed from: z */
    public int mo1884z() {
        int iMo1884z;
        synchronized (this.f4193c) {
            iMo1884z = ((d1) this.f4194d).mo1884z();
        }
        return iMo1884z;
    }

    public C0655j(d1 d1Var) {
        this.f4193c = new Object();
        this.f4191a = 0;
        this.f4192b = false;
        this.f4197g = new o0(1, this);
        this.f4194d = d1Var;
        this.f4195e = d1Var.getSurface();
    }

    public C0655j() {
        this.f4193c = new HashSet();
        this.f4194d = j1.m7349b();
        this.f4191a = -1;
        this.f4195e = new ArrayList();
        this.f4192b = false;
        this.f4196f = l1.m7361a();
    }

    public C0655j(q0 q0Var) {
        HashSet hashSet = new HashSet();
        this.f4193c = hashSet;
        this.f4194d = j1.m7349b();
        this.f4191a = -1;
        ArrayList arrayList = new ArrayList();
        this.f4195e = arrayList;
        this.f4192b = false;
        this.f4196f = l1.m7361a();
        hashSet.addAll(q0Var.f16565a);
        this.f4194d = j1.m7350g(q0Var.f16566b);
        this.f4191a = q0Var.f16567c;
        arrayList.addAll(q0Var.f16568d);
        this.f4192b = q0Var.f16569e;
        r2 r2Var = q0Var.f16570f;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : r2Var.f16577a.keySet()) {
            arrayMap.put(str, r2Var.f16577a.get(str));
        }
        this.f4196f = new l1(arrayMap);
    }
}
