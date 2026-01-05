package ai.salesmax.services.model;

import ai.salesmax.model.IntegrationParameters;
import ai.salesmax.services.model.IntegratedNetworkUserEntity;
import ai.salesmax.services.model.IntegratedNetworkUserEntityConnection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class IntegratedNetworkUserEntityConnection {
    public List<IntegratedNetworkUserEntity> connected;
    public String networkType;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$connectionCount$0(IntegratedNetworkUserEntity integratedNetworkUserEntity) {
        return integratedNetworkUserEntity.subscribed.equals(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$connectionCount$1(List list) {
        return (List) list.stream().filter(new Predicate() { // from class: o.ul8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IntegratedNetworkUserEntityConnection.lambda$connectionCount$0((IntegratedNetworkUserEntity) obj);
            }
        }).collect(Collectors.toList());
    }

    public int connectionCount() {
        return ((Integer) Optional.ofNullable(this.connected).map(new Function() { // from class: o.wl8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return IntegratedNetworkUserEntityConnection.lambda$connectionCount$1((List) obj);
            }
        }).map(new Function() { // from class: o.xl8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((List) obj).size());
            }
        }).orElse(0)).intValue();
    }

    public List<IntegrationParameters> toIntegrationParameters() {
        return (List) ((List) Optional.ofNullable(this.connected).orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.vl8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((IntegratedNetworkUserEntity) obj).toIntegrationParameter();
            }
        }).collect(Collectors.toList());
    }
}
