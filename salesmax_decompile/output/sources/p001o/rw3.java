package p001o;

import com.amplifyframework.datastore.generated.model.ContactNumberDetail;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class rw3 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((ContactNumberDetail) obj).getPhoneNumber();
    }
}
