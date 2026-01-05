package p001o;

import com.amplifyframework.datastore.generated.model.ContactStatus;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class av3 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((ContactStatus) obj).name();
    }
}
