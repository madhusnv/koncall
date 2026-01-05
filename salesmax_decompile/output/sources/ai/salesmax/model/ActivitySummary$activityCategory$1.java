package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.ActivityCategory;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActivitySummary$activityCategory$1 extends kf9 implements xk7 {
    public static final ActivitySummary$activityCategory$1 INSTANCE = new ActivitySummary$activityCategory$1();

    public ActivitySummary$activityCategory$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(ActivityCategory activityCategory) {
        sq8.m48649h(activityCategory, "obj");
        return activityCategory.name();
    }
}
