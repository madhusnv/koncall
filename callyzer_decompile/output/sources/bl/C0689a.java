package bl;

import a1.C0004c;
import ad.C0100g;
import ad.C0104k;
import al.C0176d;
import al.C0178f;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import b00.C0526k;
import b00.C0529n;
import b00.a0;
import bd.C0645a;
import c00.AbstractC0836c;
import c00.C0839f;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.k7;
import com.google.firebase.components.ComponentRegistrar;
import com.websoptimization.callyzerbiz.R;
import dd.C1683a;
import dd.C1684b;
import dd.C1687e;
import dg.C1714c;
import dg.InterfaceC1713b;
import dg.InterfaceC1715d;
import e0.InterfaceC1893b;
import eb.AbstractC1991o;
import eb.C1978b;
import eb.a3;
import eb.b1;
import eb.c3;
import eb.d2;
import eb.j0;
import eb.l3;
import eb.o1;
import eb.t3;
import eb.v2;
import ex.InterfaceC2139c;
import fb.C2237k;
import fb.C2238l;
import fb.C2243q;
import fb.C2244r;
import fb.C2245s;
import fc.C2259g;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2265c;
import g7.InterfaceC2537b;
import gl.C2626b;
import gl.C2628d;
import hc.C2888k;
import hd.C2893e;
import hd.C2896h;
import hd.C2897i;
import hd.EnumC2908t;
import i0.g2;
import iz.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jc.AbstractC3745u;
import jc.C3742r;
import jc.C3743s;
import jc.e0;
import k4.InterfaceC4003x;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import mb.b0;
import mb.n3;
import mq.C4833a;
import net.schmizz.sshj.connection.ConnectionException;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import ny.InterfaceC5188b;
import o6.InterfaceC5301c;
import og.ff;
import p020v.a1;
import p020v.x0;
import pg.AbstractC5933n;
import pg.f8;
import qi.C6219b;
import qi.InterfaceC6222e;
import qi.InterfaceC6223f;
import rw.AbstractC6662l;
import rw.AbstractC6664n;
import sc.InterfaceC6794n;
import sd.C6813g;
import tc.C7117b;
import ud.InterfaceC7403g;
import ug.InterfaceC7450u;
import uw.InterfaceC7563g;
import yv.AbstractC8804s;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bl.a */
/* loaded from: classes.dex */
public final class C0689a implements InterfaceC7563g, InterfaceC2537b, InterfaceC7403g, InterfaceC1715d, InterfaceC1893b, InterfaceC6794n, InterfaceC6222e, InterfaceC6223f, InterfaceC4003x, InterfaceC5301c, InterfaceC5188b, InterfaceC7450u {

    /* renamed from: b */
    public static final /* synthetic */ C0689a f4323b = new C0689a(29);

    /* renamed from: a */
    public final /* synthetic */ int f4324a;

    public /* synthetic */ C0689a(int i10) {
        this.f4324a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m1981i(mx.InterfaceC4911g r3, boolean r4) {
        /*
            int r0 = ad.C0103j.f355c
            ad.i r0 = ad.C0102i.f354a
            if (r4 != 0) goto L19
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r3, r4)
            java.util.Iterator r4 = r3.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L16
            goto L19
        L16:
            java.lang.String r4 = ""
            goto L1b
        L19:
            java.lang.String r4 = "?"
        L1b:
            ad.h r0 = new ad.h
            r1 = 0
            r0.<init>(r1)
            r1 = 28
            java.lang.String r2 = "&"
            java.lang.String r3 = mx.AbstractC4913i.m9810f(r3, r2, r4, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.C0689a.m1981i(mx.g, boolean):java.lang.String");
    }

    /* renamed from: j */
    public static final boolean m1982j(a0 a0Var) {
        a0 a0Var2 = C0839f.f5309e;
        C0529n c0529nM1611p = a0Var.f3586a;
        int iM1610k = C0529n.m1610k(c0529nM1611p, AbstractC0836c.f5299a);
        if (iM1610k == -1) {
            iM1610k = C0529n.m1610k(a0Var.f3586a, AbstractC0836c.f5300b);
        }
        if (iM1610k != -1) {
            c0529nM1611p = C0529n.m1611p(c0529nM1611p, iM1610k + 1, 0, 2);
        } else if (a0Var.m1521f() != null && c0529nM1611p.mo1563d() == 2) {
            c0529nM1611p = C0529n.f3647d;
        }
        return !AbstractC5185w.m10129k(c0529nM1611p.m1613r(), ".class", true);
    }

    /* renamed from: k */
    public static ArrayList m1983k(List protocols) {
        AbstractC4154l.m8923f(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((f0) obj) != f0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((f0) obj2).toString());
        }
        return arrayList2;
    }

    /* renamed from: l */
    public static byte[] m1984l(List protocols) {
        AbstractC4154l.m8923f(protocols, "protocols");
        C0526k c0526k = new C0526k();
        ArrayList arrayListM1983k = m1983k(protocols);
        int size = arrayListM1983k.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM1983k.get(i10);
            i10++;
            String str = (String) obj;
            c0526k.B0(str.length());
            c0526k.H0(str);
        }
        return c0526k.m1591S(c0526k.f3638b);
    }

