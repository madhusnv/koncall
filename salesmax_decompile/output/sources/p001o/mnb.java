package p001o;

import com.amplifyframework.api.aws.MultiAuthAppSyncGraphQLOperation;

/* loaded from: classes5.dex */
public final /* synthetic */ class mnb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MultiAuthAppSyncGraphQLOperation f35752a;

    public /* synthetic */ mnb(MultiAuthAppSyncGraphQLOperation multiAuthAppSyncGraphQLOperation) {
        this.f35752a = multiAuthAppSyncGraphQLOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35752a.dispatchRequest();
    }
}
