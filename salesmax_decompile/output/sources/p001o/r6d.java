package p001o;

import android.app.role.RoleManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.util.List;

/* loaded from: classes.dex */
public final class r6d {

    /* renamed from: a */
    public static final r6d f43055a = new r6d();

    /* renamed from: b */
    public static final String f43056b = "phone";

    /* renamed from: a */
    public final String m46257a(Context context) {
        if (context != null) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        return null;
    }

    /* renamed from: b */
    public final jq5 m46258b(Context context) {
        List listD0 = null;
        if (context == null) {
            return null;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.BRAND;
        String str4 = Build.VERSION.RELEASE;
        int i = Build.VERSION.SDK_INT;
        String str5 = Build.HARDWARE;
        String[] strArr = Build.SUPPORTED_ABIS;
        Integer numValueOf = Integer.valueOf(i);
        if (strArr != null) {
            sq8.m48646e(strArr);
            listD0 = gp0.D0(strArr);
        }
        jq5 jq5Var = new jq5(string, str, str2, str3, str4, numValueOf, str5, listD0);
        StringBuilder sb = new StringBuilder();
        sb.append("Device details: ");
        sb.append(jq5Var);
        return jq5Var;
    }

    /* renamed from: c */
    public final boolean m46259c(Context context) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("role");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.role.RoleManager");
        RoleManager roleManagerM41646a = o6d.m41646a(systemService);
        return roleManagerM41646a.isRoleAvailable("android.app.role.CALL_SCREENING") && roleManagerM41646a.isRoleHeld("android.app.role.CALL_SCREENING");
    }
}
