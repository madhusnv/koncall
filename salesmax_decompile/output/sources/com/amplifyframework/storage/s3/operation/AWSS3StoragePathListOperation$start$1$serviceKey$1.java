package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.s3.extensions.StoragePathKt;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.storage.s3.operation.AWSS3StoragePathListOperation$start$1$serviceKey$1", m36648f = "AWSS3StoragePathListOperation.kt", m36649l = {SignatureVisitor.EXTENDS}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AWSS3StoragePathListOperation$start$1$serviceKey$1 extends jgg implements nl7 {
    int label;
    final /* synthetic */ AWSS3StoragePathListOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathListOperation$start$1$serviceKey$1(AWSS3StoragePathListOperation aWSS3StoragePathListOperation, n64 n64Var) {
        super(2, n64Var);
        this.this$0 = aWSS3StoragePathListOperation;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new AWSS3StoragePathListOperation$start$1$serviceKey$1(this.this$0, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) throws StorageException {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            StoragePath path = this.this$0.request.getPath();
            AuthCredentialsProvider authCredentialsProvider = this.this$0.authCredentialsProvider;
            this.label = 1;
            obj = StoragePathKt.toS3ServiceKey(path, authCredentialsProvider, this);
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
        return ((AWSS3StoragePathListOperation$start$1$serviceKey$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
