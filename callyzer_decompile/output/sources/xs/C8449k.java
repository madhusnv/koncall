package xs;

import android.content.Context;
import bq.C0724d;
import c9.C0908c;
import d7.q0;
import d7.w0;
import dr.C1768r;
import dr.C1769s;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import k4.C4001v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import lv.C4531c;
import nx.AbstractC5178p;
import o6.s0;
import pg.o6;
import po.C5984e;
import qw.a0;
import rw.AbstractC6663m;
import rw.C6668r;
import tb.C7105p;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wo.C8134s;
import ws.AbstractC8175p;
import ws.C8160a;
import ws.C8161b;
import ws.C8162c;
import ws.C8163d;
import ws.C8164e;
import ws.C8165f;
import ws.C8166g;
import ws.C8167h;
import ws.C8168i;
import ws.C8169j;
import ws.C8170k;
import ws.C8171l;
import ws.C8172m;
import ws.C8173n;
import ws.C8174o;
import ws.C8176q;
import ws.C8181v;
import ws.C8182w;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.h3;
import yv.C8791f;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.k */
/* loaded from: classes3.dex */
public final class C8449k extends w0 {

    /* renamed from: b */
    public final C4367l f41212b;

    /* renamed from: c */
    public final C8810d f41213c;

    /* renamed from: d */
    public final C8803r f41214d;

    /* renamed from: e */
    public final C9000c f41215e;

    /* renamed from: f */
    public final C8134s f41216f;

    /* renamed from: g */
    public final C7105p f41217g;

    /* renamed from: h */
    public final C8805t f41218h;

    /* renamed from: i */
    public final C0908c f41219i;

    /* renamed from: j */
    public final C4001v f41220j;

    /* renamed from: k */
    public final Context f41221k;

    /* renamed from: l */
    public final C5984e f41222l;

    /* renamed from: m */
    public final m1 f41223m;

    /* renamed from: n */
    public final wx.w0 f41224n;

    /* renamed from: o */
    public final C7806h f41225o;

    /* renamed from: p */
    public final C8203d f41226p;

    /* renamed from: q */
    public final C4531c f41227q;

