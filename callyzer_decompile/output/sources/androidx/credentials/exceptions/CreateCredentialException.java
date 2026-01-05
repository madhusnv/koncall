package androidx.credentials.exceptions;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class CreateCredentialException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCredentialException(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        AbstractC4154l.m8923f(type, "type");
    }
}
