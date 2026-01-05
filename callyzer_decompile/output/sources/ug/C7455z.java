package ug;

import ad.C0108o;
import ad.C0109p;
import android.text.TextUtils;
import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import bc.AbstractC0644c;
import bc.C0642a;
import bc.InterfaceC0643b;
import bd.C0645a;
import bl.C0689a;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.w7;
import com.google.i18n.phonenumbers.C1404a;
import com.websoptimization.callyzerbiz.R;
import ec.C2003a;
import ec.C2005c;
import ec.InterfaceC2004b;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2265c;
import hd.C2893e;
import hd.C2896h;
import hd.C2897i;
import hd.EnumC2908t;
import j0.AbstractC3504d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import jc.AbstractC3745u;
import jc.C3742r;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import ma.C4684c;
import ng.AbstractC5068s;
import ng.C5064o;
import ng.C5067r;
import nx.AbstractC5178p;
import og.pe;
import og.ud;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5933n;
import pg.g9;
import qi.InterfaceC6222e;
import rw.AbstractC6662l;
import sc.InterfaceC6794n;
import sk.C6863k;
import tc.C7117b;
import uw.InterfaceC7559c;
import wa.C7965a;
import xa.AbstractC8318b;
import y9.C8601a;
import ya.C8604c;
import yb.AbstractC8610b;
import yk.C8687a;
import yv.AbstractC8804s;
import yv.C8791f;
import z9.AbstractC8906b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.z */
/* loaded from: classes.dex */
public final /* synthetic */ class C7455z implements InterfaceC7450u, InterfaceC0643b, InterfaceC6222e, InterfaceC6794n {

    /* renamed from: b */
    public static final /* synthetic */ C7455z f35960b = new C7455z(0);

    /* renamed from: c */
    public static final /* synthetic */ C7455z f35961c = new C7455z(1);

    /* renamed from: d */
    public static final /* synthetic */ C7455z f35962d = new C7455z(2);

    /* renamed from: e */
    public static final /* synthetic */ C7455z f35963e = new C7455z(3);

    /* renamed from: f */
    public static final /* synthetic */ C7455z f35964f = new C7455z(4);

    /* renamed from: g */
    public static final /* synthetic */ C7455z f35965g = new C7455z(5);

    /* renamed from: h */
    public static final /* synthetic */ C7455z f35966h = new C7455z(6);

    /* renamed from: j */
    public static final /* synthetic */ C7455z f35967j = new C7455z(7);

    /* renamed from: k */
    public static final /* synthetic */ C7455z f35968k = new C7455z(8);

    /* renamed from: l */
    public static final /* synthetic */ C7455z f35969l = new C7455z(9);

    /* renamed from: m */
    public static final /* synthetic */ C7455z f35970m = new C7455z(10);

    /* renamed from: n */
    public static final /* synthetic */ C7455z f35971n = new C7455z(11);

    /* renamed from: p */
    public static final /* synthetic */ C7455z f35972p = new C7455z(12);

    /* renamed from: q */
    public static final /* synthetic */ C7455z f35973q = new C7455z(13);

    /* renamed from: r */
    public static final /* synthetic */ C7455z f35974r = new C7455z(14);

    /* renamed from: s */
    public static final /* synthetic */ C7455z f35975s = new C7455z(15);

    /* renamed from: t */
    public static final /* synthetic */ C7455z f35976t = new C7455z(16);

    /* renamed from: v */
    public static final /* synthetic */ C7455z f35977v = new C7455z(17);

    /* renamed from: w */
    public static C7455z f35978w;

    /* renamed from: a */
    public final /* synthetic */ int f35979a;

    public /* synthetic */ C7455z(int i10) {
        this.f35979a = i10;
    }

    /* renamed from: a */
    public static C4132l m14216a(String number, int i10, String region, String str, Integer num) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(region, "region");
        Integer numValueOf = Integer.valueOf(R.string.enter_valid_number);
        if (AbstractC5178p.m10101L(number)) {
            return new C4132l(false, Integer.valueOf(R.string.lead_common_msg_field_required));
        }
        if (number.equals(str) && num != null && i10 == num.intValue()) {
            return new C4132l(false, Integer.valueOf(R.string.mobile_number_is_already_connected));
        }
        int length = number.length();
        return (4 > length || length >= 16) ? new C4132l(false, numValueOf) : !AbstractC8804s.m16224c(i10, number, region) ? new C4132l(false, numValueOf) : new C4132l();
    }

    /* renamed from: b */
    public static C4132l m14217b(int i10, String number) {
        Integer numValueOf = Integer.valueOf(R.string.enter_valid_number);
        AbstractC4154l.m8923f(number, "number");
        boolean zM16172e = false;
        if (AbstractC5178p.m10101L(number)) {
            return new C4132l(false, Integer.valueOf(R.string.enter_phone_lead_number));
        }
        C8791f c8791f = C8791f.f42457a;
        if (!C8791f.m16171d(number)) {
            Pattern patternCompile = Pattern.compile("^([1-9]\\d{3,15})$");
            AbstractC4154l.m8922e(patternCompile, "compile(...)");
            if (!patternCompile.matcher(number).matches()) {
                return new C4132l(false, Integer.valueOf(R.string.number_not_start_with_0));
            }
            int length = number.length();
            return (4 > length || length >= 16) ? new C4132l(false, numValueOf) : new C4132l();
        }
        String str = AbstractC8804s.f42473a;
        String strM4511k = C1404a.m4499e().m4511k(i10);
        if (!AbstractC5178p.m10101L(number) && TextUtils.isDigitsOnly(number) && i10 != 0) {
            try {
                String strM4511k2 = C1404a.m4499e().m4511k(i10);
                AbstractC4154l.m8920c(strM4511k2);
                C6863k c6863kM16169b = C8791f.m16169b("+" + i10 + number, strM4511k2);
                if (c6863kM16169b != null) {
                    if (C1404a.m4499e().m4514n(c6863kM16169b)) {
                        AbstractC4154l.m8920c(strM4511k);
                        zM16172e = C8791f.m16172e("+" + i10 + number, strM4511k);
                        if (!zM16172e && i10 == 1) {
                            zM16172e = C8791f.m16172e("+" + i10 + number, "US");
                            if (!zM16172e) {
                                zM16172e = C8791f.m16172e("+" + i10 + number, "CA");
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (zM16172e) {
            numValueOf = null;
        }
        return new C4132l(zM16172e, numValueOf);
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        C8604c input = (C8604c) obj;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(input, "input");
        Map map = input.f41865b;
        C7117b c7117b = new C7117b();
        c7117b.m13402b(jc.e0.POST);
        C2897i c2897iM14325e = p020v.a1.m14325e(c7117b.f34311b.f361d, "/");
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("CustomRoleArn")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("IdentityId")}), 0);
        C2271i c2271i3 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Logins")}), 0);
        ArrayList arrayList = new ArrayList();
        c2271i.f10279b = p020v.a1.m14322b(arrayList);
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
        String str = input.f41864a;
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
        c2897iM14325e.mo2598f();
        byte[] bArrM7012f = c2893e.m7012f();
        AbstractC3745u.Companion.getClass();
        c7117b.f34313d = C3742r.m8277a(bArrM7012f);
        c7117b.f34312c.m320H("application/x-amz-json-1.1");
        return c7117b;
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(p020v.x0 x0Var) {
        switch (this.f35979a) {
            case 22:
                return new C0689a(0);
            default:
                synchronized (AbstractC5068s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    C5064o c5064o = new C5064o();
                    synchronized (AbstractC5068s.class) {
                        try {
                            if (AbstractC5068s.f24861a == null) {
                                AbstractC5068s.f24861a = new C5067r(0);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return new C8687a(0);
                }
                return new C8687a(0);
        }
    }

    @Override // bc.InterfaceC0643b
    public Object resolveEndpoint(Object obj, InterfaceC7559c interfaceC7559c) {
        C4684c c4684cM8064i;
        C0642a c0642a;
        C4684c c4684cM8064i2;
        switch (this.f35979a) {
            case 21:
                C7965a c7965a = (C7965a) obj;
                String str = c7965a.f38324a;
                Boolean bool = c7965a.f38326c;
                Boolean bool2 = c7965a.f38327d;
                String str2 = c7965a.f38325b;
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
                if (str2 == null || (c4684cM8064i = AbstractC3504d.m8064i(str2, AbstractC8318b.f39877a)) == null) {
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
                    if (str2.equals("us-east-1")) {
                        return new C0642a(C0108o.m297a(c0108o, "https://cognito-identity-fips.us-east-1.amazonaws.com"));
                    }
                    if (str2.equals("us-east-2")) {
                        return new C0642a(C0108o.m297a(c0108o, "https://cognito-identity-fips.us-east-2.amazonaws.com"));
                    }
                    if (str2.equals("us-west-1")) {
                        return new C0642a(C0108o.m297a(c0108o, "https://cognito-identity-fips.us-west-1.amazonaws.com"));
                    }
                    if (str2.equals("us-west-2")) {
                        return new C0642a(C0108o.m297a(c0108o, "https://cognito-identity-fips.us-west-2.amazonaws.com"));
                    }
                    c0642a = new C0642a(i0.m0.m7371d("https://cognito-identity-fips.", str2, '.', str4, c0108o));
                } else if (AbstractC4154l.m8918a(bool2, bool6)) {
                    if (!AbstractC4154l.m8918a(bool5, bool6)) {
                        throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                    }
                    c0642a = new C0642a(i0.m0.m7371d("https://cognito-identity-fips.", str2, '.', str3, c0108o));
                } else if (!AbstractC4154l.m8918a(bool, bool6)) {
                    c0642a = new C0642a(i0.m0.m7371d("https://cognito-identity.", str2, '.', str3, c0108o));
                } else {
                    if (!bool6.equals(bool4)) {
                        throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                    }
                    if ("aws".equals(c4684cM8064i.f23151a)) {
                        c0642a = new C0642a(C0108o.m297a(c0108o, "https://cognito-identity." + str2 + ".amazonaws.com"));
                    } else {
                        c0642a = new C0642a(i0.m0.m7371d("https://cognito-identity.", str2, '.', str4, c0108o));
                    }
                }
                return c0642a;
            default:
                C8601a c8601a = (C8601a) obj;
                String str5 = c8601a.f41854b;
                String str6 = c8601a.f41853a;
                Boolean bool7 = c8601a.f41855c;
                Boolean bool8 = c8601a.f41856d;
                List list = AbstractC8906b.f42871a;
                C4684c c4684cM8064i3 = AbstractC3504d.m8064i(str5, list);
                C0108o c0108o2 = C0109p.f374i;
                if (c4684cM8064i3 != null && AbstractC4154l.m8918a(c8601a.f41857e, Boolean.TRUE) && str6 == null && str5 != null) {
                    Boolean bool9 = Boolean.FALSE;
                    if (AbstractC4154l.m8918a(bool8, bool9) && AbstractC4154l.m8918a(bool7, bool9)) {
                        if (str5.equals("ap-northeast-1")) {
                            C0109p c0109pM297a2 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f2 = ud.m10980f();
                            C2003a c2003a2 = AbstractC0644c.f4115a;
                            List listM10833h = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a2, "<this>");
                            c2005cM10980f2.mo1862b(c2003a2, listM10833h);
                            return new C0642a(c0109pM297a2, (InterfaceC2004b) c2005cM10980f2);
                        }
                        if (str5.equals("ap-south-1")) {
                            C0109p c0109pM297a3 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f3 = ud.m10980f();
                            C2003a c2003a3 = AbstractC0644c.f4115a;
                            List listM10833h2 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a3, "<this>");
                            c2005cM10980f3.mo1862b(c2003a3, listM10833h2);
                            return new C0642a(c0109pM297a3, (InterfaceC2004b) c2005cM10980f3);
                        }
                        if (str5.equals("ap-southeast-1")) {
                            C0109p c0109pM297a4 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f4 = ud.m10980f();
                            C2003a c2003a4 = AbstractC0644c.f4115a;
                            List listM10833h3 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a4, "<this>");
                            c2005cM10980f4.mo1862b(c2003a4, listM10833h3);
                            return new C0642a(c0109pM297a4, (InterfaceC2004b) c2005cM10980f4);
                        }
                        if (str5.equals("ap-southeast-2")) {
                            C0109p c0109pM297a5 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f5 = ud.m10980f();
                            C2003a c2003a5 = AbstractC0644c.f4115a;
                            List listM10833h4 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a5, "<this>");
                            c2005cM10980f5.mo1862b(c2003a5, listM10833h4);
                            return new C0642a(c0109pM297a5, (InterfaceC2004b) c2005cM10980f5);
                        }
                        if (str5.equals("aws-global")) {
                            C0109p c0109pM297a6 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f6 = ud.m10980f();
                            C2003a c2003a6 = AbstractC0644c.f4115a;
                            List listM10833h5 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a6, "<this>");
                            c2005cM10980f6.mo1862b(c2003a6, listM10833h5);
                            return new C0642a(c0109pM297a6, (InterfaceC2004b) c2005cM10980f6);
                        }
                        if (str5.equals("ca-central-1")) {
                            C0109p c0109pM297a7 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f7 = ud.m10980f();
                            C2003a c2003a7 = AbstractC0644c.f4115a;
                            List listM10833h6 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a7, "<this>");
                            c2005cM10980f7.mo1862b(c2003a7, listM10833h6);
                            return new C0642a(c0109pM297a7, (InterfaceC2004b) c2005cM10980f7);
                        }
                        if (str5.equals("eu-central-1")) {
                            C0109p c0109pM297a8 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f8 = ud.m10980f();
                            C2003a c2003a8 = AbstractC0644c.f4115a;
                            List listM10833h7 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a8, "<this>");
                            c2005cM10980f8.mo1862b(c2003a8, listM10833h7);
                            return new C0642a(c0109pM297a8, (InterfaceC2004b) c2005cM10980f8);
                        }
                        if (str5.equals("eu-north-1")) {
                            C0109p c0109pM297a9 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f9 = ud.m10980f();
                            C2003a c2003a9 = AbstractC0644c.f4115a;
                            List listM10833h8 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a9, "<this>");
                            c2005cM10980f9.mo1862b(c2003a9, listM10833h8);
                            return new C0642a(c0109pM297a9, (InterfaceC2004b) c2005cM10980f9);
                        }
                        if (str5.equals("eu-west-1")) {
                            C0109p c0109pM297a10 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f10 = ud.m10980f();
                            C2003a c2003a10 = AbstractC0644c.f4115a;
                            List listM10833h9 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a10, "<this>");
                            c2005cM10980f10.mo1862b(c2003a10, listM10833h9);
                            return new C0642a(c0109pM297a10, (InterfaceC2004b) c2005cM10980f10);
                        }
                        if (str5.equals("eu-west-2")) {
                            C0109p c0109pM297a11 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f11 = ud.m10980f();
                            C2003a c2003a11 = AbstractC0644c.f4115a;
                            List listM10833h10 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a11, "<this>");
                            c2005cM10980f11.mo1862b(c2003a11, listM10833h10);
                            return new C0642a(c0109pM297a11, (InterfaceC2004b) c2005cM10980f11);
                        }
                        if (str5.equals("eu-west-3")) {
                            C0109p c0109pM297a12 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f12 = ud.m10980f();
                            C2003a c2003a12 = AbstractC0644c.f4115a;
                            List listM10833h11 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a12, "<this>");
                            c2005cM10980f12.mo1862b(c2003a12, listM10833h11);
                            return new C0642a(c0109pM297a12, (InterfaceC2004b) c2005cM10980f12);
                        }
                        if (str5.equals("sa-east-1")) {
                            C0109p c0109pM297a13 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f13 = ud.m10980f();
                            C2003a c2003a13 = AbstractC0644c.f4115a;
                            List listM10833h12 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a13, "<this>");
                            c2005cM10980f13.mo1862b(c2003a13, listM10833h12);
                            return new C0642a(c0109pM297a13, (InterfaceC2004b) c2005cM10980f13);
                        }
                        if (str5.equals("us-east-1")) {
                            C0109p c0109pM297a14 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f14 = ud.m10980f();
                            C2003a c2003a14 = AbstractC0644c.f4115a;
                            List listM10833h13 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a14, "<this>");
                            c2005cM10980f14.mo1862b(c2003a14, listM10833h13);
                            return new C0642a(c0109pM297a14, (InterfaceC2004b) c2005cM10980f14);
                        }
                        if (str5.equals("us-east-2")) {
                            C0109p c0109pM297a15 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f15 = ud.m10980f();
                            C2003a c2003a15 = AbstractC0644c.f4115a;
                            List listM10833h14 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a15, "<this>");
                            c2005cM10980f15.mo1862b(c2003a15, listM10833h14);
                            return new C0642a(c0109pM297a15, (InterfaceC2004b) c2005cM10980f15);
                        }
                        if (str5.equals("us-west-1")) {
                            C0109p c0109pM297a16 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f16 = ud.m10980f();
                            C2003a c2003a16 = AbstractC0644c.f4115a;
                            List listM10833h15 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a16, "<this>");
                            c2005cM10980f16.mo1862b(c2003a16, listM10833h15);
                            return new C0642a(c0109pM297a16, (InterfaceC2004b) c2005cM10980f16);
                        }
                        if (str5.equals("us-west-2")) {
                            C0109p c0109pM297a17 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                            C2005c c2005cM10980f17 = ud.m10980f();
                            C2003a c2003a17 = AbstractC0644c.f4115a;
                            List listM10833h16 = pe.m10833h(g9.m11667g("sts", "us-east-1", bool9, 17));
                            AbstractC4154l.m8923f(c2003a17, "<this>");
                            c2005cM10980f17.mo1862b(c2003a17, listM10833h16);
                            return new C0642a(c0109pM297a17, (InterfaceC2004b) c2005cM10980f17);
                        }
                        C0109p c0109pM297a18 = C0108o.m297a(c0108o2, "https://sts." + str5 + '.' + c4684cM8064i3.f23152b);
                        C2005c c2005cM10980f18 = ud.m10980f();
                        C2003a c2003a18 = AbstractC0644c.f4115a;
                        List listM10833h17 = pe.m10833h(g9.m11667g("sts", str5, bool9, 17));
                        AbstractC4154l.m8923f(c2003a18, "<this>");
                        c2005cM10980f18.mo1862b(c2003a18, listM10833h17);
                        return new C0642a(c0109pM297a18, (InterfaceC2004b) c2005cM10980f18);
                    }
                }
                if (str6 != null) {
                    Boolean bool10 = Boolean.TRUE;
                    if (AbstractC4154l.m8918a(bool8, bool10)) {
                        throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
                    }
                    if (AbstractC4154l.m8918a(bool7, bool10)) {
                        throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
                    }
                    C0109p c0109pM297a19 = C0108o.m297a(c0108o2, str6);
                    C2005c c2005cM10980f19 = ud.m10980f();
                    C2003a c2003a19 = AbstractC8610b.f41875c;
                    AbstractC4154l.m8923f(c2003a19, "<this>");
                    c2005cM10980f19.mo1862b(c2003a19, bool10);
                    return new C0642a(c0109pM297a19, (InterfaceC2004b) c2005cM10980f19);
                }
                if (str5 == null || (c4684cM8064i2 = AbstractC3504d.m8064i(str5, list)) == null) {
                    throw new EndpointProviderException("Invalid Configuration: Missing Region");
                }
                String str7 = c4684cM8064i2.f23152b;
                String str8 = c4684cM8064i2.f23153c;
                Boolean bool11 = c4684cM8064i2.f23155e;
                Boolean bool12 = c4684cM8064i2.f23154d;
                Boolean bool13 = Boolean.TRUE;
                if (AbstractC4154l.m8918a(bool8, bool13) && AbstractC4154l.m8918a(bool7, bool13)) {
                    if (bool13.equals(bool12) && bool13.equals(bool11)) {
                        return new C0642a(i0.m0.m7371d("https://sts-fips.", str5, '.', str8, c0108o2));
                    }
                    throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
                }
                if (AbstractC4154l.m8918a(bool8, bool13)) {
                    if (!AbstractC4154l.m8918a(bool12, bool13)) {
                        throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                    }
                    if (!AbstractC4154l.m8918a(c4684cM8064i2.f23151a, "aws-us-gov")) {
                        return new C0642a(i0.m0.m7371d("https://sts-fips.", str5, '.', str7, c0108o2));
                    }
                    return new C0642a(C0108o.m297a(c0108o2, "https://sts." + str5 + ".amazonaws.com"));
                }
                if (AbstractC4154l.m8918a(bool7, bool13)) {
                    if (bool13.equals(bool11)) {
                        return new C0642a(i0.m0.m7371d("https://sts.", str5, '.', str8, c0108o2));
                    }
                    throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                }
                if (!str5.equals("aws-global")) {
                    return new C0642a(i0.m0.m7371d("https://sts.", str5, '.', str7, c0108o2));
                }
                C0109p c0109pM297a20 = C0108o.m297a(c0108o2, "https://sts.amazonaws.com");
                C2005c c2005cM10980f20 = ud.m10980f();
                C2003a c2003a20 = AbstractC0644c.f4115a;
                List listM10833h18 = pe.m10833h(g9.m11667g("sts", "us-east-1", Boolean.FALSE, 17));
                AbstractC4154l.m8923f(c2003a20, "<this>");
                c2005cM10980f20.mo1862b(c2003a20, listM10833h18);
                return new C0642a(c0109pM297a20, (InterfaceC2004b) c2005cM10980f20);
        }
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        switch (this.f35979a) {
            case 0:
                List list = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6157e.m3530b();
            case 1:
                List list2 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43877q0.m3530b()).longValue());
            case 2:
                List list3 = f0.f35406a;
                c7.f6100b.get();
                Long l9 = (Long) e7.f6146T.m3530b();
                l9.getClass();
                return l9;
            case 3:
                List list4 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6142P.m3530b()).longValue());
            case 4:
                List list5 = f0.f35406a;
                c7.f6100b.get();
                Long l10 = (Long) e7.f6158f.m3530b();
                l10.getClass();
                return l10;
            case 5:
                List list6 = f0.f35406a;
                c7.f6100b.get();
                Long l11 = (Long) e7.f6178z.m3530b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = f0.f35406a;
                c7.f6100b.get();
                Long l12 = (Long) e7.f43880t0.m3530b();
                l12.getClass();
                return l12;
            case 7:
                List list8 = f0.f35406a;
                c7.f6100b.get();
                Long l13 = (Long) e7.f6133G.m3530b();
                l13.getClass();
                return l13;
            case 8:
                List list9 = f0.f35406a;
                m8.f6301b.get();
                Long l14 = (Long) o8.f6333b.m3530b();
                l14.getClass();
                return l14;
            case 9:
                List list10 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6156d.m3530b()).longValue());
            case 10:
                List list11 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f43863c0.m3530b();
            case 11:
                List list12 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6163k.m3530b();
            case 12:
                List list13 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6175w.m3530b()).longValue());
            case 13:
                List list14 = f0.f35406a;
                Boolean bool = (Boolean) w7.f6436a.m3530b();
                bool.getClass();
                return bool;
            case 14:
                List list15 = f0.f35406a;
                return Integer.valueOf((int) ((Long) h7.f6236a.m3530b()).longValue());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43873m0.m3530b()).longValue());
            case 16:
                List list17 = f0.f35406a;
                Boolean bool2 = (Boolean) n7.f6315b.m3530b();
                bool2.getClass();
                return bool2;
            default:
                List list18 = f0.f35406a;
                c7.f6100b.get();
                Long l15 = (Long) e7.f6153a.m3530b();
                l15.getClass();
                return l15;
        }
    }
}
