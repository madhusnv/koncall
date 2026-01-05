package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Encodable;

/* loaded from: classes3.dex */
public class Composer {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private Composer() {
    }

    public static Composer compose() {
        return new Composer();
    }

    public Composer bool(boolean z6) {
        this.bos.write(z6 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.bos.toByteArray();
    }

    public Composer bytes(Encodable encodable) throws IOException {
        try {
            this.bos.write(encodable.getEncoded());
            return this;
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public Composer pad(int i10, int i11) {
        while (i11 >= 0) {
            try {
                this.bos.write(i10);
                i11--;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage(), e2);
            }
        }
        return this;
    }

    public Composer padUntil(int i10, int i11) {
        while (this.bos.size() < i11) {
            this.bos.write(i10);
        }
        return this;
    }

    public Composer u16str(int i10) {
        int i11 = i10 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.bos.write((byte) (i11 >>> 8));
        this.bos.write((byte) i11);
        return this;
    }

    public Composer u32str(int i10) {
        this.bos.write((byte) (i10 >>> 24));
        this.bos.write((byte) (i10 >>> 16));
        this.bos.write((byte) (i10 >>> 8));
        this.bos.write((byte) i10);
        return this;
    }

    public Composer u64str(long j6) {
        u32str((int) (j6 >>> 32));
        u32str((int) j6);
        return this;
    }

    public Composer bytes(byte[] bArr) throws IOException {
        try {
            this.bos.write(bArr);
            return this;
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public Composer bytes(byte[] bArr, int i10, int i11) {
        try {
            this.bos.write(bArr, i10, i11);
            return this;
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public Composer bytes(Encodable[] encodableArr) throws IOException {
        try {
            for (Encodable encodable : encodableArr) {
                this.bos.write(encodable.getEncoded());
            }
            return this;
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public Composer bytes(byte[][] bArr) throws IOException {
        try {
            for (byte[] bArr2 : bArr) {
                this.bos.write(bArr2);
            }
            return this;
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public Composer bytes(byte[][] bArr, int i10, int i11) throws IOException {
        while (i10 != i11) {
            try {
                this.bos.write(bArr[i10]);
                i10++;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage(), e2);
            }
        }
        return this;
    }
}
