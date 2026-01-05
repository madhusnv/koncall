package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.s3.extensions.StoragePathKt;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.operation.AWSS3StoragePathRemoveOperation$start$1$serviceKey$1", m15344f = "AWSS3StoragePathRemoveOperation.kt", m15345l = {43}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AWSS3StoragePathRemoveOperation$start$1$serviceKey$1 extends AbstractC8199i implements InterfaceC2141e {
    int label;
    final /* synthetic */ AWSS3StoragePathRemoveOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathRemoveOperation$start$1$serviceKey$1(AWSS3StoragePathRemoveOperation aWSS3StoragePathRemoveOperation, InterfaceC7559c<? super AWSS3StoragePathRemoveOperation$start$1$serviceKey$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.this$0 = aWSS3StoragePathRemoveOperation;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new AWSS3StoragePathRemoveOperation$start$1$serviceKey$1(this.this$0, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws StorageException {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        StoragePath path = this.this$0.request.getPath();
        AuthCredentialsProvider authCredentialsProvider = this.this$0.authCredentialsProvider;
        this.label = 1;
        Object s3ServiceKey = StoragePathKt.toS3ServiceKey(path, authCredentialsProvider, this);
        return s3ServiceKey == enumC7794a ? enumC7794a : s3ServiceKey;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super String> interfaceC7559c) {
        return ((AWSS3StoragePathRemoveOperation$start$1$serviceKey$1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
