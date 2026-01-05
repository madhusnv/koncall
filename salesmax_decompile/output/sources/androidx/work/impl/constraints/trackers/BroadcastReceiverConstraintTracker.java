package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import p001o.sq8;

/* loaded from: classes2.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {
    private final BroadcastReceiver broadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        this.broadcastReceiver = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            final /* synthetic */ BroadcastReceiverConstraintTracker<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                sq8.m48649h(context2, "context");
                sq8.m48649h(intent, "intent");
                this.this$0.onBroadcastReceive(intent);
            }
        };
    }

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Intent intent);

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        Logger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, getClass().getSimpleName() + ": registering receiver");
        getAppContext().registerReceiver(this.broadcastReceiver, getIntentFilter());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        Logger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, getClass().getSimpleName() + ": unregistering receiver");
        getAppContext().unregisterReceiver(this.broadcastReceiver);
    }
}
