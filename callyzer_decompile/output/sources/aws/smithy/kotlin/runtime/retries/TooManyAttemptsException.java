package aws.smithy.kotlin.runtime.retries;

import aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TooManyAttemptsException extends RetryException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooManyAttemptsException(String message, RetryCapacityExceededException retryCapacityExceededException, int i10, Object obj, Throwable th2) {
        super(message, retryCapacityExceededException, i10, obj, th2);
        AbstractC4154l.m8923f(message, "message");
    }
}
