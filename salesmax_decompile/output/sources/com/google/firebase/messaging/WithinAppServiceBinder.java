package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import p001o.ab4;

/* loaded from: classes5.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new ab4(), new OnCompleteListener() { // from class: com.google.firebase.messaging.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                bindRequest.finish();
            }
        });
    }
}
