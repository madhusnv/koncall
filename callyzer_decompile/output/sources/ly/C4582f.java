package ly;

import a6.C0058f;
import ee.C2039g;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.f */
/* loaded from: classes3.dex */
public final class C4582f extends C0058f {

    /* renamed from: c */
    public final boolean f22711c;

    public C4582f(C2039g c2039g, boolean z6) {
        super(c2039g);
        this.f22711c = z6;
    }

    @Override // a6.C0058f
    /* renamed from: h */
    public final void mo169h(byte b10) {
        if (this.f22711c) {
            mo175n(String.valueOf(b10 & 255));
        } else {
            m173l(String.valueOf(b10 & 255));
        }
    }

    @Override // a6.C0058f
    /* renamed from: j */
    public final void mo171j(int i10) {
        if (this.f22711c) {
            mo175n(Long.toString(i10 & 4294967295L, 10));
        } else {
            m173l(Long.toString(i10 & 4294967295L, 10));
        }
    }

    @Override // a6.C0058f
    /* renamed from: k */
    public final void mo172k(long j6) {
        int i10 = 63;
        String str = "0";
        if (this.f22711c) {
            if (j6 != 0) {
                if (j6 > 0) {
                    str = Long.toString(j6, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j6 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j6 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            mo175n(str);
            return;
        }
        if (j6 != 0) {
            if (j6 > 0) {
                str = Long.toString(j6, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j6 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j6 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        m173l(str);
    }

    @Override // a6.C0058f
    /* renamed from: m */
    public final void mo174m(short s5) {
        if (this.f22711c) {
            mo175n(String.valueOf(s5 & HPKE.aead_EXPORT_ONLY));
        } else {
            m173l(String.valueOf(s5 & HPKE.aead_EXPORT_ONLY));
        }
    }
}
