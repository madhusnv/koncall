package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.IdGenerator;
import java.util.concurrent.Callable;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class IdGenerator {
    private final WorkDatabase workDatabase;

    public IdGenerator(WorkDatabase workDatabase) {
        sq8.m48649h(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer nextAlarmManagerId$lambda$1(IdGenerator idGenerator) {
        sq8.m48649h(idGenerator, "this$0");
        return Integer.valueOf(IdGeneratorKt.nextId(idGenerator.workDatabase, IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer nextJobSchedulerIdWithRange$lambda$0(IdGenerator idGenerator, int i, int i2) {
        sq8.m48649h(idGenerator, "this$0");
        int iNextId = IdGeneratorKt.nextId(idGenerator.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        boolean z = false;
        if (i <= iNextId && iNextId <= i2) {
            z = true;
        }
        if (z) {
            i = iNextId;
        } else {
            IdGeneratorKt.updatePreference(idGenerator.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, i + 1);
        }
        return Integer.valueOf(i);
    }

    public final int nextAlarmManagerId() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: o.ya8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.nextAlarmManagerId$lambda$1(this.f55156a);
            }
        });
        sq8.m48648g(objRunInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int nextJobSchedulerIdWithRange(final int i, final int i2) {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: o.za8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.nextJobSchedulerIdWithRange$lambda$0(this.f56836a, i, i2);
            }
        });
        sq8.m48648g(objRunInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objRunInTransaction).intValue();
    }
}
