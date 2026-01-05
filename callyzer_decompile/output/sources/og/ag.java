package og;

import android.os.Build;
import android.widget.EdgeEffect;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import g6.AbstractC2528c;
import g6.AbstractC2529d;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ag {
    /* renamed from: a */
    public static final void m10536a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
    }

    /* renamed from: b */
    public static final void m10537b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
    }

    /* renamed from: c */
    public static final void m10538c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM4566m.append(i12);
            throw new IndexOutOfBoundsException(sbM4566m.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("fromIndex: ", i10, i11, " > toIndex: "));
        }
    }

    /* renamed from: d */
    public static float m10539d(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC2529d.m6553b(edgeEffect) : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: e */
    public static float m10540e(EdgeEffect edgeEffect, float f6, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2529d.m6554c(edgeEffect, f6, f10);
        }
        AbstractC2528c.m6551a(edgeEffect, f6, f10);
        return f6;
    }
}
