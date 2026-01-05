package og;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f8.C2209d;
import fc.C2253a;
import fc.C2259g;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import o6.InterfaceC5304f;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class df {
    /* renamed from: a */
    public static final C2253a m10611a(Collection collection, InterfaceC2139c src2Dest, InterfaceC2139c dest2Src) {
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        return new C2253a(collection, src2Dest, dest2Src);
    }

    /* renamed from: b */
    public static final C2259g m10612b(List list, InterfaceC2139c src2Dest, InterfaceC2139c dest2Src) {
        AbstractC4154l.m8923f(list, "<this>");
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        AbstractC4154l.m8923f(dest2Src, "dest2Src");
        return new C2259g(list, src2Dest, dest2Src);
    }

    /* renamed from: c */
    public static final Object m10613c(InterfaceC5304f interfaceC5304f, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        return interfaceC5304f.mo10447a(new C2209d(interfaceC2141e, (InterfaceC7559c) null, 3), interfaceC7559c);
    }
}
