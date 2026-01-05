package androidx.work.impl.utils;

import android.os.Build;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class EnqueueUtilsKt {
    public static final WorkSpec tryDelegateConstrainedWorkSpec(WorkSpec workSpec) throws Throwable {
        sq8.m48649h(workSpec, "workSpec");
        Constraints constraints = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (sq8.m48644c(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!constraints.requiresBatteryNotLow() && !constraints.requiresStorageNotLow()) {
            return workSpec;
        }
        Data dataBuild = new Data.Builder().putAll(workSpec.input).putString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        sq8.m48648g(dataBuild, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        sq8.m48648g(name, "name");
        return workSpec.copy((1048574 & 1) != 0 ? workSpec.id : null, (1048574 & 2) != 0 ? workSpec.state : null, (1048574 & 4) != 0 ? workSpec.workerClassName : name, (1048574 & 8) != 0 ? workSpec.inputMergerClassName : null, (1048574 & 16) != 0 ? workSpec.input : dataBuild, (1048574 & 32) != 0 ? workSpec.output : null, (1048574 & 64) != 0 ? workSpec.initialDelay : 0L, (1048574 & 128) != 0 ? workSpec.intervalDuration : 0L, (1048574 & 256) != 0 ? workSpec.flexDuration : 0L, (1048574 & 512) != 0 ? workSpec.constraints : null, (1048574 & 1024) != 0 ? workSpec.runAttemptCount : 0, (1048574 & 2048) != 0 ? workSpec.backoffPolicy : null, (1048574 & 4096) != 0 ? workSpec.backoffDelayDuration : 0L, (1048574 & 8192) != 0 ? workSpec.lastEnqueueTime : 0L, (1048574 & Opcodes.ACC_ENUM) != 0 ? workSpec.minimumRetentionDuration : 0L, (1048574 & 32768) != 0 ? workSpec.scheduleRequestedAt : 0L, (1048574 & 65536) != 0 ? workSpec.expedited : false, (131072 & 1048574) != 0 ? workSpec.outOfQuotaPolicy : null, (1048574 & 262144) != 0 ? workSpec.periodCount : 0, (1048574 & Opcodes.ASM8) != 0 ? workSpec.generation : 0);
    }

    private static final boolean usesScheduler(List<? extends Scheduler> list, String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((Scheduler) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final WorkSpec wrapInConstraintTrackingWorkerIfNeeded(List<? extends Scheduler> list, WorkSpec workSpec) {
        sq8.m48649h(list, "schedulers");
        sq8.m48649h(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? tryDelegateConstrainedWorkSpec(workSpec) : workSpec;
    }
}
