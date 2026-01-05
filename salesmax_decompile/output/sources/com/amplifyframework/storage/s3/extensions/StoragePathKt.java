package com.amplifyframework.storage.s3.extensions;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.storage.IdentityIdProvidedStoragePath;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.StoragePathValidationException;
import com.amplifyframework.storage.StringStoragePath;
import p001o.e9g;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.um5;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes5.dex */
public final class StoragePathKt {

    @l75(m36647c = "com.amplifyframework.storage.s3.extensions.StoragePathKt", m36648f = "StoragePath.kt", m36649l = {um5.CC_ENABLE_ARENAS_FIELD_NUMBER}, m36650m = "toS3ServiceKey")
    /* renamed from: com.amplifyframework.storage.s3.extensions.StoragePathKt$toS3ServiceKey$1 */
    public static final class C106861 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C106861(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StoragePathKt.toS3ServiceKey(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toS3ServiceKey(StoragePath storagePath, AuthCredentialsProvider authCredentialsProvider, n64 n64Var) throws StorageException {
        C106861 c106861;
        String strResolvePath;
        if (n64Var instanceof C106861) {
            c106861 = (C106861) n64Var;
            int i = c106861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c106861.label = i - Integer.MIN_VALUE;
            } else {
                c106861 = new C106861(n64Var);
            }
        }
        Object identityId = c106861.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c106861.label;
        try {
            if (i2 == 0) {
                wre.m54934b(identityId);
                if (storagePath instanceof StringStoragePath) {
                    strResolvePath = ((StringStoragePath) storagePath).resolvePath();
                    if (!e9g.m24597K(strResolvePath, "/", false, 2, null)) {
                        if (!(strResolvePath.length() == 0)) {
                            return strResolvePath;
                        }
                    }
                    throw StorageExceptionExtensionsKt.invalidStoragePathException(StoragePathValidationException.Companion);
                }
                if (!(storagePath instanceof IdentityIdProvidedStoragePath)) {
                    throw StorageExceptionExtensionsKt.unsupportedStoragePathException(StoragePathValidationException.Companion);
                }
                c106861.L$0 = storagePath;
                c106861.label = 1;
                identityId = authCredentialsProvider.getIdentityId(c106861);
                if (identityId == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                storagePath = (StoragePath) c106861.L$0;
                wre.m54934b(identityId);
            }
            strResolvePath = ((IdentityIdProvidedStoragePath) storagePath).resolvePath((String) identityId);
            if (!e9g.m24597K(strResolvePath, "/", false, 2, null)) {
            }
            throw StorageExceptionExtensionsKt.invalidStoragePathException(StoragePathValidationException.Companion);
        } catch (Exception e) {
            throw new StorageException("Failed to fetch identity ID", e, "See included exception for more details and suggestions to fix.");
        }
    }
}
