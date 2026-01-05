package bs;

import android.view.View;
import aq.C0406i;
import aw.d0;
import c9.C0922q;
import cj.C0979e;
import com.websoptimization.callyzerbiz.data.model.request.LeadDetails;
import com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import d7.w0;
import dt.C1813s;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import h1.C2772c;
import j3.C3553g;
import java.util.ArrayList;
import java.util.List;
import k1.a1;
import k1.f2;
import k1.r1;
import k2.C3953b;
import k2.p1;
import k2.q1;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import mm.C4802m;
import og.od;
import p3.InterfaceC5822t;
import qv.C6338m;
import qw.C6361k;
import qw.a0;
import rv.h0;
import rv.p0;
import rw.AbstractC6663m;
import su.C6952k;
import t8.AbstractC7076v;
import tx.InterfaceC7266z;
import tx.c0;
import tx.e1;
import u7.C7351a;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.InterfaceC7810l;
import w3.c3;
import w3.d3;
import w3.y1;
import ww.AbstractC8199i;
import wx.k1;
import wx.m1;
import xm.y5;
import zr.C9034d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bs.g */
/* loaded from: classes3.dex */
public final class C0749g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4716a;

    /* renamed from: b */
    public int f4717b;

    /* renamed from: c */
    public Object f4718c;

    /* renamed from: d */
    public Object f4719d;

    /* renamed from: e */
    public Object f4720e;

    /* renamed from: f */
    public Object f4721f;

    /* renamed from: g */
    public Object f4722g;

    /* renamed from: h */
    public final /* synthetic */ Object f4723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749g(w0 w0Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4716a = i10;
        this.f4718c = w0Var;
        this.f4719d = obj;
        this.f4720e = obj2;
        this.f4721f = obj3;
        this.f4722g = obj4;
        this.f4723h = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m2038d(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0749g.m2038d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [tx.e1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7, types: [tx.e1] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m2039e(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f4721f
            r1 = r0
            t8.v r1 = (t8.AbstractC7076v) r1
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r13.f4717b
            r3 = 0
            r4 = -256(0xffffffffffffff00, float:NaN)
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            java.lang.Object r0 = r13.f4719d
            r2 = r0
            tx.s1 r2 = (tx.s1) r2
            java.lang.Object r0 = r13.f4718c
            r6 = r0
            zh.d r6 = (zh.InterfaceFutureC8957d) r6
            java.lang.Object r0 = r13.f4720e
            r7 = r0
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            og.od.m10798c(r14)     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L27
            goto L6f
        L24:
            r0 = move-exception
            r14 = r0
            goto L7a
        L27:
            r0 = move-exception
            r14 = r0
            goto L8e
        L2a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L32:
            og.od.m10798c(r14)
            java.lang.Object r14 = r13.f4720e
            tx.z r14 = (tx.InterfaceC7266z) r14
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>(r4)
            zh.d r10 = r1.startWork()
            java.lang.String r2 = "delegate.startWork()"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r10, r2)
            ao.t r6 = new ao.t
            java.lang.Object r2 = r13.f4722g
            r7 = r2
            j3.g r7 = (j3.C3553g) r7
            java.lang.Object r2 = r13.f4723h
            r8 = r2
            c9.q r8 = (c9.C0922q) r8
            r11 = 0
            r12 = 9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2 = 3
            tx.s1 r2 = tx.c0.m13502y(r14, r3, r3, r6, r2)
            r13.f4720e = r9     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L75
            r13.f4718c = r10     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L75
            r13.f4719d = r2     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L75
            r13.f4717b = r5     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L75
            java.lang.Object r14 = pg.j7.m11711a(r10, r13)     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L75
            if (r14 != r0) goto L6d
            return r0
        L6d:
            r7 = r9
            r6 = r10
        L6f:
            t8.u r14 = (t8.AbstractC7075u) r14     // Catch: java.lang.Throwable -> L24 java.util.concurrent.CancellationException -> L27
            r2.mo13510j(r3)
            return r14
        L75:
            r0 = move-exception
            r14 = r0
            r7 = r9
            r6 = r10
            goto L8e
        L7a:
            int r0 = f9.AbstractC2224g.f10210a     // Catch: java.lang.Throwable -> L8b
            t8.w r0 = t8.C7077w.m13371a()     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L8b
            r1.toString()     // Catch: java.lang.Throwable -> L8b
            r0.getClass()     // Catch: java.lang.Throwable -> L8b
            throw r14     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            r14 = r0
            goto Lb9
        L8e:
            int r0 = f9.AbstractC2224g.f10210a     // Catch: java.lang.Throwable -> L8b
            t8.w r0 = t8.C7077w.m13371a()     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L8b
            r1.toString()     // Catch: java.lang.Throwable -> L8b
            r0.getClass()     // Catch: java.lang.Throwable -> L8b
            int r0 = r7.get()     // Catch: java.lang.Throwable -> L8b
            if (r0 == r4) goto La5
            goto La6
        La5:
            r5 = 0
        La6:
            boolean r0 = r6.isCancelled()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lb8
            if (r5 == 0) goto Lb8
            f9.a r14 = new f9.a     // Catch: java.lang.Throwable -> L8b
            int r0 = r7.get()     // Catch: java.lang.Throwable -> L8b
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            throw r14     // Catch: java.lang.Throwable -> L8b
        Lb8:
            throw r14     // Catch: java.lang.Throwable -> L8b
        Lb9:
            r2.mo13510j(r3)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0749g.m2039e(java.lang.Object):java.lang.Object");
    }

    /* renamed from: g */
    private final Object m2040g(Object obj) {
        InterfaceC5822t interfaceC5822t = (InterfaceC5822t) this.f4719d;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f4717b;
        if (i10 == 0) {
            od.m10798c(obj);
            f2 f2Var = new f2((InterfaceC7266z) this.f4718c, (InterfaceC2142f) this.f4720e, (InterfaceC2139c) this.f4721f, (InterfaceC2139c) this.f4722g, (InterfaceC2139c) this.f4723h, new a1(interfaceC5822t), null);
            this.f4717b = 1;
            if (r1.m8472c(interfaceC5822t, f2Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m2041h(java.lang.Object r11) {
        /*
            r10 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r10.f4717b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r10.f4718c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r10.f4721f
            java.util.List r4 = (java.util.List) r4
            og.od.m10798c(r11)
            goto L46
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Object r1 = r10.f4720e
            java.lang.Object r4 = r10.f4719d
            q6.c r4 = (q6.C6131c) r4
            java.lang.Object r5 = r10.f4718c
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r10.f4721f
            java.util.List r6 = (java.util.List) r6
            og.od.m10798c(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L68
        L35:
            og.od.m10798c(r11)
            java.lang.Object r11 = r10.f4721f
            java.lang.Object r1 = r10.f4722g
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r10.f4723h
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r1.next()
            q6.c r5 = (q6.C6131c) r5
            r10.f4721f = r4
            r10.f4718c = r1
            r10.f4719d = r5
            r10.f4720e = r11
            r10.f4717b = r3
            java.lang.Object r6 = r5.m12162a(r11, r10)
            if (r6 != r0) goto L63
            goto L9b
        L63:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L68:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9e
            an.e5 r11 = new an.e5
            r7 = 5
            r8 = 0
            r11.<init>(r6, r8, r7)
            r4.add(r11)
            r10.f4721f = r4
            r10.f4718c = r5
            r10.f4719d = r8
            r10.f4720e = r8
            r10.f4717b = r2
            mq.z0 r11 = r6.f29882b
            q6.e r7 = new q6.e
            qw.p r8 = r6.f29885e
            java.lang.Object r8 = r8.getValue()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.Set r6 = r6.f29886f
            r7.<init>(r8, r6)
            java.lang.Object r11 = r11.invoke(r7, r1, r10)
            if (r11 != r0) goto L9c
        L9b:
            return r0
        L9c:
            r1 = r5
            goto L46
        L9e:
            r11 = r1
            goto L9c
        La0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0749g.m2041h(java.lang.Object):java.lang.Object");
    }

    /* renamed from: i */
    private final Object m2042i(Object obj) {
        String str;
        Integer num;
        Object value;
        String str2;
        p0 p0Var = (p0) this.f4721f;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f4717b;
        if (i10 == 0) {
            od.m10798c(obj);
            str = (String) this.f4722g;
            Integer num2 = (Integer) this.f4723h;
            C0979e c0979e = p0Var.f31885q;
            this.f4720e = null;
            this.f4718c = str;
            this.f4719d = num2;
            this.f4717b = 1;
            Object objM15696l = ((y5) c0979e.f5803b).m15696l(this);
            if (objM15696l == enumC7794a) {
                return enumC7794a;
            }
            num = num2;
            obj = objM15696l;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) this.f4719d;
            str = (String) this.f4718c;
            od.m10798c(obj);
        }
        C4802m c4802m = (C4802m) AbstractC6663m.m12743G((List) obj);
        if (c4802m != null && (str2 = c4802m.f23891c) != null) {
            str = str2;
        }
        if (c4802m != null) {
            num = new Integer(c4802m.f23892d);
        }
        C6361k c6361k = new C6361k(str, num);
        m1 m1Var = p0Var.f31893y;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, h0.m12673a((h0) value, null, null, false, c6361k, 7)));
        return a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[PHI: r5 r7
      0x00a2: PHI (r5v6 java.util.List) = (r5v4 java.util.List), (r5v8 java.util.List) binds: [B:16:0x009f, B:10:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r7v2 java.lang.Object) = (r7v1 java.lang.Object), (r7v4 java.lang.Object) binds: [B:16:0x009f, B:10:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4 A[PHI: r5 r7 r8
      0x00b4: PHI (r5v9 java.util.List) = (r5v6 java.util.List), (r5v13 java.util.List) binds: [B:19:0x00b1, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r7v5 java.util.List) = (r7v3 java.util.List), (r7v8 java.util.List) binds: [B:19:0x00b1, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r8v3 java.lang.Object) = (r8v2 java.lang.Object), (r8v7 java.lang.Object) binds: [B:19:0x00b1, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022f A[LOOP:1: B:87:0x022f->B:94:?, LOOP_START] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m2043j(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0749g.m2043j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [tx.e1] */
    /* JADX WARN: Type inference failed for: r3v14, types: [tx.e1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* renamed from: k */
    private final Object m2044k(Object obj) throws Throwable {
        Throwable th2;
        e1 e1Var;
        c3 c3Var = (c3) this.f4722g;
        InterfaceC1649u interfaceC1649u = (InterfaceC1649u) this.f4721f;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        ?? M13502y = this.f4717b;
        a0 a0Var = a0.f30746a;
        InterfaceC7559c interfaceC7559c = null;
        try {
            if (M13502y == 0) {
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f4718c;
                try {
                    y1 y1Var = (y1) ((C4168z) this.f4719d).f21164a;
                    if (y1Var != null) {
                        k1 k1VarM14902a = d3.m14902a(((View) this.f4723h).getContext().getApplicationContext());
                        y1Var.f38060a.m8491g(((Number) k1VarM14902a.getValue()).floatValue());
                        M13502y = c0.m13502y(interfaceC7266z, null, null, new C7351a(k1VarM14902a, y1Var, interfaceC7559c, 11), 3);
                    } else {
                        M13502y = 0;
                    }
                    q1 q1Var = (q1) this.f4720e;
                    this.f4718c = M13502y;
                    this.f4717b = 1;
                    Object objM13475K = c0.m13475K(q1Var.f20518a, new d0(q1Var, new p1(q1Var, null), C3953b.m8515r(getContext()), interfaceC7559c, 10), this);
                    if (objM13475K != enumC7794a) {
                        objM13475K = a0Var;
                    }
                    if (objM13475K != enumC7794a) {
                        objM13475K = a0Var;
                    }
                    if (objM13475K == enumC7794a) {
                        return enumC7794a;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    e1Var = null;
                    if (e1Var != null) {
                        e1Var.mo13510j(null);
                    }
                    interfaceC1649u.getLifecycle().mo5346d(c3Var);
                    throw th2;
                }
            } else {
                if (M13502y != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                M13502y = (e1) this.f4718c;
                od.m10798c(obj);
            }
            if (M13502y != 0) {
                M13502y.mo13510j(null);
            }
            interfaceC1649u.getLifecycle().mo5346d(c3Var);
            return a0Var;
        } catch (Throwable th4) {
            th2 = th4;
            e1Var = M13502y;
        }
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4716a) {
            case 0:
                return new C0749g((C0751i) this.f4718c, (SaveLeadRequest) this.f4719d, (C9034d) this.f4720e, (LeadDetails) this.f4721f, (List) this.f4722g, (AbstractC0755m) this.f4723h, interfaceC7559c, 0);
            case 1:
                return new C0749g((AbstractC1646r) this.f4720e, (EnumC1645q) this.f4721f, (InterfaceC7266z) this.f4722g, (C0406i) this.f4723h, interfaceC7559c, 1);
            case 2:
                return new C0749g((C1813s) this.f4720e, (sc.c0) this.f4721f, (C4166x) this.f4722g, (C4168z) this.f4723h, interfaceC7559c, 2);
            case 3:
                C0749g c0749g = new C0749g((AbstractC7076v) this.f4721f, (C3553g) this.f4722g, (C0922q) this.f4723h, interfaceC7559c, 3);
                c0749g.f4720e = obj;
                return c0749g;
            case 4:
                C0749g c0749g2 = new C0749g((InterfaceC7810l) this.f4720e, (C2772c) this.f4721f, (k2.w0) this.f4722g, (k2.w0) this.f4723h, interfaceC7559c, 4);
                c0749g2.f4719d = obj;
                return c0749g2;
            case 5:
                C0749g c0749g3 = new C0749g((InterfaceC5822t) this.f4719d, (InterfaceC2142f) this.f4720e, (InterfaceC2139c) this.f4721f, (InterfaceC2139c) this.f4722g, (InterfaceC2139c) this.f4723h, interfaceC7559c, 5);
                c0749g3.f4718c = obj;
                return c0749g3;
            case 6:
                C0749g c0749g4 = new C0749g((List) this.f4722g, (ArrayList) this.f4723h, interfaceC7559c);
                c0749g4.f4721f = obj;
                return c0749g4;
            case 7:
                C0749g c0749g5 = new C0749g((p0) this.f4721f, (String) this.f4722g, (Integer) this.f4723h, interfaceC7559c, 7);
                c0749g5.f4720e = obj;
                return c0749g5;
            case 8:
                return new C0749g((C6952k) this.f4723h, interfaceC7559c);
            case 9:
                C0749g c0749g6 = new C0749g((C4168z) this.f4719d, (q1) this.f4720e, (InterfaceC1649u) this.f4721f, (c3) this.f4722g, (View) this.f4723h, interfaceC7559c, 9);
                c0749g6.f4718c = obj;
                return c0749g6;
            default:
                return new C0749g((C6338m) this.f4718c, (p0) this.f4719d, (l7.a0) this.f4720e, (String) this.f4721f, (k2.w0) this.f4722g, (InterfaceC2139c) this.f4723h, interfaceC7559c, 10);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4716a) {
        }
        return ((C0749g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x0b9d, code lost:
    
        if (bs.C0751i.m2046f(r10, r9, r86) == r15) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0c58, code lost:
    
        if (r0 == r15) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0c8f, code lost:
    
        if (r10.f4736J.mo14775g((bs.AbstractC0755m) r42, r86) != r15) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0d12, code lost:
    
        if (tx.c0.m13489l(1000, r86) == r15) goto L360;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v36, types: [tx.b0, uw.c, uw.h] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f7 -> B:44:0x00fb). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r87) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0749g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4716a = i10;
        this.f4719d = obj;
        this.f4720e = obj2;
        this.f4721f = obj3;
        this.f4722g = obj4;
        this.f4723h = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749g(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4716a = i10;
        this.f4720e = obj;
        this.f4721f = obj2;
        this.f4722g = obj3;
        this.f4723h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749g(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4716a = i10;
        this.f4721f = obj;
        this.f4722g = obj2;
        this.f4723h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749g(List list, ArrayList arrayList, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4716a = 6;
        this.f4722g = list;
        this.f4723h = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749g(C6952k c6952k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4716a = 8;
        this.f4723h = c6952k;
    }
}
