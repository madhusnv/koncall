package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.LabelType;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.models.TextFormatType;
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.InterpretResult;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.nio.ByteBuffer;
import p001o.lhe;
import p001o.mdd;
import p001o.njh;
import p001o.qc4;
import p001o.up3;
import p001o.xvh;

/* loaded from: classes5.dex */
public final class AWSPredictionsService {
    private final AWSComprehendService comprehendService;
    private final AWSPredictionsPluginConfiguration configuration;
    private final AWSPollyService pollyService;
    private final AWSRekognitionService rekognitionService;
    private final AWSTextractService textractService;
    private final AWSTranslateService translateService;

    public AWSPredictionsService(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, qc4 qc4Var) {
        this.configuration = aWSPredictionsPluginConfiguration;
        this.pollyService = new AWSPollyService(aWSPredictionsPluginConfiguration, qc4Var);
        this.translateService = new AWSTranslateService(aWSPredictionsPluginConfiguration, qc4Var);
        this.rekognitionService = new AWSRekognitionService(aWSPredictionsPluginConfiguration, qc4Var);
        this.textractService = new AWSTextractService(aWSPredictionsPluginConfiguration, qc4Var);
        this.comprehendService = new AWSComprehendService(aWSPredictionsPluginConfiguration, qc4Var);
    }

    private LabelType getLabelType(IdentifyAction identifyAction) {
        try {
            return (LabelType) identifyAction;
        } catch (ClassCastException unused) {
            return this.configuration.getIdentifyLabelsConfiguration().getType();
        }
    }

    private TextFormatType getTextFormatType(IdentifyAction identifyAction) {
        try {
            return (TextFormatType) identifyAction;
        } catch (ClassCastException unused) {
            return this.configuration.getIdentifyTextConfiguration().getFormat();
        }
    }

    public void comprehend(String str, Consumer<InterpretResult> consumer, Consumer<PredictionsException> consumer2) {
        this.comprehendService.comprehend(str, consumer, consumer2);
    }

    public void detectEntities(ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        this.rekognitionService.detectEntities(byteBuffer, consumer, consumer2);
    }

    public void detectLabels(IdentifyAction identifyAction, ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        try {
            this.rekognitionService.detectLabels(getLabelType(identifyAction), byteBuffer, consumer, consumer2);
        } catch (PredictionsException e) {
            consumer2.accept(e);
        }
    }

    public void detectText(IdentifyAction identifyAction, ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        try {
            TextFormatType textFormatType = getTextFormatType(identifyAction);
            if (TextFormatType.PLAIN.equals(textFormatType)) {
                this.rekognitionService.detectPlainText(byteBuffer, consumer, consumer2);
            } else {
                this.textractService.detectDocumentText(textFormatType, byteBuffer, consumer, consumer2);
            }
        } catch (PredictionsException e) {
            consumer2.accept(e);
        }
    }

    public up3 getComprehendClient() {
        return this.comprehendService.getClient();
    }

    public mdd getPollyClient() {
        return this.pollyService.getClient();
    }

    public lhe getRekognitionClient() {
        return this.rekognitionService.getClient();
    }

    public njh getTextractClient() {
        return this.textractService.getClient();
    }

    public xvh getTranslateClient() {
        return this.translateService.getClient();
    }

    public void recognizeCelebrities(ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) throws PredictionsException {
        this.rekognitionService.recognizeCelebrities(byteBuffer, consumer, consumer2);
    }

    public void synthesizeSpeech(String str, AWSVoiceType aWSVoiceType, Consumer<TextToSpeechResult> consumer, Consumer<PredictionsException> consumer2) {
        this.pollyService.synthesizeSpeech(str, aWSVoiceType, consumer, consumer2);
    }

    public void translate(String str, LanguageType languageType, LanguageType languageType2, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        this.translateService.translate(str, languageType, languageType2, consumer, consumer2);
    }
}
