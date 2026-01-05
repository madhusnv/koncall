package p001o;

import ai.salesmax.model.ChatParticipantSummary;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class f83 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((ChatParticipantSummary) obj).toChatChannel();
    }
}
