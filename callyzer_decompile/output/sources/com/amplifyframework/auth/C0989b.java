package com.amplifyframework.auth;

import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.s3.operation.AWSS3StorageGetPresignedUrlOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageListOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageRemoveOperation;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0989b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f5824a;

    /* renamed from: b */
    public final /* synthetic */ Object f5825b;

    public /* synthetic */ C0989b(int i10, Object obj) {
        this.f5824a = i10;
        this.f5825b = obj;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) throws Throwable {
        switch (this.f5824a) {
            case 0:
                CognitoCredentialsProvider.getAccessToken$lambda$4((Consumer) this.f5825b, (AuthException) obj);
                break;
            case 1:
                ((AWSCognitoAuthPlugin) this.f5825b).throwIt((AuthException) obj);
                break;
            case 2:
                ((AWSS3StorageGetPresignedUrlOperation) this.f5825b).lambda$start$0((String) obj);
                break;
            case 3:
                ((AWSS3StorageListOperation) this.f5825b).lambda$start$0((String) obj);
                break;
            default:
                ((AWSS3StorageRemoveOperation) this.f5825b).lambda$start$0((String) obj);
                break;
        }
    }
}
