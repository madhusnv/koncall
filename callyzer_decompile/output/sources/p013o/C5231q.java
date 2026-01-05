package p013o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.q */
/* loaded from: classes.dex */
public final class C5231q {

    /* renamed from: a */
    public final AbstractC5230p f25613a;

    /* renamed from: b */
    public ColorStateList f25614b = null;

    /* renamed from: c */
    public PorterDuff.Mode f25615c = null;

    /* renamed from: d */
    public boolean f25616d = false;

    /* renamed from: e */
    public boolean f25617e = false;

    /* renamed from: f */
    public boolean f25618f;

    public C5231q(AbstractC5230p abstractC5230p) {
        this.f25613a = abstractC5230p;
    }

    /* renamed from: a */
    public final void m10274a() {
        AbstractC5230p abstractC5230p = this.f25613a;
        Drawable buttonDrawable = abstractC5230p.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f25616d || this.f25617e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f25616d) {
                    drawableMutate.setTintList(this.f25614b);
                }
                if (this.f25617e) {
                    drawableMutate.setTintMode(this.f25615c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(abstractC5230p.getDrawableState());
                }
                abstractC5230p.setButtonDrawable(drawableMutate);
            }
        }
    }
}
