package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class StorageNotLowController extends ConstraintController<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageNotLowController(ConstraintTracker<Boolean> constraintTracker) {
        super(constraintTracker);
        sq8.m48649h(constraintTracker, "tracker");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        sq8.m48649h(workSpec, "workSpec");
        return workSpec.constraints.requiresStorageNotLow();
    }

    public boolean isConstrained(boolean z) {
        return !z;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public /* bridge */ /* synthetic */ boolean isConstrained(Boolean bool) {
        return isConstrained(bool.booleanValue());
    }
}
