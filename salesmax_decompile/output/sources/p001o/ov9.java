package p001o;

import ai.salesmax.model.LeadsSummary;
import com.amplifyframework.datastore.generated.model.Contact;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ov9 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new LeadsSummary((Contact) obj);
    }
}
