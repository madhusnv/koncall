package fk;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import zf.AbstractC8948c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h0 {
    /* renamed from: a */
    public static ArrayList m5969a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        AbstractC4154l.m8923f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C6668r.f31943a;
        }
        ArrayList arrayListM12740D = AbstractC6663m.m12740D(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListM12740D.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListM12740D.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String processName = runningAppProcessInfo.processName;
            AbstractC4154l.m8922e(processName, "processName");
            arrayList2.add(new g0(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC4154l.m8918a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static g0 m5970b(Context context) {
        Object obj;
        String strM16432a;
        AbstractC4154l.m8923f(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListM5969a = m5969a(context);
        int size = arrayListM5969a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayListM5969a.get(i10);
            i10++;
            if (((g0) obj).f10393b == iMyPid) {
                break;
            }
        }
        g0 g0Var = (g0) obj;
        if (g0Var != null) {
            return g0Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            strM16432a = Process.myProcessName();
            AbstractC4154l.m8922e(strM16432a, "myProcessName(...)");
        } else if ((i11 < 28 || (strM16432a = Application.getProcessName()) == null) && (strM16432a = AbstractC8948c.m16432a()) == null) {
            strM16432a = "";
        }
        return new g0(strM16432a, iMyPid, 0, false);
    }
}
