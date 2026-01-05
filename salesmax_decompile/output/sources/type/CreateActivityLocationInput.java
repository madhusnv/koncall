package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateActivityLocationInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> engagementId;
    private final Input<String> id;
    private final Input<String> lat;
    private final Input<String> lng;
    private final String ownerId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> lat = Input.absent();
        private Input<String> lng = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateActivityLocationInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            return new CreateActivityLocationInput(this.id, this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt);
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

        public Builder lat(String str) {
            this.lat = Input.fromNullable(str);
            return this;
        }

        public Builder lng(String str) {
            this.lng = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateActivityLocationInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, String str2, Input<String> input5, Input<String> input6) {
        this.id = input;
        this.accountId = str;
        this.engagementId = input2;
        this.lat = input3;
        this.lng = input4;
        this.ownerId = str2;
        this.createdAt = input5;
        this.updatedAt = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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

    public String lat() {
        return this.lat.value;
    }

    public String lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateActivityLocationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateActivityLocationInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateActivityLocationInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateActivityLocationInput.this.accountId);
                if (CreateActivityLocationInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) CreateActivityLocationInput.this.engagementId.value);
                }
                if (CreateActivityLocationInput.this.lat.defined) {
                    inputFieldWriter.writeString("lat", (String) CreateActivityLocationInput.this.lat.value);
                }
                if (CreateActivityLocationInput.this.lng.defined) {
                    inputFieldWriter.writeString("lng", (String) CreateActivityLocationInput.this.lng.value);
                }
                inputFieldWriter.writeString("ownerId", CreateActivityLocationInput.this.ownerId);
                if (CreateActivityLocationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateActivityLocationInput.this.createdAt.value);
                }
                if (CreateActivityLocationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateActivityLocationInput.this.updatedAt.value);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
