package ph;

import ad.C0100g;
import ad.C0104k;
import ad.C0108o;
import ad.C0109p;
import android.os.SystemClock;
import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import b00.C0529n;
import bc.C0642a;
import bc.InterfaceC0643b;
import bd.C0645a;
import c00.AbstractC0835b;
import cd.C0946a;
import cd.C0947b;
import cd.C0951f;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.z7;
import dg.C1720i;
import eb.C1978b;
import eb.f3;
import eb.l3;
import eb.n2;
import eb.t0;
import eb.v1;
import ec.C2003a;
import ec.C2005c;
import ec.InterfaceC2004b;
import ej.C2056a;
import ej.C2057b;
import ej.InterfaceC2059d;
import ex.InterfaceC2139c;
import f00.InterfaceC2172a;
import f00.InterfaceC2173b;
import fb.C2230d;
import fb.C2231e;
import fb.C2239m;
import fb.C2240n;
import fc.C2259g;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2265c;
import fj.InterfaceC2294a;
import g7.InterfaceC2537b;
import gf.InterfaceC2585a;
import hd.C2893e;
import hd.C2896h;
import hd.C2897i;
import hd.EnumC2908t;
import i0.m0;
import ii.InterfaceC3270l;
import j0.AbstractC3504d;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import jc.AbstractC3745u;
import jc.C3742r;
import jc.e0;
import kotlin.jvm.internal.AbstractC4154l;
import m9.C4681a;
import ma.C4684c;
import mb.C4685a;
import mb.o0;
import mq.C4833a;
import n9.AbstractC4978b;
import nx.AbstractC5163a;
import nx.AbstractC5178p;
import og.ff;
import og.ud;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.C5713b;
import p020v.a1;
import pg.AbstractC5933n;
import rw.AbstractC6662l;
import s9.C6772a;
import sc.InterfaceC6794n;
import sd.C6813g;
import t9.AbstractC7082b;
import tc.C7117b;
import ud.InterfaceC7403g;
import ug.C7451v;
import ug.InterfaceC7450u;
import uw.InterfaceC7559c;
import uw.InterfaceC7563g;
import yb.AbstractC8610b;
import yg.InterfaceC8647d;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.e */
/* loaded from: classes.dex */
public class C5950e implements InterfaceC8647d, InterfaceC7403g, InterfaceC2537b, InterfaceC2059d, InterfaceC6794n, InterfaceC2294a, InterfaceC2585a, InterfaceC3270l, InterfaceC7563g, InterfaceC0643b, InterfaceC2172a, InterfaceC7450u {

    /* renamed from: b */
    public static final /* synthetic */ C5950e f29133b = new C5950e(29);

    /* renamed from: a */
    public final /* synthetic */ int f29134a;

    public /* synthetic */ C5950e(int i10) {
        this.f29134a = i10;
    }

