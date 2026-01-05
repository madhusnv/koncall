package p001o;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class xc4 {

    /* renamed from: a */
    public byte[] f53485a;

    /* renamed from: b */
    public byte[] f53486b;

    /* renamed from: c */
    public int f53487c;

    /* renamed from: d */
    public int[] f53488d;

    /* renamed from: e */
    public int[] f53489e;

    /* renamed from: f */
    public int f53490f;

    /* renamed from: g */
    public int f53491g;

    /* renamed from: h */
    public int f53492h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f53493i;

    /* renamed from: j */
    public final C18109b f53494j;

    /* renamed from: o.xc4$b */
    public static final class C18109b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f53495a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f53496b;

        /* renamed from: b */
        public final void m55970b(int i, int i2) {
            this.f53496b.set(i, i2);
            this.f53495a.setPattern(this.f53496b);
        }

        public C18109b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f53495a = cryptoInfo;
            this.f53496b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xc4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f53493i = cryptoInfo;
        this.f53494j = sqi.f45790a >= 24 ? new C18109b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m55966a() {
        return this.f53493i;
    }

    /* renamed from: b */
    public void m55967b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f53488d == null) {
            int[] iArr = new int[1];
            this.f53488d = iArr;
            this.f53493i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f53488d;
        iArr2[0] = iArr2[0] + i;
    }

    /* renamed from: c */
    public void m55968c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f53490f = i;
        this.f53488d = iArr;
        this.f53489e = iArr2;
        this.f53486b = bArr;
        this.f53485a = bArr2;
        this.f53487c = i2;
        this.f53491g = i3;
        this.f53492h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f53493i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (sqi.f45790a >= 24) {
            ((C18109b) op0.m42515e(this.f53494j)).m55970b(i3, i4);
        }
    }
}
