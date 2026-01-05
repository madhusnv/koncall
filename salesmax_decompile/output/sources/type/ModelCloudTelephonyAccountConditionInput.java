package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCloudTelephonyAccountConditionInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCloudTelephonyAccountConditionInput>> and;
    private final Input<ModelStringInput> cloudTelephonyAccountSid;
    private final Input<ModelStringInput> cloudTelephonySubdomain;
    private final Input<ModelBooleanInput> createNewLead;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> displayNumber;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelBooleanInput> hasOutbound;
    private final Input<ModelCloudTelephonyAccountConditionInput> not;
    private final Input<List<ModelCloudTelephonyAccountConditionInput>> or;
    private final Input<ModelStringInput> providerAccountId;
    private final Input<ModelStringInput> providerName;
    private final Input<ModelStringInput> telephonyNumber;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> providerName = Input.absent();
        private Input<ModelStringInput> telephonyNumber = Input.absent();
        private Input<ModelStringInput> providerAccountId = Input.absent();
        private Input<ModelStringInput> displayNumber = Input.absent();
        private Input<ModelBooleanInput> hasOutbound = Input.absent();
        private Input<ModelBooleanInput> createNewLead = Input.absent();
        private Input<ModelStringInput> accessToken = Input.absent();
        private Input<ModelStringInput> cloudTelephonySubdomain = Input.absent();
        private Input<ModelStringInput> cloudTelephonyAccountSid = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> entityListId = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelCloudTelephonyAccountConditionInput>> and = Input.absent();
        private Input<List<ModelCloudTelephonyAccountConditionInput>> or = Input.absent();
        private Input<ModelCloudTelephonyAccountConditionInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCloudTelephonyAccountConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCloudTelephonyAccountConditionInput build() {
            return new ModelCloudTelephonyAccountConditionInput(this.accountId, this.providerName, this.telephonyNumber, this.providerAccountId, this.displayNumber, this.hasOutbound, this.createNewLead, this.accessToken, this.cloudTelephonySubdomain, this.cloudTelephonyAccountSid, this.createdAt, this.updatedAt, this.entityListId, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder cloudTelephonyAccountSid(ModelStringInput modelStringInput) {
            this.cloudTelephonyAccountSid = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder cloudTelephonySubdomain(ModelStringInput modelStringInput) {
            this.cloudTelephonySubdomain = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createNewLead(ModelBooleanInput modelBooleanInput) {
            this.createNewLead = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder displayNumber(ModelStringInput modelStringInput) {
            this.displayNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder entityListId(ModelIDInput modelIDInput) {
            this.entityListId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder hasOutbound(ModelBooleanInput modelBooleanInput) {
            this.hasOutbound = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelCloudTelephonyAccountConditionInput modelCloudTelephonyAccountConditionInput) {
            this.not = Input.fromNullable(modelCloudTelephonyAccountConditionInput);
            return this;
        }

        public Builder or(List<ModelCloudTelephonyAccountConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder providerAccountId(ModelStringInput modelStringInput) {
            this.providerAccountId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder providerName(ModelStringInput modelStringInput) {
            this.providerName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder telephonyNumber(ModelStringInput modelStringInput) {
            this.telephonyNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelCloudTelephonyAccountConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelBooleanInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<List<ModelCloudTelephonyAccountConditionInput>> input16, Input<List<ModelCloudTelephonyAccountConditionInput>> input17, Input<ModelCloudTelephonyAccountConditionInput> input18) {
        this.accountId = input;
        this.providerName = input2;
        this.telephonyNumber = input3;
        this.providerAccountId = input4;
        this.displayNumber = input5;
        this.hasOutbound = input6;
        this.createNewLead = input7;
        this.accessToken = input8;
        this.cloudTelephonySubdomain = input9;
        this.cloudTelephonyAccountSid = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.entityListId = input13;
        this.createdById = input14;
        this.updatedById = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput accessToken() {
        return this.accessToken.value;
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelCloudTelephonyAccountConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput cloudTelephonyAccountSid() {
        return this.cloudTelephonyAccountSid.value;
    }

    public ModelStringInput cloudTelephonySubdomain() {
        return this.cloudTelephonySubdomain.value;
    }

    public ModelBooleanInput createNewLead() {
        return this.createNewLead.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput displayNumber() {
        return this.displayNumber.value;
    }

    public ModelIDInput entityListId() {
        return this.entityListId.value;
    }

    public ModelBooleanInput hasOutbound() {
        return this.hasOutbound.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudTelephonyAccountConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudTelephonyAccountConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCloudTelephonyAccountConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.providerName.defined) {
                    inputFieldWriter.writeObject("providerName", ModelCloudTelephonyAccountConditionInput.this.providerName.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.providerName.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.telephonyNumber.defined) {
                    inputFieldWriter.writeObject("telephonyNumber", ModelCloudTelephonyAccountConditionInput.this.telephonyNumber.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.telephonyNumber.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.providerAccountId.defined) {
                    inputFieldWriter.writeObject("providerAccountId", ModelCloudTelephonyAccountConditionInput.this.providerAccountId.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.providerAccountId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.displayNumber.defined) {
                    inputFieldWriter.writeObject("displayNumber", ModelCloudTelephonyAccountConditionInput.this.displayNumber.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.displayNumber.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.hasOutbound.defined) {
                    inputFieldWriter.writeObject("hasOutbound", ModelCloudTelephonyAccountConditionInput.this.hasOutbound.value != 0 ? ((ModelBooleanInput) ModelCloudTelephonyAccountConditionInput.this.hasOutbound.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.createNewLead.defined) {
                    inputFieldWriter.writeObject("createNewLead", ModelCloudTelephonyAccountConditionInput.this.createNewLead.value != 0 ? ((ModelBooleanInput) ModelCloudTelephonyAccountConditionInput.this.createNewLead.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelCloudTelephonyAccountConditionInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.cloudTelephonySubdomain.defined) {
                    inputFieldWriter.writeObject("cloudTelephonySubdomain", ModelCloudTelephonyAccountConditionInput.this.cloudTelephonySubdomain.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.cloudTelephonySubdomain.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.cloudTelephonyAccountSid.defined) {
                    inputFieldWriter.writeObject("cloudTelephonyAccountSid", ModelCloudTelephonyAccountConditionInput.this.cloudTelephonyAccountSid.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.cloudTelephonyAccountSid.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCloudTelephonyAccountConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCloudTelephonyAccountConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelCloudTelephonyAccountConditionInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountConditionInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCloudTelephonyAccountConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelCloudTelephonyAccountConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCloudTelephonyAccountConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyAccountConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyAccountConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCloudTelephonyAccountConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyAccountConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyAccountConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyAccountConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyAccountConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCloudTelephonyAccountConditionInput.this.not.value != 0 ? ((ModelCloudTelephonyAccountConditionInput) ModelCloudTelephonyAccountConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCloudTelephonyAccountConditionInput not() {
        return this.not.value;
    }

    public List<ModelCloudTelephonyAccountConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput providerAccountId() {
        return this.providerAccountId.value;
    }

    public ModelStringInput providerName() {
        return this.providerName.value;
    }

    public ModelStringInput telephonyNumber() {
        return this.telephonyNumber.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }
}
