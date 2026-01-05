package hh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hh.b */
/* loaded from: classes.dex */
public final class C2925b extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f15957a;

    public C2925b(Chip chip) {
        this.f15957a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C2928e c2928e = this.f15957a.f6811e;
        if (c2928e != null) {
            c2928e.getOutline(outline);
        } else {
            outline.setAlpha(DefinitionKt.NO_Float_VALUE);
        }
    }
}
