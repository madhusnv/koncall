package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class DelegatingWorkerFactory extends WorkerFactory {
    private static final String TAG = Logger.tagWithPrefix("DelegatingWkrFctry");
    private final List<WorkerFactory> mFactories = new CopyOnWriteArrayList();

    public final void addFactory(WorkerFactory workerFactory) {
        this.mFactories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        Iterator<WorkerFactory> it = this.mFactories.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerCreateWorker = it.next().createWorker(context, str, workerParameters);
                if (listenableWorkerCreateWorker != null) {
                    return listenableWorkerCreateWorker;
                }
            } catch (Throwable th) {
                Logger.get().error(TAG, "Unable to instantiate a ListenableWorker (" + str + ")", th);
                throw th;
            }
        }
        return null;
    }

    public List<WorkerFactory> getFactories() {
        return this.mFactories;
    }
}
