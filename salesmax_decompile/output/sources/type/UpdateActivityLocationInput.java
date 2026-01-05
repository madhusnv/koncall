package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateActivityLocationInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> engagementId;
    private final String id;
    private final Input<String> lat;
    private final Input<String> lng;
    private final Input<String> ownerId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> lat = Input.absent();
        private Input<String> lng = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateActivityLocationInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateActivityLocationInput(this.id, this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt);
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
            this.id = str;
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
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateActivityLocationInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.accountId = input;
        this.engagementId = input2;
        this.lat = input3;
        this.lng = input4;
        this.ownerId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String id() {
        return this.id;
    }

    public String lat() {
        return this.lat.value;
    }

    public String lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateActivityLocationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateActivityLocationInput.this.id);
                if (UpdateActivityLocationInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateActivityLocationInput.this.accountId.value);
                }
                if (UpdateActivityLocationInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdateActivityLocationInput.this.engagementId.value);
                }
                if (UpdateActivityLocationInput.this.lat.defined) {
                    inputFieldWriter.writeString("lat", (String) UpdateActivityLocationInput.this.lat.value);
                }
                if (UpdateActivityLocationInput.this.lng.defined) {
                    inputFieldWriter.writeString("lng", (String) UpdateActivityLocationInput.this.lng.value);
                }
                if (UpdateActivityLocationInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateActivityLocationInput.this.ownerId.value);
                }
                if (UpdateActivityLocationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateActivityLocationInput.this.createdAt.value);
                }
                if (UpdateActivityLocationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateActivityLocationInput.this.updatedAt.value);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
