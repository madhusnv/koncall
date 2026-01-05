package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.ActivityRelatedObjectType;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActivitySummary$relatedObjectType$1 extends kf9 implements xk7 {
    public static final ActivitySummary$relatedObjectType$1 INSTANCE = new ActivitySummary$relatedObjectType$1();

    public ActivitySummary$relatedObjectType$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(ActivityRelatedObjectType activityRelatedObjectType) {
        sq8.m48649h(activityRelatedObjectType, "obj");
        return activityRelatedObjectType.name();
    }
}
