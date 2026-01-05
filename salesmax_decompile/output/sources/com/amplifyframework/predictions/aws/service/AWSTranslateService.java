package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.service.AWSTranslateService;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p001o.gwh;
import p001o.hwh;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.qc4;
import p001o.qm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.xvh;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSTranslateService {
    private final qc4 authCredentialsProvider;
    private final xvh client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSTranslateService$translate$1", m36648f = "AWSTranslateService.kt", m36649l = {104}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSTranslateService$translate$1 */
    public static final class C106421 extends jgg implements xk7 {
        final /* synthetic */ LanguageType $sourceLanguage;
        final /* synthetic */ LanguageType $targetLanguage;
        final /* synthetic */ String $textToTranslate;
        int label;
        final /* synthetic */ AWSTranslateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106421(LanguageType languageType, AWSTranslateService aWSTranslateService, LanguageType languageType2, String str, n64 n64Var) {
            super(1, n64Var);
            this.$sourceLanguage = languageType;
            this.this$0 = aWSTranslateService;
            this.$targetLanguage = languageType2;
            this.$textToTranslate = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C106421(this.$sourceLanguage, this.this$0, this.$targetLanguage, this.$textToTranslate, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                LanguageType languageType = LanguageType.UNKNOWN;
                LanguageType sourceLanguage = this.$sourceLanguage;
                if (languageType == sourceLanguage) {
                    sourceLanguage = this.this$0.pluginConfiguration.getTranslateTextConfiguration().getSourceLanguage();
                    sq8.m48648g(sourceLanguage, "getSourceLanguage(...)");
                }
                LanguageType targetLanguage = this.$targetLanguage;
                if (languageType == targetLanguage) {
                    targetLanguage = this.this$0.pluginConfiguration.getTranslateTextConfiguration().getTargetLanguage();
                    sq8.m48648g(targetLanguage, "getTargetLanguage(...)");
                }
                xvh client = this.this$0.getClient();
                String str = this.$textToTranslate;
                gwh.C13830a c13830a = new gwh.C13830a();
                c13830a.m29621i(str);
                c13830a.m29619g(sourceLanguage.getLanguageCode());
                c13830a.m29620h(targetLanguage.getLanguageCode());
                gwh gwhVarM29613a = c13830a.m29613a();
                this.label = 1;
                obj = client.l3(gwhVarM29613a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            hwh hwhVar = (hwh) obj;
            String strM31238b = hwhVar.m31238b();
            LanguageType languageTypeFrom = LanguageType.from(hwhVar.m31237a());
            TranslateTextResult.Builder builder = TranslateTextResult.builder();
            if (strM31238b == null) {
                strM31238b = "";
            }
            TranslateTextResult translateTextResultBuild = builder.translatedText(strM31238b).targetLanguage(languageTypeFrom).build();
            sq8.m48648g(translateTextResultBuild, "build(...)");
            return translateTextResultBuild;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106421) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSTranslateService$translate$2 */
    public static final class C106432 extends kf9 implements xk7 {
        public static final C106432 INSTANCE = new C106432();

        public C106432() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("AWS Translate encountered an error while translating text.", th, "See attached exception for more details.");
        }
    }

    public AWSTranslateService(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, qc4 qc4Var) {
        sq8.m48649h(aWSPredictionsPluginConfiguration, "pluginConfiguration");
        sq8.m48649h(qc4Var, "authCredentialsProvider");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = qc4Var;
        this.client = (xvh) xvh.g0.m38580c(new AWSTranslateService$client$1(this));
        this.executor = Executors.newCachedThreadPool();
    }

    private final <T> void execute(final xk7 xk7Var, final xk7 xk7Var2, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: o.u5
            @Override // java.lang.Runnable
            public final void run() {
                AWSTranslateService.execute$lambda$0(xk7Var2, consumer2, xk7Var, consumer);
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
            qm1.m45641b(null, new AWSTranslateService$execute$1$1(xk7Var2, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept((PredictionsException) xk7Var.invoke(th));
        }
    }

    public final xvh getClient() {
        return this.client;
    }

    public final void translate(String str, LanguageType languageType, LanguageType languageType2, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(str, "textToTranslate");
        sq8.m48649h(languageType, "sourceLanguage");
        sq8.m48649h(languageType2, "targetLanguage");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106421(languageType, this, languageType2, str, null), C106432.INSTANCE, consumer, consumer2);
    }
}
