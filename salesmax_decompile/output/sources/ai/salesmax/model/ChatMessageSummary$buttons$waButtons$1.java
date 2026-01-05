package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary$buttons$waButtons$1 extends kf9 implements xk7 {
    public static final ChatMessageSummary$buttons$waButtons$1 INSTANCE = new ChatMessageSummary$buttons$waButtons$1();

    public ChatMessageSummary$buttons$waButtons$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final com.amplifyframework.datastore.generated.model.WaButton invoke(WaButton waButton) {
        return com.amplifyframework.datastore.generated.model.WaButton.builder().waNumber(waButton.getWaNumber()).waText(waButton.getWaText()).waUrl(waButton.getWaUrl()).waType(waButton.getWaType()).build();
    }
}
