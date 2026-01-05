package t8;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i0 {
    public abstract AbstractC7076v createWorker(Context context, String str, WorkerParameters workerParameters);

    public final AbstractC7076v createWorkerWithDefaultFallback(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC4154l.m8923f(appContext, "appContext");
        AbstractC4154l.m8923f(workerClassName, "workerClassName");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        AbstractC7076v abstractC7076vCreateWorker = createWorker(appContext, workerClassName, workerParameters);
        if (abstractC7076vCreateWorker == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(AbstractC7076v.class);
                AbstractC4154l.m8922e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                    AbstractC4154l.m8922e(objNewInstance, "{\n                val co…Parameters)\n            }");
                    abstractC7076vCreateWorker = (AbstractC7076v) objNewInstance;
                } finally {
                }
            } finally {
            }
        }
        if (!abstractC7076vCreateWorker.isUsed()) {
            return abstractC7076vCreateWorker;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
