package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.adapter.TextractResultTransformers;
import com.amplifyframework.predictions.aws.service.AWSTextractService;
import com.amplifyframework.predictions.models.BoundedKeyValue;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Selection;
import com.amplifyframework.predictions.models.Table;
import com.amplifyframework.predictions.models.TextFormatType;
import com.amplifyframework.predictions.result.IdentifyDocumentTextResult;
import com.amplifyframework.predictions.result.IdentifyResult;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.dj1;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.njh;
import p001o.pt6;
import p001o.qc0;
import p001o.qc4;
import p001o.qm1;
import p001o.rc0;
import p001o.sq8;
import p001o.tv5;
import p001o.uq8;
import p001o.vi1;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSTextractService {
    private final qc4 authCredentialsProvider;
    private final njh client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    @l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSTextractService$detectDocumentText$1", m36648f = "AWSTextractService.kt", m36649l = {Opcodes.PUTSTATIC}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.predictions.aws.service.AWSTextractService$detectDocumentText$1 */
    public static final class C106401 extends jgg implements xk7 {
        final /* synthetic */ ByteBuffer $imageData;
        final /* synthetic */ TextFormatType $type;
        int label;
        final /* synthetic */ AWSTextractService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106401(TextFormatType textFormatType, AWSTextractService aWSTextractService, ByteBuffer byteBuffer, n64 n64Var) {
            super(1, n64Var);
            this.$type = textFormatType;
            this.this$0 = aWSTextractService;
            this.$imageData = byteBuffer;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C106401(this.$type, this.this$0, this.$imageData, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ArrayList arrayList = new ArrayList();
                TextFormatType textFormatType = TextFormatType.FORM;
                TextFormatType textFormatType2 = this.$type;
                if (textFormatType == textFormatType2 || TextFormatType.ALL == textFormatType2) {
                    arrayList.add(pt6.C16179b.f40523c);
                }
                TextFormatType textFormatType3 = TextFormatType.TABLE;
                TextFormatType textFormatType4 = this.$type;
                if (textFormatType3 == textFormatType4 || TextFormatType.ALL == textFormatType4) {
                    arrayList.add(pt6.C16183f.f40531c);
                }
                njh client = this.this$0.getClient();
                ByteBuffer byteBuffer = this.$imageData;
                qc0.C16331a c16331a = new qc0.C16331a();
                c16331a.m45081g(tv5.f47952b.m50710a(new AWSTextractService$detectDocumentText$1$result$1$1(byteBuffer)));
                c16331a.m45082h(arrayList);
                qc0 qc0VarM45075a = c16331a.m45075a();
                this.label = 1;
                obj = client.L2(qc0VarM45075a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            AWSTextractService aWSTextractService = this.this$0;
            List listM46491a = ((rc0) obj).m46491a();
            if (listM46491a == null) {
                listM46491a = ch3.m21246k();
            }
            return aWSTextractService.processTextractBlocks(listM46491a);
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C106401) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.predictions.aws.service.AWSTextractService$detectDocumentText$2 */
    public static final class C106412 extends kf9 implements xk7 {
        public static final C106412 INSTANCE = new C106412();

        public C106412() {
            super(1);
        }

        @Override // p001o.xk7
        public final PredictionsException invoke(Throwable th) {
            sq8.m48649h(th, "throwable");
            return new PredictionsException("AWS Textract encountered an error while analyzing document.", th, "See attached exception for more details.");
        }
    }

    public AWSTextractService(AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, qc4 qc4Var) {
        sq8.m48649h(aWSPredictionsPluginConfiguration, "pluginConfiguration");
        sq8.m48649h(qc4Var, "authCredentialsProvider");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = qc4Var;
        this.client = (njh) njh.e0.m38580c(new AWSTextractService$client$1(this));
        this.executor = Executors.newCachedThreadPool();
    }

    private final <T> void execute(final xk7 xk7Var, final xk7 xk7Var2, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: o.t5
            @Override // java.lang.Runnable
            public final void run() {
                AWSTextractService.execute$lambda$8(xk7Var2, consumer2, xk7Var, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$8(xk7 xk7Var, Consumer consumer, xk7 xk7Var2, Consumer consumer2) {
        sq8.m48649h(xk7Var, "$errorTransformer");
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(xk7Var2, "$runnableTask");
        sq8.m48649h(consumer2, "$onResult");
        try {
            qm1.m45641b(null, new AWSTextractService$execute$1$1(xk7Var2, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept((PredictionsException) xk7Var.invoke(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentifyDocumentTextResult processTextractBlocks(List<vi1> list) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashMap map = new HashMap();
        for (vi1 vi1Var : list) {
            String strM52800f = vi1Var.m52800f();
            if (strM52800f == null) {
                strM52800f = "";
            }
            map.put(strM52800f, vi1Var);
            dj1 dj1VarM52795a = vi1Var.m52795a();
            if (dj1VarM52795a != null) {
                if (sq8.m48644c(dj1VarM52795a, dj1.C12963n.f20092c)) {
                    String strM52805k = vi1Var.m52805k();
                    if (strM52805k != null) {
                        arrayList.add(strM52805k);
                    }
                    IdentifiedText identifiedTextFetchIdentifiedText = TextractResultTransformers.fetchIdentifiedText(vi1Var);
                    if (identifiedTextFetchIdentifiedText != null) {
                        sq8.m48646e(identifiedTextFetchIdentifiedText);
                        arrayList3.add(identifiedTextFetchIdentifiedText);
                    }
                } else if (sq8.m48644c(dj1VarM52795a, dj1.C12975z.f20115c)) {
                    sb.append(vi1Var.m52805k());
                    sb.append(" ");
                    IdentifiedText identifiedTextFetchIdentifiedText2 = TextractResultTransformers.fetchIdentifiedText(vi1Var);
                    if (identifiedTextFetchIdentifiedText2 != null) {
                        sq8.m48646e(identifiedTextFetchIdentifiedText2);
                        arrayList2.add(identifiedTextFetchIdentifiedText2);
                    }
                } else if (sq8.m48644c(dj1VarM52795a, dj1.C12969t.f20103c)) {
                    Selection selectionFetchSelection = TextractResultTransformers.fetchSelection(vi1Var);
                    if (selectionFetchSelection != null) {
                        sq8.m48646e(selectionFetchSelection);
                        arrayList4.add(selectionFetchSelection);
                    }
                } else if (sq8.m48644c(dj1VarM52795a, dj1.C12971v.f20107c)) {
                    arrayList7.add(vi1Var);
                } else if (sq8.m48644c(dj1VarM52795a, dj1.C12952c.f20070c)) {
                    arrayList8.add(vi1Var);
                }
            }
        }
        Iterator it = arrayList7.iterator();
        while (it.hasNext()) {
            Table tableFetchTable = TextractResultTransformers.fetchTable((vi1) it.next(), map);
            if (tableFetchTable != null) {
                arrayList5.add(tableFetchTable);
            }
        }
        Iterator it2 = arrayList8.iterator();
        while (it2.hasNext()) {
            BoundedKeyValue boundedKeyValueFetchKeyValue = TextractResultTransformers.fetchKeyValue((vi1) it2.next(), map);
            if (boundedKeyValueFetchKeyValue != null) {
                arrayList6.add(boundedKeyValueFetchKeyValue);
            }
        }
        IdentifyDocumentTextResult.Builder builder = IdentifyDocumentTextResult.builder();
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = sq8.m48651j(string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        IdentifyDocumentTextResult identifyDocumentTextResultBuild = builder.fullText(string.subSequence(i, length + 1).toString()).rawLineText(arrayList).lines(arrayList3).words(arrayList2).selections(arrayList4).tables(arrayList5).keyValues(arrayList6).build();
        sq8.m48648g(identifyDocumentTextResultBuild, "build(...)");
        return identifyDocumentTextResultBuild;
    }

    public final void detectDocumentText(TextFormatType textFormatType, ByteBuffer byteBuffer, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        sq8.m48649h(textFormatType, "type");
        sq8.m48649h(byteBuffer, "imageData");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        execute(new C106401(textFormatType, this, byteBuffer, null), C106412.INSTANCE, consumer, consumer2);
    }

    public final njh getClient() {
        return this.client;
    }
}
