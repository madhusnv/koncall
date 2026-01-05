package ti;

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
import zi.c2;
import zi.y0;
import zi.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ti.d */
/* loaded from: classes.dex */
public final class C7164d {

    /* renamed from: a */
    public static final C7164d f34414a = new C7164d();

    /* renamed from: a */
    public static ArrayList m13424a(Context context) {
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
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            y0Var.f43318a = str2;
            y0Var.f43319b = runningAppProcessInfo.pid;
            byte b10 = (byte) (y0Var.f43322e | 1);
            y0Var.f43320c = runningAppProcessInfo.importance;
            y0Var.f43322e = (byte) (b10 | 2);
            y0Var.f43321d = AbstractC4154l.m8918a(str2, str);
            y0Var.f43322e = (byte) (y0Var.f43322e | 4);
            arrayList2.add(y0Var.m16456a());
        }
        return arrayList2;
    }

    /* renamed from: b */
    public final c2 m13425b(Context context) {
        Object obj;
        String processName;
        AbstractC4154l.m8923f(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListM13424a = m13424a(context);
        int size = arrayListM13424a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayListM13424a.get(i10);
            i10++;
            if (((z0) ((c2) obj)).f43326b == iMyPid) {
                break;
            }
        }
        c2 c2Var = (c2) obj;
        if (c2Var != null) {
            return c2Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            processName = Process.myProcessName();
            AbstractC4154l.m8920c(processName);
        } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        AbstractC4154l.m8923f(processName, "processName");
        y0 y0Var = new y0();
        y0Var.f43318a = processName;
        y0Var.f43319b = iMyPid;
        byte b10 = (byte) (y0Var.f43322e | 1);
        y0Var.f43320c = 0;
        y0Var.f43321d = false;
        y0Var.f43322e = (byte) (((byte) (b10 | 2)) | 4);
        return y0Var.m16456a();
    }
}
