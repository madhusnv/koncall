package t8;

import ex.InterfaceC2139c;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.i */
/* loaded from: classes.dex */
public final class C7063i extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public static final C7063i f34158a = new C7063i(1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC4154l.m8923f(entry, "<name for destructuring parameter 0>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            AbstractC4154l.m8922e(value, "toString(this)");
        }
        sbM11245p.append(value);
        return sbM11245p.toString();
    }
}
