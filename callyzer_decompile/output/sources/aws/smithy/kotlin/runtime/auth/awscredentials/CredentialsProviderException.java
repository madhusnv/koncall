package aws.smithy.kotlin.runtime.auth.awscredentials;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialsProviderException extends ClientException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialsProviderException(String message, int i10) {
        super(message, null);
        AbstractC4154l.m8923f(message, "message");
    }
}
