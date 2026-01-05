package fk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ji.C3773g;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import lj.C4481d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    public static final r0 f10474a = new r0();

    /* renamed from: b */
    public static final C4001v f10475b;

    static {
        C4481d c4481d = new C4481d();
        c4481d.mo8850c(q0.class, C2301g.f10388a);
        c4481d.mo8850c(z0.class, C2302h.f10401a);
        c4481d.mo8850c(C2305k.class, C2299e.f10367a);
        c4481d.mo8850c(C2296b.class, C2298d.f10358a);
        c4481d.mo8850c(C2295a.class, C2297c.f10348a);
        c4481d.mo8850c(g0.class, C2300f.f10374a);
        c4481d.f22312d = true;
        f10475b = new C4001v(6, c4481d);
    }

    /* renamed from: a */
    public static C2296b m5984a(C3773g c3773g) throws PackageManager.NameNotFoundException {
        c3773g.m8293a();
        Context context = c3773g.f19662a;
        AbstractC4154l.m8922e(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c3773g.m8293a();
        String str = c3773g.f19664c.f19678b;
        AbstractC4154l.m8922e(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        AbstractC4154l.m8922e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC4154l.m8922e(RELEASE, "RELEASE");
        a0 a0Var = a0.LOG_ENVIRONMENT_PROD;
        AbstractC4154l.m8920c(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC4154l.m8922e(MANUFACTURER, "MANUFACTURER");
        c3773g.m8293a();
        g0 g0VarM5970b = h0.m5970b(context);
        c3773g.m8293a();
        return new C2296b(str, a0Var, new C2295a(packageName, str3, strValueOf, g0VarM5970b, h0.m5969a(context)));
    }
}
