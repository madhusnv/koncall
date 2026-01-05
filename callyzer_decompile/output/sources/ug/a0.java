package ug;

import al.C0179g;
import bd.C0645a;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.t7;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2265c;
import hd.C2893e;
import hd.C2896h;
import hd.C2897i;
import hd.EnumC2908t;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import jc.AbstractC3745u;
import jc.C3742r;
import kotlin.jvm.internal.AbstractC4154l;
import l4.InterfaceC4374s;
import nx.AbstractC5185w;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5933n;
import pg.l8;
import qi.InterfaceC6222e;
import rw.AbstractC6662l;
import sc.InterfaceC6794n;
import tc.C7117b;
import u9.C7379a;
import uz.C7580e;
import uz.InterfaceC7587l;
import uz.InterfaceC7589n;
import ya.C8607f;
import yg.C8656m;
import yg.InterfaceC8649f;
import yi.InterfaceC8675d;
import yk.C8687a;
import z1.C8849i;
import zk.C8988b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements InterfaceC7450u, InterfaceC4374s, InterfaceC7587l, InterfaceC6794n, InterfaceC8649f, InterfaceC6222e, InterfaceC8675d {

    /* renamed from: b */
    public static final /* synthetic */ a0 f35238b = new a0(0);

    /* renamed from: c */
    public static final /* synthetic */ a0 f35239c = new a0(1);

    /* renamed from: d */
    public static final /* synthetic */ a0 f35240d = new a0(2);

    /* renamed from: e */
    public static final /* synthetic */ a0 f35241e = new a0(3);

    /* renamed from: f */
    public static final /* synthetic */ a0 f35242f = new a0(4);

    /* renamed from: g */
    public static final /* synthetic */ a0 f35243g = new a0(5);

    /* renamed from: h */
    public static final /* synthetic */ a0 f35244h = new a0(6);

    /* renamed from: j */
    public static final /* synthetic */ a0 f35245j = new a0(7);

    /* renamed from: k */
    public static final /* synthetic */ a0 f35246k = new a0(8);

    /* renamed from: l */
    public static final /* synthetic */ a0 f35247l = new a0(9);

    /* renamed from: m */
    public static final /* synthetic */ a0 f35248m = new a0(10);

    /* renamed from: n */
    public static final /* synthetic */ a0 f35249n = new a0(11);

    /* renamed from: p */
    public static final /* synthetic */ a0 f35250p = new a0(12);

    /* renamed from: q */
    public static final /* synthetic */ a0 f35251q = new a0(13);

    /* renamed from: r */
    public static final /* synthetic */ a0 f35252r = new a0(14);

    /* renamed from: s */
    public static final /* synthetic */ a0 f35253s = new a0(15);

    /* renamed from: t */
    public static final /* synthetic */ a0 f35254t = new a0(16);

    /* renamed from: v */
    public static final /* synthetic */ a0 f35255v = new a0(17);

    /* renamed from: a */
    public final /* synthetic */ int f35256a;

    public /* synthetic */ a0(int i10) {
        this.f35256a = i10;
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: Y */
    public int mo2733Y(int i10) {
        if (i10 <= 2) {
            return i10;
        }
        if (i10 <= 6) {
            return i10 + 1;
        }
        if (i10 <= 11) {
            return i10 + 2;
        }
        return 13;
    }

    @Override // uz.InterfaceC7587l
    /* renamed from: a */
    public boolean mo13823a(SSLSocket sSLSocket) {
        return AbstractC5185w.m10138t(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // yi.InterfaceC8675d
    /* renamed from: c */
    public String mo13825c() {
        return null;
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        switch (this.f35256a) {
            case 20:
                C7379a input = (C7379a) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input, "input");
                C7117b c7117b = new C7117b();
                c7117b.m13402b(jc.e0.POST);
                C2897i c2897iM14325e = p020v.a1.m14325e(c7117b.f34311b.f361d, "/token");
                C2274l c2274l = C2274l.f10291i;
                C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("clientId")}), 0);
                C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("clientSecret")}), 0);
                C2271i c2271i3 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("code")}), 0);
                C2271i c2271i4 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("codeVerifier")}), 0);
                C2271i c2271i5 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("deviceCode")}), 0);
                C2271i c2271i6 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("grantType")}), 0);
                C2271i c2271i7 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("redirectUri")}), 0);
                C2271i c2271i8 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("refreshToken")}), 0);
                C2271i c2271i9 = new C2271i(C2274l.f10288f, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("scope")}), 0);
                C8849i c8849i = new C8849i(4);
                c8849i.m16319q(c2271i);
                c8849i.m16319q(c2271i2);
                c8849i.m16319q(c2271i3);
                c8849i.m16319q(c2271i4);
                c8849i.m16319q(c2271i5);
                c8849i.m16319q(c2271i6);
                c8849i.m16319q(c2271i7);
                c8849i.m16319q(c2271i8);
                c8849i.m16319q(c2271i9);
                LinkedHashSet traits = (LinkedHashSet) c8849i.f42584c;
                AbstractC4154l.m8923f(traits, "traits");
                C2893e c2893e = c2897iM14325e.f15931a;
                c2893e.getClass();
                EnumC2908t enumC2908t = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e.m7010d("{");
                if (c2893e.f15922a) {
                    ((StringBuilder) c2893e.f15924c).append('\n');
                }
                c2893e.f15923b++;
                ArrayList arrayList = (ArrayList) c2893e.f15925d;
                AbstractC4154l.m8923f(arrayList, "<this>");
                arrayList.add(enumC2908t);
                String str = input.f35080a;
                if (str != null) {
                    c2897iM14325e.mo2596d(c2271i, str);
                }
                String str2 = input.f35081b;
                if (str2 != null) {
                    c2897iM14325e.mo2596d(c2271i2, str2);
                }
                String str3 = input.f35082c;
                if (str3 != null) {
                    c2897iM14325e.mo2596d(c2271i6, str3);
                }
                String str4 = input.f35083d;
                if (str4 != null) {
                    c2897iM14325e.mo2596d(c2271i8, str4);
                }
                c2897iM14325e.mo2598f();
                byte[] bArrM7012f = c2893e.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b.f34313d = C3742r.m8277a(bArrM7012f);
                c7117b.f34312c.m320H("application/json");
                return c7117b;
            default:
                C8607f input2 = (C8607f) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input2, "input");
                Map map = input2.f41871b;
                C7117b c7117b2 = new C7117b();
                c7117b2.m13402b(jc.e0.POST);
                C2897i c2897iM14325e2 = p020v.a1.m14325e(c7117b2.f34311b.f361d, "/");
                C2274l c2274l2 = C2274l.f10291i;
                C2271i c2271i10 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccountId")}), 0);
                C2271i c2271i11 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("IdentityPoolId")}), 0);
                C2271i c2271i12 = new C2271i(C2274l.f10290h, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Logins")}), 0);
                ArrayList arrayList2 = new ArrayList();
                c2271i10.f10279b = p020v.a1.m14322b(arrayList2);
                arrayList2.add(c2271i10);
                c2271i11.f10279b = arrayList2.size();
                arrayList2.add(c2271i11);
                c2271i12.f10279b = arrayList2.size();
                arrayList2.add(c2271i12);
                C2893e c2893e2 = c2897iM14325e2.f15931a;
                c2893e2.getClass();
                EnumC2908t enumC2908t2 = EnumC2908t.ObjectFirstKeyOrEnd;
                c2893e2.m7010d("{");
                if (c2893e2.f15922a) {
                    ((StringBuilder) c2893e2.f15924c).append('\n');
                }
                c2893e2.f15923b++;
                ArrayList arrayList3 = (ArrayList) c2893e2.f15925d;
                AbstractC4154l.m8923f(arrayList3, "<this>");
                arrayList3.add(enumC2908t2);
                String str5 = input2.f41870a;
                if (str5 != null) {
                    c2897iM14325e2.mo2596d(c2271i11, str5);
                }
                if (map != null) {
                    c2893e2.m7014h(AbstractC5933n.m11794b(c2271i12));
                    c2897iM14325e2.m7019i(c2271i12);
                    for (Map.Entry entry : map.entrySet()) {
                        c2897iM14325e2.mo5960h((String) entry.getKey(), (String) entry.getValue());
                    }
                    c2897iM14325e2.m7021k();
                }
                c2897iM14325e2.mo2598f();
                byte[] bArrM7012f2 = c2893e2.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b2.f34313d = C3742r.m8277a(bArrM7012f2);
                c7117b2.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b2;
        }
    }

    @Override // uz.InterfaceC7587l
    /* renamed from: f */
    public InterfaceC7589n mo13827f(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C7580e(superclass);
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(p020v.x0 x0Var) {
        switch (this.f35256a) {
            case 22:
                return new C0179g();
            default:
                return new C8988b(x0Var.mo12236c(C8687a.class));
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        return l8.m11765f(Boolean.TRUE);
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: w */
    public int mo2753w(int i10) {
        if (i10 <= 2) {
            return i10;
        }
        if (i10 <= 6) {
            return i10 - 1;
        }
        if (i10 <= 13) {
            return i10 - 2;
        }
        return 11;
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        switch (this.f35256a) {
            case 0:
                List list = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6164l.m3530b();
            case 1:
                List list2 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6170r.m3530b()).longValue());
            case 2:
                List list3 = f0.f35406a;
                c7.f6100b.get();
                Long l9 = (Long) e7.f6127A.m3530b();
                l9.getClass();
                return l9;
            case 3:
                List list4 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6141O.m3530b()).longValue());
            case 4:
                List list5 = f0.f35406a;
                c7.f6100b.get();
                Long l10 = (Long) e7.f43866f0.m3530b();
                l10.getClass();
                return l10;
            case 5:
                List list6 = f0.f35406a;
                c7.f6100b.get();
                Long l11 = (Long) e7.f6177y.m3530b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43879s0.m3530b()).longValue());
            case 7:
                List list8 = f0.f35406a;
                c7.f6100b.get();
                Long l12 = (Long) e7.f6134H.m3530b();
                l12.getClass();
                return l12;
            case 8:
                List list9 = f0.f35406a;
                m8.f6301b.get();
                return Integer.valueOf((int) ((Long) o8.f6335d.m3530b()).longValue());
            case 9:
                List list10 = f0.f35406a;
                c7.f6100b.get();
                Long l13 = (Long) e7.f43864d0.m3530b();
                l13.getClass();
                return l13;
            case 10:
                List list11 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6151Y.m3530b();
            case 11:
                List list12 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f43862b0.m3530b();
            case 12:
                List list13 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6174v.m3530b()).longValue());
            case 13:
                List list14 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43869i0.m3530b()).longValue());
            case 14:
                List list15 = f0.f35406a;
                Boolean bool = (Boolean) t7.f6395a.m3530b();
                bool.getClass();
                return bool;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool2 = (Boolean) r8.f6362a.m3530b();
                bool2.getClass();
                return bool2;
            case 16:
                List list17 = f0.f35406a;
                Boolean bool3 = (Boolean) n7.f6314a.m3530b();
                bool3.getClass();
                return bool3;
            default:
                return new Boolean(((Boolean) f8.f6198a.m3530b()).booleanValue());
        }
    }

    @Override // yi.InterfaceC8675d
    /* renamed from: b */
    public void mo13824b() {
    }

    @Override // yi.InterfaceC8675d
    /* renamed from: e */
    public void mo13826e(String str, long j6) {
    }
}
