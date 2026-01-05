package vl;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import wy.AbstractC8226a;
import wy.EnumC8227b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.f */
/* loaded from: classes.dex */
public final class C7722f extends AbstractC8226a {

    /* renamed from: f */
    public final /* synthetic */ int f37265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7722f(int i10, int i11, int i12, String str, String str2) {
        super(str, i10, i11, str2);
        this.f37265f = i12;
    }

    @Override // wy.AbstractC8226a
    /* renamed from: h */
    public final void mo14713h(Cipher cipher, EnumC8227b enumC8227b, byte[] bArr, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f37265f) {
            case 0:
                cipher.init(enumC8227b == EnumC8227b.Encrypt ? 1 : 2, m15403g(bArr));
                break;
            default:
                cipher.init(enumC8227b == EnumC8227b.Encrypt ? 1 : 2, m15403g(bArr), new IvParameterSpec(bArr2));
                break;
        }
    }
}
