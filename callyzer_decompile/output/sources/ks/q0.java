package ks;

import a9.C0073l;
import an.e5;
import android.content.Context;
import aw.C0473m;
import bq.C0724d;
import c9.C0910e;
import cs.AbstractC1500s;
import cs.C1491j;
import cs.C1492k;
import cs.C1493l;
import cs.C1494m;
import cs.C1495n;
import cs.C1496o;
import cs.C1497p;
import cs.C1498q;
import cs.C1499r;
import dr.C1768r;
import dr.C1769s;
import ex.InterfaceC2139c;
import gs.C2715a;
import ho.C2992e;
import ho.InterfaceC2988a;
import hp.C2995b;
import hq.C3009n;
import is.C3348b;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import js.C3850f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import lv.C4531c;
import no.C5122i;
import nx.AbstractC5178p;
import og.pe;
import or.AbstractC5453p;
import or.C5440c;
import or.C5441d;
import or.C5442e;
import or.C5443f;
import or.C5444g;
import or.C5445h;
import or.C5446i;
import or.C5447j;
import or.C5448k;
import or.C5449l;
import or.C5450m;
import or.C5451n;
import or.C5452o;
import or.C5454q;
import pg.f9;
import pg.o6;
import pn.C5979e;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.C6668r;
import tb.C7105p;
import tq.EnumC7204p;
import ur.AbstractC7523p;
import ur.AbstractC7524q;
import ur.C7508a;
import ur.C7509b;
import ur.C7510c;
import ur.C7511d;
import ur.C7512e;
import ur.C7513f;
import ur.C7514g;
import ur.C7515h;
import ur.C7516i;
import ur.C7517j;
import ur.C7518k;
import ur.C7519l;
import ur.C7520m;
import ur.C7521n;
import ur.C7522o;
import uw.InterfaceC7559c;
import vx.C7806h;
import wj.C8090p;
import wx.C8203d;
import wx.c1;
import wx.m1;
import wx.w0;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;
import zr.C9035e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 extends AbstractC7524q {

    /* renamed from: A */
    public final w0 f21490A;

    /* renamed from: B */
    public tx.g0 f21491B;

    /* renamed from: C */
    public final C7806h f21492C;

    /* renamed from: D */
    public final C8203d f21493D;

    /* renamed from: E */
    public final C4531c f21494E;

    /* renamed from: f */
    public final C8090p f21495f;

    /* renamed from: g */
    public final C0910e f21496g;

    /* renamed from: h */
    public final w0 f21497h;

    /* renamed from: i */
    public final C8810d f21498i;

    /* renamed from: j */
    public final C5979e f21499j;

    /* renamed from: k */
    public final C5122i f21500k;

    /* renamed from: l */
    public final Context f21501l;

    /* renamed from: m */
    public final C0073l f21502m;

    /* renamed from: n */
    public final C7105p f21503n;

    /* renamed from: o */
    public final C4494g f21504o;

    /* renamed from: p */
    public final C8805t f21505p;

    /* renamed from: q */
    public final q0 f21506q;

    /* renamed from: r */
    public final C7806h f21507r;

    /* renamed from: s */
    public final C8203d f21508s;

    /* renamed from: t */
    public int f21509t;

    /* renamed from: u */
    public boolean f21510u;

    /* renamed from: v */
    public volatile EnumC7204p f21511v;

    /* renamed from: w */
    public final m1 f21512w;

    /* renamed from: x */
    public final w0 f21513x;

    /* renamed from: y */
    public List f21514y;

    /* renamed from: z */
    public final m1 f21515z;

    public q0(C8090p c8090p, C0910e c0910e, w0 w0Var, C8810d c8810d, C5979e c5979e, C5122i noteUseCase, Context context, C0073l c0073l, C7105p c7105p, C4494g c4494g, C8805t c8805t) {
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        this.f21495f = c8090p;
        this.f21496g = c0910e;
        this.f21497h = w0Var;
        this.f21498i = c8810d;
        this.f21499j = c5979e;
        this.f21500k = noteUseCase;
        this.f21501l = context;
        this.f21502m = c0073l;
        this.f21503n = c7105p;
        this.f21504o = c4494g;
        this.f21505p = c8805t;
        this.f21506q = this;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f21507r = c7806hM11805a;
        this.f21508s = c1.m15389t(c7806hM11805a);
        this.f21509t = -1;
        m1 m1VarM15372c = c1.m15372c(new C3348b());
        this.f21512w = m1VarM15372c;
        this.f21513x = new w0(m1VarM15372c);
        this.f21514y = C6668r.f31943a;
        m1 m1VarM15372c2 = c1.m15372c(null);
        this.f21515z = m1VarM15372c2;
        this.f21490A = new w0(m1VarM15372c2);
        final int i10 = 0;
        InterfaceC2139c interfaceC2139c = new InterfaceC2139c(this) { // from class: ks.d0

            /* renamed from: b */
            public final /* synthetic */ q0 f21393b;

            {
                this.f21393b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                m1 m1Var;
                boolean z6;
                Object value;
                boolean z10;
                Object value2;
                switch (i10) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var = this.f21393b;
                        w0 w0Var2 = q0Var.f21513x;
                        m1 m1Var2 = q0Var.f21512w;
                        if (((C3348b) w0Var2.f39340a.getValue()).f17723k) {
                            while (true) {
                                Object value3 = m1Var2.getValue();
                                z6 = zBooleanValue;
                                m1Var = m1Var2;
                                if (!m1Var.m15397i(value3, C3348b.m7669a((C3348b) value3, null, false, 0, null, 0, false, false, false, null, null, z6, null, null, null, null, null, false, null, 1047551))) {
                                    m1Var2 = m1Var;
                                    zBooleanValue = z6;
                                }
                            }
                        } else {
                            m1Var = m1Var2;
                            z6 = zBooleanValue;
                        }
                        do {
                            value = m1Var.getValue();
                            z10 = z6;
                            z6 = z10;
                        } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, z10, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f21393b.f21512w;
                        do {
                            value2 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value2, C3348b.m7669a((C3348b) value2, null, zBooleanValue2, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
                }
                return qw.a0.f30746a;
            }
        };
        final int i11 = 1;
        InterfaceC2139c interfaceC2139c2 = new InterfaceC2139c(this) { // from class: ks.d0

            /* renamed from: b */
            public final /* synthetic */ q0 f21393b;

            {
                this.f21393b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                m1 m1Var;
                boolean z6;
                Object value;
                boolean z10;
                Object value2;
                switch (i11) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var = this.f21393b;
                        w0 w0Var2 = q0Var.f21513x;
                        m1 m1Var2 = q0Var.f21512w;
                        if (((C3348b) w0Var2.f39340a.getValue()).f17723k) {
                            while (true) {
                                Object value3 = m1Var2.getValue();
                                z6 = zBooleanValue;
                                m1Var = m1Var2;
                                if (!m1Var.m15397i(value3, C3348b.m7669a((C3348b) value3, null, false, 0, null, 0, false, false, false, null, null, z6, null, null, null, null, null, false, null, 1047551))) {
                                    m1Var2 = m1Var;
                                    zBooleanValue = z6;
                                }
                            }
                        } else {
                            m1Var = m1Var2;
                            z6 = zBooleanValue;
                        }
                        do {
                            value = m1Var.getValue();
                            z10 = z6;
                            z6 = z10;
                        } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, z10, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        m1 m1Var3 = this.f21393b.f21512w;
                        do {
                            value2 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value2, C3348b.m7669a((C3348b) value2, null, zBooleanValue2, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
                }
                return qw.a0.f30746a;
            }
        };
        C7806h c7806hM11805a2 = o6.m11805a(0, null, null, 7);
        this.f21492C = c7806hM11805a2;
        this.f21493D = c1.m15389t(c7806hM11805a2);
        this.f21494E = new C4531c(Integer.valueOf(((C3348b) m1VarM15372c.getValue()).f17715c), interfaceC2139c, interfaceC2139c2, new C1768r(this, interfaceC7559c, 4), new C0473m(2, 8, null), new m0(this, null, 0), null, new e0(this, interfaceC7559c, 2), new m0(this, null, 2), new C1769s(this, (InterfaceC7559c) null, 7), 1088);
        tx.c0.m13502y(c8810d, null, null, new C2995b(this, interfaceC7559c, 20), 3);
        tx.c0.m13502y(c8810d, null, null, new C0724d((d7.w0) this, interfaceC7559c, 7), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        if (r1 == r6) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[PHI: r1
      0x00d6: PHI (r1v17 java.lang.Object) = (r1v16 java.lang.Object), (r1v1 java.lang.Object) binds: [B:34:0x00d2, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8965h(ks.q0 r34, ww.AbstractC8193c r35) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.q0.m8965h(ks.q0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8966i(ks.q0 r8, ww.AbstractC8193c r9) {
        /*
            wx.m1 r0 = r8.f36252b
            boolean r1 = r9 instanceof ks.i0
            if (r1 == 0) goto L15
            r1 = r9
            ks.i0 r1 = (ks.i0) r1
            int r2 = r1.f21426c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f21426c = r2
            goto L1a
        L15:
            ks.i0 r1 = new ks.i0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f21424a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f21426c
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            og.od.m10798c(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r9)
            tb.p r9 = r8.f21503n
            r1.f21426c = r4
            java.lang.Object r9 = r9.m13382d(r8, r1)
            if (r9 != r2) goto L3f
            return r2
        L3f:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r0.getValue()
            ur.i0 r8 = (ur.i0) r8
            java.util.List r8 = r8.f36225b
            java.util.ArrayList r3 = rw.AbstractC6663m.d0(r8)
            r3.addAll(r9)
        L50:
            java.lang.Object r8 = r0.getValue()
            r1 = r8
            ur.i0 r1 = (ur.i0) r1
            r6 = 0
            r7 = 29
            r2 = 0
            r4 = 0
            r5 = 0
            ur.i0 r9 = ur.i0.m14293a(r1, r2, r3, r4, r5, r6, r7)
            boolean r8 = r0.m15397i(r8, r9)
            if (r8 == 0) goto L50
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.q0.m8966i(ks.q0, ww.c):java.lang.Object");
    }

    @Override // ur.AbstractC7524q
    /* renamed from: e */
    public final void mo2033e(AbstractC7523p event) {
        Object value;
        Object value2;
        Object value3;
        Object next;
        Object value4;
        Object next2;
        int iIndexOf;
        Object value5;
        Object value6;
        int iIndexOf2;
        String string;
        Object value7;
        Integer num;
        Object value8;
        Object value9;
        AbstractC4154l.m8923f(event, "event");
        boolean zEquals = event.equals(C7508a.f36203a);
        m1 m1Var = this.f36252b;
        if (zEquals) {
            do {
                value9 = m1Var.getValue();
            } while (!m1Var.m15397i(value9, ur.i0.m14293a((ur.i0) value9, null, this.f21514y, null, null, null, 29)));
            return;
        }
        Object obj = null;
        if (event instanceof C7509b) {
            List<AbstractC5453p> list = ((ur.i0) m1Var.getValue()).f36225b;
            ArrayList arrayList = new ArrayList();
            for (AbstractC5453p abstractC5453p : list) {
                String strMo11150b = abstractC5453p.mo11150b();
                if (strMo11150b != null && strMo11150b.length() != 0) {
                    String strMo11152d = abstractC5453p.mo11152d();
                    String strMo11150b2 = abstractC5453p.mo11150b();
                    AbstractC4154l.m8920c(strMo11150b2);
                    arrayList.add(new C9035e(strMo11152d, strMo11150b2));
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    arrayList.size();
                    Objects.toString((C9035e) obj2);
                    i10 = i12;
                }
                do {
                    value8 = m1Var.getValue();
                } while (!m1Var.m15397i(value8, ur.i0.m14293a((ur.i0) value8, null, null, null, null, new C6361k(Boolean.TRUE, arrayList), 15)));
                z = false;
            }
            ((C7509b) event).f36205a.invoke(Boolean.valueOf(z));
            if (z) {
                m8968k();
                return;
            }
            return;
        }
        if ((event instanceof C7512e) || (event instanceof C7514g)) {
            return;
        }
        if (event instanceof C7517j) {
            Iterator it = ((ur.i0) m1Var.getValue()).f36225b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next3 = it.next();
                if (AbstractC4154l.m8918a(((AbstractC5453p) next3).mo11153e(), ((C7517j) event).f36229a)) {
                    obj = next3;
                    break;
                }
            }
            AbstractC5453p abstractC5453p2 = (AbstractC5453p) obj;
            if (abstractC5453p2 != null && (iIndexOf2 = ((ur.i0) m1Var.getValue()).f36225b.indexOf(abstractC5453p2)) >= 0) {
                ArrayList arrayListD0 = AbstractC6663m.d0(((ur.i0) m1Var.getValue()).f36225b);
                if (abstractC5453p2 instanceof C5446i) {
                    Object obj3 = arrayListD0.get(iIndexOf2);
                    AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.FieldType.InputField");
                    arrayListD0.set(iIndexOf2, ((C5446i) obj3).mo11158j(f9.m11631e(((C7517j) event).f36230b)));
                } else if (abstractC5453p2 instanceof C5449l) {
                    Object obj4 = arrayListD0.get(iIndexOf2);
                    AbstractC4154l.m8921d(obj4, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.FieldType.NumericField");
                    arrayListD0.set(iIndexOf2, ((C5449l) obj4).mo11158j(f9.m11631e(((C7517j) event).f36230b)));
                } else {
                    if (!(abstractC5453p2 instanceof C5440c) && !(abstractC5453p2 instanceof C5441d) && !(abstractC5453p2 instanceof C5443f) && !(abstractC5453p2 instanceof C5450m) && !(abstractC5453p2 instanceof C5447j) && !(abstractC5453p2 instanceof C5451n) && !(abstractC5453p2 instanceof C5444g) && !(abstractC5453p2 instanceof C5452o) && !(abstractC5453p2 instanceof C5442e) && !(abstractC5453p2 instanceof C5445h) && !(abstractC5453p2 instanceof C5448k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                Iterator it2 = abstractC5453p2.mo11154f().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        string = "";
                        break;
                    }
                    C2992e c2992eMo7247a = ((InterfaceC2988a) it2.next()).mo7247a((AbstractC5453p) arrayListD0.get(iIndexOf2));
                    if (!c2992eMo7247a.f16133a && (num = c2992eMo7247a.f16134b) != null) {
                        string = this.f21501l.getString(num.intValue());
                        AbstractC4154l.m8922e(string, "getString(...)");
                        break;
                    }
                }
                ((AbstractC5453p) arrayListD0.get(iIndexOf2)).mo11157i(string);
                C7517j c7517j = (C7517j) event;
                arrayListD0.set(iIndexOf2, ((AbstractC5453p) arrayListD0.get(iIndexOf2)).mo11156h(AbstractC5178p.g0(c7517j.f36230b).toString().length() > 0 && string.length() == 0));
                do {
                    value7 = m1Var.getValue();
                } while (!m1Var.m15397i(value7, ur.i0.m14293a((ur.i0) value7, null, arrayListD0, null, null, null, 29)));
                if (c7517j.f36231c) {
                    m8968k();
                    return;
                }
                return;
            }
            return;
        }
        if ((event instanceof C7518k) || (event instanceof C7519l) || (event instanceof C7520m) || (event instanceof C7522o)) {
            return;
        }
        if (event instanceof C7515h) {
            Iterator it3 = ((ur.i0) m1Var.getValue()).f36225b.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next4 = it3.next();
                if (AbstractC4154l.m8918a(((C7515h) event).f36218a, ((AbstractC5453p) next4).mo11153e())) {
                    obj = next4;
                    break;
                }
            }
            AbstractC5453p abstractC5453p3 = (AbstractC5453p) obj;
            if (!(abstractC5453p3 instanceof C5440c)) {
                return;
            }
            int iIndexOf3 = ((ur.i0) m1Var.getValue()).f36225b.indexOf(abstractC5453p3);
            if (iIndexOf3 < 0) {
                return;
            }
            ArrayList arrayListD02 = AbstractC6663m.d0(((ur.i0) m1Var.getValue()).f36225b);
            C7515h c7515h = (C7515h) event;
            List list2 = c7515h.f36219b;
            Objects.toString(list2);
            Object obj5 = arrayListD02.get(iIndexOf3);
            AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.FieldType.CheckBoxField");
            arrayListD02.set(iIndexOf3, ((C5440c) obj5).mo11158j(list2));
            Object obj6 = arrayListD02.get(iIndexOf3);
            AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.FieldType.CheckBoxField");
            C5440c c5440c = (C5440c) obj6;
            if (list2.isEmpty()) {
                z = false;
            } else {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (((C5454q) it4.next()).f27493c) {
                        break;
                    }
                }
                z = false;
            }
            arrayListD02.set(iIndexOf3, c5440c.mo11156h(z));
            do {
                value6 = m1Var.getValue();
            } while (!m1Var.m15397i(value6, ur.i0.m14293a((ur.i0) value6, null, arrayListD02, null, null, null, 25)));
            if (c7515h.f36220c) {
                m8968k();
                return;
            }
            return;
        }
        if (event instanceof C7513f) {
            Iterator it5 = ((ur.i0) m1Var.getValue()).f36225b.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next2 = it5.next();
                    if (AbstractC4154l.m8918a(((C7513f) event).f36213a, ((AbstractC5453p) next2).mo11153e())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            AbstractC5453p abstractC5453p4 = (AbstractC5453p) next2;
            if (!(abstractC5453p4 instanceof C5440c) || (iIndexOf = ((ur.i0) m1Var.getValue()).f36225b.indexOf(abstractC5453p4)) < 0) {
                return;
            }
            List list3 = ((C5440c) abstractC5453p4).f27352d;
            Iterator it6 = list3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next5 = it6.next();
                if (AbstractC4154l.m8918a(((C5454q) next5).f27491a, ((C7513f) event).f36214b.f27491a)) {
                    obj = next5;
                    break;
                }
            }
            int iIndexOf4 = list3.indexOf((C5454q) obj);
            ArrayList arrayListD03 = AbstractC6663m.d0(list3);
            if (iIndexOf4 >= 0) {
                arrayListD03.set(iIndexOf4, C5454q.m11181a((C5454q) arrayListD03.get(iIndexOf4), false));
                ArrayList arrayListD04 = AbstractC6663m.d0(((ur.i0) m1Var.getValue()).f36225b);
                Object obj7 = arrayListD04.get(iIndexOf);
                AbstractC4154l.m8921d(obj7, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.FieldType.CheckBoxField");
                arrayListD04.set(iIndexOf, ((C5440c) obj7).mo11158j(arrayListD03));
                Object obj8 = arrayListD04.get(iIndexOf);
                AbstractC4154l.m8921d(obj8, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.FieldType.CheckBoxField");
                C5440c c5440c2 = (C5440c) obj8;
                if (arrayListD03.isEmpty()) {
                    z = false;
                } else {
                    int size2 = arrayListD03.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj9 = arrayListD03.get(i13);
                        i13++;
                        if (((C5454q) obj9).f27493c) {
                            break;
                        }
                    }
                    z = false;
                }
                arrayListD04.set(iIndexOf, c5440c2.mo11156h(z));
                do {
                    value5 = m1Var.getValue();
                } while (!m1Var.m15397i(value5, ur.i0.m14293a((ur.i0) value5, null, arrayListD04, null, null, null, 29)));
                return;
            }
            return;
        }
        if (event instanceof C7516i) {
            Iterator it7 = ((ur.i0) m1Var.getValue()).f36225b.iterator();
            while (true) {
                if (it7.hasNext()) {
                    next = it7.next();
                    if (AbstractC4154l.m8918a(((AbstractC5453p) next).mo11153e(), ((C7516i) event).f36221a)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC5453p abstractC5453p5 = (AbstractC5453p) next;
            if (abstractC5453p5 == null) {
                return;
            }
            int iIndexOf5 = ((ur.i0) m1Var.getValue()).f36225b.indexOf(abstractC5453p5);
            if (iIndexOf5 < 0) {
                return;
            }
            ArrayList arrayListD05 = AbstractC6663m.d0(((ur.i0) m1Var.getValue()).f36225b);
            C7516i c7516i = (C7516i) event;
            C6361k c6361k = c7516i.f36222b;
            if (c6361k == null) {
                arrayListD05.set(iIndexOf5, ((C5442e) abstractC5453p5).mo11158j(null));
            } else {
                arrayListD05.set(iIndexOf5, ((C5442e) abstractC5453p5).mo11158j(new C6361k(c6361k.f30755a, c6361k.f30756b)));
            }
            arrayListD05.set(iIndexOf5, ((AbstractC5453p) arrayListD05.get(iIndexOf5)).mo11156h(c6361k != null));
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, ur.i0.m14293a((ur.i0) value4, null, arrayListD05, null, null, null, 29)));
            if (c7516i.f36223c) {
                m8968k();
                return;
            }
            return;
        }
        if (!(event instanceof C7511d)) {
            if (event.equals(C7510c.f36207a)) {
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, ur.i0.m14293a((ur.i0) value, null, null, null, null, new C6361k(Boolean.FALSE, C6668r.f31943a), 15)));
                return;
            } else {
                if (!(event instanceof C7521n)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        String str = ((C7511d) event).f36209a;
        if (str == null || str.length() == 0) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, ur.i0.m14293a((ur.i0) value2, null, null, null, null, null, 27)));
            return;
        }
        Iterator it8 = ((ur.i0) m1Var.getValue()).f36225b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next6 = it8.next();
            if (AbstractC4154l.m8918a(((AbstractC5453p) next6).mo11153e(), str)) {
                obj = next6;
                break;
            }
        }
        AbstractC5453p abstractC5453p6 = (AbstractC5453p) obj;
        if (abstractC5453p6 != null && (abstractC5453p6 instanceof C5440c)) {
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, ur.i0.m14293a((ur.i0) value3, null, null, (C5440c) abstractC5453p6, null, null, 27)));
        }
    }

    @Override // ur.AbstractC7524q
    /* renamed from: f */
    public final void mo2034f() {
        Object value;
        m1 m1Var = this.f36252b;
        ArrayList arrayListD0 = AbstractC6663m.d0(((ur.i0) m1Var.getValue()).f36225b);
        int size = arrayListD0.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListD0.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            AbstractC5453p abstractC5453p = (AbstractC5453p) obj;
            if (abstractC5453p instanceof C5440c) {
                C5440c c5440c = (C5440c) abstractC5453p;
                ArrayList arrayListD02 = AbstractC6663m.d0(c5440c.f27352d);
                int size2 = arrayListD02.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayListD02.get(i14);
                    i14++;
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    arrayListD02.set(i13, C5454q.m11181a((C5454q) arrayListD02.get(i13), false));
                    i13 = i15;
                }
                arrayListD0.set(i10, c5440c.mo11158j(arrayListD02));
            } else if (abstractC5453p instanceof C5442e) {
                arrayListD0.set(i10, ((C5442e) abstractC5453p).mo11158j(null));
            } else if (abstractC5453p instanceof C5446i) {
                arrayListD0.set(i10, ((C5446i) abstractC5453p).mo11158j(""));
            } else if (abstractC5453p instanceof C5449l) {
                arrayListD0.set(i10, ((C5449l) abstractC5453p).mo11158j(""));
            } else if (!(abstractC5453p instanceof C5441d) && !(abstractC5453p instanceof C5443f) && !(abstractC5453p instanceof C5444g) && !(abstractC5453p instanceof C5447j) && !(abstractC5453p instanceof C5450m) && !(abstractC5453p instanceof C5451n) && !(abstractC5453p instanceof C5452o)) {
                if (abstractC5453p instanceof C5448k) {
                    arrayListD0.set(i10, ((C5448k) abstractC5453p).mo11158j(new C6361k(Boolean.FALSE, null)));
                } else if (!(abstractC5453p instanceof C5445h)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            ((AbstractC5453p) arrayListD0.get(i10)).mo11157i(null);
            arrayListD0.set(i10, ((AbstractC5453p) arrayListD0.get(i10)).mo11156h(false));
            i10 = i12;
        }
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, ur.i0.m14293a((ur.i0) value, null, arrayListD0, null, null, null, 29)));
        m8968k();
    }

    /* renamed from: j */
    public final void m8967j(C5440c c5440c) {
        Object value;
        m1 m1Var = this.f36252b;
        ArrayList arrayListD0 = AbstractC6663m.d0(((ur.i0) m1Var.getValue()).f36225b);
        arrayListD0.add(c5440c);
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, ur.i0.m14293a((ur.i0) value, null, arrayListD0, null, null, null, 29)));
    }

    /* renamed from: k */
    public final void m8968k() {
        tx.c0.m13502y(this.f21498i, null, null, new C2995b(this, (InterfaceC7559c) null, 21), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8969l(boolean r29, ww.AbstractC8193c r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            boolean r2 = r1 instanceof ks.j0
            if (r2 == 0) goto L17
            r2 = r1
            ks.j0 r2 = (ks.j0) r2
            int r3 = r2.f21434d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f21434d = r3
            goto L1c
        L17:
            ks.j0 r2 = new ks.j0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f21432b
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f21434d
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L44
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            boolean r2 = r2.f21431a
            og.od.m10798c(r1)
            goto La0
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            boolean r4 = r2.f21431a
            og.od.m10798c(r1)
            r27 = r4
            r4 = r1
            r1 = r27
            goto L8c
        L44:
            og.od.m10798c(r1)
        L47:
            wx.m1 r1 = r0.f21512w
            java.lang.Object r4 = r1.getValue()
            r7 = r4
            is.b r7 = (is.C3348b) r7
            r25 = 0
            r26 = 1048573(0xffffd, float:1.469364E-39)
            r8 = 0
            r9 = 1
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
            is.b r7 = is.C3348b.m7669a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = r1.m15397i(r4, r7)
            if (r1 == 0) goto Laa
            r1 = r29
            r2.f21431a = r1
            r2.f21434d = r6
            wj.p r4 = r0.f21495f
            java.lang.Object r4 = r4.f38725c
            xm.r3 r4 = (xm.r3) r4
            java.lang.Object r4 = r4.m15610i(r6, r2)
            if (r4 != r3) goto L8c
            goto L9a
        L8c:
            java.util.List r4 = (java.util.List) r4
            r2.f21431a = r1
            r2.f21434d = r5
            tb.p r5 = r0.f21503n
            java.lang.Object r2 = r5.m13383e(r4, r0, r2)
            if (r2 != r3) goto L9b
        L9a:
            return r3
        L9b:
            r27 = r2
            r2 = r1
            r1 = r27
        La0:
            or.c r1 = (or.C5440c) r1
            if (r2 == 0) goto La7
            r0.m8967j(r1)
        La7:
            java.util.List r1 = r1.f27352d
            return r1
        Laa:
            r1 = r29
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.q0.m8969l(boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8970m(boolean r31, ww.AbstractC8193c r32) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.q0.m8970m(boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8971n(ww.AbstractC8193c r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof ks.l0
            if (r2 == 0) goto L17
            r2 = r1
            ks.l0 r2 = (ks.l0) r2
            int r3 = r2.f21464c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f21464c = r3
            goto L1c
        L17:
            ks.l0 r2 = new ks.l0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f21462a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f21464c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            og.od.m10798c(r1)
            goto L4d
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            og.od.m10798c(r1)
            wx.w0 r1 = r0.f21513x
            wx.k1 r1 = r1.f39340a
            java.lang.Object r1 = r1.getValue()
            is.b r1 = (is.C3348b) r1
            java.util.List r1 = r1.f17713a
            r2.f21464c = r5
            wj.p r4 = r0.f21495f
            java.lang.Object r1 = r4.m15244V(r1, r2)
            if (r1 != r3) goto L4d
            return r3
        L4d:
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L9c
        L52:
            wx.m1 r1 = r0.f21512w
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            r2 = r4
            is.b r2 = (is.C3348b) r2
            java.util.LinkedHashMap r20 = r0.m8974q(r3)
            r21 = 524286(0x7fffe, float:7.34681E-40)
            r5 = r4
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r22 = r19
            r19 = 0
            r0 = r22
            is.b r2 = is.C3348b.m7669a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = r1.m15397i(r0, r2)
            if (r0 == 0) goto L99
            goto L9c
        L99:
            r0 = r23
            goto L52
        L9c:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.q0.m8971n(ww.c):java.lang.Object");
    }

    /* renamed from: o */
    public final void m8972o(AbstractC1500s leadOnEvent) {
        m1 m1Var;
        Object value;
        Object value2;
        AbstractC4154l.m8923f(leadOnEvent, "leadOnEvent");
        boolean z6 = leadOnEvent instanceof C1494m;
        C8810d c8810d = this.f21498i;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            tx.c0.m13502y(c8810d, null, null, new f0(this, interfaceC7559c, 4), 3);
            return;
        }
        boolean z10 = leadOnEvent instanceof C1491j;
        w0 w0Var = this.f21513x;
        if (z10) {
            do {
                m1Var = this.f21512w;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048543)));
            if (((C3348b) w0Var.f39340a.getValue()).f17723k) {
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C3348b.m7669a((C3348b) value2, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1047551)));
                return;
            }
            return;
        }
        boolean z11 = leadOnEvent instanceof C1492k;
        C0910e c0910e = this.f21496g;
        if (z11) {
            c0910e.m2609s(((C1492k) leadOnEvent).f7573a);
            return;
        }
        if (leadOnEvent instanceof C1496o) {
            C1496o c1496o = (C1496o) leadOnEvent;
            String str = c1496o.f7580b;
            c0910e.m2585D("+" + c1496o.f7579a + str);
            this.f21495f.m15242T(new im.n0(c1496o.f7582d.f19811a, str));
            tx.c0.m13502y(c8810d, null, null, new n0(0, leadOnEvent, this, interfaceC7559c), 3);
            return;
        }
        if (leadOnEvent instanceof C1499r) {
            C1499r c1499r = (C1499r) leadOnEvent;
            c0910e.m2587F("+" + c1499r.f7586a + c1499r.f7587b);
            return;
        }
        if (leadOnEvent instanceof C1493l) {
            tx.c0.m13502y(c8810d, null, null, new o0(0, leadOnEvent, this, interfaceC7559c), 3);
            return;
        }
        if (leadOnEvent instanceof C1495n) {
            tx.c0.m13502y(c8810d, null, null, new n0(1, leadOnEvent, this, interfaceC7559c), 3);
            return;
        }
        if (leadOnEvent instanceof C1497p) {
            if (!((C3348b) w0Var.f39340a.getValue()).f17714b) {
                tx.c0.m13502y(c8810d, null, null, new f0(this, interfaceC7559c, 5), 3);
            }
            tx.c0.m13502y(c8810d, null, null, new C2715a(this, interfaceC7559c, 29), 3);
        } else if (leadOnEvent instanceof C1498q) {
            tx.c0.m13502y(c8810d, null, null, new o0(1, leadOnEvent, this, interfaceC7559c), 3);
        }
    }

    /* renamed from: p */
    public final void m8973p() {
        e5 e5Var = new e5(this, null, 4);
        C2715a c2715a = new C2715a(this, (InterfaceC7559c) null, 29);
        C8810d c8810d = this.f21498i;
        tx.c0.m13502y(c8810d, null, null, c2715a, 3);
        tx.g0 g0Var = this.f21491B;
        if (g0Var == null) {
            tx.c0.m13502y(c8810d, null, null, new p0(e5Var, null, 0), 3);
            return;
        }
        g0Var.mo13510j(null);
        tx.g0 g0Var2 = this.f21491B;
        if (g0Var2 != null) {
            g0Var2.v0(new C3009n(4, this, e5Var));
        }
    }

    /* renamed from: q */
    public final LinkedHashMap m8974q(List list) {
        LocalDate localDateM16181E;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        LocalDate localDate = null;
        while (it.hasNext()) {
            C3850f c3850f = (C3850f) it.next();
            try {
                C8800o c8800o = C8800o.f42459a;
                String str = c3850f.f19821k;
                DateTimeFormatter dateTimeFormatter = C8800o.f42462d;
                AbstractC4154l.m8922e(dateTimeFormatter, "<get-DATE_TIME_FORMATTER_FOR_LEAD_SORT>(...)");
                localDateM16181E = C8800o.m16181E(str, dateTimeFormatter);
            } catch (Exception e2) {
                this.f21505p.m16231f("Parse error for: '" + c3850f.f19821k + "' -> " + e2.getMessage());
                localDateM16181E = LocalDate.MIN;
            }
            if (!AbstractC4154l.m8918a(localDateM16181E, localDate) && !arrayList.isEmpty()) {
                List listC0 = AbstractC6663m.c0(arrayList);
                if (localDate != null) {
                }
                arrayList.clear();
            }
            arrayList.add(c3850f);
            localDate = localDateM16181E;
        }
        if (!arrayList.isEmpty()) {
            List listC02 = AbstractC6663m.c0(arrayList);
            if (localDate != null) {
            }
        }
        return linkedHashMap;
    }
}
