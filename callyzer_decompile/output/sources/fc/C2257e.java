package fc;

import ex.InterfaceC2139c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.e */
/* loaded from: classes.dex */
public final class C2257e extends C2254b {

    /* renamed from: d */
    public final Iterator f10254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2257e(Iterator src, InterfaceC2139c src2Dest) {
        super(src, src2Dest);
        AbstractC4154l.m8923f(src, "src");
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        this.f10254d = src;
    }

    @Override // fc.C2254b, java.util.Iterator
    public final void remove() {
        this.f10254d.remove();
    }
}
