package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes2.dex */
public final class WorkerUpdater$updateWorkImpl$type$1 extends kf9 implements xk7 {
    public static final WorkerUpdater$updateWorkImpl$type$1 INSTANCE = new WorkerUpdater$updateWorkImpl$type$1();

    public WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(WorkSpec workSpec) {
        sq8.m48649h(workSpec, "spec");
        return workSpec.isPeriodic() ? "Periodic" : "OneTime";
    }
}
