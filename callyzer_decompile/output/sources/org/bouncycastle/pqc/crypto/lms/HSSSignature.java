package org.bouncycastle.pqc.crypto.lms;

import a2.AbstractC0030c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
class HSSSignature implements Encodable {
    private final int lMinus1;
    private final LMSSignature signature;
    private final LMSSignedPubKey[] signedPubKey;

    public HSSSignature(int i10, LMSSignedPubKey[] lMSSignedPubKeyArr, LMSSignature lMSSignature) {
        this.lMinus1 = i10;
        this.signedPubKey = lMSSignedPubKeyArr;
        this.signature = lMSSignature;
    }

    public static HSSSignature getInstance(Object obj, int i10) {
        if (obj instanceof HSSSignature) {
            return (HSSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            int i11 = ((DataInputStream) obj).readInt();
            if (i11 != i10 - 1) {
                throw new IllegalStateException("nspk exceeded maxNspk");
            }
            LMSSignedPubKey[] lMSSignedPubKeyArr = new LMSSignedPubKey[i11];
            if (i11 != 0) {
                for (int i12 = 0; i12 < i11; i12++) {
                    lMSSignedPubKeyArr[i12] = new LMSSignedPubKey(LMSSignature.getInstance(obj), LMSPublicKeyParameters.getInstance(obj));
                }
            }
            return new HSSSignature(i11, lMSSignedPubKeyArr, LMSSignature.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj), i10);
            }
            throw new IllegalArgumentException(AbstractC0030c.m118i(obj, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSSignature hSSSignature = getInstance(dataInputStream2, i10);
                dataInputStream2.close();
                return hSSSignature;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HSSSignature hSSSignature = (HSSSignature) obj;
            if (this.lMinus1 != hSSSignature.lMinus1 || this.signedPubKey.length != hSSSignature.signedPubKey.length) {
                return false;
            }
            int i10 = 0;
            while (true) {
                LMSSignedPubKey[] lMSSignedPubKeyArr = this.signedPubKey;
                if (i10 >= lMSSignedPubKeyArr.length) {
                    LMSSignature lMSSignature = this.signature;
                    LMSSignature lMSSignature2 = hSSSignature.signature;
                    if (lMSSignature != null) {
                        return lMSSignature.equals(lMSSignature2);
                    }
                    if (lMSSignature2 == null) {
                        return true;
                    }
                } else {
                    if (!lMSSignedPubKeyArr[i10].equals(hSSSignature.signedPubKey[i10])) {
                        return false;
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        Composer composerCompose = Composer.compose();
        composerCompose.u32str(this.lMinus1);
        LMSSignedPubKey[] lMSSignedPubKeyArr = this.signedPubKey;
        if (lMSSignedPubKeyArr != null) {
            for (LMSSignedPubKey lMSSignedPubKey : lMSSignedPubKeyArr) {
                composerCompose.bytes(lMSSignedPubKey);
            }
        }
        composerCompose.bytes(this.signature);
        return composerCompose.build();
    }

    public LMSSignature getSignature() {
        return this.signature;
    }

    public LMSSignedPubKey[] getSignedPubKey() {
        return this.signedPubKey;
    }

    public int getlMinus1() {
        return this.lMinus1;
    }

    public int hashCode() {
        int iHashCode = ((this.lMinus1 * 31) + Arrays.hashCode(this.signedPubKey)) * 31;
        LMSSignature lMSSignature = this.signature;
        return iHashCode + (lMSSignature != null ? lMSSignature.hashCode() : 0);
    }
}
