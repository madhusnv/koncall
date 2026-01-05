package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Address;
import java.util.Optional;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$primaryAddress$1 extends kf9 implements xk7 {
    public static final LeadsSummary$primaryAddress$1 INSTANCE = new LeadsSummary$primaryAddress$1();

    public LeadsSummary$primaryAddress$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(Address address) {
        sq8.m48649h(address, "addr");
        Object objOrElse = Optional.ofNullable(address.getIsPrimaryAddress()).orElse(Boolean.FALSE);
        sq8.m48648g(objOrElse, "orElse(...)");
        return (Boolean) objOrElse;
    }
}
