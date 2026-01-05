package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelActivityFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelActivityCategoryInput> activityCategory;
    private final Input<ModelIDInput> activityDoneByUserId;
    private final Input<ModelIDInput> activityRelatedObjectId;
    private final Input<ModelActivityRelatedObjectTypeInput> activityRelatedObjectType;
    private final Input<ModelActivityTypeInput> activityType;
    private final Input<List<ModelActivityFilterInput>> and;
    private final Input<ModelStringInput> body;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelActivityFilterInput> not;
    private final Input<List<ModelActivityFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> primaryTeamId;
    private final Input<ModelIDInput> threadId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> threadId = Input.absent();
        private Input<ModelActivityRelatedObjectTypeInput> activityRelatedObjectType = Input.absent();
        private Input<ModelIDInput> activityRelatedObjectId = Input.absent();
        private Input<ModelActivityCategoryInput> activityCategory = Input.absent();
        private Input<ModelActivityTypeInput> activityType = Input.absent();
        private Input<ModelStringInput> body = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelIDInput> primaryTeamId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> activityDoneByUserId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelActivityFilterInput>> and = Input.absent();
        private Input<List<ModelActivityFilterInput>> or = Input.absent();
        private Input<ModelActivityFilterInput> not = Input.absent();

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

        public Builder and(List<ModelActivityFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(ModelStringInput modelStringInput) {
            this.body = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelActivityFilterInput build() {
            return new ModelActivityFilterInput(this.id, this.accountId, this.threadId, this.activityRelatedObjectType, this.activityRelatedObjectId, this.activityCategory, this.activityType, this.body, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelActivityFilterInput modelActivityFilterInput) {
            this.not = Input.fromNullable(modelActivityFilterInput);
            return this;
        }

        public Builder or(List<ModelActivityFilterInput> list) {
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

    public ModelActivityFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelActivityRelatedObjectTypeInput> input4, Input<ModelIDInput> input5, Input<ModelActivityCategoryInput> input6, Input<ModelActivityTypeInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelIDInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<List<ModelActivityFilterInput>> input15, Input<List<ModelActivityFilterInput>> input16, Input<ModelActivityFilterInput> input17) {
        this.id = input;
        this.accountId = input2;
        this.threadId = input3;
        this.activityRelatedObjectType = input4;
        this.activityRelatedObjectId = input5;
        this.activityCategory = input6;
        this.activityType = input7;
        this.body = input8;
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

    public List<ModelActivityFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelActivityFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelActivityFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.threadId.defined) {
                    inputFieldWriter.writeObject("threadId", ModelActivityFilterInput.this.threadId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.threadId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.activityRelatedObjectType.defined) {
                    inputFieldWriter.writeObject("activityRelatedObjectType", ModelActivityFilterInput.this.activityRelatedObjectType.value != 0 ? ((ModelActivityRelatedObjectTypeInput) ModelActivityFilterInput.this.activityRelatedObjectType.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.activityRelatedObjectId.defined) {
                    inputFieldWriter.writeObject("activityRelatedObjectId", ModelActivityFilterInput.this.activityRelatedObjectId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.activityRelatedObjectId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.activityCategory.defined) {
                    inputFieldWriter.writeObject("activityCategory", ModelActivityFilterInput.this.activityCategory.value != 0 ? ((ModelActivityCategoryInput) ModelActivityFilterInput.this.activityCategory.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.activityType.defined) {
                    inputFieldWriter.writeObject("activityType", ModelActivityFilterInput.this.activityType.value != 0 ? ((ModelActivityTypeInput) ModelActivityFilterInput.this.activityType.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", ModelActivityFilterInput.this.body.value != 0 ? ((ModelStringInput) ModelActivityFilterInput.this.body.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelActivityFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeObject("primaryTeamId", ModelActivityFilterInput.this.primaryTeamId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.primaryTeamId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelActivityFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeObject("activityDoneByUserId", ModelActivityFilterInput.this.activityDoneByUserId.value != 0 ? ((ModelIDInput) ModelActivityFilterInput.this.activityDoneByUserId.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelActivityFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelActivityFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelActivityFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelActivityFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelActivityFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelActivityFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelActivityFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelActivityFilterInput.this.not.value != 0 ? ((ModelActivityFilterInput) ModelActivityFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelActivityFilterInput not() {
        return this.not.value;
    }

    public List<ModelActivityFilterInput> or() {
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
