package d7;

import al.C0174b;
import c9.C0914i;
import g7.AbstractC2538c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b */
    public static final C0174b f8066b = new C0174b(6);

    /* renamed from: a */
    public final C0914i f8067a;

    public a1(b1 store, y0 factory, AbstractC2538c defaultCreationExtras) {
        AbstractC4154l.m8923f(store, "store");
        AbstractC4154l.m8923f(factory, "factory");
        AbstractC4154l.m8923f(defaultCreationExtras, "defaultCreationExtras");
        this.f8067a = new C0914i(store, factory, defaultCreationExtras);
    }

    /* renamed from: a */
    public final w0 m5303a(C4147e c4147e) {
        String strM8913b = c4147e.m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f8067a.m2630j(c4147e, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b));
    }
}
