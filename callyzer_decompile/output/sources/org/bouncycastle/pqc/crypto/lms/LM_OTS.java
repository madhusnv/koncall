package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class LM_OTS {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    public static int cksm(byte[] bArr, int i10, LMOtsParameters lMOtsParameters) {
        int w5 = (1 << lMOtsParameters.getW()) - 1;
        int iCoef = 0;
        for (int i11 = 0; i11 < (i10 * 8) / lMOtsParameters.getW(); i11++) {
            iCoef = (iCoef + w5) - coef(bArr, i11, lMOtsParameters.getW());
        }
        return iCoef << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i10, int i11) {
        int i12 = (i10 * i11) / 8;
        return (bArr[i12] >>> (((~i10) & ((8 / i11) - 1)) * i11)) & ((1 << i11) - 1);
    }

    public static LMOtsSignature lm_ots_generate_signature(LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = lMOtsPrivateKey.getParameter();
        int n6 = parameter.getN();
        int p4 = parameter.getP();
        int w5 = parameter.getW();
        byte[] bArr3 = new byte[p4 * n6];
        Digest digest = DigestUtil.getDigest(parameter);
        SeedDerive derivationFunction = lMOtsPrivateKey.getDerivationFunction();
        int iCksm = cksm(bArr, n6, parameter);
        bArr[n6] = (byte) ((iCksm >>> 8) & 255);
        bArr[n6 + 1] = (byte) iCksm;
        int i10 = n6 + 23;
        byte[] bArrBuild = Composer.compose().bytes(lMOtsPrivateKey.getI()).u32str(lMOtsPrivateKey.getQ()).padUntil(0, i10).build();
        derivationFunction.setJ(0);
        int i11 = 0;
        while (i11 < p4) {
            Pack.shortToBigEndian((short) i11, bArrBuild, 20);
            derivationFunction.deriveSeed(bArrBuild, i11 < p4 + (-1), 23);
            int iCoef = coef(bArr, i11, w5);
            for (int i12 = 0; i12 < iCoef; i12++) {
                bArrBuild[22] = (byte) i12;
                digest.update(bArrBuild, 0, i10);
                digest.doFinal(bArrBuild, 23);
            }
            System.arraycopy(bArrBuild, 23, bArr3, n6 * i11, n6);
            i11++;
        }
        return new LMOtsSignature(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr, boolean z6) throws LMSException {
        if (lMOtsSignature.getType().equals(lMOtsPublicKey.getParameter())) {
            return Arrays.areEqual(lm_ots_validate_signature_calculate(lMOtsPublicKey, lMOtsSignature, bArr), lMOtsPublicKey.getK());
        }
        throw new LMSException("public key and signature ots types do not match");
    }

    public static byte[] lm_ots_validate_signature_calculate(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr) {
        LMSContext lMSContextCreateOtsContext = lMOtsPublicKey.createOtsContext(lMOtsSignature);
        LmsUtils.byteArray(bArr, lMSContextCreateOtsContext);
        return lm_ots_validate_signature_calculate(lMSContextCreateOtsContext);
    }

    public static LMOtsPublicKey lms_ots_generatePublicKey(LMOtsPrivateKey lMOtsPrivateKey) {
        return new LMOtsPublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lms_ots_generatePublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lMOtsPrivateKey.getMasterSecret()));
    }

    public static LMOtsSignature lm_ots_generate_signature(LMSigParameters lMSigParameters, LMOtsPrivateKey lMOtsPrivateKey, byte[][] bArr, byte[] bArr2, boolean z6) {
        byte[] c2;
        byte[] q10 = new byte[34];
        if (z6) {
            int n6 = lMOtsPrivateKey.getParameter().getN();
            c2 = new byte[n6];
            System.arraycopy(bArr2, 0, q10, 0, n6);
        } else {
            LMSContext signatureContext = lMOtsPrivateKey.getSignatureContext(lMSigParameters, bArr);
            LmsUtils.byteArray(bArr2, 0, bArr2.length, signatureContext);
            c2 = signatureContext.getC();
            q10 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(lMOtsPrivateKey, q10, c2);
    }

    public static byte[] lm_ots_validate_signature_calculate(LMSContext lMSContext) {
        LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lMSContext.getSignature();
        LMOtsSignature otsSignature = signature instanceof LMSSignature ? ((LMSSignature) signature).getOtsSignature() : (LMOtsSignature) signature;
        int n6 = parameter.getN();
        int w5 = parameter.getW();
        int p4 = parameter.getP();
        byte[] q10 = lMSContext.getQ();
        int iCksm = cksm(q10, n6, parameter);
        q10[n6] = (byte) ((iCksm >>> 8) & 255);
        q10[n6 + 1] = (byte) iCksm;
        byte[] i10 = publicKey.getI();
        int q11 = publicKey.getQ();
        Digest digest = DigestUtil.getDigest(parameter);
        LmsUtils.byteArray(i10, digest);
        LmsUtils.u32str(q11, digest);
        LmsUtils.u16str(D_PBLC, digest);
        Composer composerU32str = Composer.compose().bytes(i10).u32str(q11);
        int i11 = n6 + 23;
        byte[] bArrBuild = composerU32str.padUntil(0, i11).build();
        int i12 = (1 << w5) - 1;
        byte[] y10 = otsSignature.getY();
        Digest digest2 = DigestUtil.getDigest(parameter);
        for (int i13 = 0; i13 < p4; i13++) {
            Pack.shortToBigEndian((short) i13, bArrBuild, 20);
            System.arraycopy(y10, i13 * n6, bArrBuild, 23, n6);
            for (int iCoef = coef(q10, i13, w5); iCoef < i12; iCoef++) {
                bArrBuild[22] = (byte) iCoef;
                digest2.update(bArrBuild, 0, i11);
                digest2.doFinal(bArrBuild, 23);
            }
            digest.update(bArrBuild, 23, n6);
        }
        byte[] bArr = new byte[n6];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i10, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild = Composer.compose().bytes(bArr).u32str(i10).u16str(-32640).padUntil(0, 22).build();
        digest.update(bArrBuild, 0, bArrBuild.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild2 = Composer.compose().bytes(bArr).u32str(i10).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters));
        seedDerive.setQ(i10);
        seedDerive.setJ(0);
        int p4 = lMOtsParameters.getP();
        int n6 = lMOtsParameters.getN();
        int w5 = (1 << lMOtsParameters.getW()) - 1;
        int i11 = 0;
        while (i11 < p4) {
            seedDerive.deriveSeed(bArrBuild2, i11 < p4 + (-1), 23);
            Pack.shortToBigEndian((short) i11, bArrBuild2, 20);
            for (int i12 = 0; i12 < w5; i12++) {
                bArrBuild2[22] = (byte) i12;
                digest2.update(bArrBuild2, 0, bArrBuild2.length);
                digest2.doFinal(bArrBuild2, 23);
            }
            digest.update(bArrBuild2, 23, n6);
            i11++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
