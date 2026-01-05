package p001o;

import ai.salesmax.model.ChatParticipantSummary;
import com.amplifyframework.datastore.generated.model.ChatParticipant;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class y13 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new ChatParticipantSummary((ChatParticipant) obj);
    }
}
