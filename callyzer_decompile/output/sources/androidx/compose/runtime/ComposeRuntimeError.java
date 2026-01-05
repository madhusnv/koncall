package androidx.compose.runtime;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: a */
    public final String f2086a;

    public ComposeRuntimeError(String str) {
        this.f2086a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2086a;
    }
}
