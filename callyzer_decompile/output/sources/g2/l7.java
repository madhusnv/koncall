package g2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.skydoves.balloon.internals.DefinitionKt;
import g3.C2484l;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l7 extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ int f12005a;

    public /* synthetic */ l7(int i10) {
        this.f12005a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f12005a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(DefinitionKt.NO_Float_VALUE);
                break;
            case 1:
                if ((view instanceof C2484l) && (outline2 = ((C2484l) view).f13521e) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            case 2:
                AbstractC4154l.m8921d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline outlineM14894b = ((w3.u2) view).f37992e.m14894b();
                AbstractC4154l.m8920c(outlineM14894b);
                outline.set(outlineM14894b);
                break;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(DefinitionKt.NO_Float_VALUE);
                break;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(DefinitionKt.NO_Float_VALUE);
                break;
        }
    }
}
