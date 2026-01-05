package p001o;

import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public final class xu5 implements yu5 {

    /* renamed from: a */
    public final Future f54296a;

    public xu5(Future future) {
        this.f54296a = future;
    }

    @Override // p001o.yu5
    public void dispose() {
        this.f54296a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f54296a + ']';
    }
}
