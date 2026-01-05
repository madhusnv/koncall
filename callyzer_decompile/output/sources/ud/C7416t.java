package ud;

import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.nd;
import og.od;
import qw.C6363m;
import qw.C6366p;
import sq.n2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.t */
/* loaded from: classes.dex */
public final class C7416t implements InterfaceC7411o {

    /* renamed from: b */
    public static final C7416t f35212b = new C7416t();

    /* renamed from: c */
    public static final C6366p f35213c = nd.m10782c(new n2(4));

    /* renamed from: d */
    public static final C6366p f35214d = nd.m10782c(new n2(5));

    /* renamed from: a */
    public final String m13806a(String key) {
        AbstractC4154l.m8923f(key, "key");
        return System.getenv().get(key);
    }

    /* renamed from: b */
    public final C7406j m13807b() throws ClassNotFoundException {
        EnumC7408l enumC7408l;
        Object objM10796a;
        String property = System.getProperty("os.name");
        AbstractC4154l.m8922e(property, "getProperty(...)");
        Locale US = Locale.US;
        AbstractC4154l.m8922e(US, "US");
        String lowerCase = property.toLowerCase(US);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        Pattern patternCompile = Pattern.compile("[^a-z0-9+]");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        try {
            Class.forName("android.os.Build");
            enumC7408l = EnumC7408l.Android;
        } catch (ClassNotFoundException unused) {
            enumC7408l = AbstractC5178p.m10116x(strReplaceAll, "windows", false) ? EnumC7408l.Windows : AbstractC5178p.m10116x(strReplaceAll, "linux", false) ? EnumC7408l.Linux : AbstractC5178p.m10116x(strReplaceAll, "macosx", false) ? EnumC7408l.MacOs : EnumC7408l.Unknown;
        }
        try {
            objM10796a = System.getProperty("os.version");
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (objM10796a instanceof C6363m) {
            objM10796a = null;
        }
        return new C7406j(enumC7408l, (String) objM10796a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [byte[], java.io.Serializable] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m13808c(java.lang.String r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ud.C7414r
            if (r0 == 0) goto L13
            r0 = r8
            ud.r r0 = (ud.C7414r) r0
            int r1 = r0.f35209c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35209c = r1
            goto L18
        L13:
            ud.r r0 = new ud.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f35207a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f35209c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            og.od.m10798c(r8)     // Catch: java.io.IOException -> L49
            goto L46
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            og.od.m10798c(r8)
            ay.f r8 = tx.m0.f34659a     // Catch: java.io.IOException -> L49
            ay.e r8 = ay.ExecutorC0495e.f3538c     // Catch: java.io.IOException -> L49
            ud.s r2 = new ud.s     // Catch: java.io.IOException -> L49
            r5 = 0
            r2.<init>(r7, r4, r5)     // Catch: java.io.IOException -> L49
            r0.f35209c = r3     // Catch: java.io.IOException -> L49
            java.lang.Object r8 = tx.c0.m13475K(r8, r2, r0)     // Catch: java.io.IOException -> L49
            if (r8 != r1) goto L46
            return r1
        L46:
            byte[] r8 = (byte[]) r8     // Catch: java.io.IOException -> L49
            return r8
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.C7416t.m13808c(java.lang.String, ww.c):java.io.Serializable");
    }
}
