package ai.salesmax.model;

import ai.salesmax.model.CommentSummary;
import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.Activity;
import com.amplifyframework.datastore.generated.model.ActivityType;
import com.amplifyframework.datastore.generated.model.Comment;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.EngagementType;
import com.amplifyframework.datastore.generated.model.MentionedEntities;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.http.cookie.ClientCookie;
import p001o.ch3;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class CommentSummary {
    private Comment comment;
    private long createdAt;
    private boolean isNewComment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Comment newInstance() {
            Comment commentBuild = Comment.builder().ownerId("").body("").id("").account(Account.justId("")).build();
            sq8.m48648g(commentBuild, "build(...)");
            return commentBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_commenter_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MentionedEntity _get_mentionedEntities_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (MentionedEntity) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MentionedEntities _set_mentionedEntities_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (MentionedEntities) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long createdAt$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getActivityId() {
        Activity activity = this.comment.getActivity();
        if (activity != null) {
            return activity.getId();
        }
        return null;
    }

    public final String getActivityTitle() {
        ActivityType activityType;
        Activity activity = this.comment.getActivity();
        if (activity == null || (activityType = activity.getActivityType()) == null) {
            return null;
        }
        return activityType.name();
    }

    public final Comment getComment() {
        return this.comment;
    }

    public final LeadsUser getCommenter() {
        Optional optionalOfNullable = Optional.ofNullable(this.comment.getUserCommenting());
        final CommentSummary$commenter$1 commentSummary$commenter$1 = CommentSummary$commenter$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.fj3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CommentSummary._get_commenter_$lambda$1(commentSummary$commenter$1, obj);
            }
        }).orElse(lpi.a0(this.comment.getOwnerId()));
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getEngagementId() {
        Engagement engagement = this.comment.getEngagement();
        if (engagement != null) {
            return engagement.getId();
        }
        return null;
    }

    public final String getEngagementTitle() {
        Engagement engagement = this.comment.getEngagement();
        if (engagement != null) {
            return engagement.getTaskHeading();
        }
        return null;
    }

    public final String getEngagementType() {
        EngagementType engagementType;
        Engagement engagement = this.comment.getEngagement();
        if (engagement == null || (engagementType = engagement.getEngagementType()) == null) {
            return null;
        }
        return engagementType.name();
    }

    public final List<MentionedEntity> getMentionedEntities() {
        Stream stream = ((List) Optional.ofNullable(this.comment.getMentioned()).orElse(ch3.m21246k())).stream();
        final CommentSummary$mentionedEntities$1 commentSummary$mentionedEntities$1 = CommentSummary$mentionedEntities$1.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: o.ej3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CommentSummary._get_mentionedEntities_$lambda$2(commentSummary$mentionedEntities$1, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final String getOwnerId() {
        String ownerId = this.comment.getOwnerId();
        sq8.m48648g(ownerId, "getOwnerId(...)");
        return ownerId;
    }

    public final String getText() {
        String body = this.comment.getBody();
        sq8.m48648g(body, "getBody(...)");
        return body;
    }

    public final boolean isNewComment() {
        return this.isNewComment;
    }

    public final void setActivityId(String str) {
        Comment commentBuild = this.comment.copyOfBuilder().activity(Activity.justId(str)).build();
        sq8.m48648g(commentBuild, "build(...)");
        this.comment = commentBuild;
    }

    public final void setComment(Comment comment) {
        sq8.m48649h(comment, "<set-?>");
        this.comment = comment;
    }

    public final void setCommenter(LeadsUser leadsUser) {
        Comment commentBuild;
        if (leadsUser != null) {
            commentBuild = this.comment.copyOfBuilder().ownerId(leadsUser.getId()).build();
            sq8.m48648g(commentBuild, "build(...)");
        } else {
            commentBuild = this.comment;
        }
        this.comment = commentBuild;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setEngagementId(String str) {
        Comment commentBuild = this.comment.copyOfBuilder().engagement(Engagement.justId(str)).build();
        sq8.m48648g(commentBuild, "build(...)");
        this.comment = commentBuild;
    }

    public final void setEngagementType(String str) {
        Comment commentBuild = this.comment.copyOfBuilder().engagement(Engagement.justId(str)).build();
        sq8.m48648g(commentBuild, "build(...)");
        this.comment = commentBuild;
    }

    public final void setMentionedEntities(List<MentionedEntity> list) {
        sq8.m48649h(list, "value");
        Stream<MentionedEntity> stream = list.stream();
        final CommentSummary$mentionedEntities$mentionedEntities$1 commentSummary$mentionedEntities$mentionedEntities$1 = CommentSummary$mentionedEntities$mentionedEntities$1.INSTANCE;
        Comment commentBuild = this.comment.copyOfBuilder().mentioned((List<MentionedEntities>) stream.map(new Function() { // from class: o.dj3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CommentSummary._set_mentionedEntities_$lambda$3(commentSummary$mentionedEntities$mentionedEntities$1, obj);
            }
        }).collect(Collectors.toList())).build();
        sq8.m48648g(commentBuild, "build(...)");
        this.comment = commentBuild;
    }

    public final void setNewComment(boolean z) {
        this.isNewComment = z;
    }

    public final void setOwnerId(String str) {
        sq8.m48649h(str, "value");
        Comment commentBuild = this.comment.copyOfBuilder().ownerId(str).build();
        sq8.m48648g(commentBuild, "build(...)");
        this.comment = commentBuild;
    }

    public final void setText(String str) {
        sq8.m48649h(str, "value");
        Comment commentBuild = this.comment.copyOfBuilder().body(str).build();
        sq8.m48648g(commentBuild, "build(...)");
        this.comment = commentBuild;
        commentBuild.getActivity();
    }

    public static final class MentionedEntity implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MentionedEntity> CREATOR = new Creator();
        private final String entityID;
        private final String entityType;

        public static final class Creator implements Parcelable.Creator<MentionedEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MentionedEntity createFromParcel(Parcel parcel) {
                sq8.m48649h(parcel, "parcel");
                return new MentionedEntity(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MentionedEntity[] newArray(int i) {
                return new MentionedEntity[i];
            }
        }

        public MentionedEntity(String str, String str2) {
            sq8.m48649h(str, "entityID");
            sq8.m48649h(str2, "entityType");
            this.entityID = str;
            this.entityType = str2;
        }

        public static /* synthetic */ MentionedEntity copy$default(MentionedEntity mentionedEntity, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mentionedEntity.entityID;
            }
            if ((i & 2) != 0) {
                str2 = mentionedEntity.entityType;
            }
            return mentionedEntity.copy(str, str2);
        }

        public final String component1() {
            return this.entityID;
        }

        public final String component2() {
            return this.entityType;
        }

        public final MentionedEntity copy(String str, String str2) {
            sq8.m48649h(str, "entityID");
            sq8.m48649h(str2, "entityType");
            return new MentionedEntity(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MentionedEntity)) {
                return false;
            }
            MentionedEntity mentionedEntity = (MentionedEntity) obj;
            return sq8.m48644c(this.entityID, mentionedEntity.entityID) && sq8.m48644c(this.entityType, mentionedEntity.entityType);
        }

        public final String getEntityID() {
            return this.entityID;
        }

        public final String getEntityType() {
            return this.entityType;
        }

        public int hashCode() {
            return (this.entityID.hashCode() * 31) + this.entityType.hashCode();
        }

        public String toString() {
            return "MentionedEntity(entityID=" + this.entityID + ", entityType=" + this.entityType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            sq8.m48649h(parcel, "out");
            parcel.writeString(this.entityID);
            parcel.writeString(this.entityType);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MentionedEntity(MentionedEntities mentionedEntities) {
            sq8.m48649h(mentionedEntities, "mentionedEntities");
            String entityId = mentionedEntities.getEntityId();
            sq8.m48648g(entityId, "getEntityId(...)");
            this(entityId, mentionedEntities.getEntityType().name());
        }
    }

    public CommentSummary(Comment comment) {
        sq8.m48649h(comment, ClientCookie.COMMENT_ATTR);
        this.comment = comment;
        Optional optionalOfNullable = Optional.ofNullable(comment.getCreatedAt());
        final CommentSummary$createdAt$1 commentSummary$createdAt$1 = CommentSummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.cj3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CommentSummary.createdAt$lambda$0(commentSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        this.createdAt = ((Number) objOrElse).longValue();
    }

    public /* synthetic */ CommentSummary(Comment comment, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : comment);
    }
}
