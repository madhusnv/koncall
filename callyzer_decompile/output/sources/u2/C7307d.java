package u2;

import e1.k0;
import e1.t0;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.HashMap;
import k2.j1;
import qw.C6361k;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.d */
/* loaded from: classes.dex */
public class C7307d extends AbstractC7311h {

    /* renamed from: n */
    public static final int[] f34853n = new int[0];

    /* renamed from: e */
    public final InterfaceC2139c f34854e;

    /* renamed from: f */
    public final InterfaceC2139c f34855f;

    /* renamed from: g */
    public int f34856g;

    /* renamed from: h */
    public k0 f34857h;

    /* renamed from: i */
    public ArrayList f34858i;

    /* renamed from: j */
    public C7315l f34859j;

    /* renamed from: k */
    public int[] f34860k;

    /* renamed from: l */
    public int f34861l;

    /* renamed from: m */
    public boolean f34862m;

    public C7307d(long j6, C7315l c7315l, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        super(j6, c7315l);
        this.f34854e = interfaceC2139c;
        this.f34855f = interfaceC2139c2;
        this.f34859j = C7315l.f34884e;
        this.f34860k = f34853n;
        this.f34861l = 1;
    }

    /* renamed from: A */
    public final void m13661A(long j6) {
        synchronized (AbstractC7316m.f34890b) {
            this.f34859j = this.f34859j.m13675r(j6);
        }
    }

    /* renamed from: B */
    public void mo13647B(k0 k0Var) {
        this.f34857h = k0Var;
    }

