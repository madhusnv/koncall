package p001o;

import com.amplifyframework.api.graphql.GraphQLResponse;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class g04 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return (Map) ((GraphQLResponse) obj).getData();
    }
}
