package p001o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public abstract class xn0 {

    /* renamed from: a */
    public static final ConcurrentMap f53945a = new ConcurrentHashMap();

    /* renamed from: a */
    public static PackageInfo m56487a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            return null;
        }
    }

    /* renamed from: b */
    public static String m56488b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static ic9 m56489c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f53945a;
        ic9 ic9Var = (ic9) concurrentMap.get(packageName);
        if (ic9Var != null) {
            return ic9Var;
        }
        ic9 ic9VarM56490d = m56490d(context);
        ic9 ic9Var2 = (ic9) concurrentMap.putIfAbsent(packageName, ic9VarM56490d);
        return ic9Var2 == null ? ic9VarM56490d : ic9Var2;
    }

    /* renamed from: d */
    public static ic9 m56490d(Context context) {
        return new l6c(m56488b(m56487a(context)));
    }
}
