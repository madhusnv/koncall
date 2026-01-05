package xm;

import a2.AbstractC0030c;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import bo.C0716a;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.request.CallRecordingPathSuggestionRequest;
import fn.C2336i;
import hn.C2985b;
import hn.C2987d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import km.C4120o;
import kn.C4122b;
import ko.C4139g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5174l;
import og.pe;
import og.ue;
import pg.o6;
import qw.C6361k;
import rn.C6594w;
import rw.AbstractC6654d;
import rw.AbstractC6662l;
import rw.AbstractC6674x;
import u7.C7351a;
import ug.C7452w;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8193c;
import wx.C8203d;
import ym.InterfaceC8690a;
import yv.C8787b;
import yv.C8791f;
import yv.C8800o;
import yv.C8805t;
import yv.EnumC8786a;
import yx.C8810d;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: p */
    public static boolean f40812p;

    /* renamed from: r */
    public static final C7806h f40814r;

    /* renamed from: s */
    public static final C8203d f40815s;

    /* renamed from: a */
    public final Context f40816a;

    /* renamed from: b */
    public final C2987d f40817b;

    /* renamed from: c */
    public final gn.x2 f40818c;

    /* renamed from: d */
    public final C2336i f40819d;

    /* renamed from: e */
    public final x1 f40820e;

    /* renamed from: f */
    public final y5 f40821f;

    /* renamed from: g */
    public final C8810d f40822g;

    /* renamed from: h */
    public final C2985b f40823h;

    /* renamed from: i */
    public final C8805t f40824i;

    /* renamed from: j */
    public boolean f40825j;

    /* renamed from: k */
    public EnumC8786a f40826k;

    /* renamed from: l */
    public static final C7452w f40808l = new C7452w(24);

    /* renamed from: m */
    public static final ArrayList f40809m = new ArrayList();

    /* renamed from: n */
    public static final ArrayList f40810n = new ArrayList();

    /* renamed from: o */
    public static final ArrayList f40811o = new ArrayList();

    /* renamed from: q */
    public static boolean f40813q = true;

    static {
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        f40814r = c7806hM11805a;
        f40815s = wx.c1.m15389t(c7806hM11805a);
    }

    public s2(Context context, C2987d remoteDataSource, gn.x2 localDataSource, C2336i dataStoreSource, x1 x1Var, y5 userSIMRepository, C8810d c8810d, C2985b noAuthDataSource, C8805t c8805t) {
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(noAuthDataSource, "noAuthDataSource");
        this.f40816a = context;
        this.f40817b = remoteDataSource;
        this.f40818c = localDataSource;
        this.f40819d = dataStoreSource;
        this.f40820e = x1Var;
        this.f40821f = userSIMRepository;
        this.f40822g = c8810d;
        this.f40823h = noAuthDataSource;
        this.f40824i = c8805t;
        String BRAND = Build.BRAND;
        AbstractC4154l.m8922e(BRAND, "BRAND");
        String lowerCase = BRAND.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        if (AbstractC6662l.m12713c(C8787b.f42451a, lowerCase)) {
            tx.c0.m13502y(c8810d, null, null, new C7351a(this, null, 28), 3);
        }
    }

    /* renamed from: e */
    public static String m15616e(String str, String pattern) {
        AbstractC4154l.m8923f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        AbstractC4154l.m8922e(matcher, "matcher(...)");
        C5174l c5174lM10640a = og.f2.m10640a(matcher, 0, str);
        if (c5174lM10640a == null) {
            return null;
        }
        String strGroup = c5174lM10640a.f25280a.group();
        AbstractC4154l.m8922e(strGroup, "group(...)");
        return strGroup;
    }

    /* renamed from: l */
    public static String m15617l(String str, EnumC8786a enumC8786a) {
        AbstractC4154l.m8923f(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        if (AbstractC6662l.m12713c(C8787b.f42451a, lowerCase)) {
            switch (enumC8786a == null ? -1 : m2.f40576a[enumC8786a.ordinal()]) {
                case -1:
                    throw new IllegalStateException("DateTime variant not provided for device to get DateTimePattern");
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return "yyyyMMddHHmmss";
                case 2:
                case 5:
                case 7:
                    return "yyyy-MM-dd_HH.mm.ss";
                case 3:
                    return "yyyyMMdd_HH_mm_ss";
                case 4:
                case 6:
                    return "yyyyMMdd_HHmmss";
            }
        }
        switch (str.hashCode()) {
            case -1320380160:
                return !str.equals("oneplus") ? "yyyy-MM-dd HH:mm:ss" : Build.VERSION.SDK_INT == 28 ? "yyyyMMddHHmmss" : "yyMMddHHmm";
            case -1090979175:
                return !str.equals("truecaller") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMdd-HHmmss";
            case -934971466:
                return !str.equals("realme") ? "yyyy-MM-dd HH:mm:ss" : "yyMMddHHmm";
            case -759499589:
                return !str.equals("xiaomi") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMddHHmmss";
            case 3003984:
                return !str.equals("asus") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMdd_HHmmss";
            case 3240200:
                return !str.equals("iqoo") ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd HH-mm-ss";
            case 3418016:
                return !str.equals("oppo") ? "yyyy-MM-dd HH:mm:ss" : "yyMMddHHmm";
            case 3446443:
                return !str.equals("poco") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMddHHmmss";
            case 3620012:
                return !str.equals("vivo") ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd HH-mm-ss";
            case 99462250:
                return !str.equals("honor") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMddHHmmss";
            case 108389869:
                return !str.equals("redmi") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMddHHmmss";
            case 110235987:
                return !str.equals("tecno") ? "yyyy-MM-dd HH:mm:ss" : "yyyyMMdd_HHmmss";
            case 1864941562:
                return !str.equals("samsung") ? "yyyy-MM-dd HH:mm:ss" : "yyMMdd_HHmmss";
            default:
                return "yyyy-MM-dd HH:mm:ss";
        }
    }

    /* renamed from: a */
    public final C6361k m15618a() {
        C8791f c8791f = C8791f.f42457a;
        Context context = this.f40816a;
        AbstractC4154l.m8923f(context, "context");
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(1);
        AbstractC4154l.m8922e(installedPackages, "getInstalledPackages(...)");
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (it.hasNext()) {
            String str = it.next().packageName;
            if (str != null && AbstractC5185w.m10130l(str, "com.truecaller", true)) {
                return new C6361k("truecaller", "\\d{4}[01]\\d[0-3]\\d-[0-2]\\d[0-5]\\d[0-5]\\d");
            }
        }
        return new C6361k("notFound", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15619b(uw.InterfaceC7559c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xm.n2
            if (r0 == 0) goto L13
            r0 = r5
            xm.n2 r0 = (xm.n2) r0
            int r1 = r0.f40620d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40620d = r1
            goto L18
        L13:
            xm.n2 r0 = new xm.n2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f40618b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40620d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xm.s2 r0 = r0.f40617a
            og.od.m10798c(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            og.od.m10798c(r5)
            r0.f40617a = r4
            r0.f40620d = r3
            xm.y5 r5 = r4.f40821f
            java.lang.Object r5 = r5.m15696l(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r1 = r5 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L54
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L54
        L52:
            r3 = r2
            goto L68
        L54:
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r5.next()
            mm.m r1 = (mm.C4802m) r1
            boolean r1 = r1.f23905q
            if (r1 == 0) goto L58
        L68:
            r0.f40825j = r3
            boolean r5 = r4.f40825j
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.s2.m15619b(uw.c):java.lang.Object");
    }

    /* renamed from: c */
    public final Object m15620c(AbstractC8193c abstractC8193c) {
        return ((C4120o) this.f40819d.f10585a).m8879a("is_recording_folder_locked", abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15621d(java.lang.String r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof xm.o2
            if (r0 == 0) goto L13
            r0 = r10
            xm.o2 r0 = (xm.o2) r0
            int r1 = r0.f40666d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40666d = r1
            goto L18
        L13:
            xm.o2 r0 = new xm.o2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f40664b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40666d
            java.lang.String r3 = " >> httpException"
            r4 = 0
            yv.t r5 = r8.f40824i
            r6 = 1
            java.lang.String r7 = "checkRecordingExitsInAws >> "
            if (r2 == 0) goto L3a
            if (r2 != r6) goto L32
            java.lang.String r9 = r0.f40663a
            og.od.m10798c(r10)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            goto L4c
        L30:
            r10 = move-exception
            goto L75
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            og.od.m10798c(r10)
            hn.b r10 = r8.f40823h     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r0.f40663a = r9     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r0.f40666d = r6     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            ym.i r10 = r10.f16123a     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            java.lang.Object r10 = r10.m16097c(r9, r0)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            if (r10 != r1) goto L4c
            return r1
        L4c:
            i00.p0 r10 = (i00.p0) r10     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            iz.k0 r10 = r10.f16730a     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            int r10 = r10.f17920d     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 == r0) goto L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r0.<init>(r7)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r0.append(r9)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            java.lang.String r1 = " >> "
            r0.append(r1)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r0.append(r10)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r5.m16231f(r10)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            r10 = r4
            goto L70
        L6f:
            r10 = r6
        L70:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Exception -> L30 java.io.IOException -> L91 retrofit2.HttpException -> La5
            return r9
        L75:
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r9)
            java.lang.String r9 = " >> exception >> "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            r5.m16231f(r9)
            goto Lb8
        L91:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
            r10.append(r9)
            r10.append(r3)
            java.lang.String r9 = r10.toString()
            r5.m16231f(r9)
        La3:
            r4 = r6
            goto Lb8
        La5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
            r10.append(r9)
            r10.append(r3)
            java.lang.String r9 = r10.toString()
            r5.m16231f(r9)
            goto La3
        Lb8:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.s2.m15621d(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final long m15622f(Uri uri, String name) {
        String strM15616e;
        String strM15616e2;
        C8805t c8805t = this.f40824i;
        AbstractC4154l.m8923f(uri, "uri");
        AbstractC4154l.m8923f(name, "name");
        if (name.length() != 0) {
            String BRAND = Build.BRAND;
            AbstractC4154l.m8922e(BRAND, "BRAND");
            Locale locale = Locale.ROOT;
            String lowerCase = BRAND.toLowerCase(locale);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            String strA0 = lowerCase.equals("tecno") ? AbstractC5178p.a0(name, "_") : name;
            try {
                String[] strArr = C8787b.f42451a;
                String lowerCase2 = BRAND.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                if (AbstractC6662l.m12713c(strArr, lowerCase2)) {
                    EnumC8786a enumC8786a = this.f40826k;
                    if (enumC8786a != null) {
                        C6361k c6361kM15628m = m15628m(uri, enumC8786a);
                        Object obj = c6361kM15628m.f30756b;
                        if (AbstractC5178p.m10101L((CharSequence) obj)) {
                            c8805t.m16231f("supportedDateTimeVariant >> selected variant pattern now not found");
                            return 0L;
                        }
                        String strM15616e3 = m15616e(strA0, (String) obj);
                        if (strM15616e3 != null && strM15616e3.length() != 0) {
                            C8800o c8800o = C8800o.f42459a;
                            return C8800o.m16192a(m15617l((String) c6361kM15628m.f30755a, this.f40826k), strM15616e3);
                        }
                        c8805t.m16231f("supportedDateTimeVariant >> selected variant pattern can not found dateTime in >> ".concat(name));
                        return 0L;
                    }
                    AbstractC6654d abstractC6654d = (AbstractC6654d) EnumC8786a.getEntries();
                    abstractC6654d.getClass();
                    e1.x0 x0Var = new e1.x0(7, abstractC6654d);
                    while (x0Var.hasNext()) {
                        EnumC8786a enumC8786a2 = (EnumC8786a) x0Var.next();
                        C6361k c6361kM15628m2 = m15628m(uri, enumC8786a2);
                        Object obj2 = c6361kM15628m2.f30756b;
                        if (!AbstractC5178p.m10101L((CharSequence) obj2) && (strM15616e2 = m15616e(strA0, (String) obj2)) != null && strM15616e2.length() != 0) {
                            C8800o c8800o2 = C8800o.f42459a;
                            long jM16192a = C8800o.m16192a(m15617l((String) c6361kM15628m2.f30755a, enumC8786a2), strM15616e2);
                            if (jM16192a > 0) {
                                this.f40826k = enumC8786a2;
                                return jM16192a;
                            }
                        }
                    }
                    c8805t.m16231f("supportedDateTimeVariant >> non of the variant able to find date time in " + name);
                    return 0L;
                }
                C6361k c6361kM15628m3 = m15628m(uri, null);
                Object obj3 = c6361kM15628m3.f30755a;
                Object obj4 = c6361kM15628m3.f30756b;
                if (!AbstractC5178p.m10101L((CharSequence) obj4) && (strM15616e = m15616e(strA0, (String) obj4)) != null && strM15616e.length() != 0) {
                    if (((String) obj3).contentEquals("oneplus") && Build.VERSION.SDK_INT != 28) {
                        strM15616e = AbstractC5185w.m10136r(strM15616e, "-", "");
                    }
                    C8800o c8800o3 = C8800o.f42459a;
                    return C8800o.m16192a(m15617l((String) obj3, null), strM15616e);
                }
            } catch (IllegalStateException e2) {
                c8805t.m16231f("findDateTimeFromName >> " + e2.getMessage());
                c8805t.m16238m("findDateTimeFromName >> " + e2.getMessage(), e2);
                return 0L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15623g(long r5, ww.AbstractC8193c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof xm.p2
            if (r0 == 0) goto L13
            r0 = r7
            xm.p2 r0 = (xm.p2) r0
            int r1 = r0.f40707d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40707d = r1
            goto L18
        L13:
            xm.p2 r0 = new xm.p2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f40705b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40707d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r5 = r0.f40704a
            og.od.m10798c(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r7)
            r0.f40704a = r5
            r0.f40707d = r3
            fn.i r7 = r4.f40819d
            java.lang.Object r7 = r7.m6026f(r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L4d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L4d
            goto L6a
        L69:
            r0 = 0
        L6a:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L79
            java.lang.Object r5 = r0.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L7a
        L79:
            r5 = -1
        L7a:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.s2.m15623g(long, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final Object m15624h(boolean z6, AbstractC8193c abstractC8193c) {
        an.h3 h3Var = this.f40818c.f14941a;
        h3Var.getClass();
        List listM10834i = z6 ? pe.m10834i(EnumC8993c.SUCCESS, EnumC8993c.COMPRESS_IN_PROGRESS) : pe.m10834i(EnumC8993c.SUCCESS, EnumC8993c.COMPRESS_IN_PROGRESS, EnumC8993c.UPLOAD_IN_PROGRESS);
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT * FROM CallLog WHERE call_record_compress_path NOT NULL AND (COALESCE(call_record_sync_status, '') NOT IN (");
        ue.m10986b(listM10834i.size(), sbM4568o);
        sbM4568o.append(")) ORDER BY date_time DESC");
        String string = sbM4568o.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return pe.m10839n(abstractC8193c, h3Var.f899a, true, false, new an.w1(1, string, listM10834i, h3Var));
    }

    /* renamed from: i */
    public final Object m15625i(CallRecordingPathSuggestionRequest callRecordingPathSuggestionRequest, C0716a c0716a) {
        return this.f40817b.f16127a.m16052F(callRecordingPathSuggestionRequest.m321I(), AbstractC6674x.m12779g(new C6361k("deviceModel", callRecordingPathSuggestionRequest.m4641P()), new C6361k("androidVersion", callRecordingPathSuggestionRequest.m4639N()), new C6361k("deviceBrand", callRecordingPathSuggestionRequest.m4640O()), new C6361k("dialerPackageName", callRecordingPathSuggestionRequest.m4642Q())), c0716a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15626j(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof xm.q2
            if (r0 == 0) goto L13
            r0 = r8
            xm.q2 r0 = (xm.q2) r0
            int r1 = r0.f40736d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40736d = r1
            goto L18
        L13:
            xm.q2 r0 = new xm.q2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f40734b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40736d
            fn.i r3 = r7.f40819d
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            long r0 = r0.f40733a
            og.od.m10798c(r8)
            goto L5c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            og.od.m10798c(r8)
            goto L48
        L3a:
            og.od.m10798c(r8)
            r0.f40736d = r5
            java.lang.String r8 = "last_free_space_checked"
            java.lang.Object r8 = r3.m6024d(r8, r0)
            if (r8 != r1) goto L48
            goto L5a
        L48:
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            r0.f40733a = r5
            r0.f40736d = r4
            java.lang.String r8 = "cloud_free_space"
            java.lang.Object r8 = r3.m6024d(r8, r0)
            if (r8 != r1) goto L5b
        L5a:
            return r1
        L5b:
            r0 = r5
        L5c:
            java.lang.Number r8 = (java.lang.Number) r8
            long r2 = r8.longValue()
            mm.e r8 = new mm.e
            r8.<init>(r0, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.s2.m15626j(ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public final Object m15627k(C4802m userSimDetails, C6594w c6594w) {
        InterfaceC8690a interfaceC8690a = this.f40817b.f16127a;
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        return interfaceC8690a.m16053G(AbstractC6674x.m12779g(new C6361k("DCC", String.valueOf(userSimDetails.f23897i)), new C6361k("employeeNumber", String.valueOf(userSimDetails.f23891c)), new C6361k("employeeId", userSimDetails.f23908t)), c6594w);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: m */
    public final C6361k m15628m(Uri uri, EnumC8786a enumC8786a) {
        int i10;
        String string = uri.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        if (AbstractC5178p.m10116x(string, "TCCallRecordings", true)) {
            C6361k c6361kM15618a = m15618a();
            if (((String) c6361kM15618a.f30755a).contentEquals("truecaller")) {
                return c6361kM15618a;
            }
        }
        String BRAND = Build.BRAND;
        AbstractC4154l.m8922e(BRAND, "BRAND");
        String lowerCase = BRAND.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        C8805t c8805t = this.f40824i;
        switch (iHashCode) {
            case -1320380160:
                if (lowerCase.equals("oneplus")) {
                    return Build.VERSION.SDK_INT == 28 ? new C6361k("oneplus", "(20[0-9]{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9])") : new C6361k("oneplus", "-([0-9]{2}(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9]))");
                }
                break;
            case -934971466:
                if (lowerCase.equals("realme")) {
                    return new C6361k("realme", "(2[0-9])(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])");
                }
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    return new C6361k("xiaomi", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                }
                break;
            case 3003984:
                if (lowerCase.equals("asus")) {
                    return new C6361k("asus", "^(20[0-9]{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])_([01][0-9]|2[0-3])([0-5][0-9])([0-5][0-9])");
                }
                break;
            case 3240200:
                if (lowerCase.equals("iqoo")) {
                    return new C6361k("iqoo", "(((19|2[0-9])[0-9]{2})-(1[0-2]|0[1-9])-(0[1-9]|[12][0-9]|3[01]) (2[0-3]|[01][0-9])-([0-5][0-9])-([0-5][0-9]))");
                }
                break;
            case 3242770:
                if (lowerCase.equals("itel")) {
                    i10 = enumC8786a != null ? m2.f40576a[enumC8786a.ordinal()] : -1;
                    if (i10 == 6) {
                        return new C6361k("itel", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                    }
                    if (i10 == 7) {
                        return new C6361k("itel", "([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])\\.(0[0-9]|[1-5][0-9])\\.(0[0-9]|[1-5][0-9])");
                    }
                    c8805t.m16231f(enumC8786a + " is not for device >> " + BRAND);
                    return new C6361k("itel", "");
                }
                break;
            case 3314400:
                if (lowerCase.equals("lava")) {
                    i10 = enumC8786a != null ? m2.f40576a[enumC8786a.ordinal()] : -1;
                    if (i10 == 1) {
                        return new C6361k("lava", "(19|2[0-9])[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])(0[0-9]|1[0-9]|2[0-3])([0-5][0-9])([0-5][0-9])");
                    }
                    if (i10 == 2) {
                        return new C6361k("lava", "([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])\\.(0[0-9]|[1-5][0-9])\\.(0[0-9]|[1-5][0-9])");
                    }
                    if (i10 == 3) {
                        return new C6361k("lava", "(2[0-9][0-9]{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])_(0[0-9]|1[0-9]|2[0-3])_([0-5][0-9])_([0-5][0-9])");
                    }
                    c8805t.m16231f(enumC8786a + " is not for device >> " + BRAND);
                    return new C6361k("lava", "");
                }
                break;
            case 3418016:
                if (lowerCase.equals("oppo")) {
                    return new C6361k("oppo", "(2[0-9])(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])");
                }
                break;
            case 3446443:
                if (lowerCase.equals("poco")) {
                    return new C6361k("poco", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                }
                break;
            case 3620012:
                if (lowerCase.equals("vivo")) {
                    return new C6361k("vivo", "(((19|2[0-9])[0-9]{2})-(1[0-2]|0[1-9])-(0[1-9]|[12][0-9]|3[01]) (2[0-3]|[01][0-9])-([0-5][0-9])-([0-5][0-9]))");
                }
                break;
            case 99462250:
                if (lowerCase.equals("honor")) {
                    return new C6361k("honor", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                }
                break;
            case 108389869:
                if (lowerCase.equals("redmi")) {
                    return new C6361k("redmi", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                }
                break;
            case 110235987:
                if (lowerCase.equals("tecno")) {
                    return new C6361k("tecno", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                }
                break;
            case 1864941562:
                if (lowerCase.equals("samsung")) {
                    return new C6361k("samsung", "([0-9]{2}(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                }
                break;
            case 1945248885:
                if (lowerCase.equals("infinix")) {
                    i10 = enumC8786a != null ? m2.f40576a[enumC8786a.ordinal()] : -1;
                    if (i10 == 4) {
                        return new C6361k("infinix", "(((19|2[0-9])[0-9]{2})(1[0-2]|0[1-9])(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])([0-5][0-9])([0-5][0-9]))");
                    }
                    if (i10 == 5) {
                        return new C6361k("infinix", "([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])_(2[0-3]|[01][0-9])\\.(0[0-9]|[1-5][0-9])\\.(0[0-9]|[1-5][0-9])");
                    }
                    c8805t.m16231f(enumC8786a + " is not for device >> " + BRAND);
                    return new C6361k("infinix", "");
                }
                break;
        }
        return m15618a();
    }

    /* renamed from: n */
    public final Object m15629n(AbstractC8193c abstractC8193c) {
        return this.f40819d.m6026f(abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15630o(java.lang.String r13, ww.AbstractC8193c r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Invalid 'Content-Length' value: "
            java.lang.String r1 = "getRecordingFileSizeOnAws >> status not success >>"
            boolean r2 = r14 instanceof xm.r2
            if (r2 == 0) goto L17
            r2 = r14
            xm.r2 r2 = (xm.r2) r2
            int r3 = r2.f40776d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f40776d = r3
            goto L1c
        L17:
            xm.r2 r2 = new xm.r2
            r2.<init>(r12, r14)
        L1c:
            java.lang.Object r14 = r2.f40774b
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f40776d
            yv.t r5 = r12.f40824i
            r6 = 1
            if (r4 == 0) goto L3b
            if (r4 != r6) goto L33
            java.lang.String r13 = r2.f40773a
            og.od.m10798c(r14)     // Catch: java.lang.Exception -> L2f
            goto L4d
        L2f:
            r0 = move-exception
            r14 = r0
            goto Lac
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            og.od.m10798c(r14)
            hn.b r14 = r12.f40823h     // Catch: java.lang.Exception -> L2f
            r2.f40773a = r13     // Catch: java.lang.Exception -> L2f
            r2.f40776d = r6     // Catch: java.lang.Exception -> L2f
            ym.i r14 = r14.f16123a     // Catch: java.lang.Exception -> L2f
            java.lang.Object r14 = r14.m16097c(r13, r2)     // Catch: java.lang.Exception -> L2f
            if (r14 != r3) goto L4d
            return r3
        L4d:
            i00.p0 r14 = (i00.p0) r14     // Catch: java.lang.Exception -> L2f
            iz.k0 r14 = r14.f16730a     // Catch: java.lang.Exception -> L2f
            int r2 = r14.f17920d     // Catch: java.lang.Exception -> L2f
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L8d
            iz.v r14 = r14.f17922f     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "content-length"
            java.lang.String r14 = r14.m7787b(r1)     // Catch: java.lang.Exception -> L2f
            if (r14 == 0) goto L85
            boolean r1 = nx.AbstractC5178p.m10101L(r14)     // Catch: java.lang.Exception -> L2f
            if (r1 != 0) goto L85
            java.lang.Long r1 = nx.AbstractC5185w.m10141w(r14)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L77
            long r13 = r1.longValue()     // Catch: java.lang.Exception -> L2f
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r13)
            return r0
        L77:
            com.amplifyframework.auth.exceptions.InvalidStateException r6 = new com.amplifyframework.auth.exceptions.InvalidStateException     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = r0.concat(r14)     // Catch: java.lang.Exception -> L2f
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2f
            throw r6     // Catch: java.lang.Exception -> L2f
        L85:
            com.websoptimization.callyzerbiz.common.exception.DataNotFoundException r14 = new com.websoptimization.callyzerbiz.common.exception.DataNotFoundException     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "Missing 'Content-Length' header in response."
            r14.<init>(r0)     // Catch: java.lang.Exception -> L2f
            throw r14     // Catch: java.lang.Exception -> L2f
        L8d:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r14.<init>(r1)     // Catch: java.lang.Exception -> L2f
            r14.append(r13)     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = " >> "
            r14.append(r0)     // Catch: java.lang.Exception -> L2f
            r14.append(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L2f
            r5.m16231f(r14)     // Catch: java.lang.Exception -> L2f
            com.websoptimization.callyzerbiz.common.exception.DataNotFoundException r14 = new com.websoptimization.callyzerbiz.common.exception.DataNotFoundException     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "response was not success"
            r14.<init>(r0)     // Catch: java.lang.Exception -> L2f
            throw r14     // Catch: java.lang.Exception -> L2f
        Lac:
            java.lang.String r0 = r14.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getRecordingFileSizeOnAws >> "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = " >> exception >> "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r13 = r1.toString()
            r5.m16231f(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.s2.m15630o(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: p */
    public final String m15631p(C4122b doc) {
        AbstractC4154l.m8923f(doc, "doc");
        String str = doc.f21064b;
        String strSubstring = str.substring(0, AbstractC5178p.m10103N(str, '.', 0, 6));
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        Object obj = m15628m(doc.f21063a, this.f40826k).f30756b;
        if (!AbstractC5178p.m10101L((CharSequence) obj)) {
            String strM15616e = m15616e(strSubstring, (String) obj);
            return (strM15616e == null || strM15616e.length() == 0) ? "" : AbstractC5178p.g0(AbstractC5185w.m10136r(strSubstring, strM15616e, "")).toString();
        }
        String BRAND = Build.BRAND;
        AbstractC4154l.m8922e(BRAND, "BRAND");
        String lowerCase = BRAND.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        if (!AbstractC6662l.m12713c(C8787b.f42451a, lowerCase) || this.f40826k != null) {
            throw new IllegalStateException(AbstractC0030c.m121l("Pattern already get earlier still not found here, doc name:- ", strSubstring, ", BRAND NAME:- ", BRAND));
        }
        this.f40824i.m16231f("removeDateTimeInDocName >>> Date time variant not set for this brand");
        return "";
    }

    /* renamed from: q */
    public final Object m15632q(rn.j0 j0Var) {
        EnumC8786a enumC8786a = this.f40826k;
        C8805t c8805t = this.f40824i;
        if (enumC8786a == null) {
            c8805t.m16231f("supportedDateTimeVariant >> recording found without having variant, this should not be happened");
        }
        EnumC8786a enumC8786a2 = this.f40826k;
        qw.a0 a0Var = qw.a0.f30746a;
        if (enumC8786a2 != null) {
            c8805t.m16231f("supportedDateTimeVariant >> setting variant : " + enumC8786a2);
            Object objM8891m = ((C4120o) this.f40819d.f10585a).m8891m("date_time_recording_variant", enumC8786a2.name(), j0Var);
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (objM8891m != enumC7794a) {
                objM8891m = a0Var;
            }
            if (objM8891m == enumC7794a) {
                return objM8891m;
            }
        }
        return a0Var;
    }

    /* renamed from: r */
    public final Object m15633r(boolean z6, C4139g c4139g) {
        Object objM8887i = ((C4120o) this.f40819d.f10585a).m8887i("retryRecordingNotFoundMigration", z6, c4139g);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM8887i != enumC7794a) {
            objM8887i = a0Var;
        }
        return objM8887i == enumC7794a ? objM8887i : a0Var;
    }

    /* renamed from: s */
    public final Object m15634s(int i10, String str, AbstractC8193c abstractC8193c) {
        Object objG0 = this.f40818c.G0(i10, str, abstractC8193c);
        return objG0 == EnumC7794a.COROUTINE_SUSPENDED ? objG0 : qw.a0.f30746a;
    }
}
