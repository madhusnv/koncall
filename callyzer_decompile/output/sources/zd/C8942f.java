package zd;

import java.io.Closeable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zd.f */
/* loaded from: classes.dex */
public final class C8942f implements Closeable {

    /* renamed from: a */
    public final C8938b f42945a;

    public C8942f(C8938b c8938b) {
        this.f42945a = c8938b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42945a.close();
    }
}
