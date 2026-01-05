package com.amplifyframework.storage;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageFilePermissionException extends AmplifyException {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InternalAmplifyApi
    public StorageFilePermissionException(String message, String recoverySuggestion) {
        super(message, recoverySuggestion);
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(recoverySuggestion, "recoverySuggestion");
    }
}
