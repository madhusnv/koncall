package s6;

import ex.InterfaceC2139c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import p020v.a1;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s6.a */
/* loaded from: classes.dex */
public final class C6762a extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public static final C6762a f32217a = new C6762a(1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC4154l.m8923f(entry, "entry");
        Object value = entry.getValue();
        return a1.m14335o(new StringBuilder("  "), ((C6765d) entry.getKey()).f32221a, " = ", value instanceof byte[] ? AbstractC6662l.m12701D((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
