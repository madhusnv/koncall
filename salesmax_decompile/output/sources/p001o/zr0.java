package p001o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import o.zr0.a;

/* loaded from: classes2.dex */
public abstract class zr0 extends wga {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a mTask;
    long mUpdateThrottle;

    /* renamed from: o.zr0$a */
    public final class RunnableC18697a extends zkb implements Runnable {

        /* renamed from: x */
        public final CountDownLatch f57556x = new CountDownLatch(1);

        /* renamed from: y */
        public boolean f57557y;

        public RunnableC18697a() {
        }

        @Override // p001o.zkb
        /* renamed from: g */
        public void mo59545g(Object obj) {
            try {
                zr0.this.dispatchOnCancelled(this, obj);
            } finally {
                this.f57556x.countDown();
            }
        }

        @Override // p001o.zkb
        /* renamed from: h */
        public void mo59546h(Object obj) {
            try {
                zr0.this.dispatchOnLoadComplete(this, obj);
            } finally {
                this.f57556x.countDown();
            }
        }

        @Override // p001o.zkb
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object mo59541b(Void... voidArr) {
            return zr0.this.onLoadInBackground();
        }

        /* renamed from: n */
        public void m59782n() throws InterruptedException {
            try {
                this.f57556x.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57557y = false;
            zr0.this.executePendingTask();
        }
    }

    public zr0(Context context) {
        this(context, zkb.f57317h);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(a aVar, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a aVar, Object obj) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // p001o.wga
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f57557y);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f57557y);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            hmh.m30836c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            hmh.m30835b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f57557y) {
            this.mTask.f57557y = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.m59542c(this.mExecutor, null);
        } else {
            this.mTask.f57557y = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract Object loadInBackground();

    @Override // p001o.wga
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f57557y) {
                this.mTask.f57557y = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f57557y) {
            this.mTask.f57557y = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zM59540a = this.mTask.m59540a(false);
        if (zM59540a) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zM59540a;
    }

    public void onCanceled(Object obj) {
    }

    @Override // p001o.wga
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC18697a();
        executePendingTask();
    }

    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() throws InterruptedException {
        a aVar = this.mTask;
        if (aVar != null) {
            aVar.m59782n();
        }
    }

    public zr0(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
