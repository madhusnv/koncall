package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import p001o.bae;
import p001o.c64;
import p001o.r7e;

/* loaded from: classes2.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* renamed from: d */
    public final AnimationDrawable f8931d;

    /* renamed from: e */
    public final AnimationDrawable f8932e;

    /* renamed from: f */
    public final String f8933f;

    /* renamed from: g */
    public final String f8934g;

    /* renamed from: h */
    public boolean f8935h;

    /* renamed from: q */
    public View.OnClickListener f8936q;

    /* renamed from: androidx.mediarouter.app.MediaRouteExpandCollapseButton$a */
    public class ViewOnClickListenerC2303a implements View.OnClickListener {
        public ViewOnClickListenerC2303a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton.f8935h;
            mediaRouteExpandCollapseButton.f8935h = z;
            if (z) {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f8931d);
                MediaRouteExpandCollapseButton.this.f8931d.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.f8934g);
            } else {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f8932e);
                MediaRouteExpandCollapseButton.this.f8932e.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f8933f);
            }
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.f8936q;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8936q = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) c64.getDrawable(context, r7e.mr_group_expand);
        this.f8931d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) c64.getDrawable(context, r7e.mr_group_collapse);
        this.f8932e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(AbstractC2307c.m8001f(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(bae.mr_controller_expand_group);
        this.f8933f = string;
        this.f8934g = context.getString(bae.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new ViewOnClickListenerC2303a());
    }
}