    /* renamed from: C */
    public C7307d mo13640C(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) throws Throwable {
        if (this.f34875c) {
            j1.m8542a("Cannot use a disposed snapshot");
        }
        if (this.f34862m && this.f34876d < 0) {
            j1.m8543b("Unsupported operation on a disposed or applied snapshot");
        }
        m13661A(mo13652g());
        Object obj = AbstractC7316m.f34890b;
        synchronized (obj) {
            try {
                long j6 = AbstractC7316m.f34892d;
                AbstractC7316m.f34892d = j6 + 1;
                AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13675r(j6);
                C7315l c7315lMo13649d = mo13649d();
                mo13656r(c7315lMo13649d.m13675r(j6));
                try {
                    C7308e c7308e = new C7308e(j6, AbstractC7316m.m13680e(c7315lMo13649d, mo13652g() + 1, j6), AbstractC7316m.m13687l(interfaceC2139c, mo13650e(), true), AbstractC7316m.m13677b(interfaceC2139c2, mo13654i()), this);
                    if (this.f34862m || this.f34875c) {
                        return c7308e;
                    }
                    long jMo13652g = mo13652g();
                    synchronized (obj) {
                        long j10 = AbstractC7316m.f34892d;
                        AbstractC7316m.f34892d = j10 + 1;
                        mo13657s(j10);
                        AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13675r(mo13652g());
                    }
                    mo13656r(AbstractC7316m.m13680e(mo13649d(), jMo13652g + 1, mo13652g()));
                    return c7308e;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // u2.AbstractC7311h
    /* renamed from: b */
    public final void mo13662b() {
        AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13672h(mo13652g()).m13671b(this.f34859j);
    }

    @Override // u2.AbstractC7311h
    /* renamed from: c */
    public void mo13641c() {
        if (this.f34875c) {
            return;
        }
        this.f34875c = true;
        synchronized (AbstractC7316m.f34890b) {
            m13670o();
        }
        mo13643l();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: f */
    public boolean mo13651f() {
        return false;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: h */
    public int mo13653h() {
        return this.f34856g;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: i */
    public InterfaceC2139c mo13654i() {
        return this.f34855f;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: k */
    public void mo13642k() {
        this.f34861l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // u2.AbstractC7311h
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo13643l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f34861l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            k2.j1.m8542a(r1)
        Lc:
            int r1 = r0.f34861l
            int r1 = r1 + (-1)
            r0.f34861l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f34862m
            if (r1 != 0) goto L94
            e1.k0 r1 = r0.mo13659x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f34862m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            k2.j1.m8543b(r2)
        L27:
            r2 = 0
            r0.mo13647B(r2)
            long r2 = r0.mo13652g()
            java.lang.Object[] r4 = r1.f9006b
            long[] r1 = r1.f9005a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            u2.y r13 = (u2.InterfaceC7328y) r13
            u2.a0 r13 = r13.mo8488b()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f34838a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            u2.l r6 = r0.f34859j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = rw.AbstractC6663m.m12767z(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            l4.l r6 = u2.AbstractC7316m.f34889a
            r14 = 0
            r13.f34838a = r14
        L83:
            u2.a0 r13 = r13.f34839b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.m13668a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7307d.mo13643l():void");
    }

    @Override // u2.AbstractC7311h
    /* renamed from: m */
    public void mo13644m() {
        if (this.f34862m || this.f34875c) {
            return;
        }
        m13664v();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: n */
    public void mo13655n(InterfaceC7328y interfaceC7328y) {
        k0 k0VarMo13659x = mo13659x();
        if (k0VarMo13659x == null) {
            int i10 = t0.f9058a;
            k0VarMo13659x = new k0();
            mo13647B(k0VarMo13659x);
        }
        k0VarMo13659x.m5581a(interfaceC7328y);
    }

    @Override // u2.AbstractC7311h
    /* renamed from: p */
    public final void mo13663p() {
        int length = this.f34860k.length;
        for (int i10 = 0; i10 < length; i10++) {
            AbstractC7316m.m13696u(this.f34860k[i10]);
        }
        m13670o();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: t */
    public void mo13658t(int i10) {
        this.f34856g = i10;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: u */
    public AbstractC7311h mo13645u(InterfaceC2139c interfaceC2139c) throws Throwable {
        if (this.f34875c) {
            j1.m8542a("Cannot use a disposed snapshot");
        }
        if (this.f34862m && this.f34876d < 0) {
            j1.m8543b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo13652g = mo13652g();
        m13661A(mo13652g());
        Object obj = AbstractC7316m.f34890b;
        synchronized (obj) {
            try {
                long j6 = AbstractC7316m.f34892d;
                AbstractC7316m.f34892d = j6 + 1;
                AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13675r(j6);
                try {
                    C7309f c7309f = new C7309f(j6, AbstractC7316m.m13680e(mo13649d(), jMo13652g + 1, j6), AbstractC7316m.m13687l(interfaceC2139c, mo13650e(), true), this);
                    if (this.f34862m || this.f34875c) {
                        return c7309f;
                    }
                    long jMo13652g2 = mo13652g();
                    synchronized (obj) {
                        long j10 = AbstractC7316m.f34892d;
                        AbstractC7316m.f34892d = j10 + 1;
                        mo13657s(j10);
                        AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13675r(mo13652g());
                    }
                    mo13656r(AbstractC7316m.m13680e(mo13649d(), jMo13652g2 + 1, mo13652g()));
                    return c7309f;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: v */
    public final void m13664v() {
        m13661A(mo13652g());
        if (this.f34862m || this.f34875c) {
            return;
        }
        long jMo13652g = mo13652g();
        synchronized (AbstractC7316m.f34890b) {
            long j6 = AbstractC7316m.f34892d;
            AbstractC7316m.f34892d = j6 + 1;
            mo13657s(j6);
            AbstractC7316m.f34891c = AbstractC7316m.f34891c.m13675r(mo13652g());
        }
        mo13656r(AbstractC7316m.m13680e(mo13649d(), jMo13652g + 1, mo13652g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u2.AbstractC7321r mo13646w() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7307d.mo13646w():u2.r");
    }

    /* renamed from: x */
    public k0 mo13659x() {
        return this.f34857h;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC2139c mo13650e() {
        return this.f34854e;
    }

    /* renamed from: z */
    public final AbstractC7321r m13665z(long j6, k0 k0Var, HashMap map, C7315l c7315l) {
        ArrayList arrayList;
        ArrayList arrayListM12754R;
        ArrayList arrayList2;
        C7315l c7315l2;
        Object[] objArr;
        long[] jArr;
        C7315l c7315l3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j10;
        ArrayList arrayList3;
        a0 a0VarMo8492h;
        C7315l c7315lM13674q = mo13649d().m13675r(mo13652g()).m13674q(this.f34859j);
        Object[] objArr3 = k0Var.f9006b;
        long[] jArr3 = k0Var.f9005a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList2 = null;
            arrayListM12754R = null;
            while (true) {
                long j11 = jArr3[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j11 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC7328y interfaceC7328y = (InterfaceC7328y) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            a0 a0VarMo8488b = interfaceC7328y.mo8488b();
                            i10 = i13;
                            ArrayList arrayList4 = arrayList2;
                            a0 a0VarM13694s = AbstractC7316m.m13694s(a0VarMo8488b, j6, c7315l);
                            if (a0VarM13694s == null) {
                                c7315l3 = c7315lM13674q;
                                arrayList3 = arrayListM12754R;
                                j10 = j11;
                            } else {
                                arrayList3 = arrayListM12754R;
                                j10 = j11;
                                a0 a0VarM13694s2 = AbstractC7316m.m13694s(a0VarMo8488b, mo13652g(), c7315lM13674q);
                                if (a0VarM13694s2 == null) {
                                    c7315l3 = c7315lM13674q;
                                } else {
                                    c7315l3 = c7315lM13674q;
                                    if (a0VarM13694s2.f34838a != 1 && !a0VarM13694s.equals(a0VarM13694s2)) {
                                        a0 a0VarM13694s3 = AbstractC7316m.m13694s(a0VarMo8488b, mo13652g(), mo13649d());
                                        if (a0VarM13694s3 == null) {
                                            AbstractC7316m.m13693r();
                                            throw null;
                                        }
                                        if (map == null || (a0VarMo8492h = (a0) map.get(a0VarM13694s)) == null) {
                                            a0VarMo8492h = interfaceC7328y.mo8492h(a0VarM13694s2, a0VarM13694s, a0VarM13694s3);
                                        }
                                        if (a0VarMo8492h == null) {
                                            return new C7312i();
                                        }
                                        if (!a0VarMo8492h.equals(a0VarM13694s3)) {
                                            if (a0VarMo8492h.equals(a0VarM13694s)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new C6361k(interfaceC7328y, a0VarM13694s.mo8495b(mo13652g())));
                                                arrayListM12754R = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListM12754R.add(interfaceC7328y);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!a0VarMo8492h.equals(a0VarM13694s2) ? new C6361k(interfaceC7328y, a0VarMo8492h) : new C6361k(interfaceC7328y, a0VarM13694s2.mo8495b(mo13652g())));
                                            }
                                        }
                                        arrayListM12754R = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListM12754R = arrayList3;
                        } else {
                            c7315l3 = c7315lM13674q;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j10 = j11;
                        }
                        j11 = j10 >> 8;
                        i13 = i10 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c7315lM13674q = c7315l3;
                    }
                    c7315l2 = c7315lM13674q;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c7315l2 = c7315lM13674q;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i11++;
                jArr3 = jArr;
                objArr3 = objArr;
                c7315lM13674q = c7315l2;
            }
        } else {
            arrayList = null;
            arrayListM12754R = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m13664v();
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                C6361k c6361k = (C6361k) arrayList2.get(i14);
                InterfaceC7328y interfaceC7328y2 = (InterfaceC7328y) c6361k.f30755a;
                a0 a0Var = (a0) c6361k.f30756b;
                a0Var.f34838a = j6;
                synchronized (AbstractC7316m.f34890b) {
                    a0Var.f34839b = interfaceC7328y2.mo8488b();
                    interfaceC7328y2.mo8493j(a0Var);
                }
            }
        }
        if (arrayListM12754R != null) {
            int size2 = arrayListM12754R.size();
            for (int i15 = 0; i15 < size2; i15++) {
                k0Var.m5592l((InterfaceC7328y) arrayListM12754R.get(i15));
            }
            ArrayList arrayList6 = this.f34858i;
            if (arrayList6 != null) {
                arrayListM12754R = AbstractC6663m.m12754R(arrayList6, arrayListM12754R);
            }
            this.f34858i = arrayListM12754R;
        }
        return C7313j.f34877c;
    }
}
