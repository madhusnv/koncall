package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class UnknownException extends AuthException {
    public static final Companion Companion = new Companion(null);
    public static final String RECOVERY_SUGGESTION_WITHOUT_THROWABLE = "Sorry, we don’t have a recovery suggestion for this error.";
    public static final String RECOVERY_SUGGESTION_WITH_THROWABLE = "See the attached exception for more details";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnknownException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UnknownException(String str, Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? "An unclassified error prevented this operation." : str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownException(String message, Throwable th2) {
        super(message, th2 != null ? "See the attached exception for more details" : "Sorry, we don’t have a recovery suggestion for this error.", th2);
        AbstractC4154l.m8923f(message, "message");
    }
}