    public C8449k(C4367l c4367l, C8810d c8810d, C8803r networkMonitorUtil, C9000c c9000c, C8134s c8134s, C7105p c7105p, C8805t c8805t, C0908c c0908c, C4001v c4001v, Context context, C5984e notificationUseCase) {
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        AbstractC4154l.m8923f(notificationUseCase, "notificationUseCase");
        this.f41212b = c4367l;
        this.f41213c = c8810d;
        this.f41214d = networkMonitorUtil;
        this.f41215e = c9000c;
        this.f41216f = c8134s;
        this.f41217g = c7105p;
        this.f41218h = c8805t;
        this.f41219i = c0908c;
        this.f41220j = c4001v;
        this.f41221k = context;
        this.f41222l = notificationUseCase;
        InterfaceC7559c interfaceC7559c = null;
        C8182w c8182w = new C8182w(null, null, null, null);
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C8181v(c6668r, null, null, false, c6668r, 0, false, false, false, false, false, false, false, false, 0, false, false, c8182w, 0, null));
        this.f41223m = m1VarM15372c;
        this.f41224n = new wx.w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f41225o = c7806hM11805a;
        this.f41226p = c1.m15389t(c7806hM11805a);
        final int i10 = 0;
        InterfaceC2139c interfaceC2139c = new InterfaceC2139c(this) { // from class: xs.a

            /* renamed from: b */
            public final /* synthetic */ C8449k f41168b;

            {
                this.f41168b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                Object value;
                switch (i10) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m1 m1Var = this.f41168b.f41223m;
                        while (true) {
                            Object value2 = m1Var.getValue();
                            m1 m1Var2 = m1Var;
                            if (m1Var2.m15397i(value2, C8181v.m15340a((C8181v) value2, null, null, null, false, null, 0, false, false, false, zBooleanValue, false, false, false, false, 0, false, false, null, 0, null, 4192255))) {
                                break;
                            } else {
                                m1Var = m1Var2;
                            }
                        }
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f41168b.f41223m;
                        do {
                            value = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, null, 0, false, false, false, false, zBooleanValue2, false, false, false, 0, false, false, null, 0, null, 4190207)));
                }
                return a0.f30746a;
            }
        };
        final int i11 = 1;
        InterfaceC2139c interfaceC2139c2 = new InterfaceC2139c(this) { // from class: xs.a

            /* renamed from: b */
            public final /* synthetic */ C8449k f41168b;

            {
                this.f41168b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                Object value;
                switch (i11) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m1 m1Var = this.f41168b.f41223m;
                        while (true) {
                            Object value2 = m1Var.getValue();
                            m1 m1Var2 = m1Var;
                            if (m1Var2.m15397i(value2, C8181v.m15340a((C8181v) value2, null, null, null, false, null, 0, false, false, false, zBooleanValue, false, false, false, false, 0, false, false, null, 0, null, 4192255))) {
                                break;
                            } else {
                                m1Var = m1Var2;
                            }
                        }
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f41168b.f41223m;
                        do {
                            value = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, null, 0, false, false, false, false, zBooleanValue2, false, false, false, 0, false, false, null, 0, null, 4190207)));
                }
                return a0.f30746a;
            }
        };
        C8447i c8447i = new C8447i(this, interfaceC7559c, i11);
        C8447i c8447i2 = new C8447i(this, interfaceC7559c, 0);
        C8442d c8442d = new C8442d(this, null, 1);
        C1769s c1769s = new C1769s(this, (InterfaceC7559c) null, 10);
        C8442d c8442d2 = new C8442d(this, null, 2);
        this.f41227q = new C4531c(Integer.valueOf(((C8181v) m1VarM15372c.getValue()).f39129o), interfaceC2139c, interfaceC2139c2, c8447i, c8447i2, new C8440b(this, null, 1), null, c8442d2, c8442d, c1769s, 1088);
        c0.m13502y(c8810d, null, null, new C8440b(this, null, 0), 3);
        c0.m13502y(q0.m5340g(this), null, null, new C8441c(this, interfaceC7559c, 0), 3);
        c0.m13502y(c8810d, null, null, new C8441c(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C0724d(this, interfaceC7559c, 19), 3);
        c0.m13502y(c8810d, null, null, new C8445g(this, true, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3 A[LOOP:0: B:57:0x0195->B:60:0x01e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5 A[EDGE_INSN: B:82:0x01d5->B:59:0x01d5 BREAK  A[LOOP:0: B:57:0x0195->B:60:0x01e3], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r42v0, types: [xs.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0180 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x020f -> B:63:0x01f2). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15749e(xs.C8449k r42, java.util.List r43, ww.AbstractC8193c r44) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs.C8449k.m15749e(xs.k, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r32.f41215e.m16471g(r2) == r3) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r1 r4 r10 r11 r12 r13
      0x0048: PHI (r1v48 java.lang.Object) = (r1v47 java.lang.Object), (r1v1 java.lang.Object) binds: [B:88:0x0203, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r4v15 int) = (r4v14 int), (r4v17 int) binds: [B:88:0x0203, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r10v11 rw.r) = (r10v10 rw.r), (r10v14 rw.r) binds: [B:88:0x0203, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r11v10 ws.v) = (r11v9 ws.v), (r11v13 ws.v) binds: [B:88:0x0203, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r12v18 java.lang.Object) = (r12v17 java.lang.Object), (r12v20 java.lang.Object) binds: [B:88:0x0203, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r13v5 wx.m1) = (r13v4 wx.m1), (r13v7 wx.m1) binds: [B:88:0x0203, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01db A[PHI: r1
      0x01db: PHI (r1v39 java.lang.Object) = (r1v37 java.lang.Object), (r1v1 java.lang.Object) binds: [B:82:0x01d7, B:18:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6 A[PHI: r1 r4
      0x01e6: PHI (r1v45 wx.m1) = (r1v44 wx.m1), (r1v50 wx.m1) binds: [B:86:0x01e3, B:91:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r4v14 int) = (r4v13 int), (r4v15 int) binds: [B:86:0x01e3, B:91:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026f A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0203 -> B:17:0x0048). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15750f(java.util.List r33, ww.AbstractC8193c r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs.C8449k.m15750f(java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15751g(ws.C8176q r32, ww.AbstractC8193c r33) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs.C8449k.m15751g(ws.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [ws.q] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ws.q] */
    /* renamed from: h */
    public final void m15752h(AbstractC8175p corruptCallEvent) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        C8181v c8181v;
        Object value8;
        Object value9;
        C8181v c8181v2;
        Object value10;
        Object value11;
        Object value12;
        C8181v c8181v3;
        Object value13;
        C8181v c8181v4;
        Object value14;
        AbstractC4154l.m8923f(corruptCallEvent, "corruptCallEvent");
        boolean z6 = corruptCallEvent instanceof C8167h;
        C8810d c8810d = this.f41213c;
        int i10 = 3;
        if (z6) {
            c0.m13502y(c8810d, null, null, new h3(this, corruptCallEvent, interfaceC7559c, 14), 3);
            return;
        }
        if (corruptCallEvent.equals(C8170k.f39093a)) {
            c0.m13502y(c8810d, null, null, new C8441c(this, interfaceC7559c, 5), 3);
            return;
        }
        if (corruptCallEvent instanceof C8169j) {
            c0.m13502y(c8810d, null, null, new s0(this, corruptCallEvent, interfaceC7559c, 28), 3);
            return;
        }
        boolean zEquals = corruptCallEvent.equals(C8171l.f39094a);
        m1 m1Var = this.f41223m;
        if (zEquals) {
            do {
                value14 = m1Var.getValue();
            } while (!m1Var.m15397i(value14, C8181v.m15340a((C8181v) value14, null, null, null, true, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194271)));
            c0.m13502y(c8810d, null, null, new C8441c(this, interfaceC7559c, 6), 3);
            return;
        }
        boolean z10 = corruptCallEvent instanceof C8174o;
        wx.w0 w0Var = this.f41224n;
        if (z10) {
            C8176q c8176q = ((C8181v) w0Var.f39340a.getValue()).f39116b;
            C8176q c8176qM15339a = c8176q != null ? C8176q.m15339a(c8176q, ((C8174o) corruptCallEvent).f39098a, null, null, null, null, null, null, 32759) : null;
            do {
                value13 = m1Var.getValue();
                c8181v4 = (C8181v) value13;
            } while (!m1Var.m15397i(value13, C8181v.m15340a(c8181v4, null, c8176qM15339a, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, C8182w.m15341a(c8181v4.f39132r, null, null, null, null, 11), 0, null, 3670007)));
            return;
        }
        if (corruptCallEvent instanceof C8173n) {
            C8176q c8176q2 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
            C8176q c8176qM15339a2 = c8176q2 != null ? C8176q.m15339a(c8176q2, null, ((C8173n) corruptCallEvent).f39097a, null, null, null, null, null, 32703) : null;
            do {
                value12 = m1Var.getValue();
                c8181v3 = (C8181v) value12;
            } while (!m1Var.m15397i(value12, C8181v.m15340a(c8181v3, null, c8176qM15339a2, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, C8182w.m15341a(c8181v3.f39132r, null, null, null, null, 13), 0, null, 3670007)));
            return;
        }
        if (corruptCallEvent instanceof C8172m) {
            C8172m c8172m = (C8172m) corruptCallEvent;
            String str = c8172m.f39095a;
            int iHashCode = str.hashCode();
            if (iHashCode != 108114) {
                if (iHashCode != 113745) {
                    if (iHashCode == 3208676 && str.equals("hour")) {
                        C8176q c8176q3 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
                        C8176q c8176qM15339a3 = c8176q3 != null ? C8176q.m15339a(c8176q3, null, null, null, c8172m.f39096b, null, null, null, 31743) : null;
                        do {
                            value11 = m1Var.getValue();
                        } while (!m1Var.m15397i(value11, C8181v.m15340a((C8181v) value11, null, c8176qM15339a3, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194295)));
                    }
                } else if (str.equals("sec")) {
                    C8176q c8176q4 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
                    C8176q c8176qM15339a4 = c8176q4 != null ? C8176q.m15339a(c8176q4, null, null, null, null, null, c8172m.f39096b, null, 28671) : null;
                    do {
                        value10 = m1Var.getValue();
                    } while (!m1Var.m15397i(value10, C8181v.m15340a((C8181v) value10, null, c8176qM15339a4, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194295)));
                }
            } else if (str.equals("min")) {
                C8176q c8176q5 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
                ?? M15339a = c8176q5 != null ? C8176q.m15339a(c8176q5, null, null, null, null, c8172m.f39096b, null, null, 30719) : null;
                do {
                    value8 = m1Var.getValue();
                } while (!m1Var.m15397i(value8, C8181v.m15340a((C8181v) value8, null, M15339a, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194295)));
            }
            m15753i();
            do {
                value9 = m1Var.getValue();
                c8181v2 = (C8181v) value9;
            } while (!m1Var.m15397i(value9, C8181v.m15340a(c8181v2, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, !AbstractC5178p.m10101L(c8172m.f39096b) ? C8182w.m15341a(c8181v2.f39132r, null, null, null, null, 7) : c8181v2.f39132r, 0, null, 3670015)));
            return;
        }
        if (corruptCallEvent.equals(C8164e.f39087a)) {
            do {
                value7 = m1Var.getValue();
                c8181v = (C8181v) value7;
            } while (!m1Var.m15397i(value7, C8181v.m15340a(c8181v, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, C8182w.m15341a(c8181v.f39132r, null, null, null, null, 1), 0, null, 3670015)));
            return;
        }
        if (corruptCallEvent instanceof C8166g) {
            m15753i();
            C8176q c8176q6 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
            if (c8176q6 != null) {
                c0.m13502y(c8810d, null, null, new C1768r(this, c8176q6, interfaceC7559c, 10), 3);
                return;
            }
            return;
        }
        if (corruptCallEvent instanceof C8168i) {
            do {
                value6 = m1Var.getValue();
            } while (!m1Var.m15397i(value6, C8181v.m15340a((C8181v) value6, null, null, null, false, null, 0, ((C8168i) corruptCallEvent).f39091a, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194047)));
            return;
        }
        if (corruptCallEvent instanceof C8160a) {
            C8160a c8160a = (C8160a) corruptCallEvent;
            if (c8160a.f39083a) {
                c0.m13502y(c8810d, null, null, new C8441c(this, interfaceC7559c, 2), 3);
            }
            do {
                value5 = m1Var.getValue();
            } while (!m1Var.m15397i(value5, C8181v.m15340a((C8181v) value5, null, null, null, false, null, 0, false, c8160a.f39083a, false, false, false, false, false, false, 0, false, false, null, 0, null, 4193791)));
            return;
        }
        if (!corruptCallEvent.equals(C8161b.f39084a)) {
            if (corruptCallEvent.equals(C8162c.f39085a)) {
                c0.m13502y(c8810d, null, null, new C8441c(this, interfaceC7559c, i10), 3);
                return;
            }
            if (corruptCallEvent.equals(C8163d.f39086a)) {
                c0.m13502y(q0.m5340g(this), null, null, new C8441c(this, interfaceC7559c, 4), 3);
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C8181v.m15340a((C8181v) value2, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 3932159)));
                return;
            } else {
                if (!corruptCallEvent.equals(C8165f.f39088a)) {
                    throw new NoWhenBranchMatchedException();
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 2097151)));
                return;
            }
        }
        do {
            value3 = m1Var.getValue();
        } while (!m1Var.m15397i(value3, C8181v.m15340a((C8181v) value3, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4193279)));
        ArrayList arrayListD0 = AbstractC6663m.d0(((C8181v) w0Var.f39340a.getValue()).f39119e);
        int size = arrayListD0.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListD0.get(i11);
            i11++;
            C8176q c8176q7 = (C8176q) obj;
            String str2 = c8176q7.f39102d;
            if (str2 == null || AbstractC5178p.m10101L(str2)) {
                if (((C8181v) w0Var.f39340a.getValue()).f39116b != null) {
                    C8791f c8791f = C8791f.f42457a;
                    C8176q c8176q8 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
                    if (C8791f.m16171d(c8176q8 != null ? c8176q8.f39102d : null)) {
                        int iIndexOf = arrayListD0.indexOf(c8176q7);
                        C8176q c8176q9 = (C8176q) arrayListD0.get(arrayListD0.indexOf(c8176q7));
                        C8176q c8176q10 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
                        AbstractC4154l.m8920c(c8176q10);
                        arrayListD0.set(iIndexOf, C8176q.m15339a(c8176q9, c8176q10.f39102d, null, null, null, null, null, C6668r.f31943a, 24567));
                    }
                }
            }
        }
        do {
            value4 = m1Var.getValue();
        } while (!m1Var.m15397i(value4, C8181v.m15340a((C8181v) value4, null, null, null, false, arrayListD0, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194239)));
    }

    /* renamed from: i */
    public final void m15753i() {
        m1 m1Var;
        Object value;
        StringBuilder sb2 = new StringBuilder();
        C8791f c8791f = C8791f.f42457a;
        wx.w0 w0Var = this.f41224n;
        C8176q c8176q = ((C8181v) w0Var.f39340a.getValue()).f39116b;
        if (C8791f.m16171d(c8176q != null ? c8176q.f39109k : null)) {
            C8176q c8176q2 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
            sb2.append((c8176q2 != null ? c8176q2.f39109k : null) + "h ");
        }
        C8176q c8176q3 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
        if (C8791f.m16171d(c8176q3 != null ? c8176q3.f39110l : null)) {
            C8176q c8176q4 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
            sb2.append((c8176q4 != null ? c8176q4.f39110l : null) + "m ");
        }
        C8176q c8176q5 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
        if (C8791f.m16171d(c8176q5 != null ? c8176q5.f39111m : null)) {
            C8176q c8176q6 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
            sb2.append((c8176q6 != null ? c8176q6.f39111m : null) + "s");
        }
        String string = sb2.toString();
        C8176q c8176q7 = ((C8181v) w0Var.f39340a.getValue()).f39116b;
        C8176q c8176qM15339a = c8176q7 != null ? C8176q.m15339a(c8176q7, null, null, string, null, null, null, null, 32639) : null;
        do {
            m1Var = this.f41223m;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C8181v.m15340a((C8181v) value, null, c8176qM15339a, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194295)));
    }
}
