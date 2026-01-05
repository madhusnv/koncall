package p013o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C5215a extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f25433a;

    public C5215a(ActionBarContainer actionBarContainer) {
        this.f25433a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f25433a;
        if (actionBarContainer.f1707g) {
            Drawable drawable = actionBarContainer.f1706f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1704d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1705e;
        if (drawable3 == null || !actionBarContainer.f1708h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f25433a;
        if (actionBarContainer.f1707g) {
            if (actionBarContainer.f1706f != null) {
                actionBarContainer.f1704d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1704d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
