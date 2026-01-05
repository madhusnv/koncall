package p001o;

import ai.salesmax.model.ChatMessageSummary;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class h83 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((ChatMessageSummary) obj).toChatMessages();
    }
}
