package com.amplifyframework.storage.s3.extensions;

import org.bouncycastle.asn1.BERTags;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StoragePathKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.extensions.StoragePathKt", m15344f = "StoragePath.kt", m15345l = {BERTags.DATE}, m15346m = "toS3ServiceKey")
    /* renamed from: com.amplifyframework.storage.s3.extensions.StoragePathKt$toS3ServiceKey$1 */
    public static final class C12321 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12321(InterfaceC7559c<? super C12321> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StoragePathKt.toS3ServiceKey(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object toS3ServiceKey(com.amplifyframework.storage.StoragePath r4, com.amplifyframework.auth.AuthCredentialsProvider r5, uw.InterfaceC7559c<? super java.lang.String> r6) throws com.amplifyframework.storage.StorageException {
        /*
            boolean r0 = r6 instanceof com.amplifyframework.storage.s3.extensions.StoragePathKt.C12321
            if (r0 == 0) goto L13
            r0 = r6
            com.amplifyframework.storage.s3.extensions.StoragePathKt$toS3ServiceKey$1 r0 = (com.amplifyframework.storage.s3.extensions.StoragePathKt.C12321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.storage.s3.extensions.StoragePathKt$toS3ServiceKey$1 r0 = new com.amplifyframework.storage.s3.extensions.StoragePathKt$toS3ServiceKey$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$1
            com.amplifyframework.auth.AuthCredentialsProvider r4 = (com.amplifyframework.auth.AuthCredentialsProvider) r4
            java.lang.Object r4 = r0.L$0
            com.amplifyframework.storage.StoragePath r4 = (com.amplifyframework.storage.StoragePath) r4
            og.od.m10798c(r6)     // Catch: java.lang.Exception -> L76
            goto L57
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            og.od.m10798c(r6)
            boolean r6 = r4 instanceof com.amplifyframework.storage.StringStoragePath
            if (r6 == 0) goto L45
            com.amplifyframework.storage.StringStoragePath r4 = (com.amplifyframework.storage.StringStoragePath) r4
            java.lang.String r4 = r4.resolvePath()
            goto L5f
        L45:
            boolean r6 = r4 instanceof com.amplifyframework.storage.IdentityIdProvidedStoragePath
            if (r6 == 0) goto L81
            r0.L$0 = r4     // Catch: java.lang.Exception -> L76
            r6 = 0
            r0.L$1 = r6     // Catch: java.lang.Exception -> L76
            r0.label = r3     // Catch: java.lang.Exception -> L76
            java.lang.Object r6 = r5.getIdentityId(r0)     // Catch: java.lang.Exception -> L76
            if (r6 != r1) goto L57
            return r1
        L57:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L76
            com.amplifyframework.storage.IdentityIdProvidedStoragePath r4 = (com.amplifyframework.storage.IdentityIdProvidedStoragePath) r4
            java.lang.String r4 = r4.resolvePath(r6)
        L5f:
            java.lang.String r5 = "/"
            r6 = 0
            boolean r5 = nx.AbstractC5185w.m10138t(r4, r5, r6)
            if (r5 != 0) goto L6f
            int r5 = r4.length()
            if (r5 == 0) goto L6f
            return r4
        L6f:
            com.amplifyframework.storage.StoragePathValidationException$Companion r4 = com.amplifyframework.storage.StoragePathValidationException.Companion
            com.amplifyframework.storage.StorageException r4 = com.amplifyframework.storage.s3.extensions.StorageExceptionExtensionsKt.invalidStoragePathException(r4)
            throw r4
        L76:
            r4 = move-exception
            com.amplifyframework.storage.StorageException r5 = new com.amplifyframework.storage.StorageException
            java.lang.String r6 = "Failed to fetch identity ID"
            java.lang.String r0 = "See included exception for more details and suggestions to fix."
            r5.<init>(r6, r4, r0)
            throw r5
        L81:
            com.amplifyframework.storage.StoragePathValidationException$Companion r4 = com.amplifyframework.storage.StoragePathValidationException.Companion
            com.amplifyframework.storage.StorageException r4 = com.amplifyframework.storage.s3.extensions.StorageExceptionExtensionsKt.unsupportedStoragePathException(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.s3.extensions.StoragePathKt.toS3ServiceKey(com.amplifyframework.storage.StoragePath, com.amplifyframework.auth.AuthCredentialsProvider, uw.c):java.lang.Object");
    }
}
