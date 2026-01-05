package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p001o.kh3;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes2.dex */
public abstract class ConstraintTracker<T> {
    private final Context appContext;
    private T currentState;
    private final LinkedHashSet<ConstraintListener<T>> listeners;
    private final Object lock;
    private final TaskExecutor taskExecutor;

    public ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        sq8.m48649h(context, "context");
        sq8.m48649h(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_state_$lambda$4$lambda$3(List list, ConstraintTracker constraintTracker) {
        sq8.m48649h(list, "$listenersList");
        sq8.m48649h(constraintTracker, "this$0");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ConstraintListener) it.next()).onConstraintChanged(constraintTracker.currentState);
        }
    }

    public final void addListener(ConstraintListener<T> constraintListener) {
        sq8.m48649h(constraintListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.lock) {
            if (this.listeners.add(constraintListener)) {
                if (this.listeners.size() == 1) {
                    this.currentState = getInitialState();
                    Logger.get().debug(ConstraintTrackerKt.TAG, getClass().getSimpleName() + ": initial state = " + this.currentState);
                    startTracking();
                }
                constraintListener.onConstraintChanged(this.currentState);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public abstract T getInitialState();

    public final T getState() {
        T t = this.currentState;
        return t == null ? getInitialState() : t;
    }

    public final void removeListener(ConstraintListener<T> constraintListener) {
        sq8.m48649h(constraintListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.lock) {
            if (this.listeners.remove(constraintListener) && this.listeners.isEmpty()) {
                stopTracking();
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void setState(T t) {
        synchronized (this.lock) {
            T t2 = this.currentState;
            if (t2 == null || !sq8.m48644c(t2, t)) {
                this.currentState = t;
                final List listQ0 = kh3.Q0(this.listeners);
                this.taskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: o.wt3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTracker._set_state_$lambda$4$lambda$3(listQ0, this);
                    }
                });
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
