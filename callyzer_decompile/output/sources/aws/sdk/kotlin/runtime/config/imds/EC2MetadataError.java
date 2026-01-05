package aws.sdk.kotlin.runtime.config.imds;

import aws.sdk.kotlin.runtime.AwsServiceException;
import jc.h0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class EC2MetadataError extends AwsServiceException {

    /* renamed from: d */
    public final h0 f3493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC2MetadataError(h0 status, String message) {
        super(message);
        AbstractC4154l.m8923f(status, "status");
        AbstractC4154l.m8923f(message, "message");
        this.f3493d = status;
    }
}
