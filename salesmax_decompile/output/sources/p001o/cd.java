package p001o;

import com.amplifyframework.datastore.generated.model.Day;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class cd implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Day) obj).name();
    }
}
