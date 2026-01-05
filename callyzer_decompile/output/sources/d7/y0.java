package d7;

import dx.AbstractC1851a;
import g7.C2539d;
import kotlin.jvm.internal.C4147e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface y0 {
    /* renamed from: a */
    default w0 mo5348a(Class cls, C2539d c2539d) {
        return mo1207b(cls);
    }

    /* renamed from: b */
    default w0 mo1207b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* renamed from: c */
    default w0 mo5333c(C4147e c4147e, C2539d c2539d) {
        return mo5348a(AbstractC1851a.m5483b(c4147e), c2539d);
    }
}
