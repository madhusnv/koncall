package h6;

import android.os.Bundle;
import c9.C0910e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.b */
/* loaded from: classes.dex */
public abstract class AbstractC2846b {

    /* renamed from: a */
    public final Bundle f15857a;

    /* renamed from: b */
    public final Bundle f15858b;

    /* renamed from: c */
    public final C0910e f15859c;

    public AbstractC2846b(Bundle bundle, Bundle bundle2, C0910e c0910e) {
        this.f15857a = bundle;
        this.f15858b = bundle2;
        this.f15859c = c0910e;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
