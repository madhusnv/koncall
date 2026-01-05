package yq;

import android.net.Uri;
import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0732l;
import c9.C0908c;
import com.websoptimization.callyzerbiz.R;
import d7.w0;
import dr.C1769s;
import im.C3299a;
import im.C3300b;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4531c;
import mm.C4798i;
import nn.C5113e;
import nx.AbstractC5178p;
import og.pe;
import pg.o6;
import rw.AbstractC6663m;
import rw.C6668r;
import tx.c0;
import tx.m0;
import tx.s1;
import uq.AbstractC7507m;
import uq.C7495a;
import uq.C7496b;
import uq.C7497c;
import uq.C7498d;
import uq.C7499e;
import uq.C7500f;
import uq.C7501g;
import uq.C7502h;
import uq.C7503i;
import uq.C7504j;
import uq.C7505k;
import uq.C7506l;
import uw.InterfaceC7559c;
import vq.C7730b;
import vq.C7731c;
import vq.C7732d;
import vq.EnumC7729a;
import vx.C7806h;
import wq.C8142a;
import wq.C8143b;
import wq.C8144c;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.h3;
import xm.y5;
import xq.C8429c;
import xq.C8430d;
import xq.C8434h;
import yv.C8805t;
import yx.C8810d;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yq.f */
/* loaded from: classes3.dex */
public final class C8741f extends w0 {

    /* renamed from: b */
    public final C0908c f42333b;

    /* renamed from: c */
    public final C5113e f42334c;

    /* renamed from: d */
    public final C8805t f42335d;

    /* renamed from: e */
    public final y5 f42336e;

    /* renamed from: f */
    public final m1 f42337f;

    /* renamed from: g */
    public final wx.w0 f42338g;

    /* renamed from: h */
    public final m1 f42339h;

    /* renamed from: i */
    public final wx.w0 f42340i;

    /* renamed from: j */
    public final m1 f42341j;

    /* renamed from: k */
    public final wx.w0 f42342k;

    /* renamed from: l */
    public final m1 f42343l;

    /* renamed from: m */
    public final wx.w0 f42344m;

    /* renamed from: n */
    public final C8810d f42345n;

    /* renamed from: o */
    public final C7806h f42346o;

    /* renamed from: p */
    public final C8203d f42347p;

    /* renamed from: q */
    public C7730b f42348q;

    /* renamed from: r */
    public final C4531c f42349r;

    /* renamed from: s */
    public s1 f42350s;

