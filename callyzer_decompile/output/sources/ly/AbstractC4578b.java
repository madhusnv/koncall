package ly;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.od;
import qw.C6363m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4578b {

    /* renamed from: a */
    public static final int f22706a;

    static {
        Object objM10796a;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC4154l.m8922e(property, "getProperty(...)");
            objM10796a = AbstractC5185w.m10140v(property);
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (objM10796a instanceof C6363m) {
            objM10796a = null;
        }
        Integer num = (Integer) objM10796a;
        f22706a = num != null ? num.intValue() : 2097152;
    }
}
