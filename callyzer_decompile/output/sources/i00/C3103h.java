package i00;

import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.h */
/* loaded from: classes3.dex */
public final class C3103h extends CompletableFuture {

    /* renamed from: a */
    public final C3119x f16664a;

    public C3103h(C3119x c3119x) {
        this.f16664a = c3119x;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        if (z6) {
            this.f16664a.cancel();
        }
        return super.cancel(z6);
    }
}
