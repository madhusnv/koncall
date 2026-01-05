package p001o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes2.dex */
public class lm extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f34028a;

    /* renamed from: o.lm$a */
    public static class C15103a {
        /* renamed from: a */
        public static void m37452a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public lm(ActionBarContainer actionBarContainer) {
        this.f34028a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f34028a;
        if (actionBarContainer.f5699h) {
            Drawable drawable = actionBarContainer.f5698g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f5696e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f34028a;
        Drawable drawable3 = actionBarContainer2.f5697f;
        if (drawable3 == null || !actionBarContainer2.f5700q) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f34028a;
        if (actionBarContainer.f5699h) {
            if (actionBarContainer.f5698g != null) {
                C15103a.m37452a(actionBarContainer.f5696e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f5696e;
            if (drawable != null) {
                C15103a.m37452a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
