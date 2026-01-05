package wi;

import a1.d0;
import a9.C0073l;
import aj.C0161a;
import al.C0182j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import bk.C0677h;
import c9.C0910e;
import c9.C0927v;
import cj.C0976b;
import cj.C0977c;
import cj.C0979e;
import eb.C1979c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k0.ExecutorC3897g;
import nz.C5213x;
import pg.l8;
import tb.C7105p;
import ti.C7162b;
import ui.InterfaceC7470a;
import xi.AbstractC8383a;
import xi.C8386d;
import yg.AbstractC8651h;
import yg.C8650g;
import yg.C8654k;
import yg.C8656m;
import yi.C8676e;
import yi.C8677f;
import yi.C8684m;
import yi.InterfaceC8675d;
import zi.a0;
import zi.b0;
import zi.h1;
import zi.i0;
import zi.j0;
import zi.k0;
import zi.k1;
import zi.l1;
import zi.m0;
import zi.m1;
import zi.m2;
import zi.n1;
import zi.n2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.l */
/* loaded from: classes.dex */
public final class C8062l {

    /* renamed from: r */
    public static final C0976b f38597r = new C0976b(3);

    /* renamed from: s */
    public static final Charset f38598s = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f38599a;

    /* renamed from: b */
    public final C0073l f38600b;

    /* renamed from: c */
    public final C7105p f38601c;

    /* renamed from: d */
    public final C0979e f38602d;

    /* renamed from: e */
    public final C8386d f38603e;

    /* renamed from: f */
    public final C8072v f38604f;

    /* renamed from: g */
    public final C0979e f38605g;

    /* renamed from: h */
    public final C8051a f38606h;

    /* renamed from: i */
    public final C8677f f38607i;

    /* renamed from: j */
    public final C7162b f38608j;

    /* renamed from: k */
    public final InterfaceC7470a f38609k;

    /* renamed from: l */
    public final C8059i f38610l;

    /* renamed from: m */
    public final C0979e f38611m;

    /* renamed from: n */
    public C8068r f38612n;

    /* renamed from: o */
    public final C8650g f38613o = new C8650g();

    /* renamed from: p */
    public final C8650g f38614p = new C8650g();

    /* renamed from: q */
    public final C8650g f38615q = new C8650g();

    public C8062l(Context context, C8072v c8072v, C0073l c0073l, C0979e c0979e, C7105p c7105p, C8051a c8051a, C0979e c0979e2, C8677f c8677f, C0979e c0979e3, C7162b c7162b, InterfaceC7470a interfaceC7470a, C8059i c8059i, C8386d c8386d) {
        new AtomicBoolean(false);
        this.f38599a = context;
        this.f38604f = c8072v;
        this.f38600b = c0073l;
        this.f38605g = c0979e;
        this.f38601c = c7105p;
        this.f38606h = c8051a;
        this.f38602d = c0979e2;
        this.f38607i = c8677f;
        this.f38608j = c7162b;
        this.f38609k = interfaceC7470a;
        this.f38610l = c8059i;
        this.f38611m = c0979e3;
        this.f38603e = c8386d;
    }

