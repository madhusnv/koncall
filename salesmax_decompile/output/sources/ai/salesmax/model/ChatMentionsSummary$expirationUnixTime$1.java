package ai.salesmax.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMentionsSummary$expirationUnixTime$1 extends kf9 implements xk7 {
    public static final ChatMentionsSummary$expirationUnixTime$1 INSTANCE = new ChatMentionsSummary$expirationUnixTime$1();

    public ChatMentionsSummary$expirationUnixTime$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Long invoke(Temporal.Timestamp timestamp) {
        return Long.valueOf(timestamp.getSecondsSinceEpoch() * 1000);
    }
}
