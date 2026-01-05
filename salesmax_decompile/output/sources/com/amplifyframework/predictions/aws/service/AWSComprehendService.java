package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.adapter.EntityTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.SentimentTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.SpeechTypeAdapter;
import com.amplifyframework.predictions.aws.configuration.InterpretTextConfiguration;
import com.amplifyframework.predictions.aws.service.AWSComprehendService;
import com.amplifyframework.predictions.models.Entity;
import com.amplifyframework.predictions.models.EntityType;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.KeyPhrase;
import com.amplifyframework.predictions.models.Language;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.models.Sentiment;
import com.amplifyframework.predictions.models.SentimentType;
import com.amplifyframework.predictions.models.SpeechType;
import com.amplifyframework.predictions.models.Syntax;
import com.amplifyframework.predictions.result.InterpretResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.ai6;
import p001o.bd9;
import p001o.co5;
import p001o.do5;
import p001o.dp5;
import p001o.eef;
import p001o.ep5;
import p001o.gef;
import p001o.gge;
import p001o.id5;
import p001o.jgg;
import p001o.jp5;
import p001o.kf9;
import p001o.kn5;
import p001o.kp5;
import p001o.l75;
import p001o.ln5;
import p001o.mg6;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.ohg;
import p001o.phg;
import p001o.qc4;
import p001o.qm1;
import p001o.qn5;
import p001o.rn5;
import p001o.ryc;
import p001o.sg9;
import p001o.sq8;
import p001o.tyc;
import p001o.up3;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.xw5;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSComprehendService {
    public static final Companion Companion = new Companion(null);
    private static final int PERCENT = 100;
    private final qc4 authCredentialsProvider;
    private final up3 client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SentimentType.values().length];
            try {
                iArr[SentimentType.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SentimentType.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SentimentType.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SentimentType.MIXED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSComprehendService$comprehend$1", m36648f = "AWSComprehendService.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, 78, Opcodes.IASTORE, 80, Opcodes.FASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$comprehend$1 */
    public static final class C106161 extends jgg implements xk7 {
        final /* synthetic */ String $text;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106161(String str, n64 n64Var) {
            super(1, n64Var);
            this.$text = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSComprehendService.this.new C106161(this.$text, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws PredictionsException {
            LanguageType languageType;
            Language language;
            Object objFetchKeyPhrases;
            Sentiment sentiment;
            LanguageType languageType2;
            Object objFetchEntities;
            List<KeyPhrase> list;
            Sentiment sentiment2;
            Object objFetchSyntax;
            List<Entity> list2;
            Sentiment sentiment3;
            Language language2;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AWSComprehendService aWSComprehendService = AWSComprehendService.this;
                String str = this.$text;
                this.label = 1;
                obj = aWSComprehendService.fetchPredominantLanguage(str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else if (i == 1) {
                wre.m54934b(obj);
            } else if (i == 2) {
                languageType = (LanguageType) this.L$1;
                language = (Language) this.L$0;
                wre.m54934b(obj);
                Sentiment sentiment4 = (Sentiment) obj;
                AWSComprehendService aWSComprehendService2 = AWSComprehendService.this;
                String str2 = this.$text;
                this.L$0 = language;
                this.L$1 = languageType;
                this.L$2 = sentiment4;
                this.label = 3;
                objFetchKeyPhrases = aWSComprehendService2.fetchKeyPhrases(str2, languageType, this);
                if (objFetchKeyPhrases != objM51918f) {
                    return objM51918f;
                }
                LanguageType languageType3 = languageType;
                sentiment = sentiment4;
                obj = objFetchKeyPhrases;
                languageType2 = languageType3;
                List<KeyPhrase> list3 = (List) obj;
                AWSComprehendService aWSComprehendService3 = AWSComprehendService.this;
                String str3 = this.$text;
                this.L$0 = language;
                this.L$1 = languageType2;
                this.L$2 = sentiment;
                this.L$3 = list3;
                this.label = 4;
                objFetchEntities = aWSComprehendService3.fetchEntities(str3, languageType2, this);
                if (objFetchEntities != objM51918f) {
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) this.L$3;
                        list = (List) this.L$2;
                        sentiment3 = (Sentiment) this.L$1;
                        language2 = (Language) this.L$0;
                        wre.m54934b(obj);
                        InterpretResult interpretResultBuild = InterpretResult.builder().language(language2).sentiment(sentiment3).keyPhrases(list).entities(list2).syntax((List) obj).build();
                        sq8.m48648g(interpretResultBuild, "build(...)");
                        return interpretResultBuild;
                    }
                    list = (List) this.L$3;
                    sentiment2 = (Sentiment) this.L$2;
                    languageType2 = (LanguageType) this.L$1;
                    language = (Language) this.L$0;
                    wre.m54934b(obj);
                    List<Entity> list4 = (List) obj;
                    AWSComprehendService aWSComprehendService4 = AWSComprehendService.this;
                    String str4 = this.$text;
                    this.L$0 = language;
                    this.L$1 = sentiment2;
                    this.L$2 = list;
                    this.L$3 = list4;
                    this.label = 5;
                    objFetchSyntax = aWSComprehendService4.fetchSyntax(str4, languageType2, this);
                    if (objFetchSyntax != objM51918f) {
                        return objM51918f;
                    }
                    list2 = list4;
                    obj = objFetchSyntax;
                    sentiment3 = sentiment2;
                    language2 = language;
                    InterpretResult interpretResultBuild2 = InterpretResult.builder().language(language2).sentiment(sentiment3).keyPhrases(list).entities(list2).syntax((List) obj).build();
                    sq8.m48648g(interpretResultBuild2, "build(...)");
                    return interpretResultBuild2;
                }
                sentiment = (Sentiment) this.L$2;
                languageType2 = (LanguageType) this.L$1;
                language = (Language) this.L$0;
                wre.m54934b(obj);
                List<KeyPhrase> list32 = (List) obj;
                AWSComprehendService aWSComprehendService32 = AWSComprehendService.this;
                String str32 = this.$text;
                this.L$0 = language;
                this.L$1 = languageType2;
                this.L$2 = sentiment;
                this.L$3 = list32;
                this.label = 4;
                objFetchEntities = aWSComprehendService32.fetchEntities(str32, languageType2, this);
                if (objFetchEntities != objM51918f) {
                    return objM51918f;
                }
                Sentiment sentiment5 = sentiment;
                list = list32;
                obj = objFetchEntities;
                sentiment2 = sentiment5;
                List<Entity> list42 = (List) obj;
                AWSComprehendService aWSComprehendService42 = AWSComprehendService.this;
                String str42 = this.$text;
                this.L$0 = language;
                this.L$1 = sentiment2;
                this.L$2 = list;
                this.L$3 = list42;
                this.label = 5;
                objFetchSyntax = aWSComprehendService42.fetchSyntax(str42, languageType2, this);
                if (objFetchSyntax != objM51918f) {
                }
            }
            Language language3 = (Language) obj;
            LanguageType value = language3.getValue();
            sq8.m48648g(value, "getValue(...)");
            languageType = value;
            AWSComprehendService aWSComprehendService5 = AWSComprehendService.this;
            String str5 = this.$text;
            this.L$0 = language3;
            this.L$1 = languageType;
            this.label = 2;
            Object objFetchSentiment = aWSComprehendService5.fetchSentiment(str5, languageType, this);
            if (objFetchSentiment == objM51918f) {
                return objM51918f;
            }
            language = language3;
            obj = objFetchSentiment;
            Sentiment sentiment42 = (Sentiment) obj;
            AWSComprehendService aWSComprehendService22 = AWSComprehendService.this;
            String str22 = this.$text;
            this.L$0 = language;
            this.L$1 = languageType;
            this.L$2 = sentiment42;
            this.label = 3;
            objFetchKeyPhrases = aWSComprehendService22.fetchKeyPhrases(str22, languageType, this);
            if (objFetchKeyPhrases != objM51918f) {
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106161) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$comprehend$2 */
    public static final class C106172 extends kf9 implements xk7 {
        public static final C106172 INSTANCE = new C106172();

        public C106172() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("AWS Comprehend encountered an error while interpreting text.", th, "See attached exception for more details.");
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSComprehendService", m36648f = "AWSComprehendService.kt", m36649l = {353}, m36650m = "fetchEntities")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchEntities$1 */
    public static final class C106181 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106181(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchEntities(null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSComprehendService", m36648f = "AWSComprehendService.kt", m36649l = {353}, m36650m = "fetchKeyPhrases")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchKeyPhrases$1 */
    public static final class C106191 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106191(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchKeyPhrases(null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSComprehendService", m36648f = "AWSComprehendService.kt", m36649l = {353}, m36650m = "fetchPredominantLanguage")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchPredominantLanguage$1 */
    public static final class C106201 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106201(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchPredominantLanguage(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSComprehendService", m36648f = "AWSComprehendService.kt", m36649l = {353}, m36650m = "fetchSentiment")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchSentiment$1 */
    public static final class C106211 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106211(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchSentiment(null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSComprehendService", m36648f = "AWSComprehendService.kt", m36649l = {353}, m36650m = "fetchSyntax")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchSyntax$1 */
    public static final class C106221 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106221(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchSyntax(null, null, this);
        }
    }

    public AWSComprehendService(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, qc4 qc4Var) {
        sq8.m48649h(aWSPredictionsPluginConfiguration, "pluginConfiguration");
        sq8.m48649h(qc4Var, "authCredentialsProvider");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = qc4Var;
        this.client = (up3) up3.f49308o.m38580c(new AWSComprehendService$client$1(this));
        this.executor = Executors.newCachedThreadPool();
    }

    private final <T> void execute(final xk7 xk7Var, final xk7 xk7Var2, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: o.u1
            @Override // java.lang.Runnable
            public final void run() {
                AWSComprehendService.execute$lambda$9(xk7Var2, consumer2, xk7Var, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$9(xk7 xk7Var, Consumer consumer, xk7 xk7Var2, Consumer consumer2) {
        sq8.m48649h(xk7Var, "$errorTransformer");
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(xk7Var2, "$runnableTask");
        sq8.m48649h(consumer2, "$onResult");
        try {
            qm1.m45641b(null, new AWSComprehendService$execute$1$1(xk7Var2, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept(th instanceof PredictionsException ? th : (PredictionsException) xk7Var.invoke(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchEntities(String str, LanguageType languageType, n64 n64Var) throws PredictionsException {
        C106181 c106181;
        String strMo17142a;
        if (n64Var instanceof C106181) {
            c106181 = (C106181) n64Var;
            int i = c106181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106181.label = i - Integer.MIN_VALUE;
            } else {
                c106181 = new C106181(n64Var);
            }
        }
        Object objG2 = c106181.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106181.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objG2);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.ENTITIES)) {
                    return null;
                }
                up3 up3Var = this.client;
                qn5.C16426a c16426a = new qn5.C16426a();
                c16426a.m45693h(str);
                sg9.C16823b c16823b = sg9.f45362a;
                String languageCode = languageType.getLanguageCode();
                sq8.m48648g(languageCode, "getLanguageCode(...)");
                c16426a.m45692g(c16823b.m48309a(languageCode));
                qn5 qn5VarM45686a = c16426a.m45686a();
                c106181.label = 1;
                objG2 = up3Var.g2(qn5VarM45686a, c106181);
                if (objG2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objG2);
            }
            rn5 rn5Var = (rn5) objG2;
            ArrayList arrayList = new ArrayList();
            List<mg6> listM46988a = rn5Var.m46988a();
            if (listM46988a != null) {
                for (mg6 mg6Var : listM46988a) {
                    ai6 ai6VarM38971d = mg6Var.m38971d();
                    if (ai6VarM38971d == null || (strMo17142a = ai6VarM38971d.mo17142a()) == null) {
                        strMo17142a = "";
                    }
                    EntityType entityTypeFromComprehend = EntityTypeAdapter.fromComprehend(strMo17142a);
                    Float fM38969b = mg6Var.m38969b();
                    String strM38970c = mg6Var.m38970c();
                    Integer numM38968a = mg6Var.m38968a();
                    if (fM38969b != null && strM38970c != null && numM38968a != null) {
                        Entity entityBuild = ((Entity.Builder) ((Entity.Builder) ((Entity.Builder) ((Entity.Builder) Entity.builder().value(entityTypeFromComprehend)).confidence(fM38969b.floatValue() * 100)).targetText(strM38970c)).startIndex(numM38968a.intValue())).build();
                        sq8.m48648g(entityBuild, "build(...)");
                        arrayList.add(entityBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting entities.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchKeyPhrases(String str, LanguageType languageType, n64 n64Var) throws PredictionsException {
        C106191 c106191;
        if (n64Var instanceof C106191) {
            c106191 = (C106191) n64Var;
            int i = c106191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106191.label = i - Integer.MIN_VALUE;
            } else {
                c106191 = new C106191(n64Var);
            }
        }
        Object objMo24783Z = c106191.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106191.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objMo24783Z);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.KEY_PHRASES)) {
                    return null;
                }
                up3 up3Var = this.client;
                co5.C12717a c12717a = new co5.C12717a();
                c12717a.m21550e(str);
                sg9.C16823b c16823b = sg9.f45362a;
                String languageCode = languageType.getLanguageCode();
                sq8.m48648g(languageCode, "getLanguageCode(...)");
                c12717a.m21549d(c16823b.m48309a(languageCode));
                co5 co5VarM21546a = c12717a.m21546a();
                c106191.label = 1;
                objMo24783Z = up3Var.mo24783Z(co5VarM21546a, c106191);
                if (objMo24783Z == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objMo24783Z);
            }
            do5 do5Var = (do5) objMo24783Z;
            ArrayList arrayList = new ArrayList();
            List<bd9> listM23636a = do5Var.m23636a();
            if (listM23636a != null) {
                for (bd9 bd9Var : listM23636a) {
                    String strM18642c = bd9Var.m18642c();
                    Float fM18641b = bd9Var.m18641b();
                    Integer numM18640a = bd9Var.m18640a();
                    if (strM18642c != null && fM18641b != null && numM18640a != null) {
                        KeyPhrase keyPhraseBuild = ((KeyPhrase.Builder) ((KeyPhrase.Builder) ((KeyPhrase.Builder) ((KeyPhrase.Builder) KeyPhrase.builder().value(strM18642c)).confidence(fM18641b.floatValue() * 100)).targetText(strM18642c)).startIndex(numM18640a.intValue())).build();
                        sq8.m48648g(keyPhraseBuild, "build(...)");
                        arrayList.add(keyPhraseBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting key phrases.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPredominantLanguage(String str, n64 n64Var) throws PredictionsException {
        C106201 c106201;
        if (n64Var instanceof C106201) {
            c106201 = (C106201) n64Var;
            int i = c106201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106201.label = i - Integer.MIN_VALUE;
            } else {
                c106201 = new C106201(n64Var);
            }
        }
        Object objP2 = c106201.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106201.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objP2);
                isResourceConfigured(InterpretTextConfiguration.InterpretType.LANGUAGE);
                up3 up3Var = this.client;
                kn5.C14885a c14885a = new kn5.C14885a();
                c14885a.m35947c(str);
                kn5 kn5VarM35945a = c14885a.m35945a();
                c106201.label = 1;
                objP2 = up3Var.p2(kn5VarM35945a, c106201);
                if (objP2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objP2);
            }
            ln5 ln5Var = (ln5) objP2;
            gge ggeVar = new gge();
            List<xw5> listM37512a = ln5Var.m37512a();
            if (listM37512a != null) {
                for (xw5 xw5Var : listM37512a) {
                    xw5 xw5Var2 = (xw5) ggeVar.f25106a;
                    Float fM56909b = xw5Var2 != null ? xw5Var2.m56909b() : null;
                    Float fM56909b2 = xw5Var.m56909b();
                    if (ggeVar.f25106a == null) {
                        ggeVar.f25106a = xw5Var;
                    } else if (fM56909b != null && fM56909b2 != null) {
                        if (fM56909b2.floatValue() <= fM56909b.floatValue()) {
                            xw5Var = (xw5) ggeVar.f25106a;
                        }
                        ggeVar.f25106a = xw5Var;
                    }
                }
            }
            Object obj = ggeVar.f25106a;
            if (obj == null) {
                throw new PredictionsException("AWS Comprehend did not detect any dominant language.", "Please verify the integrity of text being analyzed.");
            }
            sq8.m48646e(obj);
            LanguageType languageTypeFrom = LanguageType.from(((xw5) obj).m56908a());
            Object obj2 = ggeVar.f25106a;
            sq8.m48646e(obj2);
            Float fM56909b3 = ((xw5) obj2).m56909b();
            Feature.Builder builderValue = Language.builder().value(languageTypeFrom);
            sq8.m48648g(builderValue, "value(...)");
            Language.Builder builder = (Language.Builder) builderValue;
            if (fM56909b3 != null) {
                builder.confidence(fM56909b3.floatValue() * 100);
            }
            Language languageBuild = builder.build();
            sq8.m48648g(languageBuild, "build(...)");
            return languageBuild;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting dominant language.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSentiment(String str, LanguageType languageType, n64 n64Var) throws PredictionsException {
        C106211 c106211;
        String strMo28528a;
        Float fM24872d;
        if (n64Var instanceof C106211) {
            c106211 = (C106211) n64Var;
            int i = c106211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106211.label = i - Integer.MIN_VALUE;
            } else {
                c106211 = new C106211(n64Var);
            }
        }
        Object objA3 = c106211.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106211.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objA3);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.SENTIMENT)) {
                    return null;
                }
                up3 up3Var = this.client;
                dp5.C13010a c13010a = new dp5.C13010a();
                c13010a.m23661e(str);
                sg9.C16823b c16823b = sg9.f45362a;
                String languageCode = languageType.getLanguageCode();
                sq8.m48648g(languageCode, "getLanguageCode(...)");
                c13010a.m23660d(c16823b.m48309a(languageCode));
                dp5 dp5VarM23657a = c13010a.m23657a();
                c106211.label = 1;
                objA3 = up3Var.a3(dp5VarM23657a, c106211);
                if (objA3 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objA3);
            }
            ep5 ep5Var = (ep5) objA3;
            gef gefVarM25406a = ep5Var.m25406a();
            eef eefVarM25407b = ep5Var.m25407b();
            if (gefVarM25406a == null || (strMo28528a = gefVarM25406a.mo28528a()) == null) {
                strMo28528a = "";
            }
            SentimentType sentimentTypeFromComprehend = SentimentTypeAdapter.fromComprehend(strMo28528a);
            int i3 = WhenMappings.$EnumSwitchMapping$0[sentimentTypeFromComprehend.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        fM24872d = i3 != 4 ? ml1.m39303c(0.0f) : eefVarM25407b != null ? eefVarM25407b.m24869a() : null;
                    } else if (eefVarM25407b != null) {
                        fM24872d = eefVarM25407b.m24871c();
                    }
                } else if (eefVarM25407b != null) {
                    fM24872d = eefVarM25407b.m24870b();
                }
            } else if (eefVarM25407b != null) {
                fM24872d = eefVarM25407b.m24872d();
            }
            if (fM24872d != null) {
                return ((Sentiment.Builder) ((Sentiment.Builder) Sentiment.builder().value(sentimentTypeFromComprehend)).confidence(fM24872d.floatValue() * 100)).build();
            }
            return null;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting sentiment.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSyntax(String str, LanguageType languageType, n64 n64Var) throws PredictionsException {
        C106221 c106221;
        String strMo50786a;
        tyc tycVarM47291b;
        if (n64Var instanceof C106221) {
            c106221 = (C106221) n64Var;
            int i = c106221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106221.label = i - Integer.MIN_VALUE;
            } else {
                c106221 = new C106221(n64Var);
            }
        }
        Object objE3 = c106221.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106221.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objE3);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.SYNTAX)) {
                    return null;
                }
                up3 up3Var = this.client;
                jp5.C14625a c14625a = new jp5.C14625a();
                c14625a.m34203e(str);
                ohg.C15802a c15802a = ohg.f38367a;
                String languageCode = languageType.getLanguageCode();
                sq8.m48648g(languageCode, "getLanguageCode(...)");
                c14625a.m34202d(c15802a.m42250a(languageCode));
                jp5 jp5VarM34199a = c14625a.m34199a();
                c106221.label = 1;
                objE3 = up3Var.e3(jp5VarM34199a, c106221);
                if (objE3 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objE3);
            }
            kp5 kp5Var = (kp5) objE3;
            ArrayList arrayList = new ArrayList();
            List<phg> listM35998a = kp5Var.m35998a();
            if (listM35998a != null) {
                for (phg phgVar : listM35998a) {
                    ryc rycVarM43702b = phgVar.m43702b();
                    if (rycVarM43702b == null || (tycVarM47291b = rycVarM43702b.m47291b()) == null || (strMo50786a = tycVarM47291b.mo50786a()) == null) {
                        strMo50786a = "";
                    }
                    SpeechType speechTypeFromComprehend = SpeechTypeAdapter.fromComprehend(strMo50786a);
                    ryc rycVarM43702b2 = phgVar.m43702b();
                    Float fM47290a = rycVarM43702b2 != null ? rycVarM43702b2.m47290a() : null;
                    String strM43703c = phgVar.m43703c();
                    Integer numM43701a = phgVar.m43701a();
                    if (fM47290a != null && strM43703c != null && numM43701a != null) {
                        Syntax syntaxBuild = ((Syntax.Builder) ((Syntax.Builder) ((Syntax.Builder) ((Syntax.Builder) ((Syntax.Builder) Syntax.builder().id(String.valueOf(phgVar.m43704d()))).value(speechTypeFromComprehend)).confidence(fM47290a.floatValue() * 100)).targetText(strM43703c)).startIndex(numM43701a.intValue())).build();
                        sq8.m48648g(syntaxBuild, "build(...)");
                        arrayList.add(syntaxBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting syntax.", e, "See attached exception for more details.");
        }
    }

    private final boolean isResourceConfigured(InterpretTextConfiguration.InterpretType interpretType) {
        InterpretTextConfiguration.InterpretType type2 = this.pluginConfiguration.getInterpretTextConfiguration().getType();
        sq8.m48648g(type2, "getType(...)");
        return InterpretTextConfiguration.InterpretType.ALL == type2 || type2 == interpretType;
    }

    public final void comprehend(String str, Consumer<InterpretResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(str, "text");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106161(str, null), C106172.INSTANCE, consumer, consumer2);
    }

    public final up3 getClient() {
        return this.client;
    }
}
