package p001o;

import ai.salesmax.model.ChatMessageSummary;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class d23 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new ChatMessageSummary((ChatMessage) obj);
    }
}
