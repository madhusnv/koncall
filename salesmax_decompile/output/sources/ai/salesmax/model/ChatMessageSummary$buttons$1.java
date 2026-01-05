package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary$buttons$1 extends kf9 implements xk7 {
    public static final ChatMessageSummary$buttons$1 INSTANCE = new ChatMessageSummary$buttons$1();

    public ChatMessageSummary$buttons$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final WaButton invoke(com.amplifyframework.datastore.generated.model.WaButton waButton) {
        return new WaButton(waButton.getWaType(), waButton.getWaText(), waButton.getWaUrl(), waButton.getWaNumber());
    }
}
