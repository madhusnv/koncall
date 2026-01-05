package d9;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7056b;
import t8.C7077w;
import t8.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.l */
/* loaded from: classes.dex */
public abstract class AbstractC1667l {
    static {
        AbstractC4154l.m8922e(C7077w.m13372b("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    /* renamed from: a */
    public static final boolean m5379a(Context context, C7056b configuration) {
        String strM5368b;
        Object next;
        Object objInvoke;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strM5368b = AbstractC1656a.m5368b();
        } else {
            strM5368b = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, g0.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                AbstractC4154l.m8920c(objInvoke);
            } catch (Throwable unused) {
                C7077w.m13371a().getClass();
            }
            if (objInvoke instanceof String) {
                strM5368b = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strM5368b = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return AbstractC4154l.m8918a(strM5368b, context.getApplicationInfo().processName);
    }
}
