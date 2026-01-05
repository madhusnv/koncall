package a1;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import c0.t0;
import og.u1;
import pg.o7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.v */
/* loaded from: classes.dex */
public final class C0023v extends View {

    /* renamed from: a */
    public Window f92a;

    /* renamed from: b */
    public C0022u f93b;

    private float getBrightness() {
        Window window = this.f92a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        u1.m10943b("ScreenFlashView");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f6) {
        if (this.f92a == null) {
            u1.m10943b("ScreenFlashView");
            return;
        }
        if (Float.isNaN(f6)) {
            u1.m10943b("ScreenFlashView");
            return;
        }
        WindowManager.LayoutParams attributes = this.f92a.getAttributes();
        attributes.screenBrightness = f6;
        this.f92a.setAttributes(attributes);
        u1.m10942a("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(t0 t0Var) {
        u1.m10942a("ScreenFlashView");
    }

    public t0 getScreenFlash() {
        return this.f93b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC0002a abstractC0002a) {
        o7.m11806a();
    }

    public void setScreenFlashWindow(Window window) {
        o7.m11806a();
        u1.m10942a("ScreenFlashView");
        if (this.f92a != window) {
            this.f93b = window == null ? null : new C0022u(this);
        }
        this.f92a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
