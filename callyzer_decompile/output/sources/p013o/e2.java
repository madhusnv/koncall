package p013o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e2 implements q0 {

    /* renamed from: a */
    public Toolbar f25465a;

    /* renamed from: b */
    public int f25466b;

    /* renamed from: c */
    public View f25467c;

    /* renamed from: d */
    public Drawable f25468d;

    /* renamed from: e */
    public Drawable f25469e;

    /* renamed from: f */
    public Drawable f25470f;

    /* renamed from: g */
    public boolean f25471g;

    /* renamed from: h */
    public CharSequence f25472h;

    /* renamed from: i */
    public CharSequence f25473i;

    /* renamed from: j */
    public CharSequence f25474j;

    /* renamed from: k */
    public Window.Callback f25475k;

    /* renamed from: l */
    public int f25476l;

    /* renamed from: m */
    public Drawable f25477m;

    /* renamed from: a */
    public final void m10223a(int i10) {
        View view;
        Toolbar toolbar = this.f25465a;
        int i11 = this.f25466b ^ i10;
        this.f25466b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m10224b();
                }
                if ((this.f25466b & 4) != 0) {
                    Drawable drawable = this.f25470f;
                    if (drawable == null) {
                        drawable = this.f25477m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                m10225c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f25472h);
                    toolbar.setSubtitle(this.f25473i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f25467c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m10224b() {
        Toolbar toolbar = this.f25465a;
        if ((this.f25466b & 4) != 0) {
            if (TextUtils.isEmpty(this.f25474j)) {
                toolbar.setNavigationContentDescription(this.f25476l);
            } else {
                toolbar.setNavigationContentDescription(this.f25474j);
            }
        }
    }

    /* renamed from: c */
    public final void m10225c() {
        Drawable drawable;
        int i10 = this.f25466b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f25469e) == null) {
            drawable = this.f25468d;
        }
        this.f25465a.setLogo(drawable);
    }
}
