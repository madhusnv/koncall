package p001o;

import com.amplifyframework.datastore.generated.model.HasParent;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class etc implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((HasParent) obj).name();
    }
}
