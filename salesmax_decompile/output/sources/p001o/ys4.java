package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ys4 {

    /* renamed from: a */
    public boolean f55863a;

    /* renamed from: b */
    public int f55864b;

    /* renamed from: c */
    public Context f55865c;

    /* renamed from: d */
    public boolean f55866d;

    public ys4(boolean z, int i, Context context, boolean z2) {
        this.f55863a = z;
        this.f55864b = i;
        this.f55865c = context;
        this.f55866d = z2;
    }

    /* renamed from: a */
    public final Drawable m58159a() {
        Context context;
        Resources resources;
        if (this.f55864b <= 0 || (context = this.f55865c) == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getDrawable(w7e.badge_background);
    }

    /* renamed from: b */
    public final int m58160b() {
        return this.f55864b;
    }

    /* renamed from: c */
    public final boolean m58161c() {
        return this.f55863a;
    }

    /* renamed from: d */
    public final boolean m58162d() {
        return this.f55866d;
    }

    /* renamed from: e */
    public final void m58163e(int i) {
        this.f55864b = i;
    }

    /* renamed from: f */
    public final void m58164f(boolean z) {
        this.f55863a = z;
    }

    public /* synthetic */ ys4(boolean z, int i, Context context, boolean z2, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : context, (i2 & 8) != 0 ? true : z2);
    }
}
