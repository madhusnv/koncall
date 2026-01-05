package oj;

import aa.C0076c;
import ad.C0100g;
import ad.C0104k;
import ad.C0108o;
import ad.C0109p;
import android.content.Context;
import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import b00.C0518c;
import b00.C0521f;
import ba.C0636f;
import bc.C0642a;
import bd.C0645a;
import c9.C0910e;
import cb.C0943b;
import cb.InterfaceC0944c;
import com.amplifyframework.auth.cognito.asf.BuildDataCollector;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.q7;
import com.websoptimization.callyzerbiz.R;
import db.AbstractC1680b;
import dd.C1693k;
import dd.C1700r;
import dg.C1714c;
import dg.C1720i;
import dg.InterfaceC1713b;
import dg.InterfaceC1715d;
import eb.C1978b;
import eb.d3;
import eb.j2;
import eb.l1;
import eb.l3;
import eb.p0;
import eb.t1;
import ec.C2003a;
import ec.C2005c;
import ec.InterfaceC2004b;
import ej.C2056a;
import ej.C2057b;
import ej.InterfaceC2059d;
import ex.InterfaceC2139c;
import fb.C2229c;
import fb.C2235i;
import fb.C2236j;
import fc.C2259g;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2276n;
import fj.InterfaceC2294a;
import g7.InterfaceC2537b;
import gd.C2565c;
import gd.C2566d;
import gd.C2567e;
import gd.C2568f;
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
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import jc.AbstractC3745u;
import jc.C3742r;
import jc.e0;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import l8.C4429c;
import l8.InterfaceC4430d;
import l8.InterfaceC4431e;
import m8.C4678h;
import ma.C4684c;
import mb.k0;
import mq.C4833a;
import nj.InterfaceC5075a;
import nx.AbstractC5178p;
import o9.C5326a;
import og.ff;
import og.ud;
import org.json.JSONObject;
import p016r.InterfaceC6409a;
import p020v.a1;
import pg.AbstractC5933n;
import ph.C5950e;
import rw.AbstractC6662l;
import sc.InterfaceC6794n;
import sd.C6813g;
import tc.C7117b;
import ud.InterfaceC7403g;
import ug.C7451v;
import ug.InterfaceC7450u;
import uw.InterfaceC7559c;
import wc.C7985s;
import yb.AbstractC8610b;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oj.d */
/* loaded from: classes.dex */
public final class C5392d implements InterfaceC6794n, InterfaceC0944c, InterfaceC2537b, InterfaceC7403g, InterfaceC1715d, InterfaceC2059d, InterfaceC2294a, InterfaceC3270l, InterfaceC6409a, InterfaceC4430d, InterfaceC5075a, InterfaceC7450u {

    /* renamed from: c */
    public static volatile C5392d f27079c;

    /* renamed from: a */
    public final /* synthetic */ int f27081a;

    /* renamed from: b */
    public static final /* synthetic */ C5392d f27078b = new C5392d(21);

    /* renamed from: d */
    public static final /* synthetic */ C5392d f27080d = new C5392d(29);

    public /* synthetic */ C5392d(int i10) {
        this.f27081a = i10;
    }

    /* renamed from: h */
    public static final void m11109h(C0521f c0521f, long j6, boolean z6) {
        C0521f c0521f2;
        ReentrantLock reentrantLock = C0521f.f3614h;
        if (C0521f.f3618l == null) {
            C0521f.f3618l = new C0521f();
            C0518c c0518c = new C0518c("Okio Watchdog");
            c0518c.setDaemon(true);
            c0518c.start();
        }
        long jNanoTime = System.nanoTime();
        if (j6 != 0 && z6) {
            c0521f.f3621g = Math.min(j6, c0521f.mo1598c() - jNanoTime) + jNanoTime;
        } else if (j6 != 0) {
            c0521f.f3621g = j6 + jNanoTime;
        } else {
            if (!z6) {
                throw new AssertionError();
            }
            c0521f.f3621g = c0521f.mo1598c();
        }
        long j10 = c0521f.f3621g - jNanoTime;
        C0521f c0521f3 = C0521f.f3618l;
        AbstractC4154l.m8920c(c0521f3);
        while (true) {
            c0521f2 = c0521f3.f3620f;
            if (c0521f2 == null || j10 < c0521f2.f3621g - jNanoTime) {
                break;
            }
            AbstractC4154l.m8920c(c0521f2);
            c0521f3 = c0521f2;
        }
        c0521f.f3620f = c0521f2;
        c0521f3.f3620f = c0521f;
        if (c0521f3 == C0521f.f3618l) {
            C0521f.f3615i.signal();
        }
    }

