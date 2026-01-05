package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class GLVTypeAParameters {

    /* renamed from: i */
    protected final BigInteger f27937i;
    protected final BigInteger lambda;
    protected final ScalarSplitParameters splitParams;

    public GLVTypeAParameters(BigInteger bigInteger, BigInteger bigInteger2, ScalarSplitParameters scalarSplitParameters) {
        this.f27937i = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = scalarSplitParameters;
    }

    public BigInteger getI() {
        return this.f27937i;
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public ScalarSplitParameters getSplitParams() {
        return this.splitParams;
    }
}
