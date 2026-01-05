package p001o;

import com.amplifyframework.datastore.generated.model.Contact;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class qy4 implements rl7 {

    /* renamed from: a */
    public final /* synthetic */ Function f42609a;

    public /* synthetic */ qy4(Function function) {
        this.f42609a = function;
    }

    @Override // p001o.rl7
    public final Object apply(Object obj) {
        return this.f42609a.apply((Contact) obj);
    }
}
