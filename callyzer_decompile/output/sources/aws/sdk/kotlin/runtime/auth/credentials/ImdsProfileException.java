package aws.sdk.kotlin.runtime.auth.credentials;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ImdsProfileException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImdsProfileException(Exception cause) {
        super("Failed to load instance profile name", cause);
        AbstractC4154l.m8923f(cause, "cause");
    }
}
