package kv;

import al.C0174b;
import android.content.Context;
import android.widget.Toast;
import ay.C0496f;
import ay.ExecutorC0495e;
import b2.s0;
import cj.C0979e;
import com.websoptimization.callyzerbiz.R;
import d7.w0;
import eo.C2082h;
import hv.AbstractC3049n;
import hv.C3036a;
import hv.C3037b;
import hv.C3038c;
import hv.C3039d;
import hv.C3040e;
import hv.C3041f;
import hv.C3042g;
import hv.C3043h;
import hv.C3044i;
import hv.C3045j;
import hv.C3046k;
import hv.C3047l;
import hv.C3048m;
import io.C3328c;
import iv.C3357a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.C4132l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import l4.d0;
import nn.C5113e;
import og.pe;
import og.yf;
import pg.f9;
import pg.o6;
import qn.C6263l;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import sv.C6955c;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.k1;
import wx.m1;
import yv.C8791f;
import yv.C8801p;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kv.f */
/* loaded from: classes3.dex */
public final class C4252f extends w0 {

    /* renamed from: b */
    public final d0 f21604b;

    /* renamed from: c */
    public final C3328c f21605c;

    /* renamed from: d */
    public final C0174b f21606d;

    /* renamed from: e */
    public final C6263l f21607e;

    /* renamed from: f */
    public final C0979e f21608f;

    /* renamed from: g */
    public final C8805t f21609g;

    /* renamed from: h */
    public final wx.w0 f21610h;

    /* renamed from: i */
    public final C2082h f21611i;

    /* renamed from: j */
    public final C5113e f21612j;

    /* renamed from: k */
    public final C9000c f21613k;

    /* renamed from: l */
    public final Context f21614l;

    /* renamed from: m */
    public final C8810d f21615m;

    /* renamed from: n */
    public final String f21616n;

    /* renamed from: o */
    public final String f21617o;

    /* renamed from: p */
    public final String f21618p;

    /* renamed from: q */
    public final String f21619q;

    /* renamed from: r */
    public final String f21620r;

    /* renamed from: s */
    public final String f21621s;

    /* renamed from: t */
    public final String f21622t;

    /* renamed from: u */
    public final m1 f21623u;

    /* renamed from: v */
    public final wx.w0 f21624v;

    /* renamed from: w */
    public final C7806h f21625w;

    /* renamed from: x */
    public final C8203d f21626x;

