package aw;

import android.content.Context;
import android.graphics.Bitmap;
import av.C0459b;
import b2.y0;
import b8.C0614i;
import be.C0655j;
import bv.C0784b;
import bv.C0790h;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest;
import com.websoptimization.callyzerbiz.workManager.SubmitContactUsFormWorkManager;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import dr.C1775y;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import f2.C2187j;
import f9.C2222e;
import g2.e4;
import g4.l0;
import g4.n0;
import ge.C2577i;
import gn.x2;
import gs.C2728n;
import h1.s1;
import h1.x0;
import he.C2916g;
import im.InterfaceC3307i;
import j$.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CancellationException;
import k1.C3934i;
import k1.InterfaceC3928c;
import k1.d2;
import k1.l2;
import k2.C3953b;
import k2.a1;
import k2.b1;
import k2.h2;
import k2.p1;
import k2.q1;
import k2.t0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import l7.C4409i;
import mw.C4903k;
import n7.C4964i;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import p3.InterfaceC5822t;
import qv.C6338m;
import rv.p0;
import rw.AbstractC6663m;
import tx.InterfaceC7266z;
import tx.e1;
import u1.C7300b;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import w3.p2;
import wd.C7995c;
import wd.C7998f;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.InterfaceC8209j;
import x1.c1;
import x1.f1;
import x1.r0;
import x1.r1;
import x1.v0;
import xm.x1;
import xu.C8472k;
import yn.C8716n;
import z1.C8843c;
import z1.C8850j;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3337a;

    /* renamed from: b */
    public Object f3338b;

    /* renamed from: c */
    public int f3339c;

    /* renamed from: d */
    public Object f3340d;

    /* renamed from: e */
    public Object f3341e;

    /* renamed from: f */
    public Object f3342f;

    /* renamed from: g */
    public final /* synthetic */ Object f3343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(SubmitContactUsFormWorkManager submitContactUsFormWorkManager, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3337a = 0;
        this.f3343g = submitContactUsFormWorkManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1465d(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.d0.m1465d(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    private final Object m1466e(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        if (i10 == 0) {
            od.m10798c(obj);
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f3340d;
            InterfaceC7564h context = getContext();
            InterfaceC5822t interfaceC5822t = (InterfaceC5822t) this.f3338b;
            d2 d2Var = new d2(context, interfaceC7266z, (C4903k) this.f3341e, (InterfaceC2141e) this.f3342f, (w0) this.f3343g, null);
            this.f3339c = 1;
            if (((p3.h0) interfaceC5822t).L0(d2Var, this) == enumC7794a) {
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

    /* renamed from: g */
    private final Object m1467g(Object obj) {
        C4409i c4409i;
        C4409i c4409i2;
        a1 a1Var = (a1) this.f3342f;
        w0 w0Var = (w0) this.f3343g;
        C4964i c4964i = (C4964i) this.f3338b;
        w0 w0Var2 = (w0) this.f3341e;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                InterfaceC8209j interfaceC8209j = (InterfaceC8209j) this.f3340d;
                if (((List) w0Var2.getValue()).size() > 1) {
                    a1Var.m8491g(DefinitionKt.NO_Float_VALUE);
                    c4409i = (C4409i) AbstractC6663m.m12751O((List) w0Var2.getValue());
                    AbstractC4154l.m8920c(c4409i);
                    c4964i.m9225b().m9221g(c4409i);
                    c4964i.m9225b().m9221g((C4409i) ((List) w0Var2.getValue()).get(((List) w0Var2.getValue()).size() - 2));
                } else {
                    c4409i = null;
                }
                C0614i c0614i = new C0614i(8, w0Var2, w0Var, a1Var);
                this.f3340d = c4409i;
                this.f3339c = 1;
                if (interfaceC8209j.collect(c0614i, this) == enumC7794a) {
                    return enumC7794a;
                }
                c4409i2 = c4409i;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4409i2 = (C4409i) this.f3340d;
                od.m10798c(obj);
            }
            if (((List) w0Var2.getValue()).size() > 1) {
                w0Var.setValue(Boolean.FALSE);
                AbstractC4154l.m8920c(c4409i2);
                c4964i.mo9231i(c4409i2, false);
            }
        } catch (CancellationException unused) {
            if (((List) w0Var2.getValue()).size() > 1) {
                w0Var.setValue(Boolean.FALSE);
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: h */
    private final Object m1468h(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        if (i10 == 0) {
            od.m10798c(obj);
            InterfaceC8209j interfaceC8209j = (InterfaceC8209j) this.f3340d;
            e4 e4Var = new e4((w0) this.f3338b, (w0) this.f3341e, (InterfaceC2139c) this.f3342f, (InterfaceC2139c) this.f3343g);
            this.f3339c = 1;
            if (interfaceC8209j.collect(e4Var, this) == enumC7794a) {
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
    private final Object m1469i(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        C2577i c2577i = (C2577i) this.f3340d;
        C0655j c0655j = new C0655j(c2577i, ((C7998f) this.f3338b).f38452g, 0, c2577i, (C2916g) this.f3341e, (C7995c) this.f3342f, ((Bitmap) this.f3343g) != null);
        this.f3339c = 1;
        Object objM1882l = c0655j.m1882l(c2577i, this);
        return objM1882l == enumC7794a ? enumC7794a : objM1882l;
    }

    /* renamed from: j */
    private final Object m1470j(Object obj) {
        v0 v0Var = (v0) this.f3340d;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                C2222e c2222eM8522y = C3953b.m8522y(new C2187j((w0) this.f3338b, 7));
                e4 e4Var = new e4(v0Var, (l4.a0) this.f3341e, (y0) this.f3342f, (C4366k) this.f3343g, 5);
                this.f3339c = 1;
                if (c2222eM8522y.collect(e4Var, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            r0.m15452l(v0Var);
            return qw.a0.f30746a;
        } catch (Throwable th2) {
            r0.m15452l(v0Var);
            throw th2;
        }
    }

    /* renamed from: k */
    private final Object m1471k(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        qw.a0 a0Var = qw.a0.f30746a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return a0Var;
        }
        od.m10798c(obj);
        C7300b c7300b = (C7300b) this.f3340d;
        C4381z c4381z = (C4381z) this.f3338b;
        c1 c1Var = ((v0) this.f3341e).f39703a;
        l0 l0Var = ((r1) this.f3342f).f39668a;
        InterfaceC4374s interfaceC4374s = (InterfaceC4374s) this.f3343g;
        this.f3339c = 1;
        int iMo2733Y = interfaceC4374s.mo2733Y(n0.m6457d(c4381z.f21946b));
        Object objM13638a = c7300b.m13638a(iMo2733Y < l0Var.f13670a.f13660a.f13620b.length() ? l0Var.m6444b(iMo2733Y) : iMo2733Y != 0 ? l0Var.m6444b(iMo2733Y - 1) : new C0848c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, (int) (f1.m15434a(c1Var.f39455b, c1Var.f39460g, c1Var.f39461h, f1.f39494a, 1) & 4294967295L)), this);
        if (objM13638a != enumC7794a) {
            objM13638a = a0Var;
        }
        return objM13638a == enumC7794a ? enumC7794a : a0Var;
    }

    /* renamed from: l */
    private final Object m1472l(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        x2 x2Var = ((x1) this.f3340d).f40991a;
        String str = (String) this.f3338b;
        String str2 = (String) this.f3341e;
        EnumC8994d enumC8994d = (EnumC8994d) this.f3342f;
        LocalDateTime localDateTime = (LocalDateTime) this.f3343g;
        this.f3339c = 1;
        Object objM484j = x2Var.f14941a.m484j(str, str2, enumC8994d, localDateTime, this);
        return objM484j == enumC7794a ? enumC7794a : objM484j;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0259  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1473m(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.d0.m1473m(java.lang.Object):java.lang.Object");
    }

    /* renamed from: n */
    private final Object m1474n(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        if (i10 == 0) {
            od.m10798c(obj);
            p0 p0Var = (p0) this.f3340d;
            C8203d c8203d = p0Var.f31866D;
            C8472k c8472k = new C8472k((C6338m) this.f3338b, p0Var, (l7.a0) this.f3341e, (InterfaceC2139c) this.f3342f, (h2) this.f3343g);
            this.f3339c = 1;
            if (c8203d.collect(c8472k, this) == enumC7794a) {
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

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r1 != r9) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1475o(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f3341e
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r12.f3338b
            r7 = r0
            yn.n r7 = (yn.C8716n) r7
            xm.y5 r8 = r7.f42146d
            vw.a r9 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r0 = r12.f3339c
            r10 = 5
            r11 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L44
            if (r0 == r3) goto L40
            if (r0 == r2) goto L3c
            if (r0 == r1) goto L38
            if (r0 == r11) goto L33
            if (r0 != r10) goto L2b
            java.lang.Object r0 = r12.f3340d
            yv.t r0 = (yv.C8805t) r0
            og.od.m10798c(r13)
            r1 = r13
            goto Laa
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            og.od.m10798c(r13)
            goto L9d
        L38:
            og.od.m10798c(r13)
            goto L82
        L3c:
            og.od.m10798c(r13)
            goto L6e
        L40:
            og.od.m10798c(r13)
            goto L52
        L44:
            og.od.m10798c(r13)
            rn.h0 r0 = r7.f42149g
            r12.f3339c = r3
            java.lang.Object r0 = r0.m12604E(r12)
            if (r0 != r9) goto L52
            goto La9
        L52:
            int r0 = r6.length()
            if (r0 <= 0) goto Lc2
            java.lang.Object r0 = r12.f3342f
            j$.time.LocalDateTime r0 = (j$.time.LocalDateTime) r0
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r12.f3343g
            j$.time.LocalDateTime r0 = (j$.time.LocalDateTime) r0
            if (r0 == 0) goto Lc2
            r12.f3339c = r2
            r0 = 0
            java.lang.Object r0 = r8.m15710z(r6, r0, r12)
            if (r0 != r9) goto L6e
            goto La9
        L6e:
            xm.y5 r0 = r7.f42146d
            java.lang.Object r2 = r12.f3341e
            java.lang.String r2 = (java.lang.String) r2
            r12.f3339c = r1
            r1 = r2
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r12
            java.lang.Object r0 = r0.m15684C(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L82
            goto La9
        L82:
            xm.y5 r0 = r7.f42146d
            java.lang.Object r1 = r12.f3341e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r12.f3342f
            r3 = r2
            j$.time.LocalDateTime r3 = (j$.time.LocalDateTime) r3
            java.lang.Object r2 = r12.f3343g
            r4 = r2
            j$.time.LocalDateTime r4 = (j$.time.LocalDateTime) r4
            r12.f3339c = r11
            r2 = 1
            r5 = r12
            java.lang.Object r0 = r0.m15686E(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L9d
            goto La9
        L9d:
            yv.t r0 = r7.f42156n
            r12.f3340d = r0
            r12.f3339c = r10
            java.lang.Object r1 = r8.m15702r(r6, r12)
            if (r1 != r9) goto Laa
        La9:
            return r9
        Laa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "FCMMessage >>> trial/subscription expired >>> updated sim details: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.m16231f(r1)
            wo.s r0 = r7.f42147e
            im.g r1 = im.C3305g.f17555a
            r0.m15308k(r1)
        Lc2:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.d0.m1475o(java.lang.Object):java.lang.Object");
    }

    /* renamed from: p */
    private final Object m1476p(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f3339c;
        if (i10 == 0) {
            od.m10798c(obj);
            C8203d c8203d = ((C0790h) this.f3340d).f5002n;
            e4 e4Var = new e4((p2) this.f3338b, (InterfaceC2137a) this.f3341e, (C0459b) this.f3342f, (Context) this.f3343g, 8);
            this.f3339c = 1;
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

    /* JADX WARN: Type inference failed for: r4v14, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r5v15, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3337a) {
            case 0:
                return new d0((SubmitContactUsFormWorkManager) this.f3343g, interfaceC7559c);
            case 1:
                return new d0((InterfaceC3307i) this.f3342f, (C1775y) this.f3343g, interfaceC7559c);
            case 2:
                d0 d0Var = new d0((AbstractC1646r) this.f3338b, (EnumC1645q) this.f3341e, (InterfaceC7564h) this.f3342f, (InterfaceC8209j) this.f3343g, interfaceC7559c, 2);
                d0Var.f3340d = obj;
                return d0Var;
            case 3:
                return new d0((w0) this.f3338b, (MainActivity) this.f3341e, (b1) this.f3342f, (w0) this.f3343g, interfaceC7559c, 3);
            case 4:
                return new d0((w0) this.f3338b, (C0784b) this.f3341e, (b1) this.f3342f, (w0) this.f3343g, interfaceC7559c, 4);
            case 5:
                return new d0((C2728n) this.f3341e, (String) this.f3342f, (String) this.f3343g, interfaceC7559c, 5);
            case 6:
                return new d0((x0) this.f3341e, this.f3342f, (s1) this.f3343g, interfaceC7559c, 6);
            case 7:
                return new d0((String) this.f3341e, (Context) this.f3342f, (PhoneStateReceiver) this.f3343g, interfaceC7559c, 7);
            case 8:
                d0 d0Var2 = new d0((l2) this.f3338b, (C3934i) this.f3341e, (InterfaceC3928c) this.f3342f, (e1) this.f3343g, interfaceC7559c, 8);
                d0Var2.f3340d = obj;
                return d0Var2;
            case 9:
                d0 d0Var3 = new d0((InterfaceC5822t) this.f3338b, (InterfaceC2142f) this.f3341e, (InterfaceC2139c) this.f3342f, (k1.a1) this.f3343g, interfaceC7559c);
                d0Var3.f3340d = obj;
                return d0Var3;
            case 10:
                d0 d0Var4 = new d0((q1) this.f3341e, (p1) this.f3342f, (t0) this.f3343g, interfaceC7559c, 10);
                d0Var4.f3338b = obj;
                return d0Var4;
            case 11:
                d0 d0Var5 = new d0((InterfaceC5822t) this.f3338b, (C4903k) this.f3341e, (InterfaceC2141e) this.f3342f, (w0) this.f3343g, interfaceC7559c, 11);
                d0Var5.f3340d = obj;
                return d0Var5;
            case 12:
                d0 d0Var6 = new d0((C4964i) this.f3338b, (w0) this.f3341e, (a1) this.f3342f, (w0) this.f3343g, interfaceC7559c, 12);
                d0Var6.f3340d = obj;
                return d0Var6;
            case 13:
                return new d0((InterfaceC8209j) this.f3340d, (w0) this.f3338b, (w0) this.f3341e, (InterfaceC2139c) this.f3342f, (InterfaceC2139c) this.f3343g, interfaceC7559c, 13);
            case 14:
                return new d0((C2577i) this.f3340d, (C7998f) this.f3338b, (C2916g) this.f3341e, (C7995c) this.f3342f, (Bitmap) this.f3343g, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new d0((v0) this.f3340d, (w0) this.f3338b, (l4.a0) this.f3341e, (y0) this.f3342f, (C4366k) this.f3343g, interfaceC7559c, 15);
            case 16:
                return new d0((C7300b) this.f3340d, (C4381z) this.f3338b, (v0) this.f3341e, (r1) this.f3342f, (InterfaceC4374s) this.f3343g, interfaceC7559c, 16);
            case 17:
                return new d0((x1) this.f3340d, (String) this.f3338b, (String) this.f3341e, (EnumC8994d) this.f3342f, (LocalDateTime) this.f3343g, interfaceC7559c, 17);
            case 18:
                return new d0((x1) this.f3341e, (CallRecordingSyncRequest) this.f3342f, (C4168z) this.f3343g, interfaceC7559c, 18);
            case 19:
                return new d0((p0) this.f3340d, (C6338m) this.f3338b, (l7.a0) this.f3341e, (InterfaceC2139c) this.f3342f, (h2) this.f3343g, interfaceC7559c, 19);
            case 20:
                return new d0((C8716n) this.f3338b, (String) this.f3341e, (LocalDateTime) this.f3342f, (LocalDateTime) this.f3343g, interfaceC7559c, 20);
            case 21:
                return new d0((C0790h) this.f3340d, (p2) this.f3338b, (InterfaceC2137a) this.f3341e, (C0459b) this.f3342f, (Context) this.f3343g, interfaceC7559c, 21);
            default:
                d0 d0Var7 = new d0((w3.r0) this.f3338b, (InterfaceC2139c) this.f3341e, (C8843c) this.f3342f, (C8850j) this.f3343g, interfaceC7559c, 22);
                d0Var7.f3340d = obj;
                return d0Var7;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3337a) {
        }
        return ((d0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x036c, code lost:
    
        if (h1.x0.m6876Q(r3, r42) != r9) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06c5, code lost:
    
        if (dr.C1775y.m5454n(r15, r0, r42) == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06dd, code lost:
    
        if (dr.C1775y.m5453m(r15, r42) == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06eb, code lost:
    
        if (dr.C1775y.m5453m(r15, r42) == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0706, code lost:
    
        if (dr.C1775y.m5454n(r15, r0, r42) == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x072a, code lost:
    
        if (dr.C1775y.m5454n(r15, r0, r42) == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x07cc, code lost:
    
        if (r1 != r3) goto L376;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0adc A[Catch: Exception -> 0x0af5, TryCatch #2 {Exception -> 0x0af5, blocks: (B:432:0x0a7d, B:433:0x0ad6, B:435:0x0adc, B:437:0x0ae8, B:439:0x0af0, B:444:0x0afa, B:445:0x0afe, B:447:0x0b19, B:453:0x0b32, B:452:0x0b30), top: B:466:0x0a7d }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0b19 A[Catch: Exception -> 0x0af5, TryCatch #2 {Exception -> 0x0af5, blocks: (B:432:0x0a7d, B:433:0x0ad6, B:435:0x0adc, B:437:0x0ae8, B:439:0x0af0, B:444:0x0afa, B:445:0x0afe, B:447:0x0b19, B:453:0x0b32, B:452:0x0b30), top: B:466:0x0a7d }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:527:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v21, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r8v18, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 3000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(InterfaceC3307i interfaceC3307i, C1775y c1775y, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3337a = 1;
        this.f3342f = interfaceC3307i;
        this.f3343g = c1775y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3337a = i10;
        this.f3340d = obj;
        this.f3338b = obj2;
        this.f3341e = obj3;
        this.f3342f = obj4;
        this.f3343g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3337a = i10;
        this.f3338b = obj;
        this.f3341e = obj2;
        this.f3342f = obj3;
        this.f3343g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3337a = i10;
        this.f3341e = obj;
        this.f3342f = obj2;
        this.f3343g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(InterfaceC5822t interfaceC5822t, InterfaceC2142f interfaceC2142f, InterfaceC2139c interfaceC2139c, k1.a1 a1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3337a = 9;
        this.f3338b = interfaceC5822t;
        this.f3341e = (AbstractC8199i) interfaceC2142f;
        this.f3342f = (AbstractC4155m) interfaceC2139c;
        this.f3343g = a1Var;
    }
}
