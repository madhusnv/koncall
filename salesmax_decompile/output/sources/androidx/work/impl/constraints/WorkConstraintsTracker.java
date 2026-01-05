package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;

/* loaded from: classes2.dex */
public interface WorkConstraintsTracker {
    void replace(Iterable<WorkSpec> iterable);

    void reset();
}
