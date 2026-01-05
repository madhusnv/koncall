package p001o;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ci8 {
    /* renamed from: a */
    public static final List m21296a(List list) {
        sq8.m48649h(list, "addresses");
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        hwc hwcVar = new hwc(arrayList, arrayList2);
        List list2 = (List) hwcVar.m31227a();
        List list3 = (List) hwcVar.m31228b();
        return (list2.isEmpty() || list3.isEmpty()) ? list : ggj.m28643w(list2, list3);
    }
}
