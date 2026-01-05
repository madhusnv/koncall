package p001o;

import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ModelContactConnection;
import java.util.Optional;
import type.ModelContactFilterInput;
import type.QueryContactListInput;

/* loaded from: classes.dex */
public interface qlc extends k04 {
    static /* synthetic */ ryh Ta(ModelContactConnection modelContactConnection) {
        return uyh.of(modelContactConnection.getItems(), modelContactConnection.getNextToken());
    }

    default s47 l0(ryh ryhVar, String str, int i) {
        return A2(sx((QueryContactListInput) ryhVar.f44265a, (ModelContactFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.plc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return qlc.Ta((ModelContactConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest sx(QueryContactListInput queryContactListInput, ModelContactFilterInput modelContactFilterInput, Optional optional, int i) {
        return ln(queryContactListInput, modelContactFilterInput, optional, i);
    }
}