    public C8741f(C0908c c0908c, C5113e c5113e, C8805t c8805t, y5 userSIMRepository) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f42333b = c0908c;
        this.f42334c = c5113e;
        this.f42335d = c8805t;
        this.f42336e = userSIMRepository;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C8142a(c6668r, false, false, false, c6668r, false, 0));
        this.f42337f = m1VarM15372c;
        this.f42338g = new wx.w0(m1VarM15372c);
        EnumC7729a enumC7729a = EnumC7729a.Today;
        EnumC7729a enumC7729a2 = EnumC7729a.Yesterday;
        EnumC7729a enumC7729a3 = EnumC7729a.Week;
        EnumC7729a enumC7729a4 = EnumC7729a.Month;
        EnumC7729a enumC7729a5 = EnumC7729a.Year;
        EnumC7729a enumC7729a6 = EnumC7729a.Custom;
        EnumC7729a enumC7729a7 = EnumC7729a.AllTime;
        List listM10834i = pe.m10834i(enumC7729a, enumC7729a2, enumC7729a3, enumC7729a4, enumC7729a5, enumC7729a6, enumC7729a7);
        LocalDate localDateMinusDays = LocalDate.now().minusDays(7L);
        AbstractC4154l.m8922e(localDateMinusDays, "minusDays(...)");
        LocalDate localDateNow = LocalDate.now();
        AbstractC4154l.m8922e(localDateNow, "now(...)");
        m1 m1VarM15372c2 = c1.m15372c(new C8144c(listM10834i, enumC7729a7, localDateMinusDays, localDateNow));
        this.f42339h = m1VarM15372c2;
        this.f42340i = new wx.w0(m1VarM15372c2);
        InterfaceC7559c interfaceC7559c = null;
        m1 m1VarM15372c3 = c1.m15372c(new C8143b("", "", true, c6668r, c6668r, c6668r, c6668r, c6668r, c6668r, c6668r, c6668r, c6668r, false, null, new C7732d(null, null, null)));
        this.f42341j = m1VarM15372c3;
        this.f42342k = new wx.w0(m1VarM15372c3);
        m1 m1VarM15372c4 = c1.m15372c("");
        this.f42343l = m1VarM15372c4;
        this.f42344m = new wx.w0(m1VarM15372c4);
        C0496f c0496f = m0.f34659a;
        C8810d c8810dM13479b = c0.m13479b(ExecutorC0495e.f3538c);
        this.f42345n = c8810dM13479b;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f42346o = c7806hM11805a;
        this.f42347p = c1.m15389t(c7806hM11805a);
        int i10 = 1;
        this.f42349r = new C4531c(Integer.valueOf(((C8142a) m1VarM15372c.getValue()).f39001g), new C8429c(this, 2), new C8429c(this, 3), new C8740e(this, interfaceC7559c, i10), new C8740e(this, interfaceC7559c, 0), new C8434h(this, interfaceC7559c, i10), null, new C8430d(this, interfaceC7559c, 2), new C8430d(this, interfaceC7559c, i10), new C1769s(this, interfaceC7559c, 12), 1088);
        c0.m13502y(c8810dM13479b, null, null, new h3(this, interfaceC7559c, 29), 3);
        c0.m13502y(c8810dM13479b, null, null, new C0732l(this, interfaceC7559c, 20), 3);
    }

    /* renamed from: e */
    public static final void m16120e(C8741f c8741f, List list) {
        Object next;
        c8741f.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = ((C7731c) it.next()).f37282a;
        while (it.hasNext()) {
            int i11 = ((C7731c) it.next()).f37282a;
            if (i10 < i11) {
                i10 = i11;
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C7731c) next).f37282a == i10) {
                    break;
                }
            }
        }
        C7731c c7731c = (C7731c) next;
        if (c7731c != null) {
            c7731c.f37284c = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.net.Uri, java.lang.Boolean, java.lang.Integer] */
    /* renamed from: f */
    public final void m16121f(AbstractC7507m event) {
        Object value;
        Object value2;
        Object value3;
        Object next;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C7506l;
        m1 m1Var = this.f42343l;
        if (z6) {
            do {
                value12 = m1Var.getValue();
            } while (!m1Var.m15397i(value12, ((C7506l) event).f36202a));
            return;
        }
        if (event instanceof C7496b) {
            do {
                value11 = m1Var.getValue();
            } while (!m1Var.m15397i(value11, ""));
            return;
        }
        boolean z10 = event instanceof C7497c;
        C8810d c8810d = this.f42345n;
        InterfaceC7559c interfaceC7559c = null;
        if (z10) {
            c0.m13502y(c8810d, null, null, new C8739d(this, interfaceC7559c, 1), 3);
            return;
        }
        boolean z11 = event instanceof C7500f;
        m1 m1Var2 = this.f42337f;
        wx.w0 w0Var = this.f42338g;
        if (z11) {
            C7500f c7500f = (C7500f) event;
            C4798i c4798i = c7500f.f36192a;
            if (!c7500f.f36193b) {
                ArrayList arrayListD0 = AbstractC6663m.d0(((C8142a) w0Var.f39340a.getValue()).f38999e);
                arrayListD0.remove(c4798i);
                do {
                    value9 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value9, C8142a.m15319a((C8142a) value9, null, false, false, false, arrayListD0, 0, 111)));
                return;
            }
            if (((C8142a) w0Var.f39340a.getValue()).f38999e.size() >= 5) {
                c0.m13502y(c8810d, null, null, new C8739d(this, interfaceC7559c, 2), 3);
                return;
            }
            ArrayList arrayListD02 = AbstractC6663m.d0(((C8142a) w0Var.f39340a.getValue()).f38999e);
            arrayListD02.add(c4798i);
            do {
                value10 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value10, C8142a.m15319a((C8142a) value10, null, false, false, false, arrayListD02, 0, 111)));
            return;
        }
        if (event instanceof C7495a) {
            do {
                value8 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value8, C8142a.m15319a((C8142a) value8, null, false, false, false, new ArrayList(), 0, 111)));
            return;
        }
        if (event instanceof C7499e) {
            List list = ((C8142a) w0Var.f39340a.getValue()).f38999e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((C7499e) event).f36191a.contains((C4798i) obj)) {
                    arrayList.add(obj);
                }
            }
            do {
                value7 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value7, C8142a.m15319a((C8142a) value7, null, false, false, false, arrayList, 0, 111)));
            return;
        }
        boolean z12 = event instanceof C7504j;
        m1 m1Var3 = this.f42339h;
        if (z12) {
            C7504j c7504j = (C7504j) event;
            LocalDate localDate = c7504j.f36199b;
            if (c7504j.f36198a) {
                do {
                    value6 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value6, C8144c.m15321a((C8144c) value6, null, localDate, null, 11)));
                return;
            } else {
                do {
                    value5 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value5, C8144c.m15321a((C8144c) value5, null, null, localDate, 7)));
                return;
            }
        }
        if (event instanceof C7503i) {
            Iterator it = ((C8144c) this.f42340i.f39340a.getValue()).f39017a.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((EnumC7729a) next).getIndex() == ((C7503i) event).f36197a) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EnumC7729a enumC7729a = (EnumC7729a) next;
            if (enumC7729a != null) {
                do {
                    value4 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value4, C8144c.m15321a((C8144c) value4, enumC7729a, null, null, 13)));
                return;
            }
            return;
        }
        if (event instanceof C7501g) {
            if (((C8142a) w0Var.f39340a.getValue()).f38999e.size() < 2) {
                ((C7501g) event).f36195b.invoke();
                return;
            } else {
                ((C7501g) event).f36194a.invoke();
                return;
            }
        }
        boolean z13 = event instanceof C7502h;
        int i10 = 0;
        m1 m1Var4 = this.f42341j;
        if (z13) {
            StringBuilder sb2 = new StringBuilder("Compare Calls ");
            int i11 = 0;
            for (Object obj2 : ((C8142a) w0Var.f39340a.getValue()).f38999e) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    pe.m10842q();
                    throw null;
                }
                C4798i c4798i2 = (C4798i) obj2;
                List listM10112W = AbstractC5178p.m10112W(c4798i2.f23877b, new String[]{" "}, 6);
                sb2.append(listM10112W.isEmpty() ? c4798i2.f23877b : (String) listM10112W.get(0));
                if (i11 < ((C8142a) w0Var.f39340a.getValue()).f38999e.size() - 1) {
                    sb2.append(",");
                }
                i11 = i12;
            }
            sb2.append(".csv");
            do {
                value3 = m1Var4.getValue();
            } while (!m1Var4.m15397i(value3, C8143b.m15320a((C8143b) value3, null, null, false, null, null, null, null, null, null, null, null, null, false, sb2.toString(), null, 24575)));
            return;
        }
        if (event instanceof C7505k) {
            C7505k c7505k = (C7505k) event;
            Uri uri = c7505k.f36200a;
            if (uri == null) {
                do {
                    value2 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value2, C8143b.m15320a((C8143b) value2, null, null, false, null, null, null, null, null, null, null, null, null, false, null, new C7732d(null, null, null), 8191)));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C3299a(pe.m10834i("Name", "Total Call", "incoming call", "outgoing call", "Missed call", "Total Duration", "Incoming Duration", "Outgoing Duration", "Last interacted")));
            wx.w0 w0Var2 = this.f42342k;
            for (Object obj3 : ((C8143b) w0Var2.f39340a.getValue()).f39005d) {
                int i13 = i10 + 1;
                if (i10 < 0) {
                    ?? r21 = interfaceC7559c;
                    pe.m10842q();
                    throw r21;
                }
                String str = (String) obj3;
                C8143b c8143b = (C8143b) w0Var2.f39340a.getValue();
                arrayList2.add(new C3299a(pe.m10834i(str, ((C7731c) c8143b.f39006e.get(i10)).f37283b, ((C7731c) c8143b.f39008g.get(i10)).f37283b, ((C7731c) c8143b.f39007f.get(i10)).f37283b, ((C7731c) c8143b.f39009h.get(i10)).f37283b, ((C7731c) c8143b.f39010i.get(i10)).f37283b, ((C7731c) c8143b.f39011j.get(i10)).f37283b, ((C7731c) c8143b.f39012k.get(i10)).f37283b, ((C7731c) c8143b.f39013l.get(i10)).f37283b)));
                i10 = i13;
                interfaceC7559c = interfaceC7559c;
            }
            new C8989c(24, new C3300b(arrayList2)).f0(uri, c7505k.f36201b);
            do {
                value = m1Var4.getValue();
            } while (!m1Var4.m15397i(value, C8143b.m15320a((C8143b) value, null, null, false, null, null, null, null, null, null, null, null, null, false, null, new C7732d(Boolean.TRUE, Integer.valueOf(R.string.csv_exported_true), uri), 16383)));
            return;
        }
        Object obj4 = null;
        if (!(event instanceof C7498d)) {
            throw new NoWhenBranchMatchedException();
        }
        while (true) {
            Object value13 = m1Var4.getValue();
            ?? r22 = obj4;
            if (m1Var4.m15397i(value13, C8143b.m15320a((C8143b) value13, null, null, false, null, null, null, null, null, null, null, null, null, false, null, new C7732d(r22, r22, r22), 8191))) {
                return;
            } else {
                obj4 = r22;
            }
        }
    }
}
