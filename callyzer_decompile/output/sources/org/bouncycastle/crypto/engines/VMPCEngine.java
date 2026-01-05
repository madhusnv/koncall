package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes3.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* renamed from: n */
    protected byte f27677n = 0;

    /* renamed from: P */
    protected byte[] f27676P = null;

    /* renamed from: s */
    protected byte f27678s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
        String algorithmName = getAlgorithmName();
        byte[] bArr = this.workingKey;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, bArr.length >= 32 ? 256 : bArr.length * 8, cipherParameters, Utils.getPurpose(z6)));
    }

    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f27678s = (byte) 0;
        this.f27676P = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f27676P[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f27676P;
            byte b10 = this.f27678s;
            int i12 = i11 & 255;
            byte b11 = bArr3[i12];
            byte b12 = bArr3[(b10 + b11 + bArr[i11 % bArr.length]) & 255];
            this.f27678s = b12;
            bArr3[i12] = bArr3[b12 & 255];
            bArr3[b12 & 255] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f27676P;
            byte b13 = this.f27678s;
            int i14 = i13 & 255;
            byte b14 = bArr4[i14];
            byte b15 = bArr4[(b13 + b14 + bArr2[i13 % bArr2.length]) & 255];
            this.f27678s = b15;
            bArr4[i14] = bArr4[b15 & 255];
            bArr4[b15 & 255] = b14;
        }
        this.f27677n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr3 = this.f27676P;
            byte b10 = this.f27678s;
            byte b11 = this.f27677n;
            byte b12 = bArr3[(b10 + bArr3[b11 & 255]) & 255];
            this.f27678s = b12;
            byte b13 = bArr3[(bArr3[bArr3[b12 & 255] & 255] + 1) & 255];
            byte b14 = bArr3[b11 & 255];
            bArr3[b11 & 255] = bArr3[b12 & 255];
            bArr3[b12 & 255] = b14;
            this.f27677n = (byte) ((b11 + 1) & 255);
            bArr2[i13 + i12] = (byte) (bArr[i13 + i10] ^ b13);
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        byte[] bArr = this.f27676P;
        byte b11 = this.f27678s;
        byte b12 = this.f27677n;
        byte b13 = bArr[(b11 + bArr[b12 & 255]) & 255];
        this.f27678s = b13;
        byte b14 = bArr[(bArr[bArr[b13 & 255] & 255] + 1) & 255];
        byte b15 = bArr[b12 & 255];
        bArr[b12 & 255] = bArr[b13 & 255];
        bArr[b13 & 255] = b15;
        this.f27677n = (byte) ((b12 + 1) & 255);
        return (byte) (b10 ^ b14);
    }
}
