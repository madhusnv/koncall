package az;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: az.a */
/* loaded from: classes3.dex */
public final class C0505a {

    /* renamed from: a */
    public final String f3558a;

    /* renamed from: b */
    public final int f3559b;

    /* renamed from: c */
    public final int f3560c;

    /* renamed from: d */
    public final byte[] f3561d;

    /* renamed from: e */
    public final boolean f3562e;

    /* renamed from: f */
    public Mac f3563f;

    public C0505a(String str, int i10, int i11, boolean z6) {
        this.f3558a = str;
        this.f3560c = i10;
        this.f3559b = i11;
        this.f3562e = z6;
        this.f3561d = new byte[i11];
    }

    /* renamed from: a */
    public final void m1501a(int i10, byte[] bArr) throws IllegalStateException, ShortBufferException {
        byte[] bArr2 = this.f3561d;
        try {
            int i11 = this.f3559b;
            int i12 = this.f3560c;
            if (i12 == i11) {
                this.f3563f.doFinal(bArr, i10);
            } else {
                this.f3563f.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10, i12);
            }
        } catch (ShortBufferException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: b */
    public final void m1502b(byte[] bArr) throws InvalidKeyException {
        int length = bArr.length;
        int i10 = this.f3559b;
        if (length > i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            bArr = bArr2;
        }
        String str = this.f3558a;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, str);
        try {
            Mac macM9951d = AbstractC5037q.m9951d(str);
            this.f3563f = macM9951d;
            macM9951d.init(secretKeySpec);
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: c */
    public final void m1503c(long j6) throws IllegalStateException {
        byte[] bArr = this.f3561d;
        bArr[0] = (byte) (j6 >>> 24);
        bArr[1] = (byte) (j6 >>> 16);
        bArr[2] = (byte) (j6 >>> 8);
        bArr[3] = (byte) j6;
        this.f3563f.update(bArr, 0, 4);
    }
}
