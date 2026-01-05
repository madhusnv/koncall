package t5;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t5.h */
/* loaded from: classes.dex */
public final class C7050h {

    /* renamed from: a */
    public final ColorStateList f34083a;

    /* renamed from: b */
    public final Configuration f34084b;

    /* renamed from: c */
    public final int f34085c;

    public C7050h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f34083a = colorStateList;
        this.f34084b = configuration;
        this.f34085c = theme == null ? 0 : theme.hashCode();
    }
}
