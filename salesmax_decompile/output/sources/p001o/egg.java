package p001o;

import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p001o.bhf;

/* loaded from: classes2.dex */
public class egg {

    /* renamed from: a */
    public final boolean f21603a;

    public egg() {
        this.f21603a = xq5.m56605b(SurfaceOrderQuirk.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ int m24979c(bhf.AbstractC12406f abstractC12406f, bhf.AbstractC12406f abstractC12406f2) {
        return m24980b(abstractC12406f.mo19070f()) - m24980b(abstractC12406f2.mo19070f());
    }

    /* renamed from: b */
    public final int m24980b(yj5 yj5Var) {
        if (yj5Var.m57869g() == MediaCodec.class) {
            return 2;
        }
        return yj5Var.m57869g() == ahd.class ? 0 : 1;
    }

    /* renamed from: d */
    public void m24981d(List list) {
        if (this.f21603a) {
            Collections.sort(list, new Comparator() { // from class: o.dgg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return this.f19813a.m24979c((bhf.AbstractC12406f) obj, (bhf.AbstractC12406f) obj2);
                }
            });
        }
    }
}
