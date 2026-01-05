package androidx.compose.ui.graphics;

import d3.AbstractC1571y;
import d3.h0;
import d3.l0;
import d3.p0;
import ex.InterfaceC2139c;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.ui.graphics.a */
/* loaded from: classes.dex */
public abstract class AbstractC0260a {
    /* renamed from: a */
    public static final InterfaceC7879r m714a(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new BlockGraphicsLayerElement(interfaceC2139c));
    }

    /* renamed from: b */
    public static InterfaceC7879r m715b(InterfaceC7879r interfaceC7879r, float f6, float f10, float f11, float f12, float f13, l0 l0Var, boolean z6, int i10) {
        float f14 = (i10 & 1) != 0 ? 1.0f : f6;
        float f15 = (i10 & 2) != 0 ? 1.0f : f10;
        float f16 = (i10 & 4) != 0 ? 1.0f : f11;
        float f17 = (i10 & 32) != 0 ? 0.0f : f12;
        float f18 = (i10 & 256) != 0 ? 0.0f : f13;
        long j6 = p0.f7805b;
        l0 l0Var2 = (i10 & NewHope.SENDB_BYTES) != 0 ? h0.f7748a : l0Var;
        boolean z10 = (i10 & 4096) != 0 ? false : z6;
        long j10 = AbstractC1571y.f7823a;
        return interfaceC7879r.mo14852e(new GraphicsLayerElement(f14, f15, f16, f17, f18, j6, l0Var2, z10, j10, j10));
    }
}
