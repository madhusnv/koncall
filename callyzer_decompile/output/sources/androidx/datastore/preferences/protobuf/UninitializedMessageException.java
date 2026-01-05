package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
