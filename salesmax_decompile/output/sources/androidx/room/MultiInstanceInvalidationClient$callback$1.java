package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.this$0 = multiInstanceInvalidationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInvalidation$lambda$0(MultiInstanceInvalidationClient multiInstanceInvalidationClient, String[] strArr) {
        sq8.m48649h(multiInstanceInvalidationClient, "this$0");
        sq8.m48649h(strArr, "$tables");
        multiInstanceInvalidationClient.getInvalidationTracker().notifyObserversByTableNames((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(final String[] strArr) {
        sq8.m48649h(strArr, "tables");
        Executor executor = this.this$0.getExecutor();
        final MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.this$0;
        executor.execute(new Runnable() { // from class: o.aob
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0(multiInstanceInvalidationClient, strArr);
            }
        });
    }
}
