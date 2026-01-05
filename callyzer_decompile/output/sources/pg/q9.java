package pg;

import android.os.Build;
import android.view.View;
import bg.AbstractC0656a;
import bg.C0657b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q9 {

    /* renamed from: a */
    public static final /* synthetic */ int f29037a = 0;

    /* renamed from: a */
    public static C0657b m11835a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C0657b(AbstractC0656a.m1903l(view));
        }
        return null;
    }
}
