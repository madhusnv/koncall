package og;

import com.google.android.gms.internal.measurement.C1288d;
import com.google.android.gms.internal.measurement.C1289e;
import com.google.android.gms.internal.measurement.C1291g;
import com.google.android.gms.internal.measurement.C1295k;
import com.google.android.gms.internal.measurement.C1299o;
import com.google.android.gms.internal.measurement.C1301q;
import com.google.android.gms.internal.measurement.InterfaceC1298n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ta {
    /* renamed from: a */
    public static int m10925a(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static InterfaceC1298n m10926b(Object obj) {
        if (obj == null) {
            return InterfaceC1298n.f6310o;
        }
        if (obj instanceof String) {
            return new C1301q((String) obj);
        }
        if (obj instanceof Double) {
            return new C1291g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1291g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1291g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1289e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C1288d c1288d = new C1288d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1288d.m3222v(c1288d.m3220t(), m10926b(it.next()));
            }
            return c1288d;
        }
        C1295k c1295k = new C1295k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC1298n interfaceC1298nM10926b = m10926b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c1295k.mo3215k((String) string, interfaceC1298nM10926b);
            }
        }
        return c1295k;
    }

    /* renamed from: c */
    public static InterfaceC1298n m10927c(com.google.android.gms.internal.measurement.y3 y3Var) {
        if (y3Var == null) {
            return InterfaceC1298n.f6309i;
        }
        int iM3791x = y3Var.m3791x() - 1;
        if (iM3791x == 1) {
            return y3Var.m3785r() ? new C1301q(y3Var.m3786s()) : InterfaceC1298n.f6308R;
        }
        if (iM3791x == 2) {
            return y3Var.m3789v() ? new C1291g(Double.valueOf(y3Var.m3790w())) : new C1291g(null);
        }
        if (iM3791x == 3) {
            return y3Var.m3787t() ? new C1289e(Boolean.valueOf(y3Var.m3788u())) : new C1289e(null);
        }
        if (iM3791x != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listM3783p = y3Var.m3783p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM3783p.iterator();
        while (it.hasNext()) {
            arrayList.add(m10927c((com.google.android.gms.internal.measurement.y3) it.next()));
        }
        return new C1299o(y3Var.m3784q(), arrayList);
    }
}
