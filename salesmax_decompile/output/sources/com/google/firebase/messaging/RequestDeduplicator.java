package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p001o.vo0;

/* loaded from: classes5.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, Task<String>> getTokenRequests = new vo0();

    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String str, Task task) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.getTokenRequests.get(str);
        if (task != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Joining ongoing request for: ");
                sb.append(str);
            }
            return task;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Making new request for: ");
            sb2.append(str);
        }
        Task taskContinueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.f13416a.lambda$getOrStartGetTokenRequest$0(str, task2);
            }
        });
        this.getTokenRequests.put(str, taskContinueWithTask);
        return taskContinueWithTask;
    }
}