    /* renamed from: i */
    public static C0521f m11110i() throws InterruptedException {
        C0521f c0521f = C0521f.f3618l;
        AbstractC4154l.m8920c(c0521f);
        C0521f c0521f2 = c0521f.f3620f;
        if (c0521f2 == null) {
            long jNanoTime = System.nanoTime();
            C0521f.f3615i.await(C0521f.f3616j, TimeUnit.MILLISECONDS);
            C0521f c0521f3 = C0521f.f3618l;
            AbstractC4154l.m8920c(c0521f3);
            if (c0521f3.f3620f != null || System.nanoTime() - jNanoTime < C0521f.f3617k) {
                return null;
            }
            return C0521f.f3618l;
        }
        long jNanoTime2 = c0521f2.f3621g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0521f.f3615i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0521f c0521f4 = C0521f.f3618l;
        AbstractC4154l.m8920c(c0521f4);
        c0521f4.f3620f = c0521f2.f3620f;
        c0521f2.f3620f = null;
        c0521f2.f3619e = 2;
        return c0521f2;
    }

    /* renamed from: j */
    public static C2057b m11111j(C7451v c7451v) {
        return new C2057b(System.currentTimeMillis() + 3600000, new C1720i(8, 1), new C2056a(true, false, false), 10.0d, 1.2d, 60);
    }

    /* renamed from: k */
    public static C4132l m11112k(String note) {
        AbstractC4154l.m8923f(note, "note");
        return note.length() > 1000 ? new C4132l(false, Integer.valueOf(R.string.please_keep_the_note)) : new C4132l(true, null);
    }

