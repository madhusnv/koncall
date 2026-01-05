package ng;

import a2.AbstractC0030c;
import aa.C0074a;
import ad.C0100g;
import ad.C0104k;
import ad.C0108o;
import ad.C0109p;
import ad.C0117x;
import ad.C0118y;
import android.graphics.Path;
import android.graphics.Typeface;
import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import ba.C0633c;
import bc.AbstractC0644c;
import bc.C0642a;
import bc.InterfaceC0643b;
import bd.C0645a;
import c0.b2;
import c0.d1;
import c0.k1;
import c0.v0;
import c6.a0;
import c9.C0910e;
import c9.C0914i;
import cc.C0945a;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.k7;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import d0.AbstractC1545b;
import dd.C1690h;
import dd.C1691i;
import dd.C1692j;
import dg.InterfaceC1715d;
import e0.C1894c;
import e0.C1896e;
import e0.EnumC1898g;
import eb.C1978b;
import eb.C1984h;
import eb.h2;
import eb.l3;
import eb.q1;
import eb.x2;
import ec.C2003a;
import ec.C2005c;
import ex.InterfaceC2139c;
import f0.C2166a;
import f0.C2168c;
import f0.C2169d;
import f0.C2171f;
import fb.C2246t;
import fb.C2247u;
import fb.C2248v;
import fb.C2249w;
import fc.C2259g;
import fd.C2271i;
import fd.C2272j;
import fd.C2273k;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2276n;
import fe.InterfaceC2281e;
import g0.C2411a;
import g0.C2412b;
import g0.C2413c;
import g0.C2414d;
import g0.InterfaceC2415e;
import g7.InterfaceC2537b;
import gd.C2565c;
import gd.C2566d;
import gd.C2567e;
import gd.C2568f;
import hc.AbstractC2887j;
import hd.C2893e;
import hd.C2896h;
import hd.C2897i;
import hd.EnumC2908t;
import i0.e0;
import i0.m0;
import ib.C3222b;
import iz.d0;
import j0.AbstractC3504d;
import j00.C3507a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb.b3;
import jc.AbstractC3745u;
import jc.C3742r;
import k4.C3998s;
import k4.InterfaceC4004y;
import kk.C4088h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import m0.C4612f;
import ma.C4682a;
import ma.C4684c;
import mq.C4833a;
import nx.AbstractC5178p;
import og.bb;
import og.ff;
import og.pa;
import og.pe;
import og.u1;
import og.ud;
import ox.C5770a;
import ox.EnumC5772c;
import p020v.a1;
import p020v.x0;
import pg.AbstractC5933n;
import pg.f9;
import pg.g9;
import pg.u8;
import pw.InterfaceC6043a;
import qi.InterfaceC6222e;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.C6668r;
import sc.InterfaceC6794n;
import sd.C6813g;
import tc.C7117b;
import ud.InterfaceC7403g;
import ug.InterfaceC7450u;
import uw.InterfaceC7559c;
import wc.C7985s;
import ww.AbstractC8196f;
import ym.C8696g;
import ym.InterfaceC8690a;
import ym.InterfaceC8698i;
import z1.C8849i;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.u */
/* loaded from: classes.dex */
public final class C5070u implements InterfaceC6794n, a0, InterfaceC2537b, InterfaceC7403g, InterfaceC1715d, InterfaceC2281e, InterfaceC0643b, InterfaceC4004y, InterfaceC6222e, InterfaceC7450u {

    /* renamed from: b */
    public static C5070u f24863b;

    /* renamed from: c */
    public static final /* synthetic */ C5070u f24864c = new C5070u(22);

    /* renamed from: d */
    public static final /* synthetic */ C5070u f24865d = new C5070u(29);

    /* renamed from: a */
    public final /* synthetic */ int f24866a;

    public /* synthetic */ C5070u(int i10) {
        this.f24866a = i10;
    }

    /* renamed from: f */
    public static final String m9998f(List list, boolean z6) {
        int i10 = C0118y.f392c;
        return AbstractC6663m.m12748L(list, "/", list.isEmpty() ? "" : "/", z6 ? "/" : "", C0117x.f391a, 24);
    }

