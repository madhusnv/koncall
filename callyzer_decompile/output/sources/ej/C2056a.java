package ej;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import eb.i3;
import i0.v0;
import java.util.ArrayList;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ej.a */
/* loaded from: classes.dex */
public final class C2056a {

    /* renamed from: a */
    public final boolean f9641a;

    /* renamed from: b */
    public final boolean f9642b;

    /* renamed from: c */
    public final boolean f9643c;

    public C2056a(boolean z6, boolean z10, boolean z11) {
        this.f9641a = z6;
        this.f9642b = z10;
        this.f9643c = z11;
    }

    /* renamed from: a */
    public void m5781a(ArrayList arrayList) {
        if ((this.f9641a || this.f9642b || this.f9643c) && arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((v0) obj).mo7416a();
            }
            u1.m10942a("ForceCloseDeferrableSurface");
        }
    }

    public C2056a(i3 i3Var, i3 i3Var2) {
        this.f9641a = i3Var2.m5728f(TextureViewIsClosedQuirk.class);
        this.f9642b = i3Var.m5728f(PreviewOrientationIncorrectQuirk.class);
        this.f9643c = i3Var.m5728f(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }
}
