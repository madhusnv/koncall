package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.amplifyframework.storage.s3.transfer.worker.RouterWorker;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001o.g32;
import p001o.id5;
import p001o.sq8;
import p001o.y8;
import p001o.zfa;

/* loaded from: classes5.dex */
public final class RouterWorker extends ListenableWorker {
    public static final String WORKER_CLASS_NAME = "WORKER_CLASS_NAME";
    private static boolean isWorkerFactoriesInitialized;
    private ListenableWorker delegateWorker;
    private final Logger logger;
    private final WorkerParameters parameter;
    private final String workerClassName;
    private final String workerId;
    public static final Companion Companion = new Companion(null);
    private static final y8 workerFactories = new y8() { // from class: com.amplifyframework.storage.s3.transfer.worker.RouterWorker$Companion$workerFactories$1
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

        @Override // p001o.y8
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
        public TransferWorkerFactory put(String str, TransferWorkerFactory transferWorkerFactory) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(transferWorkerFactory, "value");
            RouterWorker.isWorkerFactoriesInitialized = true;
            return this.backingWorkerMap.put(str, transferWorkerFactory);
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

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final y8 getWorkerFactories() {
            return RouterWorker.workerFactories;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "appContext");
        sq8.m48649h(workerParameters, "parameter");
        this.parameter = workerParameters;
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{RouterWorker.class.getSimpleName()}, 1));
        sq8.m48648g(str, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
        String string = workerParameters.getInputData().getString(WORKER_CLASS_NAME);
        if (string == null) {
            throw new IllegalArgumentException("Worker class name is missing");
        }
        this.workerClassName = string;
        this.workerId = workerParameters.getInputData().getString("WORKER_ID");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object startWork$lambda$2$lambda$1(g32.C13614a c13614a) {
        sq8.m48649h(c13614a, "it");
        return ListenableWorker.Result.retry();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        this.logger.debug("onStopped for " + getId());
        ListenableWorker listenableWorker = this.delegateWorker;
        if (listenableWorker != null) {
            listenableWorker.onStopped();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.work.ListenableWorker
    public zfa startWork() {
        ListenableWorker listenableWorkerCreateWorker;
        TransferWorkerFactory transferWorkerFactory = (TransferWorkerFactory) workerFactories.get(this.workerId);
        if (transferWorkerFactory != null) {
            Context applicationContext = getApplicationContext();
            sq8.m48648g(applicationContext, "getApplicationContext(...)");
            listenableWorkerCreateWorker = transferWorkerFactory.createWorker(applicationContext, this.workerClassName, this.parameter);
        } else {
            listenableWorkerCreateWorker = null;
        }
        this.delegateWorker = listenableWorkerCreateWorker;
        if (listenableWorkerCreateWorker != null) {
            zfa zfaVarStartWork = listenableWorkerCreateWorker.startWork();
            sq8.m48648g(zfaVarStartWork, "startWork(...)");
            return zfaVarStartWork;
        }
        if (!isWorkerFactoriesInitialized) {
            this.logger.error("DelegateWorker not initialized, initialize WorkerFactory");
            zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.ive
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return RouterWorker.startWork$lambda$2$lambda$1(c13614a);
                }
            });
            sq8.m48648g(zfaVarM28002a, "getFuture(...)");
            return zfaVarM28002a;
        }
        throw new IllegalStateException("Failed to find delegate for " + this.workerClassName);
    }
}
