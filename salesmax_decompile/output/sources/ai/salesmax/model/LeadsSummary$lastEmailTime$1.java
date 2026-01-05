package ai.salesmax.model;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.Date;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$lastEmailTime$1 extends kf9 implements xk7 {
    public static final LeadsSummary$lastEmailTime$1 INSTANCE = new LeadsSummary$lastEmailTime$1();

    public LeadsSummary$lastEmailTime$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Date invoke(Temporal.DateTime dateTime) {
        sq8.m48649h(dateTime, "dt");
        return dateTime.toDate();
    }
}
