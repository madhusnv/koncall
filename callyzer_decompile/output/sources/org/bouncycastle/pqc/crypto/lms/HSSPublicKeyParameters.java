package org.bouncycastle.pqc.crypto.lms;

import a2.AbstractC0030c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import mm.AbstractC4801l;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class HSSPublicKeyParameters extends LMSKeyParameters implements LMSContextBasedVerifier {

    /* renamed from: l */
    private final int f28057l;
    private final LMSPublicKeyParameters lmsPublicKey;

    public HSSPublicKeyParameters(int i10, LMSPublicKeyParameters lMSPublicKeyParameters) {
        super(false);
        this.f28057l = i10;
        this.lmsPublicKey = lMSPublicKeyParameters;
    }

    public static HSSPublicKeyParameters getInstance(Object obj) throws Throwable {
        if (obj instanceof HSSPublicKeyParameters) {
            return (HSSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            return new HSSPublicKeyParameters(((DataInputStream) obj).readInt(), LMSPublicKeyParameters.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(AbstractC0030c.m118i(obj, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSPublicKeyParameters hSSPublicKeyParameters = getInstance(dataInputStream2);
                dataInputStream2.close();
                return hSSPublicKeyParameters;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) obj;
        if (this.f28057l != hSSPublicKeyParameters.f28057l) {
            return false;
        }
        return this.lmsPublicKey.equals(hSSPublicKeyParameters.lmsPublicKey);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public LMSContext generateLMSContext(byte[] bArr) {
        try {
            HSSSignature hSSSignature = HSSSignature.getInstance(bArr, getL());
            LMSSignedPubKey[] signedPubKey = hSSSignature.getSignedPubKey();
            return (signedPubKey.length != 0 ? signedPubKey[signedPubKey.length - 1].getPublicKey() : getLMSPublicKey()).generateOtsContext(hSSSignature.getSignature()).withSignedPublicKeys(signedPubKey);
        } catch (IOException e2) {
            throw new IllegalStateException(AbstractC4801l.m9731e(e2, new StringBuilder("cannot parse signature: ")));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.f28057l).bytes(this.lmsPublicKey.getEncoded()).build();
    }

    public int getL() {
        return this.f28057l;
    }

    public LMSPublicKeyParameters getLMSPublicKey() {
        return this.lmsPublicKey;
    }

    public int hashCode() {
        return this.lmsPublicKey.hashCode() + (this.f28057l * 31);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public boolean verify(LMSContext lMSContext) {
        LMSSignedPubKey[] signedPubKeys = lMSContext.getSignedPubKeys();
        if (signedPubKeys.length != getL() - 1) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKey = getLMSPublicKey();
        boolean z6 = false;
        for (int i10 = 0; i10 < signedPubKeys.length; i10++) {
            if (!LMS.verifySignature(lMSPublicKey, signedPubKeys[i10].getSignature(), signedPubKeys[i10].getPublicKey().toByteArray())) {
                z6 = true;
            }
            lMSPublicKey = signedPubKeys[i10].getPublicKey();
        }
        return lMSPublicKey.verify(lMSContext) & (!z6);
    }
}
