package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.room.AutoCloser;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001o.id5;
import p001o.leg;
import p001o.meg;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class AutoCloser {
    public static final Companion Companion = new Companion(null);
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private long autoCloseTimeoutInMs;
    private final Runnable autoCloser;
    private leg delegateDatabase;
    public meg delegateOpenHelper;
    private final Runnable executeAutoCloser;
    private final Executor executor;
    private final Handler handler;
    private long lastDecrementRefCountTimeStamp;
    private final Object lock;
    private boolean manuallyClosed;
    private Runnable onAutoCloseCallback;
    private int refCount;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public AutoCloser(long j, TimeUnit timeUnit, Executor executor) {
        sq8.m48649h(timeUnit, "autoCloseTimeUnit");
        sq8.m48649h(executor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.executor = executor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: o.l11
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.executeAutoCloser$lambda$0(this.f32980a);
            }
        };
        this.autoCloser = new Runnable() { // from class: o.m11
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.autoCloser$lambda$3(this.f34625a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoCloser$lambda$3(AutoCloser autoCloser) {
        y3i y3iVar;
        sq8.m48649h(autoCloser, "this$0");
        synchronized (autoCloser.lock) {
            if (SystemClock.uptimeMillis() - autoCloser.lastDecrementRefCountTimeStamp < autoCloser.autoCloseTimeoutInMs) {
                return;
            }
            if (autoCloser.refCount != 0) {
                return;
            }
            Runnable runnable = autoCloser.onAutoCloseCallback;
            if (runnable != null) {
                runnable.run();
                y3iVar = y3i.f54824a;
            } else {
                y3iVar = null;
            }
            if (y3iVar == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            leg legVar = autoCloser.delegateDatabase;
            if (legVar != null && legVar.isOpen()) {
                legVar.close();
            }
            autoCloser.delegateDatabase = null;
            y3i y3iVar2 = y3i.f54824a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAutoCloser$lambda$0(AutoCloser autoCloser) {
        sq8.m48649h(autoCloser, "this$0");
        autoCloser.executor.execute(autoCloser.autoCloser);
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            leg legVar = this.delegateDatabase;
            if (legVar != null) {
                legVar.close();
            }
            this.delegateDatabase = null;
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.lock) {
            int i = this.refCount;
            if (!(i > 0)) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            }
            int i2 = i - 1;
            this.refCount = i2;
            if (i2 == 0) {
                if (this.delegateDatabase == null) {
                    return;
                } else {
                    this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final <V> V executeRefCountingFunction(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        try {
            return (V) xk7Var.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final leg getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    public final meg getDelegateOpenHelper() {
        meg megVar = this.delegateOpenHelper;
        if (megVar != null) {
            return megVar;
        }
        sq8.m48667z("delegateOpenHelper");
        return null;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.lastDecrementRefCountTimeStamp;
    }

    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final int getRefCount$room_runtime_release() {
        return this.refCount;
    }

    public final int getRefCountForTest$room_runtime_release() {
        int i;
        synchronized (this.lock) {
            i = this.refCount;
        }
        return i;
    }

    public final leg incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!(!this.manuallyClosed)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            leg legVar = this.delegateDatabase;
            if (legVar != null && legVar.isOpen()) {
                return legVar;
            }
            leg writableDatabase = getDelegateOpenHelper().getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void init(meg megVar) {
        sq8.m48649h(megVar, "delegateOpenHelper");
        setDelegateOpenHelper(megVar);
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(Runnable runnable) {
        sq8.m48649h(runnable, "onAutoClose");
        this.onAutoCloseCallback = runnable;
    }

    public final void setDelegateDatabase$room_runtime_release(leg legVar) {
        this.delegateDatabase = legVar;
    }

    public final void setDelegateOpenHelper(meg megVar) {
        sq8.m48649h(megVar, "<set-?>");
        this.delegateOpenHelper = megVar;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j) {
        this.lastDecrementRefCountTimeStamp = j;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void setRefCount$room_runtime_release(int i) {
        this.refCount = i;
    }
}