    public C4252f(d0 d0Var, C3328c c3328c, C0174b c0174b, C6263l c6263l, C0979e c0979e, C8805t c8805t, wx.w0 w0Var, C2082h c2082h, C5113e c5113e, C9000c c9000c, Context context, C8810d c8810d, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21604b = d0Var;
        this.f21605c = c3328c;
        this.f21606d = c0174b;
        this.f21607e = c6263l;
        this.f21608f = c0979e;
        this.f21609g = c8805t;
        this.f21610h = w0Var;
        this.f21611i = c2082h;
        this.f21612j = c5113e;
        this.f21613k = c9000c;
        this.f21614l = context;
        this.f21615m = c8810d;
        this.f21616n = str;
        this.f21617o = str2;
        this.f21618p = str3;
        this.f21619q = str4;
        this.f21620r = str5;
        this.f21621s = str6;
        this.f21622t = str7;
        C4381z c4381z = new C4381z("", 6, 0L);
        C4381z c4381z2 = new C4381z("", 6, 0L);
        C4381z c4381z3 = new C4381z("", 6, 0L);
        C4381z c4381z4 = new C4381z("", 6, 0L);
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C3357a(0, c4381z, c4381z2, c4381z3, c4381z4, "", c6668r, null, false, false, "", c6668r, c6668r, null, true, false));
        this.f21623u = m1VarM15372c;
        this.f21624v = new wx.w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f21625w = c7806hM11805a;
        this.f21626x = c1.m15389t(c7806hM11805a);
        m8982g(C3039d.f16370a);
        c0.m13502y(c8810d, null, null, new C4247a(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ac A[LOOP:4: B:47:0x0130->B:100:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[PHI: r13
      PHI (r13v10 int) = (r13v8 int), (r13v11 int) binds: [B:64:0x01c7, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5 A[PHI: r13
      0x01b5: PHI (r13v8 int) = (r13v7 int), (r13v9 int) binds: [B:61:0x01b1, B:17:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a7 A[RETURN] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8980e(kv.C4252f r52, java.util.List r53, ww.AbstractC8193c r54) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.C4252f.m8980e(kv.f, java.util.List, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8981f(kv.C4252f r26, mm.C4802m r27, ww.AbstractC8193c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.C4252f.m8981f(kv.f, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: g */
    public final void m8982g(AbstractC3049n event) {
        wx.w0 w0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        C4381z c4381z;
        String str;
        Object value9;
        C4381z c4381z2;
        String str2;
        Object value10;
        C4381z c4381z3;
        String str3;
        Object value11;
        C4381z c4381z4;
        String str4;
        Object value12;
        Object value13;
        Object value14;
        Object value15;
        Object value16;
        AbstractC4154l.m8923f(event, "event");
        boolean zEquals = event.equals(C3039d.f16370a);
        int i10 = 4;
        int i11 = 3;
        InterfaceC7559c interfaceC7559c = null;
        Context context = this.f21614l;
        m1 m1Var = this.f21623u;
        if (zEquals) {
            if (!((C8801p) this.f21610h.f39340a.getValue()).f42464a) {
                do {
                    value15 = m1Var.getValue();
                } while (!m1Var.m15397i(value15, C3357a.m7671a((C3357a) value15, 0, null, null, null, null, null, null, f9.m11628b(context, R.string.no_internet_connection), true, false, null, null, null, null, false, false, 65151)));
                return;
            }
            C0496f c0496f = m0.f34659a;
            c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C4247a(this, interfaceC7559c, i11), 3);
            do {
                value16 = m1Var.getValue();
            } while (!m1Var.m15397i(value16, C3357a.m7671a((C3357a) value16, 60, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, 65534)));
            C0496f c0496f2 = m0.f34659a;
            c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C4247a(this, interfaceC7559c, i10), 3);
            return;
        }
        if (event instanceof C3040e) {
            do {
                value14 = m1Var.getValue();
            } while (!m1Var.m15397i(value14, C3357a.m7671a((C3357a) value14, 0, null, null, null, null, ((C3040e) event).f16371a, null, null, false, false, null, null, null, null, false, false, 65503)));
            return;
        }
        if (event instanceof C3037b) {
            do {
                value13 = m1Var.getValue();
            } while (!m1Var.m15397i(value13, C3357a.m7671a((C3357a) value13, 0, null, null, null, null, null, null, null, false, false, null, null, ((C3037b) event).f16368a, null, false, false, 61439)));
            return;
        }
        if (event instanceof C3046k) {
            do {
                value12 = m1Var.getValue();
            } while (!m1Var.m15397i(value12, C3357a.m7671a((C3357a) value12, 0, null, null, null, null, null, null, null, false, false, null, ((C3046k) event).f16377a, null, null, false, false, 63487)));
            return;
        }
        boolean z6 = event instanceof C3041f;
        C0174b c0174b = this.f21606d;
        if (z6) {
            do {
                value11 = m1Var.getValue();
                c4381z4 = ((C3041f) event).f16372a;
                str4 = c4381z4.f21945a.f13620b;
                c0174b.getClass();
            } while (!m1Var.m15397i(value11, C3357a.m7671a((C3357a) value11, 0, c4381z4, null, null, null, null, null, null, false, false, null, null, null, C0174b.m392k(str4).f21089b, false, false, 57341)));
            return;
        }
        if (event instanceof C3042g) {
            do {
                value10 = m1Var.getValue();
                c4381z3 = ((C3042g) event).f16373a;
                str3 = c4381z3.f21945a.f13620b;
                c0174b.getClass();
            } while (!m1Var.m15397i(value10, C3357a.m7671a((C3357a) value10, 0, null, c4381z3, null, null, null, null, null, false, false, null, null, null, C0174b.m392k(str3).f21089b, false, false, 57339)));
            return;
        }
        if (event instanceof C3043h) {
            do {
                value9 = m1Var.getValue();
                c4381z2 = ((C3043h) event).f16374a;
                str2 = c4381z2.f21945a.f13620b;
                c0174b.getClass();
            } while (!m1Var.m15397i(value9, C3357a.m7671a((C3357a) value9, 0, null, null, c4381z2, null, null, null, null, false, false, null, null, null, C0174b.m392k(str2).f21089b, false, false, 57335)));
            return;
        }
        if (event instanceof C3044i) {
            do {
                value8 = m1Var.getValue();
                c4381z = ((C3044i) event).f16375a;
                str = c4381z.f21945a.f13620b;
                c0174b.getClass();
            } while (!m1Var.m15397i(value8, C3357a.m7671a((C3357a) value8, 0, null, null, null, c4381z, null, null, null, false, false, null, null, null, C0174b.m392k(str).f21089b, false, false, 57327)));
            return;
        }
        boolean zEquals2 = event.equals(C3047l.f16378a);
        int i12 = 0;
        wx.w0 w0Var2 = this.f21624v;
        if (zEquals2) {
            k1 k1Var = w0Var2.f39340a;
            k1 k1Var2 = w0Var2.f39340a;
            if (!((C3357a) k1Var.getValue()).f17768o) {
                do {
                    value4 = m1Var.getValue();
                } while (!m1Var.m15397i(value4, C3357a.m7671a((C3357a) value4, 0, null, null, null, null, null, null, f9.m11628b(context, R.string.no_internet_connection), true, false, null, null, null, null, false, false, 65151)));
                return;
            }
            String str5 = ((C3357a) k1Var2.getValue()).f17755b.f21945a.f13620b;
            c0174b.getClass();
            List listM10834i = pe.m10834i(C0174b.m392k(str5), C0174b.m392k(((C3357a) k1Var2.getValue()).f17756c.f21945a.f13620b), C0174b.m392k(((C3357a) k1Var2.getValue()).f17757d.f21945a.f13620b), C0174b.m392k(((C3357a) k1Var2.getValue()).f17758e.f21945a.f13620b));
            if (!listM10834i.isEmpty()) {
                Iterator it = listM10834i.iterator();
                while (it.hasNext()) {
                    if (!((C4132l) it.next()).f21088a) {
                        C3357a c3357a = (C3357a) k1Var2.getValue();
                        C4381z c4381z5 = c3357a.f17755b;
                        C4381z c4381z6 = c3357a.f17758e;
                        C4381z c4381z7 = c3357a.f17757d;
                        C4381z c4381z8 = c3357a.f17756c;
                        if (c4381z5.f21945a.f13620b.length() == 0 && c4381z8.f21945a.f13620b.length() == 0 && c4381z7.f21945a.f13620b.length() == 0 && c4381z6.f21945a.f13620b.length() == 0) {
                            do {
                                value7 = m1Var.getValue();
                            } while (!m1Var.m15397i(value7, C3357a.m7671a((C3357a) value7, 0, null, null, null, null, null, null, null, false, false, null, null, null, Integer.valueOf(R.string.please_enter_otp), false, false, 57343)));
                            return;
                        }
                        if (c3357a.f17755b.f21945a.f13620b.length() == 0 || c4381z8.f21945a.f13620b.length() == 0 || c4381z7.f21945a.f13620b.length() == 0 || c4381z6.f21945a.f13620b.length() == 0) {
                            do {
                                value5 = m1Var.getValue();
                            } while (!m1Var.m15397i(value5, C3357a.m7671a((C3357a) value5, 0, null, null, null, null, null, null, null, false, false, null, null, null, Integer.valueOf(R.string.please_enter_the_complete_otp), false, false, 57343)));
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listM10834i) {
                            if (!((C4132l) obj).f21088a) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            Integer num = ((C4132l) obj2).f21089b;
                            if (num != null) {
                                arrayList2.add(num);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return;
                        }
                        do {
                            value6 = m1Var.getValue();
                        } while (!m1Var.m15397i(value6, C3357a.m7671a((C3357a) value6, 0, null, null, null, null, null, null, null, false, false, null, null, null, (Integer) AbstractC6663m.m12742F(arrayList2), false, false, 57343)));
                        return;
                    }
                }
            }
            c0.m13502y(this.f21615m, null, null, new s0(this, interfaceC7559c, i11), 3);
            return;
        }
        if (!event.equals(C3038c.f16369a)) {
            if (event.equals(C3036a.f16367a)) {
                do {
                    value3 = m1Var.getValue();
                } while (!m1Var.m15397i(value3, C3357a.m7671a((C3357a) value3, 0, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, 65279)));
                return;
            }
            if (event.equals(C3048m.f16379a)) {
                C8791f c8791f = C8791f.f42457a;
                if (C8791f.m16174g(context, "https://youtu.be/B3DtNYhuri4")) {
                    return;
                }
                Toast.makeText(context, context.getString(R.string.intent_action_error), 0).show();
                return;
            }
            if (!(event instanceof C3045j)) {
                throw new NoWhenBranchMatchedException();
            }
            while (true) {
                Object value17 = m1Var.getValue();
                CharSequence charSequence = ((C3045j) event).f16376a;
                String strValueOf = String.valueOf(charSequence.charAt(i12));
                int length = String.valueOf(charSequence.charAt(i12)).length();
                w0Var = w0Var2;
                C4381z c4381z9 = new C4381z(strValueOf, 4, yf.m11072a(length, length));
                String strValueOf2 = String.valueOf(charSequence.charAt(1));
                int length2 = String.valueOf(charSequence.charAt(1)).length();
                C4381z c4381z10 = new C4381z(strValueOf2, 4, yf.m11072a(length2, length2));
                String strValueOf3 = String.valueOf(charSequence.charAt(2));
                int length3 = String.valueOf(charSequence.charAt(2)).length();
                C4381z c4381z11 = new C4381z(strValueOf3, 4, yf.m11072a(length3, length3));
                String strValueOf4 = String.valueOf(charSequence.charAt(3));
                int length4 = String.valueOf(charSequence.charAt(3)).length();
                if (m1Var.m15397i(value17, C3357a.m7671a((C3357a) value17, 0, c4381z9, c4381z10, c4381z11, new C4381z(strValueOf4, 4, yf.m11072a(length4, length4)), null, null, null, false, false, null, null, null, null, false, false, 65505))) {
                    break;
                }
                w0Var2 = w0Var;
                i12 = 0;
            }
            k1 k1Var3 = w0Var.f39340a;
            k1 k1Var4 = w0Var.f39340a;
            String str6 = ((C3357a) k1Var3.getValue()).f17755b.f21945a.f13620b;
            c0174b.getClass();
            List listM10834i2 = pe.m10834i(C0174b.m392k(str6), C0174b.m392k(((C3357a) k1Var4.getValue()).f17756c.f21945a.f13620b), C0174b.m392k(((C3357a) k1Var4.getValue()).f17757d.f21945a.f13620b), C0174b.m392k(((C3357a) k1Var4.getValue()).f17758e.f21945a.f13620b));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listM10834i2) {
                if (!((C4132l) obj3).f21088a) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                Integer num2 = ((C4132l) obj4).f21089b;
                if (num2 != null) {
                    arrayList4.add(num2);
                }
            }
            if (arrayList4.isEmpty()) {
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C3357a.m7671a((C3357a) value, 0, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, 57343)));
                return;
            } else {
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C3357a.m7671a((C3357a) value2, 0, null, null, null, null, null, null, null, false, false, null, null, null, (Integer) AbstractC6663m.m12742F(arrayList4), false, false, 57343)));
                return;
            }
        }
        List list = ((C3357a) w0Var2.f39340a.getValue()).f17765l;
        ArrayList arrayList5 = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList5.add(C6955c.m13207a((C6955c) it2.next(), null, false, false, 3));
        }
        while (true) {
            Object value18 = m1Var.getValue();
            ArrayList arrayList6 = arrayList5;
            if (m1Var.m15397i(value18, C3357a.m7671a((C3357a) value18, 0, null, null, null, null, null, null, null, false, false, null, arrayList6, null, null, false, false, 63487))) {
                return;
            } else {
                arrayList5 = arrayList6;
            }
        }
    }
}
