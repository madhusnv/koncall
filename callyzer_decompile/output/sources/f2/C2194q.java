package f2;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.q */
/* loaded from: classes.dex */
public final class C2194q extends RippleDrawable {

    /* renamed from: a */
    public final boolean f10115a;

    /* renamed from: b */
    public C1565s f10116b;

    /* renamed from: c */
    public Integer f10117c;

    /* renamed from: d */
    public boolean f10118d;

    public C2194q(boolean z6) {
        super(ColorStateList.valueOf(-16777216), null, z6 ? new ColorDrawable(-1) : null);
        this.f10115a = z6;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f10115a) {
            this.f10118d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f10118d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f10118d;
    }
}
