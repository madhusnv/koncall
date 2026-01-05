package k1;

import androidx.compose.foundation.gestures.DraggableElement;
import c9.C0908c;
import ex.InterfaceC2142f;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a */
    public static final g0 f20107a = new g0(3, 0, null);

    /* renamed from: b */
    public static final g0 f20108b = new g0(3, 1, null);

    /* renamed from: a */
    public static InterfaceC7879r m8446a(InterfaceC7879r interfaceC7879r, C0908c c0908c, x0 x0Var, boolean z6, boolean z10, InterfaceC2142f interfaceC2142f, int i10) {
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        boolean z11 = z6;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return interfaceC7879r.mo14852e(new DraggableElement(c0908c, x0Var, z11, z10, f20107a, interfaceC2142f));
    }
}
