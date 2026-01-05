package com.amplifyframework.predictions.aws.service;

import p001o.aig;
import p001o.h84;
import p001o.ic4;
import p001o.jgg;
import p001o.k16;
import p001o.kf9;
import p001o.l75;
import p001o.m16;
import p001o.mdd;
import p001o.n64;
import p001o.nl7;
import p001o.o16;
import p001o.qc4;
import p001o.qx0;
import p001o.sq8;
import p001o.tgd;
import p001o.tx0;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;
import p001o.z81;

@l75(m36647c = "com.amplifyframework.predictions.aws.service.AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1", m36648f = "AmazonPollyPresigningClient.kt", m36649l = {55, 56}, m36650m = "invokeSuspend")
/* renamed from: com.amplifyframework.predictions.aws.service.AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1 */
/* loaded from: classes5.dex */
public final class C10644x7e2834c8 extends jgg implements nl7 {
    final /* synthetic */ PresignedSynthesizeSpeechUrlOptions $options;
    final /* synthetic */ qc4 $presignCredentialsProvider;
    final /* synthetic */ aig $synthesizeSpeechRequest;
    int label;
    final /* synthetic */ AmazonPollyPresigningClient this$0;

    /* renamed from: com.amplifyframework.predictions.aws.service.AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kf9 implements xk7 {
        final /* synthetic */ ic4 $credentials;
        final /* synthetic */ PresignedSynthesizeSpeechUrlOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PresignedSynthesizeSpeechUrlOptions presignedSynthesizeSpeechUrlOptions, ic4 ic4Var) {
            super(1);
            this.$options = presignedSynthesizeSpeechUrlOptions;
            this.$credentials = ic4Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((z81.C18572a) obj);
            return y3i.f54824a;
        }

        public final void invoke(z81.C18572a c18572a) {
            sq8.m48649h(c18572a, "$this$presignSynthesizeSpeech");
            k16.C14700a c14700a = k16.f31358b;
            c18572a.m58918s(k16.m34883h(m16.m38175s(this.$options.getExpires(), o16.SECONDS)));
            c18572a.m58917r(this.$credentials);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10644x7e2834c8(qc4 qc4Var, AmazonPollyPresigningClient amazonPollyPresigningClient, aig aigVar, PresignedSynthesizeSpeechUrlOptions presignedSynthesizeSpeechUrlOptions, n64 n64Var) {
        super(2, n64Var);
        this.$presignCredentialsProvider = qc4Var;
        this.this$0 = amazonPollyPresigningClient;
        this.$synthesizeSpeechRequest = aigVar;
        this.$options = presignedSynthesizeSpeechUrlOptions;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new C10644x7e2834c8(this.$presignCredentialsProvider, this.this$0, this.$synthesizeSpeechRequest, this.$options, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            qc4 qc4Var = this.$presignCredentialsProvider;
            qx0 qx0VarM50736a = tx0.m50736a();
            this.label = 1;
            obj = qc4Var.resolve(qx0VarM50736a, this);
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    wre.m54934b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        mdd mddVar = this.this$0.pollyClient;
        aig aigVar = this.$synthesizeSpeechRequest;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$options, (ic4) obj);
        this.label = 2;
        obj = tgd.m49840d(mddVar, aigVar, null, anonymousClass1, this, 2, null);
        return obj == objM51918f ? objM51918f : obj;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((C10644x7e2834c8) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
