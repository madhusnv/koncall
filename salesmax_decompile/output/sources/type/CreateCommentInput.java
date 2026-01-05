package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateCommentInput implements InputType {
    private final String accountId;
    private final Input<String> activityId;
    private final String body;
    private final Input<String> createdAt;
    private final Input<String> engagementId;
    private final Input<String> id;
    private final Input<List<MentionedEntitiesInput>> mentioned;
    private final String ownerId;
    private final Input<String> parentEngagementId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String body;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<List<MentionedEntitiesInput>> mentioned = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> activityId = Input.absent();
        private Input<String> parentEngagementId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder activityId(String str) {
            this.activityId = Input.fromNullable(str);
            return this;
        }

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public CreateCommentInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.body, "body == null");
            return new CreateCommentInput(this.id, this.accountId, this.ownerId, this.mentioned, this.body, this.engagementId, this.activityId, this.parentEngagementId, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder mentioned(List<MentionedEntitiesInput> list) {
            this.mentioned = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        public Builder parentEngagementId(String str) {
            this.parentEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateCommentInput(Input<String> input, String str, String str2, Input<List<MentionedEntitiesInput>> input2, String str3, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = input;
        this.accountId = str;
        this.ownerId = str2;
        this.mentioned = input2;
        this.body = str3;
        this.engagementId = input3;
        this.activityId = input4;
        this.parentEngagementId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String activityId() {
        return this.activityId.value;
    }

    public String body() {
        return this.body;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCommentInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCommentInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCommentInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCommentInput.this.accountId);
                inputFieldWriter.writeString("ownerId", CreateCommentInput.this.ownerId);
                if (CreateCommentInput.this.mentioned.defined) {
                    inputFieldWriter.writeList("mentioned", CreateCommentInput.this.mentioned.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCommentInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCommentInput.this.mentioned.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MentionedEntitiesInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                inputFieldWriter.writeString("body", CreateCommentInput.this.body);
                if (CreateCommentInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) CreateCommentInput.this.engagementId.value);
                }
                if (CreateCommentInput.this.activityId.defined) {
                    inputFieldWriter.writeString("activityId", (String) CreateCommentInput.this.activityId.value);
                }
                if (CreateCommentInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeString("parentEngagementId", (String) CreateCommentInput.this.parentEngagementId.value);
                }
                if (CreateCommentInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCommentInput.this.createdAt.value);
                }
                if (CreateCommentInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCommentInput.this.updatedAt.value);
                }
            }
        };
    }

    public List<MentionedEntitiesInput> mentioned() {
        return this.mentioned.value;
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
