package p001o;

import ai.salesmax.services.model.IntegratedNetworkConnection;
import com.amazonaws.amplify.generated.graphql.IntegrationActionsMutation;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import type.MutationIntegrationActionsBodyInput;

/* loaded from: classes.dex */
public interface ow9 extends me1 {
    default x6c Ni(String str) {
        return s2("GET_CONNECTION", "", (String) Optional.ofNullable(str).orElse(""), IntegratedNetworkConnection.class);
    }

    default x6c oz(String str, String str2) {
        return s2("CREATE_CONNECTION", str, str2, Map.class);
    }

    default x6c s2(String str, String str2, String str3, Class cls) {
        return graphqlMutation(IntegrationActionsMutation.builder().body(MutationIntegrationActionsBodyInput.builder().accountId(on()).userId(Eo()).action(str).data(str2).networkType(str3).build()).build(), IntegrationActionsMutation.Data.class, new Function() { // from class: o.nw9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((IntegrationActionsMutation.Data) obj).integrationActions();
            }
        }, cls);
    }
}
