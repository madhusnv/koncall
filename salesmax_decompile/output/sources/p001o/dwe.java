package p001o;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class dwe implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f20600a;

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f20600a.set((Cancelable) obj);
    }
}
