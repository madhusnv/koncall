package bv;

import android.content.Context;
import android.text.TextUtils;
import ao.C0372k;
import aq.C0406i;
import av.C0458a;
import av.C0459b;
import av.EnumC0460c;
import ay.ExecutorC0495e;
import b2.s0;
import c9.C0910e;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import d7.w0;
import g2.f4;
import g2.h4;
import im.EnumC3311m;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kn.C4132l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import mm.C4800k;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import oj.C5392d;
import om.C5415q;
import oo.C5431l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.o6;
import qn.C6263l;
import qw.C6361k;
import rt.C6617a;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8791f;
import yv.C8800o;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zu.AbstractC9092v;
import zu.C9071a;
import zu.C9072b;
import zu.C9073c;
import zu.C9074d;
import zu.C9075e;
import zu.C9076f;
import zu.C9077g;
import zu.C9078h;
import zu.C9079i;
import zu.C9080j;
import zu.C9081k;
import zu.C9082l;
import zu.C9083m;
import zu.C9084n;
import zu.C9085o;
import zu.C9086p;
import zu.C9087q;
import zu.C9088r;
import zu.C9089s;
import zu.C9090t;
import zu.C9091u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.h */
/* loaded from: classes3.dex */
public final class C0790h extends w0 {

    /* renamed from: b */
    public final Context f4990b;

    /* renamed from: c */
    public final C5431l f4991c;

    /* renamed from: d */
    public final C6263l f4992d;

    /* renamed from: e */
    public final Context f4993e;

    /* renamed from: f */
    public final C8805t f4994f;

    /* renamed from: g */
    public final C8810d f4995g;

    /* renamed from: h */
    public final C8803r f4996h;

    /* renamed from: i */
    public final C0910e f4997i;

    /* renamed from: j */
    public final C5392d f4998j;

    /* renamed from: k */
    public final C4494g f4999k;

    /* renamed from: l */
    public final String f5000l;

    /* renamed from: m */
    public final C7806h f5001m;

    /* renamed from: n */
    public final C8203d f5002n;

    /* renamed from: o */
    public final m1 f5003o;

    /* renamed from: p */
    public final wx.w0 f5004p;

    /* renamed from: q */
    public boolean f5005q;

    /* renamed from: r */
    public final m1 f5006r;

