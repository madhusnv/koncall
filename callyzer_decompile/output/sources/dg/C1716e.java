package dg;

import al.C0174b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import bl.C0689a;
import ci.C0973a;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import ng.C5070u;
import oj.C5392d;
import pf.C5906f;
import sf.AbstractC6840z;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dg.e */
/* loaded from: classes.dex */
public final class C1716e {

    /* renamed from: b */
    public static final C0174b f8343b;

    /* renamed from: c */
    public static final C0689a f8344c;

    /* renamed from: d */
    public static final C5070u f8345d;

    /* renamed from: e */
    public static final C5392d f8346e;

    /* renamed from: f */
    public static Boolean f8347f = null;

    /* renamed from: g */
    public static String f8348g = null;

    /* renamed from: h */
    public static boolean f8349h = false;

    /* renamed from: i */
    public static int f8350i = -1;

    /* renamed from: j */
    public static Boolean f8351j;

    /* renamed from: k */
    public static final ThreadLocal f8352k = new ThreadLocal();

    /* renamed from: l */
    public static final C0973a f8353l = new C0973a(1);

    /* renamed from: m */
    public static final C8687a f8354m = new C8687a(6);

    /* renamed from: n */
    public static C1721j f8355n;

    /* renamed from: o */
    public static C1722k f8356o;

    /* renamed from: a */
    public final Context f8357a;

    static {
        int i10 = 7;
        f8343b = new C0174b(i10);
        f8344c = new C0689a(i10);
        f8345d = new C5070u(i10);
        f8346e = new C5392d(i10);
    }

    public C1716e(Context context) {
        this.f8357a = context;
    }

    /* renamed from: a */
    public static int m5403a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC6840z.m13040k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0252, TRY_LEAVE, TryCatch #7 {all -> 0x0252, blocks: (B:7:0x0041, B:18:0x005b), top: B:167:0x0041 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dg.C1716e m5404c(android.content.Context r22, dg.InterfaceC1715d r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.C1716e.m5404c(android.content.Context, dg.d, java.lang.String):dg.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:63:0x00ca, B:65:0x00d0, B:73:0x00df, B:105:0x0158, B:114:0x016a, B:130:0x01c0, B:131:0x01c3, B:125:0x01b8, B:71:0x00db, B:133:0x01c5, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00c7, B:21:0x004a, B:44:0x00a1, B:47:0x00a4, B:54:0x00bc, B:62:0x00c9, B:60:0x00c2), top: B:145:0x0002, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c0 A[Catch: all -> 0x00d5, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:63:0x00ca, B:65:0x00d0, B:73:0x00df, B:105:0x0158, B:114:0x016a, B:130:0x01c0, B:131:0x01c3, B:125:0x01b8, B:71:0x00db, B:133:0x01c5, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00c7, B:21:0x004a, B:44:0x00a1, B:47:0x00a4, B:54:0x00bc, B:62:0x00c9, B:60:0x00c2), top: B:145:0x0002, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[Catch: all -> 0x00d5, SYNTHETIC, TRY_LEAVE, TryCatch #10 {all -> 0x00d5, blocks: (B:3:0x0002, B:63:0x00ca, B:65:0x00d0, B:73:0x00df, B:105:0x0158, B:114:0x016a, B:130:0x01c0, B:131:0x01c3, B:125:0x01b8, B:71:0x00db, B:133:0x01c5, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00c7, B:21:0x004a, B:44:0x00a1, B:47:0x00a4, B:54:0x00bc, B:62:0x00c9, B:60:0x00c2), top: B:145:0x0002, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #11 {, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:146:0x0027, inners: #12 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5405d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.C1716e.m5405d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137 A[PHI: r13
      0x0137: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ee, B:84:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5406e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.C1716e.m5406e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: f */
    public static void m5407f(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            C1722k c1722k = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c1722k = iInterfaceQueryLocalInterface instanceof C1722k ? (C1722k) iInterfaceQueryLocalInterface : new C1722k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 3);
            }
            f8356o = c1722k;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    /* renamed from: g */
    public static boolean m5408g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f8351j)) {
            return true;
        }
        boolean z6 = false;
        if (f8351j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (C5906f.f28748b.m11516c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            f8351j = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f8349h = true;
            }
        }
        return z6;
    }

    /* renamed from: h */
    public static C1721j m5409h(Context context) {
        C1721j c1721j;
        synchronized (C1716e.class) {
            C1721j c1721j2 = f8355n;
            if (c1721j2 != null) {
                return c1721j2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1721j = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c1721j = iInterfaceQueryLocalInterface instanceof C1721j ? (C1721j) iInterfaceQueryLocalInterface : new C1721j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 3);
                }
                if (c1721j != null) {
                    f8355n = c1721j;
                    return c1721j;
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final IBinder m5410b(String str) throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.f8357a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
