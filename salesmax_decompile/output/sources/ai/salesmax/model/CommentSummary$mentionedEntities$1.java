package ai.salesmax.model;

import ai.salesmax.model.CommentSummary;
import com.amplifyframework.datastore.generated.model.MentionedEntities;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class CommentSummary$mentionedEntities$1 extends kf9 implements xk7 {
    public static final CommentSummary$mentionedEntities$1 INSTANCE = new CommentSummary$mentionedEntities$1();

    public CommentSummary$mentionedEntities$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final CommentSummary.MentionedEntity invoke(MentionedEntities mentionedEntities) {
        sq8.m48649h(mentionedEntities, "mentionedEntities");
        return new CommentSummary.MentionedEntity(mentionedEntities);
    }
}
