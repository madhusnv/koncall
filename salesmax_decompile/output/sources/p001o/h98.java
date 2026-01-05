package p001o;

import com.amplifyframework.api.graphql.GraphQLResponse;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class h98 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((GraphQLResponse.Error) obj).getMessage();
    }
}
