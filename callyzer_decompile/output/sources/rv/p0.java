package rv;

import a9.C0073l;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import cj.C0979e;
import cm.C0983a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import d7.w0;
import eo.C2082h;
import io.C3328c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kn.C4130j;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4802m;
import nn.C5113e;
import od.C5338b;
import og.nd;
import og.wc;
import pg.f9;
import pg.o6;
import qn.C6263l;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import sv.C6954b;
import sv.C6955c;
import ug.C7451v;
import ug.C7452w;
import ug.C7453x;
import ug.C7454y;
import ug.C7455z;
import uo.C7476a;
import uo.C7481f;
import uo.C7485j;
import uo.C7487l;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.d4;
import yn.C8716n;
import yv.AbstractC8804s;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 extends w0 {

    /* renamed from: A */
    public final C7806h f31863A;

    /* renamed from: B */
    public final C8203d f31864B;

    /* renamed from: C */
    public final C7806h f31865C;

    /* renamed from: D */
    public final C8203d f31866D;

    /* renamed from: E */
    public final C7806h f31867E;

    /* renamed from: F */
    public final C8203d f31868F;

    /* renamed from: G */
    public final C6366p f31869G;

    /* renamed from: b */
    public final Context f31870b;

    /* renamed from: c */
    public final C5113e f31871c;

    /* renamed from: d */
    public final C7454y f31872d;

    /* renamed from: e */
    public final C7455z f31873e;

    /* renamed from: f */
    public final C7451v f31874f;

    /* renamed from: g */
    public final C7453x f31875g;

    /* renamed from: h */
    public final C7452w f31876h;

    /* renamed from: i */
    public final C3328c f31877i;

    /* renamed from: j */
    public final wx.w0 f31878j;

    /* renamed from: k */
    public final d4 f31879k;

    /* renamed from: l */
    public final C7481f f31880l;

    /* renamed from: m */
    public final C7476a f31881m;

    /* renamed from: n */
    public final C8716n f31882n;

    /* renamed from: o */
    public final C7485j f31883o;

    /* renamed from: p */
    public final C6263l f31884p;

    /* renamed from: q */
    public final C0979e f31885q;

    /* renamed from: r */
    public final C8805t f31886r;

    /* renamed from: s */
    public final C7487l f31887s;

    /* renamed from: t */
    public final C9000c f31888t;

    /* renamed from: u */
    public final C8810d f31889u;

    /* renamed from: v */
    public final C2082h f31890v;

    /* renamed from: w */
    public final C0073l f31891w;

    /* renamed from: x */
    public final String f31892x;

    /* renamed from: y */
    public final m1 f31893y;

    /* renamed from: z */
    public final m1 f31894z;

    public p0(Context context, C5113e c5113e, C7454y c7454y, C7455z c7455z, C7451v c7451v, C7453x c7453x, C7452w c7452w, C3328c c3328c, wx.w0 w0Var, d4 numberRepository, C7481f simVerificationUseCase, C7476a callDetailVerificationUseCase, C8716n c8716n, C7485j c7485j, C6263l c6263l, C0979e c0979e, C8805t c8805t, C7487l c7487l, C9000c c9000c, C8810d c8810d, C2082h c2082h, C0073l c0073l) {
        AbstractC4154l.m8923f(numberRepository, "numberRepository");
        AbstractC4154l.m8923f(simVerificationUseCase, "simVerificationUseCase");
        AbstractC4154l.m8923f(callDetailVerificationUseCase, "callDetailVerificationUseCase");
        this.f31870b = context;
        this.f31871c = c5113e;
        this.f31872d = c7454y;
        this.f31873e = c7455z;
        this.f31874f = c7451v;
        this.f31875g = c7453x;
        this.f31876h = c7452w;
        this.f31877i = c3328c;
        this.f31878j = w0Var;
        this.f31879k = numberRepository;
        this.f31880l = simVerificationUseCase;
        this.f31881m = callDetailVerificationUseCase;
        this.f31882n = c8716n;
        this.f31883o = c7485j;
        this.f31884p = c6263l;
        this.f31885q = c0979e;
        this.f31886r = c8805t;
        this.f31887s = c7487l;
        this.f31888t = c9000c;
        this.f31889u = c8810d;
        this.f31890v = c2082h;
        this.f31891w = c0073l;
        this.f31892x = "ConnectSIMViewModel";
        q0 q0Var = q0.LOADING;
        InterfaceC7559c interfaceC7559c = null;
        C0983a c0983a = new C0983a("", 14, null, null);
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new h0(q0Var, new C6954b("", null, "", null, "", "", null, "", null, "", null, c6668r, c6668r, null, "Connect", false, 0, null, 0, false, null, null, false, false, false, true, false, c0983a, null, false, c6668r), true, new C6361k(null, null)));
        this.f31893y = m1VarM15372c;
        this.f31894z = m1VarM15372c;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f31863A = c7806hM11805a;
        this.f31864B = c1.m15389t(c7806hM11805a);
        C7806h c7806hM11805a2 = o6.m11805a(0, null, null, 7);
        this.f31865C = c7806hM11805a2;
        this.f31866D = c1.m15389t(c7806hM11805a2);
        C7806h c7806hM11805a3 = o6.m11805a(0, null, null, 7);
        this.f31867E = c7806hM11805a3;
        this.f31868F = c1.m15389t(c7806hM11805a3);
        nd.m10782c(new C5338b(14));
        this.f31869G = nd.m10782c(new C5338b(15));
        tx.c0.m13502y(c8810d, null, null, new a0(this, interfaceC7559c, 0), 3);
        tx.c0.m13502y(c8810d, null, null, new a0(this, interfaceC7559c, 1), 3);
    }

    /* renamed from: e */
    public static final int m12674e(p0 p0Var) {
        Context context = p0Var.f31870b;
        int i10 = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i10 >= 33 ? context.getPackageManager().getPackageInfo("com.websoptimization.callyzerbiz", PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo("com.websoptimization.callyzerbiz", 0);
        return i10 >= 28 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r2.m7652g(r0, r4) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12675f(rv.p0 r32, mm.C4802m r33, ww.AbstractC8193c r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.p0.m12675f(rv.p0, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: g */
    public static final void m12676g(p0 p0Var) {
        try {
            String str = AbstractC8804s.f42473a;
            C0983a c0983aM16223b = AbstractC8804s.m16223b(p0Var.f31870b);
            m1 m1Var = p0Var.f31893y;
            while (true) {
                Object value = m1Var.getValue();
                h0 h0Var = (h0) value;
                m1 m1Var2 = m1Var;
                C0983a c0983a = c0983aM16223b;
                if (m1Var2.m15397i(value, h0.m12673a(h0Var, null, C6954b.m13206a(h0Var.f31837b, null, null, null, null, c0983aM16223b.f5813b, c0983aM16223b.f5815d, null, null, null, null, null, null, null, null, 0, null, 0, false, null, false, false, false, c0983a, null, null, -134217777), false, null, 13))) {
                    return;
                }
                m1Var = m1Var2;
                c0983aM16223b = c0983a;
            }
        } catch (Exception e2) {
            p0Var.f31886r.m16235j(e2);
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12677h(rv.p0 r2, java.util.List r3, ww.AbstractC8199i r4) {
        /*
            eo.h r2 = r2.f31890v
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L14
            tq.p r3 = tq.EnumC7204p.DEFAULT
            java.lang.Object r2 = r2.m5799h(r3, r4)
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r2 != r3) goto L4e
            return r2
        L14:
            int r0 = r3.size()
            r1 = 2
            if (r0 != r1) goto L4e
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L22
            goto L43
        L22:
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r3.next()
            sv.c r0 = (sv.C6955c) r0
            mm.m r0 = r0.f33680a
            boolean r0 = r0.f23898j
            if (r0 != 0) goto L26
            tq.p r3 = tq.EnumC7204p.DEFAULT
            java.lang.Object r2 = r2.m5799h(r3, r4)
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r2 != r3) goto L4e
            return r2
        L43:
            tq.p r3 = tq.EnumC7204p.ALL
            java.lang.Object r2 = r2.m5799h(r3, r4)
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r2 != r3) goto L4e
            return r2
        L4e:
            qw.a0 r2 = qw.a0.f30746a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.p0.m12677h(rv.p0, java.util.List, ww.i):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12678i(rv.p0 r34, java.lang.String r35, ww.AbstractC8193c r36) {
        /*
            r0 = r34
            r1 = r36
            boolean r2 = r1 instanceof rv.o0
            if (r2 == 0) goto L17
            r2 = r1
            rv.o0 r2 = (rv.o0) r2
            int r3 = r2.f31861d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f31861d = r3
            goto L1c
        L17:
            rv.o0 r2 = new rv.o0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f31859b
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f31861d
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            java.lang.String r2 = r2.f31858a
            og.od.m10798c(r1)
            goto L49
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            og.od.m10798c(r1)
            uo.f r1 = r0.f31880l
            r4 = r35
            r2.f31858a = r4
            r2.f31861d = r5
            r6 = 0
            java.lang.Object r1 = r1.m14283d(r6, r2)
            if (r1 != r3) goto L48
            return r3
        L48:
            r2 = r4
        L49:
            wx.m1 r1 = r0.f31893y
        L4b:
            java.lang.Object r3 = r1.getValue()
            r6 = r3
            rv.h0 r6 = (rv.h0) r6
            sv.b r7 = r6.f31837b
            r32 = 0
            r33 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            sv.b r8 = sv.C6954b.m13206a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r11 = 13
            r7 = 0
            r9 = 0
            rv.h0 r4 = rv.h0.m12673a(r6, r7, r8, r9, r10, r11)
            boolean r3 = r1.m15397i(r3, r4)
            if (r3 == 0) goto L4b
            uo.a r1 = r0.f31881m
            ug.j r1 = r1.f36090c
            java.lang.Object r1 = r1.f35538c
            wx.m1 r1 = (wx.m1) r1
            r1.getClass()
            r3 = 0
            im.m1 r4 = im.m1.f17567a
            r1.m15399k(r3, r4)
            android.content.Context r0 = r0.f31870b
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r5)
            r0.show()
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.p0.m12678i(rv.p0, java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public static int m12679k(ArrayList arrayList) {
        int i10 = 0;
        if (arrayList.size() == 2) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (!((C6955c) obj).f33681b) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        if (arrayList.isEmpty()) {
            return 1;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (!((C6955c) obj2).f33681b) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: j */
    public final void m12680j(q0 q0Var) {
        Object obj;
        h0 h0Var;
        C6954b c6954bM12686q;
        List list;
        int i10;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        String str4;
        Integer num3;
        String str5;
        Integer num4;
        String str6;
        Integer num5;
        List list2;
        String str7;
        int i11;
        C4802m c4802m;
        int i12;
        boolean z6;
        String str8;
        boolean z10;
        boolean z11;
        boolean z12;
        C0983a c0983a;
        AppSettings appSettings;
        p0 p0Var = this;
        ArrayList arrayListD0 = AbstractC6663m.d0(((h0) p0Var.f31894z.getValue()).f31837b.f33665l);
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(arrayListD0, 10));
        int size = arrayListD0.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayListD0.get(i13);
            i13++;
            C6955c c6955c = (C6955c) obj2;
            arrayList.add(C6955c.m13207a(c6955c, null, false, c6955c.f33680a.f23898j, 3));
        }
        while (true) {
            m1 m1Var = p0Var.f31893y;
            Object value = m1Var.getValue();
            h0 h0Var2 = (h0) value;
            if (q0Var == q0.DUAL_SIM) {
                list = null;
                i10 = -2049;
                str = null;
                c6954bM12686q = p0Var.m12686q(-1);
                num = null;
                str2 = null;
                num2 = null;
                str3 = null;
                str4 = null;
                num3 = null;
                str5 = null;
                num4 = null;
                str6 = null;
                num5 = null;
                list2 = null;
                str7 = null;
                i11 = 0;
                c4802m = null;
                i12 = 0;
                z6 = false;
                str8 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                c0983a = null;
                obj = value;
                appSettings = null;
                h0Var = h0Var2;
            } else {
                obj = value;
                h0Var = h0Var2;
                c6954bM12686q = h0Var.f31837b;
                list = null;
                i10 = -2049;
                str = null;
                num = null;
                str2 = null;
                num2 = null;
                str3 = null;
                str4 = null;
                num3 = null;
                str5 = null;
                num4 = null;
                str6 = null;
                num5 = null;
                list2 = null;
                str7 = null;
                i11 = 0;
                c4802m = null;
                i12 = 0;
                z6 = false;
                str8 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                c0983a = null;
                appSettings = null;
            }
            if (m1Var.m15397i(obj, h0.m12673a(h0Var, q0Var, C6954b.m13206a(c6954bM12686q, str, num, str2, num2, str3, str4, num3, str5, num4, str6, num5, arrayList, list2, str7, i11, c4802m, i12, z6, str8, z10, z11, z12, c0983a, appSettings, list, i10), false, null, 12))) {
                return;
            } else {
                p0Var = this;
            }
        }
    }

    /* renamed from: l */
    public final void m12681l() {
        Object lowerCase;
        C4802m c4802m = ((h0) this.f31894z.getValue()).f31837b.f33671r;
        if (c4802m == null) {
            return;
        }
        String str = c4802m.f23891c;
        int i10 = c4802m.f23892d;
        if (!c4802m.f23898j) {
            return;
        }
        String str2 = AbstractC8804s.f42473a;
        String strM16222a = AbstractC8804s.m16222a("+" + i10 + str);
        ArrayList arrayListM11031a = wc.m11031a();
        int size = arrayListM11031a.size();
        int i11 = 0;
        while (true) {
            lowerCase = null;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayListM11031a.get(i11);
            i11++;
            String str3 = ((C0983a) obj).f5815d;
            if (strM16222a != null) {
                lowerCase = strM16222a.toLowerCase(Locale.ROOT);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            }
            if (AbstractC4154l.m8918a(str3, lowerCase)) {
                lowerCase = obj;
                break;
            }
        }
        C0983a c0983aM16223b = (C0983a) lowerCase;
        if (c0983aM16223b == null) {
            String str4 = AbstractC8804s.f42473a;
            c0983aM16223b = AbstractC8804s.m16223b(this.f31870b);
        }
        while (true) {
            m1 m1Var = this.f31893y;
            Object value = m1Var.getValue();
            h0 h0Var = (h0) value;
            C0983a c0983a = c0983aM16223b;
            if (m1Var.m15397i(value, h0.m12673a(h0Var, null, C6954b.m13206a(h0Var.f31837b, String.valueOf(c4802m.f23896h), null, String.valueOf(str), null, AbstractC4801l.m9730d(i10, "+"), c0983aM16223b.f5815d, null, c4802m.f23904p, null, String.valueOf(c4802m.f23897i), null, null, null, null, 0, null, 0, false, null, false, false, false, c0983a, null, null, -134218422), false, null, 13))) {
                return;
            } else {
                c0983aM16223b = c0983a;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0607  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12682m(rv.AbstractC6650z r71) {
        /*
            Method dump skipped, instructions count: 3058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.p0.m12682m(rv.z):void");
    }

    /* renamed from: n */
    public final void m12683n() {
        m1 m1Var;
        Object value;
        h0 h0Var;
        do {
            m1Var = this.f31893y;
            value = m1Var.getValue();
            h0Var = (h0) value;
        } while (!m1Var.m15397i(value, h0.m12673a(h0Var, null, C6954b.m13206a(h0Var.f31837b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0, false, null, false, false, false, null, null, null, -536870913), false, null, 13)));
    }

    /* renamed from: o */
    public final void m12684o() {
        m1 m1Var = this.f31894z;
        ArrayList arrayListD0 = AbstractC6663m.d0(((h0) m1Var.getValue()).f31837b.f33666m);
        for (C4130j c4130j : ((h0) m1Var.getValue()).f31837b.f33666m) {
            if (c4130j.f21083c) {
                arrayListD0.remove(c4130j);
            }
        }
        while (true) {
            m1 m1Var2 = this.f31893y;
            Object value = m1Var2.getValue();
            h0 h0Var = (h0) value;
            ArrayList arrayList = arrayListD0;
            if (m1Var2.m15397i(value, h0.m12673a(h0Var, null, C6954b.m13206a(h0Var.f31837b, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, 0, null, 0, false, null, false, false, false, null, null, null, -4097), false, null, 13))) {
                return;
            } else {
                arrayListD0 = arrayList;
            }
        }
    }

    /* renamed from: p */
    public final void m12685p() {
        p0 p0Var = this;
        String str = AbstractC8804s.f42473a;
        C0983a c0983aM16223b = AbstractC8804s.m16223b(p0Var.f31870b);
        while (true) {
            m1 m1Var = p0Var.f31893y;
            Object value = m1Var.getValue();
            h0 h0Var = (h0) value;
            C0983a c0983a = c0983aM16223b;
            if (m1Var.m15397i(value, h0.m12673a(h0Var, null, C6954b.m13206a(h0Var.f31837b, "", null, "", null, c0983aM16223b.f5813b, c0983aM16223b.f5815d, null, "", null, null, null, null, null, null, 0, null, 0, false, null, false, false, false, c0983a, null, null, -137930240), false, null, 13))) {
                return;
            }
            p0Var = this;
            c0983aM16223b = c0983a;
        }
    }

    /* renamed from: q */
    public final C6954b m12686q(int i10) {
        int i11 = i10;
        m1 m1Var = this.f31894z;
        try {
            C6954b c6954b = ((h0) m1Var.getValue()).f31837b;
            List list = c6954b.f33665l;
            Context context = this.f31870b;
            int i12 = 0;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((C6955c) it.next()).f33681b) {
                        if (i11 == -1) {
                            if (list == null || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (((C6955c) it2.next()).f33681b) {
                                    }
                                }
                            }
                            return C6954b.m13206a(c6954b, null, null, null, null, null, null, null, null, null, null, null, null, null, f9.m11628b(context, R.string.connect), 0, ((C6955c) list.get(0)).f33680a, 0, false, null, false, false, false, null, null, null, -212993);
                        }
                        if (i11 == -1) {
                            Iterator it3 = list.iterator();
                            int i13 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i13 = -1;
                                    break;
                                }
                                if (((C6955c) it3.next()).f33680a.f23898j) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 != -1) {
                                return C6954b.m13206a(c6954b, null, null, null, null, null, null, null, null, null, null, null, null, null, context.getString(R.string.continue_with_sim, Integer.valueOf(i13 + 1)), i13, ((C6955c) list.get(i13)).f33680a, 0, false, null, false, false, false, null, null, null, -212993);
                            }
                        }
                        if (i11 == -1) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    i11 = -1;
                                    break;
                                }
                                if (((C6955c) it4.next()).f33681b) {
                                    i11 = i12;
                                    break;
                                }
                                i12++;
                            }
                        }
                        return C6954b.m13206a(c6954b, null, null, null, null, null, null, null, null, null, null, null, null, null, context.getString(R.string.continue_with_sim, Integer.valueOf(i11 + 1)), i11, ((C6955c) list.get(i11)).f33680a, 0, false, null, false, false, false, null, null, null, -212993);
                    }
                }
            }
            Iterator it5 = list.iterator();
            int i14 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (!((C6955c) it5.next()).f33680a.f23898j) {
                    break;
                }
                i14++;
            }
            if (i14 != -1) {
                i12 = i14;
            }
            return C6954b.m13206a(c6954b, null, null, null, null, null, null, null, null, null, null, null, null, null, f9.m11628b(context, R.string.connect_with_both_sim), i12, ((C6955c) list.get(i12)).f33680a, 0, false, null, false, false, false, null, null, null, -212993);
        } catch (Exception e2) {
            this.f31886r.m16234i(this.f31892x, e2);
            return ((h0) m1Var.getValue()).f31837b;
        }
    }
}
