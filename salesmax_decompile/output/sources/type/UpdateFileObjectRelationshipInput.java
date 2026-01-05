package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateFileObjectRelationshipInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> businessId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> dealId;
    private final Input<String> engagementId;
    private final Input<String> fieldName;
    private final Input<String> fileId;
    private final Input<String> fileUrl;
    private final String id;
    private final Input<String> inputContext;
    private final Input<String> parentObjectId;
    private final Input<String> parentObjectType;
    private final Input<String> productId;
    private final Input<String> transcription;
    private final Input<String> translatedTranscription;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> fileId = Input.absent();
        private Input<String> fileUrl = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> businessId = Input.absent();
        private Input<String> dealId = Input.absent();
        private Input<String> productId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> parentObjectId = Input.absent();
        private Input<String> parentObjectType = Input.absent();
        private Input<String> fieldName = Input.absent();
        private Input<String> inputContext = Input.absent();
        private Input<String> transcription = Input.absent();
        private Input<String> translatedTranscription = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateFileObjectRelationshipInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateFileObjectRelationshipInput(this.id, this.accountId, this.fileId, this.fileUrl, this.contactId, this.engagementId, this.businessId, this.dealId, this.productId, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription);
        }

        public Builder businessId(String str) {
            this.businessId = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dealId(String str) {
            this.dealId = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder fieldName(String str) {
            this.fieldName = Input.fromNullable(str);
            return this;
        }

        public Builder fileId(String str) {
            this.fileId = Input.fromNullable(str);
            return this;
        }

        public Builder fileUrl(String str) {
            this.fileUrl = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder inputContext(String str) {
            this.inputContext = Input.fromNullable(str);
            return this;
        }

        public Builder parentObjectId(String str) {
            this.parentObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder parentObjectType(String str) {
            this.parentObjectType = Input.fromNullable(str);
            return this;
        }

        public Builder productId(String str) {
            this.productId = Input.fromNullable(str);
            return this;
        }

        public Builder transcription(String str) {
            this.transcription = Input.fromNullable(str);
            return this;
        }

        public Builder translatedTranscription(String str) {
            this.translatedTranscription = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateFileObjectRelationshipInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16) {
        this.id = str;
        this.accountId = input;
        this.fileId = input2;
        this.fileUrl = input3;
        this.contactId = input4;
        this.engagementId = input5;
        this.businessId = input6;
        this.dealId = input7;
        this.productId = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.parentObjectId = input11;
        this.parentObjectType = input12;
        this.fieldName = input13;
        this.inputContext = input14;
        this.transcription = input15;
        this.translatedTranscription = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String businessId() {
        return this.businessId.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dealId() {
        return this.dealId.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String fieldName() {
        return this.fieldName.value;
    }

    public String fileId() {
        return this.fileId.value;
    }

    public String fileUrl() {
        return this.fileUrl.value;
    }

    public String id() {
        return this.id;
    }

    public String inputContext() {
        return this.inputContext.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateFileObjectRelationshipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateFileObjectRelationshipInput.this.id);
                if (UpdateFileObjectRelationshipInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateFileObjectRelationshipInput.this.accountId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.fileId.defined) {
                    inputFieldWriter.writeString("fileId", (String) UpdateFileObjectRelationshipInput.this.fileId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.fileUrl.defined) {
                    inputFieldWriter.writeString("fileUrl", (String) UpdateFileObjectRelationshipInput.this.fileUrl.value);
                }
                if (UpdateFileObjectRelationshipInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateFileObjectRelationshipInput.this.contactId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdateFileObjectRelationshipInput.this.engagementId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.businessId.defined) {
                    inputFieldWriter.writeString("businessId", (String) UpdateFileObjectRelationshipInput.this.businessId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.dealId.defined) {
                    inputFieldWriter.writeString("dealId", (String) UpdateFileObjectRelationshipInput.this.dealId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.productId.defined) {
                    inputFieldWriter.writeString("productId", (String) UpdateFileObjectRelationshipInput.this.productId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateFileObjectRelationshipInput.this.createdAt.value);
                }
                if (UpdateFileObjectRelationshipInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateFileObjectRelationshipInput.this.updatedAt.value);
                }
                if (UpdateFileObjectRelationshipInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeString("parentObjectId", (String) UpdateFileObjectRelationshipInput.this.parentObjectId.value);
                }
                if (UpdateFileObjectRelationshipInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeString("parentObjectType", (String) UpdateFileObjectRelationshipInput.this.parentObjectType.value);
                }
                if (UpdateFileObjectRelationshipInput.this.fieldName.defined) {
                    inputFieldWriter.writeString("fieldName", (String) UpdateFileObjectRelationshipInput.this.fieldName.value);
                }
                if (UpdateFileObjectRelationshipInput.this.inputContext.defined) {
                    inputFieldWriter.writeString("inputContext", (String) UpdateFileObjectRelationshipInput.this.inputContext.value);
                }
                if (UpdateFileObjectRelationshipInput.this.transcription.defined) {
                    inputFieldWriter.writeString("transcription", (String) UpdateFileObjectRelationshipInput.this.transcription.value);
                }
                if (UpdateFileObjectRelationshipInput.this.translatedTranscription.defined) {
                    inputFieldWriter.writeString("translatedTranscription", (String) UpdateFileObjectRelationshipInput.this.translatedTranscription.value);
                }
            }
        };
    }

    public String parentObjectId() {
        return this.parentObjectId.value;
    }

    public String parentObjectType() {
        return this.parentObjectType.value;
    }

    public String productId() {
        return this.productId.value;
    }

    public String transcription() {
        return this.transcription.value;
    }

    public String translatedTranscription() {
        return this.translatedTranscription.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
