package o6;

import ex.InterfaceC2139c;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public static final a0 f26001a = new a0(1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        File it = (File) obj;
        AbstractC4154l.m8923f(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        AbstractC4154l.m8922e(absolutePath, "file.canonicalFile.absolutePath");
        return new a1(absolutePath);
    }
}
