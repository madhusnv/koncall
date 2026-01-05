package yp;

import android.content.Context;
import android.net.Uri;
import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0724d;
import bq.C0732l;
import bq.C0733m;
import c9.C0927v;
import com.websoptimization.callyzerbiz.R;
import dr.C1768r;
import eo.C2082h;
import ex.InterfaceC2139c;
import im.C3299a;
import im.C3300b;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import jp.AbstractC3837r;
import jp.C3829j;
import jp.C3830k;
import jp.C3831l;
import jp.C3832m;
import jp.C3833n;
import jp.C3834o;
import jp.C3835p;
import jp.C3836q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4531c;
import nn.C5113e;
import no.C5122i;
import og.pe;
import pg.f9;
import pg.o6;
import pn.C5979e;
import qp.C6267d;
import qp.C6273j;
import qr.C6293q;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qr.g0;
import qw.C6363m;
import qw.C6364n;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6666p;
import rw.C6668r;
import sr.C6911b;
import tq.EnumC7204p;
import tx.c0;
import tx.m0;
import ur.AbstractC7523p;
import ur.AbstractC7524q;
import ur.AbstractC7529v;
import ur.C7508a;
import ur.C7509b;
import ur.C7514g;
import ur.C7518k;
import ur.C7519l;
import ur.C7520m;
import ur.C7522o;
import ur.C7530w;
import ur.C7531x;
import ur.i0;
import ur.p0;
import ur.q0;
import ur.r0;
import ur.u0;
import uw.C7565i;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.h3;
import xp.C8424e;
import xp.C8426g;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;
import zk.C8989c;
import zp.C9005e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.o */
/* loaded from: classes3.dex */
public final class C8735o extends AbstractC7524q {

    /* renamed from: A */
    public final C6293q f42265A;

    /* renamed from: B */
    public final g0 f42266B;

    /* renamed from: f */
    public final Context f42267f;

    /* renamed from: g */
    public final mn.g0 f42268g;

    /* renamed from: h */
    public final C0927v f42269h;

    /* renamed from: i */
    public final C8810d f42270i;

    /* renamed from: j */
    public final C2082h f42271j;

    /* renamed from: k */
    public final C8805t f42272k;

    /* renamed from: l */
    public final C5979e f42273l;

    /* renamed from: m */
    public final C5113e f42274m;

    /* renamed from: n */
    public final C5122i f42275n;

    /* renamed from: o */
    public final m1 f42276o;

    /* renamed from: p */
    public final w0 f42277p;

    /* renamed from: q */
    public final ArrayList f42278q;

    /* renamed from: r */
    public final C7806h f42279r;

    /* renamed from: s */
    public final C8203d f42280s;

    /* renamed from: t */
    public boolean f42281t;

    /* renamed from: u */
    public final m1 f42282u;

    /* renamed from: v */
    public final m1 f42283v;

    /* renamed from: w */
    public final C4531c f42284w;

    /* renamed from: x */
    public final C6294r f42285x;

    /* renamed from: y */
    public final C6296t f42286y;

    /* renamed from: z */
    public final C6295s f42287z;

