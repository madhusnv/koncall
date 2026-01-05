package j8;

import android.security.keystore.KeyGenParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j8.g */
/* loaded from: classes.dex */
public abstract class AbstractC3605g {

    /* renamed from: a */
    public static final KeyGenParameterSpec f19234a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}
