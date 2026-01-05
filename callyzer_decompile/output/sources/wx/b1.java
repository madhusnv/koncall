package wx;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import pg.n6;
import tx.C7248h;
import tx.C7251k;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.EnumC7799a;
import xx.AbstractC8495a;
import xx.AbstractC8496b;
import xx.AbstractC8497c;
import xx.InterfaceC8510p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class b1 extends AbstractC8495a implements t0, InterfaceC8209j, InterfaceC8510p {

    /* renamed from: e */
    public final int f39185e;

    /* renamed from: f */
    public final int f39186f;

    /* renamed from: g */
    public final EnumC7799a f39187g;

    /* renamed from: h */
    public Object[] f39188h;

    /* renamed from: j */
    public long f39189j;

    /* renamed from: k */
    public long f39190k;

    /* renamed from: l */
    public int f39191l;

    /* renamed from: m */
    public int f39192m;

    public b1(int i10, int i11, EnumC7799a enumC7799a) {
        this.f39185e = i10;
        this.f39186f = i11;
        this.f39187g = enumC7799a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r8 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r8.mo13509h() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        throw r8.mo13507A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        r0.f39170a = r5;
        r0.f39171b = r2;
        r0.f39172c = r9;
        r0.f39173d = r8;
        r0.f39176g = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r2.emit(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[EDGE_INSN: B:56:0x0092->B:37:0x0092 BREAK  A[LOOP:0: B:32:0x0079->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [xx.a] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [wx.b1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wx.k] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [xx.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [wx.d1] */
    /* JADX WARN: Type inference failed for: r9v8, types: [wx.d1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vw.EnumC7794a m15350k(wx.b1 r8, wx.InterfaceC8210k r9, uw.InterfaceC7559c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof wx.a1
            if (r0 == 0) goto L13
            r0 = r10
            wx.a1 r0 = (wx.a1) r0
            int r1 = r0.f39176g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39176g = r1
            goto L18
        L13:
            wx.a1 r0 = new wx.a1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f39174e
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39176g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            tx.e1 r8 = r0.f39173d
            wx.d1 r9 = r0.f39172c
            wx.k r2 = r0.f39171b
            wx.b1 r5 = r0.f39170a
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            tx.e1 r8 = r0.f39173d
            wx.d1 r9 = r0.f39172c
            wx.k r2 = r0.f39171b
            wx.b1 r5 = r0.f39170a
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            wx.d1 r9 = r0.f39172c
            wx.k r8 = r0.f39171b
            wx.b1 r2 = r0.f39170a
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            og.od.m10798c(r10)
            xx.c r10 = r8.m15785d()
            wx.d1 r10 = (wx.d1) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            uw.h r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            tx.w r5 = tx.C7263w.f34689b     // Catch: java.lang.Throwable -> Lb1
            uw.f r2 = r2.o0(r5)     // Catch: java.lang.Throwable -> Lb1
            tx.e1 r2 = (tx.e1) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.m15365s(r9)     // Catch: java.lang.Throwable -> L38
            l7.q r6 = wx.c1.f39197a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f39170a = r5     // Catch: java.lang.Throwable -> L38
            r0.f39171b = r2     // Catch: java.lang.Throwable -> L38
            r0.f39172c = r9     // Catch: java.lang.Throwable -> L38
            r0.f39173d = r8     // Catch: java.lang.Throwable -> L38
            r0.f39176g = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.m15356i(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.mo13509h()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.mo13507A()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f39170a = r5     // Catch: java.lang.Throwable -> L38
            r0.f39171b = r2     // Catch: java.lang.Throwable -> L38
            r0.f39172c = r9     // Catch: java.lang.Throwable -> L38
            r0.f39173d = r8     // Catch: java.lang.Throwable -> L38
            r0.f39176g = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return r1
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.m15786g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.b1.m15350k(wx.b1, wx.k, uw.c):vw.a");
    }

    @Override // wx.t0
    /* renamed from: a */
    public final void mo15351a() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m15366t(m15361o() + this.f39191l, this.f39190k, m15361o() + this.f39191l, m15361o() + this.f39191l + this.f39192m);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // wx.t0
    /* renamed from: b */
    public final boolean mo15352b(Object obj) {
        int i10;
        boolean z6;
        InterfaceC7559c[] interfaceC7559cArrM15360n = AbstractC8496b.f41394a;
        synchronized (this) {
            if (m15363q(obj)) {
                interfaceC7559cArrM15360n = m15360n(interfaceC7559cArrM15360n);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (InterfaceC7559c interfaceC7559c : interfaceC7559cArrM15360n) {
            if (interfaceC7559c != null) {
                interfaceC7559c.resumeWith(qw.a0.f30746a);
            }
        }
        return z6;
    }

    @Override // xx.InterfaceC8510p
    /* renamed from: c */
    public final InterfaceC8209j mo15353c(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return c1.m15388s(this, interfaceC7564h, i10, enumC7799a);
    }

    @Override // wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        return m15350k(this, interfaceC8210k, interfaceC7559c);
    }

    @Override // xx.AbstractC8495a
    /* renamed from: e */
    public final AbstractC8497c mo15354e() {
        d1 d1Var = new d1();
        d1Var.f39207a = -1L;
        return d1Var;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) throws Throwable {
        Throwable th2;
        InterfaceC7559c[] interfaceC7559cArrM15360n;
        y0 y0Var;
        if (mo15352b(obj)) {
            return qw.a0.f30746a;
        }
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        InterfaceC7559c[] interfaceC7559cArrM15360n2 = AbstractC8496b.f41394a;
        synchronized (this) {
            try {
                if (m15363q(obj)) {
                    try {
                        c7251k.resumeWith(qw.a0.f30746a);
                        interfaceC7559cArrM15360n = m15360n(interfaceC7559cArrM15360n2);
                        y0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        y0 y0Var2 = new y0(this, m15361o() + this.f39191l + this.f39192m, obj, c7251k);
                        m15359m(y0Var2);
                        this.f39192m++;
                        if (this.f39186f == 0) {
                            interfaceC7559cArrM15360n2 = m15360n(interfaceC7559cArrM15360n2);
                        }
                        interfaceC7559cArrM15360n = interfaceC7559cArrM15360n2;
                        y0Var = y0Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (y0Var != null) {
                    c7251k.m13543u(new C7248h(2, y0Var));
                }
                for (InterfaceC7559c interfaceC7559c2 : interfaceC7559cArrM15360n) {
                    if (interfaceC7559c2 != null) {
                        interfaceC7559c2.resumeWith(qw.a0.f30746a);
                    }
                }
                Object objM13539o = c7251k.m13539o();
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                if (objM13539o != enumC7794a) {
                    objM13539o = qw.a0.f30746a;
                }
                return objM13539o == enumC7794a ? objM13539o : qw.a0.f30746a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // xx.AbstractC8495a
    /* renamed from: f */
    public final AbstractC8497c[] mo15355f() {
        return new d1[2];
    }

    /* renamed from: i */
    public final Object m15356i(d1 d1Var, a1 a1Var) {
        C7251k c7251k = new C7251k(1, n6.m11797c(a1Var));
        c7251k.m13540p();
        synchronized (this) {
            try {
                if (m15364r(d1Var) < 0) {
                    d1Var.f39208b = c7251k;
                } else {
                    c7251k.resumeWith(qw.a0.f30746a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objM13539o = c7251k.m13539o();
        return objM13539o == EnumC7794a.COROUTINE_SUSPENDED ? objM13539o : qw.a0.f30746a;
    }

    /* renamed from: j */
    public final void m15357j() {
        if (this.f39186f != 0 || this.f39192m > 1) {
            Object[] objArr = this.f39188h;
            AbstractC4154l.m8920c(objArr);
            while (this.f39192m > 0) {
                long jM15361o = m15361o();
                int i10 = this.f39191l;
                int i11 = this.f39192m;
                if (objArr[((int) ((jM15361o + (i10 + i11)) - 1)) & (objArr.length - 1)] != c1.f39197a) {
                    return;
                }
                this.f39192m = i11 - 1;
                c1.m15375f(objArr, m15361o() + this.f39191l + this.f39192m, null);
            }
        }
    }

    /* renamed from: l */
    public final void m15358l() {
        AbstractC8497c[] abstractC8497cArr;
        Object[] objArr = this.f39188h;
        AbstractC4154l.m8920c(objArr);
        c1.m15375f(objArr, m15361o(), null);
        this.f39191l--;
        long jM15361o = m15361o() + 1;
        if (this.f39189j < jM15361o) {
            this.f39189j = jM15361o;
        }
        if (this.f39190k < jM15361o) {
            if (this.f41391b != 0 && (abstractC8497cArr = this.f41390a) != null) {
                for (AbstractC8497c abstractC8497c : abstractC8497cArr) {
                    if (abstractC8497c != null) {
                        d1 d1Var = (d1) abstractC8497c;
                        long j6 = d1Var.f39207a;
                        if (j6 >= 0 && j6 < jM15361o) {
                            d1Var.f39207a = jM15361o;
                        }
                    }
                }
            }
            this.f39190k = jM15361o;
        }
    }

    /* renamed from: m */
    public final void m15359m(Object obj) {
        int i10 = this.f39191l + this.f39192m;
        Object[] objArrM15362p = this.f39188h;
        if (objArrM15362p == null) {
            objArrM15362p = m15362p(null, 0, 2);
        } else if (i10 >= objArrM15362p.length) {
            objArrM15362p = m15362p(objArrM15362p, i10, objArrM15362p.length * 2);
        }
        c1.m15375f(objArrM15362p, m15361o() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: n */
    public final InterfaceC7559c[] m15360n(InterfaceC7559c[] interfaceC7559cArr) {
        AbstractC8497c[] abstractC8497cArr;
        d1 d1Var;
        C7251k c7251k;
        int length = interfaceC7559cArr.length;
        if (this.f41391b != 0 && (abstractC8497cArr = this.f41390a) != null) {
            int length2 = abstractC8497cArr.length;
            int i10 = 0;
            interfaceC7559cArr = interfaceC7559cArr;
            while (i10 < length2) {
                AbstractC8497c abstractC8497c = abstractC8497cArr[i10];
                if (abstractC8497c != null && (c7251k = (d1Var = (d1) abstractC8497c).f39208b) != null && m15364r(d1Var) >= 0) {
                    int length3 = interfaceC7559cArr.length;
                    interfaceC7559cArr = interfaceC7559cArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC7559cArr, Math.max(2, interfaceC7559cArr.length * 2));
                        AbstractC4154l.m8922e(CopyOf, "copyOf(...)");
                        interfaceC7559cArr = CopyOf;
                    }
                    interfaceC7559cArr[length] = c7251k;
                    d1Var.f39208b = null;
                    length++;
                }
                i10++;
                interfaceC7559cArr = interfaceC7559cArr;
            }
        }
        return interfaceC7559cArr;
    }

    /* renamed from: o */
    public final long m15361o() {
        return Math.min(this.f39190k, this.f39189j);
    }

    /* renamed from: p */
    public final Object[] m15362p(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f39188h = objArr2;
        if (objArr != null) {
            long jM15361o = m15361o();
            for (int i12 = 0; i12 < i10; i12++) {
                long j6 = i12 + jM15361o;
                c1.m15375f(objArr2, j6, objArr[((int) j6) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15363q(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f41391b
            int r2 = r12.f39185e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L84
        Lb:
            r12.m15359m(r13)
            int r1 = r12.f39191l
            int r1 = r1 + r9
            r12.f39191l = r1
            if (r1 <= r2) goto L18
            r12.m15358l()
        L18:
            long r1 = r12.m15361o()
            int r3 = r12.f39191l
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f39190k = r1
            return r9
        L23:
            int r1 = r12.f39191l
            int r3 = r12.f39186f
            if (r1 < r3) goto L4c
            long r4 = r12.f39190k
            long r6 = r12.f39189j
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4c
            int[] r1 = wx.z0.f39360a
            vx.a r4 = r12.f39187g
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L4a
            r4 = 2
            if (r1 == r4) goto L84
            r4 = 3
            if (r1 != r4) goto L44
            goto L4c
        L44:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L4a:
            r1 = 0
            return r1
        L4c:
            r12.m15359m(r13)
            int r1 = r12.f39191l
            int r1 = r1 + r9
            r12.f39191l = r1
            if (r1 <= r3) goto L59
            r12.m15358l()
        L59:
            long r3 = r12.m15361o()
            int r1 = r12.f39191l
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f39189j
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L84
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f39190k
            long r5 = r12.m15361o()
            int r7 = r12.f39191l
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m15361o()
            int r10 = r12.f39191l
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f39192m
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.m15366t(r1, r3, r5, r7)
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.b1.m15363q(java.lang.Object):boolean");
    }

    /* renamed from: r */
    public final long m15364r(d1 d1Var) {
        long j6 = d1Var.f39207a;
        if (j6 < m15361o() + this.f39191l) {
            return j6;
        }
        if (this.f39186f <= 0 && j6 <= m15361o() && this.f39192m != 0) {
            return j6;
        }
        return -1L;
    }

    /* renamed from: s */
    public final Object m15365s(d1 d1Var) {
        Object obj;
        InterfaceC7559c[] interfaceC7559cArrM15367u = AbstractC8496b.f41394a;
        synchronized (this) {
            try {
                long jM15364r = m15364r(d1Var);
                if (jM15364r < 0) {
                    obj = c1.f39197a;
                } else {
                    long j6 = d1Var.f39207a;
                    Object[] objArr = this.f39188h;
                    AbstractC4154l.m8920c(objArr);
                    Object obj2 = objArr[((int) jM15364r) & (objArr.length - 1)];
                    if (obj2 instanceof y0) {
                        obj2 = ((y0) obj2).f39353c;
                    }
                    d1Var.f39207a = jM15364r + 1;
                    Object obj3 = obj2;
                    interfaceC7559cArrM15367u = m15367u(j6);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC7559c interfaceC7559c : interfaceC7559cArrM15367u) {
            if (interfaceC7559c != null) {
                interfaceC7559c.resumeWith(qw.a0.f30746a);
            }
        }
        return obj;
    }

    /* renamed from: t */
    public final void m15366t(long j6, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j6);
        for (long jM15361o = m15361o(); jM15361o < jMin; jM15361o++) {
            Object[] objArr = this.f39188h;
            AbstractC4154l.m8920c(objArr);
            c1.m15375f(objArr, jM15361o, null);
        }
        this.f39189j = j6;
        this.f39190k = j10;
        this.f39191l = (int) (j11 - jMin);
        this.f39192m = (int) (j12 - j11);
    }

    /* renamed from: u */
    public final InterfaceC7559c[] m15367u(long j6) {
        long j10;
        long j11;
        long j12;
        InterfaceC7559c[] interfaceC7559cArr;
        InterfaceC7559c[] interfaceC7559cArr2;
        AbstractC8497c[] abstractC8497cArr;
        C4417q c4417q = c1.f39197a;
        InterfaceC7559c[] interfaceC7559cArr3 = AbstractC8496b.f41394a;
        if (j6 <= this.f39190k) {
            long jM15361o = m15361o();
            long j13 = this.f39191l + jM15361o;
            int i10 = this.f39186f;
            if (i10 == 0 && this.f39192m > 0) {
                j13++;
            }
            int i11 = 0;
            if (this.f41391b != 0 && (abstractC8497cArr = this.f41390a) != null) {
                for (AbstractC8497c abstractC8497c : abstractC8497cArr) {
                    if (abstractC8497c != null) {
                        long j14 = ((d1) abstractC8497c).f39207a;
                        if (j14 >= 0 && j14 < j13) {
                            j13 = j14;
                        }
                    }
                }
            }
            if (j13 > this.f39190k) {
                long jM15361o2 = m15361o() + this.f39191l;
                int iMin = this.f41391b > 0 ? Math.min(this.f39192m, i10 - ((int) (jM15361o2 - j13))) : this.f39192m;
                long j15 = this.f39192m + jM15361o2;
                if (iMin > 0) {
                    j12 = 1;
                    Object[] objArr = this.f39188h;
                    AbstractC4154l.m8920c(objArr);
                    j10 = jM15361o;
                    InterfaceC7559c[] interfaceC7559cArr4 = new InterfaceC7559c[iMin];
                    long j16 = jM15361o2;
                    while (true) {
                        if (jM15361o2 >= j15) {
                            interfaceC7559cArr2 = interfaceC7559cArr4;
                            j11 = j13;
                            break;
                        }
                        interfaceC7559cArr2 = interfaceC7559cArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jM15361o2)];
                        if (obj != c4417q) {
                            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            y0 y0Var = (y0) obj;
                            int i12 = i11 + 1;
                            j11 = j13;
                            interfaceC7559cArr2[i11] = y0Var.f39354d;
                            c1.m15375f(objArr, jM15361o2, c4417q);
                            c1.m15375f(objArr, j16, y0Var.f39353c);
                            j16++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j11 = j13;
                        }
                        jM15361o2++;
                        interfaceC7559cArr4 = interfaceC7559cArr2;
                        j13 = j11;
                    }
                    jM15361o2 = j16;
                    interfaceC7559cArr = interfaceC7559cArr2;
                } else {
                    j10 = jM15361o;
                    j11 = j13;
                    j12 = 1;
                    interfaceC7559cArr = interfaceC7559cArr3;
                }
                int i13 = (int) (jM15361o2 - j10);
                long j17 = this.f41391b == 0 ? jM15361o2 : j11;
                long jMax = Math.max(this.f39189j, jM15361o2 - Math.min(this.f39185e, i13));
                if (i10 == 0 && jMax < j15) {
                    Object[] objArr2 = this.f39188h;
                    AbstractC4154l.m8920c(objArr2);
                    if (AbstractC4154l.m8918a(objArr2[((int) jMax) & (objArr2.length - 1)], c4417q)) {
                        jM15361o2 += j12;
                        jMax += j12;
                    }
                }
                m15366t(jMax, j17, jM15361o2, j15);
                m15357j();
                return interfaceC7559cArr.length == 0 ? interfaceC7559cArr : m15360n(interfaceC7559cArr);
            }
        }
        return interfaceC7559cArr3;
    }
}
