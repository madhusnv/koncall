package bs;

import a9.C0073l;
import al.C0174b;
import android.content.Context;
import ao.C0372k;
import ao.C0381t;
import ao.c0;
import aq.C0406i;
import as.C0428a;
import as.C0429b;
import av.C0458a;
import ay.C0496f;
import ay.ExecutorC0495e;
import bl.C0689a;
import cm.C0983a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.request.LeadDetails;
import com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest;
import com.websoptimization.callyzerbiz.data.model.response.AllEmployeeResponse;
import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.DynamicFieldResponse;
import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadByNumberResponse;
import d7.q0;
import d7.w0;
import ex.InterfaceC2139c;
import fo.AbstractC2341e;
import g2.f4;
import g2.h4;
import ho.C2992e;
import ho.InterfaceC2988a;
import im.EnumC3313o;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import kk.C4088h;
import kn.C4132l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4168z;
import mm.C4800k;
import mm.C4802m;
import mr.AbstractC4865g;
import mr.C4859a;
import mr.C4860b;
import mr.C4861c;
import mr.C4862d;
import mr.C4863e;
import mr.C4864f;
import nn.C5113e;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.pe;
import og.wc;
import og.yc;
import or.AbstractC5453p;
import or.C5438a;
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
import p020v.a1;
import pg.f9;
import pg.o6;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6668r;
import tx.g0;
import tx.m0;
import ug.C7454y;
import ug.C7455z;
import uw.InterfaceC7559c;
import vx.C7806h;
import wj.C8090p;
import wo.C8134s;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.r3;
import yk.C8687a;
import yr.AbstractC8761t;
import yr.C8742a;
import yr.C8743b;
import yr.C8744c;
import yr.C8745d;
import yr.C8746e;
import yr.C8747f;
import yr.C8748g;
import yr.C8749h;
import yr.C8750i;
import yr.C8751j;
import yr.C8752k;
import yr.C8753l;
import yr.C8754m;
import yr.C8755n;
import yr.C8756o;
import yr.C8757p;
import yr.C8758q;
import yr.C8759r;
import yr.C8760s;
import yr.b0;
import yr.d0;
import yr.e0;
import yr.f0;
import yr.h0;
import yr.i0;
import yr.j0;
import yr.k0;
import yv.AbstractC8804s;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;
import zr.C9031a;
import zr.C9032b;
import zr.C9033c;
import zr.C9034d;
import zr.C9035e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bs.i */
/* loaded from: classes3.dex */
public final class C0751i extends w0 {

    /* renamed from: A */
    public C4802m f4727A;

    /* renamed from: C */
    public List f4729C;

    /* renamed from: D */
    public final ArrayList f4730D;

    /* renamed from: E */
    public final m1 f4731E;

    /* renamed from: F */
    public final wx.w0 f4732F;

    /* renamed from: G */
    public String f4733G;

    /* renamed from: H */
    public boolean f4734H;

    /* renamed from: I */
    public boolean f4735I;

    /* renamed from: J */
    public final C7806h f4736J;

    /* renamed from: K */
    public final C8203d f4737K;

    /* renamed from: L */
    public final C4800k f4738L;

    /* renamed from: b */
    public final Context f4739b;

    /* renamed from: c */
    public final C8805t f4740c;

    /* renamed from: d */
    public final C0073l f4741d;

    /* renamed from: e */
    public final C7454y f4742e;

    /* renamed from: f */
    public final C8687a f4743f;

    /* renamed from: g */
    public final C7455z f4744g;

    /* renamed from: h */
    public final C0689a f4745h;

    /* renamed from: i */
    public final C0174b f4746i;

    /* renamed from: j */
    public final C8090p f4747j;

    /* renamed from: k */
    public final wx.w0 f4748k;

    /* renamed from: l */
    public final C0174b f4749l;

    /* renamed from: m */
    public final C5113e f4750m;

    /* renamed from: n */
    public final c0 f4751n;

    /* renamed from: o */
    public final C8134s f4752o;

    /* renamed from: p */
    public final C8810d f4753p;

    /* renamed from: q */
    public final String f4754q;

    /* renamed from: r */
    public final int f4755r;

    /* renamed from: s */
    public final String f4756s;

    /* renamed from: t */
    public final boolean f4757t;

    /* renamed from: u */
    public final String f4758u;

    /* renamed from: v */
    public String f4759v;

    /* renamed from: w */
    public String f4760w;

    /* renamed from: x */
    public LeadByNumberResponse f4761x;

    /* renamed from: y */
    public boolean f4762y;

    /* renamed from: z */
    public final ArrayList f4763z = new ArrayList();

    /* renamed from: B */
    public final ArrayList f4728B = new ArrayList();

