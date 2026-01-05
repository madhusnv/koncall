package kotlin.jvm.internal;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 {
    /* renamed from: a */
    public static String m8902a(InterfaceC4150h interfaceC4150h) {
        String string = interfaceC4150h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
