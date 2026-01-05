package os;

import android.content.Context;
import b2.s0;
import c9.C0908c;
import c9.C0910e;
import d7.q0;
import d7.w0;
import dr.C1769s;
import ex.InterfaceC2139c;
import ik.C3279c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ls.C4511b;
import lv.C4531c;
import ms.AbstractC4871f;
import ms.C4866a;
import ms.C4867b;
import ms.C4868c;
import ms.C4869d;
import ms.C4870e;
import nn.C5113e;
import pg.o6;
import qw.a0;
import rw.C6668r;
import rw.C6669s;
import tq.EnumC7204p;
import ts.C7217d;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wo.C8134s;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8803r;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.i */
/* loaded from: classes3.dex */
public final class C5731i extends w0 {

    /* renamed from: b */
    public final C0910e f28244b;

    /* renamed from: c */
    public final C8803r f28245c;

    /* renamed from: d */
    public final C8810d f28246d;

    /* renamed from: e */
    public final C8134s f28247e;

    /* renamed from: f */
    public final C5113e f28248f;

    /* renamed from: g */
    public final C0908c f28249g;

    /* renamed from: h */
    public final Context f28250h;

    /* renamed from: i */
    public final m1 f28251i;

    /* renamed from: j */
    public final wx.w0 f28252j;

    /* renamed from: k */
    public final C7806h f28253k;

    /* renamed from: l */
    public final C8203d f28254l;

    /* renamed from: m */
    public final C4531c f28255m;

    public C5731i(C0910e c0910e, C8803r networkMonitorUtil, C8810d c8810d, C8134s c8134s, C5113e c5113e, C0908c c0908c, Context context) {
        Object value;
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        this.f28244b = c0910e;
        this.f28245c = networkMonitorUtil;
        this.f28246d = c8810d;
        this.f28247e = c8134s;
        this.f28248f = c5113e;
        this.f28249g = c0908c;
        this.f28250h = context;
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C4511b(c6668r, false, false, false, 1, false, false, false, false, C6669s.f31944a, false, null, new C7217d(c6668r, enumC7204p, enumC7204p)));
        this.f28251i = m1VarM15372c;
        this.f28252j = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f28253k = c7806hM11805a;
        this.f28254l = c1.m15389t(c7806hM11805a);
        final int i10 = 0;
        InterfaceC2139c interfaceC2139c = new InterfaceC2139c(this) { // from class: os.a

            /* renamed from: b */
            public final /* synthetic */ C5731i f28207b;

            {
                this.f28207b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                Object value2;
                switch (i10) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m1 m1Var = this.f28207b.f28251i;
                        while (true) {
                            Object value3 = m1Var.getValue();
                            m1 m1Var2 = m1Var;
                            if (m1Var2.m15397i(value3, C4511b.m9347a((C4511b) value3, null, zBooleanValue, false, false, 0, false, false, false, false, null, false, null, null, 65533))) {
                                break;
                            } else {
                                m1Var = m1Var2;
                            }
                        }
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f28207b.f28251i;
                        do {
                            value2 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value2, C4511b.m9347a((C4511b) value2, null, false, false, zBooleanValue2, 0, false, false, false, false, null, false, null, null, 65527)));
                }
                return a0.f30746a;
            }
        };
        final int i11 = 1;
        this.f28255m = new C4531c(0, interfaceC2139c, new InterfaceC2139c(this) { // from class: os.a

            /* renamed from: b */
            public final /* synthetic */ C5731i f28207b;

            {
                this.f28207b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                Object value2;
                switch (i11) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m1 m1Var = this.f28207b.f28251i;
                        while (true) {
                            Object value3 = m1Var.getValue();
                            m1 m1Var2 = m1Var;
                            if (m1Var2.m15397i(value3, C4511b.m9347a((C4511b) value3, null, zBooleanValue, false, false, 0, false, false, false, false, null, false, null, null, 65533))) {
                                break;
                            } else {
                                m1Var = m1Var2;
                            }
                        }
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f28207b.f28251i;
                        do {
                            value2 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value2, C4511b.m9347a((C4511b) value2, null, false, false, zBooleanValue2, 0, false, false, false, false, null, false, null, null, 65527)));
                }
                return a0.f30746a;
            }
        }, new C5727e(this, interfaceC7559c, 0), new C5727e(this, interfaceC7559c, 1), new C5725c(this, interfaceC7559c, 2), null, new C5725c(this, interfaceC7559c, 3), new C3279c(2, 4, interfaceC7559c), new C1769s(this, interfaceC7559c, 9), 1088);
        c0.m13502y(c8810d, null, null, new C5724b(this, interfaceC7559c, 0), 3);
        c0.m13502y(c8810d, null, null, new C5724b(this, interfaceC7559c, 1), 3);
        do {
            value = m1VarM15372c.getValue();
        } while (!m1VarM15372c.m15397i(value, C4511b.m9347a((C4511b) value, null, false, true, false, 0, false, false, false, false, null, false, null, null, 65531)));
        m11283g();
        c0.m13502y(this.f28246d, null, null, new C5724b(this, interfaceC7559c, 3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11281e(os.C5731i r21, int r22, ww.AbstractC8193c r23) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C5731i.m11281e(os.i, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8 A[LOOP:0: B:34:0x00b5->B:37:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[EDGE_INSN: B:40:0x00db->B:38:0x00db BREAK  A[LOOP:0: B:34:0x00b5->B:37:0x00d8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11282f(os.C5731i r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C5731i.m11282f(os.i, ww.c):java.lang.Object");
    }

    /* renamed from: g */
    public final void m11283g() {
        c0.m13502y(q0.m5340g(this), null, null, new C5724b(this, null, 2), 3);
    }

    /* renamed from: h */
    public final void m11284h(AbstractC4871f event) {
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(event, "event");
        if (event instanceof C4870e) {
            m11286j();
            return;
        }
        if (event instanceof C4867b) {
            do {
                m1Var = this.f28251i;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C4511b.m9347a((C4511b) value, null, false, false, false, 0, false, false, false, false, null, false, null, null, 53247)));
            return;
        }
        boolean z6 = event instanceof C4868c;
        C8810d c8810d = this.f28246d;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C5726d(this, event, interfaceC7559c, 0), 3);
            return;
        }
        if (event instanceof C4866a) {
            c0.m13502y(c8810d, null, null, new C5726d(this, event, interfaceC7559c, 1), 3);
            return;
        }
        if (!(event instanceof C4869d)) {
            throw new NoWhenBranchMatchedException();
        }
        C4869d c4869d = (C4869d) event;
        int i10 = c4869d.f24379a;
        int i11 = c4869d.f24380b;
        int i12 = c4869d.f24381c;
        wx.w0 w0Var = this.f28252j;
        if (((C4511b) w0Var.f39340a.getValue()).f22459i || ((C4511b) w0Var.f39340a.getValue()).f22452b || i10 + i12 < i11 - 5) {
            return;
        }
        m11283g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11285i(tq.EnumC7204p r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.C5731i.m11285i(tq.p, ww.c):java.lang.Object");
    }

    /* renamed from: j */
    public final void m11286j() {
        c0.m13502y(this.f28246d, null, null, new s0(4, this, null, ((C4511b) this.f28252j.f39340a.getValue()).f22458h), 3);
    }
}
