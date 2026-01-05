package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateMentionUserMembershipInput implements InputType {
    private final String accountId;
    private final String commentId;
    private final String commentedById;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final Input<Announcement> isAnnouncement;
    private final Input<String> mentionedUserId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String commentId;
        private String commentedById;
        private Input<String> id = Input.absent();
        private Input<String> mentionedUserId = Input.absent();
        private Input<Announcement> isAnnouncement = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateMentionUserMembershipInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.commentId, "commentId == null");
            Utils.checkNotNull(this.commentedById, "commentedById == null");
            return new CreateMentionUserMembershipInput(this.id, this.accountId, this.commentId, this.mentionedUserId, this.isAnnouncement, this.commentedById, this.createdAt, this.updatedAt);
        }

        public Builder commentId(String str) {
            this.commentId = str;
            return this;
        }

        public Builder commentedById(String str) {
            this.commentedById = str;
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder isAnnouncement(Announcement announcement) {
            this.isAnnouncement = Input.fromNullable(announcement);
            return this;
        }

        public Builder mentionedUserId(String str) {
            this.mentionedUserId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateMentionUserMembershipInput(Input<String> input, String str, String str2, Input<String> input2, Input<Announcement> input3, String str3, Input<String> input4, Input<String> input5) {
        this.id = input;
        this.accountId = str;
        this.commentId = str2;
        this.mentionedUserId = input2;
        this.isAnnouncement = input3;
        this.commentedById = str3;
        this.createdAt = input4;
        this.updatedAt = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String commentId() {
        return this.commentId;
    }

    public String commentedById() {
        return this.commentedById;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    public Announcement isAnnouncement() {
        return this.isAnnouncement.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateMentionUserMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateMentionUserMembershipInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateMentionUserMembershipInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateMentionUserMembershipInput.this.accountId);
                inputFieldWriter.writeString("commentId", CreateMentionUserMembershipInput.this.commentId);
                if (CreateMentionUserMembershipInput.this.mentionedUserId.defined) {
                    inputFieldWriter.writeString("mentionedUserId", (String) CreateMentionUserMembershipInput.this.mentionedUserId.value);
                }
                if (CreateMentionUserMembershipInput.this.isAnnouncement.defined) {
                    inputFieldWriter.writeString("isAnnouncement", CreateMentionUserMembershipInput.this.isAnnouncement.value != 0 ? ((Announcement) CreateMentionUserMembershipInput.this.isAnnouncement.value).name() : null);
                }
                inputFieldWriter.writeString("commentedById", CreateMentionUserMembershipInput.this.commentedById);
                if (CreateMentionUserMembershipInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateMentionUserMembershipInput.this.createdAt.value);
                }
                if (CreateMentionUserMembershipInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateMentionUserMembershipInput.this.updatedAt.value);
                }
            }
        };
    }

    public String mentionedUserId() {
        return this.mentionedUserId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
