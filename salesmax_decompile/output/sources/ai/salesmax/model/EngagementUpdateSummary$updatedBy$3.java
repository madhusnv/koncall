package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.EngagementUpdate;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class EngagementUpdateSummary$updatedBy$3 extends kf9 implements xk7 {
    final /* synthetic */ EngagementUpdateSummary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngagementUpdateSummary$updatedBy$3(EngagementUpdateSummary engagementUpdateSummary) {
        super(1);
        this.this$0 = engagementUpdateSummary;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return y3i.f54824a;
    }

    public final void invoke(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        EngagementUpdateSummary engagementUpdateSummary = this.this$0;
        EngagementUpdate engagementUpdateBuild = engagementUpdateSummary.getEngagementUpdate().copyOfBuilder().updatedById(str).build();
        sq8.m48648g(engagementUpdateBuild, "build(...)");
        engagementUpdateSummary.setEngagementUpdate(engagementUpdateBuild);
    }
}
