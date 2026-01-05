package ao;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import aq.C0406i;
import aw.C0465e;
import aw.d0;
import b2.C0554l;
import b8.C0614i;
import bs.C0751i;
import c4.ScrollCaptureCallbackC0854d;
import c9.C0922q;
import com.google.android.gms.internal.measurement.j4;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import d9.C1673r;
import dy.C1855c;
import er.AbstractC2111k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fv.C2386k;
import g2.e4;
import gb.InterfaceC2556f;
import gp.C2703n;
import gr.C2713i;
import gs.C2715a;
import gs.C2726l;
import h1.C2772c;
import h1.g0;
import h1.s1;
import h1.x0;
import i1.y0;
import ik.C3279c;
import ik.C3281e;
import j3.C3553g;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k1.C3934i;
import k1.InterfaceC3928c;
import k1.l2;
import k1.x1;
import k2.h2;
import k2.w0;
import kb.C4039c;
import kb.C4040d;
import kb.C4042f;
import kb.C4043g;
import kn.C4121a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import l7.C4409i;
import l7.C4417q;
import mr.AbstractC4865g;
import nf.C5047i;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import p004e.AbstractActivityC1878m;
import p005f.C2164m;
import ps.C6021u;
import qv.C6338m;
import ss.z0;
import t8.AbstractC7076v;
import tt.C7224g;
import tv.C7230d;
import tx.InterfaceC7266z;
import tx.e1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7811m;
import vx.C7812n;
import vx.C7813o;
import w2.C7881t;
import w3.p2;
import wj.C8090p;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import wx.c1;
import wx.g1;
import wx.q0;
import wx.t0;
import xs.C8449k;
import xv.C8492s;
import xx.AbstractC8495a;
import xx.AbstractC8496b;
import zh.InterfaceFutureC8957d;
import zr.C9034d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.t */
/* loaded from: classes3.dex */
public final class C0381t extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3023a;

    /* renamed from: b */
    public int f3024b;

    /* renamed from: c */
    public Object f3025c;

    /* renamed from: d */
    public Object f3026d;

    /* renamed from: e */
    public final /* synthetic */ Object f3027e;

    /* renamed from: f */
    public final /* synthetic */ Object f3028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0381t(InterfaceC2139c interfaceC2139c, AtomicReference atomicReference, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3023a = 25;
        this.f3026d = (AbstractC4155m) interfaceC2139c;
        this.f3027e = atomicReference;
        this.f3028f = interfaceC2141e;
    }

    /* renamed from: d */
    private final Object m1420d(Object obj) {
        C3934i c3934i = (C3934i) this.f3026d;
        C5047i c5047i = c3934i.f20118v;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        try {
            try {
                if (i10 == 0) {
                    od.m10798c(obj);
                    e1 e1VarM13495r = tx.c0.m13495r(((InterfaceC7266z) this.f3025c).mo1865w());
                    c3934i.f20113B = true;
                    x1 x1Var = c3934i.f20115r;
                    y0 y0Var = y0.Default;
                    d0 d0Var = new d0((l2) this.f3027e, c3934i, (InterfaceC3928c) this.f3028f, e1VarM13495r, null, 8);
                    this.f3024b = 1;
                    if (x1Var.m8479e(y0Var, d0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                c5047i.m9982T();
                c3934i.f20113B = false;
                c5047i.m9975E(null);
                c3934i.f20120x = false;
                return qw.a0.f30746a;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            c3934i.f20113B = false;
            c5047i.m9975E(null);
            c3934i.f20120x = false;
            throw th2;
        }
    }

    /* renamed from: e */
    private final Object m1421e(Object obj) {
        InterfaceC2556f interfaceC2556f = (InterfaceC2556f) this.f3027e;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                C4043g c4043g = (C4043g) this.f3025c;
                C0554l c0554l = c4043g.f20882b;
                C4039c c4039c = new C4039c((C4040d) this.f3026d, (C4042f) this.f3028f, interfaceC2556f, c4043g, null);
                this.f3024b = 1;
                if (c0554l.m1643m(c4039c, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
        } catch (Exception e2) {
            C4040d.m8831n(interfaceC2556f).mo329f(e2, new C0465e(16, (C4042f) this.f3028f));
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1422g(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.Object r0 = r15.f3027e
            l7.i r0 = (l7.C4409i) r0
            java.lang.Object r1 = r15.f3026d
            h1.x0 r1 = (h1.x0) r1
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r15.f3024b
            qw.a0 r7 = qw.a0.f30746a
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 != r3) goto L1a
            og.od.m10798c(r16)
            return r7
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L22:
            og.od.m10798c(r16)
            return r7
        L26:
            og.od.m10798c(r16)
            java.lang.Object r2 = r15.f3025c
            tx.z r2 = (tx.InterfaceC7266z) r2
            k2.e1 r8 = r1.f15646c
            k2.a1 r9 = r1.f15651h
            java.lang.Object r8 = r8.getValue()
            boolean r8 = kotlin.jvm.internal.AbstractC4154l.m8918a(r8, r0)
            r10 = 0
            if (r8 != 0) goto L55
            r15.f3024b = r5
            h1.s1 r2 = r1.f15648e
            if (r2 != 0) goto L43
            goto L51
        L43:
            h1.m0 r3 = r1.f15654l
            h1.r0 r5 = new h1.r0
            r5.<init>(r2, r1, r0, r10)
            java.lang.Object r0 = h1.m0.m6837a(r3, r5, r15)
            if (r0 != r6) goto L51
            goto L52
        L51:
            r0 = r7
        L52:
            if (r0 != r6) goto L91
            goto L90
        L55:
            java.lang.Object r5 = r15.f3028f
            h1.s1 r5 = (h1.s1) r5
            k2.c0 r5 = r5.f15599l
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            long r11 = r5.longValue()
            r5 = 1000000(0xf4240, float:1.401298E-39)
            long r13 = (long) r5
            long r11 = r11 / r13
            float r5 = r9.m8490f()
            float r8 = r9.m8490f()
            float r9 = (float) r11
            float r8 = r8 * r9
            int r8 = (int) r8
            r9 = 0
            r11 = 6
            h1.w1 r8 = h1.AbstractC2773d.m6795r(r8, r9, r10, r11)
            bt.l r9 = new bt.l
            r10 = 20
            r9.<init>(r10, r2, r1, r0)
            r15.f3024b = r3
            r1 = 0
            r0 = r5
            r5 = 4
            r4 = r15
            r2 = r8
            r3 = r9
            java.lang.Object r0 = h1.AbstractC2773d.m6782e(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L91
        L90:
            return r6
        L91:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0381t.m1422g(java.lang.Object):java.lang.Object");
    }

    /* renamed from: h */
    private final Object m1423h(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            ((InterfaceC2139c) this.f3025c).invoke((l7.a0) this.f3026d);
            z0 z0Var = (z0) this.f3027e;
            String str = (String) this.f3028f;
            this.f3024b = 1;
            if (z0Var.m13202y(str, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: i */
    private final Object m1424i(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            C7230d c7230d = (C7230d) this.f3025c;
            C8203d c8203d = c7230d.f34580l;
            e4 e4Var = new e4((C6338m) this.f3026d, c7230d, (InterfaceC2137a) this.f3027e, (AbstractActivityC1878m) this.f3028f, 3);
            this.f3024b = 1;
            if (c8203d.collect(e4Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: j */
    private final Object m1425j(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C7224g) this.f3025c).f34552l;
            C2726l c2726l = new C2726l((InterfaceC2139c) this.f3026d, (h2) this.f3027e, (Context) this.f3028f, null, 2);
            this.f3024b = 1;
            if (c1.m15379j(c8203d, c2726l, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: k */
    private final Object m1426k(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8449k c8449k = (C8449k) this.f3025c;
            C8203d c8203d = c8449k.f41226p;
            gm.c0 c0Var = new gm.c0((C6021u) this.f3026d, (w0) this.f3027e, (w0) this.f3028f, c8449k, (InterfaceC7559c) null);
            this.f3024b = 1;
            if (c1.m15379j(c8203d, c0Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: l */
    private final Object m1427l(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C8492s) this.f3025c).f41388g;
            C0614i c0614i = new C0614i(9, (String[]) this.f3026d, (l7.a0) this.f3027e, (Context) this.f3028f);
            this.f3024b = 1;
            if (c8203d.collect(c0614i, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: m */
    private final Object m1428m(Object obj) throws Throwable {
        C7881t c7881t;
        C7881t c7881t2;
        AtomicReference atomicReference = (AtomicReference) this.f3027e;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f3025c;
                c7881t = new C7881t(tx.c0.m13495r(interfaceC7266z.mo1865w()), ((AbstractC4155m) this.f3026d).invoke(interfaceC7266z));
                C7881t c7881t3 = (C7881t) atomicReference.getAndSet(c7881t);
                if (c7881t3 != null) {
                    e1 e1Var = c7881t3.f37684a;
                    this.f3025c = c7881t;
                    this.f3024b = 1;
                    if (tx.c0.m13487j(e1Var, this) != enumC7794a) {
                    }
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7881t2 = (C7881t) this.f3025c;
                    try {
                        od.m10798c(obj);
                        while (!atomicReference.compareAndSet(c7881t2, null) && atomicReference.get() == c7881t2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(c7881t2, null) && atomicReference.get() == c7881t2) {
                        }
                        throw th;
                    }
                }
                c7881t = (C7881t) this.f3025c;
                od.m10798c(obj);
            }
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f3028f;
            Object obj2 = c7881t.f37685b;
            this.f3025c = c7881t;
            this.f3024b = 2;
            obj = interfaceC2141e.invoke(obj2, this);
            if (obj != enumC7794a) {
                c7881t2 = c7881t;
                while (!atomicReference.compareAndSet(c7881t2, null)) {
                }
                return obj;
            }
            return enumC7794a;
        } catch (Throwable th3) {
            th = th3;
            c7881t2 = c7881t;
            while (!atomicReference.compareAndSet(c7881t2, null)) {
            }
            throw th;
        }
    }

    /* renamed from: n */
    private final Object m1429n(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            C0751i c0751i = (C0751i) this.f3025c;
            C8203d c8203d = c0751i.f4737K;
            gm.c0 c0Var = new gm.c0(c0751i, (InterfaceC2137a) this.f3026d, (InterfaceC2137a) this.f3027e, (w0) this.f3028f, (InterfaceC7559c) null);
            this.f3024b = 1;
            if (c1.m15379j(c8203d, c0Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: o */
    private final Object m1430o(Object obj) throws Throwable {
        C4168z c4168z;
        C4168z c4168z2;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            Object obj2 = ((C7813o) this.f3026d).f37520a;
            c4168z = (C4168z) this.f3027e;
            boolean z6 = obj2 instanceof C7812n;
            if (!z6) {
                c4168z.f21164a = obj2;
            }
            InterfaceC8210k interfaceC8210k = (InterfaceC8210k) this.f3028f;
            if (z6) {
                C7811m c7811m = obj2 instanceof C7811m ? (C7811m) obj2 : null;
                Throwable th2 = c7811m != null ? c7811m.f37518a : null;
                if (th2 != null) {
                    throw th2;
                }
                Object obj3 = c4168z.f21164a;
                if (obj3 != null) {
                    Object obj4 = obj3 != AbstractC8496b.f41395b ? obj3 : null;
                    this.f3026d = obj2;
                    this.f3025c = c4168z;
                    this.f3024b = 1;
                    if (interfaceC8210k.emit(obj4, this) == enumC7794a) {
                        return enumC7794a;
                    }
                    c4168z2 = c4168z;
                }
                c4168z.f21164a = AbstractC8496b.f41397d;
            }
            return qw.a0.f30746a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4168z2 = (C4168z) this.f3025c;
        od.m10798c(obj);
        c4168z = c4168z2;
        c4168z.f21164a = AbstractC8496b.f41397d;
        return qw.a0.f30746a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [wx.k, wx.t0, xx.a] */
    /* renamed from: p */
    private final Object m1431p(Object obj) {
        ?? r02 = (AbstractC8495a) this.f3027e;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3024b;
        if (i10 == 0) {
            od.m10798c(obj);
            int i11 = q0.f39307a[((wx.e1) this.f3025c).ordinal()];
            if (i11 == 1) {
                InterfaceC8209j interfaceC8209j = (InterfaceC8209j) this.f3026d;
                this.f3024b = 1;
                if (interfaceC8209j.collect(r02, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C4417q c4417q = c1.f39197a;
                Object obj2 = this.f3028f;
                if (obj2 == c4417q) {
                    r02.mo15351a();
                } else {
                    r02.mo15352b(obj2);
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v9, types: [wx.t0, xx.a] */
    /* JADX WARN: Type inference failed for: r4v46, types: [wx.t0, xx.a] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3023a) {
            case 0:
                return new C0381t((Map) this.f3026d, (StringBuilder) this.f3027e, (c0) this.f3028f, interfaceC7559c, 0);
            case 1:
                return new C0381t((RecordingCompressManager) this.f3025c, (C4121a) this.f3026d, (Uri) this.f3027e, (String) this.f3028f, interfaceC7559c, 1);
            case 2:
                return new C0381t((C0751i) this.f3025c, (String) this.f3026d, (C9034d) this.f3027e, (AbstractC4865g) this.f3028f, interfaceC7559c, 2);
            case 3:
                return new C0381t((ScrollCaptureCallbackC0854d) this.f3025c, (ScrollCaptureSession) this.f3026d, (Rect) this.f3027e, (Consumer) this.f3028f, interfaceC7559c, 3);
            case 4:
                return new C0381t((C2386k) this.f3025c, (p2) this.f3026d, (Context) this.f3027e, (InterfaceC2137a) this.f3028f, interfaceC7559c, 4);
            case 5:
                return new C0381t((C1855c) this.f3027e, (C0406i) this.f3028f, interfaceC7559c, 5);
            case 6:
                C0381t c0381t = new C0381t((AbstractC1646r) this.f3026d, (EnumC1645q) this.f3027e, (C0406i) this.f3028f, interfaceC7559c, 6);
                c0381t.f3025c = obj;
                return c0381t;
            case 7:
                return new C0381t((AbstractC7076v) this.f3025c, (C0922q) this.f3026d, (C1673r) this.f3027e, (Context) this.f3028f, interfaceC7559c, 7);
            case 8:
                return new C0381t((C2164m) this.f3026d, (InterfaceC2141e) this.f3027e, (j4) this.f3028f, interfaceC7559c, 8);
            case 9:
                return new C0381t((C3553g) this.f3025c, (C0922q) this.f3026d, (AtomicInteger) this.f3027e, (InterfaceFutureC8957d) this.f3028f, interfaceC7559c, 9);
            case 10:
                return new C0381t((ConstraintTrackingWorker) this.f3025c, (AbstractC7076v) this.f3026d, (C3553g) this.f3027e, (C0922q) this.f3028f, interfaceC7559c, 10);
            case 11:
                return new C0381t((C8090p) this.f3026d, (String) this.f3027e, (String) this.f3028f, interfaceC7559c, 11);
            case 12:
                return new C0381t((C2703n) this.f3025c, (Context) this.f3026d, (InterfaceC2137a) this.f3027e, (InterfaceC2139c) this.f3028f, interfaceC7559c, 12);
            case 13:
                return new C0381t((C2713i) this.f3027e, (AbstractC2111k) this.f3028f, interfaceC7559c, 13);
            case 14:
                return new C0381t(this.f3025c, (C2772c) this.f3026d, (w0) this.f3027e, (w0) this.f3028f, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0381t c0381t2 = new C0381t((w0) this.f3027e, (g0) this.f3028f, interfaceC7559c, 15);
                c0381t2.f3026d = obj;
                return c0381t2;
            case 16:
                return new C0381t((C3281e) this.f3025c, this.f3026d, (C2715a) this.f3027e, (C3279c) this.f3028f, interfaceC7559c, 16);
            case 17:
                C0381t c0381t3 = new C0381t((C3934i) this.f3026d, (l2) this.f3027e, (InterfaceC3928c) this.f3028f, interfaceC7559c, 17);
                c0381t3.f3025c = obj;
                return c0381t3;
            case 18:
                return new C0381t((C4043g) this.f3025c, (C4040d) this.f3026d, (InterfaceC2556f) this.f3027e, (C4042f) this.f3028f, interfaceC7559c, 18);
            case 19:
                C0381t c0381t4 = new C0381t((x0) this.f3026d, (C4409i) this.f3027e, (s1) this.f3028f, interfaceC7559c, 19);
                c0381t4.f3025c = obj;
                return c0381t4;
            case 20:
                return new C0381t((InterfaceC2139c) this.f3025c, (l7.a0) this.f3026d, (z0) this.f3027e, (String) this.f3028f, interfaceC7559c, 20);
            case 21:
                return new C0381t((C7230d) this.f3025c, (C6338m) this.f3026d, (InterfaceC2137a) this.f3027e, (AbstractActivityC1878m) this.f3028f, interfaceC7559c, 21);
            case 22:
                return new C0381t((C7224g) this.f3025c, (InterfaceC2139c) this.f3026d, (h2) this.f3027e, (Context) this.f3028f, interfaceC7559c, 22);
            case 23:
                return new C0381t((C8449k) this.f3025c, (C6021u) this.f3026d, (w0) this.f3027e, (w0) this.f3028f, interfaceC7559c, 23);
            case 24:
                return new C0381t((C8492s) this.f3025c, (String[]) this.f3026d, (l7.a0) this.f3027e, (Context) this.f3028f, interfaceC7559c, 24);
            case 25:
                C0381t c0381t5 = new C0381t((InterfaceC2139c) this.f3026d, (AtomicReference) this.f3027e, (InterfaceC2141e) this.f3028f, interfaceC7559c);
                c0381t5.f3025c = obj;
                return c0381t5;
            case 26:
                return new C0381t((C0751i) this.f3025c, (InterfaceC2137a) this.f3026d, (InterfaceC2137a) this.f3027e, (w0) this.f3028f, interfaceC7559c, 26);
            case 27:
                C0381t c0381t6 = new C0381t((C4168z) this.f3027e, (InterfaceC8210k) this.f3028f, interfaceC7559c, 27);
                c0381t6.f3026d = obj;
                return c0381t6;
            case 28:
                C0381t c0381t7 = new C0381t((InterfaceC8209j) this.f3026d, (t0) this.f3027e, this.f3028f, interfaceC7559c);
                c0381t7.f3025c = obj;
                return c0381t7;
            default:
                return new C0381t((g1) this.f3025c, (InterfaceC8209j) this.f3026d, (t0) this.f3027e, this.f3028f, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3023a) {
            case 0:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 3:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 4:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 5:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 6:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 7:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 8:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 9:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 10:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 11:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 12:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 13:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 14:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 16:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 17:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 18:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 19:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 20:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 21:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 22:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 23:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 24:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 25:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 26:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 27:
                return ((C0381t) create(new C7813o(((C7813o) obj).f37520a), (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 28:
                return ((C0381t) create((wx.e1) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((C0381t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0231, code lost:
    
        if (wx.c1.m15384o(r4, r5, r59) == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x037e, code lost:
    
        if (r2 == r15) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x086d, code lost:
    
        if (yv.AbstractC8804s.m16225d(r8, ((zr.C9034d) r5.f39340a.getValue()).f43541b.f43524r, r0) == true) goto L387;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0304 A[PHI: r3 r4
      0x0304: PHI (r3v54 mm.c) = (r3v51 mm.c), (r3v60 mm.c) binds: [B:147:0x0300, B:137:0x02c1] A[DONT_GENERATE, DONT_INLINE]
      0x0304: PHI (r4v36 java.lang.Object) = (r4v35 java.lang.Object), (r4v46 java.lang.Object) binds: [B:147:0x0300, B:137:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035f A[PHI: r3 r4
      0x035f: PHI (r3v61 rt.a) = (r3v56 rt.a), (r3v63 rt.a) binds: [B:164:0x035c, B:136:0x02b6] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r4v47 java.lang.Object) = (r4v42 java.lang.Object), (r4v54 java.lang.Object) binds: [B:164:0x035c, B:136:0x02b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0387 A[PHI: r3 r6
      0x0387: PHI (r3v64 rt.a) = (r3v61 rt.a), (r3v67 rt.a) binds: [B:170:0x036d, B:174:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x0387: PHI (r6v30 boolean) = (r6v0 boolean), (r6v31 boolean) binds: [B:170:0x036d, B:174:0x0381] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07f3  */
    /* JADX WARN: Type inference failed for: r13v16, types: [wx.k, wx.t0, xx.a] */
    /* JADX WARN: Type inference failed for: r3v85, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0215 -> B:112:0x0234). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0231 -> B:112:0x0234). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r60) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C0381t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0381t(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3023a = i10;
        this.f3025c = obj;
        this.f3026d = obj2;
        this.f3027e = obj3;
        this.f3028f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0381t(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3023a = i10;
        this.f3026d = obj;
        this.f3027e = obj2;
        this.f3028f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0381t(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3023a = i10;
        this.f3027e = obj;
        this.f3028f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0381t(InterfaceC8209j interfaceC8209j, t0 t0Var, Object obj, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3023a = 28;
        this.f3026d = interfaceC8209j;
        this.f3027e = (AbstractC8495a) t0Var;
        this.f3028f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0381t(g1 g1Var, InterfaceC8209j interfaceC8209j, t0 t0Var, Object obj, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3023a = 29;
        this.f3025c = g1Var;
        this.f3026d = interfaceC8209j;
        this.f3027e = (AbstractC8495a) t0Var;
        this.f3028f = obj;
    }
}