    /* renamed from: a */
    public static C8656m m15197a(C8062l c8062l) {
        C8656m c8656mM11762c;
        c8062l.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C0979e.m2769x(((File) c8062l.f38605g.f5804c).listFiles(f38597r))) {
            try {
                long j6 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    c8656mM11762c = l8.m11765f(null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    c8656mM11762c = l8.m11762c(new ScheduledThreadPoolExecutor(1), new CallableC8061k(c8062l, j6));
                }
                arrayList.add(c8656mM11762c);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return l8.m11766g(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0432 A[LOOP:2: B:137:0x0432->B:139:0x0438, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0650 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15198b(boolean r32, io.C3328c r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.C8062l.m15198b(boolean, io.c, boolean):void");
    }

    /* renamed from: c */
    public final void m15199c(String str, Boolean bool) {
        String str2;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        C8072v c8072v = this.f38604f;
        C8051a c8051a = this.f38606h;
        l1 l1Var = new l1(c8072v.f38659c, c8051a.f38567f, c8051a.f38568g, c8072v.m15212c().f38573a, EnumC8069s.determineFrom(c8051a.f38565d).getId(), c8051a.f38569h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(AbstractC8057g.m15193g());
        Context context = this.f38599a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iOrdinal = EnumC8056f.getValue().ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM15187a = AbstractC8057g.m15187a(context);
        boolean zM15192f = AbstractC8057g.m15192f();
        int iM15189c = AbstractC8057g.m15189c();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        m1 m1Var = new m1(iOrdinal, iAvailableProcessors, jM15187a, statFs.getBlockCount() * statFs.getBlockSize(), zM15192f, iM15189c);
        C7162b c7162b = this.f38608j;
        k1 k1Var = new k1(l1Var, n1Var, m1Var);
        c7162b.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        c7162b.f34411a.m12249a(new C0677h(str, jCurrentTimeMillis, k1Var));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
        } else {
            C0979e c0979e = this.f38602d;
            synchronized (((String) c0979e.f5802a)) {
                c0979e.f5802a = str;
                C8676e c8676e = (C8676e) ((AtomicMarkableReference) ((C0182j) c0979e.f5805d).f555b).getReference();
                synchronized (c8676e) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c8676e.f42011a));
                }
                str2 = str7;
                ((C8386d) c0979e.f5804c).f40064b.m15551a(new d0(c0979e, str, mapUnmodifiableMap, ((C5213x) c0979e.f5807f).m10207a(), 8));
            }
        }
        C8677f c8677f = this.f38607i;
        ((InterfaceC8675d) c8677f.f42016b).mo13824b();
        c8677f.f42016b = C8677f.f42014c;
        if (str != null) {
            c8677f.f42016b = new C8684m(((C0979e) c8677f.f42015a).m2781o(str, "userlog"));
        }
        this.f38610l.m15196a(str);
        C0979e c0979e2 = this.f38611m;
        C8067q c8067q = (C8067q) c0979e2.f5802a;
        Charset charset = n2.f43216a;
        a0 a0Var = new a0();
        a0Var.f42972a = "20.0.0";
        C8051a c8051a2 = c8067q.f38643c;
        String str8 = c8051a2.f38562a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0Var.f42973b = str8;
        C8072v c8072v2 = c8067q.f38642b;
        String str9 = c8072v2.m15212c().f38573a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0Var.f42975d = str9;
        a0Var.f42976e = c8072v2.m15212c().f38574b;
        a0Var.f42977f = c8072v2.m15212c().f38575c;
        String str10 = c8051a2.f38567f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0Var.f42979h = str10;
        String str11 = c8051a2.f38568g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0Var.f42980i = str11;
        a0Var.f42974c = 4;
        a0Var.f42984m = (byte) (a0Var.f42984m | 1);
        i0 i0Var = new i0();
        i0Var.f43112f = false;
        byte b10 = (byte) (i0Var.f43119m | 2);
        i0Var.f43110d = jCurrentTimeMillis;
        i0Var.f43119m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i0Var.f43108b = str;
        String str12 = C8067q.f38640g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        i0Var.f43107a = str12;
        String str13 = c8072v2.f38659c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = c8072v2.m15212c().f38573a;
        C0910e c0910e = c8051a2.f38569h;
        if (((C1979c) c0910e.f5580c) == null) {
            c0910e.f5580c = new C1979c(c0910e);
        }
        C1979c c1979c = (C1979c) c0910e.f5580c;
        String str15 = c1979c.f9280a;
        if (c1979c == null) {
            c0910e.f5580c = new C1979c(c0910e);
        }
        i0Var.f43113g = new k0(str13, str10, str11, str14, str15, ((C1979c) c0910e.f5580c).f9281b);
        h1 h1Var = new h1();
        h1Var.f43092a = 3;
        h1Var.f43096e = (byte) (h1Var.f43096e | 1);
        if (str3 == null) {
            throw new NullPointerException("Null version");
        }
        h1Var.f43093b = str3;
        if (str4 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        h1Var.f43094c = str4;
        h1Var.f43095d = AbstractC8057g.m15193g();
        h1Var.f43096e = (byte) (h1Var.f43096e | 2);
        i0Var.f43115i = h1Var.m16448a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str16 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str16) && (num = (Integer) C8067q.f38639f.get(str16.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM15187a2 = AbstractC8057g.m15187a(c8067q.f38641a);
        long blockCount = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zM15192f2 = AbstractC8057g.m15192f();
        int iM15189c2 = AbstractC8057g.m15189c();
        m0 m0Var = new m0();
        m0Var.f43184a = iIntValue;
        byte b11 = (byte) (m0Var.f43193j | 1);
        m0Var.f43193j = b11;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        m0Var.f43185b = str5;
        m0Var.f43186c = iAvailableProcessors2;
        m0Var.f43187d = jM15187a2;
        m0Var.f43188e = blockCount;
        m0Var.f43189f = zM15192f2;
        m0Var.f43190g = iM15189c2;
        m0Var.f43193j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m0Var.f43191h = str6;
        if (str2 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m0Var.f43192i = str2;
        i0Var.f43116j = m0Var.m16451a();
        i0Var.f43118l = 3;
        i0Var.f43119m = (byte) (i0Var.f43119m | 4);
        a0Var.f42981j = i0Var.m16449a();
        b0 b0VarM16443a = a0Var.m16443a();
        C0979e c0979e3 = ((C0977c) c0979e2.f5803b).f5797b;
        m2 m2Var = b0VarM16443a.f43011k;
        if (m2Var == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String str17 = ((j0) m2Var).f43138b;
        try {
            C0977c.f5793g.getClass();
            C0977c.m2757f(c0979e3.m2781o(str17, "report"), C0161a.f499a.m8776q(b0VarM16443a));
            File fileM2781o = c0979e3.m2781o(str17, "start-time");
            long j6 = ((j0) m2Var).f43140d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM2781o), C0977c.f5791e);
            try {
                outputStreamWriter.write("");
                fileM2781o.setLastModified(j6 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    /* renamed from: d */
    public final String m15200d() {
        NavigableSet navigableSetM2759c = ((C0977c) this.f38611m.f5803b).m2759c();
        if (navigableSetM2759c.isEmpty()) {
            return null;
        }
        return (String) navigableSetM2759c.first();
    }

    /* renamed from: e */
    public final String m15201e() throws Resources.NotFoundException, IOException {
        Context context = this.f38599a;
        int iM15190d = AbstractC8057g.m15190d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iM15190d == 0 ? null : context.getResources().getString(iM15190d);
        if (string != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return Base64.encodeToString(string.getBytes(f38598s), 0);
        }
        ClassLoader classLoader = C8062l.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        }
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public final void m15202f() throws Resources.NotFoundException {
        try {
            String strM15201e = m15201e();
            if (strM15201e != null) {
                try {
                    ((C0182j) this.f38602d.f5806e).m426q("com.crashlytics.version-control-info", strM15201e);
                } catch (IllegalArgumentException e2) {
                    Context context = this.f38599a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    public final void m15203g(C8656m c8656m) {
        C8656m c8656m2;
        C8656m c8656mM15550a;
        C8650g c8650g = this.f38613o;
        C0979e c0979e = ((C0977c) this.f38611m.f5803b).f5797b;
        if (C0979e.m2769x(((File) c0979e.f5806e).listFiles()).isEmpty() && C0979e.m2769x(((File) c0979e.f5807f).listFiles()).isEmpty() && C0979e.m2769x(((File) c0979e.f5808g).listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            c8650g.m15971d(Boolean.FALSE);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        C0073l c0073l = this.f38600b;
        if (c0073l.m194C()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            c8650g.m15971d(Boolean.FALSE);
            c8656mM15550a = l8.m11765f(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            c8650g.m15971d(Boolean.TRUE);
            synchronized (c0073l.f265b) {
                c8656m2 = ((C8650g) c0073l.f266c).f41930a;
            }
            ug.a0 a0Var = new ug.a0(21);
            c8656m2.getClass();
            ExecutorC3897g executorC3897g = AbstractC8651h.f41931a;
            C8656m c8656m3 = new C8656m();
            c8656m2.f41950b.m3399s(new C8654k(executorC3897g, a0Var, c8656m3));
            c8656m2.m15992s();
            Log.isLoggable("FirebaseCrashlytics", 3);
            c8656mM15550a = AbstractC8383a.m15550a(c8656m3, this.f38614p.f41930a);
        }
        c8656mM15550a.m15986m(this.f38603e.f40063a, new C0927v(19, this, c8656m));
    }
}
