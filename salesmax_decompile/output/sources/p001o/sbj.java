package p001o;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class sbj {

    /* renamed from: a */
    public static final sbj f45162a = new sbj();

    /* renamed from: c */
    public static /* synthetic */ Operation m48141c(sbj sbjVar, String str, Context context, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest[] oneTimeWorkRequestArr, int i, Object obj) {
        if ((i & 4) != 0) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        }
        return sbjVar.m48143b(str, context, existingWorkPolicy, oneTimeWorkRequestArr);
    }

    /* renamed from: a */
    public final Operation m48142a(Context context, mbj mbjVar) {
        sq8.m48649h(context, "context");
        sq8.m48649h(mbjVar, "workName");
        Operation operationCancelUniqueWork = WorkManager.getInstance(context).cancelUniqueWork(mbjVar.name());
        sq8.m48648g(operationCancelUniqueWork, "cancelUniqueWork(...)");
        return operationCancelUniqueWork;
    }

    /* renamed from: b */
    public final Operation m48143b(String str, Context context, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest... oneTimeWorkRequestArr) {
        sq8.m48649h(str, "chainName");
        sq8.m48649h(context, "context");
        sq8.m48649h(existingWorkPolicy, "existingWorkPolicy");
        sq8.m48649h(oneTimeWorkRequestArr, "oneTimeWorks");
        WorkManager workManager = WorkManager.getInstance(context);
        sq8.m48648g(workManager, "getInstance(...)");
        WorkContinuation workContinuationBeginUniqueWork = (oneTimeWorkRequestArr.length == 0) ^ true ? workManager.beginUniqueWork(str, existingWorkPolicy, (OneTimeWorkRequest) gp0.m29257X(oneTimeWorkRequestArr)) : null;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList = new ArrayList();
        for (OneTimeWorkRequest oneTimeWorkRequest : oneTimeWorkRequestArr) {
            if (atomicInteger.getAndIncrement() > 0) {
                arrayList.add(oneTimeWorkRequest);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            workContinuationBeginUniqueWork = workContinuationBeginUniqueWork != null ? workContinuationBeginUniqueWork.then((OneTimeWorkRequest) it.next()) : null;
        }
        if (workContinuationBeginUniqueWork != null) {
            return workContinuationBeginUniqueWork.enqueue();
        }
        return null;
    }
}
