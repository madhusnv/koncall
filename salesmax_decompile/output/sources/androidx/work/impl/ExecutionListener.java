package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;

/* loaded from: classes2.dex */
public interface ExecutionListener {
    void onExecuted(WorkGenerationalId workGenerationalId, boolean z);
}
