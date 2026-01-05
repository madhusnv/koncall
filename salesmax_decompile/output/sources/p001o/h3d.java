package p001o;

import android.content.Context;
import android.os.Process;

/* loaded from: classes2.dex */
public abstract class h3d {
    /* renamed from: a */
    public static int m29776a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strM42399c = om0.m42399c(str);
        if (strM42399c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i2 && s6c.m47909a(context.getPackageName(), str2) ? om0.m42397a(context, i2, strM42399c, str2) : om0.m42398b(context, strM42399c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m29777b(Context context, String str) {
        return m29776a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
