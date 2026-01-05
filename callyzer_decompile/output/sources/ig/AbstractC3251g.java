package ig;

import android.util.Base64;
import java.security.SecureRandom;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.g */
/* loaded from: classes.dex */
public abstract class AbstractC3251g {

    /* renamed from: a */
    public static final SecureRandom f17430a = new SecureRandom();

    /* renamed from: a */
    public static String m7596a() {
        byte[] bArr = new byte[16];
        f17430a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
