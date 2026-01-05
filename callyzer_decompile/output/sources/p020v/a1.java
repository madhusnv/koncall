package p020v;

import an.e4;
import an.h3;
import com.google.android.gms.internal.measurement.j4;
import e1.v0;
import fd.C2271i;
import fw.C2392f;
import hd.C2897i;
import i0.k2;
import i0.l2;
import i0.n2;
import i0.p2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k2.C3966o;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import mj.C4753a;
import og.ue;
import pg.r9;
import s3.AbstractC6744a;
import si.C6847c;
import yv.C8805t;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a1 {
    /* renamed from: A */
    public static void m14318A(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    /* renamed from: B */
    public static void m14319B(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    /* renamed from: C */
    public static void m14320C(C3966o c3966o, boolean z6, boolean z10, boolean z11) {
        c3966o.m8623p(z6);
        c3966o.m8623p(z10);
        c3966o.m8623p(z11);
    }

    /* renamed from: a */
    public static int m14321a(String str, StringBuilder sb2, List list) {
        int size = list.size();
        ue.m10986b(size, sb2);
        sb2.append(str);
        return size;
    }

    /* renamed from: b */
    public static int m14322b(ArrayList arrayList) {
        new LinkedHashSet();
        return arrayList.size();
    }

    /* renamed from: c */
    public static int m14323c(List list, StringBuilder sb2, String str, String str2, String str3) {
        int size = list.size();
        ue.m10986b(size, sb2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return size;
    }

    /* renamed from: d */
    public static C2392f m14324d(C3966o c3966o, int i10, C4409i c4409i, C3966o c3966o2, int i11) {
        c3966o.m8608Z(i10);
        C2392f c2392fM11854a = r9.m11854a(c4409i, c3966o2);
        c3966o.m8608Z(i11);
        return c2392fM11854a;
    }

    /* renamed from: e */
    public static C2897i m14325e(j4 j4Var, String str) {
        j4Var.getClass();
        j4Var.m3398p(str);
        return new C2897i();
    }

    /* renamed from: f */
    public static k2 m14326f(n2 n2Var, l2 l2Var, k2 k2Var, ArrayList arrayList, k2 k2Var2) {
        k2Var.m7356a(p2.m7409a(n2Var, l2Var));
        arrayList.add(k2Var2);
        return new k2();
    }

    /* renamed from: g */
    public static k2 m14327g(ArrayList arrayList, k2 k2Var) {
        arrayList.add(k2Var);
        return new k2();
    }

    /* renamed from: h */
    public static String m14328h(char c2, String str, String str2) {
        return str + str2 + c2;
    }

    /* renamed from: i */
    public static String m14329i(Class cls, StringBuilder sb2) {
        sb2.append(cls.getCanonicalName());
        return sb2.toString();
    }

    /* renamed from: j */
    public static String m14330j(String str, long j6) {
        return str + j6;
    }

    /* renamed from: k */
    public static String m14331k(String str, v0 v0Var, String str2) {
        String str3 = str + v0Var;
        AbstractC4154l.m8923f(str3, str2);
        return str3;
    }

    /* renamed from: l */
    public static String m14332l(String str, String str2, String str3, String str4) {
        C6847c.m13044a().m13045b(str);
        String str5 = str2 + str3;
        AbstractC4154l.m8923f(str5, str4);
        return str5;
    }

    /* renamed from: m */
    public static String m14333m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* renamed from: n */
    public static String m14334n(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    /* renamed from: o */
    public static String m14335o(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: p */
    public static String m14336p(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, str4);
        return string;
    }

    /* renamed from: q */
    public static StringBuilder m14337q(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    /* renamed from: r */
    public static StringBuilder m14338r(h3 h3Var, String str) {
        h3Var.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    /* renamed from: s */
    public static StringBuilder m14339s(e4 e4Var, String str) {
        e4Var.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    /* renamed from: t */
    public static HashMap m14340t(Class cls, C4753a c4753a) {
        HashMap map = new HashMap();
        map.put(cls, c4753a);
        return map;
    }

    /* renamed from: u */
    public static Map m14341u(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: v */
    public static KotlinNothingValueException m14342v(String str) {
        AbstractC6744a.m12908c(str);
        return new KotlinNothingValueException();
    }

    /* renamed from: w */
    public static C8849i m14343w(C2271i c2271i, C2271i c2271i2) {
        C8849i c8849i = new C8849i(4);
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        return c8849i;
    }

    /* renamed from: x */
    public static void m14344x(n2 n2Var, l2 l2Var, k2 k2Var, n2 n2Var2, l2 l2Var2) {
        k2Var.m7356a(p2.m7409a(n2Var, l2Var));
        k2Var.m7356a(p2.m7409a(n2Var2, l2Var2));
    }

    /* renamed from: y */
    public static void m14345y(String str, IllegalArgumentException illegalArgumentException) {
        C6847c.m13044a().m13045b(str);
        C6847c.m13044a().m13046c(illegalArgumentException);
    }

    /* renamed from: z */
    public static void m14346z(String str, String str2, C8805t c8805t, String str3) {
        c8805t.m16232g(str3, str + str2);
    }
}
