package c6;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import ng.C5070u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public final a0 f5424a;

    public b0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f5424a = new C0896z(nestedScrollView);
        } else {
            this.f5424a = new C5070u(4);
        }
    }
}
