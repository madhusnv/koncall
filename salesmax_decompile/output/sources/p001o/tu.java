package p001o;

import com.amplifyframework.datastore.generated.model.Team;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class tu implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Team) obj).getId();
    }
}
