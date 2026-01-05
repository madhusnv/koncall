package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.User;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsUser$id$1 extends kf9 implements xk7 {
    public static final LeadsUser$id$1 INSTANCE = new LeadsUser$id$1();

    public LeadsUser$id$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(User user) {
        sq8.m48649h(user, "obj");
        return user.getId();
    }
}
