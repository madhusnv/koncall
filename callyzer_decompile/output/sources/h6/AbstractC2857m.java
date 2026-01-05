package h6;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.m */
/* loaded from: classes.dex */
public abstract class AbstractC2857m {

    /* renamed from: a */
    public final Bundle f15865a;

    /* renamed from: b */
    public final Bundle f15866b;

    /* renamed from: c */
    public final Set f15867c;

    public AbstractC2857m(Bundle bundle, Bundle bundle2, Set set) {
        this.f15865a = bundle;
        this.f15866b = bundle2;
        this.f15867c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
