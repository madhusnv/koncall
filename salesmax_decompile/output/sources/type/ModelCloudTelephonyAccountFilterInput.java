package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCloudTelephonyAccountFilterInput implements InputType {
    private final Input<ModelStringInput> accessToken;
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelCloudTelephonyAccountFilterInput>> and;
    private final Input<ModelStringInput> cloudTelephonyAccountSid;
    private final Input<ModelStringInput> cloudTelephonySubdomain;
    private final Input<ModelBooleanInput> createNewLead;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> displayNumber;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelBooleanInput> hasOutbound;
    private final Input<ModelIDInput> id;
    private final Input<ModelCloudTelephonyAccountFilterInput> not;
    private final Input<List<ModelCloudTelephonyAccountFilterInput>> or;
    private final Input<ModelStringInput> providerAccountId;
    private final Input<ModelStringInput> providerName;
    private final Input<ModelStringInput> telephonyNumber;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelCloudTelephonyAccountFilterInput>> and = Input.absent();
        private Input<List<ModelCloudTelephonyAccountFilterInput>> or = Input.absent();
        private Input<ModelCloudTelephonyAccountFilterInput> not = Input.absent();

        public Builder accessToken(ModelStringInput modelStringInput) {
            this.accessToken = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCloudTelephonyAccountFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCloudTelephonyAccountFilterInput build() {
            return new ModelCloudTelephonyAccountFilterInput(this.id, this.accountId, this.providerName, this.telephonyNumber, this.providerAccountId, this.displayNumber, this.hasOutbound, this.createNewLead, this.accessToken, this.cloudTelephonySubdomain, this.cloudTelephonyAccountSid, this.createdAt, this.updatedAt, this.entityListId, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCloudTelephonyAccountFilterInput modelCloudTelephonyAccountFilterInput) {
            this.not = Input.fromNullable(modelCloudTelephonyAccountFilterInput);
            return this;
        }

        public Builder or(List<ModelCloudTelephonyAccountFilterInput> list) {
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

    public ModelCloudTelephonyAccountFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelBooleanInput> input7, Input<ModelBooleanInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<List<ModelCloudTelephonyAccountFilterInput>> input17, Input<List<ModelCloudTelephonyAccountFilterInput>> input18, Input<ModelCloudTelephonyAccountFilterInput> input19) {
        this.id = input;
        this.accountId = input2;
        this.providerName = input3;
        this.telephonyNumber = input4;
        this.providerAccountId = input5;
        this.displayNumber = input6;
        this.hasOutbound = input7;
        this.createNewLead = input8;
        this.accessToken = input9;
        this.cloudTelephonySubdomain = input10;
        this.cloudTelephonyAccountSid = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.entityListId = input14;
        this.createdById = input15;
        this.updatedById = input16;
        this.and = input17;
        this.or = input18;
        this.not = input19;
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

    public List<ModelCloudTelephonyAccountFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudTelephonyAccountFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudTelephonyAccountFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCloudTelephonyAccountFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCloudTelephonyAccountFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.providerName.defined) {
                    inputFieldWriter.writeObject("providerName", ModelCloudTelephonyAccountFilterInput.this.providerName.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.providerName.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.telephonyNumber.defined) {
                    inputFieldWriter.writeObject("telephonyNumber", ModelCloudTelephonyAccountFilterInput.this.telephonyNumber.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.telephonyNumber.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.providerAccountId.defined) {
                    inputFieldWriter.writeObject("providerAccountId", ModelCloudTelephonyAccountFilterInput.this.providerAccountId.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.providerAccountId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.displayNumber.defined) {
                    inputFieldWriter.writeObject("displayNumber", ModelCloudTelephonyAccountFilterInput.this.displayNumber.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.displayNumber.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.hasOutbound.defined) {
                    inputFieldWriter.writeObject("hasOutbound", ModelCloudTelephonyAccountFilterInput.this.hasOutbound.value != 0 ? ((ModelBooleanInput) ModelCloudTelephonyAccountFilterInput.this.hasOutbound.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.createNewLead.defined) {
                    inputFieldWriter.writeObject("createNewLead", ModelCloudTelephonyAccountFilterInput.this.createNewLead.value != 0 ? ((ModelBooleanInput) ModelCloudTelephonyAccountFilterInput.this.createNewLead.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.accessToken.defined) {
                    inputFieldWriter.writeObject("accessToken", ModelCloudTelephonyAccountFilterInput.this.accessToken.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.accessToken.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.cloudTelephonySubdomain.defined) {
                    inputFieldWriter.writeObject("cloudTelephonySubdomain", ModelCloudTelephonyAccountFilterInput.this.cloudTelephonySubdomain.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.cloudTelephonySubdomain.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.cloudTelephonyAccountSid.defined) {
                    inputFieldWriter.writeObject("cloudTelephonyAccountSid", ModelCloudTelephonyAccountFilterInput.this.cloudTelephonyAccountSid.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.cloudTelephonyAccountSid.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCloudTelephonyAccountFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCloudTelephonyAccountFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyAccountFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelCloudTelephonyAccountFilterInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountFilterInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCloudTelephonyAccountFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelCloudTelephonyAccountFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyAccountFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCloudTelephonyAccountFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyAccountFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyAccountFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCloudTelephonyAccountFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyAccountFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyAccountFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyAccountFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyAccountFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCloudTelephonyAccountFilterInput.this.not.value != 0 ? ((ModelCloudTelephonyAccountFilterInput) ModelCloudTelephonyAccountFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCloudTelephonyAccountFilterInput not() {
        return this.not.value;
    }

    public List<ModelCloudTelephonyAccountFilterInput> or() {
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
