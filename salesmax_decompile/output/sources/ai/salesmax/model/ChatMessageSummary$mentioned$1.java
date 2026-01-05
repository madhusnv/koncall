package ai.salesmax.model;

import ai.salesmax.model.CommentSummary;
import com.amplifyframework.datastore.generated.model.MentionedEntities;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary$mentioned$1 extends kf9 implements xk7 {
    public static final ChatMessageSummary$mentioned$1 INSTANCE = new ChatMessageSummary$mentioned$1();

    public ChatMessageSummary$mentioned$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final CommentSummary.MentionedEntity invoke(MentionedEntities mentionedEntities) {
        sq8.m48649h(mentionedEntities, "mentionedEntities");
        return new CommentSummary.MentionedEntity(mentionedEntities);
    }
}
