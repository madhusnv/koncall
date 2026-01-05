package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001o.ab4;

/* loaded from: classes6.dex */
public class ConfigCacheClient {
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;
    private Task<ConfigContainer> cachedContainerTask = null;
    private final ExecutorService executorService;
    private final ConfigStorageClient storageClient;
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    private static final Executor DIRECT_EXECUTOR = new ab4();

    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        public void await() throws InterruptedException {
            this.latch.await();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }

        public boolean await(long j, TimeUnit timeUnit) {
            return this.latch.await(j, timeUnit);
        }
    }

    private ConfigCacheClient(ExecutorService executorService, ConfigStorageClient configStorageClient) {
        this.executorService = executorService;
        this.storageClient = configStorageClient;
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = DIRECT_EXECUTOR;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized void clearInstancesForTest() {
        clientInstances.clear();
    }

    public static synchronized ConfigCacheClient getInstance(ExecutorService executorService, ConfigStorageClient configStorageClient) {
        String fileName;
        Map<String, ConfigCacheClient> map;
        fileName = configStorageClient.getFileName();
        map = clientInstances;
        if (!map.containsKey(fileName)) {
            map.put(fileName, new ConfigCacheClient(executorService, configStorageClient));
        }
        return map.get(fileName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) {
        return this.storageClient.write(configContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$put$1(boolean z, ConfigContainer configContainer, Void r3) {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        this.cachedContainerTask = Tasks.forResult(configContainer);
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    public synchronized Task<ConfigContainer> get() {
        Task<ConfigContainer> task = this.cachedContainerTask;
        if (task == null || (task.isComplete() && !this.cachedContainerTask.isSuccessful())) {
            ExecutorService executorService = this.executorService;
            final ConfigStorageClient configStorageClient = this.storageClient;
            Objects.requireNonNull(configStorageClient);
            this.cachedContainerTask = Tasks.call(executorService, new Callable() { // from class: o.nq3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return configStorageClient.read();
                }
            });
        }
        return this.cachedContainerTask;
    }

    public ConfigContainer getBlocking() {
        return getBlocking(DISK_READ_TIMEOUT_IN_SECONDS);
    }

    public synchronized Task<ConfigContainer> getCachedContainerTask() {
        return this.cachedContainerTask;
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public ConfigContainer getBlocking(long j) {
        synchronized (this) {
            Task<ConfigContainer> task = this.cachedContainerTask;
            if (task == null || !task.isSuccessful()) {
                try {
                    return (ConfigContainer) await(get(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            }
            return this.cachedContainerTask.getResult();
        }
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.executorService, new Callable() { // from class: o.oq3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f38712a.lambda$put$0(configContainer);
            }
        }).onSuccessTask(this.executorService, new SuccessContinuation() { // from class: o.pq3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f40406a.lambda$put$1(z, configContainer, (Void) obj);
            }
        });
    }
}
