package org.bouncycastle.pqc.crypto.lms;

import a2.AbstractC0030c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
class LMOtsPublicKey implements Encodable {

    /* renamed from: I */
    private final byte[] f28063I;

    /* renamed from: K */
    private final byte[] f28064K;
    private final LMOtsParameters parameter;

    /* renamed from: q */
    private final int f28065q;

    public LMOtsPublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i10, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.f28063I = bArr;
        this.f28065q = i10;
        this.f28064K = bArr2;
    }

    public static LMOtsPublicKey getInstance(Object obj) throws Throwable {
        if (obj instanceof LMOtsPublicKey) {
            return (LMOtsPublicKey) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i10 = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new LMOtsPublicKey(parametersForType, bArr, i10, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(AbstractC0030c.m118i(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMOtsPublicKey lMOtsPublicKey = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsPublicKey;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public LMSContext createOtsContext(LMOtsSignature lMOtsSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.f28063I, digest);
        LmsUtils.u32str(this.f28065q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMOtsSignature.getC(), digest);
        return new LMSContext(this, lMOtsSignature, digest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey) obj;
            if (this.f28065q == lMOtsPublicKey.f28065q && Objects.areEqual(this.parameter, lMOtsPublicKey.parameter) && Arrays.areEqual(this.f28063I, lMOtsPublicKey.f28063I) && Arrays.areEqual(this.f28064K, lMOtsPublicKey.f28064K)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.parameter.getType()).bytes(this.f28063I).u32str(this.f28065q).bytes(this.f28064K).build();
    }

    public byte[] getI() {
        return this.f28063I;
    }

    public byte[] getK() {
        return this.f28064K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f28065q;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28064K) + ((((Arrays.hashCode(this.f28063I) + (Objects.hashCode(this.parameter) * 31)) * 31) + this.f28065q) * 31);
    }

    public LMSContext createOtsContext(LMSSignature lMSSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.f28063I, digest);
        LmsUtils.u32str(this.f28065q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMSSignature.getOtsSignature().getC(), digest);
        return new LMSContext(this, lMSSignature, digest);
    }
}
