package qt;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.l */
/* loaded from: classes3.dex */
public final class C6317l {
    /* renamed from: a */
    public static EnumC6318m m12330a(String token) {
        AbstractC4154l.m8923f(token, "token");
        for (EnumC6318m enumC6318m : EnumC6318m.values()) {
            if (AbstractC4154l.m8918a(enumC6318m.getToken(), AbstractC5178p.g0(token).toString())) {
                return enumC6318m;
            }
        }
        return null;
    }
}
