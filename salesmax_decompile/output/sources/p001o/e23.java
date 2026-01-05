package p001o;

import ai.salesmax.model.ChatChannelSummary;
import com.amplifyframework.datastore.generated.model.ChatChannel;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class e23 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new ChatChannelSummary((ChatChannel) obj);
    }
}
