package ai.salesmax.work;

import android.app.NotificationManager;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p001o.arf;
import p001o.c64;
import p001o.hae;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class TaskWorker extends Worker {

    /* renamed from: a */
    public final Context f5083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "appContext");
        sq8.m48649h(workerParameters, "workerParams");
        this.f5083a = context;
    }

    /* renamed from: a */
    public final void m3413a() {
        m3414b("Notification will trigger for every 15 minutes");
    }

    /* renamed from: b */
    public final void m3414b(String str) {
        String string = this.f5083a.getString(hae.default_notification_channel_id);
        sq8.m48648g(string, "getString(...)");
        String string2 = this.f5083a.getString(hae.default_notification_channel_name);
        sq8.m48648g(string2, "getString(...)");
        arf.m17723b(string, string2, this.f5083a);
        Object systemService = c64.getSystemService(this.f5083a, NotificationManager.class);
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        arf.m17724c((NotificationManager) systemService, str, this.f5083a);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        m3413a();
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
