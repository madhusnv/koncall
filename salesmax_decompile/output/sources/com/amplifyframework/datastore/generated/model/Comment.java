package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"engagementId", "ownerId", "updatedAt"}, name = "listAllCommentsOnEngagement"), @Index(fields = {"activityId", "ownerId", "updatedAt"}, name = "listAllCommentsOnActivity"), @Index(fields = {"parentEngagementId"}, name = "ByParentComment")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "Comments")
/* loaded from: classes5.dex */
public final class Comment implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @BelongsTo(targetName = "activityId", type = Activity.class)
    @ModelField(targetType = "Activity")
    private final Activity activity;

    @ModelField(isRequired = true, targetType = "String")
    private final String body;

    @ModelField(targetType = "Comment")
    @HasMany(associatedWith = "parentEngagementId", type = Comment.class)
    private final List<Comment> childEngagements;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @BelongsTo(targetName = "engagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement engagement;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "MentionedEntities")
    private final List<MentionedEntities> mentioned;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "ID")
    private final String parentEngagementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User userCommenting;
    public static final QueryField ID = QueryField.field("Comment", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT = QueryField.field("Comment", "accountId");
    public static final QueryField OWNER_ID = QueryField.field("Comment", "ownerId");
    public static final QueryField MENTIONED = QueryField.field("Comment", "mentioned");
    public static final QueryField BODY = QueryField.field("Comment", "body");
    public static final QueryField ENGAGEMENT = QueryField.field("Comment", "engagementId");
    public static final QueryField ACTIVITY = QueryField.field("Comment", "activityId");
    public static final QueryField PARENT_ENGAGEMENT_ID = QueryField.field("Comment", "parentEngagementId");
    public static final QueryField CREATED_AT = QueryField.field("Comment", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Comment", "updatedAt");

    public interface BodyStep {
        BuildStep body(String str);
    }

    public interface BuildStep {
        BuildStep account(Account account);

        BuildStep activity(Activity activity);

        Comment build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep engagement(Engagement engagement);

        BuildStep id(String str);

        BuildStep mentioned(List<MentionedEntities> list);

        BuildStep parentEngagementId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements OwnerIdStep, BodyStep, BuildStep {
        private Account account;
        private Activity activity;
        private String body;
        private Temporal.DateTime createdAt;
        private Engagement engagement;
        private String id;
        private List<MentionedEntities> mentioned;
        private String ownerId;
        private String parentEngagementId;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep activity(Activity activity) {
            this.activity = activity;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BodyStep
        public BuildStep body(String str) {
            Objects.requireNonNull(str);
            this.body = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public Comment build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Comment(string, this.account, this.ownerId, this.mentioned, this.body, this.engagement, this.activity, this.parentEngagementId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep engagement(Engagement engagement) {
            this.engagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep mentioned(List<MentionedEntities> list) {
            this.mentioned = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.OwnerIdStep
        public BodyStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep parentEngagementId(String str) {
            this.parentEngagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, String str2, List<MentionedEntities> list, String str3, Engagement engagement, Activity activity, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.account = account;
            this.ownerId = str2;
            this.mentioned = list;
            this.body = str3;
            this.engagement = engagement;
            this.activity = activity;
            this.parentEngagementId = str4;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public /* bridge */ /* synthetic */ BuildStep mentioned(List list) {
            return mentioned((List<MentionedEntities>) list);
        }

        private CopyOfBuilder(String str, Account account, String str2, List<MentionedEntities> list, String str3, Engagement engagement, Activity activity, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, account, str2, list, str3, engagement, activity, str4, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder activity(Activity activity) {
            return (CopyOfBuilder) super.activity(activity);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BodyStep
        public CopyOfBuilder body(String str) {
            return (CopyOfBuilder) super.body(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder engagement(Engagement engagement) {
            return (CopyOfBuilder) super.engagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder mentioned(List<MentionedEntities> list) {
            return (CopyOfBuilder) super.mentioned(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder parentEngagementId(String str) {
            return (CopyOfBuilder) super.parentEngagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Comment.Builder, com.amplifyframework.datastore.generated.model.Comment.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface OwnerIdStep {
        BodyStep ownerId(String str);
    }

    public static OwnerIdStep builder() {
        return new Builder();
    }

    public static Comment justId(String str) {
        return new Comment(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.account, this.ownerId, this.mentioned, this.body, this.engagement, this.activity, this.parentEngagementId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Comment.class != obj.getClass()) {
            return false;
        }
        Comment comment = (Comment) obj;
        return s6c.m47909a(getId(), comment.getId()) && s6c.m47909a(getAccount(), comment.getAccount()) && s6c.m47909a(getOwnerId(), comment.getOwnerId()) && s6c.m47909a(getMentioned(), comment.getMentioned()) && s6c.m47909a(getBody(), comment.getBody()) && s6c.m47909a(getEngagement(), comment.getEngagement()) && s6c.m47909a(getActivity(), comment.getActivity()) && s6c.m47909a(getParentEngagementId(), comment.getParentEngagementId()) && s6c.m47909a(getCreatedAt(), comment.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), comment.getUpdatedAt());
    }

    public Account getAccount() {
        return this.account;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public String getBody() {
        return this.body;
    }

    public List<Comment> getChildEngagements() {
        return this.childEngagements;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Engagement getEngagement() {
        return this.engagement;
    }

    public String getId() {
        return this.id;
    }

    public List<MentionedEntities> getMentioned() {
        return this.mentioned;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getParentEngagementId() {
        return this.parentEngagementId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUserCommenting() {
        return this.userCommenting;
    }

    public int hashCode() {
        return (getId() + getAccount() + getOwnerId() + getMentioned() + getBody() + getEngagement() + getActivity() + getParentEngagementId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comment {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("mentioned=" + String.valueOf(getMentioned()) + ", ");
        sb.append("body=" + String.valueOf(getBody()) + ", ");
        sb.append("engagement=" + String.valueOf(getEngagement()) + ", ");
        sb.append("activity=" + String.valueOf(getActivity()) + ", ");
        sb.append("parentEngagementId=" + String.valueOf(getParentEngagementId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Comment(String str, Account account, String str2, List<MentionedEntities> list, String str3, Engagement engagement, Activity activity, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.userCommenting = null;
        this.childEngagements = null;
        this.id = str;
        this.account = account;
        this.ownerId = str2;
        this.mentioned = list;
        this.body = str3;
        this.engagement = engagement;
        this.activity = activity;
        this.parentEngagementId = str4;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