    public C0790h(Context context, C5431l c5431l, C6263l c6263l, Context context2, C8805t c8805t, C8810d c8810d, C8803r networkMonitorUtil, C0910e c0910e, C5392d c5392d, C4494g c4494g) {
        Object value;
        OffsetDateTime offsetDateTimeAtOffset;
        Instant instant;
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        this.f4990b = context;
        this.f4991c = c5431l;
        this.f4992d = c6263l;
        this.f4993e = context2;
        this.f4994f = c8805t;
        this.f4995g = c8810d;
        this.f4996h = networkMonitorUtil;
        this.f4997i = c0910e;
        this.f4998j = c5392d;
        this.f4999k = c4494g;
        this.f5000l = "NotePopUpViewModel";
        int i10 = 0;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f5001m = c7806hM11805a;
        this.f5002n = c1.m15389t(c7806hM11805a);
        C5415q c5415q = new C5415q(0, 0L, false, null, null, null, 0, null, null, null, null, null, null, false, false, false, 262143);
        C5415q c5415q2 = new C5415q(0, 0L, false, null, null, null, 0, null, null, null, null, null, null, false, false, false, 262143);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Long lValueOf = (localDateTimeNow == null || (offsetDateTimeAtOffset = localDateTimeNow.atOffset(ZoneOffset.UTC)) == null || (instant = offsetDateTimeAtOffset.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
        Locale locale = Locale.getDefault();
        AbstractC4154l.m8922e(locale, "getDefault(...)");
        h4 h4VarM6144d = f4.m6144d(locale, lValueOf, new C0458a(0), 28);
        ArrayList arrayList3 = new ArrayList();
        EnumC0460c enumC0460c = EnumC0460c.NotProcessed;
        EnumC3311m enumC3311m = EnumC3311m.NONE;
        C6361k c6361k = new C6361k("", Boolean.FALSE);
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C0459b(c5415q, c5415q2, arrayList, c6668r, arrayList2, c6668r, "", false, false, "", "", true, -1, 0, "", "", "", null, false, false, true, "", false, false, false, null, h4VarM6144d, null, null, false, arrayList3, false, true, enumC0460c, enumC3311m, false, false, false, false, false, c6361k, false, false));
        this.f5003o = m1VarM15372c;
        this.f5004p = new wx.w0(m1VarM15372c);
        this.f5006r = c1.m15372c("");
        c1.m15389t(o6.m11805a(0, null, null, 7));
        int i11 = 3;
        c0.m13502y(q0.m5340g(this), null, null, new C0785c(this, interfaceC7559c, i10), 3);
        C5415q c5415q3 = ((C0459b) m1VarM15372c.getValue()).f3278a;
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d(c5415q3.f27197c)) {
            do {
                value = m1VarM15372c.getValue();
            } while (!m1VarM15372c.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, c5415q3.f27197c, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -65, 4095)));
        }
        c0.m13502y(q0.m5340g(this), ExecutorC0495e.f3538c, null, new C0785c(this, interfaceC7559c, 1), 2);
        c0.m13502y(this.f4995g, null, null, new C0785c(this, interfaceC7559c, 2), 3);
        c0.m13502y(this.f4995g, null, null, new C0786d(this, interfaceC7559c, i10), 3);
        c0.m13502y(this.f4995g, null, null, new C0785c(this, interfaceC7559c, i11), 3);
        c0.m13502y(this.f4995g, null, null, new C0785c(this, interfaceC7559c, 4), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2114e(bv.C0790h r48, ww.AbstractC8193c r49) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.C0790h.m2114e(bv.h, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2115f(bv.C0790h r54) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.C0790h.m2115f(bv.h):void");
    }

    /* renamed from: g */
    public final long m2116g() {
        wx.w0 w0Var = this.f5004p;
        Integer numM10140v = AbstractC5185w.m10140v(AbstractC5178p.g0(((C0459b) w0Var.f39340a.getValue()).f3292o).toString());
        int iIntValue = numM10140v != null ? numM10140v.intValue() : 0;
        Integer numM10140v2 = AbstractC5185w.m10140v(AbstractC5178p.g0(((C0459b) w0Var.f39340a.getValue()).f3293p).toString());
        int iIntValue2 = numM10140v2 != null ? numM10140v2.intValue() : 0;
        Integer numM10140v3 = AbstractC5185w.m10140v(AbstractC5178p.g0(((C0459b) w0Var.f39340a.getValue()).f3294q).toString());
        int iIntValue3 = numM10140v3 != null ? numM10140v3.intValue() : 0;
        if (iIntValue2 < 0 || iIntValue2 >= 60 || iIntValue3 < 0 || iIntValue3 >= 60) {
            throw new IllegalArgumentException("Minutes and seconds must be in the range 0-59");
        }
        return AbstractC5601a.m11230a(iIntValue2, 60, iIntValue * 3600, iIntValue3);
    }

    /* renamed from: h */
    public final boolean m2117h() {
        int i10;
        int i11;
        Object value;
        Object value2;
        String string;
        Object value3;
        String string2;
        Object value4;
        String string3;
        wx.w0 w0Var = this.f5004p;
        if (((C0459b) w0Var.f39340a.getValue()).f3278a.f27212r || ((C0459b) w0Var.f39340a.getValue()).f3278a.f27211q) {
            String str = ((C0459b) w0Var.f39340a.getValue()).f3278a.f27207m;
            Context context = this.f4990b;
            m1 m1Var = this.f5003o;
            if (str == null && ((C0459b) w0Var.f39340a.getValue()).f3290m == -1) {
                do {
                    value4 = m1Var.getValue();
                    string3 = context.getString(R.string.pls_select_sim);
                    AbstractC4154l.m8922e(string3, "getString(...)");
                } while (!m1Var.m15397i(value4, C0459b.m1461a((C0459b) value4, null, null, null, null, null, null, false, string3, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -1025, 4095)));
            } else if (((C0459b) w0Var.f39340a.getValue()).f3278a.f27203i == null && ((C0459b) w0Var.f39340a.getValue()).f3291n == 0) {
                do {
                    value3 = m1Var.getValue();
                    string2 = context.getString(R.string.pls_select_calltype);
                    AbstractC4154l.m8922e(string2, "getString(...)");
                } while (!m1Var.m15397i(value3, C0459b.m1461a((C0459b) value3, null, null, null, null, null, null, false, string2, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -1025, 4095)));
            } else if (((C0459b) w0Var.f39340a.getValue()).f3278a.f27205k == null) {
                String str2 = ((C0459b) w0Var.f39340a.getValue()).f3292o;
                String str3 = ((C0459b) w0Var.f39340a.getValue()).f3293p;
                String str4 = ((C0459b) w0Var.f39340a.getValue()).f3294q;
                this.f4998j.getClass();
                Integer numValueOf = Integer.valueOf(R.string.pls_enter_duration);
                C4132l c4132l = (str2.length() == 0 && str3.length() == 0 && str4.length() == 0) ? new C4132l(false, numValueOf) : ((str2.length() <= 0 || (TextUtils.isDigitsOnly(str2) && Integer.parseInt(str2) >= 0)) && (str3.length() <= 0 || (TextUtils.isDigitsOnly(str3) && (i11 = Integer.parseInt(str3)) >= 0 && i11 < 60)) && (str4.length() <= 0 || (TextUtils.isDigitsOnly(str4) && (i10 = Integer.parseInt(str4)) >= 0 && i10 < 60))) ? (str2.length() <= 0 && str3.length() <= 0 && str4.length() <= 0) ? new C4132l(false, numValueOf) : new C4132l(true, null) : new C4132l(false, Integer.valueOf(R.string.enter_duration));
                if (c4132l.f21088a) {
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, null, false, "", false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -1025, 4095)));
                } else {
                    do {
                        value2 = m1Var.getValue();
                        Integer num = c4132l.f21089b;
                        AbstractC4154l.m8920c(num);
                        string = context.getString(num.intValue());
                        AbstractC4154l.m8922e(string, "getString(...)");
                    } while (!m1Var.m15397i(value2, C0459b.m1461a((C0459b) value2, null, null, null, null, null, null, false, string, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -1025, 4095)));
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m2118i() {
        Integer numValueOf;
        Integer num;
        Integer numValueOf2;
        m1 m1Var;
        Object value;
        wx.w0 w0Var = this.f5004p;
        boolean z6 = false;
        if (((C0459b) w0Var.f39340a.getValue()).f3303z == null) {
            numValueOf = Integer.valueOf(R.string.select_lead_status);
            num = null;
        } else {
            C4800k c4800k = ((C0459b) w0Var.f39340a.getValue()).f3303z;
            AbstractC4154l.m8920c(c4800k);
            if (c4800k.f23888d && ((C0459b) w0Var.f39340a.getValue()).f3295r == null) {
                numValueOf2 = Integer.valueOf(R.string.select_reminder_date);
            } else {
                if (((C0459b) w0Var.f39340a.getValue()).f3295r != null) {
                    C8800o c8800o = C8800o.f42459a;
                    LocalDateTime localDateTime = ((C0459b) w0Var.f39340a.getValue()).f3295r;
                    AbstractC4154l.m8920c(localDateTime);
                    if (C8800o.m16184H(localDateTime) <= System.currentTimeMillis()) {
                        numValueOf2 = Integer.valueOf(R.string.select_valid_reminder_time);
                    }
                }
                z6 = true;
                numValueOf = null;
                num = null;
            }
            num = numValueOf2;
            numValueOf = null;
        }
        do {
            m1Var = this.f5003o;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, numValueOf, num, false, null, false, false, null, null, false, false, false, false, null, false, false, -805306369, 4095)));
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m2119j(AbstractC9092v event) {
        Object value;
        Object value2;
        String string;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        C0459b c0459b;
        Object value10;
        C0459b c0459b2;
        Object value11;
        Object value12;
        Object value13;
        Object value14;
        Object value15;
        Object value16;
        Object value17;
        Object value18;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C9078h;
        wx.w0 w0Var = this.f5004p;
        m1 m1Var = this.f5003o;
        if (z6) {
            C9078h c9078h = (C9078h) event;
            String string2 = AbstractC5178p.g0(c9078h.f43610a).toString();
            C5415q c5415qM11122a = C5415q.m11122a(((C0459b) w0Var.f39340a.getValue()).f3278a, string2, null, null, null, null, 0, null, 262139);
            do {
                value15 = m1Var.getValue();
            } while (!m1Var.m15397i(value15, C0459b.m1461a((C0459b) value15, null, null, null, null, null, c9078h.f43610a, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -65, 4095)));
            if (string2.length() == 0) {
                this.f5005q = false;
            }
            if (((C0459b) w0Var.f39340a.getValue()).f3284g.length() == 0) {
                do {
                    value18 = m1Var.getValue();
                } while (!m1Var.m15397i(value18, C0459b.m1461a((C0459b) value18, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, new C6361k("", Boolean.FALSE), false, false, -1, 3583)));
            }
            if (((C0459b) w0Var.f39340a.getValue()).f3298u && ((C0459b) w0Var.f39340a.getValue()).f3267G) {
                boolean z10 = (this.f5005q || string2.length() == 0) ? false : true;
                do {
                    value16 = m1Var.getValue();
                } while (!m1Var.m15397i(value16, C0459b.m1461a((C0459b) value16, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, z10, false, null, null, false, false, false, false, null, false, false, -1, 4094)));
                do {
                    value17 = m1Var.getValue();
                } while (!m1Var.m15397i(value17, C0459b.m1461a((C0459b) value17, c5415qM11122a, null, null, null, null, c9078h.f43610a, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -66, 4095)));
                return;
            }
            return;
        }
        boolean z11 = event instanceof C9079i;
        C5392d c5392d = this.f4998j;
        if (z11) {
            String str = ((C0459b) m1Var.getValue()).f3284g;
            c5392d.getClass();
            if (C5392d.m11112k(str).f21088a && !m2117h()) {
                do {
                    value14 = m1Var.getValue();
                } while (!m1Var.m15397i(value14, C0459b.m1461a((C0459b) value14, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, ((C9079i) event).f43611a, null, false, false, null, null, false, false, false, false, null, false, false, -1073741825, 4095)));
                if (!((C0459b) w0Var.f39340a.getValue()).f3296s || m2118i()) {
                    if (((C0459b) w0Var.f39340a.getValue()).f3296s) {
                        m2120k(false);
                        return;
                    } else {
                        m2121l(false);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (event instanceof C9080j) {
            String str2 = ((C0459b) w0Var.f39340a.getValue()).f3284g;
            c5392d.getClass();
            if (C5392d.m11112k(str2).f21088a && !m2117h()) {
                if (!((C0459b) w0Var.f39340a.getValue()).f3296s || m2118i()) {
                    if (((C0459b) w0Var.f39340a.getValue()).f3296s) {
                        m2120k(true);
                        return;
                    } else {
                        m2121l(true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!(event instanceof C9071a)) {
            InterfaceC7559c interfaceC7559c = null;
            if (event instanceof C9072b) {
                Iterator it = ((C0459b) w0Var.getValue()).f3281d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC4154l.m8918a(((C4800k) next).f23886b, ((C9072b) event).f43604a)) {
                        interfaceC7559c = next;
                        break;
                    }
                }
                C4800k c4800k = (C4800k) interfaceC7559c;
                if (c4800k == null) {
                    return;
                } else {
                    do {
                        value12 = m1Var.getValue();
                    } while (!m1Var.m15397i(value12, C0459b.m1461a((C0459b) value12, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, c4800k, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -872677377, 4095)));
                    return;
                }
            }
            if (event instanceof C9073c) {
                do {
                    value11 = m1Var.getValue();
                } while (!m1Var.m15397i(value11, C0459b.m1461a((C0459b) value11, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -872677377, 4095)));
                return;
            }
            if (event instanceof C9077g) {
                do {
                    value10 = m1Var.getValue();
                    c0459b2 = (C0459b) value10;
                } while (!m1Var.m15397i(value10, C0459b.m1461a(c0459b2, null, null, null, null, null, null, false, c0459b2.f3291n == 0 ? "" : c0459b2.f3288k, false, 0, ((C9077g) event).f43609a, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -9217, 4095)));
                return;
            }
            if (event instanceof C9081k) {
                do {
                    value9 = m1Var.getValue();
                    c0459b = (C0459b) value9;
                } while (!m1Var.m15397i(value9, C0459b.m1461a(c0459b, null, null, null, null, null, null, false, c0459b.f3290m == -1 ? "" : c0459b.f3288k, false, ((C9081k) event).f43613a, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -5121, 4095)));
                return;
            }
            if (event instanceof C9075e) {
                do {
                    value8 = m1Var.getValue();
                } while (!m1Var.m15397i(value8, C0459b.m1461a((C0459b) value8, null, null, null, null, null, null, false, null, false, 0, 0, ((C9075e) event).f43607a, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -16385, 4095)));
                return;
            }
            if (event instanceof C9076f) {
                do {
                    value7 = m1Var.getValue();
                } while (!m1Var.m15397i(value7, C0459b.m1461a((C0459b) value7, null, null, null, null, null, null, false, null, false, 0, 0, null, ((C9076f) event).f43608a, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -32769, 4095)));
                return;
            }
            if (event instanceof C9087q) {
                do {
                    value6 = m1Var.getValue();
                } while (!m1Var.m15397i(value6, C0459b.m1461a((C0459b) value6, null, null, null, null, null, null, false, null, false, 0, 0, null, null, ((C9087q) event).f43620a, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -65537, 4095)));
                return;
            }
            boolean z12 = event instanceof C9091u;
            C0910e c0910e = this.f4997i;
            if (z12) {
                c0910e.m2587F("+" + ((C0459b) w0Var.getValue()).f3279b.m11123b() + ((C0459b) w0Var.getValue()).f3279b.f27201g);
                c0.m13502y(q0.m5340g(this), null, null, new C0785c(this, interfaceC7559c, 5), 3);
                return;
            }
            if (event instanceof C9088r) {
                c0910e.m2588G(((C0459b) w0Var.getValue()).m1462b().f27201g);
                c0.m13502y(q0.m5340g(this), null, null, new C0785c(this, interfaceC7559c, 6), 3);
                return;
            }
            if (event instanceof C9074d) {
                c0.m13502y(q0.m5340g(this), null, null, new C0785c(this, interfaceC7559c, 7), 3);
                return;
            }
            if (AbstractC4154l.m8918a(event, C9083m.f43615a)) {
                long epochMilli = LocalDateTime.now().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
                C0458a c0458a = new C0458a(3);
                Locale locale = Locale.getDefault();
                AbstractC4154l.m8922e(locale, "getDefault(...)");
                h4 h4VarM6144d = f4.m6144d(locale, Long.valueOf(epochMilli), c0458a, 28);
                do {
                    value5 = m1Var.getValue();
                } while (!m1Var.m15397i(value5, C0459b.m1461a((C0459b) value5, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, h4VarM6144d, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -671350785, 4095)));
                return;
            }
            boolean z13 = event instanceof C9085o;
            C8810d c8810d = this.f4995g;
            if (z13) {
                C9085o c9085o = (C9085o) event;
                String str3 = c9085o.f43618b;
                c5392d.getClass();
                if (C5392d.m11112k(str3).f21088a) {
                    c0.m13502y(c8810d, null, null, new C0789g(this, AbstractC5178p.g0(c9085o.f43617a).toString(), str3, null), 3);
                    return;
                }
                return;
            }
            if (event instanceof C9086p) {
                c0.m13502y(c8810d, null, null, new C0406i(this, ((C9086p) event).f43619a, interfaceC7559c, 10), 3);
                return;
            }
            if (event instanceof C9082l) {
                c0.m13502y(c8810d, null, null, new C0372k(this, event, interfaceC7559c, 16), 3);
                if (((C0459b) w0Var.getValue()).f3302y) {
                    return;
                }
                this.f5005q = true;
                do {
                    value4 = m1Var.getValue();
                } while (!m1Var.m15397i(value4, C0459b.m1461a((C0459b) value4, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, EnumC0460c.NotProcessed, null, false, false, false, false, null, false, false, -1, 4091)));
                return;
            }
            if (event instanceof C9089s) {
                C5415q c5415qM1462b = ((C0459b) w0Var.getValue()).m1462b();
                String str4 = c5415qM1462b.f27200f;
                String str5 = c5415qM1462b.f27207m;
                c0.m13502y(c8810d, null, null, new C0372k(this, new C6617a(str4, c5415qM1462b.f27201g, str5 == null ? "" : str5, String.valueOf(c5415qM1462b.m11123b()), c5415qM1462b.f27203i, c5415qM1462b.f27204j, String.valueOf(c5415qM1462b.f27205k), null, 0, null, null, null, 3968), interfaceC7559c, 17), 3);
                return;
            }
            if (event instanceof C9090t) {
                do {
                    value3 = m1Var.getValue();
                } while (!m1Var.m15397i(value3, C0459b.m1461a((C0459b) value3, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, !((C0459b) w0Var.getValue()).f3276P, false, -1, 3071)));
                return;
            }
            if (!AbstractC4154l.m8918a(event, C9084n.f43616a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((C0459b) w0Var.getValue()).m1462b().f27207m != null || ((C0459b) w0Var.getValue()).f3290m != -1) {
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, null, false, null, true, 0, 0, null, null, null, null, false, false, false, null, true, false, null, null, null, null, false, null, false, false, null, EnumC3311m.NONE, true, false, true, false, null, false, false, -8390657, 3879)));
                c0.m13502y(c8810d, null, null, new C0372k(this, interfaceC7559c, 18), 3);
                return;
            } else {
                do {
                    value2 = m1Var.getValue();
                    string = this.f4990b.getString(R.string.pls_select_sim);
                    AbstractC4154l.m8922e(string, "getString(...)");
                } while (!m1Var.m15397i(value2, C0459b.m1461a((C0459b) value2, null, null, null, null, null, null, false, string, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -1025, 4079)));
                this.f4994f.m16232g(this.f5000l, "No SIM Number when click on retry for is LEAD Assign to me");
                return;
            }
        }
        LocalDateTime localDateTime = ((C9071a) event).f43603a;
        C8800o c8800o = C8800o.f42459a;
        if (Long.valueOf(C8800o.m16184H(localDateTime)).longValue() > System.currentTimeMillis()) {
            do {
                value13 = m1Var.getValue();
            } while (!m1Var.m15397i(value13, C0459b.m1461a((C0459b) value13, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, localDateTime, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -537133057, 4095)));
        } else {
            while (true) {
                Object value19 = m1Var.getValue();
                LocalDateTime localDateTime2 = localDateTime;
                if (m1Var.m15397i(value19, C0459b.m1461a((C0459b) value19, null, null, null, null, null, null, false, null, false, 0, 0, null, null, null, localDateTime2, false, false, false, null, false, false, null, null, null, Integer.valueOf(R.string.select_valid_reminder_time), false, null, false, false, null, null, false, false, false, false, null, false, false, -537133057, 4095))) {
                    return;
                } else {
                    localDateTime = localDateTime2;
                }
            }
        }
    }

    /* renamed from: k */
    public final void m2120k(boolean z6) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f5003o;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, null, false, "", true, 0, 0, null, null, null, null, false, false, false, null, true, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -8391681, 4095)));
        c0.m13502y(this.f4995g, null, null, new s0(1, this, null, z6), 3);
    }

    /* renamed from: l */
    public final void m2121l(boolean z6) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f5003o;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C0459b.m1461a((C0459b) value, null, null, null, null, null, null, false, "", false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -1025, 4095)));
        c0.m13502y(this.f4995g, null, null, new C0788f(this, z6, null), 3);
    }
}
