package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateAccountUpdatesInput implements InputType {
    private final String accountId;
    private final ActionType actionType;
    private final Input<String> createdAt;
    private final String entityId;
    private final EntityType entityType;
    private final Input<String> id;
    private final Input<String> updatedAt;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private ActionType actionType;
        private String entityId;
        private EntityType entityType;
        private String userId;
        private Input<String> id = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        public CreateAccountUpdatesInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            Utils.checkNotNull(this.entityType, "entityType == null");
            Utils.checkNotNull(this.entityId, "entityId == null");
            Utils.checkNotNull(this.actionType, "actionType == null");
            return new CreateAccountUpdatesInput(this.id, this.accountId, this.userId, this.entityType, this.entityId, this.actionType, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder entityId(String str) {
            this.entityId = str;
            return this;
        }

        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public CreateAccountUpdatesInput(Input<String> input, String str, String str2, EntityType entityType, String str3, ActionType actionType, Input<String> input2, Input<String> input3) {
        this.id = input;
        this.accountId = str;
        this.userId = str2;
        this.entityType = entityType;
        this.entityId = str3;
        this.actionType = actionType;
        this.createdAt = input2;
        this.updatedAt = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public ActionType actionType() {
        return this.actionType;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String entityId() {
        return this.entityId;
    }

    public EntityType entityType() {
        return this.entityType;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateAccountUpdatesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateAccountUpdatesInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateAccountUpdatesInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateAccountUpdatesInput.this.accountId);
                inputFieldWriter.writeString("userId", CreateAccountUpdatesInput.this.userId);
                inputFieldWriter.writeString("entityType", CreateAccountUpdatesInput.this.entityType.name());
                inputFieldWriter.writeString("entityId", CreateAccountUpdatesInput.this.entityId);
                inputFieldWriter.writeString("actionType", CreateAccountUpdatesInput.this.actionType.name());
                if (CreateAccountUpdatesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateAccountUpdatesInput.this.createdAt.value);
                }
                if (CreateAccountUpdatesInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateAccountUpdatesInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userId() {
        return this.userId;
    }
}
