package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SignedOutException extends AuthException {
    public static final Companion Companion = new Companion(null);
    public static final String RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED = "Please sign in and reattempt the operation.";
    public static final String RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE = "If you have guest access enabled, please check that your device is online and try again. Otherwise if guest access is not enabled, you'll need to sign in and try again.";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public SignedOutException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ SignedOutException(String str, String str2, Throwable th2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? "You are currently signed out." : str, (i10 & 2) != 0 ? RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED : str2, (i10 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedOutException(String message, String recoverySuggestion, Throwable th2) {
        super(message, recoverySuggestion, th2);
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(recoverySuggestion, "recoverySuggestion");
    }
}
