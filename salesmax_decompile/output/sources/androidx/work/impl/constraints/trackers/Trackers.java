package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Trackers {
    private final ConstraintTracker<Boolean> batteryChargingTracker;
    private final BatteryNotLowTracker batteryNotLowTracker;
    private final ConstraintTracker<NetworkState> networkStateTracker;
    private final ConstraintTracker<Boolean> storageNotLowTracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
    }

    public final ConstraintTracker<Boolean> getBatteryChargingTracker() {
        return this.batteryChargingTracker;
    }

    public final BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    public final ConstraintTracker<NetworkState> getNetworkStateTracker() {
        return this.networkStateTracker;
    }

    public final ConstraintTracker<Boolean> getStorageNotLowTracker() {
        return this.storageNotLowTracker;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker) {
        this(context, taskExecutor, constraintTracker, null, null, null, 56, null);
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        sq8.m48649h(constraintTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker, BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, constraintTracker, batteryNotLowTracker, null, null, 48, null);
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        sq8.m48649h(constraintTracker, "batteryChargingTracker");
        sq8.m48649h(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> constraintTracker2) {
        this(context, taskExecutor, constraintTracker, batteryNotLowTracker, constraintTracker2, null, 32, null);
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        sq8.m48649h(constraintTracker, "batteryChargingTracker");
        sq8.m48649h(batteryNotLowTracker, "batteryNotLowTracker");
        sq8.m48649h(constraintTracker2, "networkStateTracker");
    }

    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> constraintTracker2, ConstraintTracker<Boolean> constraintTracker3) {
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        sq8.m48649h(constraintTracker, "batteryChargingTracker");
        sq8.m48649h(batteryNotLowTracker, "batteryNotLowTracker");
        sq8.m48649h(constraintTracker2, "networkStateTracker");
        sq8.m48649h(constraintTracker3, "storageNotLowTracker");
        this.batteryChargingTracker = constraintTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = constraintTracker2;
        this.storageNotLowTracker = constraintTracker3;
    }

    public /* synthetic */ Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker constraintTracker2, ConstraintTracker constraintTracker3, int i, id5 id5Var) {
        ConstraintTracker batteryChargingTracker;
        BatteryNotLowTracker batteryNotLowTracker2;
        ConstraintTracker constraintTrackerNetworkStateTracker;
        ConstraintTracker storageNotLowTracker;
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            sq8.m48648g(applicationContext, "context.applicationContext");
            batteryChargingTracker = new BatteryChargingTracker(applicationContext, taskExecutor);
        } else {
            batteryChargingTracker = constraintTracker;
        }
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            sq8.m48648g(applicationContext2, "context.applicationContext");
            batteryNotLowTracker2 = new BatteryNotLowTracker(applicationContext2, taskExecutor);
        } else {
            batteryNotLowTracker2 = batteryNotLowTracker;
        }
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            sq8.m48648g(applicationContext3, "context.applicationContext");
            constraintTrackerNetworkStateTracker = NetworkStateTrackerKt.NetworkStateTracker(applicationContext3, taskExecutor);
        } else {
            constraintTrackerNetworkStateTracker = constraintTracker2;
        }
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            sq8.m48648g(applicationContext4, "context.applicationContext");
            storageNotLowTracker = new StorageNotLowTracker(applicationContext4, taskExecutor);
        } else {
            storageNotLowTracker = constraintTracker3;
        }
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker2, constraintTrackerNetworkStateTracker, storageNotLowTracker);
    }
}
