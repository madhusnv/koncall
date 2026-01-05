package p001o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class in7 {

    /* renamed from: a */
    public final ConcurrentHashMap f28950a = new ConcurrentHashMap();

    /* renamed from: a */
    public final List m32437a(String str) {
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f28950a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((hn7) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m32438b(String str, List list) {
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        sq8.m48649h(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hn7 hn7Var = (hn7) it.next();
            concurrentHashMap.put(hn7Var.m30846a(), hn7Var);
        }
        this.f28950a.put(str, concurrentHashMap);
    }
}