    /* renamed from: g */
    public static C0529n m11976g(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (AbstractC0835b.m2248a(str.charAt(i11 + 1)) + (AbstractC0835b.m2248a(str.charAt(i11)) << 4));
        }
        return new C0529n(bArr);
    }

    /* renamed from: h */
    public static C0529n m11977h(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC5163a.f25245a);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        C0529n c0529n = new C0529n(bytes);
        c0529n.f3650c = str;
        return c0529n;
    }

    /* renamed from: i */
    public static int m11978i(EnumC8992b status) {
        AbstractC4154l.m8923f(status, "status");
        return status.getValue();
    }

    /* renamed from: j */
    public static EnumC8992b m11979j(Integer num) {
        int iIntValue = num.intValue();
        for (EnumC8992b enumC8992b : EnumC8992b.values()) {
            if (enumC8992b.getValue() == iIntValue) {
                return enumC8992b;
            }
        }
        return null;
    }

    @Override // ii.InterfaceC3270l
    /* renamed from: a */
    public Object mo7623a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // fj.InterfaceC2294a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StackTraceElement[] mo2559b(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C5950e.mo2559b(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // f00.InterfaceC2172a
    /* renamed from: c */
    public InterfaceC2173b mo5823c(String str) {
        return C5713b.f28187a;
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        switch (this.f29134a) {
            case 9:
                t0 input = (t0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input, "input");
                Map map = input.f9460c;
                C7117b c7117b = new C7117b();
                c7117b.m13402b(e0.POST);
                C2897i c2897iM14325e = a1.m14325e(c7117b.f34311b.f361d, "/");
                C2274l c2274l = C2274l.f10292j;
                C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AnalyticsMetadata")}), 0);
                C2274l c2274l2 = C2274l.f10291i;
                C2271i c2271i2 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientId")}), 0);
                C2271i c2271i3 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientMetadata")}), 0);
                C2271i c2271i4 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ConfirmationCode")}), 0);
                C2271i c2271i5 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Password")}), 0);
                C2271i c2271i6 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SecretHash")}), 0);
                C2271i c2271i7 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserContextData")}), 0);
                C2271i c2271i8 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Username")}), 0);
                ArrayList arrayList = new ArrayList();
                c2271i.f10279b = a1.m14322b(arrayList);
                arrayList.add(c2271i);
                c2271i2.f10279b = arrayList.size();
                arrayList.add(c2271i2);
                c2271i3.f10279b = arrayList.size();
                arrayList.add(c2271i3);
                c2271i4.f10279b = arrayList.size();
                arrayList.add(c2271i4);
                c2271i5.f10279b = arrayList.size();
                arrayList.add(c2271i5);
                c2271i6.f10279b = arrayList.size();
                arrayList.add(c2271i6);
                c2271i7.f10279b = arrayList.size();
                arrayList.add(c2271i7);
                c2271i8.f10279b = arrayList.size();
                arrayList.add(c2271i8);
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
                C1978b c1978b = input.f9458a;
                if (c1978b != null) {
                    ff.m10654b(c2897iM14325e, c2271i, c1978b, C2230d.f10217a);
                }
                String str = input.f9459b;
                if (str != null) {
                    c2897iM14325e.mo2596d(c2271i2, str);
                }
                if (map != null) {
                    c2893e.m7014h(AbstractC5933n.m11794b(c2271i3));
                    c2897iM14325e.m7019i(c2271i3);
                    for (Map.Entry entry : map.entrySet()) {
                        c2897iM14325e.mo5960h((String) entry.getKey(), (String) entry.getValue());
                    }
                    c2897iM14325e.m7021k();
                }
                String str2 = input.f9461d;
                if (str2 != null) {
                    c2897iM14325e.mo2596d(c2271i4, str2);
                }
                String str3 = input.f9462e;
                if (str3 != null) {
                    c2897iM14325e.mo2596d(c2271i5, str3);
                }
                String str4 = input.f9463f;
                if (str4 != null) {
                    c2897iM14325e.mo2596d(c2271i6, str4);
                }
                l3 l3Var = input.f9464g;
                if (l3Var != null) {
                    ff.m10654b(c2897iM14325e, c2271i7, l3Var, C2231e.f10218a);
                }
                String str5 = input.f9465h;
                if (str5 != null) {
                    c2897iM14325e.mo2596d(c2271i8, str5);
                }
                c2897iM14325e.mo2598f();
                byte[] bArrM7012f = c2893e.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b.f34313d = C3742r.m8277a(bArrM7012f);
                c7117b.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b;
            case 10:
                v1 input2 = (v1) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input2, "input");
                Map map2 = input2.f9491c;
                C7117b c7117b2 = new C7117b();
                c7117b2.m13402b(e0.POST);
                C2897i c2897iM14325e2 = a1.m14325e(c7117b2.f34311b.f361d, "/");
                C2274l c2274l3 = C2274l.f10291i;
                C2271i c2271i9 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i10 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AttributeName")}), 0);
                C2271i c2271i11 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientMetadata")}), 0);
                ArrayList arrayList3 = new ArrayList();
                c2271i9.f10279b = a1.m14322b(arrayList3);
                arrayList3.add(c2271i9);
                c2271i10.f10279b = arrayList3.size();
                arrayList3.add(c2271i10);
                c2271i11.f10279b = arrayList3.size();
                arrayList3.add(c2271i11);
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
                String str6 = input2.f9489a;
                if (str6 != null) {
                    c2897iM14325e2.mo2596d(c2271i9, str6);
                }
                String str7 = input2.f9490b;
                if (str7 != null) {
                    c2897iM14325e2.mo2596d(c2271i10, str7);
                }
                if (map2 != null) {
                    c2893e2.m7014h(AbstractC5933n.m11794b(c2271i11));
                    c2897iM14325e2.m7019i(c2271i11);
                    for (Map.Entry entry2 : map2.entrySet()) {
                        c2897iM14325e2.mo5960h((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    c2897iM14325e2.m7021k();
                }
                c2897iM14325e2.mo2598f();
                byte[] bArrM7012f2 = c2893e2.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b2.f34313d = C3742r.m8277a(bArrM7012f2);
                c7117b2.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b2;
            case 11:
                n2 input3 = (n2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input3, "input");
                Map map3 = input3.f9382c;
                C7117b c7117b3 = new C7117b();
                c7117b3.m13402b(e0.POST);
                C2897i c2897iM14325e3 = a1.m14325e(c7117b3.f34311b.f361d, "/");
                C2274l c2274l4 = C2274l.f10292j;
                C2271i c2271i12 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AnalyticsMetadata")}), 0);
                C2274l c2274l5 = C2274l.f10291i;
                C2271i c2271i13 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientId")}), 0);
                C2271i c2271i14 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientMetadata")}), 0);
                C2271i c2271i15 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SecretHash")}), 0);
                C2271i c2271i16 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserContextData")}), 0);
                C2271i c2271i17 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Username")}), 0);
                ArrayList arrayList5 = new ArrayList();
                c2271i12.f10279b = a1.m14322b(arrayList5);
                arrayList5.add(c2271i12);
                c2271i13.f10279b = arrayList5.size();
                arrayList5.add(c2271i13);
                c2271i14.f10279b = arrayList5.size();
                arrayList5.add(c2271i14);
                c2271i15.f10279b = arrayList5.size();
                arrayList5.add(c2271i15);
                c2271i16.f10279b = arrayList5.size();
                arrayList5.add(c2271i16);
                c2271i17.f10279b = arrayList5.size();
                arrayList5.add(c2271i17);
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
                C1978b c1978b2 = input3.f9380a;
                if (c1978b2 != null) {
                    ff.m10654b(c2897iM14325e3, c2271i12, c1978b2, C2239m.f10225a);
                }
                String str8 = input3.f9381b;
                if (str8 != null) {
                    c2897iM14325e3.mo2596d(c2271i13, str8);
                }
                if (map3 != null) {
                    c2893e3.m7014h(AbstractC5933n.m11794b(c2271i14));
                    c2897iM14325e3.m7019i(c2271i14);
                    for (Map.Entry entry3 : map3.entrySet()) {
                        c2897iM14325e3.mo5960h((String) entry3.getKey(), (String) entry3.getValue());
                    }
                    c2897iM14325e3.m7021k();
                }
                String str9 = input3.f9383d;
                if (str9 != null) {
                    c2897iM14325e3.mo2596d(c2271i15, str9);
                }
                l3 l3Var2 = input3.f9384e;
                if (l3Var2 != null) {
                    ff.m10654b(c2897iM14325e3, c2271i16, l3Var2, C2240n.f10226a);
                }
                String str10 = input3.f9385f;
                if (str10 != null) {
                    c2897iM14325e3.mo2596d(c2271i17, str10);
                }
                c2897iM14325e3.mo2598f();
                byte[] bArrM7012f3 = c2893e3.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b3.f34313d = C3742r.m8277a(bArrM7012f3);
                c7117b3.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b3;
            case 12:
                f3 input4 = (f3) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input4, "input");
                C7117b c7117b4 = new C7117b();
                c7117b4.m13402b(e0.POST);
                C2897i c2897iM14325e4 = a1.m14325e(c7117b4.f34311b.f361d, "/");
                C2274l c2274l6 = C2274l.f10291i;
                C2271i c2271i18 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i19 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("DeviceKey")}), 0);
                C2271i c2271i20 = new C2271i(C2274l.f10286d, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("DeviceRememberedStatus")}), 0);
                ArrayList arrayList7 = new ArrayList();
                c2271i18.f10279b = a1.m14322b(arrayList7);
                arrayList7.add(c2271i18);
                c2271i19.f10279b = arrayList7.size();
                arrayList7.add(c2271i19);
                c2271i20.f10279b = arrayList7.size();
                arrayList7.add(c2271i20);
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
                String str11 = input4.f9313a;
                if (str11 != null) {
                    c2897iM14325e4.mo2596d(c2271i18, str11);
                }
                String str12 = input4.f9314b;
                if (str12 != null) {
                    c2897iM14325e4.mo2596d(c2271i19, str12);
                }
                if (input4.f9315c != null) {
                    c2897iM14325e4.mo2596d(c2271i20, "remembered");
                }
                c2897iM14325e4.mo2598f();
                byte[] bArrM7012f4 = c2893e4.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b4.f34313d = C3742r.m8277a(bArrM7012f4);
                c7117b4.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b4;
            case 23:
                C4685a input5 = (C4685a) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input5, "input");
                C7117b c7117b5 = new C7117b();
                c7117b5.m13402b(e0.DELETE);
                String str13 = input5.f23158b;
                if (str13 == null) {
                    throw new IllegalArgumentException("key is bound to the URI and must not be null");
                }
                C0104k c0104k = c7117b5.f34311b;
                j4 j4Var = c0104k.f361d;
                C0100g c0100g = c0104k.f362e;
                C2259g encodedSegments = (C2259g) j4Var.f6253d;
                AbstractC4154l.m8923f(encodedSegments, "$this$encodedSegments");
                Iterator it = AbstractC5178p.m10112W(str13, new String[]{"/"}, 6).iterator();
                while (it.hasNext()) {
                    encodedSegments.add(C6813g.f32363m.m12988d((String) it.next()));
                }
                c0100g.f351c.mo266g("AbortMultipartUpload", "x-id");
                c0100g.m267h(C6813g.f32363m, new C4833a(9, input5));
                return c7117b5;
            default:
                o0 input6 = (o0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input6, "input");
                C7117b c7117b6 = new C7117b();
                c7117b6.m13402b(e0.HEAD);
                String str14 = input6.f23369b;
                if (str14 == null) {
                    throw new IllegalArgumentException("key is bound to the URI and must not be null");
                }
                C0104k c0104k2 = c7117b6.f34311b;
                C2259g encodedSegments2 = (C2259g) c0104k2.f361d.f6253d;
                AbstractC4154l.m8923f(encodedSegments2, "$this$encodedSegments");
                Iterator it2 = AbstractC5178p.m10112W(str14, new String[]{"/"}, 6).iterator();
                while (it2.hasNext()) {
                    encodedSegments2.add(C6813g.f32363m.m12988d((String) it2.next()));
                }
                c0104k2.f362e.m267h(C6813g.f32363m, new C4833a(13, input6));
                return c7117b6;
        }
    }

    @Override // ud.InterfaceC7403g
    /* renamed from: e */
    public Object mo1988e(InterfaceC2139c interfaceC2139c) {
        C0946a c0946a = new C0946a();
        interfaceC2139c.invoke(c0946a);
        return new C0951f(new C0947b(c0946a));
    }

    @Override // ej.InterfaceC2059d
    /* renamed from: f */
    public C2057b mo5782f(C7451v c7451v, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C1720i c1720i = jSONObject.has("session") ? new C1720i(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 1) : new C1720i(new JSONObject().optInt("max_custom_exception_events", 8), 1);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new C2057b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), c1720i, new C2056a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // gf.InterfaceC2585a
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // bc.InterfaceC0643b
    public Object resolveEndpoint(Object obj, InterfaceC7559c interfaceC7559c) {
        C4684c c4684cM8064i;
        C0642a c0642a;
        C4684c c4684cM8064i2;
        C0642a c0642a2;
        switch (this.f29134a) {
            case 20:
                C4681a c4681a = (C4681a) obj;
                String str = c4681a.f23138a;
                Boolean bool = c4681a.f23140c;
                Boolean bool2 = c4681a.f23141d;
                String str2 = c4681a.f23139b;
                C0108o c0108o = C0109p.f374i;
                if (str != null) {
                    Boolean bool3 = Boolean.TRUE;
                    if (AbstractC4154l.m8918a(bool2, bool3)) {
                        throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
                    }
                    if (AbstractC4154l.m8918a(bool, bool3)) {
                        throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
                    }
                    C0109p c0109pM297a = C0108o.m297a(c0108o, str);
                    C2005c c2005cM10980f = ud.m10980f();
                    C2003a c2003a = AbstractC8610b.f41875c;
                    AbstractC4154l.m8923f(c2003a, "<this>");
                    c2005cM10980f.mo1862b(c2003a, bool3);
                    return new C0642a(c0109pM297a, (InterfaceC2004b) c2005cM10980f);
                }
                if (str2 == null || (c4684cM8064i = AbstractC3504d.m8064i(str2, AbstractC4978b.f24706a)) == null) {
                    throw new EndpointProviderException("Invalid Configuration: Missing Region");
                }
                String str3 = c4684cM8064i.f23152b;
                String str4 = c4684cM8064i.f23153c;
                Boolean bool4 = c4684cM8064i.f23155e;
                Boolean bool5 = c4684cM8064i.f23154d;
                Boolean bool6 = Boolean.TRUE;
                if (AbstractC4154l.m8918a(bool2, bool6) && AbstractC4154l.m8918a(bool, bool6)) {
                    if (!bool6.equals(bool5) || !bool6.equals(bool4)) {
                        throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
                    }
                    c0642a = new C0642a(m0.m7371d("https://portal.sso-fips.", str2, '.', str4, c0108o));
                } else if (AbstractC4154l.m8918a(bool2, bool6)) {
                    if (!AbstractC4154l.m8918a(bool5, bool6)) {
                        throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                    }
                    if (AbstractC4154l.m8918a(c4684cM8064i.f23151a, "aws-us-gov")) {
                        c0642a = new C0642a(C0108o.m297a(c0108o, "https://portal.sso." + str2 + ".amazonaws.com"));
                    } else {
                        c0642a = new C0642a(m0.m7371d("https://portal.sso-fips.", str2, '.', str3, c0108o));
                    }
                } else if (!AbstractC4154l.m8918a(bool, bool6)) {
                    c0642a = new C0642a(m0.m7371d("https://portal.sso.", str2, '.', str3, c0108o));
                } else {
                    if (!bool6.equals(bool4)) {
                        throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                    }
                    c0642a = new C0642a(m0.m7371d("https://portal.sso.", str2, '.', str4, c0108o));
                }
                return c0642a;
            default:
                C6772a c6772a = (C6772a) obj;
                String str5 = c6772a.f32226a;
                Boolean bool7 = c6772a.f32228c;
                Boolean bool8 = c6772a.f32229d;
                String str6 = c6772a.f32227b;
                C0108o c0108o2 = C0109p.f374i;
                if (str5 != null) {
                    Boolean bool9 = Boolean.TRUE;
                    if (AbstractC4154l.m8918a(bool8, bool9)) {
                        throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
                    }
                    if (AbstractC4154l.m8918a(bool7, bool9)) {
                        throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
                    }
                    C0109p c0109pM297a2 = C0108o.m297a(c0108o2, str5);
                    C2005c c2005cM10980f2 = ud.m10980f();
                    C2003a c2003a2 = AbstractC8610b.f41875c;
                    AbstractC4154l.m8923f(c2003a2, "<this>");
                    c2005cM10980f2.mo1862b(c2003a2, bool9);
                    return new C0642a(c0109pM297a2, (InterfaceC2004b) c2005cM10980f2);
                }
                if (str6 == null || (c4684cM8064i2 = AbstractC3504d.m8064i(str6, AbstractC7082b.f34185a)) == null) {
                    throw new EndpointProviderException("Invalid Configuration: Missing Region");
                }
                String str7 = c4684cM8064i2.f23152b;
                String str8 = c4684cM8064i2.f23153c;
                Boolean bool10 = c4684cM8064i2.f23155e;
                Boolean bool11 = c4684cM8064i2.f23154d;
                Boolean bool12 = Boolean.TRUE;
                if (AbstractC4154l.m8918a(bool8, bool12) && AbstractC4154l.m8918a(bool7, bool12)) {
                    if (!bool12.equals(bool11) || !bool12.equals(bool10)) {
                        throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
                    }
                    c0642a2 = new C0642a(m0.m7371d("https://oidc-fips.", str6, '.', str8, c0108o2));
                } else if (AbstractC4154l.m8918a(bool8, bool12)) {
                    if (!AbstractC4154l.m8918a(bool11, bool12)) {
                        throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                    }
                    if (AbstractC4154l.m8918a(c4684cM8064i2.f23151a, "aws-us-gov")) {
                        c0642a2 = new C0642a(C0108o.m297a(c0108o2, "https://oidc." + str6 + ".amazonaws.com"));
                    } else {
                        c0642a2 = new C0642a(m0.m7371d("https://oidc-fips.", str6, '.', str7, c0108o2));
                    }
                } else if (!AbstractC4154l.m8918a(bool7, bool12)) {
                    c0642a2 = new C0642a(m0.m7371d("https://oidc.", str6, '.', str7, c0108o2));
                } else {
                    if (!bool12.equals(bool10)) {
                        throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                    }
                    c0642a2 = new C0642a(m0.m7371d("https://oidc.", str6, '.', str8, c0108o2));
                }
                return c0642a2;
        }
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        return new Boolean(((Boolean) z7.f6473a.m3530b()).booleanValue());
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
    }
}
