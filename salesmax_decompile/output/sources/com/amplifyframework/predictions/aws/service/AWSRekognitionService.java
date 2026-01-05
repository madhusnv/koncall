package com.amplifyframework.predictions.aws.service;

import android.graphics.RectF;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.adapter.EmotionTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.GenderBinaryTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.RekognitionResultTransformers;
import com.amplifyframework.predictions.aws.configuration.IdentifyEntitiesConfiguration;
import com.amplifyframework.predictions.aws.service.AWSRekognitionService;
import com.amplifyframework.predictions.models.AgeRange;
import com.amplifyframework.predictions.models.BinaryFeature;
import com.amplifyframework.predictions.models.Celebrity;
import com.amplifyframework.predictions.models.CelebrityDetails;
import com.amplifyframework.predictions.models.Emotion;
import com.amplifyframework.predictions.models.EmotionType;
import com.amplifyframework.predictions.models.EntityDetails;
import com.amplifyframework.predictions.models.EntityMatch;
import com.amplifyframework.predictions.models.Gender;
import com.amplifyframework.predictions.models.Label;
import com.amplifyframework.predictions.models.LabelType;
import com.amplifyframework.predictions.models.Landmark;
import com.amplifyframework.predictions.models.Pose;
import com.amplifyframework.predictions.result.IdentifyCelebritiesResult;
import com.amplifyframework.predictions.result.IdentifyEntitiesResult;
import com.amplifyframework.predictions.result.IdentifyEntityMatchesResult;
import com.amplifyframework.predictions.result.IdentifyLabelsResult;
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.IdentifyTextResult;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.objectweb.asm.Opcodes;
import p001o.af9;
import p001o.ajh;
import p001o.bh3;
import p001o.c9f;
import p001o.ch3;
import p001o.ck8;
import p001o.d9f;
import p001o.ef2;
import p001o.fc8;
import p001o.fr6;
import p001o.gr6;
import p001o.ix0;
import p001o.jgg;
import p001o.jr6;
import p001o.kf9;
import p001o.l75;
import p001o.lhe;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.oee;
import p001o.ok3;
import p001o.pee;
import p001o.qc4;
import p001o.qm1;
import p001o.qn7;
import p001o.qo5;
import p001o.qp5;
import p001o.ro5;
import p001o.rp5;
import p001o.sgh;
import p001o.sn7;
import p001o.sq8;
import p001o.twc;
import p001o.uq8;
import p001o.v56;
import p001o.wn5;
import p001o.wre;
import p001o.xk7;
import p001o.xkb;
import p001o.xn5;
import p001o.xo5;
import p001o.y3i;
import p001o.y56;
import p001o.yo5;

