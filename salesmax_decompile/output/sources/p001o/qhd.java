package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes4.dex */
public class qhd implements hna {

    /* renamed from: a */
    public final nhd f42010a;

    /* renamed from: b */
    public final int f42011b;

    public qhd(nhd nhdVar, int i) throws InvalidAlgorithmParameterException {
        this.f42010a = nhdVar;
        this.f42011b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        nhdVar.mo40605a(new byte[0], i);
    }

    @Override // p001o.hna
    /* renamed from: a */
    public void mo30848a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!ar1.m17695b(mo30849b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // p001o.hna
    /* renamed from: b */
    public byte[] mo30849b(byte[] bArr) {
        return this.f42010a.mo40605a(bArr, this.f42011b);
    }
}
