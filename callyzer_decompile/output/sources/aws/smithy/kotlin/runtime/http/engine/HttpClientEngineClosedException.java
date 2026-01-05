package aws.smithy.kotlin.runtime.http.engine;

import aws.smithy.kotlin.runtime.ClientException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HttpClientEngineClosedException extends ClientException {
    public HttpClientEngineClosedException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    public HttpClientEngineClosedException(int i10) {
        super("HttpClientEngine already closed");
    }
}
