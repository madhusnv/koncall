package jt;

import android.content.Context;
import android.net.Uri;
import aq.C0405h;
import c9.C0908c;
import cm.C0983a;
import d7.w0;
import et.C2129a;
import et.C2130b;
import et.C2131c;
import et.C2132d;
import et.C2133e;
import et.C2134f;
import et.C2135g;
import gt.C2729a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.C4132l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.de;
import og.p1;
import og.pe;
import tn.C7174a;
import tx.c0;
import u2.C7320q;
import ug.C7455z;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jt.e */
/* loaded from: classes3.dex */
public final class C3856e extends w0 {

    /* renamed from: b */
    public final C7174a f19846b;

    /* renamed from: c */
    public final C9000c f19847c;

    /* renamed from: d */
    public final C0908c f19848d;

    /* renamed from: e */
    public final C8803r f19849e;

    /* renamed from: f */
    public final C8810d f19850f;

    /* renamed from: g */
    public final C7455z f19851g;

    /* renamed from: h */
    public final C8805t f19852h;

    /* renamed from: i */
    public final m1 f19853i;

    /* renamed from: j */
    public final wx.w0 f19854j;

    /* renamed from: k */
    public final C7320q f19855k;

    public C3856e(C7174a c7174a, C9000c c9000c, C0908c c0908c, C8803r networkState, C8810d c8810d, C7455z c7455z, C8805t c8805t) {
        AbstractC4154l.m8923f(networkState, "networkState");
        this.f19846b = c7174a;
        this.f19847c = c9000c;
        this.f19848d = c0908c;
        this.f19849e = networkState;
        this.f19850f = c8810d;
        this.f19851g = c7455z;
        this.f19852h = c8805t;
        InterfaceC7559c interfaceC7559c = null;
        m1 m1VarM15372c = c1.m15372c(new C2729a("", null, true, "", null, false, "", null, false, 0, "", null, true, null, true, null, null, null, new C0983a("", 14, null, null), false));
        this.f19853i = m1VarM15372c;
        this.f19854j = new wx.w0(m1VarM15372c);
        this.f19855k = new C7320q();
        c0.m13502y(c8810d, null, null, new C3852a(this, interfaceC7559c, 0), 3);
        c0.m13502y(c8810d, null, null, new C3852a(this, interfaceC7559c, 1), 3);
    }

