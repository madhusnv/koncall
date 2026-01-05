package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkNotRoamingController extends ConstraintController<NetworkState> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        TAG = strTagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkNotRoamingController(ConstraintTracker<NetworkState> constraintTracker) {
        super(constraintTracker);
        sq8.m48649h(constraintTracker, "tracker");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        sq8.m48649h(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState networkState) {
        sq8.m48649h(networkState, "value");
        return (networkState.isConnected() && networkState.isNotRoaming()) ? false : true;
    }
}
