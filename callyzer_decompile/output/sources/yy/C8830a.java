package yy;

import java.security.MessageDigest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yy.a */
/* loaded from: classes3.dex */
public final class C8830a {

    /* renamed from: a */
    public final String f42531a;

    /* renamed from: b */
    public MessageDigest f42532b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8830a(int i10) {
        this(McElieceCCA2KeyGenParameterSpec.SHA1);
        switch (i10) {
            case 1:
                this("SHA-256");
                break;
            case 2:
                this(McElieceCCA2KeyGenParameterSpec.SHA384);
                break;
            case 3:
                this("SHA-512");
                break;
            default:
                break;
        }
    }

    /* renamed from: a */
    public final void m16283a(byte[] bArr, int i10, int i11) {
        this.f42532b.update(bArr, i10, i11);
    }

    public C8830a(String str) {
        this.f42531a = str;
    }
}
