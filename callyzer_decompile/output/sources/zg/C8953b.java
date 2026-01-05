package zg;

import android.net.Uri;
import android.os.Bundle;
import h6.C2862r;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zg.b */
/* loaded from: classes.dex */
public final class C8953b extends C2862r {
    public C8953b(String id2, String idToken, String str, String str2, String str3, Uri uri, String str4) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, 0);
        if (id2.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}