    /* renamed from: m */
    public static C4132l m1985m(int i10, int i11, String number, String primaryNum, String region) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(primaryNum, "primaryNum");
        AbstractC4154l.m8923f(region, "region");
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16170c(number)) {
            return new C4132l(true, null);
        }
        if (number.equals(primaryNum) && i10 == i11) {
            return new C4132l(false, Integer.valueOf(R.string.static_field_required_alternate_num_same_0));
        }
        boolean zM16224c = AbstractC8804s.m16224c(i10, number, region);
        return new C4132l(zM16224c, zM16224c ? null : Integer.valueOf(R.string.enter_valid_number));
    }

    @Override // qi.InterfaceC6223f
    /* renamed from: b */
    public List mo1987b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C6219b c6219b : componentRegistrar.getComponents()) {
            String str = c6219b.f30213a;
            if (str != null) {
                c6219b = new C6219b(str, c6219b.f30214b, c6219b.f30215c, c6219b.f30216d, c6219b.f30217e, new C0004c(14, str, c6219b), c6219b.f30219g);
            }
            arrayList.add(c6219b);
        }
        return arrayList;
    }

    @Override // ny.InterfaceC5188b
    /* renamed from: c */
    public Throwable mo394c(Exception exc) {
        return exc instanceof ConnectionException ? (ConnectionException) exc : new ConnectionException(exc);
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        switch (this.f4324a) {
            case 9:
                j0 input = (j0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input, "input");
                C7117b c7117b = new C7117b();
                c7117b.m13402b(e0.POST);
                C2897i c2897iM14325e = a1.m14325e(c7117b.f34311b.f361d, "/");
                C2274l c2274l = C2274l.f10291i;
                C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("PreviousPassword")}), 0);
                C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ProposedPassword")}), 0);
                ArrayList arrayList = new ArrayList();
                c2271i.f10279b = a1.m14322b(arrayList);
                arrayList.add(c2271i);
                c2271i2.f10279b = arrayList.size();
                arrayList.add(c2271i2);
                c2271i3.f10279b = arrayList.size();
                arrayList.add(c2271i3);
                C2893e c2893e = c2897iM14325e.f15931a;
                c2893e.getClass();
                EnumC2908t enumC2908t = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e.m7010d("{");
                if (c2893e.f15922a) {
                    ((StringBuilder) c2893e.f15924c).append('\n');
                }
                c2893e.f15923b++;
                ArrayList arrayList2 = (ArrayList) c2893e.f15925d;
                AbstractC4154l.m8923f(arrayList2, "<this>");
                arrayList2.add(enumC2908t);
                String str = input.f9341a;
                if (str != null) {
                    c2897iM14325e.mo2596d(c2271i, str);
                }
                String str2 = input.f9342b;
                if (str2 != null) {
                    c2897iM14325e.mo2596d(c2271i2, str2);
                }
                String str3 = input.f9343c;
                if (str3 != null) {
                    c2897iM14325e.mo2596d(c2271i3, str3);
                }
                c2897iM14325e.mo2598f();
                byte[] bArrM7012f = c2893e.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b.f34313d = C3742r.m8277a(bArrM7012f);
                c7117b.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b;
            case 10:
                b1 input2 = (b1) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input2, "input");
                C7117b c7117b2 = new C7117b();
                c7117b2.m13402b(e0.POST);
                C2897i c2897iM14325e2 = a1.m14325e(c7117b2.f34311b.f361d, "/");
                C2274l c2274l2 = C2274l.f10291i;
                C2271i c2271i4 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i5 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("CredentialId")}), 0);
                ArrayList arrayList3 = new ArrayList();
                c2271i4.f10279b = a1.m14322b(arrayList3);
                arrayList3.add(c2271i4);
                c2271i5.f10279b = arrayList3.size();
                arrayList3.add(c2271i5);
                C2893e c2893e2 = c2897iM14325e2.f15931a;
                c2893e2.getClass();
                EnumC2908t enumC2908t2 = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e2.m7010d("{");
                if (c2893e2.f15922a) {
                    ((StringBuilder) c2893e2.f15924c).append('\n');
                }
                c2893e2.f15923b++;
                ArrayList arrayList4 = (ArrayList) c2893e2.f15925d;
                AbstractC4154l.m8923f(arrayList4, "<this>");
                arrayList4.add(enumC2908t2);
                String str4 = input2.f9275a;
                if (str4 != null) {
                    c2897iM14325e2.mo2596d(c2271i4, str4);
                }
                String str5 = input2.f9276b;
                if (str5 != null) {
                    c2897iM14325e2.mo2596d(c2271i5, str5);
                }
                c2897iM14325e2.mo2598f();
                byte[] bArrM7012f2 = c2893e2.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b2.f34313d = C3742r.m8277a(bArrM7012f2);
                c7117b2.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b2;
            case 11:
                d2 input3 = (d2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input3, "input");
                Map map = input3.f9293e;
                Map map2 = input3.f9291c;
                C7117b c7117b3 = new C7117b();
                c7117b3.m13402b(e0.POST);
                C2897i c2897iM14325e3 = a1.m14325e(c7117b3.f34311b.f361d, "/");
                C2274l c2274l3 = C2274l.f10292j;
                C2271i c2271i6 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AnalyticsMetadata")}), 0);
                C2271i c2271i7 = new C2271i(C2274l.f10286d, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AuthFlow")}), 0);
                C2274l c2274l4 = C2274l.f10290h;
                C2271i c2271i8 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AuthParameters")}), 0);
                C2274l c2274l5 = C2274l.f10291i;
                C2271i c2271i9 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientId")}), 0);
                C2271i c2271i10 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientMetadata")}), 0);
                C2271i c2271i11 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Session")}), 0);
                C2271i c2271i12 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserContextData")}), 0);
                ArrayList arrayList5 = new ArrayList();
                c2271i6.f10279b = a1.m14322b(arrayList5);
                arrayList5.add(c2271i6);
                c2271i7.f10279b = arrayList5.size();
                arrayList5.add(c2271i7);
                c2271i8.f10279b = arrayList5.size();
                arrayList5.add(c2271i8);
                c2271i9.f10279b = arrayList5.size();
                arrayList5.add(c2271i9);
                c2271i10.f10279b = arrayList5.size();
                arrayList5.add(c2271i10);
                c2271i11.f10279b = arrayList5.size();
                arrayList5.add(c2271i11);
                c2271i12.f10279b = arrayList5.size();
                arrayList5.add(c2271i12);
                C2893e c2893e3 = c2897iM14325e3.f15931a;
                c2893e3.getClass();
                EnumC2908t enumC2908t3 = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e3.m7010d("{");
                if (c2893e3.f15922a) {
                    ((StringBuilder) c2893e3.f15924c).append('\n');
                }
                c2893e3.f15923b++;
                ArrayList arrayList6 = (ArrayList) c2893e3.f15925d;
                AbstractC4154l.m8923f(arrayList6, "<this>");
                arrayList6.add(enumC2908t3);
                C1978b c1978b = input3.f9289a;
                if (c1978b != null) {
                    ff.m10654b(c2897iM14325e3, c2271i6, c1978b, C2237k.f10223a);
                }
                AbstractC1991o abstractC1991o = input3.f9290b;
                if (abstractC1991o != null) {
                    c2897iM14325e3.mo2596d(c2271i7, abstractC1991o.mo5721a());
                }
                if (map2 != null) {
                    c2893e3.m7014h(AbstractC5933n.m11794b(c2271i8));
                    c2897iM14325e3.m7019i(c2271i8);
                    for (Map.Entry entry : map2.entrySet()) {
                        c2897iM14325e3.mo5960h((String) entry.getKey(), (String) entry.getValue());
                    }
                    c2897iM14325e3.m7021k();
                }
                String str6 = input3.f9292d;
                if (str6 != null) {
                    c2897iM14325e3.mo2596d(c2271i9, str6);
                }
                if (map != null) {
                    c2893e3.m7014h(AbstractC5933n.m11794b(c2271i10));
                    c2897iM14325e3.m7019i(c2271i10);
                    for (Map.Entry entry2 : map.entrySet()) {
                        c2897iM14325e3.mo5960h((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    c2897iM14325e3.m7021k();
                }
                String str7 = input3.f9294f;
                if (str7 != null) {
                    c2897iM14325e3.mo2596d(c2271i11, str7);
                }
                l3 l3Var = input3.f9295g;
                if (l3Var != null) {
                    ff.m10654b(c2897iM14325e3, c2271i12, l3Var, C2238l.f10224a);
                }
                c2897iM14325e3.mo2598f();
                byte[] bArrM7012f3 = c2893e3.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b3.f34313d = C3742r.m8277a(bArrM7012f3);
                c7117b3.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b3;
            case 12:
                v2 input4 = (v2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input4, "input");
                C7117b c7117b4 = new C7117b();
                c7117b4.m13402b(e0.POST);
                C2897i c2897iM14325e4 = a1.m14325e(c7117b4.f34311b.f361d, "/");
                C2271i c2271i13 = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2274l c2274l6 = C2274l.f10292j;
                C2271i c2271i14 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("EmailMfaSettings")}), 0);
                C2271i c2271i15 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SMSMfaSettings")}), 0);
                C2271i c2271i16 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SoftwareTokenMfaSettings")}), 0);
                ArrayList arrayList7 = new ArrayList();
                c2271i13.f10279b = a1.m14322b(arrayList7);
                arrayList7.add(c2271i13);
                c2271i14.f10279b = arrayList7.size();
                arrayList7.add(c2271i14);
                c2271i15.f10279b = arrayList7.size();
                arrayList7.add(c2271i15);
                c2271i16.f10279b = arrayList7.size();
                arrayList7.add(c2271i16);
                C2893e c2893e4 = c2897iM14325e4.f15931a;
                c2893e4.getClass();
                EnumC2908t enumC2908t4 = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e4.m7010d("{");
                if (c2893e4.f15922a) {
                    ((StringBuilder) c2893e4.f15924c).append('\n');
                }
                c2893e4.f15923b++;
                ArrayList arrayList8 = (ArrayList) c2893e4.f15925d;
                AbstractC4154l.m8923f(arrayList8, "<this>");
                arrayList8.add(enumC2908t4);
                String str8 = input4.f9492a;
                if (str8 != null) {
                    c2897iM14325e4.mo2596d(c2271i13, str8);
                }
                o1 o1Var = input4.f9493b;
                if (o1Var != null) {
                    ff.m10654b(c2897iM14325e4, c2271i14, o1Var, C2243q.f10229a);
                }
                a3 a3Var = input4.f9494c;
                if (a3Var != null) {
                    ff.m10654b(c2897iM14325e4, c2271i15, a3Var, C2244r.f10230a);
                }
                c3 c3Var = input4.f9495d;
                if (c3Var != null) {
                    ff.m10654b(c2897iM14325e4, c2271i16, c3Var, C2245s.f10231a);
                }
                c2897iM14325e4.mo2598f();
                byte[] bArrM7012f4 = c2893e4.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b4.f34313d = C3742r.m8277a(bArrM7012f4);
                c7117b4.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b4;
            case 13:
                t3 input5 = (t3) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input5, "input");
                C7117b c7117b5 = new C7117b();
                c7117b5.m13402b(e0.POST);
                C2897i c2897iM14325e5 = a1.m14325e(c7117b5.f34311b.f361d, "/");
                C2274l c2274l7 = C2274l.f10291i;
                C2271i c2271i17 = new C2271i(c2274l7, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i18 = new C2271i(c2274l7, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AttributeName")}), 0);
                C2271i c2271i19 = new C2271i(c2274l7, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Code")}), 0);
                ArrayList arrayList9 = new ArrayList();
                c2271i17.f10279b = a1.m14322b(arrayList9);
                arrayList9.add(c2271i17);
                c2271i18.f10279b = arrayList9.size();
                arrayList9.add(c2271i18);
                c2271i19.f10279b = arrayList9.size();
                arrayList9.add(c2271i19);
                C2893e c2893e5 = c2897iM14325e5.f15931a;
                c2893e5.getClass();
                EnumC2908t enumC2908t5 = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e5.m7010d("{");
                if (c2893e5.f15922a) {
                    ((StringBuilder) c2893e5.f15924c).append('\n');
                }
                c2893e5.f15923b++;
                ArrayList arrayList10 = (ArrayList) c2893e5.f15925d;
                AbstractC4154l.m8923f(arrayList10, "<this>");
                arrayList10.add(enumC2908t5);
                String str9 = input5.f9475a;
                if (str9 != null) {
                    c2897iM14325e5.mo2596d(c2271i17, str9);
                }
                String str10 = input5.f9476b;
                if (str10 != null) {
                    c2897iM14325e5.mo2596d(c2271i18, str10);
                }
                String str11 = input5.f9477c;
                if (str11 != null) {
                    c2897iM14325e5.mo2596d(c2271i19, str11);
                }
                c2897iM14325e5.mo2598f();
                byte[] bArrM7012f5 = c2893e5.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b5.f34313d = C3742r.m8277a(bArrM7012f5);
                c7117b5.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b5;
            case 24:
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f((b0) obj, "input");
                C7117b c7117b6 = new C7117b();
                c7117b6.m13402b(e0.GET);
                C0104k c0104k = c7117b6.f34311b;
                c0104k.f361d.f6251b = true;
                c0104k.f362e.f351c.mo266g("", "session");
                return c7117b6;
            default:
                n3 input6 = (n3) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input6, "input");
                C7117b c7117b7 = new C7117b();
                c7117b7.m13402b(e0.PUT);
                String str12 = input6.f23364c;
                if (str12 == null) {
                    throw new IllegalArgumentException("key is bound to the URI and must not be null");
                }
                C0104k c0104k2 = c7117b7.f34311b;
                j4 j4Var = c0104k2.f361d;
                C0100g c0100g = c0104k2.f362e;
                C2259g encodedSegments = (C2259g) j4Var.f6253d;
                AbstractC4154l.m8923f(encodedSegments, "$this$encodedSegments");
                Iterator it = AbstractC5178p.m10112W(str12, new String[]{"/"}, 6).iterator();
                while (it.hasNext()) {
                    encodedSegments.add(C6813g.f32363m.m12988d((String) it.next()));
                }
                c0100g.f351c.mo266g("UploadPart", "x-id");
                c0100g.m267h(C6813g.f32363m, new C4833a(15, input6));
                C2888k c2888k = input6.f23362a;
                if (c2888k != null) {
                    c7117b7.f34313d = f8.m11623d(c2888k);
                }
                if (!(c7117b7.f34313d instanceof C3743s)) {
                    c7117b7.f34312c.m320H("application/octet-stream");
                }
                return c7117b7;
        }
    }

    @Override // ud.InterfaceC7403g
    /* renamed from: e */
    public Object mo1988e(InterfaceC2139c interfaceC2139c) {
        C1683a c1683a = new C1683a();
        interfaceC2139c.invoke(c1683a);
        return new C1687e(new C1684b(c1683a));
    }

    @Override // e0.InterfaceC1893b
    /* renamed from: f */
    public boolean mo1989f(g2 g2Var) {
        return false;
    }

    @Override // dg.InterfaceC1715d
    /* renamed from: g */
    public C1714c mo398g(Context context, String str, InterfaceC1713b interfaceC1713b) {
        C1714c c1714c = new C1714c();
        int iMo5402g = interfaceC1713b.mo5402g(context, str);
        c1714c.f8340a = iMo5402g;
        if (iMo5402g != 0) {
            c1714c.f8342c = -1;
            return c1714c;
        }
        int iMo5401a = interfaceC1713b.mo5401a(context, str, true);
        c1714c.f8341b = iMo5401a;
        if (iMo5401a != 0) {
            c1714c.f8342c = 1;
        }
        return c1714c;
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(x0 x0Var) {
        return new C2626b((C2628d) x0Var.mo12234a(C2628d.class), (C0176d) x0Var.mo12234a(C0176d.class), (C0178f) x0Var.mo12234a(C0178f.class));
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        return new Boolean(((Boolean) k7.f6271a.m3530b()).booleanValue());
    }

    @Override // o6.InterfaceC5301c
    /* renamed from: a */
    public Object mo1986a(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }
}
