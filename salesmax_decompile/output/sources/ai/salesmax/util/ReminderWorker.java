package ai.salesmax.util;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import p001o.c3c;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class ReminderWorker extends Worker {

    /* renamed from: a */
    public final Context f4945a;

    /* renamed from: b */
    public final WorkerParameters f4946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        this.f4945a = context;
        this.f4946b = workerParameters;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        new c3c(this.f4945a).m20167b(String.valueOf(getInputData().getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE)), String.valueOf(getInputData().getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)));
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