    public C0751i(Context context, C8805t c8805t, C0073l c0073l, C7454y c7454y, C8687a c8687a, C7455z c7455z, C0689a c0689a, C0174b c0174b, C8090p c8090p, wx.w0 w0Var, C0174b c0174b2, C5113e c5113e, c0 c0Var, C8134s c8134s, C8810d c8810d, String str, int i10, String str2, boolean z6, String str3) {
        Object value;
        C9034d c9034d;
        C9032b c9032b;
        String str4;
        String str5;
        OffsetDateTime offsetDateTimeAtOffset;
        Instant instant;
        this.f4739b = context;
        this.f4740c = c8805t;
        this.f4741d = c0073l;
        this.f4742e = c7454y;
        this.f4743f = c8687a;
        this.f4744g = c7455z;
        this.f4745h = c0689a;
        this.f4746i = c0174b;
        this.f4747j = c8090p;
        this.f4748k = w0Var;
        this.f4749l = c0174b2;
        this.f4750m = c5113e;
        this.f4751n = c0Var;
        this.f4752o = c8134s;
        this.f4753p = c8810d;
        this.f4754q = str;
        this.f4755r = i10;
        this.f4756s = str2;
        this.f4757t = z6;
        this.f4758u = str3;
        C6668r c6668r = C6668r.f31943a;
        this.f4729C = c6668r;
        this.f4730D = new ArrayList();
        C9033c c9033c = new C9033c(true, true, null, null, c6668r, c6668r, false);
        EnumC3313o enumC3313o = EnumC3313o.NoOptionSelected;
        C6361k c6361k = new C6361k(Boolean.FALSE, c6668r);
        C0983a c0983a = new C0983a("", 14, null, null);
        C0983a c0983a2 = new C0983a("", 14, null, null);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Long lValueOf = (localDateTimeNow == null || (offsetDateTimeAtOffset = localDateTimeNow.atOffset(ZoneOffset.UTC)) == null || (instant = offsetDateTimeAtOffset.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
        Locale locale = Locale.getDefault();
        AbstractC4154l.m8922e(locale, "getDefault(...)");
        m1 m1VarM15372c = c1.m15372c(new C9034d(c9033c, new C9032b(c6668r, null, false, c6668r, c6668r, null, "", null, null, null, null, enumC3313o, true, false, null, null, "", "", 0, null, 0, null, "", false, false, false, true, "", false, false, c6361k, false, null, false, "", false, c6668r, false, c0983a, c0983a2, f4.m6144d(locale, lValueOf, new C0458a(13), 28)), new C9031a(c6668r, c6668r, new ArrayList(), c6668r, "", false, false, false)));
        this.f4731E = m1VarM15372c;
        this.f4732F = new wx.w0(m1VarM15372c);
        this.f4734H = true;
        this.f4735I = true;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f4736J = c7806hM11805a;
        this.f4737K = c1.m15389t(c7806hM11805a);
        this.f4738L = new C4800k(1, "Select Status", null, false);
        List listM10834i = pe.m10834i(EnumC3313o.OnlyMe, EnumC3313o.SpecificEmployee);
        do {
            value = m1VarM15372c.getValue();
            c9034d = (C9034d) value;
            c9032b = c9034d.f43541b;
            String str6 = this.f4754q;
            str4 = str6 == null ? "" : str6;
            str5 = this.f4756s;
        } while (!m1VarM15372c.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9032b, null, null, false, null, null, null, str5 == null ? "" : str5, null, null, null, null, null, false, false, null, null, null, str4, this.f4755r, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, listM10834i, null, null, null, -393281, 495), null, 5)));
        C8810d c8810d2 = this.f4753p;
        tx.c0.m13502y(c8810d2, null, null, new C0745c(this, interfaceC7559c, 0), 3);
        tx.c0.m13502y(c8810d2, null, null, new C0406i(this, interfaceC7559c, 7), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2045e(bs.C0751i r49, zr.C9034d r50, ww.AbstractC8193c r51) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0751i.m2045e(bs.i, zr.d, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2046f(bs.C0751i r50, com.websoptimization.callyzerbiz.data.model.request.LeadDetails r51, ww.AbstractC8193c r52) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0751i.m2046f(bs.i, com.websoptimization.callyzerbiz.data.model.request.LeadDetails, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public static final void m2048h(C0751i c0751i) {
        Object value;
        C9034d c9034d;
        InterfaceC7559c interfaceC7559c;
        m1 m1Var = c0751i.f4731E;
        do {
            value = m1Var.getValue();
            c9034d = (C9034d) value;
            interfaceC7559c = null;
        } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, true, false, null, false, false, null, false, null, false, null, null, null, null, null, -16777217, 511), null, 5)));
        tx.c0.m13502y(c0751i.f4753p, null, null, new C0745c(c0751i, interfaceC7559c, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2050j(bs.C0751i r54, ww.AbstractC8193c r55) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.C0751i.m2050j(bs.i, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public final void m2051k(List list, boolean z6) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList = this.f4728B;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i10 = -1;
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                if (AbstractC4154l.m8918a(((C0429b) obj).f3151a, str)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                arrayList.add(new C0429b(str, z6));
            } else if (z6) {
                arrayList.set(i10, C0429b.m1452a((C0429b) arrayList.get(i10), true));
            }
            if (z6) {
                ArrayList arrayList2 = this.f4730D;
                if (!arrayList2.contains(str)) {
                    arrayList2.add(str);
                }
            }
        }
    }

    /* renamed from: l */
    public final List m2052l(String str) {
        ArrayList arrayList = this.f4728B;
        if (str == null || str.length() == 0) {
            return AbstractC6663m.c0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = ((C0429b) obj).f3151a;
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
            if (AbstractC5178p.m10116x(lowerCase, lowerCase2, false)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC6663m.c0(arrayList2);
    }

    /* renamed from: m */
    public final C0983a m2053m(int i10, String str) {
        int i11 = 0;
        try {
            ArrayList arrayListM11031a = wc.m11031a();
            int size = arrayListM11031a.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListM11031a.get(i12);
                i12++;
                C0983a c0983a = (C0983a) obj;
                boolean zM8918a = AbstractC4154l.m8918a(AbstractC5178p.g0(c0983a.f5813b).toString(), AbstractC5178p.g0("+" + i10).toString());
                boolean zM10130l = AbstractC5185w.m10130l(AbstractC5178p.g0(c0983a.f5815d).toString(), AbstractC5178p.g0(str).toString(), true);
                if (zM8918a && zM10130l) {
                    return (C0983a) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            StringBuilder sbM14337q = a1.m14337q(i10, "countryCode ", " with region ", str, " not matched, returning first matching countryData with country: ");
            sbM14337q.append(i10);
            this.f4740c.m16231f(sbM14337q.toString());
            ArrayList arrayListM11031a2 = wc.m11031a();
            int size2 = arrayListM11031a2.size();
            while (i11 < size2) {
                Object obj2 = arrayListM11031a2.get(i11);
                i11++;
                C0983a c0983a2 = (C0983a) obj2;
                System.out.println((Object) ("matching country: " + c0983a2.f5813b + " and " + i10));
                if (c0983a2.f5813b.equals(AbstractC5178p.g0("+" + i10).toString())) {
                    return c0983a2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: n */
    public final void m2054n() {
        m1 m1Var;
        Object value;
        C9034d c9034d;
        InterfaceC7559c interfaceC7559c;
        do {
            m1Var = this.f4731E;
            value = m1Var.getValue();
            c9034d = (C9034d) value;
            interfaceC7559c = null;
        } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, true, false, null, false, false, null, false, null, false, null, null, null, null, null, -16777217, 511), null, 5)));
        ArrayList arrayList = new ArrayList();
        C0745c c0745c = new C0745c(this, interfaceC7559c, 2);
        C8810d c8810d = this.f4753p;
        g0 g0VarM13482e = tx.c0.m13482e(c8810d, null, c0745c, 3);
        g0 g0VarM13482e2 = tx.c0.m13482e(c8810d, null, new C0745c(this, interfaceC7559c, 3), 3);
        arrayList.add(g0VarM13482e);
        arrayList.add(g0VarM13482e2);
        tx.c0.m13502y(c8810d, null, null, new C0372k(this, arrayList, interfaceC7559c, 11), 3);
    }

    /* renamed from: o */
    public final String m2055o(int i10, Object... objArr) {
        String string = this.f4739b.getString(i10, Arrays.copyOf(objArr, objArr.length));
        AbstractC4154l.m8922e(string, "getString(...)");
        return string;
    }

    /* renamed from: p */
    public final void m2056p(AbstractC4865g event) {
        Object value;
        C9034d c9034d;
        Object value2;
        C9034d c9034d2;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C4860b;
        wx.w0 w0Var = this.f4732F;
        if (z6) {
            C4860b c4860b = (C4860b) event;
            int i10 = c4860b.f24368b;
            Object objMo11151c = ((C5438a) ((C9034d) w0Var.f39340a.getValue()).f43541b.f43510d.get(i10)).f27346a.mo11151c();
            AbstractC4154l.m8921d(objMo11151c, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>");
            List<C5454q> list = (List) objMo11151c;
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
            for (C5454q c5454qM11181a : list) {
                if (AbstractC4154l.m8918a(c5454qM11181a.f27492b, c4860b.f24367a.f27492b)) {
                    c5454qM11181a = C5454q.m11181a(c5454qM11181a, !c5454qM11181a.f27493c);
                }
                arrayList.add(c5454qM11181a);
            }
            m2056p(new C4859a(i10, arrayList));
            return;
        }
        if (event instanceof C4864f) {
            C4864f c4864f = (C4864f) event;
            m2056p(new C4859a(c4864f.f24374b, c4864f.f24373a));
            return;
        }
        boolean z10 = false;
        if (event instanceof C4861c) {
            C4861c c4861c = (C4861c) event;
            C5454q c5454q = c4861c.f24369a;
            int i11 = c4861c.f24370b;
            if (AbstractC4154l.m8918a(c5454q.f27492b, "select " + ((C5438a) ((C9034d) w0Var.f39340a.getValue()).f43541b.f43510d.get(i11)).f27346a.mo11152d())) {
                Object objMo11151c2 = ((C5438a) ((C9034d) w0Var.f39340a.getValue()).f43541b.f43510d.get(i11)).f27346a.mo11151c();
                AbstractC4154l.m8921d(objMo11151c2, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>");
                List list2 = (List) objMo11151c2;
                ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C5454q.m11181a((C5454q) it.next(), false));
                }
                m2056p(new C4859a(i11, arrayList2));
                return;
            }
            Object objMo11151c3 = ((C5438a) ((C9034d) w0Var.f39340a.getValue()).f43541b.f43510d.get(i11)).f27346a.mo11151c();
            AbstractC4154l.m8921d(objMo11151c3, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>");
            List<C5454q> list3 = (List) objMo11151c3;
            ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(list3, 10));
            for (C5454q c5454q2 : list3) {
                arrayList3.add(C5454q.m11181a(c5454q2, AbstractC4154l.m8918a(c5454q2.f27492b, c5454q.f27492b)));
            }
            m2056p(new C4859a(i11, arrayList3));
            return;
        }
        boolean z11 = event instanceof C4863e;
        InterfaceC7559c interfaceC7559c = null;
        m1 m1Var = this.f4731E;
        if (z11) {
            if (this.f4762y) {
                return;
            }
            this.f4762y = true;
            do {
                value2 = m1Var.getValue();
                c9034d2 = (C9034d) value2;
            } while (!m1Var.m15397i(value2, C9034d.m16498a(c9034d2, null, C9032b.m16496a(c9034d2.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, true, null, false, false, null, false, null, false, null, null, null, null, null, -33554433, 511), null, 5)));
            if (!m2061u()) {
                tx.c0.m13502y(q0.m5340g(this), null, null, new C0744b(this, interfaceC7559c, 1), 3);
                this.f4762y = false;
                return;
            }
            C9034d c9034d3 = (C9034d) w0Var.f39340a.getValue();
            ArrayList arrayListM11031a = wc.m11031a();
            int size = arrayListM11031a.size();
            int i12 = 0;
            Object obj = null;
            while (i12 < size) {
                Object obj2 = arrayListM11031a.get(i12);
                i12++;
                if (AbstractC4154l.m8918a(((C0983a) obj2).f5815d, yc.m11065a(this.f4739b))) {
                    if (z10) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z10 = true;
                    obj = obj2;
                }
            }
            if (!z10) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            tx.c0.m13502y(this.f4753p, null, null, new C0381t(this, ((C0983a) obj).f5815d, c9034d3, event, null, 2), 3);
            return;
        }
        if (event instanceof C4862d) {
            m2054n();
            return;
        }
        if (!(event instanceof C4859a)) {
            throw new NoWhenBranchMatchedException();
        }
        C4859a c4859a = (C4859a) event;
        Object obj3 = c4859a.f24365a;
        if (obj3 != null) {
            final int i13 = c4859a.f24366b;
            final ArrayList arrayListD0 = AbstractC6663m.d0(((C9034d) w0Var.f39340a.getValue()).f43541b.f43510d);
            final C4168z c4168z = new C4168z();
            c4168z.f21164a = "";
            final C4164v c4164v = new C4164v();
            AbstractC5453p abstractC5453p = ((C5438a) arrayListD0.get(i13)).f27346a;
            final int i14 = 0;
            InterfaceC2139c interfaceC2139c = new InterfaceC2139c(this) { // from class: bs.a

                /* renamed from: b */
                public final /* synthetic */ C0751i f4692b;

                {
                    this.f4692b = this;
                }

                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj4) {
                    Integer num;
                    Integer num2;
                    Integer num3;
                    AbstractC5453p updatedFieldType = (AbstractC5453p) obj4;
                    switch (i14) {
                        case 0:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i = this.f4692b;
                            c0751i.f4749l.getClass();
                            C2992e c2992eM391j = C0174b.m391j(updatedFieldType);
                            boolean z12 = c2992eM391j.f16133a;
                            C4168z c4168z2 = c4168z;
                            C4164v c4164v2 = c4164v;
                            if (!z12 && (num = c2992eM391j.f16134b) != null) {
                                int iIntValue = num.intValue();
                                Object objMo11152d = c2992eM391j.f16135c;
                                if (objMo11152d == null) {
                                    objMo11152d = updatedFieldType.mo11152d();
                                }
                                c4168z2.f21164a = c0751i.m2055o(iIntValue, objMo11152d);
                                c4164v2.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z2.f21164a);
                            ArrayList arrayList4 = arrayListD0;
                            int i15 = i13;
                            Object obj5 = arrayList4.get(i15);
                            AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.String>");
                            arrayList4.set(i15, C5438a.m11146a(updatedFieldType, c4164v2.f21160a));
                            break;
                        case 1:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i2 = this.f4692b;
                            c0751i2.f4749l.getClass();
                            C2992e c2992eM391j2 = C0174b.m391j(updatedFieldType);
                            boolean z13 = c2992eM391j2.f16133a;
                            C4168z c4168z3 = c4168z;
                            C4164v c4164v3 = c4164v;
                            if (!z13 && (num2 = c2992eM391j2.f16134b) != null) {
                                int iIntValue2 = num2.intValue();
                                Object objMo11152d2 = c2992eM391j2.f16135c;
                                if (objMo11152d2 == null) {
                                    objMo11152d2 = updatedFieldType.mo11152d();
                                }
                                c4168z3.f21164a = c0751i2.m2055o(iIntValue2, objMo11152d2);
                                c4164v3.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z3.f21164a);
                            ArrayList arrayList5 = arrayListD0;
                            int i16 = i13;
                            Object obj6 = arrayList5.get(i16);
                            AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>>");
                            arrayList5.set(i16, C5438a.m11146a(updatedFieldType, c4164v3.f21160a));
                            break;
                        default:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i3 = this.f4692b;
                            c0751i3.f4749l.getClass();
                            C2992e c2992eM391j3 = C0174b.m391j(updatedFieldType);
                            boolean z14 = c2992eM391j3.f16133a;
                            C4168z c4168z4 = c4168z;
                            C4164v c4164v4 = c4164v;
                            if (!z14 && (num3 = c2992eM391j3.f16134b) != null) {
                                int iIntValue3 = num3.intValue();
                                Object objMo11152d3 = c2992eM391j3.f16135c;
                                if (objMo11152d3 == null) {
                                    objMo11152d3 = updatedFieldType.mo11152d();
                                }
                                c4168z4.f21164a = c0751i3.m2055o(iIntValue3, objMo11152d3);
                                c4164v4.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z4.f21164a);
                            ArrayList arrayList6 = arrayListD0;
                            int i17 = i13;
                            Object obj7 = arrayList6.get(i17);
                            AbstractC4154l.m8921d(obj7, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.Long>");
                            arrayList6.set(i17, C5438a.m11146a(updatedFieldType, c4164v4.f21160a));
                            break;
                    }
                    return a0.f30746a;
                }
            };
            final int i15 = 1;
            InterfaceC2139c interfaceC2139c2 = new InterfaceC2139c(this) { // from class: bs.a

                /* renamed from: b */
                public final /* synthetic */ C0751i f4692b;

                {
                    this.f4692b = this;
                }

                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj4) {
                    Integer num;
                    Integer num2;
                    Integer num3;
                    AbstractC5453p updatedFieldType = (AbstractC5453p) obj4;
                    switch (i15) {
                        case 0:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i = this.f4692b;
                            c0751i.f4749l.getClass();
                            C2992e c2992eM391j = C0174b.m391j(updatedFieldType);
                            boolean z12 = c2992eM391j.f16133a;
                            C4168z c4168z2 = c4168z;
                            C4164v c4164v2 = c4164v;
                            if (!z12 && (num = c2992eM391j.f16134b) != null) {
                                int iIntValue = num.intValue();
                                Object objMo11152d = c2992eM391j.f16135c;
                                if (objMo11152d == null) {
                                    objMo11152d = updatedFieldType.mo11152d();
                                }
                                c4168z2.f21164a = c0751i.m2055o(iIntValue, objMo11152d);
                                c4164v2.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z2.f21164a);
                            ArrayList arrayList4 = arrayListD0;
                            int i152 = i13;
                            Object obj5 = arrayList4.get(i152);
                            AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.String>");
                            arrayList4.set(i152, C5438a.m11146a(updatedFieldType, c4164v2.f21160a));
                            break;
                        case 1:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i2 = this.f4692b;
                            c0751i2.f4749l.getClass();
                            C2992e c2992eM391j2 = C0174b.m391j(updatedFieldType);
                            boolean z13 = c2992eM391j2.f16133a;
                            C4168z c4168z3 = c4168z;
                            C4164v c4164v3 = c4164v;
                            if (!z13 && (num2 = c2992eM391j2.f16134b) != null) {
                                int iIntValue2 = num2.intValue();
                                Object objMo11152d2 = c2992eM391j2.f16135c;
                                if (objMo11152d2 == null) {
                                    objMo11152d2 = updatedFieldType.mo11152d();
                                }
                                c4168z3.f21164a = c0751i2.m2055o(iIntValue2, objMo11152d2);
                                c4164v3.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z3.f21164a);
                            ArrayList arrayList5 = arrayListD0;
                            int i16 = i13;
                            Object obj6 = arrayList5.get(i16);
                            AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>>");
                            arrayList5.set(i16, C5438a.m11146a(updatedFieldType, c4164v3.f21160a));
                            break;
                        default:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i3 = this.f4692b;
                            c0751i3.f4749l.getClass();
                            C2992e c2992eM391j3 = C0174b.m391j(updatedFieldType);
                            boolean z14 = c2992eM391j3.f16133a;
                            C4168z c4168z4 = c4168z;
                            C4164v c4164v4 = c4164v;
                            if (!z14 && (num3 = c2992eM391j3.f16134b) != null) {
                                int iIntValue3 = num3.intValue();
                                Object objMo11152d3 = c2992eM391j3.f16135c;
                                if (objMo11152d3 == null) {
                                    objMo11152d3 = updatedFieldType.mo11152d();
                                }
                                c4168z4.f21164a = c0751i3.m2055o(iIntValue3, objMo11152d3);
                                c4164v4.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z4.f21164a);
                            ArrayList arrayList6 = arrayListD0;
                            int i17 = i13;
                            Object obj7 = arrayList6.get(i17);
                            AbstractC4154l.m8921d(obj7, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.Long>");
                            arrayList6.set(i17, C5438a.m11146a(updatedFieldType, c4164v4.f21160a));
                            break;
                    }
                    return a0.f30746a;
                }
            };
            final int i16 = 2;
            InterfaceC2139c interfaceC2139c3 = new InterfaceC2139c(this) { // from class: bs.a

                /* renamed from: b */
                public final /* synthetic */ C0751i f4692b;

                {
                    this.f4692b = this;
                }

                @Override // ex.InterfaceC2139c
                public final Object invoke(Object obj4) {
                    Integer num;
                    Integer num2;
                    Integer num3;
                    AbstractC5453p updatedFieldType = (AbstractC5453p) obj4;
                    switch (i16) {
                        case 0:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i = this.f4692b;
                            c0751i.f4749l.getClass();
                            C2992e c2992eM391j = C0174b.m391j(updatedFieldType);
                            boolean z12 = c2992eM391j.f16133a;
                            C4168z c4168z2 = c4168z;
                            C4164v c4164v2 = c4164v;
                            if (!z12 && (num = c2992eM391j.f16134b) != null) {
                                int iIntValue = num.intValue();
                                Object objMo11152d = c2992eM391j.f16135c;
                                if (objMo11152d == null) {
                                    objMo11152d = updatedFieldType.mo11152d();
                                }
                                c4168z2.f21164a = c0751i.m2055o(iIntValue, objMo11152d);
                                c4164v2.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z2.f21164a);
                            ArrayList arrayList4 = arrayListD0;
                            int i152 = i13;
                            Object obj5 = arrayList4.get(i152);
                            AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.String>");
                            arrayList4.set(i152, C5438a.m11146a(updatedFieldType, c4164v2.f21160a));
                            break;
                        case 1:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i2 = this.f4692b;
                            c0751i2.f4749l.getClass();
                            C2992e c2992eM391j2 = C0174b.m391j(updatedFieldType);
                            boolean z13 = c2992eM391j2.f16133a;
                            C4168z c4168z3 = c4168z;
                            C4164v c4164v3 = c4164v;
                            if (!z13 && (num2 = c2992eM391j2.f16134b) != null) {
                                int iIntValue2 = num2.intValue();
                                Object objMo11152d2 = c2992eM391j2.f16135c;
                                if (objMo11152d2 == null) {
                                    objMo11152d2 = updatedFieldType.mo11152d();
                                }
                                c4168z3.f21164a = c0751i2.m2055o(iIntValue2, objMo11152d2);
                                c4164v3.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z3.f21164a);
                            ArrayList arrayList5 = arrayListD0;
                            int i162 = i13;
                            Object obj6 = arrayList5.get(i162);
                            AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>>");
                            arrayList5.set(i162, C5438a.m11146a(updatedFieldType, c4164v3.f21160a));
                            break;
                        default:
                            AbstractC4154l.m8923f(updatedFieldType, "updatedFieldType");
                            C0751i c0751i3 = this.f4692b;
                            c0751i3.f4749l.getClass();
                            C2992e c2992eM391j3 = C0174b.m391j(updatedFieldType);
                            boolean z14 = c2992eM391j3.f16133a;
                            C4168z c4168z4 = c4168z;
                            C4164v c4164v4 = c4164v;
                            if (!z14 && (num3 = c2992eM391j3.f16134b) != null) {
                                int iIntValue3 = num3.intValue();
                                Object objMo11152d3 = c2992eM391j3.f16135c;
                                if (objMo11152d3 == null) {
                                    objMo11152d3 = updatedFieldType.mo11152d();
                                }
                                c4168z4.f21164a = c0751i3.m2055o(iIntValue3, objMo11152d3);
                                c4164v4.f21160a = true;
                            }
                            updatedFieldType.mo11157i((String) c4168z4.f21164a);
                            ArrayList arrayList6 = arrayListD0;
                            int i17 = i13;
                            Object obj7 = arrayList6.get(i17);
                            AbstractC4154l.m8921d(obj7, "null cannot be cast to non-null type com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.DynamicLeadField<kotlin.Long>");
                            arrayList6.set(i17, C5438a.m11146a(updatedFieldType, c4164v4.f21160a));
                            break;
                    }
                    return a0.f30746a;
                }
            };
            if (abstractC5453p instanceof C5446i) {
                interfaceC2139c.invoke(((C5446i) abstractC5453p).mo11158j(f9.m11631e((String) obj3)));
            } else if (abstractC5453p instanceof C5444g) {
                interfaceC2139c.invoke(((C5444g) abstractC5453p).mo11158j(f9.m11631e((String) obj3)));
            } else if (abstractC5453p instanceof C5449l) {
                interfaceC2139c.invoke(((C5449l) abstractC5453p).mo11158j(f9.m11631e((String) obj3)));
            } else if (abstractC5453p instanceof C5451n) {
                interfaceC2139c.invoke(((C5451n) abstractC5453p).mo11158j((String) obj3));
            } else if (abstractC5453p instanceof C5452o) {
                interfaceC2139c.invoke(((C5452o) abstractC5453p).mo11158j(f9.m11631e((String) obj3)));
            } else if (abstractC5453p instanceof C5440c) {
                interfaceC2139c2.invoke(((C5440c) abstractC5453p).mo11158j((List) obj3));
            } else if (abstractC5453p instanceof C5443f) {
                interfaceC2139c2.invoke(C5443f.m11164k((C5443f) abstractC5453p, (List) obj3, null, false, 223));
            } else if (abstractC5453p instanceof C5447j) {
                interfaceC2139c2.invoke(C5447j.m11170k((C5447j) abstractC5453p, (List) obj3, null, false, 223));
            } else if (abstractC5453p instanceof C5450m) {
                interfaceC2139c2.invoke(((C5450m) abstractC5453p).mo11158j((List) obj3));
            } else if (abstractC5453p instanceof C5441d) {
                interfaceC2139c3.invoke(((C5441d) abstractC5453p).m11161l(((Long) obj3).longValue()));
            } else if (!(abstractC5453p instanceof C5442e) && !(abstractC5453p instanceof C5445h) && !(abstractC5453p instanceof C5448k)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = m1Var.getValue();
                c9034d = (C9034d) value;
            } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.f43541b, null, null, false, arrayListD0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -9, 511), null, 5)));
        }
    }

