package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class StartStopToken {
    private final WorkGenerationalId id;

    public StartStopToken(WorkGenerationalId workGenerationalId) {
        sq8.m48649h(workGenerationalId, OutcomeConstants.OUTCOME_ID);
        this.id = workGenerationalId;
    }

    public final WorkGenerationalId getId() {
        return this.id;
    }
}
