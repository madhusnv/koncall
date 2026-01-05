package androidx.credentials.exceptions;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CreateCredentialCancellationException extends CreateCredentialException {
    public CreateCredentialCancellationException() {
        this(null);
    }

    public CreateCredentialCancellationException(String str) {
        super(str, "android.credentials.CreateCredentialException.TYPE_USER_CANCELED");
    }
}