    /* renamed from: i */
    public static Typeface m9999i(String str, C3998s c3998s, int i10) {
        if (i10 == 0 && AbstractC4154l.m8918a(c3998s, C3998s.f20695e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM11885a = u8.m11885a(c3998s, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM11885a) : Typeface.create(str, iM11885a);
    }

    /* renamed from: j */
    public static Path m10000j(float f6, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f6, f10);
        path.lineTo(f11, f12);
        return path;
    }

    /* renamed from: k */
    public static final InterfaceC8690a m10001k(C4088h c4088h, InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, d0 d0Var) {
        C0914i c0914i = new C0914i(6);
        ((ArrayList) c0914i.f5587c).add(new C3507a(c4088h));
        ((ArrayList) c0914i.f5588d).add(new C8696g(interfaceC6043a, interfaceC6043a2));
        c0914i.m2622b("https://sync.callyzer.co/api/biz/v1/");
        c0914i.f5585a = d0Var;
        return (InterfaceC8690a) c0914i.m2623c().m223o(InterfaceC8690a.class);
    }

    /* renamed from: l */
    public static final InterfaceC8698i m10002l(C4088h c4088h, InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, d0 d0Var) {
        C0914i c0914i = new C0914i(6);
        ((ArrayList) c0914i.f5587c).add(new C3507a(c4088h));
        ((ArrayList) c0914i.f5588d).add(new C8696g(interfaceC6043a, interfaceC6043a2));
        c0914i.m2622b("https://sync.callyzer.co/api/noauth-service/noAuth/");
        c0914i.f5585a = d0Var;
        return (InterfaceC8698i) c0914i.m2623c().m223o(InterfaceC8698i.class);
    }

    /* renamed from: m */
    public static final InterfaceC8690a m10003m(C4088h c4088h, InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, d0 d0Var) {
        C0914i c0914i = new C0914i(6);
        ((ArrayList) c0914i.f5587c).add(new C3507a(c4088h));
        ((ArrayList) c0914i.f5588d).add(new C8696g(interfaceC6043a, interfaceC6043a2));
        c0914i.m2622b("https://sync.callyzer.co");
        c0914i.f5585a = d0Var;
        return (InterfaceC8690a) c0914i.m2623c().m223o(InterfaceC8690a.class);
    }

    /* renamed from: n */
    public static C0642a m10004n(C3222b c3222b) {
        C4684c c4684cM8271a;
        C4684c c4684cM8271a2;
        C4684c c4684cM8271a3;
        boolean z6;
        C4684c c4684cM8271a4;
        C4684c c4684cM8271a5;
        C4684c c4684cM8271a6;
        C4684c c4684cM8271a7;
        Boolean bool;
        C4684c c4684cM8271a8;
        C4684c c4684cM8271a9;
        String strM10817d;
        String strM10817d2;
        C4684c c4684cM8271a10;
        C4684c c4684cM8271a11;
        String strM10817d3;
        String strM10817d4;
        String strM10817d5;
        String strM7572f = c3222b.m7572f();
        Boolean bool2 = c3222b.f17379f;
        if (strM7572f != null) {
            if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                throw new EndpointProviderException("Accelerate cannot be used with FIPS");
            }
            if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() != null) {
                throw new EndpointProviderException("Cannot set dual-stack in combination with a custom endpoint.");
            }
            if (c3222b.m7571e() != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                throw new EndpointProviderException("A custom endpoint cannot be combined with FIPS");
            }
            if (c3222b.m7571e() != null && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                throw new EndpointProviderException("A custom endpoint cannot be combined with S3 Accelerate");
            }
            C4684c c4684cM8271a12 = b3.m8271a(c3222b.m7572f());
            if (c4684cM8271a12 != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c4684cM8271a12.m9578b(), "aws-cn")) {
                throw new EndpointProviderException("Partition does not support FIPS");
            }
            String strM10816c = pa.m10816c(c3222b.m7568b(), 0, 6, true);
            C0108o c0108o = C0109p.f374i;
            if (strM10816c != null && c3222b.m7568b() != null && AbstractC4154l.m8918a(strM10816c, "--x-s3")) {
                if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                    throw new EndpointProviderException("S3Express does not support Dual-stack.");
                }
                if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                    throw new EndpointProviderException("S3Express does not support S3 Accelerate.");
                }
                C0945a c0945aM10815b = pa.m10815b(c3222b.m7571e());
                if (c0945aM10815b != null && c3222b.m7571e() != null) {
                    if (c3222b.m7570d() == null || !AbstractC4154l.m8918a(c3222b.m7570d(), AbstractC8196f.m15348a(true))) {
                        if (c0945aM10815b.m2714e() && (strM10817d4 = pa.m10817d(c3222b.m7568b())) != null) {
                            C0109p c0109pM297a = C0108o.m297a(c0108o, c0945aM10815b.m2713d() + "://" + c0945aM10815b.m2710a() + '/' + strM10817d4 + c0945aM10815b.m2712c());
                            C2005c c2005cM10980f = ud.m10980f();
                            C2003a c2003aM7374g = m0.m7374g("backend", c2005cM10980f, "S3Express");
                            return m0.m7373f(c2005cM10980f, c2003aM7374g, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g, "<this>"), c0109pM297a, c2005cM10980f);
                        }
                        if (!AbstractC3504d.m8061f(c3222b.m7568b(), false)) {
                            throw new EndpointProviderException("S3Express bucket name is not a valid virtual hostable name.");
                        }
                        C0109p c0109pM297a2 = C0108o.m297a(c0108o, c0945aM10815b.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b.m2710a() + c0945aM10815b.m2712c());
                        C2005c c2005cM10980f2 = ud.m10980f();
                        C2003a c2003aM7374g2 = m0.m7374g("backend", c2005cM10980f2, "S3Express");
                        return m0.m7373f(c2005cM10980f2, c2003aM7374g2, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g2, "<this>"), c0109pM297a2, c2005cM10980f2);
                    }
                    if (c0945aM10815b.m2714e() && (strM10817d5 = pa.m10817d(c3222b.m7568b())) != null) {
                        C0109p c0109pM297a3 = C0108o.m297a(c0108o, c0945aM10815b.m2713d() + "://" + c0945aM10815b.m2710a() + '/' + strM10817d5 + c0945aM10815b.m2712c());
                        C2005c c2005cM10980f3 = ud.m10980f();
                        C2003a c2003aM7374g3 = m0.m7374g("backend", c2005cM10980f3, "S3Express");
                        List listM7387t = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g3, "<this>");
                        c2005cM10980f3.mo1862b(c2003aM7374g3, listM7387t);
                        return new C0642a(c0109pM297a3, c2005cM10980f3);
                    }
                    if (!AbstractC3504d.m8061f(c3222b.m7568b(), false)) {
                        throw new EndpointProviderException("S3Express bucket name is not a valid virtual hostable name.");
                    }
                    C0109p c0109pM297a4 = C0108o.m297a(c0108o, c0945aM10815b.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b.m2710a() + c0945aM10815b.m2712c());
                    C2005c c2005cM10980f4 = ud.m10980f();
                    C2003a c2003aM7374g4 = m0.m7374g("backend", c2005cM10980f4, "S3Express");
                    List listM7387t2 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g4, "<this>");
                    c2005cM10980f4.mo1862b(c2003aM7374g4, listM7387t2);
                    return new C0642a(c0109pM297a4, c2005cM10980f4);
                }
                Boolean bool3 = c3222b.f17388o;
                if (bool3 != null && AbstractC4154l.m8918a(bool3, AbstractC8196f.m15348a(true)) && (c4684cM8271a11 = b3.m8271a(c3222b.m7572f())) != null && (strM10817d3 = pa.m10817d(c3222b.m7568b())) != null && c3222b.m7571e() == null) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        C0109p c0109pM297a5 = C0108o.m297a(c0108o, "https://s3express-control-fips." + c3222b.m7572f() + '.' + c4684cM8271a11.m9577a() + '/' + strM10817d3);
                        C2005c c2005cM10980f5 = ud.m10980f();
                        C2003a c2003aM7374g5 = m0.m7374g("backend", c2005cM10980f5, "S3Express");
                        List listM7387t3 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g5, "<this>");
                        c2005cM10980f5.mo1862b(c2003aM7374g5, listM7387t3);
                        return new C0642a(c0109pM297a5, c2005cM10980f5);
                    }
                    C0109p c0109pM297a6 = C0108o.m297a(c0108o, "https://s3express-control." + c3222b.m7572f() + '.' + c4684cM8271a11.m9577a() + '/' + strM10817d3);
                    C2005c c2005cM10980f6 = ud.m10980f();
                    C2003a c2003aM7374g6 = m0.m7374g("backend", c2005cM10980f6, "S3Express");
                    List listM7387t4 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g6, "<this>");
                    c2005cM10980f6.mo1862b(c2003aM7374g6, listM7387t4);
                    return new C0642a(c0109pM297a6, c2005cM10980f6);
                }
                if (!AbstractC3504d.m8061f(c3222b.m7568b(), false) || (c4684cM8271a10 = b3.m8271a(c3222b.m7572f())) == null) {
                    throw new EndpointProviderException("S3Express bucket name is not a valid virtual hostable name.");
                }
                if (c3222b.m7570d() == null || !AbstractC4154l.m8918a(c3222b.m7570d(), AbstractC8196f.m15348a(true))) {
                    String strM10816c2 = pa.m10816c(c3222b.m7568b(), 6, 14, true);
                    String strM10816c3 = pa.m10816c(c3222b.m7568b(), 14, 16, true);
                    if (strM10816c2 != null && strM10816c3 != null && AbstractC4154l.m8918a(strM10816c3, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb2 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb2, ".s3express-fips-", strM10816c2, '.');
                            C0109p c0109pM7372e = m0.m7372e(sb2, '.', c4684cM8271a10, c0108o);
                            C2005c c2005cM10980f7 = ud.m10980f();
                            C2003a c2003aM7374g7 = m0.m7374g("backend", c2005cM10980f7, "S3Express");
                            return m0.m7373f(c2005cM10980f7, c2003aM7374g7, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g7, "<this>"), c0109pM7372e, c2005cM10980f7);
                        }
                        StringBuilder sb3 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb3, ".s3express-", strM10816c2, '.');
                        C0109p c0109pM7372e2 = m0.m7372e(sb3, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f8 = ud.m10980f();
                        C2003a c2003aM7374g8 = m0.m7374g("backend", c2005cM10980f8, "S3Express");
                        return m0.m7373f(c2005cM10980f8, c2003aM7374g8, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g8, "<this>"), c0109pM7372e2, c2005cM10980f8);
                    }
                    String strM10816c4 = pa.m10816c(c3222b.m7568b(), 6, 15, true);
                    String strM10816c5 = pa.m10816c(c3222b.m7568b(), 15, 17, true);
                    if (strM10816c4 != null && strM10816c5 != null && AbstractC4154l.m8918a(strM10816c5, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb4 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb4, ".s3express-fips-", strM10816c4, '.');
                            C0109p c0109pM7372e3 = m0.m7372e(sb4, '.', c4684cM8271a10, c0108o);
                            C2005c c2005cM10980f9 = ud.m10980f();
                            C2003a c2003aM7374g9 = m0.m7374g("backend", c2005cM10980f9, "S3Express");
                            return m0.m7373f(c2005cM10980f9, c2003aM7374g9, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g9, "<this>"), c0109pM7372e3, c2005cM10980f9);
                        }
                        StringBuilder sb5 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb5, ".s3express-", strM10816c4, '.');
                        C0109p c0109pM7372e4 = m0.m7372e(sb5, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f10 = ud.m10980f();
                        C2003a c2003aM7374g10 = m0.m7374g("backend", c2005cM10980f10, "S3Express");
                        return m0.m7373f(c2005cM10980f10, c2003aM7374g10, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g10, "<this>"), c0109pM7372e4, c2005cM10980f10);
                    }
                    String strM10816c6 = pa.m10816c(c3222b.m7568b(), 6, 19, true);
                    String strM10816c7 = pa.m10816c(c3222b.m7568b(), 19, 21, true);
                    if (strM10816c6 != null && strM10816c7 != null && AbstractC4154l.m8918a(strM10816c7, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb6 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb6, ".s3express-fips-", strM10816c6, '.');
                            C0109p c0109pM7372e5 = m0.m7372e(sb6, '.', c4684cM8271a10, c0108o);
                            C2005c c2005cM10980f11 = ud.m10980f();
                            C2003a c2003aM7374g11 = m0.m7374g("backend", c2005cM10980f11, "S3Express");
                            return m0.m7373f(c2005cM10980f11, c2003aM7374g11, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g11, "<this>"), c0109pM7372e5, c2005cM10980f11);
                        }
                        StringBuilder sb7 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb7, ".s3express-", strM10816c6, '.');
                        C0109p c0109pM7372e6 = m0.m7372e(sb7, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f12 = ud.m10980f();
                        C2003a c2003aM7374g12 = m0.m7374g("backend", c2005cM10980f12, "S3Express");
                        return m0.m7373f(c2005cM10980f12, c2003aM7374g12, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g12, "<this>"), c0109pM7372e6, c2005cM10980f12);
                    }
                    String strM10816c8 = pa.m10816c(c3222b.m7568b(), 6, 20, true);
                    String strM10816c9 = pa.m10816c(c3222b.m7568b(), 20, 22, true);
                    if (strM10816c8 != null && strM10816c9 != null && AbstractC4154l.m8918a(strM10816c9, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb8 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb8, ".s3express-fips-", strM10816c8, '.');
                            C0109p c0109pM7372e7 = m0.m7372e(sb8, '.', c4684cM8271a10, c0108o);
                            C2005c c2005cM10980f13 = ud.m10980f();
                            C2003a c2003aM7374g13 = m0.m7374g("backend", c2005cM10980f13, "S3Express");
                            return m0.m7373f(c2005cM10980f13, c2003aM7374g13, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g13, "<this>"), c0109pM7372e7, c2005cM10980f13);
                        }
                        StringBuilder sb9 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb9, ".s3express-", strM10816c8, '.');
                        C0109p c0109pM7372e8 = m0.m7372e(sb9, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f14 = ud.m10980f();
                        C2003a c2003aM7374g14 = m0.m7374g("backend", c2005cM10980f14, "S3Express");
                        return m0.m7373f(c2005cM10980f14, c2003aM7374g14, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g14, "<this>"), c0109pM7372e8, c2005cM10980f14);
                    }
                    String strM10816c10 = pa.m10816c(c3222b.m7568b(), 6, 26, true);
                    String strM10816c11 = pa.m10816c(c3222b.m7568b(), 26, 28, true);
                    if (strM10816c10 == null || strM10816c11 == null || !AbstractC4154l.m8918a(strM10816c11, "--")) {
                        throw new EndpointProviderException("Unrecognized S3Express bucket name format.");
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb10 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb10, ".s3express-fips-", strM10816c10, '.');
                        C0109p c0109pM7372e9 = m0.m7372e(sb10, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f15 = ud.m10980f();
                        C2003a c2003aM7374g15 = m0.m7374g("backend", c2005cM10980f15, "S3Express");
                        return m0.m7373f(c2005cM10980f15, c2003aM7374g15, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g15, "<this>"), c0109pM7372e9, c2005cM10980f15);
                    }
                    StringBuilder sb11 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb11, ".s3express-", strM10816c10, '.');
                    C0109p c0109pM7372e10 = m0.m7372e(sb11, '.', c4684cM8271a10, c0108o);
                    C2005c c2005cM10980f16 = ud.m10980f();
                    C2003a c2003aM7374g16 = m0.m7374g("backend", c2005cM10980f16, "S3Express");
                    return m0.m7373f(c2005cM10980f16, c2003aM7374g16, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g16, "<this>"), c0109pM7372e10, c2005cM10980f16);
                }
                String strM10816c12 = pa.m10816c(c3222b.m7568b(), 6, 14, true);
                String strM10816c13 = pa.m10816c(c3222b.m7568b(), 14, 16, true);
                if (strM10816c12 != null && strM10816c13 != null && AbstractC4154l.m8918a(strM10816c13, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb12 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb12, ".s3express-fips-", strM10816c12, '.');
                        C0109p c0109pM7372e11 = m0.m7372e(sb12, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f17 = ud.m10980f();
                        C2003a c2003aM7374g17 = m0.m7374g("backend", c2005cM10980f17, "S3Express");
                        List listM7387t5 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g17, "<this>");
                        c2005cM10980f17.mo1862b(c2003aM7374g17, listM7387t5);
                        return new C0642a(c0109pM7372e11, c2005cM10980f17);
                    }
                    StringBuilder sb13 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb13, ".s3express-", strM10816c12, '.');
                    C0109p c0109pM7372e12 = m0.m7372e(sb13, '.', c4684cM8271a10, c0108o);
                    C2005c c2005cM10980f18 = ud.m10980f();
                    C2003a c2003aM7374g18 = m0.m7374g("backend", c2005cM10980f18, "S3Express");
                    List listM7387t6 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g18, "<this>");
                    c2005cM10980f18.mo1862b(c2003aM7374g18, listM7387t6);
                    return new C0642a(c0109pM7372e12, c2005cM10980f18);
                }
                String strM10816c14 = pa.m10816c(c3222b.m7568b(), 6, 15, true);
                String strM10816c15 = pa.m10816c(c3222b.m7568b(), 15, 17, true);
                if (strM10816c14 != null && strM10816c15 != null && AbstractC4154l.m8918a(strM10816c15, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb14 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb14, ".s3express-fips-", strM10816c14, '.');
                        C0109p c0109pM7372e13 = m0.m7372e(sb14, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f19 = ud.m10980f();
                        C2003a c2003aM7374g19 = m0.m7374g("backend", c2005cM10980f19, "S3Express");
                        List listM7387t7 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g19, "<this>");
                        c2005cM10980f19.mo1862b(c2003aM7374g19, listM7387t7);
                        return new C0642a(c0109pM7372e13, c2005cM10980f19);
                    }
                    StringBuilder sb15 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb15, ".s3express-", strM10816c14, '.');
                    C0109p c0109pM7372e14 = m0.m7372e(sb15, '.', c4684cM8271a10, c0108o);
                    C2005c c2005cM10980f20 = ud.m10980f();
                    C2003a c2003aM7374g20 = m0.m7374g("backend", c2005cM10980f20, "S3Express");
                    List listM7387t8 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g20, "<this>");
                    c2005cM10980f20.mo1862b(c2003aM7374g20, listM7387t8);
                    return new C0642a(c0109pM7372e14, c2005cM10980f20);
                }
                String strM10816c16 = pa.m10816c(c3222b.m7568b(), 6, 19, true);
                String strM10816c17 = pa.m10816c(c3222b.m7568b(), 19, 21, true);
                if (strM10816c16 != null && strM10816c17 != null && AbstractC4154l.m8918a(strM10816c17, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb16 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb16, ".s3express-fips-", strM10816c16, '.');
                        C0109p c0109pM7372e15 = m0.m7372e(sb16, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f21 = ud.m10980f();
                        C2003a c2003aM7374g21 = m0.m7374g("backend", c2005cM10980f21, "S3Express");
                        List listM7387t9 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g21, "<this>");
                        c2005cM10980f21.mo1862b(c2003aM7374g21, listM7387t9);
                        return new C0642a(c0109pM7372e15, c2005cM10980f21);
                    }
                    StringBuilder sb17 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb17, ".s3express-", strM10816c16, '.');
                    C0109p c0109pM7372e16 = m0.m7372e(sb17, '.', c4684cM8271a10, c0108o);
                    C2005c c2005cM10980f22 = ud.m10980f();
                    C2003a c2003aM7374g22 = m0.m7374g("backend", c2005cM10980f22, "S3Express");
                    List listM7387t10 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g22, "<this>");
                    c2005cM10980f22.mo1862b(c2003aM7374g22, listM7387t10);
                    return new C0642a(c0109pM7372e16, c2005cM10980f22);
                }
                String strM10816c18 = pa.m10816c(c3222b.m7568b(), 6, 20, true);
                String strM10816c19 = pa.m10816c(c3222b.m7568b(), 20, 22, true);
                if (strM10816c18 != null && strM10816c19 != null && AbstractC4154l.m8918a(strM10816c19, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb18 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb18, ".s3express-fips-", strM10816c18, '.');
                        C0109p c0109pM7372e17 = m0.m7372e(sb18, '.', c4684cM8271a10, c0108o);
                        C2005c c2005cM10980f23 = ud.m10980f();
                        C2003a c2003aM7374g23 = m0.m7374g("backend", c2005cM10980f23, "S3Express");
                        List listM7387t11 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g23, "<this>");
                        c2005cM10980f23.mo1862b(c2003aM7374g23, listM7387t11);
                        return new C0642a(c0109pM7372e17, c2005cM10980f23);
                    }
                    StringBuilder sb19 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb19, ".s3express-", strM10816c18, '.');
                    C0109p c0109pM7372e18 = m0.m7372e(sb19, '.', c4684cM8271a10, c0108o);
                    C2005c c2005cM10980f24 = ud.m10980f();
                    C2003a c2003aM7374g24 = m0.m7374g("backend", c2005cM10980f24, "S3Express");
                    List listM7387t12 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g24, "<this>");
                    c2005cM10980f24.mo1862b(c2003aM7374g24, listM7387t12);
                    return new C0642a(c0109pM7372e18, c2005cM10980f24);
                }
                String strM10816c20 = pa.m10816c(c3222b.m7568b(), 6, 26, true);
                String strM10816c21 = pa.m10816c(c3222b.m7568b(), 26, 28, true);
                if (strM10816c20 == null || strM10816c21 == null || !AbstractC4154l.m8918a(strM10816c21, "--")) {
                    throw new EndpointProviderException("Unrecognized S3Express bucket name format.");
                }
                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                    StringBuilder sb20 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb20, ".s3express-fips-", strM10816c20, '.');
                    C0109p c0109pM7372e19 = m0.m7372e(sb20, '.', c4684cM8271a10, c0108o);
                    C2005c c2005cM10980f25 = ud.m10980f();
                    C2003a c2003aM7374g25 = m0.m7374g("backend", c2005cM10980f25, "S3Express");
                    List listM7387t13 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g25, "<this>");
                    c2005cM10980f25.mo1862b(c2003aM7374g25, listM7387t13);
                    return new C0642a(c0109pM7372e19, c2005cM10980f25);
                }
                StringBuilder sb21 = new StringBuilder("https://");
                m0.m7393z(c3222b, sb21, ".s3express-", strM10816c20, '.');
                C0109p c0109pM7372e20 = m0.m7372e(sb21, '.', c4684cM8271a10, c0108o);
                C2005c c2005cM10980f26 = ud.m10980f();
                C2003a c2003aM7374g26 = m0.m7374g("backend", c2005cM10980f26, "S3Express");
                List listM7387t14 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                AbstractC4154l.m8923f(c2003aM7374g26, "<this>");
                c2005cM10980f26.mo1862b(c2003aM7374g26, listM7387t14);
                return new C0642a(c0109pM7372e20, c2005cM10980f26);
            }
            String strM10816c22 = pa.m10816c(c3222b.m7568b(), 0, 7, true);
            if (strM10816c22 != null && c3222b.m7568b() != null && AbstractC4154l.m8918a(strM10816c22, "--xa-s3")) {
                if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                    throw new EndpointProviderException("S3Express does not support Dual-stack.");
                }
                if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                    throw new EndpointProviderException("S3Express does not support S3 Accelerate.");
                }
                C0945a c0945aM10815b2 = pa.m10815b(c3222b.m7571e());
                if (c0945aM10815b2 != null && c3222b.m7571e() != null) {
                    if (c3222b.m7570d() == null || !AbstractC4154l.m8918a(c3222b.m7570d(), AbstractC8196f.m15348a(true))) {
                        if (c0945aM10815b2.m2714e() && (strM10817d = pa.m10817d(c3222b.m7568b())) != null) {
                            C0109p c0109pM297a7 = C0108o.m297a(c0108o, c0945aM10815b2.m2713d() + "://" + c0945aM10815b2.m2710a() + '/' + strM10817d + c0945aM10815b2.m2712c());
                            C2005c c2005cM10980f27 = ud.m10980f();
                            C2003a c2003aM7374g27 = m0.m7374g("backend", c2005cM10980f27, "S3Express");
                            return m0.m7373f(c2005cM10980f27, c2003aM7374g27, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g27, "<this>"), c0109pM297a7, c2005cM10980f27);
                        }
                        if (!AbstractC3504d.m8061f(c3222b.m7568b(), false)) {
                            throw new EndpointProviderException("S3Express bucket name is not a valid virtual hostable name.");
                        }
                        C0109p c0109pM297a8 = C0108o.m297a(c0108o, c0945aM10815b2.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b2.m2710a() + c0945aM10815b2.m2712c());
                        C2005c c2005cM10980f28 = ud.m10980f();
                        C2003a c2003aM7374g28 = m0.m7374g("backend", c2005cM10980f28, "S3Express");
                        return m0.m7373f(c2005cM10980f28, c2003aM7374g28, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g28, "<this>"), c0109pM297a8, c2005cM10980f28);
                    }
                    if (c0945aM10815b2.m2714e() && (strM10817d2 = pa.m10817d(c3222b.m7568b())) != null) {
                        C0109p c0109pM297a9 = C0108o.m297a(c0108o, c0945aM10815b2.m2713d() + "://" + c0945aM10815b2.m2710a() + '/' + strM10817d2 + c0945aM10815b2.m2712c());
                        C2005c c2005cM10980f29 = ud.m10980f();
                        C2003a c2003aM7374g29 = m0.m7374g("backend", c2005cM10980f29, "S3Express");
                        List listM7387t15 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g29, "<this>");
                        c2005cM10980f29.mo1862b(c2003aM7374g29, listM7387t15);
                        return new C0642a(c0109pM297a9, c2005cM10980f29);
                    }
                    if (!AbstractC3504d.m8061f(c3222b.m7568b(), false)) {
                        throw new EndpointProviderException("S3Express bucket name is not a valid virtual hostable name.");
                    }
                    C0109p c0109pM297a10 = C0108o.m297a(c0108o, c0945aM10815b2.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b2.m2710a() + c0945aM10815b2.m2712c());
                    C2005c c2005cM10980f30 = ud.m10980f();
                    C2003a c2003aM7374g30 = m0.m7374g("backend", c2005cM10980f30, "S3Express");
                    List listM7387t16 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g30, "<this>");
                    c2005cM10980f30.mo1862b(c2003aM7374g30, listM7387t16);
                    return new C0642a(c0109pM297a10, c2005cM10980f30);
                }
                if (!AbstractC3504d.m8061f(c3222b.m7568b(), false) || (c4684cM8271a9 = b3.m8271a(c3222b.m7572f())) == null) {
                    throw new EndpointProviderException("S3Express bucket name is not a valid virtual hostable name.");
                }
                if (c3222b.m7570d() == null || !AbstractC4154l.m8918a(c3222b.m7570d(), AbstractC8196f.m15348a(true))) {
                    String strM10816c23 = pa.m10816c(c3222b.m7568b(), 7, 15, true);
                    String strM10816c24 = pa.m10816c(c3222b.m7568b(), 15, 17, true);
                    if (strM10816c23 != null && strM10816c24 != null && AbstractC4154l.m8918a(strM10816c24, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb22 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb22, ".s3express-fips-", strM10816c23, '.');
                            C0109p c0109pM7372e21 = m0.m7372e(sb22, '.', c4684cM8271a9, c0108o);
                            C2005c c2005cM10980f31 = ud.m10980f();
                            C2003a c2003aM7374g31 = m0.m7374g("backend", c2005cM10980f31, "S3Express");
                            return m0.m7373f(c2005cM10980f31, c2003aM7374g31, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g31, "<this>"), c0109pM7372e21, c2005cM10980f31);
                        }
                        StringBuilder sb23 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb23, ".s3express-", strM10816c23, '.');
                        C0109p c0109pM7372e22 = m0.m7372e(sb23, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f32 = ud.m10980f();
                        C2003a c2003aM7374g32 = m0.m7374g("backend", c2005cM10980f32, "S3Express");
                        return m0.m7373f(c2005cM10980f32, c2003aM7374g32, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g32, "<this>"), c0109pM7372e22, c2005cM10980f32);
                    }
                    String strM10816c25 = pa.m10816c(c3222b.m7568b(), 7, 16, true);
                    String strM10816c26 = pa.m10816c(c3222b.m7568b(), 16, 18, true);
                    if (strM10816c25 != null && strM10816c26 != null && AbstractC4154l.m8918a(strM10816c26, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb24 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb24, ".s3express-fips-", strM10816c25, '.');
                            C0109p c0109pM7372e23 = m0.m7372e(sb24, '.', c4684cM8271a9, c0108o);
                            C2005c c2005cM10980f33 = ud.m10980f();
                            C2003a c2003aM7374g33 = m0.m7374g("backend", c2005cM10980f33, "S3Express");
                            return m0.m7373f(c2005cM10980f33, c2003aM7374g33, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g33, "<this>"), c0109pM7372e23, c2005cM10980f33);
                        }
                        StringBuilder sb25 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb25, ".s3express-", strM10816c25, '.');
                        C0109p c0109pM7372e24 = m0.m7372e(sb25, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f34 = ud.m10980f();
                        C2003a c2003aM7374g34 = m0.m7374g("backend", c2005cM10980f34, "S3Express");
                        return m0.m7373f(c2005cM10980f34, c2003aM7374g34, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g34, "<this>"), c0109pM7372e24, c2005cM10980f34);
                    }
                    String strM10816c27 = pa.m10816c(c3222b.m7568b(), 7, 20, true);
                    String strM10816c28 = pa.m10816c(c3222b.m7568b(), 20, 22, true);
                    if (strM10816c27 != null && strM10816c28 != null && AbstractC4154l.m8918a(strM10816c28, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb26 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb26, ".s3express-fips-", strM10816c27, '.');
                            C0109p c0109pM7372e25 = m0.m7372e(sb26, '.', c4684cM8271a9, c0108o);
                            C2005c c2005cM10980f35 = ud.m10980f();
                            C2003a c2003aM7374g35 = m0.m7374g("backend", c2005cM10980f35, "S3Express");
                            return m0.m7373f(c2005cM10980f35, c2003aM7374g35, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g35, "<this>"), c0109pM7372e25, c2005cM10980f35);
                        }
                        StringBuilder sb27 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb27, ".s3express-", strM10816c27, '.');
                        C0109p c0109pM7372e26 = m0.m7372e(sb27, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f36 = ud.m10980f();
                        C2003a c2003aM7374g36 = m0.m7374g("backend", c2005cM10980f36, "S3Express");
                        return m0.m7373f(c2005cM10980f36, c2003aM7374g36, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g36, "<this>"), c0109pM7372e26, c2005cM10980f36);
                    }
                    String strM10816c29 = pa.m10816c(c3222b.m7568b(), 7, 21, true);
                    String strM10816c30 = pa.m10816c(c3222b.m7568b(), 21, 23, true);
                    if (strM10816c29 != null && strM10816c30 != null && AbstractC4154l.m8918a(strM10816c30, "--")) {
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            StringBuilder sb28 = new StringBuilder("https://");
                            m0.m7393z(c3222b, sb28, ".s3express-fips-", strM10816c29, '.');
                            C0109p c0109pM7372e27 = m0.m7372e(sb28, '.', c4684cM8271a9, c0108o);
                            C2005c c2005cM10980f37 = ud.m10980f();
                            C2003a c2003aM7374g37 = m0.m7374g("backend", c2005cM10980f37, "S3Express");
                            return m0.m7373f(c2005cM10980f37, c2003aM7374g37, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g37, "<this>"), c0109pM7372e27, c2005cM10980f37);
                        }
                        StringBuilder sb29 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb29, ".s3express-", strM10816c29, '.');
                        C0109p c0109pM7372e28 = m0.m7372e(sb29, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f38 = ud.m10980f();
                        C2003a c2003aM7374g38 = m0.m7374g("backend", c2005cM10980f38, "S3Express");
                        return m0.m7373f(c2005cM10980f38, c2003aM7374g38, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g38, "<this>"), c0109pM7372e28, c2005cM10980f38);
                    }
                    String strM10816c31 = pa.m10816c(c3222b.m7568b(), 7, 27, true);
                    String strM10816c32 = pa.m10816c(c3222b.m7568b(), 27, 29, true);
                    if (strM10816c31 == null || strM10816c32 == null || !AbstractC4154l.m8918a(strM10816c32, "--")) {
                        throw new EndpointProviderException("Unrecognized S3Express bucket name format.");
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb30 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb30, ".s3express-fips-", strM10816c31, '.');
                        C0109p c0109pM7372e29 = m0.m7372e(sb30, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f39 = ud.m10980f();
                        C2003a c2003aM7374g39 = m0.m7374g("backend", c2005cM10980f39, "S3Express");
                        return m0.m7373f(c2005cM10980f39, c2003aM7374g39, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g39, "<this>"), c0109pM7372e29, c2005cM10980f39);
                    }
                    StringBuilder sb31 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb31, ".s3express-", strM10816c31, '.');
                    C0109p c0109pM7372e30 = m0.m7372e(sb31, '.', c4684cM8271a9, c0108o);
                    C2005c c2005cM10980f40 = ud.m10980f();
                    C2003a c2003aM7374g40 = m0.m7374g("backend", c2005cM10980f40, "S3Express");
                    return m0.m7373f(c2005cM10980f40, c2003aM7374g40, m0.m7388u(true, String.valueOf(c3222b.m7572f()), 17, c2003aM7374g40, "<this>"), c0109pM7372e30, c2005cM10980f40);
                }
                String strM10816c33 = pa.m10816c(c3222b.m7568b(), 7, 15, true);
                String strM10816c34 = pa.m10816c(c3222b.m7568b(), 15, 17, true);
                if (strM10816c33 != null && strM10816c34 != null && AbstractC4154l.m8918a(strM10816c34, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb32 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb32, ".s3express-fips-", strM10816c33, '.');
                        C0109p c0109pM7372e31 = m0.m7372e(sb32, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f41 = ud.m10980f();
                        C2003a c2003aM7374g41 = m0.m7374g("backend", c2005cM10980f41, "S3Express");
                        List listM7387t17 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g41, "<this>");
                        c2005cM10980f41.mo1862b(c2003aM7374g41, listM7387t17);
                        return new C0642a(c0109pM7372e31, c2005cM10980f41);
                    }
                    StringBuilder sb33 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb33, ".s3express-", strM10816c33, '.');
                    C0109p c0109pM7372e32 = m0.m7372e(sb33, '.', c4684cM8271a9, c0108o);
                    C2005c c2005cM10980f42 = ud.m10980f();
                    C2003a c2003aM7374g42 = m0.m7374g("backend", c2005cM10980f42, "S3Express");
                    List listM7387t18 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g42, "<this>");
                    c2005cM10980f42.mo1862b(c2003aM7374g42, listM7387t18);
                    return new C0642a(c0109pM7372e32, c2005cM10980f42);
                }
                String strM10816c35 = pa.m10816c(c3222b.m7568b(), 7, 16, true);
                String strM10816c36 = pa.m10816c(c3222b.m7568b(), 16, 18, true);
                if (strM10816c35 != null && strM10816c36 != null && AbstractC4154l.m8918a(strM10816c36, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb34 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb34, ".s3express-fips-", strM10816c35, '.');
                        C0109p c0109pM7372e33 = m0.m7372e(sb34, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f43 = ud.m10980f();
                        C2003a c2003aM7374g43 = m0.m7374g("backend", c2005cM10980f43, "S3Express");
                        List listM7387t19 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g43, "<this>");
                        c2005cM10980f43.mo1862b(c2003aM7374g43, listM7387t19);
                        return new C0642a(c0109pM7372e33, c2005cM10980f43);
                    }
                    StringBuilder sb35 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb35, ".s3express-", strM10816c35, '.');
                    C0109p c0109pM7372e34 = m0.m7372e(sb35, '.', c4684cM8271a9, c0108o);
                    C2005c c2005cM10980f44 = ud.m10980f();
                    C2003a c2003aM7374g44 = m0.m7374g("backend", c2005cM10980f44, "S3Express");
                    List listM7387t20 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g44, "<this>");
                    c2005cM10980f44.mo1862b(c2003aM7374g44, listM7387t20);
                    return new C0642a(c0109pM7372e34, c2005cM10980f44);
                }
                String strM10816c37 = pa.m10816c(c3222b.m7568b(), 7, 20, true);
                String strM10816c38 = pa.m10816c(c3222b.m7568b(), 20, 22, true);
                if (strM10816c37 != null && strM10816c38 != null && AbstractC4154l.m8918a(strM10816c38, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb36 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb36, ".s3express-fips-", strM10816c37, '.');
                        C0109p c0109pM7372e35 = m0.m7372e(sb36, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f45 = ud.m10980f();
                        C2003a c2003aM7374g45 = m0.m7374g("backend", c2005cM10980f45, "S3Express");
                        List listM7387t21 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g45, "<this>");
                        c2005cM10980f45.mo1862b(c2003aM7374g45, listM7387t21);
                        return new C0642a(c0109pM7372e35, c2005cM10980f45);
                    }
                    StringBuilder sb37 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb37, ".s3express-", strM10816c37, '.');
                    C0109p c0109pM7372e36 = m0.m7372e(sb37, '.', c4684cM8271a9, c0108o);
                    C2005c c2005cM10980f46 = ud.m10980f();
                    C2003a c2003aM7374g46 = m0.m7374g("backend", c2005cM10980f46, "S3Express");
                    List listM7387t22 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g46, "<this>");
                    c2005cM10980f46.mo1862b(c2003aM7374g46, listM7387t22);
                    return new C0642a(c0109pM7372e36, c2005cM10980f46);
                }
                String strM10816c39 = pa.m10816c(c3222b.m7568b(), 7, 21, true);
                String strM10816c40 = pa.m10816c(c3222b.m7568b(), 21, 23, true);
                if (strM10816c39 != null && strM10816c40 != null && AbstractC4154l.m8918a(strM10816c40, "--")) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        StringBuilder sb38 = new StringBuilder("https://");
                        m0.m7393z(c3222b, sb38, ".s3express-fips-", strM10816c39, '.');
                        C0109p c0109pM7372e37 = m0.m7372e(sb38, '.', c4684cM8271a9, c0108o);
                        C2005c c2005cM10980f47 = ud.m10980f();
                        C2003a c2003aM7374g47 = m0.m7374g("backend", c2005cM10980f47, "S3Express");
                        List listM7387t23 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM7374g47, "<this>");
                        c2005cM10980f47.mo1862b(c2003aM7374g47, listM7387t23);
                        return new C0642a(c0109pM7372e37, c2005cM10980f47);
                    }
                    StringBuilder sb39 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb39, ".s3express-", strM10816c39, '.');
                    C0109p c0109pM7372e38 = m0.m7372e(sb39, '.', c4684cM8271a9, c0108o);
                    C2005c c2005cM10980f48 = ud.m10980f();
                    C2003a c2003aM7374g48 = m0.m7374g("backend", c2005cM10980f48, "S3Express");
                    List listM7387t24 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g48, "<this>");
                    c2005cM10980f48.mo1862b(c2003aM7374g48, listM7387t24);
                    return new C0642a(c0109pM7372e38, c2005cM10980f48);
                }
                String strM10816c41 = pa.m10816c(c3222b.m7568b(), 7, 27, true);
                String strM10816c42 = pa.m10816c(c3222b.m7568b(), 27, 29, true);
                if (strM10816c41 == null || strM10816c42 == null || !AbstractC4154l.m8918a(strM10816c42, "--")) {
                    throw new EndpointProviderException("Unrecognized S3Express bucket name format.");
                }
                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                    StringBuilder sb40 = new StringBuilder("https://");
                    m0.m7393z(c3222b, sb40, ".s3express-fips-", strM10816c41, '.');
                    C0109p c0109pM7372e39 = m0.m7372e(sb40, '.', c4684cM8271a9, c0108o);
                    C2005c c2005cM10980f49 = ud.m10980f();
                    C2003a c2003aM7374g49 = m0.m7374g("backend", c2005cM10980f49, "S3Express");
                    List listM7387t25 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g49, "<this>");
                    c2005cM10980f49.mo1862b(c2003aM7374g49, listM7387t25);
                    return new C0642a(c0109pM7372e39, c2005cM10980f49);
                }
                StringBuilder sb41 = new StringBuilder("https://");
                m0.m7393z(c3222b, sb41, ".s3express-", strM10816c41, '.');
                C0109p c0109pM7372e40 = m0.m7372e(sb41, '.', c4684cM8271a9, c0108o);
                C2005c c2005cM10980f50 = ud.m10980f();
                C2003a c2003aM7374g50 = m0.m7374g("backend", c2005cM10980f50, "S3Express");
                List listM7387t26 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                AbstractC4154l.m8923f(c2003aM7374g50, "<this>");
                c2005cM10980f50.mo1862b(c2003aM7374g50, listM7387t26);
                return new C0642a(c0109pM7372e40, c2005cM10980f50);
            }
            if (c3222b.m7568b() == null && (bool = c3222b.f17388o) != null && AbstractC4154l.m8918a(bool, AbstractC8196f.m15348a(true)) && (c4684cM8271a8 = b3.m8271a(c3222b.m7572f())) != null) {
                C0945a c0945aM10815b3 = pa.m10815b(c3222b.m7571e());
                if (c0945aM10815b3 != null && c3222b.m7571e() != null) {
                    C0109p c0109pM297a11 = C0108o.m297a(c0108o, c0945aM10815b3.m2713d() + "://" + c0945aM10815b3.m2710a() + c0945aM10815b3.m2712c());
                    C2005c c2005cM10980f51 = ud.m10980f();
                    C2003a c2003aM7374g51 = m0.m7374g("backend", c2005cM10980f51, "S3Express");
                    List listM7387t27 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g51, "<this>");
                    c2005cM10980f51.mo1862b(c2003aM7374g51, listM7387t27);
                    return new C0642a(c0109pM297a11, c2005cM10980f51);
                }
                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                    C0109p c0109pM297a12 = C0108o.m297a(c0108o, "https://s3express-control-fips." + c3222b.m7572f() + '.' + c4684cM8271a8.m9577a());
                    C2005c c2005cM10980f52 = ud.m10980f();
                    C2003a c2003aM7374g52 = m0.m7374g("backend", c2005cM10980f52, "S3Express");
                    List listM7387t28 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM7374g52, "<this>");
                    c2005cM10980f52.mo1862b(c2003aM7374g52, listM7387t28);
                    return new C0642a(c0109pM297a12, c2005cM10980f52);
                }
                C0109p c0109pM297a13 = C0108o.m297a(c0108o, "https://s3express-control." + c3222b.m7572f() + '.' + c4684cM8271a8.m9577a());
                C2005c c2005cM10980f53 = ud.m10980f();
                C2003a c2003aM7374g53 = m0.m7374g("backend", c2005cM10980f53, "S3Express");
                List listM7387t29 = m0.m7387t(17, "s3express", String.valueOf(c3222b.m7572f()), true);
                AbstractC4154l.m8923f(c2003aM7374g53, "<this>");
                c2005cM10980f53.mo1862b(c2003aM7374g53, listM7387t29);
                return new C0642a(c0109pM297a13, c2005cM10980f53);
            }
            String strM10816c43 = pa.m10816c(c3222b.m7568b(), 49, 50, true);
            String strM10816c44 = pa.m10816c(c3222b.m7568b(), 8, 12, true);
            String strM10816c45 = pa.m10816c(c3222b.m7568b(), 0, 7, true);
            String strM10816c46 = pa.m10816c(c3222b.m7568b(), 32, 49, true);
            C4684c c4684cM8271a13 = b3.m8271a(c3222b.m7572f());
            if (strM10816c43 != null && strM10816c44 != null && strM10816c45 != null && strM10816c46 != null && c4684cM8271a13 != null && c3222b.m7568b() != null && AbstractC4154l.m8918a(strM10816c45, "--op-s3")) {
                if (!pa.m10814a(strM10816c46, false)) {
                    throw new EndpointProviderException("Invalid ARN: The outpost Id must only contain a-z, A-Z, 0-9 and `-`.");
                }
                if (AbstractC4154l.m8918a(strM10816c43, "e")) {
                    if (AbstractC4154l.m8918a(strM10816c44, "beta")) {
                        if (c3222b.m7571e() == null) {
                            throw new EndpointProviderException("Expected a endpoint to be specified but no endpoint was found");
                        }
                        C0945a c0945aM10815b4 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b4 != null && c3222b.m7571e() != null) {
                            C0109p c0109pM297a14 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".ec2." + c0945aM10815b4.m2710a());
                            C2005c c2005cM10980f54 = ud.m10980f();
                            C2003a c2003aM1860b = AbstractC0644c.m1860b();
                            List listM10834i = pe.m10834i(f9.m11634h("s3-outposts", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17), g9.m11667g("s3-outposts", String.valueOf(c3222b.m7572f()), AbstractC8196f.m15348a(true), 17));
                            AbstractC4154l.m8923f(c2003aM1860b, "<this>");
                            c2005cM10980f54.mo1862b(c2003aM1860b, listM10834i);
                            return new C0642a(c0109pM297a14, c2005cM10980f54);
                        }
                    }
                    C0109p c0109pM297a15 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".ec2.s3-outposts." + c3222b.m7572f() + '.' + c4684cM8271a13.m9577a());
                    C2005c c2005cM10980f55 = ud.m10980f();
                    C2003a c2003aM1860b2 = AbstractC0644c.m1860b();
                    List listM10834i2 = pe.m10834i(f9.m11634h("s3-outposts", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17), g9.m11667g("s3-outposts", String.valueOf(c3222b.m7572f()), AbstractC8196f.m15348a(true), 17));
                    AbstractC4154l.m8923f(c2003aM1860b2, "<this>");
                    c2005cM10980f55.mo1862b(c2003aM1860b2, listM10834i2);
                    return new C0642a(c0109pM297a15, c2005cM10980f55);
                }
                if (!AbstractC4154l.m8918a(strM10816c43, "o")) {
                    throw new EndpointProviderException(a1.m14328h('\"', "Unrecognized hardware type: \"Expected hardware type o or e but got ", strM10816c43));
                }
                if (AbstractC4154l.m8918a(strM10816c44, "beta")) {
                    if (c3222b.m7571e() == null) {
                        throw new EndpointProviderException("Expected a endpoint to be specified but no endpoint was found");
                    }
                    C0945a c0945aM10815b5 = pa.m10815b(c3222b.m7571e());
                    if (c0945aM10815b5 != null && c3222b.m7571e() != null) {
                        C0109p c0109pM297a16 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".op-" + strM10816c46 + '.' + c0945aM10815b5.m2710a());
                        C2005c c2005cM10980f56 = ud.m10980f();
                        C2003a c2003aM1860b3 = AbstractC0644c.m1860b();
                        List listM10834i3 = pe.m10834i(f9.m11634h("s3-outposts", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17), g9.m11667g("s3-outposts", String.valueOf(c3222b.m7572f()), AbstractC8196f.m15348a(true), 17));
                        AbstractC4154l.m8923f(c2003aM1860b3, "<this>");
                        c2005cM10980f56.mo1862b(c2003aM1860b3, listM10834i3);
                        return new C0642a(c0109pM297a16, c2005cM10980f56);
                    }
                }
                StringBuilder sb42 = new StringBuilder("https://");
                sb42.append(c3222b.m7568b());
                sb42.append(".op-");
                sb42.append(strM10816c46);
                sb42.append(".s3-outposts.");
                sb42.append(c3222b.m7572f());
                C0109p c0109pM7372e41 = m0.m7372e(sb42, '.', c4684cM8271a13, c0108o);
                C2005c c2005cM10980f57 = ud.m10980f();
                C2003a c2003aM1860b4 = AbstractC0644c.m1860b();
                List listM10834i4 = pe.m10834i(f9.m11634h("s3-outposts", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17), g9.m11667g("s3-outposts", String.valueOf(c3222b.m7572f()), AbstractC8196f.m15348a(true), 17));
                AbstractC4154l.m8923f(c2003aM1860b4, "<this>");
                c2005cM10980f57.mo1862b(c2003aM1860b4, listM10834i4);
                return new C0642a(c0109pM7372e41, c2005cM10980f57);
            }
            if (c3222b.m7568b() != null) {
                if (c3222b.m7571e() != null && pa.m10815b(c3222b.m7571e()) == null) {
                    throw new EndpointProviderException("Custom endpoint `" + c3222b.m7571e() + "` was not a valid URI");
                }
                if (AbstractC4154l.m8918a(bool2, AbstractC8196f.m15348a(false)) && AbstractC3504d.m8061f(c3222b.m7568b(), false) && (c4684cM8271a7 = b3.m8271a(c3222b.m7572f())) != null) {
                    if (pa.m10814a(c3222b.m7572f(), false)) {
                        if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c4684cM8271a7.m9578b(), "aws-cn")) {
                            throw new EndpointProviderException("S3 Accelerate cannot be used in this region");
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a17 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-fips.dualstack.us-east-1." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f58 = ud.m10980f();
                            C2003a c2003aM1860b5 = AbstractC0644c.m1860b();
                            List listM7387t30 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b5, "<this>");
                            c2005cM10980f58.mo1862b(c2003aM1860b5, listM7387t30);
                            return new C0642a(c0109pM297a17, c2005cM10980f58);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            C0109p c0109pM297a18 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-fips.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f59 = ud.m10980f();
                            C2003a c2003aM1860b6 = AbstractC0644c.m1860b();
                            List listM7387t31 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b6, "<this>");
                            c2005cM10980f59.mo1862b(c2003aM1860b6, listM7387t31);
                            return new C0642a(c0109pM297a18, c2005cM10980f59);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a19 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-fips.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f60 = ud.m10980f();
                            C2003a c2003aM1860b7 = AbstractC0644c.m1860b();
                            List listM7387t32 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b7, "<this>");
                            c2005cM10980f60.mo1862b(c2003aM1860b7, listM7387t32);
                            return new C0642a(c0109pM297a19, c2005cM10980f60);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a20 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-fips.us-east-1." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f61 = ud.m10980f();
                            C2003a c2003aM1860b8 = AbstractC0644c.m1860b();
                            List listM7387t33 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b8, "<this>");
                            c2005cM10980f61.mo1862b(c2003aM1860b8, listM7387t33);
                            return new C0642a(c0109pM297a20, c2005cM10980f61);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            C0109p c0109pM297a21 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-fips." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f62 = ud.m10980f();
                            C2003a c2003aM1860b9 = AbstractC0644c.m1860b();
                            List listM7387t34 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b9, "<this>");
                            c2005cM10980f62.mo1862b(c2003aM1860b9, listM7387t34);
                            return new C0642a(c0109pM297a21, c2005cM10980f62);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a22 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-fips." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f63 = ud.m10980f();
                            C2003a c2003aM1860b10 = AbstractC0644c.m1860b();
                            List listM7387t35 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b10, "<this>");
                            c2005cM10980f63.mo1862b(c2003aM1860b10, listM7387t35);
                            return new C0642a(c0109pM297a22, c2005cM10980f63);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a23 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate.dualstack.us-east-1." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f64 = ud.m10980f();
                            C2003a c2003aM1860b11 = AbstractC0644c.m1860b();
                            List listM7387t36 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b11, "<this>");
                            c2005cM10980f64.mo1862b(c2003aM1860b11, listM7387t36);
                            return new C0642a(c0109pM297a23, c2005cM10980f64);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            C0109p c0109pM297a24 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate.dualstack." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f65 = ud.m10980f();
                            C2003a c2003aM1860b12 = AbstractC0644c.m1860b();
                            List listM7387t37 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b12, "<this>");
                            c2005cM10980f65.mo1862b(c2003aM1860b12, listM7387t37);
                            return new C0642a(c0109pM297a24, c2005cM10980f65);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a25 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate.dualstack." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f66 = ud.m10980f();
                            C2003a c2003aM1860b13 = AbstractC0644c.m1860b();
                            List listM7387t38 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b13, "<this>");
                            c2005cM10980f66.mo1862b(c2003aM1860b13, listM7387t38);
                            return new C0642a(c0109pM297a25, c2005cM10980f66);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a26 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3.dualstack.us-east-1." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f67 = ud.m10980f();
                            C2003a c2003aM1860b14 = AbstractC0644c.m1860b();
                            List listM7387t39 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b14, "<this>");
                            c2005cM10980f67.mo1862b(c2003aM1860b14, listM7387t39);
                            return new C0642a(c0109pM297a26, c2005cM10980f67);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            C0109p c0109pM297a27 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f68 = ud.m10980f();
                            C2003a c2003aM1860b15 = AbstractC0644c.m1860b();
                            List listM7387t40 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b15, "<this>");
                            c2005cM10980f68.mo1862b(c2003aM1860b15, listM7387t40);
                            return new C0642a(c0109pM297a27, c2005cM10980f68);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a28 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f69 = ud.m10980f();
                            C2003a c2003aM1860b16 = AbstractC0644c.m1860b();
                            List listM7387t41 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b16, "<this>");
                            c2005cM10980f69.mo1862b(c2003aM1860b16, listM7387t41);
                            return new C0642a(c0109pM297a28, c2005cM10980f69);
                        }
                        C0945a c0945aM10815b6 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b6 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && c0945aM10815b6.m2714e() && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a29 = C0108o.m297a(c0108o, c0945aM10815b6.m2713d() + "://" + c0945aM10815b6.m2710a() + c0945aM10815b6.m2711b() + c3222b.m7568b());
                            C2005c c2005cM10980f70 = ud.m10980f();
                            C2003a c2003aM1860b17 = AbstractC0644c.m1860b();
                            List listM7387t42 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b17, "<this>");
                            c2005cM10980f70.mo1862b(c2003aM1860b17, listM7387t42);
                            return new C0642a(c0109pM297a29, c2005cM10980f70);
                        }
                        C0945a c0945aM10815b7 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b7 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && !c0945aM10815b7.m2714e() && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a30 = C0108o.m297a(c0108o, c0945aM10815b7.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b7.m2710a() + c0945aM10815b7.m2712c());
                            C2005c c2005cM10980f71 = ud.m10980f();
                            C2003a c2003aM1860b18 = AbstractC0644c.m1860b();
                            List listM7387t43 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b18, "<this>");
                            c2005cM10980f71.mo1862b(c2003aM1860b18, listM7387t43);
                            return new C0642a(c0109pM297a30, c2005cM10980f71);
                        }
                        C0945a c0945aM10815b8 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b8 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && c0945aM10815b8.m2714e() && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                                C0109p c0109pM297a31 = C0108o.m297a(c0108o, c0945aM10815b8.m2713d() + "://" + c0945aM10815b8.m2710a() + c0945aM10815b8.m2711b() + c3222b.m7568b());
                                C2005c c2005cM10980f72 = ud.m10980f();
                                C2003a c2003aM1860b19 = AbstractC0644c.m1860b();
                                List listM7387t44 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                                AbstractC4154l.m8923f(c2003aM1860b19, "<this>");
                                c2005cM10980f72.mo1862b(c2003aM1860b19, listM7387t44);
                                return new C0642a(c0109pM297a31, c2005cM10980f72);
                            }
                            C0109p c0109pM297a32 = C0108o.m297a(c0108o, c0945aM10815b8.m2713d() + "://" + c0945aM10815b8.m2710a() + c0945aM10815b8.m2711b() + c3222b.m7568b());
                            C2005c c2005cM10980f73 = ud.m10980f();
                            C2003a c2003aM1860b20 = AbstractC0644c.m1860b();
                            List listM7387t45 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b20, "<this>");
                            c2005cM10980f73.mo1862b(c2003aM1860b20, listM7387t45);
                            return new C0642a(c0109pM297a32, c2005cM10980f73);
                        }
                        C0945a c0945aM10815b9 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b9 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && !c0945aM10815b9.m2714e() && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                                C0109p c0109pM297a33 = C0108o.m297a(c0108o, c0945aM10815b9.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b9.m2710a() + c0945aM10815b9.m2712c());
                                C2005c c2005cM10980f74 = ud.m10980f();
                                C2003a c2003aM1860b21 = AbstractC0644c.m1860b();
                                List listM7387t46 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                                AbstractC4154l.m8923f(c2003aM1860b21, "<this>");
                                c2005cM10980f74.mo1862b(c2003aM1860b21, listM7387t46);
                                return new C0642a(c0109pM297a33, c2005cM10980f74);
                            }
                            C0109p c0109pM297a34 = C0108o.m297a(c0108o, c0945aM10815b9.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b9.m2710a() + c0945aM10815b9.m2712c());
                            C2005c c2005cM10980f75 = ud.m10980f();
                            C2003a c2003aM1860b22 = AbstractC0644c.m1860b();
                            List listM7387t47 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b22, "<this>");
                            c2005cM10980f75.mo1862b(c2003aM1860b22, listM7387t47);
                            return new C0642a(c0109pM297a34, c2005cM10980f75);
                        }
                        C0945a c0945aM10815b10 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b10 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && c0945aM10815b10.m2714e() && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a35 = C0108o.m297a(c0108o, c0945aM10815b10.m2713d() + "://" + c0945aM10815b10.m2710a() + c0945aM10815b10.m2711b() + c3222b.m7568b());
                            C2005c c2005cM10980f76 = ud.m10980f();
                            C2003a c2003aM1860b23 = AbstractC0644c.m1860b();
                            List listM7387t48 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b23, "<this>");
                            c2005cM10980f76.mo1862b(c2003aM1860b23, listM7387t48);
                            return new C0642a(c0109pM297a35, c2005cM10980f76);
                        }
                        C0945a c0945aM10815b11 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b11 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && !c0945aM10815b11.m2714e() && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a36 = C0108o.m297a(c0108o, c0945aM10815b11.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b11.m2710a() + c0945aM10815b11.m2712c());
                            C2005c c2005cM10980f77 = ud.m10980f();
                            C2003a c2003aM1860b24 = AbstractC0644c.m1860b();
                            List listM7387t49 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b24, "<this>");
                            c2005cM10980f77.mo1862b(c2003aM1860b24, listM7387t49);
                            return new C0642a(c0109pM297a36, c2005cM10980f77);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a37 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f78 = ud.m10980f();
                            C2003a c2003aM1860b25 = AbstractC0644c.m1860b();
                            List listM7387t50 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b25, "<this>");
                            c2005cM10980f78.mo1862b(c2003aM1860b25, listM7387t50);
                            return new C0642a(c0109pM297a37, c2005cM10980f78);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                                C0109p c0109pM297a38 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate." + c4684cM8271a7.m9577a());
                                C2005c c2005cM10980f79 = ud.m10980f();
                                C2003a c2003aM1860b26 = AbstractC0644c.m1860b();
                                List listM7387t51 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                                AbstractC4154l.m8923f(c2003aM1860b26, "<this>");
                                c2005cM10980f79.mo1862b(c2003aM1860b26, listM7387t51);
                                return new C0642a(c0109pM297a38, c2005cM10980f79);
                            }
                            C0109p c0109pM297a39 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f80 = ud.m10980f();
                            C2003a c2003aM1860b27 = AbstractC0644c.m1860b();
                            List listM7387t52 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b27, "<this>");
                            c2005cM10980f80.mo1862b(c2003aM1860b27, listM7387t52);
                            return new C0642a(c0109pM297a39, c2005cM10980f80);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a40 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3-accelerate." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f81 = ud.m10980f();
                            C2003a c2003aM1860b28 = AbstractC0644c.m1860b();
                            List listM7387t53 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b28, "<this>");
                            c2005cM10980f81.mo1862b(c2003aM1860b28, listM7387t53);
                            return new C0642a(c0109pM297a40, c2005cM10980f81);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a41 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3." + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f82 = ud.m10980f();
                            C2003a c2003aM1860b29 = AbstractC0644c.m1860b();
                            List listM7387t54 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b29, "<this>");
                            c2005cM10980f82.mo1862b(c2003aM1860b29, listM7387t54);
                            return new C0642a(c0109pM297a41, c2005cM10980f82);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                                C0109p c0109pM297a42 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3." + c4684cM8271a7.m9577a());
                                C2005c c2005cM10980f83 = ud.m10980f();
                                C2003a c2003aM1860b30 = AbstractC0644c.m1860b();
                                List listM7387t55 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                                AbstractC4154l.m8923f(c2003aM1860b30, "<this>");
                                c2005cM10980f83.mo1862b(c2003aM1860b30, listM7387t55);
                                return new C0642a(c0109pM297a42, c2005cM10980f83);
                            }
                            C0109p c0109pM297a43 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f84 = ud.m10980f();
                            C2003a c2003aM1860b31 = AbstractC0644c.m1860b();
                            List listM7387t56 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b31, "<this>");
                            c2005cM10980f84.mo1862b(c2003aM1860b31, listM7387t56);
                            return new C0642a(c0109pM297a43, c2005cM10980f84);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a44 = C0108o.m297a(c0108o, "https://" + c3222b.m7568b() + ".s3." + c3222b.m7572f() + '.' + c4684cM8271a7.m9577a());
                            C2005c c2005cM10980f85 = ud.m10980f();
                            C2003a c2003aM1860b32 = AbstractC0644c.m1860b();
                            List listM7387t57 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b32, "<this>");
                            c2005cM10980f85.mo1862b(c2003aM1860b32, listM7387t57);
                            return new C0642a(c0109pM297a44, c2005cM10980f85);
                        }
                    }
                    throw new EndpointProviderException("Invalid region: region was not a valid DNS name.");
                }
                C0945a c0945aM10815b12 = pa.m10815b(c3222b.m7571e());
                if (c0945aM10815b12 != null && c3222b.m7571e() != null && AbstractC4154l.m8918a(c0945aM10815b12.m2713d(), "http") && AbstractC3504d.m8061f(c3222b.m7568b(), true) && AbstractC4154l.m8918a(bool2, AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false)) && b3.m8271a(c3222b.m7572f()) != null) {
                    if (!pa.m10814a(c3222b.m7572f(), false)) {
                        throw new EndpointProviderException("Invalid region: region was not a valid DNS name.");
                    }
                    C0109p c0109pM297a45 = C0108o.m297a(c0108o, c0945aM10815b12.m2713d() + "://" + c3222b.m7568b() + '.' + c0945aM10815b12.m2710a() + c0945aM10815b12.m2712c());
                    C2005c c2005cM10980f86 = ud.m10980f();
                    C2003a c2003aM1860b33 = AbstractC0644c.m1860b();
                    List listM7387t58 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM1860b33, "<this>");
                    c2005cM10980f86.mo1862b(c2003aM1860b33, listM7387t58);
                    return new C0642a(c0109pM297a45, c2005cM10980f86);
                }
                C4682a c4682aM8063h = AbstractC3504d.m8063h(c3222b.m7568b());
                if (c4682aM8063h != null && AbstractC4154l.m8918a(bool2, AbstractC8196f.m15348a(false))) {
                    List listM9576c = c4682aM8063h.m9576c();
                    String str = listM9576c != null ? (String) AbstractC6663m.m12744H(listM9576c, 0) : null;
                    if (str == null || AbstractC4154l.m8918a(str, "")) {
                        throw new EndpointProviderException("Invalid ARN: No ARN type specified");
                    }
                    if (AbstractC4154l.m8918a(c4682aM8063h.f23143b, "s3-object-lambda")) {
                        if (!AbstractC4154l.m8918a(str, "accesspoint")) {
                            throw new EndpointProviderException(a1.m14328h('`', "Invalid ARN: Object Lambda ARNs only support `accesspoint` arn types, but found: `", str));
                        }
                        List listM9576c2 = c4682aM8063h.m9576c();
                        String str2 = listM9576c2 != null ? (String) AbstractC6663m.m12744H(listM9576c2, 1) : null;
                        if (str2 == null || AbstractC4154l.m8918a(str2, "")) {
                            throw new EndpointProviderException("Invalid ARN: Expected a resource of the format `accesspoint:<accesspoint name>` but no name was provided");
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                            throw new EndpointProviderException("S3 Object Lambda does not support Dual-stack");
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                            throw new EndpointProviderException("S3 Object Lambda does not support S3 Accelerate");
                        }
                        if (AbstractC4154l.m8918a(c4682aM8063h.m9575b(), "")) {
                            throw new EndpointProviderException("Invalid ARN: bucket ARN is missing a region");
                        }
                        List listM9576c3 = c4682aM8063h.m9576c();
                        if ((listM9576c3 != null ? (String) AbstractC6663m.m12744H(listM9576c3, 2) : null) == null) {
                            if (c3222b.m7573g() != null && AbstractC4154l.m8918a(c3222b.m7573g(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c4682aM8063h.m9575b(), String.valueOf(c3222b.m7572f()))) {
                                throw new EndpointProviderException("Invalid configuration: region from ARN `" + c4682aM8063h.m9575b() + "` does not match client region `" + c3222b.m7572f() + "` and UseArnRegion is `false`");
                            }
                            C4684c c4684cM8271a14 = b3.m8271a(c4682aM8063h.m9575b());
                            if (c4684cM8271a14 != null && (c4684cM8271a6 = b3.m8271a(c3222b.m7572f())) != null) {
                                if (!AbstractC4154l.m8918a(c4684cM8271a14.m9578b(), c4684cM8271a6.m9578b())) {
                                    throw new EndpointProviderException("Client was configured for partition `" + c4684cM8271a6.m9578b() + "` but ARN (`" + c3222b.m7568b() + "`) has `" + c4684cM8271a14.m9578b() + '`');
                                }
                                if (!pa.m10814a(c4682aM8063h.m9575b(), true)) {
                                    throw new EndpointProviderException("Invalid region in ARN: `" + c4682aM8063h.m9575b() + "` (invalid DNS name)");
                                }
                                if (AbstractC4154l.m8918a(c4682aM8063h.m9574a(), "")) {
                                    throw new EndpointProviderException("Invalid ARN: Missing account id");
                                }
                                if (!pa.m10814a(c4682aM8063h.m9574a(), false)) {
                                    throw new EndpointProviderException("Invalid ARN: The account id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + c4682aM8063h.m9574a() + '`');
                                }
                                if (!pa.m10814a(str2, false)) {
                                    throw new EndpointProviderException(a1.m14328h('`', "Invalid ARN: The access point name may only contain a-z, A-Z, 0-9 and `-`. Found: `", str2));
                                }
                                C0945a c0945aM10815b13 = pa.m10815b(c3222b.m7571e());
                                if (c0945aM10815b13 != null && c3222b.m7571e() != null) {
                                    C0109p c0109pM297a46 = C0108o.m297a(c0108o, c0945aM10815b13.m2713d() + "://" + str2 + '-' + c4682aM8063h.m9574a() + '.' + c0945aM10815b13.m2710a() + c0945aM10815b13.m2712c());
                                    C2005c c2005cM10980f87 = ud.m10980f();
                                    C2003a c2003aM1860b34 = AbstractC0644c.m1860b();
                                    List listM7387t59 = m0.m7387t(17, "s3-object-lambda", String.valueOf(c4682aM8063h.m9575b()), true);
                                    AbstractC4154l.m8923f(c2003aM1860b34, "<this>");
                                    c2005cM10980f87.mo1862b(c2003aM1860b34, listM7387t59);
                                    return new C0642a(c0109pM297a46, c2005cM10980f87);
                                }
                                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                                    C0109p c0109pM297a47 = C0108o.m297a(c0108o, "https://" + str2 + '-' + c4682aM8063h.m9574a() + ".s3-object-lambda-fips." + c4682aM8063h.m9575b() + '.' + c4684cM8271a14.m9577a());
                                    C2005c c2005cM10980f88 = ud.m10980f();
                                    C2003a c2003aM1860b35 = AbstractC0644c.m1860b();
                                    List listM7387t60 = m0.m7387t(17, "s3-object-lambda", String.valueOf(c4682aM8063h.m9575b()), true);
                                    AbstractC4154l.m8923f(c2003aM1860b35, "<this>");
                                    c2005cM10980f88.mo1862b(c2003aM1860b35, listM7387t60);
                                    return new C0642a(c0109pM297a47, c2005cM10980f88);
                                }
                                C0109p c0109pM297a48 = C0108o.m297a(c0108o, "https://" + str2 + '-' + c4682aM8063h.m9574a() + ".s3-object-lambda." + c4682aM8063h.m9575b() + '.' + c4684cM8271a14.m9577a());
                                C2005c c2005cM10980f89 = ud.m10980f();
                                C2003a c2003aM1860b36 = AbstractC0644c.m1860b();
                                List listM7387t61 = m0.m7387t(17, "s3-object-lambda", String.valueOf(c4682aM8063h.m9575b()), true);
                                AbstractC4154l.m8923f(c2003aM1860b36, "<this>");
                                c2005cM10980f89.mo1862b(c2003aM1860b36, listM7387t61);
                                return new C0642a(c0109pM297a48, c2005cM10980f89);
                            }
                        }
                        throw new EndpointProviderException("Invalid ARN: The ARN may only contain a single resource component after `accesspoint`.");
                    }
                    if (!AbstractC4154l.m8918a(str, "accesspoint")) {
                        if (!AbstractC4154l.m8918a(c4682aM8063h.f23143b, "s3-outposts")) {
                            throw new EndpointProviderException("Invalid ARN: Unrecognized format: " + c3222b.m7568b() + " (type: " + str + ')');
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                            throw new EndpointProviderException("S3 Outposts does not support Dual-stack");
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                            throw new EndpointProviderException("S3 Outposts does not support FIPS");
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                            throw new EndpointProviderException("S3 Outposts does not support S3 Accelerate");
                        }
                        List listM9576c4 = c4682aM8063h.m9576c();
                        if ((listM9576c4 != null ? (String) AbstractC6663m.m12744H(listM9576c4, 4) : null) != null) {
                            throw new EndpointProviderException("Invalid Arn: Outpost Access Point ARN contains sub resources");
                        }
                        List listM9576c5 = c4682aM8063h.m9576c();
                        String str3 = listM9576c5 != null ? (String) AbstractC6663m.m12744H(listM9576c5, 1) : null;
                        if (str3 == null) {
                            throw new EndpointProviderException("Invalid ARN: The Outpost Id was not set");
                        }
                        if (pa.m10814a(str3, false)) {
                            if (c3222b.m7573g() != null && AbstractC4154l.m8918a(c3222b.m7573g(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c4682aM8063h.m9575b(), String.valueOf(c3222b.m7572f()))) {
                                throw new EndpointProviderException("Invalid configuration: region from ARN `" + c4682aM8063h.m9575b() + "` does not match client region `" + c3222b.m7572f() + "` and UseArnRegion is `false`");
                            }
                            C4684c c4684cM8271a15 = b3.m8271a(c4682aM8063h.m9575b());
                            if (c4684cM8271a15 != null && (c4684cM8271a4 = b3.m8271a(c3222b.m7572f())) != null) {
                                if (!AbstractC4154l.m8918a(c4684cM8271a15.m9578b(), c4684cM8271a4.m9578b())) {
                                    throw new EndpointProviderException("Client was configured for partition `" + c4684cM8271a4.m9578b() + "` but ARN (`" + c3222b.m7568b() + "`) has `" + c4684cM8271a15.m9578b() + '`');
                                }
                                if (!pa.m10814a(c4682aM8063h.m9575b(), true)) {
                                    throw new EndpointProviderException("Invalid region in ARN: `" + c4682aM8063h.m9575b() + "` (invalid DNS name)");
                                }
                                if (!pa.m10814a(c4682aM8063h.m9574a(), false)) {
                                    throw new EndpointProviderException("Invalid ARN: The account id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + c4682aM8063h.m9574a() + '`');
                                }
                                List listM9576c6 = c4682aM8063h.m9576c();
                                String str4 = listM9576c6 != null ? (String) AbstractC6663m.m12744H(listM9576c6, 2) : null;
                                if (str4 == null) {
                                    throw new EndpointProviderException("Invalid ARN: Expected a 4-component resource");
                                }
                                List listM9576c7 = c4682aM8063h.m9576c();
                                String str5 = listM9576c7 != null ? (String) AbstractC6663m.m12744H(listM9576c7, 3) : null;
                                if (str5 == null) {
                                    throw new EndpointProviderException("Invalid ARN: expected an access point name");
                                }
                                if (!AbstractC4154l.m8918a(str4, "accesspoint")) {
                                    throw new EndpointProviderException("Expected an outpost type `accesspoint`, found ".concat(str4));
                                }
                                C0945a c0945aM10815b14 = pa.m10815b(c3222b.m7571e());
                                if (c0945aM10815b14 == null || c3222b.m7571e() == null) {
                                    StringBuilder sb43 = new StringBuilder("https://");
                                    sb43.append(str5);
                                    sb43.append('-');
                                    sb43.append(c4682aM8063h.m9574a());
                                    sb43.append('.');
                                    sb43.append(str3);
                                    sb43.append(".s3-outposts.");
                                    sb43.append(c4682aM8063h.m9575b());
                                    C0109p c0109pM7372e42 = m0.m7372e(sb43, '.', c4684cM8271a15, c0108o);
                                    C2005c c2005cM10980f90 = ud.m10980f();
                                    C2003a c2003aM1860b37 = AbstractC0644c.m1860b();
                                    List listM10834i5 = pe.m10834i(f9.m11634h("s3-outposts", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17), g9.m11667g("s3-outposts", String.valueOf(c4682aM8063h.m9575b()), AbstractC8196f.m15348a(true), 17));
                                    AbstractC4154l.m8923f(c2003aM1860b37, "<this>");
                                    c2005cM10980f90.mo1862b(c2003aM1860b37, listM10834i5);
                                    return new C0642a(c0109pM7372e42, c2005cM10980f90);
                                }
                                C0109p c0109pM297a49 = C0108o.m297a(c0108o, "https://" + str5 + '-' + c4682aM8063h.m9574a() + '.' + str3 + '.' + c0945aM10815b14.m2710a());
                                C2005c c2005cM10980f91 = ud.m10980f();
                                C2003a c2003aM1860b38 = AbstractC0644c.m1860b();
                                List listM10834i6 = pe.m10834i(f9.m11634h("s3-outposts", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17), g9.m11667g("s3-outposts", String.valueOf(c4682aM8063h.m9575b()), AbstractC8196f.m15348a(true), 17));
                                AbstractC4154l.m8923f(c2003aM1860b38, "<this>");
                                c2005cM10980f91.mo1862b(c2003aM1860b38, listM10834i6);
                                return new C0642a(c0109pM297a49, c2005cM10980f91);
                            }
                        }
                        throw new EndpointProviderException(a1.m14328h('`', "Invalid ARN: The outpost Id may only contain a-z, A-Z, 0-9 and `-`. Found: `", str3));
                    }
                    List listM9576c8 = c4682aM8063h.m9576c();
                    String str6 = listM9576c8 != null ? (String) AbstractC6663m.m12744H(listM9576c8, 1) : null;
                    if (str6 == null || AbstractC4154l.m8918a(str6, "")) {
                        throw new EndpointProviderException("Invalid ARN: Expected a resource of the format `accesspoint:<accesspoint name>` but no name was provided");
                    }
                    if (AbstractC4154l.m8918a(c4682aM8063h.m9575b(), "") || !AbstractC4154l.m8918a(str, "accesspoint") || AbstractC4154l.m8918a(c4682aM8063h.m9575b(), "")) {
                        if (pa.m10814a(str6, true)) {
                            if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                                throw new EndpointProviderException("S3 MRAP does not support dual-stack");
                            }
                            if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                                throw new EndpointProviderException("S3 MRAP does not support FIPS");
                            }
                            if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                                throw new EndpointProviderException("S3 MRAP does not support S3 Accelerate");
                            }
                            if (AbstractC4154l.m8918a(c3222b.m7569c(), AbstractC8196f.m15348a(true))) {
                                throw new EndpointProviderException("Invalid configuration: Multi-Region Access Point ARNs are disabled.");
                            }
                            C4684c c4684cM8271a16 = b3.m8271a(c3222b.m7572f());
                            if (c4684cM8271a16 != null) {
                                if (!AbstractC4154l.m8918a(c4684cM8271a16.m9578b(), c4682aM8063h.f23142a)) {
                                    StringBuilder sb44 = new StringBuilder("Client was configured for partition `");
                                    sb44.append(c4684cM8271a16.m9578b());
                                    sb44.append("` but bucket referred to partition `");
                                    throw new EndpointProviderException(AbstractC0030c.m123n(sb44, c4682aM8063h.f23142a, '`'));
                                }
                                StringBuilder sbM7383p = m0.m7383p("https://", str6, ".accesspoint.s3-global.");
                                sbM7383p.append(c4684cM8271a16.m9577a());
                                C0109p c0109pM297a50 = C0108o.m297a(c0108o, sbM7383p.toString());
                                C2005c c2005cM10980f92 = ud.m10980f();
                                C2003a c2003aM1860b39 = AbstractC0644c.m1860b();
                                List listM10833h = pe.m10833h(f9.m11634h("s3", pe.m10833h("*"), AbstractC8196f.m15348a(true), 17));
                                AbstractC4154l.m8923f(c2003aM1860b39, "<this>");
                                c2005cM10980f92.mo1862b(c2003aM1860b39, listM10833h);
                                return new C0642a(c0109pM297a50, c2005cM10980f92);
                            }
                        }
                        throw new EndpointProviderException("Invalid Access Point Name");
                    }
                    List listM9576c9 = c4682aM8063h.m9576c();
                    if ((listM9576c9 != null ? (String) AbstractC6663m.m12744H(listM9576c9, 2) : null) == null) {
                        if (c3222b.m7573g() != null && AbstractC4154l.m8918a(c3222b.m7573g(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c4682aM8063h.m9575b(), String.valueOf(c3222b.m7572f()))) {
                            throw new EndpointProviderException("Invalid configuration: region from ARN `" + c4682aM8063h.m9575b() + "` does not match client region `" + c3222b.m7572f() + "` and UseArnRegion is `false`");
                        }
                        C4684c c4684cM8271a17 = b3.m8271a(c4682aM8063h.m9575b());
                        if (c4684cM8271a17 != null && (c4684cM8271a5 = b3.m8271a(c3222b.m7572f())) != null) {
                            if (!AbstractC4154l.m8918a(c4684cM8271a17.m9578b(), String.valueOf(c4684cM8271a5.m9578b()))) {
                                throw new EndpointProviderException("Client was configured for partition `" + c4684cM8271a5.m9578b() + "` but ARN (`" + c3222b.m7568b() + "`) has `" + c4684cM8271a17.m9578b() + '`');
                            }
                            boolean z10 = true;
                            if (!pa.m10814a(c4682aM8063h.m9575b(), true)) {
                                throw new EndpointProviderException("Invalid region in ARN: `" + c4682aM8063h.m9575b() + "` (invalid DNS name)");
                            }
                            if (!AbstractC4154l.m8918a(c4682aM8063h.f23143b, "s3")) {
                                throw new EndpointProviderException("Invalid ARN: The ARN was not for the S3 service, found: " + c4682aM8063h.f23143b);
                            }
                            if (!pa.m10814a(c4682aM8063h.m9574a(), false)) {
                                throw new EndpointProviderException("Invalid ARN: The account id may only contain a-z, A-Z, 0-9 and `-`. Found: `" + c4682aM8063h.m9574a() + '`');
                            }
                            if (pa.m10814a(str6, false)) {
                                if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                                    throw new EndpointProviderException("Access Points do not support S3 Accelerate");
                                }
                                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                                    if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                                        C0109p c0109pM297a51 = C0108o.m297a(c0108o, "https://" + str6 + '-' + c4682aM8063h.m9574a() + ".s3-accesspoint-fips.dualstack." + c4682aM8063h.m9575b() + '.' + c4684cM8271a17.m9577a());
                                        C2005c c2005cM10980f93 = ud.m10980f();
                                        C2003a c2003aM1860b40 = AbstractC0644c.m1860b();
                                        List listM7387t62 = m0.m7387t(17, "s3", String.valueOf(c4682aM8063h.m9575b()), true);
                                        AbstractC4154l.m8923f(c2003aM1860b40, "<this>");
                                        c2005cM10980f93.mo1862b(c2003aM1860b40, listM7387t62);
                                        return new C0642a(c0109pM297a51, c2005cM10980f93);
                                    }
                                    z10 = true;
                                }
                                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(z10)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false))) {
                                    C0109p c0109pM297a52 = C0108o.m297a(c0108o, "https://" + str6 + '-' + c4682aM8063h.m9574a() + ".s3-accesspoint-fips." + c4682aM8063h.m9575b() + '.' + c4684cM8271a17.m9577a());
                                    C2005c c2005cM10980f94 = ud.m10980f();
                                    C2003a c2003aM1860b41 = AbstractC0644c.m1860b();
                                    List listM7387t63 = m0.m7387t(17, "s3", String.valueOf(c4682aM8063h.m9575b()), true);
                                    AbstractC4154l.m8923f(c2003aM1860b41, "<this>");
                                    c2005cM10980f94.mo1862b(c2003aM1860b41, listM7387t63);
                                    return new C0642a(c0109pM297a52, c2005cM10980f94);
                                }
                                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                                    C0109p c0109pM297a53 = C0108o.m297a(c0108o, "https://" + str6 + '-' + c4682aM8063h.m9574a() + ".s3-accesspoint.dualstack." + c4682aM8063h.m9575b() + '.' + c4684cM8271a17.m9577a());
                                    C2005c c2005cM10980f95 = ud.m10980f();
                                    C2003a c2003aM1860b42 = AbstractC0644c.m1860b();
                                    List listM7387t64 = m0.m7387t(17, "s3", String.valueOf(c4682aM8063h.m9575b()), true);
                                    AbstractC4154l.m8923f(c2003aM1860b42, "<this>");
                                    c2005cM10980f95.mo1862b(c2003aM1860b42, listM7387t64);
                                    return new C0642a(c0109pM297a53, c2005cM10980f95);
                                }
                                C0945a c0945aM10815b15 = pa.m10815b(c3222b.m7571e());
                                if (c0945aM10815b15 != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null) {
                                    C0109p c0109pM297a54 = C0108o.m297a(c0108o, c0945aM10815b15.m2713d() + "://" + str6 + '-' + c4682aM8063h.m9574a() + '.' + c0945aM10815b15.m2710a() + c0945aM10815b15.m2712c());
                                    C2005c c2005cM10980f96 = ud.m10980f();
                                    C2003a c2003aM1860b43 = AbstractC0644c.m1860b();
                                    List listM7387t65 = m0.m7387t(17, "s3", String.valueOf(c4682aM8063h.m9575b()), true);
                                    AbstractC4154l.m8923f(c2003aM1860b43, "<this>");
                                    c2005cM10980f96.mo1862b(c2003aM1860b43, listM7387t65);
                                    return new C0642a(c0109pM297a54, c2005cM10980f96);
                                }
                                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false))) {
                                    C0109p c0109pM297a55 = C0108o.m297a(c0108o, "https://" + str6 + '-' + c4682aM8063h.m9574a() + ".s3-accesspoint." + c4682aM8063h.m9575b() + '.' + c4684cM8271a17.m9577a());
                                    C2005c c2005cM10980f97 = ud.m10980f();
                                    C2003a c2003aM1860b44 = AbstractC0644c.m1860b();
                                    List listM7387t66 = m0.m7387t(17, "s3", String.valueOf(c4682aM8063h.m9575b()), true);
                                    AbstractC4154l.m8923f(c2003aM1860b44, "<this>");
                                    c2005cM10980f97.mo1862b(c2003aM1860b44, listM7387t66);
                                    return new C0642a(c0109pM297a55, c2005cM10980f97);
                                }
                            }
                            throw new EndpointProviderException(a1.m14328h('`', "Invalid ARN: The access point name may only contain a-z, A-Z, 0-9 and `-`. Found: `", str6));
                        }
                    }
                    throw new EndpointProviderException("Invalid ARN: The ARN may only contain a single resource component after `accesspoint`.");
                }
                String strM10816c47 = pa.m10816c(c3222b.m7568b(), 0, 4, false);
                if (strM10816c47 != null && AbstractC4154l.m8918a(strM10816c47, "arn:") && AbstractC3504d.m8063h(c3222b.m7568b()) == null) {
                    throw new EndpointProviderException("Invalid ARN: `" + c3222b.m7568b() + "` was not a valid ARN");
                }
                if (AbstractC4154l.m8918a(bool2, AbstractC8196f.m15348a(true)) && AbstractC3504d.m8063h(c3222b.m7568b()) != null) {
                    throw new EndpointProviderException("Path-style addressing cannot be used with ARN buckets");
                }
                String strM10817d6 = pa.m10817d(c3222b.m7568b());
                if (strM10817d6 != null && (c4684cM8271a3 = b3.m8271a(c3222b.m7572f())) != null) {
                    if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(false))) {
                        if (!AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) || c3222b.m7571e() != null) {
                            z6 = true;
                        } else {
                            if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                                C0109p c0109pM297a56 = C0108o.m297a(c0108o, "https://s3-fips.dualstack.us-east-1." + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                                C2005c c2005cM10980f98 = ud.m10980f();
                                C2003a c2003aM1860b45 = AbstractC0644c.m1860b();
                                List listM7387t67 = m0.m7387t(17, "s3", "us-east-1", true);
                                AbstractC4154l.m8923f(c2003aM1860b45, "<this>");
                                c2005cM10980f98.mo1862b(c2003aM1860b45, listM7387t67);
                                return new C0642a(c0109pM297a56, c2005cM10980f98);
                            }
                            z6 = true;
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(z6)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(z6)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(z6))) {
                            C0109p c0109pM297a57 = C0108o.m297a(c0108o, "https://s3-fips.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f99 = ud.m10980f();
                            C2003a c2003aM1860b46 = AbstractC0644c.m1860b();
                            List listM7387t68 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b46, "<this>");
                            c2005cM10980f99.mo1862b(c2003aM1860b46, listM7387t68);
                            return new C0642a(c0109pM297a57, c2005cM10980f99);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a58 = C0108o.m297a(c0108o, "https://s3-fips.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f100 = ud.m10980f();
                            C2003a c2003aM1860b47 = AbstractC0644c.m1860b();
                            List listM7387t69 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b47, "<this>");
                            c2005cM10980f100.mo1862b(c2003aM1860b47, listM7387t69);
                            return new C0642a(c0109pM297a58, c2005cM10980f100);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a59 = C0108o.m297a(c0108o, "https://s3-fips.us-east-1." + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f101 = ud.m10980f();
                            C2003a c2003aM1860b48 = AbstractC0644c.m1860b();
                            List listM7387t70 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b48, "<this>");
                            c2005cM10980f101.mo1862b(c2003aM1860b48, listM7387t70);
                            return new C0642a(c0109pM297a59, c2005cM10980f101);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            C0109p c0109pM297a60 = C0108o.m297a(c0108o, "https://s3-fips." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f102 = ud.m10980f();
                            C2003a c2003aM1860b49 = AbstractC0644c.m1860b();
                            List listM7387t71 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b49, "<this>");
                            c2005cM10980f102.mo1862b(c2003aM1860b49, listM7387t71);
                            return new C0642a(c0109pM297a60, c2005cM10980f102);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a61 = C0108o.m297a(c0108o, "https://s3-fips." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f103 = ud.m10980f();
                            C2003a c2003aM1860b50 = AbstractC0644c.m1860b();
                            List listM7387t72 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b50, "<this>");
                            c2005cM10980f103.mo1862b(c2003aM1860b50, listM7387t72);
                            return new C0642a(c0109pM297a61, c2005cM10980f103);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a62 = C0108o.m297a(c0108o, "https://s3.dualstack.us-east-1." + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f104 = ud.m10980f();
                            C2003a c2003aM1860b51 = AbstractC0644c.m1860b();
                            List listM7387t73 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b51, "<this>");
                            c2005cM10980f104.mo1862b(c2003aM1860b51, listM7387t73);
                            return new C0642a(c0109pM297a62, c2005cM10980f104);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            C0109p c0109pM297a63 = C0108o.m297a(c0108o, "https://s3.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f105 = ud.m10980f();
                            C2003a c2003aM1860b52 = AbstractC0644c.m1860b();
                            List listM7387t74 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b52, "<this>");
                            c2005cM10980f105.mo1862b(c2003aM1860b52, listM7387t74);
                            return new C0642a(c0109pM297a63, c2005cM10980f105);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a64 = C0108o.m297a(c0108o, "https://s3.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f106 = ud.m10980f();
                            C2003a c2003aM1860b53 = AbstractC0644c.m1860b();
                            List listM7387t75 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b53, "<this>");
                            c2005cM10980f106.mo1862b(c2003aM1860b53, listM7387t75);
                            return new C0642a(c0109pM297a64, c2005cM10980f106);
                        }
                        C0945a c0945aM10815b16 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b16 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a65 = C0108o.m297a(c0108o, c0945aM10815b16.m2713d() + "://" + c0945aM10815b16.m2710a() + c0945aM10815b16.m2711b() + strM10817d6);
                            C2005c c2005cM10980f107 = ud.m10980f();
                            C2003a c2003aM1860b54 = AbstractC0644c.m1860b();
                            List listM7387t76 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b54, "<this>");
                            c2005cM10980f107.mo1862b(c2003aM1860b54, listM7387t76);
                            return new C0642a(c0109pM297a65, c2005cM10980f107);
                        }
                        C0945a c0945aM10815b17 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b17 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                                C0109p c0109pM297a66 = C0108o.m297a(c0108o, c0945aM10815b17.m2713d() + "://" + c0945aM10815b17.m2710a() + c0945aM10815b17.m2711b() + strM10817d6);
                                C2005c c2005cM10980f108 = ud.m10980f();
                                C2003a c2003aM1860b55 = AbstractC0644c.m1860b();
                                List listM7387t77 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                                AbstractC4154l.m8923f(c2003aM1860b55, "<this>");
                                c2005cM10980f108.mo1862b(c2003aM1860b55, listM7387t77);
                                return new C0642a(c0109pM297a66, c2005cM10980f108);
                            }
                            C0109p c0109pM297a67 = C0108o.m297a(c0108o, c0945aM10815b17.m2713d() + "://" + c0945aM10815b17.m2710a() + c0945aM10815b17.m2711b() + strM10817d6);
                            C2005c c2005cM10980f109 = ud.m10980f();
                            C2003a c2003aM1860b56 = AbstractC0644c.m1860b();
                            List listM7387t78 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b56, "<this>");
                            c2005cM10980f109.mo1862b(c2003aM1860b56, listM7387t78);
                            return new C0642a(c0109pM297a67, c2005cM10980f109);
                        }
                        C0945a c0945aM10815b18 = pa.m10815b(c3222b.m7571e());
                        if (c0945aM10815b18 != null && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a68 = C0108o.m297a(c0108o, c0945aM10815b18.m2713d() + "://" + c0945aM10815b18.m2710a() + c0945aM10815b18.m2711b() + strM10817d6);
                            C2005c c2005cM10980f110 = ud.m10980f();
                            C2003a c2003aM1860b57 = AbstractC0644c.m1860b();
                            List listM7387t79 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b57, "<this>");
                            c2005cM10980f110.mo1862b(c2003aM1860b57, listM7387t79);
                            return new C0642a(c0109pM297a68, c2005cM10980f110);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a69 = C0108o.m297a(c0108o, "https://s3." + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f111 = ud.m10980f();
                            C2003a c2003aM1860b58 = AbstractC0644c.m1860b();
                            List listM7387t80 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b58, "<this>");
                            c2005cM10980f111.mo1862b(c2003aM1860b58, listM7387t80);
                            return new C0642a(c0109pM297a69, c2005cM10980f111);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                            if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                                C0109p c0109pM297a70 = C0108o.m297a(c0108o, "https://s3." + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                                C2005c c2005cM10980f112 = ud.m10980f();
                                C2003a c2003aM1860b59 = AbstractC0644c.m1860b();
                                List listM7387t81 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                                AbstractC4154l.m8923f(c2003aM1860b59, "<this>");
                                c2005cM10980f112.mo1862b(c2003aM1860b59, listM7387t81);
                                return new C0642a(c0109pM297a70, c2005cM10980f112);
                            }
                            C0109p c0109pM297a71 = C0108o.m297a(c0108o, "https://s3." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f113 = ud.m10980f();
                            C2003a c2003aM1860b60 = AbstractC0644c.m1860b();
                            List listM7387t82 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b60, "<this>");
                            c2005cM10980f113.mo1862b(c2003aM1860b60, listM7387t82);
                            return new C0642a(c0109pM297a71, c2005cM10980f113);
                        }
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                            C0109p c0109pM297a72 = C0108o.m297a(c0108o, "https://s3." + c3222b.m7572f() + '.' + c4684cM8271a3.m9577a() + '/' + strM10817d6);
                            C2005c c2005cM10980f114 = ud.m10980f();
                            C2003a c2003aM1860b61 = AbstractC0644c.m1860b();
                            List listM7387t83 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b61, "<this>");
                            c2005cM10980f114.mo1862b(c2003aM1860b61, listM7387t83);
                            return new C0642a(c0109pM297a72, c2005cM10980f114);
                        }
                    }
                    throw new EndpointProviderException("Path-style addressing cannot be used with S3 Accelerate");
                }
            }
            Boolean bool4 = c3222b.f17387n;
            if (bool4 != null && AbstractC4154l.m8918a(bool4, AbstractC8196f.m15348a(true)) && (c4684cM8271a2 = b3.m8271a(c3222b.m7572f())) != null) {
                if (!pa.m10814a(c3222b.m7572f(), true)) {
                    throw new EndpointProviderException("Invalid region: region was not a valid DNS name.");
                }
                if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true))) {
                    throw new EndpointProviderException("S3 Object Lambda does not support Dual-stack");
                }
                if (AbstractC4154l.m8918a(c3222b.m7567a(), AbstractC8196f.m15348a(true))) {
                    throw new EndpointProviderException("S3 Object Lambda does not support S3 Accelerate");
                }
                C0945a c0945aM10815b19 = pa.m10815b(c3222b.m7571e());
                if (c0945aM10815b19 != null && c3222b.m7571e() != null) {
                    C0109p c0109pM297a73 = C0108o.m297a(c0108o, c0945aM10815b19.m2713d() + "://" + c0945aM10815b19.m2710a() + c0945aM10815b19.m2712c());
                    C2005c c2005cM10980f115 = ud.m10980f();
                    C2003a c2003aM1860b62 = AbstractC0644c.m1860b();
                    List listM7387t84 = m0.m7387t(17, "s3-object-lambda", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM1860b62, "<this>");
                    c2005cM10980f115.mo1862b(c2003aM1860b62, listM7387t84);
                    return new C0642a(c0109pM297a73, c2005cM10980f115);
                }
                if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                    C0109p c0109pM297a74 = C0108o.m297a(c0108o, "https://s3-object-lambda-fips." + c3222b.m7572f() + '.' + c4684cM8271a2.m9577a());
                    C2005c c2005cM10980f116 = ud.m10980f();
                    C2003a c2003aM1860b63 = AbstractC0644c.m1860b();
                    List listM7387t85 = m0.m7387t(17, "s3-object-lambda", String.valueOf(c3222b.m7572f()), true);
                    AbstractC4154l.m8923f(c2003aM1860b63, "<this>");
                    c2005cM10980f116.mo1862b(c2003aM1860b63, listM7387t85);
                    return new C0642a(c0109pM297a74, c2005cM10980f116);
                }
                C0109p c0109pM297a75 = C0108o.m297a(c0108o, "https://s3-object-lambda." + c3222b.m7572f() + '.' + c4684cM8271a2.m9577a());
                C2005c c2005cM10980f117 = ud.m10980f();
                C2003a c2003aM1860b64 = AbstractC0644c.m1860b();
                List listM7387t86 = m0.m7387t(17, "s3-object-lambda", String.valueOf(c3222b.m7572f()), true);
                AbstractC4154l.m8923f(c2003aM1860b64, "<this>");
                c2005cM10980f117.mo1862b(c2003aM1860b64, listM7387t86);
                return new C0642a(c0109pM297a75, c2005cM10980f117);
            }
            if (c3222b.m7568b() == null && (c4684cM8271a = b3.m8271a(c3222b.m7572f())) != null) {
                boolean z11 = true;
                if (pa.m10814a(c3222b.m7572f(), true)) {
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true))) {
                        if (AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                            C0109p c0109pM297a76 = C0108o.m297a(c0108o, "https://s3-fips.dualstack.us-east-1." + c4684cM8271a.m9577a());
                            C2005c c2005cM10980f118 = ud.m10980f();
                            C2003a c2003aM1860b65 = AbstractC0644c.m1860b();
                            List listM7387t87 = m0.m7387t(17, "s3", "us-east-1", true);
                            AbstractC4154l.m8923f(c2003aM1860b65, "<this>");
                            c2005cM10980f118.mo1862b(c2003aM1860b65, listM7387t87);
                            return new C0642a(c0109pM297a76, c2005cM10980f118);
                        }
                        z11 = true;
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(z11)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(z11)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(z11))) {
                        C0109p c0109pM297a77 = C0108o.m297a(c0108o, "https://s3-fips.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f119 = ud.m10980f();
                        C2003a c2003aM1860b66 = AbstractC0644c.m1860b();
                        List listM7387t88 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b66, "<this>");
                        c2005cM10980f119.mo1862b(c2003aM1860b66, listM7387t88);
                        return new C0642a(c0109pM297a77, c2005cM10980f119);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                        C0109p c0109pM297a78 = C0108o.m297a(c0108o, "https://s3-fips.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f120 = ud.m10980f();
                        C2003a c2003aM1860b67 = AbstractC0644c.m1860b();
                        List listM7387t89 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b67, "<this>");
                        c2005cM10980f120.mo1862b(c2003aM1860b67, listM7387t89);
                        return new C0642a(c0109pM297a78, c2005cM10980f120);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                        C0109p c0109pM297a79 = C0108o.m297a(c0108o, "https://s3-fips.us-east-1." + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f121 = ud.m10980f();
                        C2003a c2003aM1860b68 = AbstractC0644c.m1860b();
                        List listM7387t90 = m0.m7387t(17, "s3", "us-east-1", true);
                        AbstractC4154l.m8923f(c2003aM1860b68, "<this>");
                        c2005cM10980f121.mo1862b(c2003aM1860b68, listM7387t90);
                        return new C0642a(c0109pM297a79, c2005cM10980f121);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                        C0109p c0109pM297a80 = C0108o.m297a(c0108o, "https://s3-fips." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f122 = ud.m10980f();
                        C2003a c2003aM1860b69 = AbstractC0644c.m1860b();
                        List listM7387t91 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b69, "<this>");
                        c2005cM10980f122.mo1862b(c2003aM1860b69, listM7387t91);
                        return new C0642a(c0109pM297a80, c2005cM10980f122);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(true)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                        C0109p c0109pM297a81 = C0108o.m297a(c0108o, "https://s3-fips." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f123 = ud.m10980f();
                        C2003a c2003aM1860b70 = AbstractC0644c.m1860b();
                        List listM7387t92 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b70, "<this>");
                        c2005cM10980f123.mo1862b(c2003aM1860b70, listM7387t92);
                        return new C0642a(c0109pM297a81, c2005cM10980f123);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                        C0109p c0109pM297a82 = C0108o.m297a(c0108o, "https://s3.dualstack.us-east-1." + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f124 = ud.m10980f();
                        C2003a c2003aM1860b71 = AbstractC0644c.m1860b();
                        List listM7387t93 = m0.m7387t(17, "s3", "us-east-1", true);
                        AbstractC4154l.m8923f(c2003aM1860b71, "<this>");
                        c2005cM10980f124.mo1862b(c2003aM1860b71, listM7387t93);
                        return new C0642a(c0109pM297a82, c2005cM10980f124);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                        C0109p c0109pM297a83 = C0108o.m297a(c0108o, "https://s3.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f125 = ud.m10980f();
                        C2003a c2003aM1860b72 = AbstractC0644c.m1860b();
                        List listM7387t94 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b72, "<this>");
                        c2005cM10980f125.mo1862b(c2003aM1860b72, listM7387t94);
                        return new C0642a(c0109pM297a83, c2005cM10980f125);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(true)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                        C0109p c0109pM297a84 = C0108o.m297a(c0108o, "https://s3.dualstack." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f126 = ud.m10980f();
                        C2003a c2003aM1860b73 = AbstractC0644c.m1860b();
                        List listM7387t95 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b73, "<this>");
                        c2005cM10980f126.mo1862b(c2003aM1860b73, listM7387t95);
                        return new C0642a(c0109pM297a84, c2005cM10980f126);
                    }
                    C0945a c0945aM10815b20 = pa.m10815b(c3222b.m7571e());
                    if (c0945aM10815b20 != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                        C0109p c0109pM297a85 = C0108o.m297a(c0108o, c0945aM10815b20.m2713d() + "://" + c0945aM10815b20.m2710a() + c0945aM10815b20.m2712c());
                        C2005c c2005cM10980f127 = ud.m10980f();
                        C2003a c2003aM1860b74 = AbstractC0644c.m1860b();
                        List listM7387t96 = m0.m7387t(17, "s3", "us-east-1", true);
                        AbstractC4154l.m8923f(c2003aM1860b74, "<this>");
                        c2005cM10980f127.mo1862b(c2003aM1860b74, listM7387t96);
                        return new C0642a(c0109pM297a85, c2005cM10980f127);
                    }
                    C0945a c0945aM10815b21 = pa.m10815b(c3222b.m7571e());
                    if (c0945aM10815b21 != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                        if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                            C0109p c0109pM297a86 = C0108o.m297a(c0108o, c0945aM10815b21.m2713d() + "://" + c0945aM10815b21.m2710a() + c0945aM10815b21.m2712c());
                            C2005c c2005cM10980f128 = ud.m10980f();
                            C2003a c2003aM1860b75 = AbstractC0644c.m1860b();
                            List listM7387t97 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b75, "<this>");
                            c2005cM10980f128.mo1862b(c2003aM1860b75, listM7387t97);
                            return new C0642a(c0109pM297a86, c2005cM10980f128);
                        }
                        C0109p c0109pM297a87 = C0108o.m297a(c0108o, c0945aM10815b21.m2713d() + "://" + c0945aM10815b21.m2710a() + c0945aM10815b21.m2712c());
                        C2005c c2005cM10980f129 = ud.m10980f();
                        C2003a c2003aM1860b76 = AbstractC0644c.m1860b();
                        List listM7387t98 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b76, "<this>");
                        c2005cM10980f129.mo1862b(c2003aM1860b76, listM7387t98);
                        return new C0642a(c0109pM297a87, c2005cM10980f129);
                    }
                    C0945a c0945aM10815b22 = pa.m10815b(c3222b.m7571e());
                    if (c0945aM10815b22 != null && AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() != null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                        C0109p c0109pM297a88 = C0108o.m297a(c0108o, c0945aM10815b22.m2713d() + "://" + c0945aM10815b22.m2710a() + c0945aM10815b22.m2712c());
                        C2005c c2005cM10980f130 = ud.m10980f();
                        C2003a c2003aM1860b77 = AbstractC0644c.m1860b();
                        List listM7387t99 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b77, "<this>");
                        c2005cM10980f130.mo1862b(c2003aM1860b77, listM7387t99);
                        return new C0642a(c0109pM297a88, c2005cM10980f130);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global")) {
                        C0109p c0109pM297a89 = C0108o.m297a(c0108o, "https://s3." + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f131 = ud.m10980f();
                        C2003a c2003aM1860b78 = AbstractC0644c.m1860b();
                        List listM7387t100 = m0.m7387t(17, "s3", "us-east-1", true);
                        AbstractC4154l.m8923f(c2003aM1860b78, "<this>");
                        c2005cM10980f131.mo1862b(c2003aM1860b78, listM7387t100);
                        return new C0642a(c0109pM297a89, c2005cM10980f131);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(true))) {
                        if (AbstractC4154l.m8918a(c3222b.m7572f(), "us-east-1")) {
                            C0109p c0109pM297a90 = C0108o.m297a(c0108o, "https://s3." + c4684cM8271a.m9577a());
                            C2005c c2005cM10980f132 = ud.m10980f();
                            C2003a c2003aM1860b79 = AbstractC0644c.m1860b();
                            List listM7387t101 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                            AbstractC4154l.m8923f(c2003aM1860b79, "<this>");
                            c2005cM10980f132.mo1862b(c2003aM1860b79, listM7387t101);
                            return new C0642a(c0109pM297a90, c2005cM10980f132);
                        }
                        C0109p c0109pM297a91 = C0108o.m297a(c0108o, "https://s3." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f133 = ud.m10980f();
                        C2003a c2003aM1860b80 = AbstractC0644c.m1860b();
                        List listM7387t102 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b80, "<this>");
                        c2005cM10980f133.mo1862b(c2003aM1860b80, listM7387t102);
                        return new C0642a(c0109pM297a91, c2005cM10980f133);
                    }
                    if (AbstractC4154l.m8918a(c3222b.m7575i(), AbstractC8196f.m15348a(false)) && AbstractC4154l.m8918a(c3222b.m7574h(), AbstractC8196f.m15348a(false)) && c3222b.m7571e() == null && !AbstractC4154l.m8918a(c3222b.m7572f(), "aws-global") && AbstractC4154l.m8918a(c3222b.m7576j(), AbstractC8196f.m15348a(false))) {
                        C0109p c0109pM297a92 = C0108o.m297a(c0108o, "https://s3." + c3222b.m7572f() + '.' + c4684cM8271a.m9577a());
                        C2005c c2005cM10980f134 = ud.m10980f();
                        C2003a c2003aM1860b81 = AbstractC0644c.m1860b();
                        List listM7387t103 = m0.m7387t(17, "s3", String.valueOf(c3222b.m7572f()), true);
                        AbstractC4154l.m8923f(c2003aM1860b81, "<this>");
                        c2005cM10980f134.mo1862b(c2003aM1860b81, listM7387t103);
                        return new C0642a(c0109pM297a92, c2005cM10980f134);
                    }
                }
                throw new EndpointProviderException("Invalid region: region was not a valid DNS name.");
            }
        }
        throw new EndpointProviderException("A region must be set when sending requests to S3.");
    }

    /* renamed from: o */
    public static C1894c m10005o(d1 d1Var, e0 e0Var) {
        boolean z6;
        boolean z10;
        InterfaceC2415e interfaceC2415eM16460d;
        C8986c c8986c = new C8986c(12, e0Var);
        List list = (List) d1Var.f5068c;
        e0Var.mo7326i();
        u1.m10942a("ResolvedFeatureGroup");
        Set set = (Set) d1Var.f5071f;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List<b2> list2 = (List) d1Var.f5069d;
        if (set.isEmpty() && list.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((b2) it.next()) instanceof v0) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        } else {
            z6 = false;
        }
        if (list2 == null || !list2.isEmpty()) {
            for (b2 b2Var : list2) {
                if ((b2Var instanceof k1) || C4612f.m9481B(b2Var)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                b2 b2Var2 = (b2) it2.next();
                EnumC1898g.Companion.getClass();
                if (C1896e.m5515a(b2Var2) == EnumC1898g.UNDEFINED) {
                    interfaceC2415eM16460d = new C2413c(b2Var2);
                    break;
                }
            } else {
                Iterator it3 = set.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        AbstractC1545b abstractC1545b = (AbstractC1545b) it3.next();
                        if (abstractC1545b instanceof C2169d) {
                            if (!z6) {
                                interfaceC2415eM16460d = new C2414d(EnumC1898g.IMAGE_CAPTURE.toString(), abstractC1545b);
                                break;
                            }
                        } else if ((abstractC1545b instanceof C2166a) || (abstractC1545b instanceof C2168c) || (abstractC1545b instanceof C2171f)) {
                            if (!z10) {
                                interfaceC2415eM16460d = new C2414d(EnumC1898g.PREVIEW + " or " + EnumC1898g.VIDEO_CAPTURE, abstractC1545b);
                                break;
                            }
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((AbstractC1545b) obj) instanceof C2169d ? z6 : true) {
                                arrayList.add(obj);
                            }
                        }
                        interfaceC2415eM16460d = c8986c.m16460d(d1Var, arrayList, 0, C6668r.f31943a);
                    }
                }
            }
        }
        if (interfaceC2415eM16460d instanceof C2411a) {
            C1894c c1894c = ((C2411a) interfaceC2415eM16460d).f10902a;
            c1894c.toString();
            u1.m10942a("ResolvedFeatureGroup");
            return c1894c;
        }
        if (interfaceC2415eM16460d instanceof C2412b) {
            throw new IllegalArgumentException("Feature group is not supported");
        }
        if (interfaceC2415eM16460d instanceof C2413c) {
            throw new IllegalArgumentException(((C2413c) interfaceC2415eM16460d).f10904a + " is not supported");
        }
        if (!(interfaceC2415eM16460d instanceof C2414d)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder();
        C2414d c2414d = (C2414d) interfaceC2415eM16460d;
        sb2.append(c2414d.f10905a);
        sb2.append(" must be added for ");
        sb2.append(c2414d.f10906b);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // fe.InterfaceC2281e
    /* renamed from: a */
    public boolean mo59a() {
        return true;
    }

    @Override // k4.InterfaceC4004y
    /* renamed from: b */
    public Typeface mo8782b(C3998s c3998s, int i10) {
        return m9999i(null, c3998s, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // k4.InterfaceC4004y
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface mo8783c(k4.C4000u r5, k4.C3998s r6, int r7) {
        /*
            r4 = this;
            r5.getClass()
            int r5 = r6.f20701a
            int r5 = r5 / 100
            java.lang.String r0 = "sans-serif"
            r1 = 2
            if (r5 < 0) goto L11
            if (r5 >= r1) goto L11
            java.lang.String r5 = "sans-serif-thin"
            goto L33
        L11:
            r2 = 4
            if (r1 > r5) goto L19
            if (r5 >= r2) goto L19
            java.lang.String r5 = "sans-serif-light"
            goto L33
        L19:
            if (r5 != r2) goto L1d
        L1b:
            r5 = r0
            goto L33
        L1d:
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.String r5 = "sans-serif-medium"
            goto L33
        L23:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L2b
            if (r5 >= r2) goto L2b
            goto L1b
        L2b:
            if (r2 > r5) goto L1b
            r1 = 11
            if (r5 >= r1) goto L1b
            java.lang.String r5 = "sans-serif-black"
        L33:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L3b
            goto L5a
        L3b:
            android.graphics.Typeface r5 = m9999i(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = pg.u8.m11885a(r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r1)
            if (r1 != 0) goto L5a
            android.graphics.Typeface r1 = m9999i(r2, r6, r7)
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r1)
            if (r1 != 0) goto L5a
            r2 = r5
        L5a:
            if (r2 != 0) goto L61
            android.graphics.Typeface r5 = m9999i(r0, r6, r7)
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C5070u.mo8783c(k4.u, k4.s, int):android.graphics.Typeface");
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        switch (this.f24866a) {
            case 3:
                C0074a input = (C0074a) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input, "input");
                C7117b c7117b = new C7117b();
                c7117b.m13402b(jc.e0.POST);
                j4 j4Var = c7117b.f34311b.f361d;
                j4Var.getClass();
                j4Var.m3398p("/");
                C7985s c7985s = new C7985s();
                C2566d c2566d = new C2566d(c7985s, "");
                C2271i c2271i = new C2271i(C2274l.f10287e, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("DurationSeconds")}), 0);
                C2274l c2274l = C2274l.f10291i;
                C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("ExternalId")}), 0);
                C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("Policy")}), 0);
                C2274l c2274l2 = C2274l.f10288f;
                C2271i c2271i4 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("PolicyArns")}), 0);
                C2271i c2271i5 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("ProvidedContexts")}), 0);
                C2271i c2271i6 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("RoleArn")}), 0);
                C2271i c2271i7 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("RoleSessionName")}), 0);
                C2271i c2271i8 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("SerialNumber")}), 0);
                C2271i c2271i9 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("SourceIdentity")}), 0);
                C2271i c2271i10 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("Tags")}), 0);
                C2271i c2271i11 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("TokenCode")}), 0);
                C2271i c2271i12 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("TransitiveTagKeys")}), 0);
                C8849i c8849i = new C8849i(4);
                C2565c c2565c = new C2565c("AssumeRoleRequest");
                LinkedHashSet linkedHashSet = (LinkedHashSet) c8849i.f42584c;
                linkedHashSet.add(c2565c);
                linkedHashSet.add(new C2568f("Action", "AssumeRole"));
                linkedHashSet.add(new C2568f("Version", "2011-06-15"));
                c8849i.m16319q(c2271i);
                c8849i.m16319q(c2271i2);
                c8849i.m16319q(c2271i3);
                c8849i.m16319q(c2271i4);
                c8849i.m16319q(c2271i5);
                c8849i.m16319q(c2271i6);
                c8849i.m16319q(c2271i7);
                c8849i.m16319q(c2271i8);
                c8849i.m16319q(c2271i9);
                c8849i.m16319q(c2271i10);
                c8849i.m16319q(c2271i11);
                c8849i.m16319q(c2271i12);
                InterfaceC2276n interfaceC2276nMo5962b = c2566d.mo5962b(new C2272j(c8849i));
                Integer num = input.f269a;
                if (num != null) {
                    C0910e c0910e = (C0910e) interfaceC2276nMo5962b;
                    c0910e.m2593L(c2271i, new C2567e(c0910e, num.intValue(), 0));
                }
                String str = input.f270b;
                if (str != null) {
                    ((C0910e) interfaceC2276nMo5962b).mo2596d(c2271i2, str);
                }
                if (input.f271c != null) {
                    ((C0910e) interfaceC2276nMo5962b).m2583A(c2271i4, new C0633c(input, 1));
                }
                String str2 = input.f272d;
                if (str2 != null) {
                    ((C0910e) interfaceC2276nMo5962b).mo2596d(c2271i6, str2);
                }
                String str3 = input.f273e;
                if (str3 != null) {
                    ((C0910e) interfaceC2276nMo5962b).mo2596d(c2271i7, str3);
                }
                if (input.f274f != null) {
                    ((C0910e) interfaceC2276nMo5962b).m2583A(c2271i10, new C0633c(input, 0));
                }
                byte[] bArrMo15148v = c7985s.mo15148v();
                AbstractC3745u.Companion.getClass();
                c7117b.f34313d = C3742r.m8277a(bArrMo15148v);
                c7117b.f34312c.m320H("application/x-www-form-urlencoded");
                return c7117b;
            case 9:
                eb.m0 input2 = (eb.m0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input2, "input");
                C7117b c7117b2 = new C7117b();
                c7117b2.m13402b(jc.e0.POST);
                C2897i c2897iM14325e = a1.m14325e(c7117b2.f34311b.f361d, "/");
                C2271i c2271i13 = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i14 = new C2271i(C2274l.f10285c, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Credential")}), 0);
                ArrayList arrayList = new ArrayList();
                c2271i13.f10279b = a1.m14322b(arrayList);
                arrayList.add(c2271i13);
                c2271i14.f10279b = arrayList.size();
                arrayList.add(c2271i14);
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
                String str4 = input2.f9364a;
                if (str4 != null) {
                    c2897iM14325e.mo2596d(c2271i13, str4);
                }
                AbstractC2887j abstractC2887j = input2.f9365b;
                if (abstractC2887j != null) {
                    c2893e.m7014h(AbstractC5933n.m11794b(c2271i14));
                    c2897iM14325e.m7022l(abstractC2887j);
                }
                c2897iM14325e.mo2598f();
                byte[] bArrM7012f = c2893e.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b2.f34313d = C3742r.m8277a(bArrM7012f);
                c7117b2.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b2;
            case 10:
                q1 input3 = (q1) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input3, "input");
                C7117b c7117b3 = new C7117b();
                c7117b3.m13402b(jc.e0.POST);
                C2897i c2897iM14325e2 = a1.m14325e(c7117b3.f34311b.f361d, "/");
                C2274l c2274l3 = C2274l.f10291i;
                C2271i c2271i15 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i16 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("DeviceKey")}), 0);
                ArrayList arrayList3 = new ArrayList();
                c2271i15.f10279b = a1.m14322b(arrayList3);
                arrayList3.add(c2271i15);
                c2271i16.f10279b = arrayList3.size();
                arrayList3.add(c2271i16);
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
                String str5 = input3.f9421a;
                if (str5 != null) {
                    c2897iM14325e2.mo2596d(c2271i15, str5);
                }
                String str6 = input3.f9422b;
                if (str6 != null) {
                    c2897iM14325e2.mo2596d(c2271i16, str6);
                }
                c2897iM14325e2.mo2598f();
                byte[] bArrM7012f2 = c2893e2.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b3.f34313d = C3742r.m8277a(bArrM7012f2);
                c7117b3.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b3;
            case 11:
                h2 input4 = (h2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input4, "input");
                C7117b c7117b4 = new C7117b();
                c7117b4.m13402b(jc.e0.POST);
                C2897i c2897iM14325e3 = a1.m14325e(c7117b4.f34311b.f361d, "/");
                C2274l c2274l4 = C2274l.f10291i;
                C2271i c2271i17 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i18 = new C2271i(C2274l.f10287e, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Limit")}), 0);
                C2271i c2271i19 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("PaginationToken")}), 0);
                ArrayList arrayList5 = new ArrayList();
                c2271i17.f10279b = a1.m14322b(arrayList5);
                arrayList5.add(c2271i17);
                c2271i18.f10279b = arrayList5.size();
                arrayList5.add(c2271i18);
                c2271i19.f10279b = arrayList5.size();
                arrayList5.add(c2271i19);
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
                String str7 = input4.f9325a;
                if (str7 != null) {
                    c2897iM14325e3.mo2596d(c2271i17, str7);
                }
                c2897iM14325e3.mo2598f();
                byte[] bArrM7012f3 = c2893e3.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b4.f34313d = C3742r.m8277a(bArrM7012f3);
                c7117b4.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b4;
            case 12:
                x2 input5 = (x2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input5, "input");
                ArrayList arrayList7 = input5.f9516i;
                ArrayList arrayList8 = input5.f9513f;
                Map map = input5.f9510c;
                C7117b c7117b5 = new C7117b();
                c7117b5.m13402b(jc.e0.POST);
                C2897i c2897iM14325e4 = a1.m14325e(c7117b5.f34311b.f361d, "/");
                C2274l c2274l5 = C2274l.f10292j;
                C2271i c2271i20 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AnalyticsMetadata")}), 0);
                C2274l c2274l6 = C2274l.f10291i;
                C2271i c2271i21 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientId")}), 0);
                C2271i c2271i22 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientMetadata")}), 0);
                C2271i c2271i23 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Password")}), 0);
                C2271i c2271i24 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SecretHash")}), 0);
                C2274l c2274l7 = C2274l.f10288f;
                C2271i c2271i25 = new C2271i(c2274l7, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserAttributes")}), 0);
                C2271i c2271i26 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserContextData")}), 0);
                C2271i c2271i27 = new C2271i(c2274l6, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Username")}), 0);
                C2271i c2271i28 = new C2271i(c2274l7, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ValidationData")}), 0);
                C8849i c8849i2 = new C8849i(4);
                c8849i2.m16319q(c2271i20);
                c8849i2.m16319q(c2271i21);
                c8849i2.m16319q(c2271i22);
                c8849i2.m16319q(c2271i23);
                c8849i2.m16319q(c2271i24);
                c8849i2.m16319q(c2271i25);
                c8849i2.m16319q(c2271i26);
                c8849i2.m16319q(c2271i27);
                c8849i2.m16319q(c2271i28);
                LinkedHashSet traits = (LinkedHashSet) c8849i2.f42584c;
                AbstractC4154l.m8923f(traits, "traits");
                C2893e c2893e4 = c2897iM14325e4.f15931a;
                c2893e4.getClass();
                EnumC2908t enumC2908t4 = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e4.m7010d("{");
                if (c2893e4.f15922a) {
                    ((StringBuilder) c2893e4.f15924c).append('\n');
                }
                c2893e4.f15923b++;
                ArrayList arrayList9 = (ArrayList) c2893e4.f15925d;
                AbstractC4154l.m8923f(arrayList9, "<this>");
                arrayList9.add(enumC2908t4);
                C1978b c1978b = input5.f9508a;
                if (c1978b != null) {
                    ff.m10654b(c2897iM14325e4, c2271i20, c1978b, C2246t.f10232a);
                }
                String str8 = input5.f9509b;
                if (str8 != null) {
                    c2897iM14325e4.mo2596d(c2271i21, str8);
                }
                if (map != null) {
                    c2893e4.m7014h(AbstractC5933n.m11794b(c2271i22));
                    c2897iM14325e4.m7019i(c2271i22);
                    for (Map.Entry entry : map.entrySet()) {
                        c2897iM14325e4.mo5960h((String) entry.getKey(), (String) entry.getValue());
                    }
                    c2897iM14325e4.m7021k();
                }
                String str9 = input5.f9511d;
                if (str9 != null) {
                    c2897iM14325e4.mo2596d(c2271i23, str9);
                }
                String str10 = input5.f9512e;
                if (str10 != null) {
                    c2897iM14325e4.mo2596d(c2271i24, str10);
                }
                if (arrayList8 != null) {
                    c2893e4.m7014h(AbstractC5933n.m11794b(c2271i25));
                    c2897iM14325e4.m7018g(c2271i25);
                    int size = arrayList8.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList8.get(i10);
                        i10++;
                        c2897iM14325e4.mo5961a(new C2273k((C1984h) obj2, C2247u.f10233a));
                    }
                    c2897iM14325e4.m7020j();
                }
                l3 l3Var = input5.f9514g;
                if (l3Var != null) {
                    ff.m10654b(c2897iM14325e4, c2271i26, l3Var, C2248v.f10234a);
                }
                String str11 = input5.f9515h;
                if (str11 != null) {
                    c2897iM14325e4.mo2596d(c2271i27, str11);
                }
                if (arrayList7 != null) {
                    c2893e4.m7014h(AbstractC5933n.m11794b(c2271i28));
                    c2897iM14325e4.m7018g(c2271i28);
                    int size2 = arrayList7.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayList7.get(i11);
                        i11++;
                        c2897iM14325e4.mo5961a(new C2273k((C1984h) obj3, C2249w.f10235a));
                    }
                    c2897iM14325e4.m7020j();
                }
                c2897iM14325e4.mo2598f();
                byte[] bArrM7012f4 = c2893e4.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b5.f34313d = C3742r.m8277a(bArrM7012f4);
                c7117b5.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b5;
            default:
                mb.e0 input6 = (mb.e0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input6, "input");
                C7117b c7117b6 = new C7117b();
                c7117b6.m13402b(jc.e0.DELETE);
                String str12 = input6.f23231b;
                if (str12 == null) {
                    throw new IllegalArgumentException("key is bound to the URI and must not be null");
                }
                C0104k c0104k = c7117b6.f34311b;
                j4 j4Var2 = c0104k.f361d;
                C0100g c0100g = c0104k.f362e;
                C2259g encodedSegments = (C2259g) j4Var2.f6253d;
                AbstractC4154l.m8923f(encodedSegments, "$this$encodedSegments");
                Iterator it = AbstractC5178p.m10112W(str12, new String[]{"/"}, 6).iterator();
                while (it.hasNext()) {
                    encodedSegments.add(C6813g.f32363m.m12988d((String) it.next()));
                }
                c0100g.f351c.mo266g("DeleteObject", "x-id");
                c0100g.m267h(C6813g.f32363m, new C4833a(11, input6));
                return c7117b6;
        }
    }

    @Override // ud.InterfaceC7403g
    /* renamed from: e */
    public Object mo1988e(InterfaceC2139c interfaceC2139c) {
        C1690h c1690h = new C1690h();
        int i10 = C5770a.f28335d;
        c1690h.f8271a = bb.m10551g(10, EnumC5772c.MILLISECONDS);
        c1690h.f8272b = 1.5d;
        c1690h.f8273c = 1.0d;
        c1690h.f8274d = bb.m10551g(20, EnumC5772c.SECONDS);
        interfaceC2139c.invoke(c1690h);
        return new C1692j(new C1691i(c1690h));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dg.InterfaceC1715d
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dg.C1714c mo398g(android.content.Context r3, java.lang.String r4, dg.InterfaceC1713b r5) {
        /*
            r2 = this;
            dg.c r0 = new dg.c
            r0.<init>()
            int r1 = r5.mo5402g(r3, r4)
            r0.f8340a = r1
            r1 = 1
            int r3 = r5.mo5401a(r3, r4, r1)
            r0.f8341b = r3
            int r4 = r0.f8340a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f8342c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C5070u.mo398g(android.content.Context, java.lang.String, dg.b):dg.c");
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public /* synthetic */ Object mo21h(x0 x0Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(x0Var);
    }

    @Override // bc.InterfaceC0643b
    public /* bridge */ /* synthetic */ Object resolveEndpoint(Object obj, InterfaceC7559c interfaceC7559c) {
        throw null;
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        return new Boolean(((Boolean) k7.f6272b.m3530b()).booleanValue());
    }

    public C5070u(RecordingCompressManager recordingCompressManager) {
        this.f24866a = 2;
    }

    @Override // fe.InterfaceC2281e
    public void shutdown() {
    }

    @Override // c6.a0
    public void onScrollLimit(int i10, int i11, int i12, boolean z6) {
    }

    @Override // c6.a0
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }
}
