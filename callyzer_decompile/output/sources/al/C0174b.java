package al;

import a1.C0011j;
import ad.C0104k;
import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import b1.C0542a;
import bd.C0645a;
import c0.v0;
import com.amplifyframework.storage.ObjectMetadata;
import com.websoptimization.callyzerbiz.R;
import d3.d0;
import d3.h0;
import d3.l0;
import dg.C1714c;
import dg.InterfaceC1713b;
import dg.InterfaceC1715d;
import eb.C1980d;
import eb.b2;
import eb.n3;
import eb.t2;
import eb.z0;
import fc.C2259g;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2265c;
import g7.InterfaceC2537b;
import gl.C2628d;
import hc.C2888k;
import hd.C2893e;
import hd.C2896h;
import hd.C2897i;
import hd.EnumC2908t;
import ho.C2992e;
import ho.InterfaceC2988a;
import iz.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import jc.AbstractC3745u;
import jc.C3733i;
import jc.C3742r;
import jc.C3743s;
import jc.e0;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import mb.C4710z;
import mb.m3;
import mb.o2;
import mb.w2;
import mb.z1;
import net.schmizz.sshj.sftp.SFTPException;
import nx.AbstractC5178p;
import ny.InterfaceC5188b;
import or.AbstractC5453p;
import p012n.InterfaceC4934n;
import p012n.MenuC4929i;
import p020v.a1;
import p020v.x0;
import pg.f8;
import qi.InterfaceC6222e;
import rw.AbstractC6662l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import sc.InterfaceC6794n;
import sd.C6813g;
import tc.C7117b;
import td.C7126c;
import td.EnumC7143t;
import ug.InterfaceC7435f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.b */
/* loaded from: classes.dex */
public final class C0174b implements InterfaceC6222e, l0, InterfaceC2537b, InterfaceC1715d, InterfaceC6794n, InterfaceC4934n, r0, InterfaceC5188b, InterfaceC7435f {

    /* renamed from: b */
    public static final /* synthetic */ C0174b f536b = new C0174b(29);

    /* renamed from: a */
    public final /* synthetic */ int f537a;

    public /* synthetic */ C0174b(int i10) {
        this.f537a = i10;
    }

