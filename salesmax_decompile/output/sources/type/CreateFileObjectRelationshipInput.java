package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateFileObjectRelationshipInput implements InputType {
    private final String accountId;
    private final Input<String> businessId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> dealId;
    private final Input<String> engagementId;
    private final Input<String> fieldName;
    private final String fileId;
    private final Input<String> fileUrl;
    private final Input<String> id;
    private final Input<String> inputContext;
    private final Input<String> parentObjectId;
    private final Input<String> parentObjectType;
    private final Input<String> productId;
    private final Input<String> transcription;
    private final Input<String> translatedTranscription;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String fileId;
        private Input<String> id = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public CreateFileObjectRelationshipInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.fileId, "fileId == null");
            return new CreateFileObjectRelationshipInput(this.id, this.accountId, this.fileId, this.fileUrl, this.contactId, this.engagementId, this.businessId, this.dealId, this.productId, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription);
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
            this.fileId = str;
            return this;
        }

        public Builder fileUrl(String str) {
            this.fileUrl = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
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

    public CreateFileObjectRelationshipInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15) {
        this.id = input;
        this.accountId = str;
        this.fileId = str2;
        this.fileUrl = input2;
        this.contactId = input3;
        this.engagementId = input4;
        this.businessId = input5;
        this.dealId = input6;
        this.productId = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.parentObjectId = input10;
        this.parentObjectType = input11;
        this.fieldName = input12;
        this.inputContext = input13;
        this.transcription = input14;
        this.translatedTranscription = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.fileId;
    }

    public String fileUrl() {
        return this.fileUrl.value;
    }

    public String id() {
        return this.id.value;
    }

    public String inputContext() {
        return this.inputContext.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateFileObjectRelationshipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateFileObjectRelationshipInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateFileObjectRelationshipInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateFileObjectRelationshipInput.this.accountId);
                inputFieldWriter.writeString("fileId", CreateFileObjectRelationshipInput.this.fileId);
                if (CreateFileObjectRelationshipInput.this.fileUrl.defined) {
                    inputFieldWriter.writeString("fileUrl", (String) CreateFileObjectRelationshipInput.this.fileUrl.value);
                }
                if (CreateFileObjectRelationshipInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateFileObjectRelationshipInput.this.contactId.value);
                }
                if (CreateFileObjectRelationshipInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) CreateFileObjectRelationshipInput.this.engagementId.value);
                }
                if (CreateFileObjectRelationshipInput.this.businessId.defined) {
                    inputFieldWriter.writeString("businessId", (String) CreateFileObjectRelationshipInput.this.businessId.value);
                }
                if (CreateFileObjectRelationshipInput.this.dealId.defined) {
                    inputFieldWriter.writeString("dealId", (String) CreateFileObjectRelationshipInput.this.dealId.value);
                }
                if (CreateFileObjectRelationshipInput.this.productId.defined) {
                    inputFieldWriter.writeString("productId", (String) CreateFileObjectRelationshipInput.this.productId.value);
                }
                if (CreateFileObjectRelationshipInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateFileObjectRelationshipInput.this.createdAt.value);
                }
                if (CreateFileObjectRelationshipInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateFileObjectRelationshipInput.this.updatedAt.value);
                }
                if (CreateFileObjectRelationshipInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeString("parentObjectId", (String) CreateFileObjectRelationshipInput.this.parentObjectId.value);
                }
                if (CreateFileObjectRelationshipInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeString("parentObjectType", (String) CreateFileObjectRelationshipInput.this.parentObjectType.value);
                }
                if (CreateFileObjectRelationshipInput.this.fieldName.defined) {
                    inputFieldWriter.writeString("fieldName", (String) CreateFileObjectRelationshipInput.this.fieldName.value);
                }
                if (CreateFileObjectRelationshipInput.this.inputContext.defined) {
                    inputFieldWriter.writeString("inputContext", (String) CreateFileObjectRelationshipInput.this.inputContext.value);
                }
                if (CreateFileObjectRelationshipInput.this.transcription.defined) {
                    inputFieldWriter.writeString("transcription", (String) CreateFileObjectRelationshipInput.this.transcription.value);
                }
                if (CreateFileObjectRelationshipInput.this.translatedTranscription.defined) {
                    inputFieldWriter.writeString("translatedTranscription", (String) CreateFileObjectRelationshipInput.this.translatedTranscription.value);
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
