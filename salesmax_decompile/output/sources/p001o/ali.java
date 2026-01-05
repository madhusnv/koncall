package p001o;

import com.amplifyframework.datastore.generated.model.Account;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ali implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Account) obj).getId();
    }
}
