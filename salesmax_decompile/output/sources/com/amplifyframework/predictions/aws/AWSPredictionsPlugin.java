package com.amplifyframework.predictions.aws;

import android.content.Context;
import android.graphics.Bitmap;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.auth.AWSCredentialsProviderKt;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.PredictionsPlugin;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation;
import com.amplifyframework.predictions.aws.operation.AWSInterpretOperation;
import com.amplifyframework.predictions.aws.operation.AWSTextToSpeechOperation;
import com.amplifyframework.predictions.aws.operation.AWSTranslateTextOperation;
import com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions;
import com.amplifyframework.predictions.aws.request.AWSComprehendRequest;
import com.amplifyframework.predictions.aws.request.AWSImageIdentifyRequest;
import com.amplifyframework.predictions.aws.request.AWSPollyRequest;
import com.amplifyframework.predictions.aws.request.AWSTranslateRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.aws.service.RunFaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSessionInformation;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.operation.IdentifyOperation;
import com.amplifyframework.predictions.operation.InterpretOperation;
import com.amplifyframework.predictions.operation.TextToSpeechOperation;
import com.amplifyframework.predictions.operation.TranslateTextOperation;
import com.amplifyframework.predictions.options.FaceLivenessSessionOptions;
import com.amplifyframework.predictions.options.IdentifyOptions;
import com.amplifyframework.predictions.options.InterpretOptions;
import com.amplifyframework.predictions.options.TextToSpeechOptions;
import com.amplifyframework.predictions.options.TranslateTextOptions;
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.InterpretResult;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p001o.qc4;

/* loaded from: classes5.dex */
public final class AWSPredictionsPlugin extends PredictionsPlugin<AWSPredictionsEscapeHatch> {
    private static final String AWS_PREDICTIONS_PLUGIN_KEY = "awsPredictionsPlugin";
    private AWSPredictionsPluginConfiguration configuration;
    private qc4 credentialsProvider;
    private qc4 credentialsProviderOverride;
    private final ExecutorService executorService;
    private AWSPredictionsService predictionsService;

