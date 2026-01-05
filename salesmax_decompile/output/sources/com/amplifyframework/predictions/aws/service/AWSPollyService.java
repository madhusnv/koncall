package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.configuration.SpeechGeneratorConfiguration;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import com.amplifyframework.predictions.aws.service.AWSPollyService;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p001o.aig;
import p001o.id5;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.mdd;
import p001o.n64;
import p001o.o64;
import p001o.qc4;
import p001o.qm1;
import p001o.sh2;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSPollyService {
    public static final Companion Companion = new Companion(null);
    private static final int MP3_SAMPLE_RATE = 24000;
    private final qc4 authCredentialsProvider;
    private final mdd client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$1", m36648f = "AWSPollyService.kt", m36649l = {64}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$1 */
    public static final class C106231 extends jgg implements xk7 {
        final /* synthetic */ String $text;
        final /* synthetic */ AWSVoiceType $voiceType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106231(String str, AWSVoiceType aWSVoiceType, n64 n64Var) {
            super(1, n64Var);
            this.$text = str;
            this.$voiceType = aWSVoiceType;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSPollyService.this.new C106231(this.$text, this.$voiceType, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws PredictionsException {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AWSPollyService aWSPollyService = AWSPollyService.this;
                String str = this.$text;
                AWSVoiceType aWSVoiceType = this.$voiceType;
                this.label = 1;
                obj = aWSPollyService.synthesizeSpeech(str, aWSVoiceType, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            TextToSpeechResult textToSpeechResultFromAudioData = TextToSpeechResult.fromAudioData((InputStream) obj);
            sq8.m48648g(textToSpeechResultFromAudioData, "fromAudioData(...)");
            return textToSpeechResultFromAudioData;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106231) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$2 */
    public static final class C106242 extends kf9 implements xk7 {
        public static final C106242 INSTANCE = new C106242();

        public C106242() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("AWS Polly encountered an error while synthesizing speech.", th, "See attached exception for more details.");
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSPollyService", m36648f = "AWSPollyService.kt", m36649l = {102}, m36650m = "synthesizeSpeech")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$3 */
    public static final class C106253 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106253(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSPollyService.this.synthesizeSpeech(null, null, this);
        }
    }

    public AWSPollyService(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, qc4 qc4Var) {
        sq8.m48649h(aWSPredictionsPluginConfiguration, "pluginConfiguration");
        sq8.m48649h(qc4Var, "authCredentialsProvider");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = qc4Var;
        this.client = new AmazonPollyPresigningClient((mdd) mdd.f35213R.m38580c(new AWSPollyService$client$1(this)));
        this.executor = Executors.newCachedThreadPool();
    }

    private final <T> void execute(final xk7 xk7Var, final xk7 xk7Var2, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: o.s3
            @Override // java.lang.Runnable
            public final void run() {
                AWSPollyService.execute$lambda$0(xk7Var2, consumer2, xk7Var, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(xk7 xk7Var, Consumer consumer, xk7 xk7Var2, Consumer consumer2) {
        sq8.m48649h(xk7Var, "$errorTransformer");
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(xk7Var2, "$runnableTask");
        sq8.m48649h(consumer2, "$onResult");
        try {
            qm1.m45641b(null, new AWSPollyService$execute$1$1(xk7Var2, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept((PredictionsException) xk7Var.invoke(th));
        }
    }

    public final mdd getClient() {
        return this.client;
    }

    public final void synthesizeSpeech(String str, AWSVoiceType aWSVoiceType, Consumer<TextToSpeechResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(str, "text");
        sq8.m48649h(aWSVoiceType, "voiceType");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106231(str, aWSVoiceType, null), C106242.INSTANCE, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object synthesizeSpeech(String str, AWSVoiceType aWSVoiceType, n64 n64Var) throws PredictionsException {
        C106253 c106253;
        String languageCode;
        String strName;
        if (n64Var instanceof C106253) {
            c106253 = (C106253) n64Var;
            int i = c106253.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106253.label = i - Integer.MIN_VALUE;
            } else {
                c106253 = new C106253(n64Var);
            }
        }
        Object objSynthesizeSpeech = c106253.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106253.label;
        if (i2 == 0) {
            wre.m54934b(objSynthesizeSpeech);
            if (AWSVoiceType.UNKNOWN == aWSVoiceType) {
                SpeechGeneratorConfiguration speechGeneratorConfiguration = this.pluginConfiguration.getSpeechGeneratorConfiguration();
                sq8.m48648g(speechGeneratorConfiguration, "getSpeechGeneratorConfiguration(...)");
                languageCode = speechGeneratorConfiguration.getLanguage();
                sq8.m48648g(languageCode, "getLanguage(...)");
                strName = speechGeneratorConfiguration.getVoice();
                sq8.m48648g(strName, "getVoice(...)");
            } else {
                languageCode = aWSVoiceType.getLanguageCode();
                sq8.m48648g(languageCode, "getLanguageCode(...)");
                strName = aWSVoiceType.name();
            }
            aig aigVarM17190a = aig.f14815j.m17190a(new AWSPollyService$synthesizeSpeech$synthesizeSpeechRequest$1(str, languageCode, strName));
            mdd mddVar = this.client;
            AWSPollyService$synthesizeSpeech$audioStream$1 aWSPollyService$synthesizeSpeech$audioStream$1 = new AWSPollyService$synthesizeSpeech$audioStream$1(null);
            c106253.label = 1;
            objSynthesizeSpeech = mddVar.synthesizeSpeech(aigVarM17190a, aWSPollyService$synthesizeSpeech$audioStream$1, c106253);
            if (objSynthesizeSpeech == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objSynthesizeSpeech);
        }
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) objSynthesizeSpeech;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream;
        }
        byte[] bytes = "".getBytes(sh2.f45422b);
        sq8.m48648g(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }
}
