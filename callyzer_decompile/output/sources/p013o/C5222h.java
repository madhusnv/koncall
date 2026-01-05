package p013o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.websoptimization.callyzerbiz.R;
import og.ia;
import p012n.ViewOnTouchListenerC4921a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.h */
/* loaded from: classes.dex */
public final class C5222h extends C5237w implements InterfaceC5224j {

    /* renamed from: d */
    public final /* synthetic */ C5223i f25499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5222h(C5223i c5223i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f25499d = c5223i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ia.m10698b(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC4921a(this, this));
    }

    @Override // p013o.InterfaceC5224j
    /* renamed from: b */
    public final boolean mo551b() {
        return false;
    }

    @Override // p013o.InterfaceC5224j
    /* renamed from: c */
    public final boolean mo552c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f25499d.m10243h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
