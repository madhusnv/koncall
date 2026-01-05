package x8;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import c6.e0;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x8.a */
/* loaded from: classes.dex */
public abstract class AbstractC8312a {

    /* renamed from: a */
    public static final /* synthetic */ int f39861a = 0;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("SystemJobScheduler"), "tagWithPrefix(\"SystemJobScheduler\")");
    }

    /* renamed from: a */
    public static final JobScheduler m15510a(Context context) {
        AbstractC4154l.m8923f(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? e0.m2358e(jobScheduler) : jobScheduler;
    }
}
