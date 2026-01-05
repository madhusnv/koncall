package a2;

import ab.C0085c;
import ab.C0087e;
import an.C0214u;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.j0;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import bd.C0645a;
import cj.C0979e;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.StorageException;
import com.google.android.gms.internal.measurement.EnumC1307w;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0;
import com.google.crypto.tink.shaded.protobuf.C1386m;
import com.sun.mail.util.PropUtil;
import ec.C2003a;
import gx.AbstractC2747a;
import java.util.ArrayList;
import java.util.Properties;
import og.od;
import og.sa;
import og.ud;
import qa.C6150a;
import qw.C6363m;
import tb.AbstractC7094e;
import vb.AbstractC7694a;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0030c {
    /* renamed from: A */
    public static int m106A(int i10, int i11, int i12, int i13) {
        return a5.m3113r(i10) + i11 + i12 + i13;
    }

    /* renamed from: B */
    public static int m107B(int i10, int i11, int i12) {
        return C1386m.m4317G(i10) + i11 + i12;
    }

    /* renamed from: C */
    public static int m108C(int i10, int i11, int i12, int i13) {
        return s0.m3951a(i10) + i11 + i12 + i13;
    }

    /* renamed from: D */
    public static int m109D(int i10, int i11, int i12, int i13) {
        return C1386m.m4318H(i10) + i11 + i12 + i13;
    }

    /* renamed from: a */
    public static int m110a(float f6, int i10) {
        return AbstractC2747a.m6747k(TypedValue.applyDimension(i10, f6, Resources.getSystem().getDisplayMetrics()));
    }

    /* renamed from: b */
    public static int m111b(int i10, int i11, int i12) {
        return a5.m3113r(i10) + i11 + i12;
    }

    /* renamed from: c */
    public static int m112c(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    /* renamed from: d */
    public static int m113d(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    /* renamed from: e */
    public static Object m114e(EnumC1307w enumC1307w, int i10, ArrayList arrayList, int i11) {
        sa.m10888a(i10, enumC1307w.name(), arrayList);
        return arrayList.get(i11);
    }

    /* renamed from: f */
    public static String m115f(char c2, String str, String str2) {
        return str + c2 + str2;
    }

    /* renamed from: g */
    public static String m116g(long j6, String str, StringBuilder sb2) {
        sb2.append(j6);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: h */
    public static String m117h(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getMessage());
        return sb2.toString();
    }

    /* renamed from: i */
    public static String m118i(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: j */
    public static String m119j(String str, j0 j0Var, String str2) {
        return str + j0Var + str2;
    }

    /* renamed from: k */
    public static String m120k(String str, Exception exc) {
        return str + exc;
    }

    /* renamed from: l */
    public static String m121l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* renamed from: m */
    public static String m122m(String str, String str2, boolean z6) {
        return str + z6 + str2;
    }

    /* renamed from: n */
    public static String m123n(StringBuilder sb2, String str, char c2) {
        sb2.append(str);
        sb2.append(c2);
        return sb2.toString();
    }

    /* renamed from: o */
    public static String m124o(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    /* renamed from: p */
    public static StringBuilder m125p(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i10);
        sb2.append(str4);
        return sb2;
    }

    /* renamed from: q */
    public static StringBuilder m126q(C0214u c0214u, String str) {
        c0214u.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    /* renamed from: r */
    public static StringBuilder m127r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    /* renamed from: s */
    public static C6363m m128s(String str, Throwable th2) {
        return od.m10796a(new DeserializationException(str, th2));
    }

    /* renamed from: t */
    public static void m129t(C0087e c0087e, C0645a c0645a, C0979e c0979e) {
        c0087e.getClass();
        C2003a c2003a = AbstractC8923q.f42884c;
        C0085c c0085c = c0087e.f330a;
        ud.m10981g(c0645a, c2003a, c0085c.f316c);
        ud.m10981g(c0645a, AbstractC8923q.f42886e, c0085c.f323k);
        C2003a c2003a2 = AbstractC7694a.f37196a;
        String str = c0085c.f317d;
        ud.m10982h(c0645a, c2003a2, str);
        ud.m10982h(c0645a, AbstractC7094e.f34211a, str);
        ud.m10981g(c0645a, AbstractC7094e.f34214d, "cognito-idp");
        ud.m10981g(c0645a, AbstractC7094e.f34216f, c0085c.f319f);
        c0979e.m2783r(new C6150a());
    }

    /* renamed from: u */
    public static void m130u(String str, Exception exc, String str2, Consumer consumer) {
        consumer.accept(new StorageException(str, exc, str2));
    }

    /* renamed from: v */
    public static void m131v(String str, String str2, Logger logger) {
        logger.verbose(str + str2);
    }

    /* renamed from: w */
    public static void m132w(String str, String str2, String str3, Logger logger) {
        logger.verbose(str + str2 + str3);
    }

    /* renamed from: x */
    public static void m133x(StringBuilder sb2, boolean z6, String str, boolean z10, String str2) {
        sb2.append(z6);
        sb2.append(str);
        sb2.append(z10);
        sb2.append(str2);
    }

    /* renamed from: y */
    public static boolean m134y(String str, String str2, String str3, Properties properties, boolean z6) {
        return PropUtil.getBooleanProperty(properties, str + str2 + str3, z6);
    }

    /* renamed from: z */
    public static int m135z(int i10, int i11, int i12) {
        return s0.m3951a(i10) + i11 + i12;
    }
}
