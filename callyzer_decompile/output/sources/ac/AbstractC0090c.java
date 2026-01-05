package ac;

import gc.AbstractC2562f;
import gc.C2558b;
import zb.AbstractC8912f;
import zb.C8910d;
import zb.C8911e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ac.c */
/* loaded from: classes.dex */
public abstract class AbstractC0090c {

    /* renamed from: a */
    public static final C2558b f341a;

    /* renamed from: b */
    public static final C2558b f342b;

    static {
        AbstractC2562f.f13965b.invoke("sdk.maxAttempts", "SDK_MAX_ATTEMPTS");
        f341a = new C2558b(C0089b.f340a, "SDK_MIN_TLS", "sdk.minTls", null);
        f342b = new C2558b(new C0088a(1, AbstractC8912f.f42879b, C8910d.class, "fromString", "fromString(Ljava/lang/String;)Laws/smithy/kotlin/runtime/client/LogMode;", 0, 0), "sdk.logMode", "SDK_LOG_MODE", C8911e.f42873d);
    }
}