    /* renamed from: b */
    public static String m390b(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackTraceElement.getClassName());
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            sb2.append("(Native Method)");
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            sb2.append("(Unknown Source)");
        } else {
            sb2.append("(");
            sb2.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* renamed from: j */
    public static C2992e m391j(AbstractC5453p fieldType) {
        Integer num;
        AbstractC4154l.m8923f(fieldType, "fieldType");
        C2992e c2992e = new C2992e(true, (Integer) null, 6);
        Iterator it = fieldType.mo11154f().iterator();
        while (it.hasNext()) {
            C2992e c2992eMo7247a = ((InterfaceC2988a) it.next()).mo7247a(fieldType);
            if (!c2992eMo7247a.f16133a && (num = c2992eMo7247a.f16134b) != null) {
                return new C2992e(false, num, c2992eMo7247a.f16135c);
            }
        }
        return c2992e;
    }

    /* renamed from: k */
    public static C4132l m392k(String otp) {
        AbstractC4154l.m8923f(otp, "otp");
        if (otp.length() == 0) {
            return new C4132l(false, Integer.valueOf(R.string.please_enter_otp));
        }
        for (int i10 = 0; i10 < otp.length(); i10++) {
            if (!Character.isDigit(otp.charAt(i10))) {
                return new C4132l(false, Integer.valueOf(R.string.invalid_otp));
            }
        }
        return new C4132l();
    }

    @Override // ny.InterfaceC5188b
    /* renamed from: c */
    public Throwable mo394c(Exception exc) {
        return exc instanceof SFTPException ? (SFTPException) exc : new SFTPException(exc);
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        switch (this.f537a) {
            case 9:
                C1980d input = (C1980d) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input, "input");
                C7117b c7117b = new C7117b();
                c7117b.m13402b(e0.POST);
                C2897i c2897iM14325e = a1.m14325e(c7117b.f34311b.f361d, "/");
                C2274l c2274l = C2274l.f10291i;
                C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Session")}), 0);
                ArrayList arrayList = new ArrayList();
                c2271i.f10279b = a1.m14322b(arrayList);
                arrayList.add(c2271i);
                c2271i2.f10279b = arrayList.size();
                arrayList.add(c2271i2);
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
                String str = input.f9285a;
                if (str != null) {
                    c2897iM14325e.mo2596d(c2271i, str);
                }
                String str2 = input.f9286b;
                if (str2 != null) {
                    c2897iM14325e.mo2596d(c2271i2, str2);
                }
                c2897iM14325e.mo2598f();
                byte[] bArrM7012f = c2893e.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b.f34313d = C3742r.m8277a(bArrM7012f);
                c7117b.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b;
            case 10:
                z0 input2 = (z0) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input2, "input");
                C7117b c7117b2 = new C7117b();
                c7117b2.m13402b(e0.POST);
                C2897i c2897iM14325e2 = a1.m14325e(c7117b2.f34311b.f361d, "/");
                C2271i c2271i3 = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                ArrayList arrayList3 = new ArrayList();
                c2271i3.f10279b = a1.m14322b(arrayList3);
                arrayList3.add(c2271i3);
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
                String str3 = input2.f9525a;
                if (str3 != null) {
                    c2897iM14325e2.mo2596d(c2271i3, str3);
                }
                c2897iM14325e2.mo2598f();
                byte[] bArrM7012f2 = c2893e2.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b2.f34313d = C3742r.m8277a(bArrM7012f2);
                c7117b2.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b2;
            case 11:
                b2 input3 = (b2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input3, "input");
                C7117b c7117b3 = new C7117b();
                c7117b3.m13402b(e0.POST);
                C2897i c2897iM14325e3 = a1.m14325e(c7117b3.f34311b.f361d, "/");
                C2271i c2271i4 = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                ArrayList arrayList5 = new ArrayList();
                c2271i4.f10279b = a1.m14322b(arrayList5);
                arrayList5.add(c2271i4);
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
                String str4 = input3.f9277a;
                if (str4 != null) {
                    c2897iM14325e3.mo2596d(c2271i4, str4);
                }
                c2897iM14325e3.mo2598f();
                byte[] bArrM7012f3 = c2893e3.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b3.f34313d = C3742r.m8277a(bArrM7012f3);
                c7117b3.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b3;
            case 12:
                t2 input4 = (t2) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input4, "input");
                C7117b c7117b4 = new C7117b();
                c7117b4.m13402b(e0.POST);
                C2897i c2897iM14325e4 = a1.m14325e(c7117b4.f34311b.f361d, "/");
                C2274l c2274l2 = C2274l.f10291i;
                C2271i c2271i5 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientId")}), 0);
                C2271i c2271i6 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("ClientSecret")}), 0);
                C2271i c2271i7 = new C2271i(c2274l2, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Token")}), 0);
                ArrayList arrayList7 = new ArrayList();
                c2271i5.f10279b = a1.m14322b(arrayList7);
                arrayList7.add(c2271i5);
                c2271i6.f10279b = arrayList7.size();
                arrayList7.add(c2271i6);
                c2271i7.f10279b = arrayList7.size();
                arrayList7.add(c2271i7);
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
                String str5 = input4.f9472a;
                if (str5 != null) {
                    c2897iM14325e4.mo2596d(c2271i5, str5);
                }
                String str6 = input4.f9473b;
                if (str6 != null) {
                    c2897iM14325e4.mo2596d(c2271i6, str6);
                }
                String str7 = input4.f9474c;
                if (str7 != null) {
                    c2897iM14325e4.mo2596d(c2271i7, str7);
                }
                c2897iM14325e4.mo2598f();
                byte[] bArrM7012f4 = c2893e4.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b4.f34313d = C3742r.m8277a(bArrM7012f4);
                c7117b4.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b4;
            case 13:
                n3 input5 = (n3) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input5, "input");
                C7117b c7117b5 = new C7117b();
                c7117b5.m13402b(e0.POST);
                C2897i c2897iM14325e5 = a1.m14325e(c7117b5.f34311b.f361d, "/");
                C2274l c2274l3 = C2274l.f10291i;
                C2271i c2271i8 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AccessToken")}), 0);
                C2271i c2271i9 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("FriendlyDeviceName")}), 0);
                C2271i c2271i10 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Session")}), 0);
                C2271i c2271i11 = new C2271i(c2274l3, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("UserCode")}), 0);
                ArrayList arrayList9 = new ArrayList();
                c2271i8.f10279b = a1.m14322b(arrayList9);
                arrayList9.add(c2271i8);
                c2271i9.f10279b = arrayList9.size();
                arrayList9.add(c2271i9);
                c2271i10.f10279b = arrayList9.size();
                arrayList9.add(c2271i10);
                c2271i11.f10279b = arrayList9.size();
                arrayList9.add(c2271i11);
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
                String str8 = input5.f9386a;
                if (str8 != null) {
                    c2897iM14325e5.mo2596d(c2271i8, str8);
                }
                String str9 = input5.f9387b;
                if (str9 != null) {
                    c2897iM14325e5.mo2596d(c2271i9, str9);
                }
                String str10 = input5.f9388c;
                if (str10 != null) {
                    c2897iM14325e5.mo2596d(c2271i10, str10);
                }
                String str11 = input5.f9389d;
                if (str11 != null) {
                    c2897iM14325e5.mo2596d(c2271i11, str11);
                }
                c2897iM14325e5.mo2598f();
                byte[] bArrM7012f5 = c2893e5.m7012f();
                AbstractC3745u.Companion.getClass();
                c7117b5.f34313d = C3742r.m8277a(bArrM7012f5);
                c7117b5.f34312c.m320H("application/x-amz-json-1.1");
                return c7117b5;
            case 24:
                C4710z input6 = (C4710z) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input6, "input");
                C7117b c7117b6 = new C7117b();
                c7117b6.m13402b(e0.POST);
                String str12 = input6.f23575c;
                if (str12 == null) {
                    throw new IllegalArgumentException("key is bound to the URI and must not be null");
                }
                C0104k c0104k = c7117b6.f34311b;
                C2259g encodedSegments = (C2259g) c0104k.f361d.f6253d;
                AbstractC4154l.m8923f(encodedSegments, "$this$encodedSegments");
                Iterator it = AbstractC5178p.m10112W(str12, new String[]{"/"}, 6).iterator();
                while (it.hasNext()) {
                    encodedSegments.add(C6813g.f32363m.m12988d((String) it.next()));
                }
                c0104k.f362e.f351c.mo266g("", "uploads");
                mb.a1 a1Var = input6.f23573a;
                C3733i c3733i = c7117b6.f34312c;
                if (a1Var != null) {
                    c3733i.m336p(a1Var.mo9579a(), "x-amz-acl");
                }
                String str13 = input6.f23577e;
                if (str13 != null) {
                    c3733i.m336p(str13, ObjectMetadata.S3_TAGGING);
                }
                Map map = input6.f23576d;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str14 = (String) entry.getKey();
                        c3733i.m336p((String) entry.getValue(), "x-amz-meta-" + str14);
                    }
                }
                return c7117b6;
            default:
                z1 input7 = (z1) obj;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(input7, "input");
                C7117b c7117b7 = new C7117b();
                c7117b7.m13402b(e0.PUT);
                String str15 = input7.f23595j;
                if (str15 == null) {
                    throw new IllegalArgumentException("key is bound to the URI and must not be null");
                }
                C0104k c0104k2 = c7117b7.f34311b;
                C2259g encodedSegments2 = (C2259g) c0104k2.f361d.f6253d;
                AbstractC4154l.m8923f(encodedSegments2, "$this$encodedSegments");
                Iterator it2 = AbstractC5178p.m10112W(str15, new String[]{"/"}, 6).iterator();
                while (it2.hasNext()) {
                    encodedSegments2.add(C6813g.f32363m.m12988d((String) it2.next()));
                }
                c0104k2.f362e.f351c.mo266g("PutObject", "x-id");
                mb.a1 a1Var2 = input7.f23586a;
                C3733i c3733i2 = c7117b7.f34312c;
                if (a1Var2 != null) {
                    c3733i2.m336p(a1Var2.mo9579a(), "x-amz-acl");
                }
                String str16 = input7.f23589d;
                if (str16 != null) {
                    c3733i2.m336p(str16, ObjectMetadata.CACHE_CONTROL);
                }
                String str17 = input7.f23590e;
                if (str17 != null) {
                    c3733i2.m336p(str17, ObjectMetadata.CONTENT_DISPOSITION);
                }
                String str18 = input7.f23591f;
                if (str18 != null) {
                    c3733i2.m336p(str18, ObjectMetadata.CONTENT_ENCODING);
                }
                String str19 = input7.f23592g;
                if (str19 != null) {
                    c3733i2.m336p(str19, ObjectMetadata.CONTENT_MD5);
                }
                String str20 = input7.f23593h;
                if (str20 != null) {
                    c3733i2.m336p(str20, ObjectMetadata.CONTENT_TYPE);
                }
                C7126c c7126c = input7.f23594i;
                if (c7126c != null) {
                    c3733i2.m336p(c7126c.m13409b(EnumC7143t.RFC_5322), "Expires");
                }
                o2 o2Var = input7.f23597l;
                if (o2Var != null) {
                    c3733i2.m336p(o2Var.mo9581a(), ObjectMetadata.REQUESTER_PAYS_HEADER);
                }
                String str21 = input7.f23599n;
                if (str21 != null) {
                    c3733i2.m336p(str21, "x-amz-server-side-encryption-customer-key");
                }
                w2 w2Var = input7.f23598m;
                if (w2Var != null) {
                    c3733i2.m336p(w2Var.mo9583a(), ObjectMetadata.SERVER_SIDE_ENCRYPTION);
                }
                m3 m3Var = input7.f23600o;
                if (m3Var != null) {
                    c3733i2.m336p(m3Var.mo9580a(), ObjectMetadata.STORAGE_CLASS);
                }
                String str22 = input7.f23601p;
                if (str22 != null) {
                    c3733i2.m336p(str22, ObjectMetadata.S3_TAGGING);
                }
                String str23 = input7.f23602q;
                if (str23 != null) {
                    c3733i2.m336p(str23, ObjectMetadata.REDIRECT_LOCATION);
                }
                Map map2 = input7.f23596k;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str24 = (String) entry2.getKey();
                        c3733i2.m336p((String) entry2.getValue(), "x-amz-meta-" + str24);
                    }
                }
                C2888k c2888k = input7.f23587b;
                if (c2888k != null) {
                    c7117b7.f34313d = f8.m11623d(c2888k);
                }
                if (!(c7117b7.f34313d instanceof C3743s)) {
                    c3733i2.m320H("application/octet-stream");
                }
                return c7117b7;
        }
    }

    @Override // ug.InterfaceC7435f
    /* renamed from: e */
    public /* synthetic */ String mo396e(String str, String str2) {
        return null;
    }

    @Override // p012n.InterfaceC4934n
    /* renamed from: f */
    public boolean mo397f(MenuC4929i menuC4929i) {
        return false;
    }

    @Override // dg.InterfaceC1715d
    /* renamed from: g */
    public C1714c mo398g(Context context, String str, InterfaceC1713b interfaceC1713b) {
        C1714c c1714c = new C1714c();
        int iMo5401a = interfaceC1713b.mo5401a(context, str, true);
        c1714c.f8341b = iMo5401a;
        if (iMo5401a != 0) {
            c1714c.f8342c = 1;
            return c1714c;
        }
        int iMo5402g = interfaceC1713b.mo5402g(context, str);
        c1714c.f8340a = iMo5402g;
        if (iMo5402g != 0) {
            c1714c.f8342c = -1;
        }
        return c1714c;
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(x0 x0Var) {
        switch (this.f537a) {
            case 2:
                return new C0181i((Context) x0Var.mo12234a(Context.class));
            default:
                return new C2628d((C0178f) x0Var.mo12234a(C0178f.class));
        }
    }

    @Override // d3.l0
    /* renamed from: i */
    public h0 mo399i(long j6, EnumC6757m enumC6757m, InterfaceC6747c interfaceC6747c) {
        return new d0(og.b2.m10543a(0L, j6));
    }

    public String toString() {
        switch (this.f537a) {
            case 5:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public C0174b(Context context, C0011j c0011j) {
        this.f537a = 3;
        AbstractC4154l.m8923f(context, "context");
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new C0542a(this));
    }

    public C0174b(v0 v0Var) {
        this.f537a = 4;
    }

    @Override // p012n.InterfaceC4934n
    /* renamed from: a */
    public void mo393a(MenuC4929i menuC4929i, boolean z6) {
    }
}