    public C8735o(Context context, mn.g0 g0Var, C0927v c0927v, C8810d c8810d, C2082h c2082h, C8805t c8805t, C5979e c5979e, C5113e c5113e, C5122i noteUseCase) {
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        this.f42267f = context;
        this.f42268g = g0Var;
        this.f42269h = c0927v;
        this.f42270i = c8810d;
        this.f42271j = c2082h;
        this.f42272k = c8805t;
        this.f42273l = c5979e;
        this.f42274m = c5113e;
        this.f42275n = noteUseCase;
        LocalDate localDateNow = LocalDate.now();
        LocalTime localTime = LocalTime.MIN;
        LocalDateTime localDateTimeOf = LocalDateTime.of(localDateNow, localTime);
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        LocalDateTime localDateTimeOf2 = LocalDateTime.of(LocalDate.now(), localTime);
        AbstractC4154l.m8922e(localDateTimeOf2, "of(...)");
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeM16209r = C8800o.m16209r();
        LocalDateTime localDateTimeM16201j = C8800o.m16201j();
        InterfaceC7559c interfaceC7559c = null;
        C6267d c6267d = new C6267d(null, null, null);
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C6273j(c6668r, false, false, false, false, true, 0, c6668r, c6668r, localDateTimeOf, localDateTimeOf2, false, enumC7204p, localDateTimeM16209r, localDateTimeM16201j, c6668r, false, false, false, null, c6267d, false));
        this.f42276o = m1VarM15372c;
        this.f42277p = new w0(m1VarM15372c);
        this.f42278q = new ArrayList();
        final int i10 = 0;
        int i11 = 7;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f42279r = c7806hM11805a;
        this.f42280s = c1.m15389t(c7806hM11805a);
        InterfaceC2139c interfaceC2139c = new InterfaceC2139c(this) { // from class: yp.a

            /* renamed from: b */
            public final /* synthetic */ C8735o f42192b;

            {
                this.f42192b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                Object value;
                switch (i10) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m1 m1Var = this.f42192b.f42276o;
                        while (true) {
                            Object value2 = m1Var.getValue();
                            m1 m1Var2 = m1Var;
                            if (m1Var2.m15397i(value2, C6273j.m12277a((C6273j) value2, null, false, false, zBooleanValue, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194295))) {
                                break;
                            } else {
                                m1Var = m1Var2;
                            }
                        }
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f42192b.f42276o;
                        do {
                            value = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value, C6273j.m12277a((C6273j) value, null, false, false, false, zBooleanValue2, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194287)));
                }
                return a0.f30746a;
            }
        };
        m1 m1VarM15372c2 = c1.m15372c(Boolean.FALSE);
        this.f42282u = m1VarM15372c2;
        this.f42283v = m1VarM15372c2;
        final int i12 = 1;
        InterfaceC2139c interfaceC2139c2 = new InterfaceC2139c(this) { // from class: yp.a

            /* renamed from: b */
            public final /* synthetic */ C8735o f42192b;

            {
                this.f42192b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                Object value;
                switch (i12) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m1 m1Var = this.f42192b.f42276o;
                        while (true) {
                            Object value2 = m1Var.getValue();
                            m1 m1Var2 = m1Var;
                            if (m1Var2.m15397i(value2, C6273j.m12277a((C6273j) value2, null, false, false, zBooleanValue, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194295))) {
                                break;
                            } else {
                                m1Var = m1Var2;
                            }
                        }
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f42192b.f42276o;
                        do {
                            value = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value, C6273j.m12277a((C6273j) value, null, false, false, false, zBooleanValue2, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194287)));
                }
                return a0.f30746a;
            }
        };
        C8727g c8727g = new C8727g(this, interfaceC7559c, i10);
        C8730j c8730j = new C8730j(this, null, 0);
        this.f42284w = new C4531c(Integer.valueOf(((C6273j) m1VarM15372c.getValue()).f30450g), interfaceC2139c, interfaceC2139c2, new C8730j(this, null, 1), c8730j, c8727g, null, new C8426g(this, interfaceC7559c, i11), new C8728h(this, interfaceC7559c, i12), new C8731k(this, null), 1088);
        this.f42285x = new C6294r(C2082h.m5793b(), new C8424e(this, 4), context);
        this.f42286y = new C6296t(C2082h.m5795d(), new C8424e(this, 5), context);
        this.f42287z = new C6295s(C2082h.m5794c(), context, new C8424e(this, 6), new C8424e(this, i11));
        this.f42265A = new C6293q(C7531x.m14296a(C2082h.f9741e, null, 3), new C8424e(this, 8), context);
        this.f42266B = new g0(f9.m11628b(context, R.string.sort_by), new C7530w(1, pe.m10835j(p0.f36251c, q0.f36256c, u0.f36264c, r0.f36258c), false), context);
        c0.m13502y(c8810d, null, null, new C0732l(this, interfaceC7559c, 18), 3);
        c0.m13502y(c8810d, null, null, new C0724d((d7.w0) this, interfaceC7559c, 20), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16112h(yp.C8735o r13, int r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8735o.m16112h(yp.o, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16113i(yp.C8735o r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8735o.m16113i(yp.o, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16114j(yp.C8735o r13, int r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8735o.m16114j(yp.o, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16115k(yp.C8735o r29, ww.AbstractC8193c r30) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8735o.m16115k(yp.o, ww.c):java.lang.Object");
    }

    /* renamed from: l */
    public static final void m16116l(C8735o c8735o, List list) {
        if (list.size() > 1) {
            AbstractC6666p.m12771u(list, new C6911b(11));
        }
        m1 m1Var = c8735o.f36252b;
        while (true) {
            Object value = m1Var.getValue();
            List list2 = list;
            if (m1Var.m15397i(value, i0.m14293a((i0) value, list2, null, null, null, null, 30))) {
                return;
            } else {
                list = list2;
            }
        }
    }

    @Override // ur.AbstractC7524q
    /* renamed from: e */
    public final void mo2033e(AbstractC7523p event) {
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C7518k;
        C8810d c8810d = this.f42270i;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C0732l(event, this, interfaceC7559c, 19, false), 3);
            return;
        }
        if (event instanceof C7514g) {
            C7514g c7514g = (C7514g) event;
            int i10 = c7514g.f36216a;
            int i11 = AbstractC8722b.f42193a[c7514g.f36217b.ordinal()];
            if (i11 == 1) {
                this.f42287z.m12320q(i10);
                return;
            } else if (i11 == 2) {
                this.f42285x.m12316q(i10);
                return;
            } else {
                if (i11 != 3) {
                    return;
                }
                this.f42286y.m12324q(i10);
                return;
            }
        }
        if (event.equals(C7508a.f36203a)) {
            m14294g();
            return;
        }
        if (event instanceof C7509b) {
            c0.m13502y(c8810d, null, null, new C0733m((AbstractC7524q) this, interfaceC7559c, 13, false), 3);
            return;
        }
        boolean z10 = event instanceof C7519l;
        C6293q c6293q = this.f42265A;
        if (z10) {
            c6293q.m12311p(((C7519l) event).f36237a);
            return;
        }
        if (!(event instanceof C7520m)) {
            if (event instanceof C7522o) {
                this.f42266B.m12283c(((C7522o) event).f36247a);
                c0.m13502y(c8810d, null, null, new C8723c(this, interfaceC7559c, 6), 3);
                return;
            }
            return;
        }
        c6293q.m12312q(((C7520m) event).f36240a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM12310o = c6293q.m12310o();
        int size = arrayListM12310o.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListM12310o.get(i12);
            i12++;
            arrayList.add(((AbstractC7529v) obj).f36267c);
        }
        while (true) {
            m1 m1Var = this.f42276o;
            Object value = m1Var.getValue();
            ArrayList arrayList2 = arrayList;
            if (m1Var.m15397i(value, C6273j.m12277a((C6273j) value, null, false, false, false, false, false, 0, arrayList2, null, false, null, null, null, null, false, false, false, null, null, false, 4194175))) {
                c0.m13502y(c8810d, null, null, new C8723c(this, interfaceC7559c, 5), 3);
                return;
            }
            arrayList = arrayList2;
        }
    }

    @Override // ur.AbstractC7524q
    /* renamed from: f */
    public final void mo2034f() {
        m1 m1Var;
        Object value;
        ArrayList arrayListD0 = AbstractC6663m.d0(((i0) this.f36253c.f39340a.getValue()).f36224a);
        c0.m13502y(this.f42270i, null, null, new h3(arrayListD0, this, null, 28), 3);
        do {
            m1Var = this.f36252b;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, i0.m14293a((i0) value, arrayListD0, null, null, null, null, 30)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.net.Uri, java.lang.Boolean, java.lang.Integer] */
    /* renamed from: m */
    public final void m16117m(AbstractC3837r event) {
        Object value;
        Object value2;
        Object value3;
        Iterable iterable;
        Object value4;
        Object value5;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C3831l;
        C8810d c8810d = this.f42270i;
        int i10 = 3;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            C3831l c3831l = (C3831l) event;
            c0.m13502y(c8810d, null, null, new C1768r(this, c3831l.f19784b, c3831l.f19783a, interfaceC7559c, 11), 3);
            return;
        }
        if (event instanceof C3830k) {
            C0496f c0496f = m0.f34659a;
            c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C8723c(this, interfaceC7559c, 4), 3);
            return;
        }
        if (event instanceof C3835p) {
            c0.m13502y(c8810d, null, null, new C8727g(this, interfaceC7559c, 2), 3);
            return;
        }
        if (event instanceof C3836q) {
            c0.m13502y(c8810d, null, null, new C8727g(this, interfaceC7559c, i10), 3);
            return;
        }
        boolean z10 = event instanceof C3833n;
        m1 m1Var = this.f42276o;
        if (z10) {
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C6273j.m12277a((C6273j) value3, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 3670015)));
            C3833n c3833n = (C3833n) event;
            Uri uri = c3833n.f19786a;
            if (uri == null) {
                do {
                    value5 = m1Var.getValue();
                } while (!m1Var.m15397i(value5, C6273j.m12277a((C6273j) value5, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, new C6267d(null, null, null), false, 3145727)));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C3299a(pe.m10834i("Sr.No", "Name", "From Number", "To Number", "Date", "Time", "Duration", "Type", "Note")));
            int i11 = 0;
            Object obj = ((C6364n) c0.m13468D(C7565i.f36440a, new C8723c(this, interfaceC7559c, i11))).f30758a;
            boolean z11 = obj instanceof C6363m;
            if (z11) {
                iterable = C6668r.f31943a;
            } else {
                if (z11) {
                    obj = null;
                }
                iterable = (List) obj;
            }
            if (iterable != null) {
                for (Object obj2 : iterable) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        ?? r20 = interfaceC7559c;
                        pe.m10842q();
                        throw r20;
                    }
                    C9005e c9005e = (C9005e) obj2;
                    String strValueOf = String.valueOf(i12);
                    String str = c9005e.f43372e;
                    String str2 = c9005e.f43381n;
                    String str3 = c9005e.f43373f;
                    String str4 = c9005e.f43375h;
                    InterfaceC7559c interfaceC7559c2 = interfaceC7559c;
                    String str5 = c9005e.f43376i;
                    String str6 = c9005e.f43377j;
                    String str7 = c9005e.f43379l;
                    String str8 = c9005e.f43368a.f23862h;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList.add(new C3299a(pe.m10834i(strValueOf, str, str2, str3, str4, str5, str6, str7, str8)));
                    i11 = i12;
                    interfaceC7559c = interfaceC7559c2;
                }
            }
            new C8989c(24, new C3300b(arrayList)).f0(uri, c3833n.f19787b);
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, C6273j.m12277a((C6273j) value4, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, new C6267d(Boolean.TRUE, Integer.valueOf(R.string.csv_exported_true), uri), false, 3145727)));
            return;
        }
        Object obj3 = null;
        if (event instanceof C3829j) {
            StringBuilder sb2 = new StringBuilder("Report ");
            C8800o c8800o = C8800o.f42459a;
            w0 w0Var = this.f42277p;
            sb2.append(C8800o.m16177A(((C6273j) w0Var.f39340a.getValue()).f30457n));
            sb2.append(" to ");
            sb2.append(C8800o.m16177A(((C6273j) w0Var.f39340a.getValue()).f30458o));
            sb2.append(".csv");
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C6273j.m12277a((C6273j) value2, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, sb2.toString(), null, false, 3670015)));
            return;
        }
        if (!(event instanceof C3832m)) {
            if (!event.equals(C3834o.f19788a)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C6273j.m12277a((C6273j) value, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 2097151)));
            return;
        }
        while (true) {
            Object value6 = m1Var.getValue();
            ?? r42 = obj3;
            if (m1Var.m15397i(value6, C6273j.m12277a((C6273j) value6, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, new C6267d(r42, r42, r42), false, 3145727))) {
                return;
            } else {
                obj3 = r42;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16118n(int r30, ww.AbstractC8193c r31) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8735o.m16118n(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16119o(int r30, ww.AbstractC8193c r31) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8735o.m16119o(int, ww.c):java.lang.Object");
    }
}