    /* renamed from: e */
    public static final ArrayList m8400e(C3856e c3856e, Context context, List list) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            Uri uriFromFile = null;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream((Uri) obj);
                File file = new File(context.getCacheDir(), "feedback_attachment_" + i10 + ".jpg");
                if (inputStreamOpenInputStream != null) {
                    try {
                        p1.m10811a(inputStreamOpenInputStream, new FileOutputStream(file));
                        inputStreamOpenInputStream.close();
                    } finally {
                    }
                }
                uriFromFile = Uri.fromFile(file);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (uriFromFile != null) {
                arrayList.add(uriFromFile);
            }
            i10 = i11;
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final void m8401f(C3856e c3856e) {
        Object value;
        m1 m1Var = c3856e.f19853i;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C2729a.m6728a((C2729a) value, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, null, null, null, false, 2097151)));
    }

    /* renamed from: g */
    public final void m8402g(de deVar) {
        Object value;
        Object value2;
        Object value3;
        int i10;
        Object value4;
        Object value5;
        String str;
        boolean z6 = deVar instanceof C2134f;
        C7174a c7174a = this.f19846b;
        m1 m1Var = this.f19853i;
        if (z6) {
            do {
                value5 = m1Var.getValue();
                str = ((C2134f) deVar).f9967a;
                c7174a.getClass();
            } while (!m1Var.m15397i(value5, C2729a.m6728a((C2729a) value5, str, C7174a.m13441d(str).f21089b, C7174a.m13441d(str).f21088a, null, null, false, null, null, false, 0, null, null, false, null, false, null, null, null, null, false, 4194296)));
            return;
        }
        if (deVar instanceof C2132d) {
            C2132d c2132d = (C2132d) deVar;
            String str2 = c2132d.f9965a;
            c7174a.getClass();
            C4132l c4132lM13440c = C7174a.m13440c(str2);
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, C2729a.m6728a((C2729a) value4, null, null, false, c2132d.f9965a, c4132lM13440c.f21089b, !c4132lM13440c.f21088a, null, null, false, 0, null, null, false, null, false, null, null, null, null, false, 4194247)));
            return;
        }
        boolean z10 = deVar instanceof C2133e;
        wx.w0 w0Var = this.f19854j;
        C7455z c7455z = this.f19851g;
        if (z10) {
            String str3 = ((C2133e) deVar).f9966a;
            if (str3.length() <= 15) {
                do {
                    value3 = m1Var.getValue();
                    i10 = ((C2729a) w0Var.f39340a.getValue()).f15238j;
                    c7455z.getClass();
                } while (!m1Var.m15397i(value3, C2729a.m6728a((C2729a) value3, null, null, false, null, null, false, str3, C7455z.m14217b(((C2729a) w0Var.f39340a.getValue()).f15238j, str3).f21089b, !C7455z.m14217b(i10, str3).f21088a, 0, null, null, false, null, false, null, null, null, null, false, 4193855)));
                return;
            }
            return;
        }
        if (deVar instanceof C2131c) {
            C2131c c2131c = (C2131c) deVar;
            String str4 = c2131c.f9964a;
            c7174a.getClass();
            C4132l c4132lM13439b = C7174a.m13439b(str4);
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C2729a.m6728a((C2729a) value2, null, null, false, null, null, false, null, null, false, 0, c2131c.f9964a, c4132lM13439b.f21089b, c4132lM13439b.f21088a, null, false, null, null, null, null, false, 4165631)));
            return;
        }
        if (deVar instanceof C2135g) {
            Context context = ((C2135g) deVar).f9968a;
            AbstractC4154l.m8923f(context, "context");
            c0.m13502y(this.f19850f, null, null, new C0405h(this, context, null, 8), 3);
            return;
        }
        if (!(deVar instanceof C2130b)) {
            if (!deVar.equals(C2129a.f9962a)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C2729a.m6728a((C2729a) value, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, null, null, null, false, 3407871)));
            return;
        }
        C2130b c2130b = (C2130b) deVar;
        int i11 = Integer.parseInt(AbstractC5185w.m10136r(c2130b.f9963a.f5813b, "+", ""));
        while (true) {
            Object value6 = m1Var.getValue();
            C0983a c0983a = c2130b.f9963a;
            String str5 = ((C2729a) w0Var.f39340a.getValue()).f15235g;
            c7455z.getClass();
            int i12 = i11;
            if (m1Var.m15397i(value6, C2729a.m6728a((C2729a) value6, null, null, false, null, null, false, null, C7455z.m14217b(i11, ((C2729a) w0Var.f39340a.getValue()).f15235g).f21089b, !C7455z.m14217b(i11, str5).f21088a, i12, null, null, false, null, false, null, null, null, c0983a, false, 3144831))) {
                return;
            } else {
                i11 = i12;
            }
        }
    }

    /* renamed from: h */
    public final boolean m8403h() {
        C3856e c3856e = this;
        wx.w0 w0Var = c3856e.f19854j;
        String str = ((C2729a) w0Var.f39340a.getValue()).f15229a;
        c3856e.f19846b.getClass();
        C4132l c4132lM13441d = C7174a.m13441d(str);
        C4132l c4132lM13440c = C7174a.m13440c(((C2729a) w0Var.f39340a.getValue()).f15232d);
        String str2 = ((C2729a) w0Var.f39340a.getValue()).f15235g;
        int i10 = ((C2729a) w0Var.f39340a.getValue()).f15238j;
        c3856e.f19851g.getClass();
        C4132l c4132lM14217b = C7455z.m14217b(i10, str2);
        C4132l c4132lM13439b = C7174a.m13439b(((C2729a) w0Var.f39340a.getValue()).f15239k);
        C4132l c4132lM13438a = C7174a.m13438a(c3856e.f19855k, ((C2729a) w0Var.f39340a.getValue()).f15244p);
        Boolean boolValueOf = Boolean.valueOf(c4132lM13441d.f21088a);
        boolean z6 = c4132lM13440c.f21088a;
        Boolean boolValueOf2 = Boolean.valueOf(z6);
        boolean z10 = c4132lM14217b.f21088a;
        List listM10834i = pe.m10834i(boolValueOf, boolValueOf2, Boolean.valueOf(z10), Boolean.valueOf(c4132lM13439b.f21088a), Boolean.valueOf(c4132lM13438a.f21088a));
        if (listM10834i.isEmpty()) {
            return true;
        }
        Iterator it = listM10834i.iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue()) {
                c3856e = this;
            } else {
                while (true) {
                    m1 m1Var = c3856e.f19853i;
                    Object value = m1Var.getValue();
                    C2729a c2729a = (C2729a) value;
                    boolean z11 = c4132lM13441d.f21088a;
                    Integer num = !z11 ? c4132lM13441d.f21089b : null;
                    Integer num2 = !z6 ? c4132lM13440c.f21089b : null;
                    Integer num3 = !z10 ? c4132lM14217b.f21089b : null;
                    boolean z12 = c4132lM13439b.f21088a;
                    Integer num4 = !z12 ? c4132lM13439b.f21089b : null;
                    boolean z13 = c4132lM13438a.f21088a;
                    if (m1Var.m15397i(value, C2729a.m6728a(c2729a, null, num, z11, null, num2, !z6, null, num3, !z10, 0, null, num4, z12, !z13 ? c4132lM13438a.f21089b : null, z13, null, null, null, null, false, 4070985))) {
                        return false;
                    }
                    c3856e = this;
                }
            }
        }
        return true;
    }
}
