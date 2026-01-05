package ai.salesmax.model;

import ai.salesmax.model.CommentSummary;
import com.amplifyframework.datastore.generated.model.MentionedEntities;
import com.amplifyframework.datastore.generated.model.MentionedEntityType;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary$mentioned$mentionedEntities$1 extends kf9 implements xk7 {
    public static final ChatMessageSummary$mentioned$mentionedEntities$1 INSTANCE = new ChatMessageSummary$mentioned$mentionedEntities$1();

    public ChatMessageSummary$mentioned$mentionedEntities$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final MentionedEntities invoke(CommentSummary.MentionedEntity mentionedEntity) {
        return MentionedEntities.builder().entityType(MentionedEntityType.valueOf(mentionedEntity.getEntityType())).entityId(mentionedEntity.getEntityID()).build();
    }
}
