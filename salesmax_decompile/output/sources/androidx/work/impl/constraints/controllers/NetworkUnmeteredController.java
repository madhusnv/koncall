package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkUnmeteredController extends ConstraintController<NetworkState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkUnmeteredController(ConstraintTracker<NetworkState> constraintTracker) {
        super(constraintTracker);
        sq8.m48649h(constraintTracker, "tracker");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        sq8.m48649h(workSpec, "workSpec");
        NetworkType requiredNetworkType = workSpec.constraints.getRequiredNetworkType();
        return requiredNetworkType == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && requiredNetworkType == NetworkType.TEMPORARILY_UNMETERED);
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState networkState) {
        sq8.m48649h(networkState, "value");
        return !networkState.isConnected() || networkState.isMetered();
    }
}
