package com.amplifyframework.predictions.aws;

import java.util.Objects;
import p001o.lhe;
import p001o.mdd;
import p001o.njh;
import p001o.up3;
import p001o.xvh;

/* loaded from: classes5.dex */
public final class AWSPredictionsEscapeHatch {
    private final up3 comprehend;
    private final mdd polly;
    private final lhe rekognition;
    private final njh textract;
    private final xvh translate;

    public AWSPredictionsEscapeHatch(xvh xvhVar, mdd mddVar, lhe lheVar, njh njhVar, up3 up3Var) {
        Objects.requireNonNull(xvhVar);
        this.translate = xvhVar;
        Objects.requireNonNull(mddVar);
        this.polly = mddVar;
        Objects.requireNonNull(lheVar);
        this.rekognition = lheVar;
        Objects.requireNonNull(njhVar);
        this.textract = njhVar;
        Objects.requireNonNull(up3Var);
        this.comprehend = up3Var;
    }

    public up3 getComprehendClient() {
        return this.comprehend;
    }

    public mdd getPollyClient() {
        return this.polly;
    }

    public lhe getRekognitionClient() {
        return this.rekognition;
    }

    public njh getTextractClient() {
        return this.textract;
    }

    public xvh getTranslateClient() {
        return this.translate;
    }
}
