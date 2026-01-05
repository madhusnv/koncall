package v0;

import c9.C0914i;
import d7.b1;
import fw.C2389c;
import g7.C2536a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l7.AbstractC4414n;
import l7.C4413m;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v0.e */
/* loaded from: classes.dex */
public abstract class AbstractC7621e {

    /* renamed from: a */
    public static volatile AbstractC7621e f36777a;

    /* renamed from: a */
    public static C4413m m14506a(b1 viewModelStore) {
        AbstractC4154l.m8923f(viewModelStore, "viewModelStore");
        C2389c factory = AbstractC4414n.f22085a;
        C2536a extras = C2536a.f13867b;
        AbstractC4154l.m8923f(factory, "factory");
        AbstractC4154l.m8923f(extras, "extras");
        C0914i c0914i = new C0914i(viewModelStore, factory, extras);
        C4147e c4147eM8901a = a0.m8901a(C4413m.class);
        String strM8913b = c4147eM8901a.m8913b();
        if (strM8913b != null) {
            return (C4413m) c0914i.m2630j(c4147eM8901a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: c */
    public static boolean m14507c(C7617a c7617a) {
        AbstractC7621e abstractC7621e;
        if (f36777a != null) {
            abstractC7621e = f36777a;
        } else {
            synchronized (AbstractC7621e.class) {
                if (f36777a == null) {
                    try {
                        f36777a = new C7620d();
                    } catch (NoClassDefFoundError unused) {
                        u1.m10942a("ExtenderVersion");
                        f36777a = new C7619c();
                    }
                }
            }
            abstractC7621e = f36777a;
        }
        C7617a c7617aMo14505b = abstractC7621e.mo14505b();
        int i10 = c7617a.f36769a;
        int i11 = c7617a.f36770b;
        int i12 = c7617aMo14505b.f36769a;
        return (i12 == i10 ? Integer.compare(c7617aMo14505b.f36770b, i11) : Integer.compare(i12, i10)) >= 0;
    }

    /* renamed from: b */
    public abstract C7617a mo14505b();
}
