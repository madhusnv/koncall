package okhttp3.internal.http2;

import java.io.IOException;
import qz.EnumC6384b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class StreamResetException extends IOException {

    /* renamed from: a */
    public final EnumC6384b f27087a;

    public StreamResetException(EnumC6384b enumC6384b) {
        super("stream was reset: " + enumC6384b);
        this.f27087a = enumC6384b;
    }
}
