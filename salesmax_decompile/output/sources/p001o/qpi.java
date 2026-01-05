package p001o;

import com.amazonaws.amplify.generated.graphql.GetUserQuery;
import com.amazonaws.amplify.generated.graphql.UpdateUserMutation;
import com.amplifyframework.datastore.generated.model.User;
import java.util.function.Function;
import type.UpdateUserInput;

/* loaded from: classes.dex */
public interface qpi extends ja8 {
    default s47 Os(String str) {
        return graphqlQuery(GetUserQuery.builder().id(str).build(), GetUserQuery.Data.class, new Function() { // from class: o.opi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetUserQuery.Data) obj).getUser();
            }
        }, User.class).C0(la1.BUFFER);
    }

    default x6c cj(UpdateUserInput updateUserInput) {
        return graphqlMutation(UpdateUserMutation.builder().input(updateUserInput).build(), UpdateUserMutation.Data.class, new Function() { // from class: o.ppi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateUserMutation.Data) obj).updateUser();
            }
        }, User.class);
    }
}
