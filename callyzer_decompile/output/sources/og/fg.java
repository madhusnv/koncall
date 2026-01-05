package og;

import android.content.Intent;
import android.os.Bundle;
import gx.AbstractC2747a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import t1.AbstractC7000y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class fg {
    /* renamed from: a */
    public static final long m10655a(AbstractC7000y abstractC7000y) {
        return AbstractC2747a.m6748l(((k2.a1) abstractC7000y.f33901d.f39d).m8490f() * abstractC7000y.m13266n()) + (abstractC7000y.m13263j() * abstractC7000y.m13266n());
    }

    /* renamed from: b */
    public static final void m10656b(String key, Bundle bundle) {
        AbstractC4154l.m8923f(key, "key");
        bundle.putString(key, null);
    }

    /* renamed from: c */
    public static final void m10657c(Intent intent, Bundle bundle) {
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
    }

    /* renamed from: d */
    public static final void m10658d(Bundle bundle, String key, Bundle value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        bundle.putBundle(key, value);
    }

    /* renamed from: e */
    public static final void m10659e(String key, String value, Bundle bundle) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        bundle.putString(key, value);
    }

    /* renamed from: f */
    public static final void m10660f(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }
}
