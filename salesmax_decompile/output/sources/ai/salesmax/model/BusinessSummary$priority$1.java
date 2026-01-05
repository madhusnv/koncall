package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Business;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class BusinessSummary$priority$1 extends kf9 implements xk7 {
    public static final BusinessSummary$priority$1 INSTANCE = new BusinessSummary$priority$1();

    public BusinessSummary$priority$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(Business business) {
        return business.getPriority();
    }
}
