package cj;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cj.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0978d implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ int f5800a;

    /* renamed from: b */
    public final /* synthetic */ Object f5801b;

    public /* synthetic */ C0978d(int i10, Object obj) {
        this.f5800a = i10;
        this.f5801b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f5800a) {
            case 0:
                return str.startsWith((String) this.f5801b);
            default:
                return AWSCognitoLegacyCredentialStore.retrieveDeviceMetadataUsernameList$lambda$15((AWSCognitoLegacyCredentialStore) this.f5801b, ".xml", file, str);
        }
    }
}