    public AWSPredictionsPlugin() {
        this.executorService = Executors.newCachedThreadPool();
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(String str, FaceLivenessSessionInformation faceLivenessSessionInformation, Consumer<FaceLivenessSession> consumer, Action action, Consumer<PredictionsException> consumer2) {
        startFaceLivenessSession(str, faceLivenessSessionInformation, FaceLivenessSessionOptions.defaults(), consumer, action, consumer2);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) throws PredictionsException {
        configure(AWSPredictionsPluginConfiguration.fromJson(jSONObject));
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TextToSpeechOperation<?> convertTextToSpeech(String str, Consumer<TextToSpeechResult> consumer, Consumer<PredictionsException> consumer2) {
        return convertTextToSpeech(str, TextToSpeechOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return AWS_PREDICTIONS_PLUGIN_KEY;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.27.1";
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public IdentifyOperation<?> identify(IdentifyAction identifyAction, Bitmap bitmap, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        return identify(identifyAction, bitmap, IdentifyOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public InterpretOperation<?> interpret(String str, Consumer<InterpretResult> consumer, Consumer<PredictionsException> consumer2) {
        return interpret(str, InterpretOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(String str, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        return translateText(str, TranslateTextOptions.defaults(), consumer, consumer2);
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(String str, FaceLivenessSessionInformation faceLivenessSessionInformation, FaceLivenessSessionOptions faceLivenessSessionOptions, Consumer<FaceLivenessSession> consumer, Action action, Consumer<PredictionsException> consumer2) {
        startFaceLivenessSession(str, faceLivenessSessionInformation, faceLivenessSessionOptions, null, consumer, action, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TextToSpeechOperation<?> convertTextToSpeech(String str, TextToSpeechOptions textToSpeechOptions, Consumer<TextToSpeechResult> consumer, Consumer<PredictionsException> consumer2) {
        AWSTextToSpeechOperation aWSTextToSpeechOperation = new AWSTextToSpeechOperation(this.predictionsService, this.executorService, new AWSPollyRequest(str, AWSVoiceType.fromVoice(textToSpeechOptions.getVoiceType())), consumer, consumer2);
        aWSTextToSpeechOperation.start();
        return aWSTextToSpeechOperation;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public AWSPredictionsEscapeHatch getEscapeHatch() {
        return new AWSPredictionsEscapeHatch(this.predictionsService.getTranslateClient(), this.predictionsService.getPollyClient(), this.predictionsService.getRekognitionClient(), this.predictionsService.getTextractClient(), this.predictionsService.getComprehendClient());
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public IdentifyOperation<?> identify(IdentifyAction identifyAction, Bitmap bitmap, IdentifyOptions identifyOptions, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        AWSIdentifyOperation aWSIdentifyOperation = new AWSIdentifyOperation(this.predictionsService, this.executorService, identifyAction, AWSImageIdentifyRequest.fromBitmap(bitmap), consumer, consumer2);
        aWSIdentifyOperation.start();
        return aWSIdentifyOperation;
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public InterpretOperation<?> interpret(String str, InterpretOptions interpretOptions, Consumer<InterpretResult> consumer, Consumer<PredictionsException> consumer2) {
        AWSInterpretOperation aWSInterpretOperation = new AWSInterpretOperation(this.predictionsService, this.executorService, new AWSComprehendRequest(str), consumer, consumer2);
        aWSInterpretOperation.start();
        return aWSInterpretOperation;
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(String str, TranslateTextOptions translateTextOptions, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        LanguageType languageType = LanguageType.UNKNOWN;
        return translateText(str, languageType, languageType, translateTextOptions, consumer, consumer2);
    }

    public AWSPredictionsPlugin(qc4 qc4Var) {
        this();
        this.credentialsProviderOverride = qc4Var;
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(String str, FaceLivenessSessionInformation faceLivenessSessionInformation, String str2, Consumer<FaceLivenessSession> consumer, Action action, Consumer<PredictionsException> consumer2) {
        startFaceLivenessSession(str, faceLivenessSessionInformation, FaceLivenessSessionOptions.defaults(), str2, consumer, action, consumer2);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    @InternalAmplifyApi
    public void configure(AmplifyOutputsData amplifyOutputsData, Context context) throws PredictionsException {
        throw new PredictionsException("AWSPredictionsPlugin is not supported when using Amplify Gen2", "This plugin is not supported by Amplify Gen2. Remove this plugin to use Gen2.");
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(String str, LanguageType languageType, LanguageType languageType2, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        return translateText(str, languageType, languageType2, TranslateTextOptions.defaults(), consumer, consumer2);
    }

    private void configure(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration) throws PredictionsException {
        this.configuration = aWSPredictionsPluginConfiguration;
        qc4 cognitoCredentialsProvider = this.credentialsProviderOverride;
        if (cognitoCredentialsProvider == null) {
            try {
                cognitoCredentialsProvider = new CognitoCredentialsProvider();
            } catch (IllegalStateException e) {
                throw new PredictionsException("AWSPredictionsPlugin depends on AWSCognitoAuthPlugin but it is currently missing", e, "Before configuring Amplify, be sure to add AWSPredictionsPlugin same as you added AWSPinpointAnalyticsPlugin.");
            }
        }
        this.predictionsService = new AWSPredictionsService(aWSPredictionsPluginConfiguration, cognitoCredentialsProvider);
        this.credentialsProvider = cognitoCredentialsProvider;
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(String str, FaceLivenessSessionInformation faceLivenessSessionInformation, FaceLivenessSessionOptions faceLivenessSessionOptions, String str2, Consumer<FaceLivenessSession> consumer, Action action, Consumer<PredictionsException> consumer2) {
        qc4 qc4VarConvertToSdkCredentialsProvider;
        AWSCredentialsProvider<AWSCredentials> aWSCredentialsProviderM68963getCredentialsProvider = faceLivenessSessionOptions instanceof AWSFaceLivenessSessionOptions ? ((AWSFaceLivenessSessionOptions) faceLivenessSessionOptions).m68963getCredentialsProvider() : null;
        if (aWSCredentialsProviderM68963getCredentialsProvider == null) {
            qc4VarConvertToSdkCredentialsProvider = new CognitoCredentialsProvider();
        } else {
            qc4VarConvertToSdkCredentialsProvider = AWSCredentialsProviderKt.convertToSdkCredentialsProvider(aWSCredentialsProviderM68963getCredentialsProvider);
        }
        new RunFaceLivenessSession(str, faceLivenessSessionInformation, qc4VarConvertToSdkCredentialsProvider, str2, consumer, action, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(String str, LanguageType languageType, LanguageType languageType2, TranslateTextOptions translateTextOptions, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        AWSTranslateTextOperation aWSTranslateTextOperation = new AWSTranslateTextOperation(this.predictionsService, this.executorService, new AWSTranslateRequest(str, languageType, languageType2), consumer, consumer2);
        aWSTranslateTextOperation.start();
        return aWSTranslateTextOperation;
    }
}
