package p001o;

import com.amazonaws.amplify.generated.graphql.EnrichPropertiesQuery;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class rqd implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((EnrichPropertiesQuery.Data) obj).enrichProperties();
    }
}
