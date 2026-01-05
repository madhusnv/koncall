package p001o;

import com.amplifyframework.datastore.generated.model.ChatMessage;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class zv4 implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f57756a;

    public /* synthetic */ zv4(Function function) {
        this.f57756a = function;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f57756a.apply((ChatMessage) obj);
    }
}