    /* renamed from: q */
    public final void m2057q(AbstractC8761t event) throws NumberFormatException {
        Object value;
        C9034d c9034d;
        OffsetDateTime offsetDateTimeAtOffset;
        Instant instant;
        Object value2;
        C9034d c9034d2;
        Object value3;
        C9034d c9034d3;
        Object value4;
        C9034d c9034d4;
        Object value5;
        C9034d c9034d5;
        Object value6;
        C9034d c9034d6;
        Object value7;
        C9034d c9034d7;
        EnumC3313o enumC3313o;
        Object value8;
        C9034d c9034d8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        C9034d c9034d9;
        Object value14;
        C9034d c9034d10;
        C8742a c8742a;
        Object value15;
        C9034d c9034d11;
        C9032b c9032bM16499b;
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        Object value16;
        C9034d c9034d12;
        C8752k c8752k;
        Object value17;
        C9034d c9034d13;
        C9032b c9032bM16499b2;
        String str4;
        Object value18;
        C9034d c9034d14;
        C9032b c9032bM16499b3;
        Object value19;
        C9034d c9034d15;
        C9032b c9032bM16499b4;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C8753l;
        int i12 = 5;
        C7454y c7454y = this.f4742e;
        InterfaceC7559c interfaceC7559c = null;
        m1 m1Var = this.f4731E;
        if (z6) {
            String strM11631e = f9.m11631e(((C8753l) event).f42372a);
            do {
                value19 = m1Var.getValue();
                c9034d15 = (C9034d) value19;
                c9032bM16499b4 = c9034d15.m16499b();
                c7454y.getClass();
            } while (!m1Var.m15397i(value19, C9034d.m16498a(c9034d15, null, C9032b.m16496a(c9032bM16499b4, null, null, false, null, null, null, strM11631e, null, C7454y.m14192d(strM11631e).f21089b, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -321, 511), null, 5)));
            return;
        }
        if (event instanceof C8754m) {
            String strM11631e2 = f9.m11631e(((C8754m) event).f42373a);
            do {
                value18 = m1Var.getValue();
                c9034d14 = (C9034d) value18;
                c9032bM16499b3 = c9034d14.m16499b();
                c7454y.getClass();
            } while (!m1Var.m15397i(value18, C9034d.m16498a(c9034d14, null, C9032b.m16496a(c9032bM16499b3, null, null, false, null, null, null, null, null, null, C7454y.m14191c(strM11631e2).f21089b, null, null, false, false, null, null, strM11631e2, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -66049, 511), null, 5)));
            return;
        }
        boolean z10 = event instanceof C8755n;
        wx.w0 w0Var = this.f4732F;
        if (z10) {
            int i13 = ((C9034d) w0Var.getValue()).m16499b().f43525s;
            do {
                value17 = m1Var.getValue();
                c9034d13 = (C9034d) value17;
                c9032bM16499b2 = c9034d13.m16499b();
                str4 = ((C8755n) event).f42374a;
                this.f4744g.getClass();
            } while (!m1Var.m15397i(value17, C9034d.m16498a(c9034d13, null, C9032b.m16496a(c9032bM16499b2, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, str4, 0, C7455z.m14217b(i13, str4).f21089b, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -655361, 511), null, 5)));
            return;
        }
        if (event instanceof C8752k) {
            do {
                value16 = m1Var.getValue();
                c9034d12 = (C9034d) value16;
                c8752k = (C8752k) event;
            } while (!m1Var.m15397i(value16, C9034d.m16498a(c9034d12, null, C9032b.m16496a(c9034d12.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, Integer.parseInt(AbstractC5185w.m10136r(c8752k.f42371a.f5813b, "+", "")), null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, c8752k.f42371a, null, null, -262145, 447), null, 5)));
            return;
        }
        if (event instanceof C8743b) {
            do {
                value15 = m1Var.getValue();
                c9034d11 = (C9034d) value15;
                c9032bM16499b = c9034d11.m16499b();
                str = ((C8743b) event).f42352a;
                str2 = ((C9034d) w0Var.getValue()).m16499b().f43524r;
                i10 = Integer.parseInt(AbstractC5178p.g0(f9.m11632f(((C9034d) w0Var.getValue()).m16499b().f43505N.f5813b)).toString());
                i11 = ((C9034d) w0Var.getValue()).m16499b().f43525s;
                str3 = ((C9034d) w0Var.getValue()).m16499b().f43505N.f5815d;
                this.f4745h.getClass();
            } while (!m1Var.m15397i(value15, C9034d.m16498a(c9034d11, null, C9032b.m16496a(c9032bM16499b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, C0689a.m1985m(i10, i11, str, str2, str3).f21089b, str, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -6291457, 511), null, 5)));
            return;
        }
        if (event instanceof C8742a) {
            do {
                value14 = m1Var.getValue();
                c9034d10 = (C9034d) value14;
                c8742a = (C8742a) event;
            } while (!m1Var.m15397i(value14, C9034d.m16498a(c9034d10, null, C9032b.m16496a(c9034d10.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, Integer.parseInt(AbstractC5185w.m10136r(c8742a.f42351a.f5813b, "+", "")), null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, c8742a.f42351a, null, -1048577, 383), null, 5)));
            return;
        }
        if (event instanceof C8745d) {
            do {
                value13 = m1Var.getValue();
                c9034d9 = (C9034d) value13;
            } while (!m1Var.m15397i(value13, C9034d.m16498a(c9034d9, null, C9032b.m16496a(c9034d9.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, ((C8745d) event).f42356a, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -4097, 511), null, 5)));
            return;
        }
        if (event instanceof C8747f) {
            C8747f c8747f = (C8747f) event;
            if (AbstractC4154l.m8918a(c8747f.f42360a, this.f4738L)) {
                do {
                    value11 = m1Var.getValue();
                } while (!m1Var.m15397i(value11, C9034d.m16498a((C9034d) value11, null, C9032b.m16496a(((C9034d) w0Var.getValue()).m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -24609, 511), null, 5)));
                return;
            } else {
                C9032b c9032bM16496a = C9032b.m16496a(C9032b.m16496a(((C9034d) w0Var.getValue()).m16499b(), null, null, false, null, null, c8747f.f42360a, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -32801, 511), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -24577, 511);
                do {
                    value12 = m1Var.getValue();
                } while (!m1Var.m15397i(value12, C9034d.m16498a((C9034d) value12, null, c9032bM16496a, null, 5)));
                return;
            }
        }
        if (event instanceof C8746e) {
            C9032b c9032bM16496a2 = C9032b.m16496a(((C9034d) w0Var.getValue()).m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, ((C8746e) event).f42358a, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -8193, 511);
            C9032b c9032bM16496a3 = !c9032bM16496a2.f43520n ? C9032b.m16496a(c9032bM16496a2, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -16385, 511) : c9032bM16496a2;
            do {
                value10 = m1Var.getValue();
            } while (!m1Var.m15397i(value10, C9034d.m16498a((C9034d) value10, null, c9032bM16496a3, null, 5)));
            return;
        }
        if (event instanceof C8748g) {
            C9032b c9032bM16499b5 = ((C9034d) w0Var.getValue()).m16499b();
            C8800o c8800o = C8800o.f42459a;
            LocalDateTime localDateTime = ((C8748g) event).f42362a;
            C9032b c9032bM16496a4 = C8800o.m16184H(localDateTime) <= System.currentTimeMillis() ? C9032b.m16496a(c9032bM16499b5, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, Integer.valueOf(R.string.select_valid_reminder_time), null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -32769, 511) : C9032b.m16496a(c9032bM16499b5, null, null, false, null, null, null, null, null, null, null, null, null, false, false, localDateTime, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -49153, 511);
            do {
                value9 = m1Var.getValue();
            } while (!m1Var.m15397i(value9, C9034d.m16498a((C9034d) value9, null, c9032bM16496a4, null, 5)));
            return;
        }
        boolean z11 = event instanceof C8744c;
        C6668r c6668r = C6668r.f31943a;
        int i14 = 1;
        if (z11) {
            C8744c c8744c = (C8744c) event;
            EnumC3313o enumC3313o2 = c8744c.f42354a;
            this.f4743f.getClass();
            C4132l c4132lM16036l = C8687a.m16036l(enumC3313o2);
            while (true) {
                Object value20 = m1Var.getValue();
                C9034d c9034d16 = (C9034d) value20;
                C9032b c9032bM16496a5 = C9032b.m16496a(c9034d16.m16499b(), null, null, false, null, null, null, null, null, null, null, c4132lM16036l.f21089b, c8744c.f42354a, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -3073, 511);
                C9031a c9031a = c9034d16.f43542c;
                enumC3313o = EnumC3313o.SpecificEmployee;
                C8744c c8744c2 = c8744c;
                if (m1Var.m15397i(value20, C9034d.m16498a(c9034d16, null, c9032bM16496a5, C9031a.m16495a(c9031a, null, null, null, null, null, false, enumC3313o2 == enumC3313o, false, 191), 1))) {
                    break;
                } else {
                    c8744c = c8744c2;
                }
            }
            if (enumC3313o2 != enumC3313o) {
                List list = ((C9034d) m1Var.getValue()).f43542c.f43484a;
                ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C0428a.m1451a((C0428a) it.next(), false));
                }
                do {
                    value8 = m1Var.getValue();
                    c9034d8 = (C9034d) value8;
                } while (!m1Var.m15397i(value8, C9034d.m16498a(c9034d8, null, null, C9031a.m16495a(c9034d8.f43542c, arrayList, c6668r, arrayList, arrayList, null, false, false, false, 240), 3)));
                return;
            }
            return;
        }
        if (event instanceof C8760s) {
            do {
                value7 = m1Var.getValue();
                c9034d7 = (C9034d) value7;
            } while (!m1Var.m15397i(value7, C9034d.m16498a(c9034d7, null, C9032b.m16496a(c9034d7.m16499b(), null, ((C8760s) event).f42379a, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -3, 511), null, 5)));
            return;
        }
        boolean z12 = event instanceof C8749h;
        C8810d c8810d = this.f4753p;
        if (z12) {
            do {
                value6 = m1Var.getValue();
                c9034d6 = (C9034d) value6;
            } while (!m1Var.m15397i(value6, C9034d.m16498a(c9034d6, null, C9032b.m16496a(c9034d6.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, new C6361k(Boolean.FALSE, c6668r), false, null, false, null, null, null, null, null, -1375731713, 511), null, 5)));
            if (((C8749h) event).f42364a) {
                tx.c0.m13502y(c8810d, null, null, new C0745c(this, interfaceC7559c, i12), 3);
                return;
            }
            return;
        }
        if (event instanceof C8750i) {
            do {
                value5 = m1Var.getValue();
                c9034d5 = (C9034d) value5;
            } while (!m1Var.m15397i(value5, C9034d.m16498a(c9034d5, null, C9032b.m16496a(c9034d5.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, Integer.MAX_VALUE, 511), null, 5)));
            return;
        }
        if (event instanceof C8759r) {
            tx.c0.m13502y(c8810d, null, null, new C0744b(this, interfaceC7559c, 2), 3);
            do {
                value4 = m1Var.getValue();
                c9034d4 = (C9034d) value4;
            } while (!m1Var.m15397i(value4, C9034d.m16498a(c9034d4, null, C9032b.m16496a(c9034d4.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, Integer.MAX_VALUE, 511), null, 5)));
            return;
        }
        if (event instanceof C8758q) {
            do {
                value3 = m1Var.getValue();
                c9034d3 = (C9034d) value3;
            } while (!m1Var.m15397i(value3, C9034d.m16498a(c9034d3, null, C9032b.m16496a(c9034d3.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -1, 501), null, 5)));
            LeadByNumberResponse leadByNumberResponse = this.f4761x;
            if (leadByNumberResponse != null) {
                m2060t(leadByNumberResponse);
                return;
            } else {
                AbstractC4154l.m8928k("getLeadByNumberResponse");
                throw null;
            }
        }
        if (event instanceof C8751j) {
            do {
                value2 = m1Var.getValue();
                c9034d2 = (C9034d) value2;
            } while (!m1Var.m15397i(value2, C9034d.m16498a(c9034d2, null, C9032b.m16496a(c9034d2.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -1, 509), null, 5)));
        } else if (AbstractC4154l.m8918a(event, C8756o.f42375a)) {
            Object obj = this.f4747j.f38725c;
            r3.f40778i = null;
        } else {
            if (!AbstractC4154l.m8918a(event, C8757p.f42376a)) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            Long lValueOf = (localDateTimeNow == null || (offsetDateTimeAtOffset = localDateTimeNow.atOffset(ZoneOffset.UTC)) == null || (instant = offsetDateTimeAtOffset.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
            Locale locale = Locale.getDefault();
            AbstractC4154l.m8922e(locale, "getDefault(...)");
            h4 h4VarM6144d = f4.m6144d(locale, lValueOf, new C0458a(i14), 28);
            do {
                value = m1Var.getValue();
                c9034d = (C9034d) value;
            } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.m16499b(), null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, h4VarM6144d, -16385, 255), null, 5)));
        }
    }

    /* renamed from: r */
    public final void m2058r(k0 event) {
        Object value;
        C9034d c9034d;
        Object obj;
        Object value2;
        C9034d c9034d2;
        C9033c c9033c;
        Object value3;
        C9034d c9034d3;
        Object value4;
        C9034d c9034d4;
        C9033c c9033c2;
        Object value5;
        C9034d c9034d5;
        C9033c c9033c3;
        boolean z6;
        Object value6;
        C9034d c9034d6;
        Object value7;
        C9034d c9034d7;
        Object value8;
        C9034d c9034d8;
        Object value9;
        C9034d c9034d9;
        AbstractC4154l.m8923f(event, "event");
        boolean z10 = event instanceof yr.c0;
        int i10 = 6;
        m1 m1Var = this.f4731E;
        InterfaceC7559c interfaceC7559c = null;
        if (z10) {
            if (this.f4735I) {
                do {
                    value9 = m1Var.getValue();
                    c9034d9 = (C9034d) value9;
                } while (!m1Var.m15397i(value9, C9034d.m16498a(c9034d9, C9033c.m16497a(c9034d9.f43540a, false, true, null, null, null, null, false, 125), null, null, 6)));
                C0496f c0496f = m0.f34659a;
                tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0745c(this, interfaceC7559c, i10), 3);
                return;
            }
            return;
        }
        boolean zEquals = event.equals(d0.f42357a);
        ArrayList arrayList = this.f4728B;
        if (zEquals) {
            this.f4729C = AbstractC6663m.c0(arrayList);
            return;
        }
        if (event.equals(e0.f42359a)) {
            do {
                value8 = m1Var.getValue();
                c9034d8 = (C9034d) value8;
            } while (!m1Var.m15397i(value8, C9034d.m16498a(c9034d8, C9033c.m16497a(c9034d8.f43540a, false, false, null, null, m2052l(null), null, false, 33), null, null, 6)));
            return;
        }
        if (event.equals(yr.g0.f42363a)) {
            do {
                value7 = m1Var.getValue();
                c9034d7 = (C9034d) value7;
            } while (!m1Var.m15397i(value7, C9034d.m16498a(c9034d7, C9033c.m16497a(c9034d7.f43540a, false, false, null, null, m2052l(null), null, false, 41), null, null, 6)));
            return;
        }
        int i11 = 0;
        if (event instanceof h0) {
            String name = ((h0) event).f42365a;
            this.f4746i.getClass();
            AbstractC4154l.m8923f(name, "name");
            Pattern patternCompile = Pattern.compile("[;\",^=?|~`!\\{\\}\\[\\]<>\\\\]");
            AbstractC4154l.m8922e(patternCompile, "compile(...)");
            C4132l c4132l = patternCompile.matcher(name).find() ? new C4132l(false, Integer.valueOf(R.string.special_char_not_allow)) : new C4132l();
            Integer num = c4132l.f21089b;
            if (num != null) {
                do {
                    value6 = m1Var.getValue();
                    c9034d6 = (C9034d) value6;
                } while (!m1Var.m15397i(value6, C9034d.m16498a(c9034d6, C9033c.m16497a(c9034d6.f43540a, false, false, name, num, null, null, false, 115), null, null, 6)));
            }
            if (c4132l.f21088a) {
                List listM2052l = m2052l(name);
                do {
                    value5 = m1Var.getValue();
                    c9034d5 = (C9034d) value5;
                    c9033c3 = c9034d5.f43540a;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            String str = ((C0429b) obj2).f3151a;
                            Locale locale = Locale.ROOT;
                            String lowerCase = str.toLowerCase(locale);
                            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                            String lowerCase2 = name.toLowerCase(locale);
                            AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                            if (lowerCase.equals(lowerCase2)) {
                                z6 = false;
                                break;
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                } while (!m1Var.m15397i(value5, C9034d.m16498a(c9034d5, C9033c.m16497a(c9033c3, false, false, name, null, listM2052l, null, z6, 33), null, null, 6)));
                return;
            }
            return;
        }
        boolean z11 = event instanceof i0;
        ArrayList arrayList2 = this.f4730D;
        if (z11) {
            int size2 = arrayList.size();
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    i13 = -1;
                    break;
                }
                Object obj3 = arrayList.get(i14);
                i14++;
                if (AbstractC4154l.m8918a(((C0429b) obj3).f3151a, ((i0) event).f42367a)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0) {
                arrayList.set(i13, C0429b.m1452a((C0429b) arrayList.get(i13), false));
                arrayList2.remove(((i0) event).f42367a);
                do {
                    value4 = m1Var.getValue();
                    c9034d4 = (C9034d) value4;
                    c9033c2 = c9034d4.f43540a;
                } while (!m1Var.m15397i(value4, C9034d.m16498a(c9034d4, C9033c.m16497a(c9033c2, false, false, null, null, m2052l(c9033c2.f43535c), AbstractC6663m.c0(arrayList2), false, 79), null, null, 6)));
                return;
            }
            return;
        }
        if (event instanceof b0) {
            String str2 = ((b0) event).f42353a;
            arrayList.add(new C0429b(str2, true));
            arrayList2.add(str2);
            do {
                value3 = m1Var.getValue();
                c9034d3 = (C9034d) value3;
            } while (!m1Var.m15397i(value3, C9034d.m16498a(c9034d3, C9033c.m16497a(c9034d3.f43540a, false, false, null, null, m2052l(c9034d3.f43540a.f43535c), AbstractC6663m.c0(arrayList2), false, 15), null, null, 6)));
            return;
        }
        if (!(event instanceof j0)) {
            if (!(event instanceof f0)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.clear();
            arrayList.addAll(this.f4729C);
            arrayList2.clear();
            for (C0429b c0429b : this.f4729C) {
                if (c0429b.f3152b) {
                    arrayList2.add(c0429b.f3151a);
                }
            }
            do {
                value = m1Var.getValue();
                c9034d = (C9034d) value;
            } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, C9033c.m16497a(c9034d.f43540a, false, false, null, null, m2052l(null), AbstractC6663m.c0(arrayList2), false, 11), null, null, 6)));
            return;
        }
        int size3 = arrayList.size();
        while (true) {
            if (i11 >= size3) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (AbstractC4154l.m8918a(((C0429b) obj).f3151a, ((j0) event).f42369a)) {
                break;
            }
        }
        C0429b c0429b2 = (C0429b) obj;
        if (c0429b2 != null) {
            int iIndexOf = arrayList.indexOf(c0429b2);
            j0 j0Var = (j0) event;
            String str3 = j0Var.f42369a;
            boolean z12 = j0Var.f42370b;
            arrayList.set(iIndexOf, C0429b.m1452a(c0429b2, z12));
            if (z12) {
                arrayList2.add(str3);
            } else {
                arrayList2.remove(str3);
            }
            do {
                value2 = m1Var.getValue();
                c9034d2 = (C9034d) value2;
                c9033c = c9034d2.f43540a;
            } while (!m1Var.m15397i(value2, C9034d.m16498a(c9034d2, C9033c.m16497a(c9033c, false, false, null, null, m2052l(c9033c.f43535c), AbstractC6663m.c0(arrayList2), false, 15), null, null, 6)));
        }
    }

    /* renamed from: s */
    public final void m2059s(C9034d c9034d, List list, AbstractC0755m abstractC0755m) {
        m1 m1Var;
        Object value;
        C9034d c9034d2;
        do {
            m1Var = this.f4731E;
            value = m1Var.getValue();
            c9034d2 = (C9034d) value;
        } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d2, null, C9032b.m16496a(c9034d2.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, true, null, false, false, null, false, null, false, null, null, null, null, null, -33554433, 511), null, 5)));
        ArrayList arrayList = this.f4763z;
        arrayList.clear();
        arrayList.addAll(list);
        this.f4741d.getClass();
        LinkedHashMap linkedHashMapM190G = C0073l.m190G(list);
        C9032b c9032b = c9034d.f43541b;
        String str = c9032b.f43514h;
        List list2 = c9034d.f43542c.f43485b;
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0428a) it.next()).f3147a.m4716b());
        }
        int i10 = c9032b.f43525s;
        String str2 = c9032b.f43529w;
        String str3 = c9032b.f43513g;
        boolean z6 = c9032b.f43519m;
        boolean z10 = c9032b.f43520n;
        String str4 = c9032b.f43523q;
        String str5 = c9032b.f43524r;
        Integer numValueOf = str2.length() > 0 ? Integer.valueOf(c9032b.f43527u) : null;
        Map mapM12785m = AbstractC6674x.m12785m(linkedHashMapM190G);
        C4800k c4800k = c9032b.f43512f;
        LeadDetails leadDetails = new LeadDetails(str, false, arrayList2, i10, str3, z6, z10, str4, this.f4730D, str5, mapM12785m, numValueOf, str2, c4800k != null ? c4800k.f23886b : null, c9032b.f43521o);
        String str6 = this.f4733G;
        AbstractC4154l.m8920c(str6);
        C4802m c4802m = c9032b.f43508b;
        AbstractC4154l.m8920c(c4802m);
        tx.c0.m13502y(this.f4753p, null, null, new C0749g(this, new SaveLeadRequest(leadDetails, str6, c4802m), c9034d, leadDetails, list, abstractC0755m, null, 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [zr.b, zr.c] */
    /* renamed from: t */
    public final void m2060t(LeadByNumberResponse leadByNumberResponse) {
        int i10;
        EnumC3313o enumC3313o;
        Object value;
        C9034d c9034d;
        C9031a c9031a;
        Object next;
        wx.w0 w0Var;
        Object obj;
        C9034d c9034d2;
        String str;
        Object obj2;
        String lowerCase;
        Object obj3;
        int i11;
        ArrayList arrayList;
        boolean z6;
        C0983a c0983aM2053m;
        C9031a c9031a2;
        EnumC3313o enumC3313o2;
        boolean z10;
        Integer numM4874n;
        Object obj4;
        String lowerCase2;
        Integer numM4874n2;
        OffsetDateTime offsetDateTimeAtOffset;
        Instant instant;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList2;
        C5454q c5454qM11181a;
        Map mapM4869i = leadByNumberResponse.m4869i();
        wx.w0 w0Var2 = this.f4732F;
        ArrayList arrayListD0 = AbstractC6663m.d0(((C9034d) w0Var2.f39340a.getValue()).f43541b.f43510d);
        int size = arrayListD0.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            String str2 = "";
            if (i16 < size) {
                Object obj5 = arrayListD0.get(i16);
                int i17 = i16 + 1;
                int i18 = i15 + 1;
                if (i15 < 0) {
                    pe.m10842q();
                    throw null;
                }
                C5438a c5438aM11147b = (C5438a) obj5;
                for (String str3 : mapM4869i.keySet()) {
                    AbstractC5453p abstractC5453p = c5438aM11147b.f27346a;
                    if (AbstractC4154l.m8918a(abstractC5453p.mo11153e(), str3)) {
                        if ((abstractC5453p instanceof C5446i) || (abstractC5453p instanceof C5444g) || (abstractC5453p instanceof C5449l) || (abstractC5453p instanceof C5451n) || (abstractC5453p instanceof C5452o)) {
                            i12 = size;
                            i14 = i17;
                            i13 = i18;
                            DynamicFieldResponse dynamicFieldResponse = (DynamicFieldResponse) mapM4869i.get(str3);
                            Object objM4860b = dynamicFieldResponse != null ? dynamicFieldResponse.m4860b() : null;
                            AbstractC4154l.m8921d(objM4860b, "null cannot be cast to non-null type kotlin.String");
                            arrayListD0.set(i15, C5438a.m11147b(c5438aM11147b, abstractC5453p.mo11158j((String) objM4860b), false, 2));
                        } else {
                            i12 = size;
                            Class<DynamicFieldResponse> cls = DynamicFieldResponse.class;
                            if ((abstractC5453p instanceof C5447j) || (abstractC5453p instanceof C5443f) || (abstractC5453p instanceof C5440c)) {
                                DynamicFieldResponse dynamicFieldResponse2 = (DynamicFieldResponse) mapM4869i.get(str3);
                                Object objM4860b2 = dynamicFieldResponse2 != null ? dynamicFieldResponse2.m4860b() : null;
                                AbstractC4154l.m8921d(objM4860b2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                List list = (List) objM4860b2;
                                i14 = i17;
                                i13 = i18;
                                ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(list, 10));
                                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                                    DynamicFieldResponse dynamicFieldResponse3 = (DynamicFieldResponse) new C4088h().m8855b(cls, new C4088h().m8861h(it.next()));
                                    Class<DynamicFieldResponse> cls2 = cls;
                                    String strM4859a = dynamicFieldResponse3.m4859a();
                                    Object objM4860b3 = dynamicFieldResponse3.m4860b();
                                    AbstractC4154l.m8921d(objM4860b3, "null cannot be cast to non-null type kotlin.String");
                                    arrayList3.add(new C5454q(strM4859a, (String) objM4860b3, false));
                                    cls = cls2;
                                }
                                ArrayList arrayListD02 = AbstractC6663m.d0(arrayList3);
                                Object objMo11151c = abstractC5453p.mo11151c();
                                AbstractC4154l.m8921d(objMo11151c, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>");
                                List<C5454q> list2 = (List) objMo11151c;
                                ArrayList arrayList4 = new ArrayList(AbstractC6664n.m12768r(list2, 10));
                                for (C5454q c5454q : list2) {
                                    int size2 = arrayListD02.size();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= size2) {
                                            arrayList2 = arrayListD02;
                                            c5454qM11181a = C5454q.m11181a(c5454q, false);
                                            break;
                                        }
                                        Object obj6 = arrayListD02.get(i19);
                                        i19++;
                                        arrayList2 = arrayListD02;
                                        if (AbstractC4154l.m8918a(((C5454q) obj6).f27492b, c5454q.f27492b)) {
                                            c5454qM11181a = C5454q.m11181a(c5454q, true);
                                            break;
                                        }
                                        arrayListD02 = arrayList2;
                                    }
                                    arrayList4.add(c5454qM11181a);
                                    arrayListD02 = arrayList2;
                                }
                                arrayListD0.set(i15, C5438a.m11147b(c5438aM11147b, abstractC5453p.mo11158j(arrayList4), false, 2));
                            } else if (abstractC5453p instanceof C5441d) {
                                C5441d c5441d = (C5441d) abstractC5453p;
                                C8800o c8800o = C8800o.f42459a;
                                DynamicFieldResponse dynamicFieldResponse4 = (DynamicFieldResponse) mapM4869i.get(str3);
                                Object objM4860b4 = dynamicFieldResponse4 != null ? dynamicFieldResponse4.m4860b() : null;
                                AbstractC4154l.m8921d(objM4860b4, "null cannot be cast to non-null type kotlin.String");
                                arrayListD0.set(i15, C5438a.m11147b(c5438aM11147b, C5441d.m11160k(c5441d, LocalDate.parse((String) objM4860b4, DateTimeFormatter.ofPattern(c5441d.f27360b, Locale.ENGLISH)).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli(), null, false, 2031), false, 2));
                            } else if (abstractC5453p instanceof C5450m) {
                                C4088h c4088h = new C4088h();
                                DynamicFieldResponse dynamicFieldResponse5 = (DynamicFieldResponse) mapM4869i.get(str3);
                                DynamicFieldResponse dynamicFieldResponse6 = (DynamicFieldResponse) new C4088h().m8855b(cls, c4088h.m8861h(dynamicFieldResponse5 != null ? dynamicFieldResponse5.m4860b() : null));
                                C5450m c5450m = (C5450m) abstractC5453p;
                                List<C5454q> list3 = c5450m.f27457d;
                                ArrayList arrayList5 = new ArrayList(AbstractC6664n.m12768r(list3, 10));
                                for (C5454q c5454q2 : list3) {
                                    DynamicFieldResponse dynamicFieldResponse7 = dynamicFieldResponse6;
                                    arrayList5.add(AbstractC4154l.m8918a(dynamicFieldResponse6.m4860b(), c5454q2.f27492b) ? C5454q.m11181a(c5454q2, true) : C5454q.m11181a(c5454q2, false));
                                    dynamicFieldResponse6 = dynamicFieldResponse7;
                                }
                                arrayListD0.set(i15, C5438a.m11147b(c5438aM11147b, c5450m.mo11158j(arrayList5), false, 2));
                            } else if (!(abstractC5453p instanceof C5445h) && !(abstractC5453p instanceof C5442e) && !(abstractC5453p instanceof C5448k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        size = i12;
                        i17 = i14;
                        i18 = i13;
                    } else {
                        i12 = size;
                    }
                    i14 = i17;
                    i13 = i18;
                    size = i12;
                    i17 = i14;
                    i18 = i13;
                }
                int i20 = size;
                int i21 = i17;
                int i22 = i18;
                Set setKeySet = mapM4869i.keySet();
                AbstractC5453p abstractC5453p2 = c5438aM11147b.f27346a;
                if (!setKeySet.contains(abstractC5453p2.mo11153e())) {
                    Object objMo11151c2 = abstractC5453p2.mo11151c();
                    if (objMo11151c2 instanceof String) {
                        c5438aM11147b = C5438a.m11147b(c5438aM11147b, abstractC5453p2.mo11158j(""), false, 2);
                    } else if (objMo11151c2 instanceof Long) {
                        c5438aM11147b = C5438a.m11147b(c5438aM11147b, abstractC5453p2.mo11158j(-1L), false, 2);
                    } else if (objMo11151c2 instanceof List) {
                        Object objMo11151c3 = abstractC5453p2.mo11151c();
                        AbstractC4154l.m8921d(objMo11151c3, "null cannot be cast to non-null type kotlin.collections.List<com.websoptimization.callyzerbiz.ui.dynamic_lead_form.model.OptionsUIModel>");
                        List list4 = (List) objMo11151c3;
                        ArrayList arrayList6 = new ArrayList(AbstractC6664n.m12768r(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList6.add(C5454q.m11181a((C5454q) it2.next(), false));
                        }
                        c5438aM11147b = C5438a.m11147b(c5438aM11147b, abstractC5453p2.mo11158j(arrayList6), false, 2);
                    }
                    arrayListD0.set(i15, c5438aM11147b);
                }
                size = i20;
                i16 = i21;
                i15 = i22;
            } else {
                Object obj7 = null;
                boolean zM4861a = leadByNumberResponse.m4861a();
                m1 m1Var = this.f4731E;
                if (zM4861a) {
                    enumC3313o = EnumC3313o.NoOptionSelected;
                    i10 = 0;
                } else {
                    List listM4862b = leadByNumberResponse.m4862b();
                    if (listM4862b == null || listM4862b.size() != 1) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        String strM4716b = ((AllEmployeeResponse) leadByNumberResponse.m4862b().get(0)).m4716b();
                        C4802m c4802m = ((C9034d) w0Var2.f39340a.getValue()).f43541b.f43508b;
                        if (AbstractC4154l.m8918a(strM4716b, c4802m != null ? c4802m.f23908t : null)) {
                            enumC3313o = EnumC3313o.OnlyMe;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    List listM4862b2 = leadByNumberResponse.m4862b();
                    if (listM4862b2 != null) {
                        Iterator it3 = listM4862b2.iterator();
                        while (it3.hasNext()) {
                            arrayList7.add(new C0428a((AllEmployeeResponse) it3.next(), true));
                        }
                    }
                    while (true) {
                        Object value2 = m1Var.getValue();
                        C9034d c9034d3 = (C9034d) value2;
                        C9031a c9031a3 = c9034d3.f43542c;
                        ArrayList arrayList8 = new ArrayList();
                        int size3 = arrayList7.size();
                        int i23 = i10;
                        while (i23 < size3) {
                            Object obj8 = arrayList7.get(i23);
                            i23++;
                            if (((C0428a) obj8).f3148b) {
                                arrayList8.add(obj8);
                            }
                        }
                        ?? r11 = obj7;
                        if (m1Var.m15397i(value2, C9034d.m16498a(c9034d3, r11, r11, C9031a.m16495a(c9031a3, null, arrayList8, null, null, null, false, true, false, 189), 3))) {
                            break;
                        } else {
                            obj7 = null;
                        }
                    }
                    enumC3313o = EnumC3313o.SpecificEmployee;
                }
                if (!leadByNumberResponse.m4870j().isEmpty()) {
                    m2051k(leadByNumberResponse.m4870j(), true);
                }
                this.f4759v = leadByNumberResponse.m4872l();
                String strM4875o = leadByNumberResponse.m4875o();
                if (strM4875o == null) {
                    strM4875o = "";
                }
                this.f4760w = strM4875o;
                LocalDateTime localDateTimeM4873m = leadByNumberResponse.m4873m();
                Long lValueOf = (localDateTimeM4873m == null || (offsetDateTimeAtOffset = localDateTimeM4873m.atOffset(ZoneOffset.UTC)) == null || (instant = offsetDateTimeAtOffset.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
                C0458a c0458a = new C0458a(2);
                Locale locale = Locale.getDefault();
                AbstractC4154l.m8922e(locale, "getDefault(...)");
                h4 h4VarM6144d = f4.m6144d(locale, lValueOf, c0458a, 28);
                do {
                    value = m1Var.getValue();
                    c9034d = (C9034d) value;
                    c9031a = null;
                } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, h4VarM6144d, -1, 255), null, 5)));
                while (true) {
                    Object value3 = m1Var.getValue();
                    C9034d c9034d4 = (C9034d) value3;
                    int i24 = i10;
                    C9032b c9032b = c9034d4.f43541b;
                    String strM4866f = leadByNumberResponse.m4866f();
                    C9031a c9031a4 = c9031a;
                    String strM4865e = leadByNumberResponse.m4865e();
                    String strM4868h = leadByNumberResponse.m4868h();
                    String str4 = strM4868h == null ? str2 : strM4868h;
                    Iterator it4 = ((C9034d) w0Var2.f39340a.getValue()).f43541b.f43507a.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (AbstractC4154l.m8918a(((C4802m) next).f23891c, leadByNumberResponse.m4877q())) {
                                break;
                            }
                        } else {
                            next = c9031a4;
                            break;
                        }
                    }
                    C4802m c4802m2 = (C4802m) next;
                    if (c4802m2 == null) {
                        c4802m2 = c9032b.f43508b;
                    }
                    String strM4875o2 = leadByNumberResponse.m4875o();
                    String str5 = strM4875o2 == null ? str2 : strM4875o2;
                    int iM4863c = leadByNumberResponse.m4863c();
                    int iM4863c2 = leadByNumberResponse.m4863c();
                    ArrayList arrayListM11031a = wc.m11031a();
                    int size4 = arrayListM11031a.size();
                    EnumC3313o enumC3313o3 = enumC3313o;
                    int i25 = i24;
                    while (true) {
                        if (i25 >= size4) {
                            w0Var = w0Var2;
                            obj = value3;
                            c9034d2 = c9034d4;
                            str = str2;
                            obj2 = c9031a4;
                            break;
                        }
                        obj2 = arrayListM11031a.get(i25);
                        i25++;
                        w0Var = w0Var2;
                        C0983a c0983a = (C0983a) obj2;
                        obj = value3;
                        c9034d2 = c9034d4;
                        str = str2;
                        if (AbstractC5185w.m10130l(AbstractC5178p.g0(c0983a.f5813b).toString(), "+" + leadByNumberResponse.m4863c(), true)) {
                            String str6 = c0983a.f5815d;
                            String str7 = AbstractC8804s.f42473a;
                            if (AbstractC5185w.m10130l(str6, AbstractC8804s.m16222a("+" + leadByNumberResponse.m4863c() + leadByNumberResponse.m4872l()), true)) {
                                break;
                            }
                        }
                        value3 = obj;
                        c9034d4 = c9034d2;
                        str2 = str;
                        w0Var2 = w0Var;
                    }
                    C0983a c0983a2 = (C0983a) obj2;
                    if (c0983a2 == null || (lowerCase = c0983a2.f5815d) == null) {
                        String str8 = AbstractC8804s.f42473a;
                        String strM16222a = AbstractC8804s.m16222a("+" + leadByNumberResponse.m4863c() + leadByNumberResponse.m4872l());
                        if (strM16222a != null) {
                            lowerCase = strM16222a.toLowerCase(Locale.ROOT);
                            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                        } else {
                            lowerCase = c9032b.f43504M.f5815d;
                        }
                    }
                    C0983a c0983aM2053m2 = m2053m(iM4863c2, lowerCase);
                    Object obj9 = obj;
                    String strM4872l = leadByNumberResponse.m4872l();
                    int iIntValue = (leadByNumberResponse.m4874n() == null || ((numM4874n2 = leadByNumberResponse.m4874n()) != null && numM4874n2.intValue() == 0)) ? c9032b.f43527u : leadByNumberResponse.m4874n().intValue();
                    if (leadByNumberResponse.m4874n() == null || ((numM4874n = leadByNumberResponse.m4874n()) != null && numM4874n.intValue() == 0)) {
                        obj3 = obj9;
                        i11 = iIntValue;
                        arrayList = arrayListD0;
                        z6 = true;
                        c0983aM2053m = c9032b.f43505N;
                    } else {
                        int iIntValue2 = leadByNumberResponse.m4874n().intValue();
                        ArrayList arrayListM11031a2 = wc.m11031a();
                        int size5 = arrayListM11031a2.size();
                        int i26 = i24;
                        while (true) {
                            if (i26 >= size5) {
                                obj3 = obj9;
                                i11 = iIntValue;
                                arrayList = arrayListD0;
                                z6 = true;
                                obj4 = c9031a4;
                                break;
                            }
                            obj4 = arrayListM11031a2.get(i26);
                            i26++;
                            obj3 = obj9;
                            C0983a c0983a3 = (C0983a) obj4;
                            i11 = iIntValue;
                            arrayList = arrayListD0;
                            ArrayList arrayList9 = arrayListM11031a2;
                            if (AbstractC5185w.m10130l(AbstractC5178p.g0(c0983a3.f5813b).toString(), "+" + leadByNumberResponse.m4874n(), true)) {
                                String str9 = c0983a3.f5815d;
                                String str10 = AbstractC8804s.f42473a;
                                z6 = true;
                                if (AbstractC5185w.m10130l(str9, AbstractC8804s.m16222a("+" + leadByNumberResponse.m4874n() + leadByNumberResponse.m4875o()), true)) {
                                    break;
                                }
                            }
                            obj9 = obj3;
                            iIntValue = i11;
                            arrayListD0 = arrayList;
                            arrayListM11031a2 = arrayList9;
                        }
                        C0983a c0983a4 = (C0983a) obj4;
                        if (c0983a4 == null || (lowerCase2 = c0983a4.f5815d) == null) {
                            String str11 = AbstractC8804s.f42473a;
                            String strM16222a2 = AbstractC8804s.m16222a("+" + leadByNumberResponse.m4874n() + leadByNumberResponse.m4875o());
                            if (strM16222a2 != null) {
                                lowerCase2 = strM16222a2.toLowerCase(Locale.ROOT);
                                AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                            } else {
                                lowerCase2 = c9032b.f43504M.f5815d;
                            }
                        }
                        c0983aM2053m = m2053m(iIntValue2, lowerCase2);
                    }
                    C0983a c0983a5 = c0983aM2053m;
                    LocalDateTime localDateTimeM4873m2 = leadByNumberResponse.m4873m();
                    if (leadByNumberResponse.m4873m() != null) {
                        c9031a2 = c9031a4;
                        enumC3313o2 = enumC3313o3;
                        z10 = z6;
                    } else {
                        c9031a2 = c9031a4;
                        enumC3313o2 = enumC3313o3;
                        z10 = i24;
                    }
                    C9034d c9034d5 = c9034d2;
                    String str12 = str;
                    arrayListD0 = arrayList;
                    C9031a c9031a5 = c9031a2;
                    if (m1Var.m15397i(obj3, C9034d.m16498a(c9034d5, C9033c.m16497a(c9034d5.f43540a, false, false, null, null, null, AbstractC6663m.c0(this.f4730D), false, 95), C9032b.m16496a(c9032b, null, c4802m2, false, arrayListD0, null, null, strM4865e, strM4866f, null, null, null, enumC3313o2, false, z10, localDateTimeM4873m2, null, str4, strM4872l, iM4863c, null, i11, null, str5, false, false, false, null, false, false, null, false, null, false, null, null, c0983aM2053m2, c0983a5, null, -5728459, 319), c9031a5, 4))) {
                        return;
                    }
                    c9031a = c9031a5;
                    enumC3313o = enumC3313o2;
                    w0Var2 = w0Var;
                    i10 = i24;
                    str2 = str12;
                }
            }
        }
    }

    /* renamed from: u */
    public final boolean m2061u() throws NumberFormatException {
        Object value;
        C9034d c9034d;
        boolean z6;
        int i10;
        Object value2;
        C9034d c9034d2;
        C9032b c9032b;
        C6361k c6361k;
        String string;
        C9035e c9035e;
        Object value3;
        C9034d c9034d3;
        List listM10833h;
        Object value4;
        C9034d c9034d4;
        ArrayList arrayList = new ArrayList();
        wx.w0 w0Var = this.f4732F;
        String str = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43513g;
        this.f4742e.getClass();
        C4132l c4132lM14192d = C7454y.m14192d(str);
        C4132l c4132lM14191c = C7454y.m14191c(((C9034d) w0Var.f39340a.getValue()).f43541b.f43523q);
        String str2 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43524r;
        int i11 = Integer.parseInt(AbstractC5178p.g0(f9.m11632f(((C9034d) w0Var.f39340a.getValue()).f43541b.f43504M.f5813b)).toString());
        String str3 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43504M.f5815d;
        this.f4744g.getClass();
        C4132l c4132lM14216a = C7455z.m14216a(str2, i11, str3, null, null);
        String str4 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43529w;
        String str5 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43524r;
        int i12 = Integer.parseInt(AbstractC5178p.g0(f9.m11632f(((C9034d) w0Var.f39340a.getValue()).f43541b.f43505N.f5813b)).toString());
        int i13 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43525s;
        String str6 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43505N.f5815d;
        this.f4745h.getClass();
        C4132l c4132lM1985m = C0689a.m1985m(i12, i13, str4, str5, str6);
        EnumC3313o enumC3313o = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43518l;
        this.f4743f.getClass();
        C4132l c4132lM16036l = C8687a.m16036l(enumC3313o);
        boolean z10 = c4132lM16036l.f21088a;
        m1 m1Var = this.f4731E;
        if (z10) {
            C9034d c9034d5 = (C9034d) w0Var.f39340a.getValue();
            EnumC3313o selectedOption = c9034d5.f43541b.f43518l;
            C9031a employeeState = ((C9034d) w0Var.f39340a.getValue()).f43542c;
            C4802m c4802m = c9034d5.f43541b.f43508b;
            AbstractC4154l.m8923f(selectedOption, "selectedOption");
            AbstractC4154l.m8923f(employeeState, "employeeState");
            int i14 = AbstractC2341e.f10602a[selectedOption.ordinal()];
            if (i14 == 1) {
                List list = employeeState.f43485b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((C0428a) obj).f3148b) {
                        arrayList2.add(obj);
                    }
                }
                listM10833h = arrayList2;
            } else if (i14 == 2 && c4802m != null) {
                String str7 = c4802m.f23908t;
                String str8 = c4802m.f23896h;
                if (str8 == null) {
                    str8 = "Unknown";
                }
                int i15 = c4802m.f23892d;
                String str9 = c4802m.f23891c;
                if (str9 == null) {
                    str9 = "";
                }
                listM10833h = pe.m10833h(new C0428a(new AllEmployeeResponse(str7, str8, i15, str9), true));
            } else {
                listM10833h = null;
            }
            do {
                value4 = m1Var.getValue();
                c9034d4 = (C9034d) value4;
            } while (!m1Var.m15397i(value4, C9034d.m16498a(c9034d4, null, null, C9031a.m16495a(c9034d4.f43542c, null, listM10833h == null ? C6668r.f31943a : listM10833h, null, null, null, false, false, false, 253), 3)));
        }
        boolean z11 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43518l == EnumC3313o.SpecificEmployee && ((C9034d) w0Var.f39340a.getValue()).f43542c.f43485b.isEmpty();
        do {
            value = m1Var.getValue();
            c9034d = (C9034d) value;
        } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.f43541b, null, null, false, null, null, null, null, null, c4132lM14192d.f21089b, c4132lM14191c.f21089b, c4132lM16036l.f21089b, null, false, false, null, null, null, null, 0, c4132lM14216a.f21089b, 0, c4132lM1985m.f21089b, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -2623233, 511), null, 5)));
        C9032b c9032b2 = ((C9034d) w0Var.f39340a.getValue()).f43541b;
        C4800k c4800k = c9032b2.f43512f;
        boolean z12 = c4800k != null && c4800k.f23888d;
        boolean z13 = c9032b2.f43521o == null;
        boolean z14 = c9032b2.f43520n;
        if (z12 && z13 && z14) {
            do {
                value3 = m1Var.getValue();
                c9034d3 = (C9034d) value3;
            } while (!m1Var.m15397i(value3, C9034d.m16498a(c9034d3, null, C9032b.m16496a(c9034d3.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, Integer.valueOf(R.string.please_select_reminder_date), null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -32769, 511), null, 5)));
            z6 = false;
        } else {
            z6 = true;
        }
        if (c4132lM16036l.f21089b != null) {
            i10 = 0;
            arrayList.add(new C9035e(m2055o(R.string.static_field_assign_leads, new Object[0]), m2055o(R.string.lead_common_msg_select_option, new Object[0])));
        } else {
            i10 = 0;
        }
        if (z11) {
            arrayList.add(new C9035e(m2055o(R.string.employee_s, new Object[i10]), m2055o(R.string.static_field_specific_employee_select, new Object[i10])));
        }
        Integer num = c4132lM14192d.f21089b;
        if (num != null) {
            arrayList.add(new C9035e(m2055o(R.string.first_name_1, new Object[i10]), m2055o(num.intValue(), new Object[i10])));
        }
        Integer num2 = c4132lM14191c.f21089b;
        if (num2 != null) {
            arrayList.add(new C9035e(m2055o(R.string.last_name, new Object[i10]), m2055o(num2.intValue(), new Object[i10])));
        }
        Integer num3 = c4132lM14216a.f21089b;
        if (num3 != null) {
            arrayList.add(new C9035e(m2055o(R.string.phone_number, new Object[i10]), m2055o(num3.intValue(), new Object[i10])));
        }
        Integer num4 = c4132lM1985m.f21089b;
        if (num4 != null) {
            arrayList.add(new C9035e(m2055o(R.string.alternative_phone_number, new Object[i10]), m2055o(num4.intValue(), new Object[i10])));
        }
        if (!z6) {
            arrayList.add(new C9035e(m2055o(R.string.reminder_date, new Object[i10]), m2055o(R.string.lead_common_msg_field_required, new Object[i10])));
        }
        List<C5438a> list2 = ((C9034d) w0Var.f39340a.getValue()).f43541b.f43510d;
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(list2, 10));
        for (C5438a c5438aM11147b : list2) {
            AbstractC5453p abstractC5453p = c5438aM11147b.f27346a;
            String strMo11150b = abstractC5453p.mo11150b();
            if (strMo11150b == null || strMo11150b.length() == 0) {
                Iterator it = abstractC5453p.mo11154f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c9035e = null;
                        break;
                    }
                    C2992e c2992eMo7247a = ((InterfaceC2988a) it.next()).mo7247a(abstractC5453p);
                    if (!c2992eMo7247a.f16133a) {
                        String strMo11152d = abstractC5453p.mo11152d();
                        Integer num5 = c2992eMo7247a.f16134b;
                        String strM2055o = num5 != null ? m2055o(num5.intValue(), c2992eMo7247a.f16135c) : null;
                        AbstractC4154l.m8920c(strM2055o);
                        c9035e = new C9035e(strMo11152d, strM2055o);
                    }
                }
                if (c9035e != null) {
                    arrayList.add(c9035e);
                    abstractC5453p.mo11157i(c9035e.f43544b);
                    c5438aM11147b = C5438a.m11147b(c5438aM11147b, null, true, 1);
                }
                arrayList3.add(c5438aM11147b);
            } else {
                String strMo11152d2 = abstractC5453p.mo11152d();
                String strMo11150b2 = abstractC5453p.mo11150b();
                AbstractC4154l.m8920c(strMo11150b2);
                arrayList.add(new C9035e(strMo11152d2, strMo11150b2));
            }
            arrayList3.add(c5438aM11147b);
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i16 = i10;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pe.m10842q();
                    throw null;
                }
                sb2.append("- " + ((C9035e) obj2) + (i17 != arrayList.size() ? ".\n" : "."));
                i16 = i17;
            }
            do {
                value2 = m1Var.getValue();
                c9034d2 = (C9034d) value2;
                c9032b = c9034d2.f43541b;
                c6361k = new C6361k(Boolean.TRUE, arrayList);
                string = sb2.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
            } while (!m1Var.m15397i(value2, C9034d.m16498a(c9034d2, null, C9032b.m16496a(c9032b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, string, false, false, c6361k, false, null, false, null, null, null, null, null, -1207959553, 511), null, 5)));
        }
        while (true) {
            Object value5 = m1Var.getValue();
            C9034d c9034d6 = (C9034d) value5;
            ArrayList arrayList4 = arrayList3;
            if (m1Var.m15397i(value5, C9034d.m16498a(c9034d6, null, C9032b.m16496a(c9034d6.f43541b, null, null, false, arrayList4, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -9, 511), null, 5))) {
                return arrayList.isEmpty();
            }
            arrayList3 = arrayList4;
        }
    }
}
