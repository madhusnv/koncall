package p001o;

import com.amplifyframework.datastore.generated.model.AccountMembership;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class zki implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((AccountMembership) obj).getAccount();
    }
}
