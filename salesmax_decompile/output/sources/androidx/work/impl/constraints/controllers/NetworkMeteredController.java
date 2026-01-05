package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NetworkMeteredController extends ConstraintController<NetworkState> {
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
        String strTagWithPrefix = Logger.tagWithPrefix("NetworkMeteredCtrlr");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        TAG = strTagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMeteredController(ConstraintTracker<NetworkState> constraintTracker) {
        super(constraintTracker);
        sq8.m48649h(constraintTracker, "tracker");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        sq8.m48649h(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.METERED;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState networkState) {
        sq8.m48649h(networkState, "value");
        if (Build.VERSION.SDK_INT < 26) {
            Logger.get().debug(TAG, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (networkState.isConnected()) {
                return false;
            }
        } else if (networkState.isConnected() && networkState.isMetered()) {
            return false;
        }
        return true;
    }
}
