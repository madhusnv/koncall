package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.ActivityType;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActivitySummary$activityType$1 extends kf9 implements xk7 {
    public static final ActivitySummary$activityType$1 INSTANCE = new ActivitySummary$activityType$1();

    public ActivitySummary$activityType$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(ActivityType activityType) {
        sq8.m48649h(activityType, "obj");
        return activityType.name();
    }
}
