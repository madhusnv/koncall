package com.amplifyframework.storage.s3.transfer.worker;

import a1.C0011j;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import i0.m0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import pg.i7;
import rw.AbstractC6657g;
import t8.AbstractC7076v;
import t8.C7064j;
import t8.C7073s;
import x4.C8299i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RouterWorker extends AbstractC7076v {
    public static final String WORKER_CLASS_NAME = "WORKER_CLASS_NAME";
    private static boolean isWorkerFactoriesInitialized;
    private AbstractC7076v delegateWorker;
    private final Logger logger;
    private final WorkerParameters parameter;
    private final String workerClassName;
    private final String workerId;
    public static final Companion Companion = new Companion(null);
    private static final AbstractC6657g workerFactories = new AbstractC6657g() { // from class: com.amplifyframework.storage.s3.transfer.worker.RouterWorker$Companion$workerFactories$1
        private final Map<String, TransferWorkerFactory> backingWorkerMap = new LinkedHashMap();

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(TransferWorkerFactory transferWorkerFactory) {
            return super.containsValue((Object) transferWorkerFactory);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ TransferWorkerFactory get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        @Override // rw.AbstractC6657g
        public Set<Map.Entry<String, TransferWorkerFactory>> getEntries() {
            return this.backingWorkerMap.entrySet();
        }

        public final /* bridge */ TransferWorkerFactory getOrDefault(Object obj, TransferWorkerFactory transferWorkerFactory) {
            return !(obj instanceof String) ? transferWorkerFactory : getOrDefault((String) obj, transferWorkerFactory);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ TransferWorkerFactory remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof TransferWorkerFactory) {
                return containsValue((TransferWorkerFactory) obj);
            }
            return false;
        }

        public /* bridge */ TransferWorkerFactory get(String str) {
            return (TransferWorkerFactory) super.get((Object) str);
        }

        public /* bridge */ TransferWorkerFactory getOrDefault(String str, TransferWorkerFactory transferWorkerFactory) {
            return (TransferWorkerFactory) super.getOrDefault((Object) str, (String) transferWorkerFactory);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public TransferWorkerFactory put(String key, TransferWorkerFactory value) {
            AbstractC4154l.m8923f(key, "key");
            AbstractC4154l.m8923f(value, "value");
            RouterWorker.isWorkerFactoriesInitialized = true;
            return this.backingWorkerMap.put(key, value);
        }

        public /* bridge */ TransferWorkerFactory remove(String str) {
            return (TransferWorkerFactory) super.remove((Object) str);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (TransferWorkerFactory) obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof TransferWorkerFactory)) {
                return remove((String) obj, (TransferWorkerFactory) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str, TransferWorkerFactory transferWorkerFactory) {
            return super.remove((Object) str, (Object) transferWorkerFactory);
        }
    };

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AbstractC6657g getWorkerFactories() {
            return RouterWorker.workerFactories;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterWorker(Context appContext, WorkerParameters parameter) {
        super(appContext, parameter);
        AbstractC4154l.m8923f(appContext, "appContext");
        AbstractC4154l.m8923f(parameter, "parameter");
        this.parameter = parameter;
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"RouterWorker"}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
        C7064j c7064j = parameter.f2864b;
        String strM13367d = c7064j.m13367d(WORKER_CLASS_NAME);
        if (strM13367d == null) {
            throw new IllegalArgumentException("Worker class name is missing");
        }
        this.workerClassName = strM13367d;
        this.workerId = c7064j.m13367d("WORKER_ID");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object startWork$lambda$2$lambda$1(C8299i it) {
        AbstractC4154l.m8923f(it, "it");
        return new C7073s();
    }

    @Override // t8.AbstractC7076v
    public void onStopped() {
        super.onStopped();
        this.logger.debug("onStopped for " + getId());
        AbstractC7076v abstractC7076v = this.delegateWorker;
        if (abstractC7076v != null) {
            abstractC7076v.onStopped();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t8.AbstractC7076v
    public InterfaceFutureC8957d startWork() {
        AbstractC7076v abstractC7076vCreateWorker;
        TransferWorkerFactory transferWorkerFactory = (TransferWorkerFactory) workerFactories.get(this.workerId);
        if (transferWorkerFactory != null) {
            Context applicationContext = getApplicationContext();
            AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
            abstractC7076vCreateWorker = transferWorkerFactory.createWorker(applicationContext, this.workerClassName, this.parameter);
        } else {
            abstractC7076vCreateWorker = null;
        }
        this.delegateWorker = abstractC7076vCreateWorker;
        if (abstractC7076vCreateWorker != null) {
            InterfaceFutureC8957d interfaceFutureC8957dStartWork = abstractC7076vCreateWorker.startWork();
            AbstractC4154l.m8922e(interfaceFutureC8957dStartWork, "startWork(...)");
            return interfaceFutureC8957dStartWork;
        }
        if (isWorkerFactoriesInitialized) {
            throw new IllegalStateException(m0.m7378k("Failed to find delegate for ", this.workerClassName));
        }
        this.logger.error("DelegateWorker not initialized, initialize WorkerFactory");
        return i7.m11697b(new C0011j(24));
    }
}
