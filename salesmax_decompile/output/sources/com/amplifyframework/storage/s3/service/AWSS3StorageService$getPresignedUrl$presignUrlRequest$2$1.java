package com.amplifyframework.storage.s3.service;

import p001o.cxe;
import p001o.h84;
import p001o.jgg;
import p001o.k16;
import p001o.kf9;
import p001o.l75;
import p001o.m16;
import p001o.n64;
import p001o.nl7;
import p001o.o16;
import p001o.sgd;
import p001o.sq8;
import p001o.uq8;
import p001o.wq7;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1", m36648f = "AWSS3StorageService.kt", m36649l = {80}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1 extends jgg implements nl7 {
    final /* synthetic */ int $expires;
    final /* synthetic */ cxe $it;
    final /* synthetic */ String $serviceKey;
    int label;
    final /* synthetic */ AWSS3StorageService this$0;

    /* renamed from: com.amplifyframework.storage.s3.service.AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1$1 */
    public static final class C106881 extends kf9 implements xk7 {
        final /* synthetic */ String $serviceKey;
        final /* synthetic */ AWSS3StorageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106881(AWSS3StorageService aWSS3StorageService, String str) {
            super(1);
            this.this$0 = aWSS3StorageService;
            this.$serviceKey = str;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((wq7.C17946a) obj);
            return y3i.f54824a;
        }

        public final void invoke(wq7.C17946a c17946a) {
            sq8.m48649h(c17946a, "$this$invoke");
            c17946a.m54851w(this.this$0.s3BucketName);
            c17946a.m54852x(this.$serviceKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1(cxe cxeVar, int i, AWSS3StorageService aWSS3StorageService, String str, n64 n64Var) {
        super(2, n64Var);
        this.$it = cxeVar;
        this.$expires = i;
        this.this$0 = aWSS3StorageService;
        this.$serviceKey = str;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1(this.$it, this.$expires, this.this$0, this.$serviceKey, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            cxe cxeVar = this.$it;
            wq7 wq7VarM54854a = wq7.f52460u.m54854a(new C106881(this.this$0, this.$serviceKey));
            k16.C14700a c14700a = k16.f31358b;
            long jM38175s = m16.m38175s(this.$expires, o16.SECONDS);
            this.label = 1;
            obj = sgd.m48326f(cxeVar, wq7VarM54854a, jM38175s, this);
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

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
