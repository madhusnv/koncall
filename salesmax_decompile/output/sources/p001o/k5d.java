package p001o;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.datastore.DataStoreException;

/* loaded from: classes5.dex */
public final /* synthetic */ class k5d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ auf f31493a;

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f31493a.onError((DataStoreException) obj);
    }
}
