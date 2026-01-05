package p001o;

import ai.salesmax.work.AdhocWorker;
import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkManager;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes2.dex */
public class w60 {

    /* renamed from: a */
    public static w60 f51521a = null;

    /* renamed from: b */
    public static String f51522b = "RUN_ADHOC_WORK";

    /* renamed from: b */
    public static w60 m53996b() {
        if (f51521a == null) {
            f51521a = new w60();
        }
        return f51521a;
    }

    /* renamed from: c */
    public static /* synthetic */ Operation m53997c(Context context) {
        return WorkManager.getInstance(context).cancelAllWork();
    }

    /* renamed from: d */
    public void m53998d(Context context, String str, String str2, Map map) {
        Data.Builder builder = new Data.Builder();
        builder.putString("ID", str2);
        builder.putString("ADHOC_WORK_TYPE", str);
        builder.putString("ADHOC_WORK_INPUT_PARAMS", ja8.f30035c.toJson(map));
        WorkManager.getInstance(context).enqueueUniqueWork(str2, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(AdhocWorker.class).setInputData(builder.build()).addTag(f51522b).build());
    }

    /* renamed from: e */
    public void m53999e(Context context) {
        Optional.ofNullable(context).map(new Function() { // from class: o.v60
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return w60.m53997c((Context) obj);
            }
        });
    }
}
