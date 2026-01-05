package p001o;

import ai.salesmax.model.LeadsDeal;
import com.amplifyframework.datastore.generated.model.Deal;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class i35 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new LeadsDeal((Deal) obj);
    }
}
