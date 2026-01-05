package aws.sdk.kotlin.services.s3.model;

import kotlin.jvm.internal.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class EncryptionTypeMismatch extends S3Exception {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EncryptionTypeMismatch.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a0.m8901a(EncryptionTypeMismatch.class).hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "EncryptionTypeMismatch()";
    }
}
