package kotlinx.coroutines.internal;

import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: a */
    public final transient InterfaceC7564h f21169a;

    public DiagnosticCoroutineContextException(InterfaceC7564h interfaceC7564h) {
        this.f21169a = interfaceC7564h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f21169a);
    }
}
