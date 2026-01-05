package p001o;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class vbd {
    /* renamed from: a */
    public static final int m52508a(uef uefVar, uef[] uefVarArr) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(uefVarArr, "typeParams");
        int iHashCode = (uefVar.mo16766h().hashCode() * 31) + Arrays.hashCode(uefVarArr);
        Iterable iterableM56192a = xef.m56192a(uefVar);
        Iterator it = iterableM56192a.iterator();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strMo16766h = ((uef) it.next()).mo16766h();
            if (strMo16766h != null) {
                iHashCode3 = strMo16766h.hashCode();
            }
            i = i2 + iHashCode3;
        }
        Iterator it2 = iterableM56192a.iterator();
        while (it2.hasNext()) {
            int i3 = iHashCode2 * 31;
            bff kind = ((uef) it2.next()).getKind();
            iHashCode2 = i3 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }
}
