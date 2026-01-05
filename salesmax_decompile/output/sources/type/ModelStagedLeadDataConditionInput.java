package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelStagedLeadDataConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelStagedLeadDataConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelIDInput> entityListId;
    private final Input<ModelStringInput> leadCreatedAt;
    private final Input<ModelStringInput> logId;
    private final Input<ModelStringInput> mailFrom;
    private final Input<ModelStringInput> mailSubject;
    private final Input<ModelStringInput> mailTo;
    private final Input<ModelStringInput> messageDate;
    private final Input<ModelStringInput> messageId;
    private final Input<ModelStringInput> messageType;
    private final Input<ModelStringInput> network;
    private final Input<ModelStagedLeadDataConditionInput> not;
    private final Input<List<ModelStagedLeadDataConditionInput>> or;
    private final Input<ModelStringInput> snippet;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> viewedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> network = Input.absent();
        private Input<ModelStringInput> messageType = Input.absent();
        private Input<ModelStringInput> logId = Input.absent();
        private Input<ModelStringInput> messageId = Input.absent();
        private Input<ModelStringInput> mailFrom = Input.absent();
        private Input<ModelStringInput> mailTo = Input.absent();
        private Input<ModelStringInput> mailSubject = Input.absent();
        private Input<ModelStringInput> snippet = Input.absent();
        private Input<ModelStringInput> messageDate = Input.absent();
        private Input<ModelStringInput> viewedAt = Input.absent();
        private Input<ModelStringInput> leadCreatedAt = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelIDInput> entityListId = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelStagedLeadDataConditionInput>> and = Input.absent();
        private Input<List<ModelStagedLeadDataConditionInput>> or = Input.absent();
        private Input<ModelStagedLeadDataConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelStagedLeadDataConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelStagedLeadDataConditionInput build() {
            return new ModelStagedLeadDataConditionInput(this.accountId, this.network, this.messageType, this.logId, this.messageId, this.mailFrom, this.mailTo, this.mailSubject, this.snippet, this.messageDate, this.viewedAt, this.leadCreatedAt, this.contactId, this.tags, this.entityListId, this.createdById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
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

        public Builder entityListId(ModelIDInput modelIDInput) {
            this.entityListId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder leadCreatedAt(ModelStringInput modelStringInput) {
            this.leadCreatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder logId(ModelStringInput modelStringInput) {
            this.logId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mailFrom(ModelStringInput modelStringInput) {
            this.mailFrom = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mailSubject(ModelStringInput modelStringInput) {
            this.mailSubject = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mailTo(ModelStringInput modelStringInput) {
            this.mailTo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageDate(ModelStringInput modelStringInput) {
            this.messageDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageId(ModelStringInput modelStringInput) {
            this.messageId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageType(ModelStringInput modelStringInput) {
            this.messageType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder network(ModelStringInput modelStringInput) {
            this.network = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelStagedLeadDataConditionInput modelStagedLeadDataConditionInput) {
            this.not = Input.fromNullable(modelStagedLeadDataConditionInput);
            return this;
        }

        public Builder or(List<ModelStagedLeadDataConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder snippet(ModelStringInput modelStringInput) {
            this.snippet = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder viewedAt(ModelStringInput modelStringInput) {
            this.viewedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelStagedLeadDataConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelStringInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<List<ModelStagedLeadDataConditionInput>> input19, Input<List<ModelStagedLeadDataConditionInput>> input20, Input<ModelStagedLeadDataConditionInput> input21) {
        this.accountId = input;
        this.network = input2;
        this.messageType = input3;
        this.logId = input4;
        this.messageId = input5;
        this.mailFrom = input6;
        this.mailTo = input7;
        this.mailSubject = input8;
        this.snippet = input9;
        this.messageDate = input10;
        this.viewedAt = input11;
        this.leadCreatedAt = input12;
        this.contactId = input13;
        this.tags = input14;
        this.entityListId = input15;
        this.createdById = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.and = input19;
        this.or = input20;
        this.not = input21;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelStagedLeadDataConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelIDInput entityListId() {
        return this.entityListId.value;
    }

    public ModelStringInput leadCreatedAt() {
        return this.leadCreatedAt.value;
    }

    public ModelStringInput logId() {
        return this.logId.value;
    }

    public ModelStringInput mailFrom() {
        return this.mailFrom.value;
    }

    public ModelStringInput mailSubject() {
        return this.mailSubject.value;
    }

    public ModelStringInput mailTo() {
        return this.mailTo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelStagedLeadDataConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelStagedLeadDataConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelStagedLeadDataConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelStagedLeadDataConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.network.defined) {
                    inputFieldWriter.writeObject("network", ModelStagedLeadDataConditionInput.this.network.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.network.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", ModelStagedLeadDataConditionInput.this.messageType.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.messageType.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.logId.defined) {
                    inputFieldWriter.writeObject("logId", ModelStagedLeadDataConditionInput.this.logId.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.logId.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.messageId.defined) {
                    inputFieldWriter.writeObject("messageId", ModelStagedLeadDataConditionInput.this.messageId.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.messageId.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.mailFrom.defined) {
                    inputFieldWriter.writeObject("mailFrom", ModelStagedLeadDataConditionInput.this.mailFrom.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.mailFrom.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.mailTo.defined) {
                    inputFieldWriter.writeObject("mailTo", ModelStagedLeadDataConditionInput.this.mailTo.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.mailTo.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.mailSubject.defined) {
                    inputFieldWriter.writeObject("mailSubject", ModelStagedLeadDataConditionInput.this.mailSubject.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.mailSubject.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.snippet.defined) {
                    inputFieldWriter.writeObject("snippet", ModelStagedLeadDataConditionInput.this.snippet.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.snippet.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.messageDate.defined) {
                    inputFieldWriter.writeObject("messageDate", ModelStagedLeadDataConditionInput.this.messageDate.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.messageDate.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.viewedAt.defined) {
                    inputFieldWriter.writeObject("viewedAt", ModelStagedLeadDataConditionInput.this.viewedAt.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.viewedAt.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.leadCreatedAt.defined) {
                    inputFieldWriter.writeObject("leadCreatedAt", ModelStagedLeadDataConditionInput.this.leadCreatedAt.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.leadCreatedAt.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelStagedLeadDataConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelStagedLeadDataConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelStagedLeadDataConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.entityListId.defined) {
                    inputFieldWriter.writeObject("entityListId", ModelStagedLeadDataConditionInput.this.entityListId.value != 0 ? ((ModelIDInput) ModelStagedLeadDataConditionInput.this.entityListId.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelStagedLeadDataConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelStagedLeadDataConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelStagedLeadDataConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelStagedLeadDataConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelStagedLeadDataConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelStagedLeadDataConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelStagedLeadDataConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelStagedLeadDataConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelStagedLeadDataConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelStagedLeadDataConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelStagedLeadDataConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelStagedLeadDataConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelStagedLeadDataConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelStagedLeadDataConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelStagedLeadDataConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelStagedLeadDataConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelStagedLeadDataConditionInput.this.not.value != 0 ? ((ModelStagedLeadDataConditionInput) ModelStagedLeadDataConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messageDate() {
        return this.messageDate.value;
    }

    public ModelStringInput messageId() {
        return this.messageId.value;
    }

    public ModelStringInput messageType() {
        return this.messageType.value;
    }

    public ModelStringInput network() {
        return this.network.value;
    }

    public ModelStagedLeadDataConditionInput not() {
        return this.not.value;
    }

    public List<ModelStagedLeadDataConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput snippet() {
        return this.snippet.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput viewedAt() {
        return this.viewedAt.value;
    }
}
