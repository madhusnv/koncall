package mg;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends AbstractC4723b implements Serializable {

    /* renamed from: e */
    public final MessageDigest f23659e;

    /* renamed from: f */
    public final int f23660f;

    /* renamed from: g */
    public final boolean f23661g;

    /* renamed from: h */
    public final String f23662h;

    public k0() throws NoSuchAlgorithmException, CloneNotSupportedException {
        boolean z6;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f23659e = messageDigest;
            this.f23660f = messageDigest.getDigestLength();
            this.f23662h = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z6 = true;
            } catch (CloneNotSupportedException unused) {
                z6 = false;
            }
            this.f23661g = z6;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        return this.f23662h;
    }
}
