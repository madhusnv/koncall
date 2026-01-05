package p001o;

import ai.salesmax.model.LeadSource;
import ai.salesmax.services.model.IntegratedNetworkConnection;
import ai.salesmax.services.model.IntegratedNetworkUserEntityConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class uw9 {
    /* renamed from: f */
    public static x6c m52077f() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: g */
    public static List m52078g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            IntegratedNetworkUserEntityConnection integratedNetworkUserEntityConnection = (IntegratedNetworkUserEntityConnection) it.next();
            String str = String.format("%s", Integer.valueOf(i));
            String str2 = integratedNetworkUserEntityConnection.networkType;
            arrayList.add(new LeadSource(str, str2, str2.toUpperCase(), String.format("Lead sourced from %s ", integratedNetworkUserEntityConnection.networkType.toLowerCase()), false));
            i++;
        }
        return arrayList;
    }

    /* renamed from: h */
    public static x6c m52079h() {
        return m52077f().m55717M(new rl7() { // from class: o.qw9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uw9.m52082k((l1) obj);
            }
        }).d0(new rl7() { // from class: o.rw9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uw9.m52083l((IntegratedNetworkConnection) obj);
            }
        });
    }

    /* renamed from: i */
    public static x6c m52080i() {
        return m52079h().d0(new rl7() { // from class: o.pw9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uw9.m52084m((List) obj);
            }
        });
    }

    /* renamed from: j */
    public static x6c m52081j(final String str) {
        return m52077f().m55717M(new rl7() { // from class: o.sw9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uw9.m52085n(str, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.tw9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uw9.m52086o((IntegratedNetworkConnection) obj);
            }
        });
    }

    /* renamed from: k */
    public static /* synthetic */ x8c m52082k(l1 l1Var) {
        return l1Var.Ni("");
    }

    /* renamed from: l */
    public static /* synthetic */ List m52083l(IntegratedNetworkConnection integratedNetworkConnection) {
        return m52078g(integratedNetworkConnection.result);
    }

    /* renamed from: m */
    public static /* synthetic */ List m52084m(List list) {
        return (List) list.stream().map(new bpd()).collect(Collectors.toList());
    }

    /* renamed from: n */
    public static /* synthetic */ x8c m52085n(String str, l1 l1Var) {
        return l1Var.Ni(str);
    }

    /* renamed from: o */
    public static /* synthetic */ List m52086o(IntegratedNetworkConnection integratedNetworkConnection) {
        return m52078g(integratedNetworkConnection.result);
    }
}
