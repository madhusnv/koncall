package ia;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.a */
/* loaded from: classes.dex */
public final class C3209a {
    /* renamed from: a */
    public static EnumC3210b m7555a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        if (lowerCase.equals("ipv4")) {
            return EnumC3210b.IPv4;
        }
        if (lowerCase.equals("ipv6")) {
            return EnumC3210b.IPv6;
        }
        throw new IllegalArgumentException(a1.m14328h('`', "invalid EndpointMode: `", str));
    }
}
