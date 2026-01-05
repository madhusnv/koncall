package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"mentionedUserId", "accountId", "updatedAt"}, name = "byMentionedUserId"), @Index(fields = {"isAnnouncement", "accountId", "updatedAt"}, name = "byAnnouncement")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "MentionUserMemberships")
/* loaded from: classes5.dex */
public final class MentionUserMembership implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "commentId", type = Comment.class)
    @ModelField(targetType = "Comment")
    private final Comment comment;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User commentedBy;

    @ModelField(isRequired = true, targetType = "ID")
    private final String commentedById;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Announcement")
    private final Announcement isAnnouncement;

    @ModelField(targetType = "ID")
    private final String mentionedUserId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("MentionUserMembership", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("MentionUserMembership", "accountId");
    public static final QueryField COMMENT = QueryField.field("MentionUserMembership", "commentId");
    public static final QueryField MENTIONED_USER_ID = QueryField.field("MentionUserMembership", "mentionedUserId");
    public static final QueryField IS_ANNOUNCEMENT = QueryField.field("MentionUserMembership", "isAnnouncement");
    public static final QueryField COMMENTED_BY_ID = QueryField.field("MentionUserMembership", "commentedById");
    public static final QueryField CREATED_AT = QueryField.field("MentionUserMembership", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("MentionUserMembership", "updatedAt");

    public interface AccountIdStep {
        CommentedByIdStep accountId(String str);
    }

    public interface BuildStep {
        MentionUserMembership build();

        BuildStep comment(Comment comment);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep isAnnouncement(Announcement announcement);

        BuildStep mentionedUserId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, CommentedByIdStep, BuildStep {
        private String accountId;
        private Comment comment;
        private String commentedById;
        private Temporal.DateTime createdAt;
        private String id;
        private Announcement isAnnouncement;
        private String mentionedUserId;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.AccountIdStep
        public CommentedByIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public MentionUserMembership build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new MentionUserMembership(string, this.accountId, this.comment, this.mentionedUserId, this.isAnnouncement, this.commentedById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public BuildStep comment(Comment comment) {
            this.comment = comment;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.CommentedByIdStep
        public BuildStep commentedById(String str) {
            Objects.requireNonNull(str);
            this.commentedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public BuildStep isAnnouncement(Announcement announcement) {
            this.isAnnouncement = announcement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public BuildStep mentionedUserId(String str) {
            this.mentionedUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Comment comment, String str3, Announcement announcement, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.comment = comment;
            this.mentionedUserId = str3;
            this.isAnnouncement = announcement;
            this.commentedById = str4;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public interface CommentedByIdStep {
        BuildStep commentedById(String str);
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Comment comment, String str3, Announcement announcement, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, comment, str3, announcement, str4, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public CopyOfBuilder comment(Comment comment) {
            return (CopyOfBuilder) super.comment(comment);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.CommentedByIdStep
        public CopyOfBuilder commentedById(String str) {
            return (CopyOfBuilder) super.commentedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public CopyOfBuilder isAnnouncement(Announcement announcement) {
            return (CopyOfBuilder) super.isAnnouncement(announcement);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public CopyOfBuilder mentionedUserId(String str) {
            return (CopyOfBuilder) super.mentionedUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionUserMembership.Builder, com.amplifyframework.datastore.generated.model.MentionUserMembership.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static MentionUserMembership justId(String str) {
        return new MentionUserMembership(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.comment, this.mentionedUserId, this.isAnnouncement, this.commentedById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MentionUserMembership.class != obj.getClass()) {
            return false;
        }
        MentionUserMembership mentionUserMembership = (MentionUserMembership) obj;
        return s6c.m47909a(getId(), mentionUserMembership.getId()) && s6c.m47909a(getAccountId(), mentionUserMembership.getAccountId()) && s6c.m47909a(getComment(), mentionUserMembership.getComment()) && s6c.m47909a(getMentionedUserId(), mentionUserMembership.getMentionedUserId()) && s6c.m47909a(getIsAnnouncement(), mentionUserMembership.getIsAnnouncement()) && s6c.m47909a(getCommentedById(), mentionUserMembership.getCommentedById()) && s6c.m47909a(getCreatedAt(), mentionUserMembership.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), mentionUserMembership.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Comment getComment() {
        return this.comment;
    }

    public User getCommentedBy() {
        return this.commentedBy;
    }

    public String getCommentedById() {
        return this.commentedById;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public Announcement getIsAnnouncement() {
        return this.isAnnouncement;
    }

    public String getMentionedUserId() {
        return this.mentionedUserId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getComment() + getMentionedUserId() + getIsAnnouncement() + getCommentedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MentionUserMembership {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("comment=" + String.valueOf(getComment()) + ", ");
        sb.append("mentionedUserId=" + String.valueOf(getMentionedUserId()) + ", ");
        sb.append("isAnnouncement=" + String.valueOf(getIsAnnouncement()) + ", ");
        sb.append("commentedById=" + String.valueOf(getCommentedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private MentionUserMembership(String str, String str2, Comment comment, String str3, Announcement announcement, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.commentedBy = null;
        this.id = str;
        this.accountId = str2;
        this.comment = comment;
        this.mentionedUserId = str3;
        this.isAnnouncement = announcement;
        this.commentedById = str4;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
