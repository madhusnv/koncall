package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelActivityConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelActivityCategoryInput> activityCategory;
    private final Input<ModelIDInput> activityDoneByUserId;
    private final Input<ModelIDInput> activityRelatedObjectId;
    private final Input<ModelActivityRelatedObjectTypeInput> activityRelatedObjectType;
    private final Input<ModelActivityTypeInput> activityType;
    private final Input<List<ModelActivityConditionInput>> and;
    private final Input<ModelStringInput> body;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelActivityConditionInput> not;
    private final Input<ModelStringInput> note;
    private final Input<List<ModelActivityConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelIDInput> threadId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> threadId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelActivityRelatedObjectTypeInput> activityRelatedObjectType = Input.absent();
        private Input<ModelIDInput> activityRelatedObjectId = Input.absent();
        private Input<ModelActivityCategoryInput> activityCategory = Input.absent();
        private Input<ModelActivityTypeInput> activityType = Input.absent();
        private Input<ModelStringInput> body = Input.absent();
        private Input<ModelStringInput> note = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> activityDoneByUserId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelActivityConditionInput>> and = Input.absent();
        private Input<List<ModelActivityConditionInput>> or = Input.absent();
        private Input<ModelActivityConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityCategory(ModelActivityCategoryInput modelActivityCategoryInput) {
            this.activityCategory = Input.fromNullable(modelActivityCategoryInput);
            return this;
        }

        public Builder activityDoneByUserId(ModelIDInput modelIDInput) {
            this.activityDoneByUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityRelatedObjectId(ModelIDInput modelIDInput) {
            this.activityRelatedObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityRelatedObjectType(ModelActivityRelatedObjectTypeInput modelActivityRelatedObjectTypeInput) {
            this.activityRelatedObjectType = Input.fromNullable(modelActivityRelatedObjectTypeInput);
            return this;
        }

        public Builder activityType(ModelActivityTypeInput modelActivityTypeInput) {
            this.activityType = Input.fromNullable(modelActivityTypeInput);
            return this;
        }

        public Builder and(List<ModelActivityConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(ModelStringInput modelStringInput) {
            this.body = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelActivityConditionInput build() {
            return new ModelActivityConditionInput(this.threadId, this.accountId, this.activityRelatedObjectType, this.activityRelatedObjectId, this.activityCategory, this.activityType, this.body, this.note, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelActivityConditionInput modelActivityConditionInput) {
            this.not = Input.fromNullable(modelActivityConditionInput);
            return this;
        }

        public Builder note(ModelStringInput modelStringInput) {
            this.note = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelActivityConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder primaryTeamId(ModelIDInput modelIDInput) {
            this.primaryTeamId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder threadId(ModelIDInput modelIDInput) {
            this.threadId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelActivityConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelActivityRelatedObjectTypeInput> input3, Input<ModelIDInput> input4, Input<ModelActivityCategoryInput> input5, Input<ModelActivityTypeInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<List<ModelActivityConditionInput>> input15, Input<List<ModelActivityConditionInput>> input16, Input<ModelActivityConditionInput> input17) {
        this.threadId = input;
        this.accountId = input2;
        this.activityRelatedObjectType = input3;
        this.activityRelatedObjectId = input4;
        this.activityCategory = input5;
        this.activityType = input6;
        this.body = input7;
        this.note = input8;
        this.ownerId = input9;
        this.primaryTeamId = input10;
        this.contactId = input11;
        this.activityDoneByUserId = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
        this.and = input15;
        this.or = input16;
        this.not = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelActivityCategoryInput activityCategory() {
        return this.activityCategory.value;
    }

    public ModelIDInput activityDoneByUserId() {
        return this.activityDoneByUserId.value;
    }

    public ModelIDInput activityRelatedObjectId() {
        return this.activityRelatedObjectId.value;
    }

    public ModelActivityRelatedObjectTypeInput activityRelatedObjectType() {
        return this.activityRelatedObjectType.value;
    }

    public ModelActivityTypeInput activityType() {
        return this.activityType.value;
    }

    public List<ModelActivityConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput body() {
        return this.body.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityConditionInput.this.threadId.defined) {
                    inputFieldWriter.writeObject("threadId", ModelActivityConditionInput.this.threadId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.threadId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelActivityConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.activityRelatedObjectType.defined) {
                    inputFieldWriter.writeObject("activityRelatedObjectType", ModelActivityConditionInput.this.activityRelatedObjectType.value != 0 ? ((ModelActivityRelatedObjectTypeInput) ModelActivityConditionInput.this.activityRelatedObjectType.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.activityRelatedObjectId.defined) {
                    inputFieldWriter.writeObject("activityRelatedObjectId", ModelActivityConditionInput.this.activityRelatedObjectId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.activityRelatedObjectId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.activityCategory.defined) {
                    inputFieldWriter.writeObject("activityCategory", ModelActivityConditionInput.this.activityCategory.value != 0 ? ((ModelActivityCategoryInput) ModelActivityConditionInput.this.activityCategory.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.activityType.defined) {
                    inputFieldWriter.writeObject("activityType", ModelActivityConditionInput.this.activityType.value != 0 ? ((ModelActivityTypeInput) ModelActivityConditionInput.this.activityType.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", ModelActivityConditionInput.this.body.value != 0 ? ((ModelStringInput) ModelActivityConditionInput.this.body.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.note.defined) {
                    inputFieldWriter.writeObject("note", ModelActivityConditionInput.this.note.value != 0 ? ((ModelStringInput) ModelActivityConditionInput.this.note.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelActivityConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelActivityConditionInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelActivityConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeObject("activityDoneByUserId", ModelActivityConditionInput.this.activityDoneByUserId.value != 0 ? ((ModelIDInput) ModelActivityConditionInput.this.activityDoneByUserId.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelActivityConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelActivityConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelActivityConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelActivityConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelActivityConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelActivityConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelActivityConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelActivityConditionInput.this.not.value != 0 ? ((ModelActivityConditionInput) ModelActivityConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelActivityConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput note() {
        return this.note.value;
    }

    public List<ModelActivityConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public ModelIDInput threadId() {
        return this.threadId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