/* loaded from: classes5.dex */
public final class AWSRekognitionService {
    private final qc4 authCredentialsProvider;
    private final lhe client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService", m36648f = "AWSRekognitionService.kt", m36649l = {472}, m36650m = "detectCelebrities")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectCelebrities$1 */
    public static final class C106261 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106261(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectCelebrities(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$1", m36648f = "AWSRekognitionService.kt", m36649l = {154, Opcodes.IF_ICMPEQ}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$1 */
    public static final class C106271 extends jgg implements xk7 {
        final /* synthetic */ ByteBuffer $imageData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106271(ByteBuffer byteBuffer, n64 n64Var) {
            super(1, n64Var);
            this.$imageData = byteBuffer;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSRekognitionService.this.new C106271(this.$imageData, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws PredictionsException {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    wre.m54934b(obj);
                    IdentifyEntitiesResult identifyEntitiesResultFromEntityDetails = IdentifyEntitiesResult.fromEntityDetails((List) obj);
                    sq8.m48646e(identifyEntitiesResultFromEntityDetails);
                    return identifyEntitiesResultFromEntityDetails;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                IdentifyEntityMatchesResult identifyEntityMatchesResultFromEntityMatches = IdentifyEntityMatchesResult.fromEntityMatches((List) obj);
                sq8.m48646e(identifyEntityMatchesResultFromEntityMatches);
                return identifyEntityMatchesResultFromEntityMatches;
            }
            wre.m54934b(obj);
            IdentifyEntitiesConfiguration identifyEntitiesConfiguration = AWSRekognitionService.this.pluginConfiguration.getIdentifyEntitiesConfiguration();
            sq8.m48648g(identifyEntitiesConfiguration, "getIdentifyEntitiesConfiguration(...)");
            if (identifyEntitiesConfiguration.isGeneralEntityDetection()) {
                AWSRekognitionService aWSRekognitionService = AWSRekognitionService.this;
                ByteBuffer byteBuffer = this.$imageData;
                this.label = 1;
                obj = aWSRekognitionService.detectEntities(byteBuffer, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                IdentifyEntitiesResult identifyEntitiesResultFromEntityDetails2 = IdentifyEntitiesResult.fromEntityDetails((List) obj);
                sq8.m48646e(identifyEntitiesResultFromEntityDetails2);
                return identifyEntitiesResultFromEntityDetails2;
            }
            int maxEntities = identifyEntitiesConfiguration.getMaxEntities();
            String collectionId = identifyEntitiesConfiguration.getCollectionId();
            sq8.m48648g(collectionId, "getCollectionId(...)");
            AWSRekognitionService aWSRekognitionService2 = AWSRekognitionService.this;
            ByteBuffer byteBuffer2 = this.$imageData;
            this.label = 2;
            obj = aWSRekognitionService2.detectEntityMatches(byteBuffer2, maxEntities, collectionId, this);
            if (obj == objM51918f) {
                return objM51918f;
            }
            IdentifyEntityMatchesResult identifyEntityMatchesResultFromEntityMatches2 = IdentifyEntityMatchesResult.fromEntityMatches((List) obj);
            sq8.m48646e(identifyEntityMatchesResultFromEntityMatches2);
            return identifyEntityMatchesResultFromEntityMatches2;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106271) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$2 */
    public static final class C106282 extends kf9 implements xk7 {
        public static final C106282 INSTANCE = new C106282();

        public C106282() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("Amazon Rekognition encountered an error while either detecting or searching for faces.", th, "See attached exception for more details.");
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService", m36648f = "AWSRekognitionService.kt", m36649l = {472}, m36650m = "detectEntities")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$3 */
    public static final class C106293 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106293(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectEntities(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService", m36648f = "AWSRekognitionService.kt", m36649l = {472}, m36650m = "detectEntityMatches")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntityMatches$1 */
    public static final class C106301 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106301(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectEntityMatches(null, 0, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$1", m36648f = "AWSRekognitionService.kt", m36649l = {86, Opcodes.DUP_X2}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$1 */
    public static final class C106311 extends jgg implements xk7 {
        final /* synthetic */ ByteBuffer $imageData;
        final /* synthetic */ LabelType $type;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AWSRekognitionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106311(LabelType labelType, AWSRekognitionService aWSRekognitionService, ByteBuffer byteBuffer, n64 n64Var) {
            super(1, n64Var);
            this.$type = labelType;
            this.this$0 = aWSRekognitionService;
            this.$imageData = byteBuffer;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C106311(this.$type, this.this$0, this.$imageData, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws PredictionsException {
            List<Label> arrayList;
            List<Label> list;
            int i;
            LabelType labelType;
            LabelType labelType2;
            Object objDetectLabels;
            int i2;
            List<Label> list2;
            Object objM51918f = uq8.m51918f();
            int i3 = this.label;
            if (i3 == 0) {
                wre.m54934b(obj);
                arrayList = new ArrayList<>();
                LabelType labelType3 = LabelType.ALL;
                LabelType labelType4 = this.$type;
                if (labelType3 != labelType4 && LabelType.MODERATION_LABELS != labelType4) {
                    i = 0;
                    labelType = LabelType.ALL;
                    labelType2 = this.$type;
                    if (labelType != labelType2 || LabelType.LABELS == labelType2) {
                        AWSRekognitionService aWSRekognitionService = this.this$0;
                        ByteBuffer byteBuffer = this.$imageData;
                        this.L$0 = arrayList;
                        this.L$1 = arrayList;
                        this.I$0 = i;
                        this.label = 2;
                        objDetectLabels = aWSRekognitionService.detectLabels(byteBuffer, this);
                        if (objDetectLabels != objM51918f) {
                            return objM51918f;
                        }
                        i2 = i;
                        obj = objDetectLabels;
                        list2 = arrayList;
                        arrayList.addAll((Collection) obj);
                        i = i2;
                        arrayList = list2;
                    }
                    IdentifyLabelsResult identifyLabelsResultBuild = IdentifyLabelsResult.builder().labels(arrayList).unsafeContent(i != 0).build();
                    sq8.m48648g(identifyLabelsResultBuild, "build(...)");
                    return identifyLabelsResultBuild;
                }
                AWSRekognitionService aWSRekognitionService2 = this.this$0;
                ByteBuffer byteBuffer2 = this.$imageData;
                this.L$0 = arrayList;
                this.L$1 = arrayList;
                this.label = 1;
                obj = aWSRekognitionService2.detectModerationLabels(byteBuffer2, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                list = arrayList;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$0;
                    arrayList = (List) this.L$1;
                    list2 = (List) this.L$0;
                    wre.m54934b(obj);
                    arrayList.addAll((Collection) obj);
                    i = i2;
                    arrayList = list2;
                    IdentifyLabelsResult identifyLabelsResultBuild2 = IdentifyLabelsResult.builder().labels(arrayList).unsafeContent(i != 0).build();
                    sq8.m48648g(identifyLabelsResultBuild2, "build(...)");
                    return identifyLabelsResultBuild2;
                }
                arrayList = (List) this.L$1;
                list = (List) this.L$0;
                wre.m54934b(obj);
            }
            arrayList.addAll((Collection) obj);
            i = !list.isEmpty() ? 1 : 0;
            arrayList = list;
            labelType = LabelType.ALL;
            labelType2 = this.$type;
            if (labelType != labelType2) {
            }
            AWSRekognitionService aWSRekognitionService3 = this.this$0;
            ByteBuffer byteBuffer3 = this.$imageData;
            this.L$0 = arrayList;
            this.L$1 = arrayList;
            this.I$0 = i;
            this.label = 2;
            objDetectLabels = aWSRekognitionService3.detectLabels(byteBuffer3, this);
            if (objDetectLabels != objM51918f) {
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106311) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$2 */
    public static final class C106322 extends kf9 implements xk7 {
        public static final C106322 INSTANCE = new C106322();

        public C106322() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("Amazon Rekognition encountered an error while detecting labels.", th, "See attached exception for more details.");
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService", m36648f = "AWSRekognitionService.kt", m36649l = {472}, m36650m = "detectLabels")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$3 */
    public static final class C106333 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106333(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectLabels(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService", m36648f = "AWSRekognitionService.kt", m36649l = {472}, m36650m = "detectModerationLabels")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectModerationLabels$1 */
    public static final class C106341 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106341(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectModerationLabels(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$1", m36648f = "AWSRekognitionService.kt", m36649l = {Opcodes.INVOKEVIRTUAL}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$1 */
    public static final class C106351 extends jgg implements xk7 {
        final /* synthetic */ ByteBuffer $imageData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106351(ByteBuffer byteBuffer, n64 n64Var) {
            super(1, n64Var);
            this.$imageData = byteBuffer;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSRekognitionService.this.new C106351(this.$imageData, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AWSRekognitionService aWSRekognitionService = AWSRekognitionService.this;
                ByteBuffer byteBuffer = this.$imageData;
                this.label = 1;
                obj = aWSRekognitionService.detectPlainText(byteBuffer, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106351) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$2 */
    public static final class C106362 extends kf9 implements xk7 {
        public static final C106362 INSTANCE = new C106362();

        public C106362() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("Amazon Rekognition encountered an error while detecting text.", th, "See attached exception for more details.");
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService", m36648f = "AWSRekognitionService.kt", m36649l = {472}, m36650m = "detectPlainText")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$3 */
    public static final class C106373 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C106373(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectPlainText(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSRekognitionService$recognizeCelebrities$1", m36648f = "AWSRekognitionService.kt", m36649l = {130}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$recognizeCelebrities$1 */
    public static final class C106381 extends jgg implements xk7 {
        final /* synthetic */ ByteBuffer $imageData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106381(ByteBuffer byteBuffer, n64 n64Var) {
            super(1, n64Var);
            this.$imageData = byteBuffer;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSRekognitionService.this.new C106381(this.$imageData, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AWSRekognitionService aWSRekognitionService = AWSRekognitionService.this;
                ByteBuffer byteBuffer = this.$imageData;
                this.label = 1;
                obj = aWSRekognitionService.detectCelebrities(byteBuffer, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            IdentifyCelebritiesResult identifyCelebritiesResultFromCelebrities = IdentifyCelebritiesResult.fromCelebrities((List) obj);
            sq8.m48648g(identifyCelebritiesResultFromCelebrities, "fromCelebrities(...)");
            return identifyCelebritiesResultFromCelebrities;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106381) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$recognizeCelebrities$2 */
    public static final class C106392 extends kf9 implements xk7 {
        public static final C106392 INSTANCE = new C106392();

        public C106392() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("Amazon Rekognition encountered an error while recognizing celebrities.", th, "See attached exception for more details.");
        }
    }

    public AWSRekognitionService(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, qc4 qc4Var) {
        sq8.m48649h(aWSPredictionsPluginConfiguration, "pluginConfiguration");
        sq8.m48649h(qc4Var, "authCredentialsProvider");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = qc4Var;
        this.client = (lhe) lhe.f33823U.m38580c(new AWSRekognitionService$client$1(this));
        this.executor = Executors.newCachedThreadPool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectCelebrities(ByteBuffer byteBuffer, n64 n64Var) {
        C106261 c106261;
        String strM24895d;
        Float fM24894c;
        if (n64Var instanceof C106261) {
            c106261 = (C106261) n64Var;
            int i = c106261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106261.label = i - Integer.MIN_VALUE;
            } else {
                c106261 = new C106261(n64Var);
            }
        }
        Object objQ0 = c106261.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106261.label;
        if (i2 == 0) {
            wre.m54934b(objQ0);
            lhe lheVar = this.client;
            oee.C15781a c15781a = new oee.C15781a();
            c15781a.m42143c(fc8.f23129c.m26450a(new AWSRekognitionService$detectCelebrities$result$1$1(byteBuffer)));
            oee oeeVarM42141a = c15781a.m42141a();
            c106261.label = 1;
            objQ0 = lheVar.q0(oeeVarM42141a, c106261);
            if (objQ0 == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objQ0);
        }
        ArrayList arrayList = new ArrayList();
        List<ef2> listM43534a = ((pee) objQ0).m43534a();
        if (listM43534a != null) {
            for (ef2 ef2Var : listM43534a) {
                String strM24893b = ef2Var.m24893b();
                Celebrity celebrityBuild = (strM24893b == null || (strM24895d = ef2Var.m24895d()) == null || (fM24894c = ef2Var.m24894c()) == null) ? null : ((Celebrity.Builder) ((Celebrity.Builder) ((Celebrity.Builder) Celebrity.builder().id(strM24893b)).value(strM24895d)).confidence(fM24894c.floatValue())).build();
                ok3 ok3VarM24892a = ef2Var.m24892a();
                RectF rectFFromBoundingBox = RekognitionResultTransformers.fromBoundingBox(ok3VarM24892a != null ? ok3VarM24892a.m42349a() : null);
                Pose poseFromRekognitionPose = RekognitionResultTransformers.fromRekognitionPose(ok3VarM24892a != null ? ok3VarM24892a.m42351c() : null);
                List<Landmark> listFromLandmarks = RekognitionResultTransformers.fromLandmarks(ok3VarM24892a != null ? ok3VarM24892a.m42350b() : null);
                sq8.m48648g(listFromLandmarks, "fromLandmarks(...)");
                ArrayList arrayList2 = new ArrayList();
                List listM24896e = ef2Var.m24896e();
                if (listM24896e != null) {
                    Iterator it = listM24896e.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(new URL((String) it.next()));
                        } catch (MalformedURLException unused) {
                        }
                    }
                }
                if (celebrityBuild != null) {
                    CelebrityDetails celebrityDetailsBuild = CelebrityDetails.builder().celebrity(celebrityBuild).box(rectFFromBoundingBox).pose(poseFromRekognitionPose).landmarks(listFromLandmarks).urls(arrayList2).build();
                    sq8.m48648g(celebrityDetailsBuild, "build(...)");
                    arrayList.add(celebrityDetailsBuild);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectEntityMatches(ByteBuffer byteBuffer, int i, String str, n64 n64Var) throws PredictionsException {
        C106301 c106301;
        String strM27380b;
        Float fM34382b;
        if (n64Var instanceof C106301) {
            c106301 = (C106301) n64Var;
            int i2 = c106301.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c106301.label = i2 - Integer.MIN_VALUE;
            } else {
                c106301 = new C106301(n64Var);
            }
        }
        Object objF2 = c106301.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c106301.label;
        try {
            if (i3 == 0) {
                wre.m54934b(objF2);
                lhe lheVar = this.client;
                c9f.C12593a c12593a = new c9f.C12593a();
                c12593a.m20526h(fc8.f23129c.m26450a(new AWSRekognitionService$detectEntityMatches$result$1$1(byteBuffer)));
                c12593a.m20527i(ml1.m39304d(i));
                c12593a.m20525g(str);
                c9f c9fVarM20519a = c12593a.m20519a();
                c106301.label = 1;
                objF2 = lheVar.F2(c9fVarM20519a, c106301);
                if (objF2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objF2);
            }
            d9f d9fVar = (d9f) objF2;
            ArrayList arrayList = new ArrayList();
            List<jr6> listM22626a = d9fVar.m22626a();
            if (listM22626a != null) {
                for (jr6 jr6Var : listM22626a) {
                    fr6 fr6VarM34381a = jr6Var.m34381a();
                    RectF rectFFromBoundingBox = RekognitionResultTransformers.fromBoundingBox(fr6VarM34381a != null ? fr6VarM34381a.m27379a() : null);
                    fr6 fr6VarM34381a2 = jr6Var.m34381a();
                    if (fr6VarM34381a2 != null && (strM27380b = fr6VarM34381a2.m27380b()) != null && (fM34382b = jr6Var.m34382b()) != null) {
                        EntityMatch entityMatchBuild = ((EntityMatch.Builder) ((EntityMatch.Builder) EntityMatch.builder().externalImageId(strM27380b).confidence(fM34382b.floatValue())).box(rectFFromBoundingBox)).build();
                        sq8.m48648g(entityMatchBuild, "build(...)");
                        arrayList.add(entityMatchBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while searching for known faces.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectModerationLabels(ByteBuffer byteBuffer, n64 n64Var) throws PredictionsException {
        C106341 c106341;
        Float fM56422a;
        if (n64Var instanceof C106341) {
            c106341 = (C106341) n64Var;
            int i = c106341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106341.label = i - Integer.MIN_VALUE;
            } else {
                c106341 = new C106341(n64Var);
            }
        }
        Object objJ3 = c106341.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106341.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objJ3);
                lhe lheVar = this.client;
                xo5.C18204a c18204a = new xo5.C18204a();
                c18204a.m56530f(fc8.f23129c.m26450a(new AWSRekognitionService$detectModerationLabels$result$1$1(byteBuffer)));
                xo5 xo5VarM56525a = c18204a.m56525a();
                c106341.label = 1;
                objJ3 = lheVar.j3(xo5VarM56525a, c106341);
                if (objJ3 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objJ3);
            }
            yo5 yo5Var = (yo5) objJ3;
            ArrayList arrayList = new ArrayList();
            List<xkb> listM58034a = yo5Var.m58034a();
            if (listM58034a != null) {
                for (xkb xkbVar : listM58034a) {
                    String strM56423b = xkbVar.m56423b();
                    if (strM56423b != null && (fM56422a = xkbVar.m56422a()) != null) {
                        Label labelBuild = ((Label.Builder) ((Label.Builder) Label.builder().value(strM56423b)).confidence(fM56422a.floatValue())).parentLabels(bh3.m18963e(xkbVar.m56424c())).build();
                        sq8.m48648g(labelBuild, "build(...)");
                        arrayList.add(labelBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while detecting moderation labels.", e, "See attached exception for more details.");
        }
    }

    private final <T> void execute(final xk7 xk7Var, final xk7 xk7Var2, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: o.t3
            @Override // java.lang.Runnable
            public final void run() {
                AWSRekognitionService.execute$lambda$32(xk7Var2, consumer2, xk7Var, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$32(xk7 xk7Var, Consumer consumer, xk7 xk7Var2, Consumer consumer2) {
        sq8.m48649h(xk7Var, "$errorTransformer");
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(xk7Var2, "$runnableTask");
        sq8.m48649h(consumer2, "$onResult");
        try {
            qm1.m45641b(null, new AWSRekognitionService$execute$1$1(xk7Var2, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept(th instanceof PredictionsException ? th : (PredictionsException) xk7Var.invoke(th));
        }
    }

    public final void detectEntities(ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(byteBuffer, "imageData");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106271(byteBuffer, null), C106282.INSTANCE, consumer, consumer2);
    }

    public final void detectLabels(LabelType labelType, ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(labelType, "type");
        sq8.m48649h(byteBuffer, "imageData");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106311(labelType, this, byteBuffer, null), C106322.INSTANCE, consumer, consumer2);
    }

    public final void detectPlainText(ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(byteBuffer, "imageData");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106351(byteBuffer, null), C106362.INSTANCE, consumer, consumer2);
    }

    public final lhe getClient() {
        return this.client;
    }

    public final void recognizeCelebrities(ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) throws PredictionsException {
        sq8.m48649h(byteBuffer, "imageData");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        IdentifyEntitiesConfiguration identifyEntitiesConfiguration = this.pluginConfiguration.getIdentifyEntitiesConfiguration();
        sq8.m48648g(identifyEntitiesConfiguration, "getIdentifyEntitiesConfiguration(...)");
        if (identifyEntitiesConfiguration.isCelebrityDetectionEnabled()) {
            execute(new C106381(byteBuffer, null), C106392.INSTANCE, consumer, consumer2);
        } else {
            consumer2.accept(new PredictionsException("Celebrity detection is disabled.", "Please enable celebrity detection via Amplify CLI. This feature should be accessible by running `amplify update predictions` in the console and updating entities detection resource with advanced configuration setting."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectEntities(ByteBuffer byteBuffer, n64 n64Var) throws PredictionsException {
        C106293 c106293;
        String strMo57227a;
        Float fM45694a;
        String strMo48561a;
        if (n64Var instanceof C106293) {
            c106293 = (C106293) n64Var;
            int i = c106293.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106293.label = i - Integer.MIN_VALUE;
            } else {
                c106293 = new C106293(n64Var);
            }
        }
        Object objF2 = c106293.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106293.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objF2);
                lhe lheVar = this.client;
                wn5.C17932a c17932a = new wn5.C17932a();
                c17932a.m54728e(fc8.f23129c.m26450a(new AWSRekognitionService$detectEntities$result$1$1(byteBuffer)));
                c17932a.m54727d(ch3.m21252q(ix0.C14386b.f29309c));
                wn5 wn5VarM54724a = c17932a.m54724a();
                c106293.label = 1;
                objF2 = lheVar.f2(wn5VarM54724a, c106293);
                if (objF2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objF2);
            }
            xn5 xn5Var = (xn5) objF2;
            ArrayList arrayList = new ArrayList();
            List<gr6> listM56492a = xn5Var.m56492a();
            if (listM56492a != null) {
                for (gr6 gr6Var : listM56492a) {
                    RectF rectFFromBoundingBox = RekognitionResultTransformers.fromBoundingBox(gr6Var.m29346c());
                    AgeRange ageRangeFromRekognitionAgeRange = RekognitionResultTransformers.fromRekognitionAgeRange(gr6Var.m29344a());
                    Pose poseFromRekognitionPose = RekognitionResultTransformers.fromRekognitionPose(gr6Var.m29354k());
                    List<Landmark> listFromLandmarks = RekognitionResultTransformers.fromLandmarks(gr6Var.m29351h());
                    sq8.m48648g(listFromLandmarks, "fromLandmarks(...)");
                    List<BinaryFeature> listFromFaceDetail = RekognitionResultTransformers.fromFaceDetail(gr6Var);
                    qn7 qn7VarM29350g = gr6Var.m29350g();
                    Gender genderBuild = null;
                    if (qn7VarM29350g != null && (fM45694a = qn7VarM29350g.m45694a()) != null) {
                        float fFloatValue = fM45694a.floatValue();
                        Gender.Builder builder = Gender.builder();
                        sn7 sn7VarM45695b = qn7VarM29350g.m45695b();
                        if (sn7VarM45695b == null || (strMo48561a = sn7VarM45695b.mo48561a()) == null) {
                            strMo48561a = "";
                        }
                        genderBuild = ((Gender.Builder) ((Gender.Builder) builder.value(GenderBinaryTypeAdapter.fromRekognition(strMo48561a))).confidence(fFloatValue)).build();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<v56> listM29347d = gr6Var.m29347d();
                    if (listM29347d != null) {
                        for (v56 v56Var : listM29347d) {
                            y56 y56VarM52334b = v56Var.m52334b();
                            if (y56VarM52334b == null || (strMo57227a = y56VarM52334b.mo57227a()) == null) {
                                strMo57227a = "";
                            }
                            EmotionType emotionTypeFromRekognition = EmotionTypeAdapter.fromRekognition(strMo57227a);
                            Float fM52333a = v56Var.m52333a();
                            if (fM52333a != null) {
                                Emotion emotionBuild = ((Emotion.Builder) ((Emotion.Builder) Emotion.builder().value(emotionTypeFromRekognition)).confidence(fM52333a.floatValue())).build();
                                sq8.m48648g(emotionBuild, "build(...)");
                                arrayList2.add(emotionBuild);
                            }
                        }
                    }
                    Collections.sort(arrayList2, Collections.reverseOrder());
                    EntityDetails entityDetailsBuild = EntityDetails.builder().box(rectFFromBoundingBox).ageRange(ageRangeFromRekognitionAgeRange).pose(poseFromRekognitionPose).gender(genderBuild).landmarks(listFromLandmarks).emotions(arrayList2).features(listFromFaceDetail).build();
                    sq8.m48648g(entityDetailsBuild, "build(...)");
                    arrayList.add(entityDetailsBuild);
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while detecting faces.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectLabels(ByteBuffer byteBuffer, n64 n64Var) throws PredictionsException {
        C106333 c106333;
        Float fM16991a;
        if (n64Var instanceof C106333) {
            c106333 = (C106333) n64Var;
            int i = c106333.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106333.label = i - Integer.MIN_VALUE;
            } else {
                c106333 = new C106333(n64Var);
            }
        }
        Object objN2 = c106333.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106333.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objN2);
                lhe lheVar = this.client;
                qo5.C16430a c16430a = new qo5.C16430a();
                c16430a.m45719g(fc8.f23129c.m26450a(new AWSRekognitionService$detectLabels$result$1$1(byteBuffer)));
                qo5 qo5VarM45713a = c16430a.m45713a();
                c106333.label = 1;
                objN2 = lheVar.N2(qo5VarM45713a, c106333);
                if (objN2 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objN2);
            }
            ro5 ro5Var = (ro5) objN2;
            ArrayList arrayList = new ArrayList();
            List<af9> listM47014a = ro5Var.m47014a();
            if (listM47014a != null) {
                for (af9 af9Var : listM47014a) {
                    ArrayList arrayList2 = new ArrayList();
                    List listM16994d = af9Var.m16994d();
                    if (listM16994d != null) {
                        Iterator it = listM16994d.iterator();
                        while (it.hasNext()) {
                            String strM50726a = ((twc) it.next()).m50726a();
                            if (strM50726a != null) {
                                arrayList2.add(strM50726a);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    List listM16992b = af9Var.m16992b();
                    if (listM16992b != null) {
                        Iterator it2 = listM16992b.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(RekognitionResultTransformers.fromBoundingBox(((ck8) it2.next()).m21337a()));
                        }
                    }
                    String strM16993c = af9Var.m16993c();
                    if (strM16993c != null && (fM16991a = af9Var.m16991a()) != null) {
                        Label labelBuild = ((Label.Builder) ((Label.Builder) Label.builder().value(strM16993c)).confidence(fM16991a.floatValue())).parentLabels(arrayList2).boxes(arrayList3).build();
                        sq8.m48648g(labelBuild, "build(...)");
                        arrayList.add(labelBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while detecting labels.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectPlainText(ByteBuffer byteBuffer, n64 n64Var) {
        C106373 c106373;
        String strMo17258a;
        if (n64Var instanceof C106373) {
            c106373 = (C106373) n64Var;
            int i = c106373.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106373.label = i - Integer.MIN_VALUE;
            } else {
                c106373 = new C106373(n64Var);
            }
        }
        Object objMo28570M = c106373.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106373.label;
        if (i2 == 0) {
            wre.m54934b(objMo28570M);
            lhe lheVar = this.client;
            qp5.C16438a c16438a = new qp5.C16438a();
            c16438a.m45749d(fc8.f23129c.m26450a(new AWSRekognitionService$detectPlainText$result$1$1(byteBuffer)));
            qp5 qp5VarM45746a = c16438a.m45746a();
            c106373.label = 1;
            objMo28570M = lheVar.mo28570M(qp5VarM45746a, c106373);
            if (objMo28570M == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo28570M);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<sgh> listM47047a = ((rp5) objMo28570M).m47047a();
        if (listM47047a != null) {
            for (sgh sghVar : listM47047a) {
                ajh.C12199a c12199a = ajh.f14860a;
                ajh ajhVarM48332d = sghVar.m48332d();
                if (ajhVarM48332d == null || (strMo17258a = ajhVarM48332d.mo17258a()) == null) {
                    strMo17258a = "";
                }
                ajh ajhVarM17259a = c12199a.m17259a(strMo17258a);
                if (sq8.m48644c(ajhVarM17259a, ajh.C12200b.f14862c)) {
                    String strM48330b = sghVar.m48330b();
                    if (strM48330b != null) {
                        ml1.m39301a(arrayList.add(strM48330b));
                    }
                    arrayList3.add(RekognitionResultTransformers.fromTextDetection(sghVar));
                } else if (sq8.m48644c(ajhVarM17259a, ajh.C12202d.f14865c)) {
                    sb.append(sghVar.m48330b());
                    sb.append(" ");
                    arrayList2.add(RekognitionResultTransformers.fromTextDetection(sghVar));
                }
            }
        }
        IdentifyTextResult.Builder builder = IdentifyTextResult.builder();
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        int length = string.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = sq8.m48651j(string.charAt(!z ? i3 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i3++;
            } else {
                z = true;
            }
        }
        IdentifyTextResult identifyTextResultBuild = builder.fullText(string.subSequence(i3, length + 1).toString()).rawLineText(arrayList).lines(arrayList3).words(arrayList2).build();
        sq8.m48648g(identifyTextResultBuild, "build(...)");
        return identifyTextResultBuild;
    }
}
