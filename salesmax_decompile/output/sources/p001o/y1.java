package p001o;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.datastore.DataStoreException;

/* loaded from: classes5.dex */
public final /* synthetic */ class y1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ fl3 f54698a;

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f54698a.onError((DataStoreException) obj);
    }
}
