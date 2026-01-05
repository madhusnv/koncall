package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.ContactAssignmentStatus;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$assignmentStatus$1 extends kf9 implements xk7 {
    public static final LeadsSummary$assignmentStatus$1 INSTANCE = new LeadsSummary$assignmentStatus$1();

    public LeadsSummary$assignmentStatus$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(ContactAssignmentStatus contactAssignmentStatus) {
        sq8.m48649h(contactAssignmentStatus, "obj");
        return contactAssignmentStatus.name();
    }
}
