package p001o;

import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public final class sb2 implements tb2 {

    /* renamed from: a */
    public final Future f45106a;

    public sb2(Future future) {
        this.f45106a = future;
    }

    @Override // p001o.tb2
    /* renamed from: a */
    public void mo23886a(Throwable th) {
        this.f45106a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f45106a + ']';
    }
}
