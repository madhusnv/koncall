package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateActivityInput implements InputType {
    private final String accountId;
    private final ActivityCategory activityCategory;
    private final Input<String> activityDoneByUserId;
    private final String activityRelatedObjectId;
    private final ActivityRelatedObjectType activityRelatedObjectType;
    private final ActivityType activityType;
    private final Input<String> body;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final Input<String> note;
    private final String ownerId;
    private final Input<String> primaryTeamId;
    private final Input<String> threadId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private ActivityCategory activityCategory;
        private String activityRelatedObjectId;
        private ActivityRelatedObjectType activityRelatedObjectType;
        private ActivityType activityType;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<String> threadId = Input.absent();
        private Input<String> body = Input.absent();
        private Input<String> note = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> activityDoneByUserId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder activityCategory(ActivityCategory activityCategory) {
            this.activityCategory = activityCategory;
            return this;
        }

        public Builder activityDoneByUserId(String str) {
            this.activityDoneByUserId = Input.fromNullable(str);
            return this;
        }

        public Builder activityRelatedObjectId(String str) {
            this.activityRelatedObjectId = str;
            return this;
        }

        public Builder activityRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            this.activityRelatedObjectType = activityRelatedObjectType;
            return this;
        }

        public Builder activityType(ActivityType activityType) {
            this.activityType = activityType;
            return this;
        }

        public Builder body(String str) {
            this.body = Input.fromNullable(str);
            return this;
        }

        public CreateActivityInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.activityRelatedObjectType, "activityRelatedObjectType == null");
            Utils.checkNotNull(this.activityRelatedObjectId, "activityRelatedObjectId == null");
            Utils.checkNotNull(this.activityCategory, "activityCategory == null");
            Utils.checkNotNull(this.activityType, "activityType == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            return new CreateActivityInput(this.id, this.threadId, this.accountId, this.activityRelatedObjectType, this.activityRelatedObjectId, this.activityCategory, this.activityType, this.body, this.note, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
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

        public Builder note(String str) {
            this.note = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder threadId(String str) {
            this.threadId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateActivityInput(Input<String> input, Input<String> input2, String str, ActivityRelatedObjectType activityRelatedObjectType, String str2, ActivityCategory activityCategory, ActivityType activityType, Input<String> input3, Input<String> input4, String str3, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = input;
        this.threadId = input2;
        this.accountId = str;
        this.activityRelatedObjectType = activityRelatedObjectType;
        this.activityRelatedObjectId = str2;
        this.activityCategory = activityCategory;
        this.activityType = activityType;
        this.body = input3;
        this.note = input4;
        this.ownerId = str3;
        this.primaryTeamId = input5;
        this.contactId = input6;
        this.activityDoneByUserId = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public ActivityCategory activityCategory() {
        return this.activityCategory;
    }

    public String activityDoneByUserId() {
        return this.activityDoneByUserId.value;
    }

    public String activityRelatedObjectId() {
        return this.activityRelatedObjectId;
    }

    public ActivityRelatedObjectType activityRelatedObjectType() {
        return this.activityRelatedObjectType;
    }

    public ActivityType activityType() {
        return this.activityType;
    }

    public String body() {
        return this.body.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateActivityInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateActivityInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateActivityInput.this.id.value);
                }
                if (CreateActivityInput.this.threadId.defined) {
                    inputFieldWriter.writeString("threadId", (String) CreateActivityInput.this.threadId.value);
                }
                inputFieldWriter.writeString("accountId", CreateActivityInput.this.accountId);
                inputFieldWriter.writeString("activityRelatedObjectType", CreateActivityInput.this.activityRelatedObjectType.name());
                inputFieldWriter.writeString("activityRelatedObjectId", CreateActivityInput.this.activityRelatedObjectId);
                inputFieldWriter.writeString("activityCategory", CreateActivityInput.this.activityCategory.name());
                inputFieldWriter.writeString("activityType", CreateActivityInput.this.activityType.name());
                if (CreateActivityInput.this.body.defined) {
                    inputFieldWriter.writeString("body", (String) CreateActivityInput.this.body.value);
                }
                if (CreateActivityInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) CreateActivityInput.this.note.value);
                }
                inputFieldWriter.writeString("ownerId", CreateActivityInput.this.ownerId);
                if (CreateActivityInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateActivityInput.this.primaryTeamId.value);
                }
                if (CreateActivityInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateActivityInput.this.contactId.value);
                }
                if (CreateActivityInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeString("activityDoneByUserId", (String) CreateActivityInput.this.activityDoneByUserId.value);
                }
                if (CreateActivityInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateActivityInput.this.createdAt.value);
                }
                if (CreateActivityInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateActivityInput.this.updatedAt.value);
                }
            }
        };
    }

    public String note() {
        return this.note.value;
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public String threadId() {
        return this.threadId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