    /* renamed from: l */
    public static C7117b m11113l(C0645a context, k0 input) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(input, "input");
        C7117b c7117b = new C7117b();
        c7117b.m13402b(e0.GET);
        String str = input.f23266b;
        if (str == null) {
            throw new IllegalArgumentException("key is bound to the URI and must not be null");
        }
        C0104k c0104k = c7117b.f34311b;
        j4 j4Var = c0104k.f361d;
        C0100g c0100g = c0104k.f362e;
        C2259g encodedSegments = (C2259g) j4Var.f6253d;
        AbstractC4154l.m8923f(encodedSegments, "$this$encodedSegments");
        Iterator it = AbstractC5178p.m10112W(str, new String[]{"/"}, 6).iterator();
        while (it.hasNext()) {
            encodedSegments.add(C6813g.f32363m.m12988d((String) it.next()));
        }
        c0100g.f351c.mo266g("GetObject", "x-id");
        c0100g.m267h(C6813g.f32363m, new C4833a(12, input));
        String str2 = input.f23267c;
        if (str2 != null) {
            c7117b.f34312c.m336p(str2, "Range");
        }
        return c7117b;
    }

    @Override // ii.InterfaceC3270l
    /* renamed from: a */
    public Object mo7623a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // fj.InterfaceC2294a
    /* renamed from: b */
    public StackTraceElement[] mo2559b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // l8.InterfaceC4430d
    /* renamed from: c */
    public InterfaceC4431e mo25c(C4429c c4429c) {
        return new C4678h(c4429c.f22148a, c4429c.f22149b, c4429c.f22150c, c4429c.f22151d, c4429c.f22152e);
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        int i10;
        switch (this.f27081a) {
            case 3:
                C0076c input = (C0076c) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input, "input");
                C7117b c7117b = new C7117b();
                c7117b.m13402b(e0.POST);
                j4 j4Var = c7117b.f34311b.f361d;
                j4Var.getClass();
                j4Var.m3398p("/");
                C7985s c7985s = new C7985s();
                C2566d c2566d = new C2566d(c7985s, "");
                C2271i c2271i = new C2271i(C2274l.f10287e, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("DurationSeconds")}), 0);
                C2274l c2274l = C2274l.f10291i;
                C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("Policy")}), 0);
                C2271i c2271i3 = new C2271i(C2274l.f10288f, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("PolicyArns")}), 0);
                C2271i c2271i4 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("ProviderId")}), 0);
                C2271i c2271i5 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("RoleArn")}), 0);
                C2271i c2271i6 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("RoleSessionName")}), 0);
                C2271i c2271i7 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("WebIdentityToken")}), 0);
                C8849i c8849i = new C8849i(4);
                C2565c c2565c = new C2565c("AssumeRoleWithWebIdentityRequest");
                LinkedHashSet linkedHashSet = (LinkedHashSet) c8849i.f42584c;
                linkedHashSet.add(c2565c);
                linkedHashSet.add(new C2568f("Action", "AssumeRoleWithWebIdentity"));
                linkedHashSet.add(new C2568f("Version", "2011-06-15"));
                c8849i.m16319q(c2271i);
                c8849i.m16319q(c2271i2);
                c8849i.m16319q(c2271i3);
                c8849i.m16319q(c2271i4);
                c8849i.m16319q(c2271i5);
                c8849i.m16319q(c2271i6);
                c8849i.m16319q(c2271i7);
                InterfaceC2276n interfaceC2276nMo5962b = c2566d.mo5962b(new C2272j(c8849i));
                Integer num = input.f279a;
                if (num != null) {
                    C0910e c0910e = (C0910e) interfaceC2276nMo5962b;
                    i10 = 0;
                    c0910e.m2593L(c2271i, new C2567e(c0910e, num.intValue(), i10));
                } else {
                    i10 = 0;
                }
                if (input.f280b != null) {
                    ((C0910e) interfaceC2276nMo5962b).m2583A(c2271i3, new C0636f(i10, input));
                }
                String str = input.f281c;
                if (str != null) {
                    ((C0910e) interfaceC2276nMo5962b).mo2596d(c2271i5, str);
                }
                String str2 = input.f282d;
                if (str2 != null) {
                    ((C0910e) interfaceC2276nMo5962b).mo2596d(c2271i6, str2);
                }
                String str3 = input.f283e;
                if (str3 != null) {
                    ((C0910e) interfaceC2276nMo5962b).mo2596d(c2271i7, str3);
                }
                byte[] bArrMo15148v = c7985s.mo15148v();
                AbstractC3745u.Companion.getClass();
                c7117b.f34313d = C3742r.m8277a(bArrMo15148v);
                c7117b.f34312c.m320H("application/x-www-form-urlencoded");
                return c7117b;
            case 9:
                p0 input2 = (p0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input2, "input");
                C7117b c7117b2 = new C7117b();
                c7117b2.m13402b(e0.POST);
                C2897i c2897iM14325e = a1.m14325e(c7117b2.f34311b.f361d, "/");
                C2274l c2274l2 = C2274l.f10291i;
                C2271i c2271i8 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i9 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("DeviceKey")}), 0);
                C2271i c2271i10 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h(BuildDataCollector.MODEL)}), 0);
                C2271i c2271i11 = new C2271i(C2274l.f10292j, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("DeviceSecretVerifierConfig")}), 0);
                ArrayList arrayList = new ArrayList();
                c2271i8.f10279b = a1.m14322b(arrayList);
                arrayList.add(c2271i8);
                c2271i9.f10279b = arrayList.size();
                arrayList.add(c2271i9);
                c2271i10.f10279b = arrayList.size();
                arrayList.add(c2271i10);
                c2271i11.f10279b = arrayList.size();
                arrayList.add(c2271i11);
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
                String str4 = input2.f9405a;
                if (str4 != null) {
                    c2897iM14325e.mo2596d(c2271i8, str4);
                }
                String str5 = input2.f9406b;
                if (str5 != null) {
                    c2897iM14325e.mo2596d(c2271i9, str5);
                }
                String str6 = input2.f9407c;
                if (str6 != null) {
                    c2897iM14325e.mo2596d(c2271i10, str6);
                }
                l1 l1Var = input2.f9408d;
                if (l1Var != null) {
                    ff.m10654b(c2897iM14325e, c2271i11, l1Var, C2229c.f10216a);
                }
                c2897iM14325e.mo2598f();
                byte[] bArrM7012f = c2893e.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b2.f34313d = C3742r.m8277a(bArrM7012f);
                c7117b2.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b2;
            case 10:
                t1 input3 = (t1) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input3, "input");
                Map map = input3.f9468c;
                C7117b c7117b3 = new C7117b();
                c7117b3.m13402b(e0.POST);
                C2897i c2897iM14325e2 = a1.m14325e(c7117b3.f34311b.f361d, "/");
                C2274l c2274l3 = C2274l.f10292j;
                C2271i c2271i12 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AnalyticsMetadata")}), 0);
                C2274l c2274l4 = C2274l.f10291i;
                C2271i c2271i13 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientId")}), 0);
                C2271i c2271i14 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientMetadata")}), 0);
                C2271i c2271i15 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("SecretHash")}), 0);
                C2271i c2271i16 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserContextData")}), 0);
                C2271i c2271i17 = new C2271i(c2274l4, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Username")}), 0);
                ArrayList arrayList3 = new ArrayList();
                c2271i12.f10279b = a1.m14322b(arrayList3);
                arrayList3.add(c2271i12);
                c2271i13.f10279b = arrayList3.size();
                arrayList3.add(c2271i13);
                c2271i14.f10279b = arrayList3.size();
                arrayList3.add(c2271i14);
                c2271i15.f10279b = arrayList3.size();
                arrayList3.add(c2271i15);
                c2271i16.f10279b = arrayList3.size();
                arrayList3.add(c2271i16);
                c2271i17.f10279b = arrayList3.size();
                arrayList3.add(c2271i17);
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
                C1978b c1978b = input3.f9466a;
                if (c1978b != null) {
                    ff.m10654b(c2897iM14325e2, c2271i12, c1978b, C2235i.f10221a);
                }
                String str7 = input3.f9467b;
                if (str7 != null) {
                    c2897iM14325e2.mo2596d(c2271i13, str7);
                }
                if (map != null) {
                    c2893e2.m7014h(AbstractC5933n.m11794b(c2271i14));
                    c2897iM14325e2.m7019i(c2271i14);
                    for (Map.Entry entry : map.entrySet()) {
                        c2897iM14325e2.mo5960h((String) entry.getKey(), (String) entry.getValue());
                    }
                    c2897iM14325e2.m7021k();
                }
                String str8 = input3.f9469d;
                if (str8 != null) {
                    c2897iM14325e2.mo2596d(c2271i15, str8);
                }
                l3 l3Var = input3.f9470e;
                if (l3Var != null) {
                    ff.m10654b(c2897iM14325e2, c2271i16, l3Var, C2236j.f10222a);
                }
                String str9 = input3.f9471f;
                if (str9 != null) {
                    c2897iM14325e2.mo2596d(c2271i17, str9);
                }
                c2897iM14325e2.mo2598f();
                byte[] bArrM7012f2 = c2893e2.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b3.f34313d = C3742r.m8277a(bArrM7012f2);
                c7117b3.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b3;
            case 11:
                j2 input4 = (j2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input4, "input");
                C7117b c7117b4 = new C7117b();
                c7117b4.m13402b(e0.POST);
                C2897i c2897iM14325e3 = a1.m14325e(c7117b4.f34311b.f361d, "/");
                C2274l c2274l5 = C2274l.f10291i;
                C2271i c2271i18 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i19 = new C2271i(C2274l.f10287e, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("MaxResults")}), 0);
                C2271i c2271i20 = new C2271i(c2274l5, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("NextToken")}), 0);
                ArrayList arrayList5 = new ArrayList();
                c2271i18.f10279b = a1.m14322b(arrayList5);
                arrayList5.add(c2271i18);
                c2271i19.f10279b = arrayList5.size();
                arrayList5.add(c2271i19);
                c2271i20.f10279b = arrayList5.size();
                arrayList5.add(c2271i20);
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
                String str10 = input4.f9344a;
                if (str10 != null) {
                    c2897iM14325e3.mo2596d(c2271i18, str10);
                }
                Integer num2 = input4.f9345b;
                if (num2 != null) {
                    c2897iM14325e3.mo2595c(c2271i19, num2.intValue());
                }
                String str11 = input4.f9346c;
                if (str11 != null) {
                    c2897iM14325e3.mo2596d(c2271i20, str11);
                }
                c2897iM14325e3.mo2598f();
                byte[] bArrM7012f3 = c2893e3.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b4.f34313d = C3742r.m8277a(bArrM7012f3);
                c7117b4.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b4;
            case 12:
                d3 input5 = (d3) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input5, "input");
                C7117b c7117b5 = new C7117b();
                c7117b5.m13402b(e0.POST);
                C2897i c2897iM14325e4 = a1.m14325e(c7117b5.f34311b.f361d, "/");
                C2271i c2271i21 = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                ArrayList arrayList7 = new ArrayList();
                c2271i21.f10279b = a1.m14322b(arrayList7);
                arrayList7.add(c2271i21);
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
                String str12 = input5.f9296a;
                if (str12 != null) {
                    c2897iM14325e4.mo2596d(c2271i21, str12);
                }
                c2897iM14325e4.mo2598f();
                byte[] bArrM7012f4 = c2893e4.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b5.f34313d = C3742r.m8277a(bArrM7012f4);
                c7117b5.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b5;
            case 23:
                C5326a input6 = (C5326a) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input6, "input");
                C7117b c7117b6 = new C7117b();
                c7117b6.m13402b(e0.GET);
                C0104k c0104k = c7117b6.f34311b;
                j4 j4Var2 = c0104k.f361d;
                j4Var2.getClass();
                j4Var2.m3398p("/federation/credentials");
                c0104k.f362e.m267h(C6813g.f32363m, new C4833a(8, input6));
                String str13 = input6.f26214a;
                if (str13 != null) {
                    c7117b6.f34312c.m336p(str13, "x-amz-sso_bearer_token");
                }
                return c7117b6;
            default:
                return m11113l(context, (k0) obj);
        }
    }

    @Override // ud.InterfaceC7403g
    /* renamed from: e */
    public Object mo1988e(InterfaceC2139c interfaceC2139c) {
        interfaceC2139c.invoke(new C1693k());
        return new C1700r(new C5950e(6));
    }

    @Override // ej.InterfaceC2059d
    /* renamed from: f */
    public C2057b mo5782f(C7451v c7451v, JSONObject jSONObject) {
        return m11111j(c7451v);
    }

    @Override // dg.InterfaceC1715d
    /* renamed from: g */
    public C1714c mo398g(Context context, String str, InterfaceC1713b interfaceC1713b) {
        int iMo5401a;
        C1714c c1714c = new C1714c();
        int iMo5402g = interfaceC1713b.mo5402g(context, str);
        c1714c.f8340a = iMo5402g;
        int i10 = 1;
        int i11 = 0;
        if (iMo5402g != 0) {
            iMo5401a = interfaceC1713b.mo5401a(context, str, false);
            c1714c.f8341b = iMo5401a;
        } else {
            iMo5401a = interfaceC1713b.mo5401a(context, str, true);
            c1714c.f8341b = iMo5401a;
        }
        int i12 = c1714c.f8340a;
        if (i12 == 0) {
            if (iMo5401a == 0) {
                i10 = 0;
            }
            c1714c.f8342c = i10;
            return c1714c;
        }
        i11 = i12;
        if (i11 >= iMo5401a) {
            i10 = -1;
        }
        c1714c.f8342c = i10;
        return c1714c;
    }

    @Override // bc.InterfaceC0643b
    public Object resolveEndpoint(Object obj, InterfaceC7559c interfaceC7559c) {
        C4684c c4684cM8064i;
        C0943b c0943b = (C0943b) obj;
        String str = c0943b.f5703a;
        Boolean bool = c0943b.f5705c;
        Boolean bool2 = c0943b.f5706d;
        String str2 = c0943b.f5704b;
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
        if (str2 == null || (c4684cM8064i = AbstractC3504d.m8064i(str2, AbstractC1680b.f8220a)) == null) {
            throw new EndpointProviderException("Invalid Configuration: Missing Region");
        }
        String str3 = c4684cM8064i.f23152b;
        String str4 = c4684cM8064i.f23153c;
        Boolean bool4 = c4684cM8064i.f23155e;
        Boolean bool5 = c4684cM8064i.f23154d;
        Boolean bool6 = Boolean.TRUE;
        if (AbstractC4154l.m8918a(bool2, bool6) && AbstractC4154l.m8918a(bool, bool6)) {
            if (bool6.equals(bool5) && bool6.equals(bool4)) {
                return str2.equals("us-east-1") ? new C0642a(C0108o.m297a(c0108o, "https://cognito-idp-fips.us-east-1.amazonaws.com")) : str2.equals("us-east-2") ? new C0642a(C0108o.m297a(c0108o, "https://cognito-idp-fips.us-east-2.amazonaws.com")) : str2.equals("us-west-1") ? new C0642a(C0108o.m297a(c0108o, "https://cognito-idp-fips.us-west-1.amazonaws.com")) : str2.equals("us-west-2") ? new C0642a(C0108o.m297a(c0108o, "https://cognito-idp-fips.us-west-2.amazonaws.com")) : new C0642a(m0.m7371d("https://cognito-idp-fips.", str2, '.', str4, c0108o));
            }
            throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
        }
        if (AbstractC4154l.m8918a(bool2, bool6)) {
            if (AbstractC4154l.m8918a(bool5, bool6)) {
                return new C0642a(m0.m7371d("https://cognito-idp-fips.", str2, '.', str3, c0108o));
            }
            throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
        }
        if (!AbstractC4154l.m8918a(bool, bool6)) {
            return new C0642a(m0.m7371d("https://cognito-idp.", str2, '.', str3, c0108o));
        }
        if (!bool6.equals(bool4)) {
            throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
        }
        if (!"aws".equals(c4684cM8064i.f23151a)) {
            return new C0642a(m0.m7371d("https://cognito-idp.", str2, '.', str4, c0108o));
        }
        return new C0642a(C0108o.m297a(c0108o, "https://cognito-idp." + str2 + ".amazonaws.com"));
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        return new Boolean(((Boolean) q7.f6350a.m3530b()).booleanValue());
    }

    @Override // p016r.InterfaceC6409a
    public Object apply(Object obj) {
        return obj;
    }
}
