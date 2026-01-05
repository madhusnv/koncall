package pg;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d3.C1552f;
import i3.C3164a;
import k2.C3961j;
import k2.C3966o;
import uv.C7552e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w5 {
    /* renamed from: a */
    public static C3164a m11905a(C1552f c1552f, int i10) {
        Bitmap bitmap = c1552f.f7745a;
        C3164a c3164a = new C3164a(c1552f, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        c3164a.f17081h = i10;
        return c3164a;
    }

    /* renamed from: b */
    public static final C7552e m11906b(boolean z6, C3966o c3966o) {
        Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        boolean zM8614g = c3966o.m8614g(context) | c3966o.m8615h(z6);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = new C7552e(context, z6);
            c3966o.j0(objM8596M);
        }
        return (C7552e) objM8596M;
    }
}
