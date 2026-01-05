package a1;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import c0.x1;
import com.skydoves.balloon.internals.DefinitionKt;
import og.u1;
import pg.j7;
import wj.C8090p;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.r */
/* loaded from: classes.dex */
public abstract class AbstractC0019r {

    /* renamed from: a */
    public boolean f83a = false;

    /* renamed from: b */
    public Object f84b;

    /* renamed from: c */
    public Object f85c;

    /* renamed from: d */
    public Object f86d;

    public AbstractC0019r(FrameLayout frameLayout, C0009h c0009h) {
        this.f85c = frameLayout;
        this.f86d = c0009h;
    }

    /* renamed from: a */
    public abstract void mo100a(C8090p c8090p);

    /* renamed from: b */
    public abstract String mo101b();

    /* renamed from: c */
    public abstract View mo8c();

    /* renamed from: d */
    public abstract Bitmap mo9d();

    /* renamed from: e */
    public abstract void mo10e();

    /* renamed from: f */
    public abstract void mo11f();

    /* renamed from: g */
    public abstract void mo12g(x1 x1Var, C0013l c0013l);

    /* renamed from: h */
    public void m102h() {
        FrameLayout frameLayout = (FrameLayout) this.f85c;
        View viewMo8c = mo8c();
        if (viewMo8c == null || !this.f83a) {
            return;
        }
        C0009h c0009h = (C0009h) this.f86d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        c0009h.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            u1.m10951j("PreviewTransform");
            return;
        }
        if (c0009h.m95f()) {
            if (viewMo8c instanceof TextureView) {
                ((TextureView) viewMo8c).setTransform(c0009h.m93d());
            } else {
                Display display = viewMo8c.getDisplay();
                boolean z6 = false;
                boolean z10 = (!c0009h.f58g || display == null || display.getRotation() == c0009h.f56e) ? false : true;
                boolean z11 = c0009h.f58g;
                if (!z11) {
                    if ((!z11 ? c0009h.f54c : -j7.m11713c(c0009h.f56e)) != 0) {
                        z6 = true;
                    }
                }
                if (z10 || z6) {
                    u1.m10943b("PreviewTransform");
                }
            }
            RectF rectFM94e = c0009h.m94e(size, layoutDirection);
            viewMo8c.setPivotX(DefinitionKt.NO_Float_VALUE);
            viewMo8c.setPivotY(DefinitionKt.NO_Float_VALUE);
            viewMo8c.setScaleX(rectFM94e.width() / c0009h.f52a.getWidth());
            viewMo8c.setScaleY(rectFM94e.height() / c0009h.f52a.getHeight());
            viewMo8c.setTranslationX(rectFM94e.left - viewMo8c.getLeft());
            viewMo8c.setTranslationY(rectFM94e.top - viewMo8c.getTop());
        }
    }

    /* renamed from: i */
    public abstract InterfaceFutureC8957d mo13i();

    public AbstractC0019r() {
    }
}
