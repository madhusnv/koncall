package pg;

import a1.C0013l;
import android.content.Context;
import bk.C0677h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import kotlin.jvm.internal.AbstractC4154l;
import l0.AbstractC4308h;
import l0.C4311k;
import qw.C6361k;
import rw.AbstractC6674x;
import t8.C7077w;
import u8.AbstractC7367o;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.y */
/* loaded from: classes.dex */
public abstract class AbstractC5944y {
    /* renamed from: a */
    public static final void m11936a(Context context) {
        AbstractC4154l.m8923f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC4154l.m8922e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            C7077w c7077wM13371a = C7077w.m13371a();
            String[] strArr = AbstractC7367o.f35039a;
            c7077wM13371a.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            AbstractC4154l.m8922e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            AbstractC4154l.m8922e(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr2 = AbstractC7367o.f35039a;
            int iM12776d = AbstractC6674x.m12776d(strArr2.length);
            if (iM12776d < 16) {
                iM12776d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : AbstractC6674x.m12781i(linkedHashMap, new C6361k(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        C7077w c7077wM13371a2 = C7077w.m13371a();
                        String[] strArr3 = AbstractC7367o.f35039a;
                        file3.toString();
                        c7077wM13371a2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    C7077w c7077wM13371a3 = C7077w.m13371a();
                    String[] strArr4 = AbstractC7367o.f35039a;
                    c7077wM13371a3.getClass();
                }
            }
        }
    }

    /* renamed from: b */
    public static C8302l m11937b(List list, ExecutorC3900j executorC3900j, ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4308h.m9034d(((i0.v0) it.next()).m7418c()));
        }
        return i7.m11697b(new C0013l(9, i7.m11697b(new C0677h(new C4311k(new ArrayList(arrayList), false, t8.m11872a()), scheduledExecutorServiceC3894d, 5000L)), executorC3900j, list));
    }
}
