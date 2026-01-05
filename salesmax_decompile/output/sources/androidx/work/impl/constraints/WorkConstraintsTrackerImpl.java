package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class WorkConstraintsTrackerImpl implements WorkConstraintsTracker, ConstraintController.OnConstraintUpdatedCallback {
    private final WorkConstraintsCallback callback;
    private final ConstraintController<?>[] constraintControllers;
    private final Object lock;

    public WorkConstraintsTrackerImpl(WorkConstraintsCallback workConstraintsCallback, ConstraintController<?>[] constraintControllerArr) {
        sq8.m48649h(constraintControllerArr, "constraintControllers");
        this.callback = workConstraintsCallback;
        this.constraintControllers = constraintControllerArr;
        this.lock = new Object();
    }

    public final boolean areAllConstraintsMet(String str) {
        ConstraintController<?> constraintController;
        boolean z;
        sq8.m48649h(str, "workSpecId");
        synchronized (this.lock) {
            ConstraintController<?>[] constraintControllerArr = this.constraintControllers;
            int length = constraintControllerArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constraintController = null;
                    break;
                }
                constraintController = constraintControllerArr[i];
                if (constraintController.isWorkSpecConstrained(str)) {
                    break;
                }
                i++;
            }
            if (constraintController != null) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + str + " constrained by " + constraintController.getClass().getSimpleName());
            }
            z = constraintController == null;
        }
        return z;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(List<WorkSpec> list) {
        sq8.m48649h(list, "workSpecs");
        synchronized (this.lock) {
            ArrayList<WorkSpec> arrayList = new ArrayList();
            for (Object obj : list) {
                if (areAllConstraintsMet(((WorkSpec) obj).id)) {
                    arrayList.add(obj);
                }
            }
            for (WorkSpec workSpec : arrayList) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Constraints met for " + workSpec);
            }
            WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsMet(arrayList);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(List<WorkSpec> list) {
        sq8.m48649h(list, "workSpecs");
        synchronized (this.lock) {
            WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsNotMet(list);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void replace(Iterable<WorkSpec> iterable) {
        sq8.m48649h(iterable, "workSpecs");
        synchronized (this.lock) {
            for (ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.setCallback(null);
            }
            for (ConstraintController<?> constraintController2 : this.constraintControllers) {
                constraintController2.replace(iterable);
            }
            for (ConstraintController<?> constraintController3 : this.constraintControllers) {
                constraintController3.setCallback(this);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void reset() {
        synchronized (this.lock) {
            for (ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.reset();
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerImpl(Trackers trackers, WorkConstraintsCallback workConstraintsCallback) {
        this(workConstraintsCallback, (ConstraintController<?>[]) new ConstraintController[]{new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker())});
        sq8.m48649h(trackers, "trackers");
    }
}
