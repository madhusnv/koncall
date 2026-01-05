package p001o;

import ai.salesmax.model.ContactNumberSummary;
import com.amplifyframework.datastore.generated.model.ContactNumber;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ky3 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new ContactNumberSummary((ContactNumber) obj);
    }
}
