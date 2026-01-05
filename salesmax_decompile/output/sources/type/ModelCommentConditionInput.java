package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCommentConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> activityId;
    private final Input<List<ModelCommentConditionInput>> and;
    private final Input<ModelStringInput> body;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelCommentConditionInput> not;
    private final Input<List<ModelCommentConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> parentEngagementId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> body = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelIDInput> activityId = Input.absent();
        private Input<ModelIDInput> parentEngagementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCommentConditionInput>> and = Input.absent();
        private Input<List<ModelCommentConditionInput>> or = Input.absent();
        private Input<ModelCommentConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityId(ModelIDInput modelIDInput) {
            this.activityId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCommentConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(ModelStringInput modelStringInput) {
            this.body = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelCommentConditionInput build() {
            return new ModelCommentConditionInput(this.accountId, this.ownerId, this.body, this.engagementId, this.activityId, this.parentEngagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCommentConditionInput modelCommentConditionInput) {
            this.not = Input.fromNullable(modelCommentConditionInput);
            return this;
        }

        public Builder or(List<ModelCommentConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder parentEngagementId(ModelIDInput modelIDInput) {
            this.parentEngagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCommentConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelCommentConditionInput>> input9, Input<List<ModelCommentConditionInput>> input10, Input<ModelCommentConditionInput> input11) {
        this.accountId = input;
        this.ownerId = input2;
        this.body = input3;
        this.engagementId = input4;
        this.activityId = input5;
        this.parentEngagementId = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIDInput activityId() {
        return this.activityId.value;
    }

    public List<ModelCommentConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput body() {
        return this.body.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCommentConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCommentConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCommentConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCommentConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelCommentConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelCommentConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", ModelCommentConditionInput.this.body.value != 0 ? ((ModelStringInput) ModelCommentConditionInput.this.body.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelCommentConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelCommentConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.activityId.defined) {
                    inputFieldWriter.writeObject("activityId", ModelCommentConditionInput.this.activityId.value != 0 ? ((ModelIDInput) ModelCommentConditionInput.this.activityId.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeObject("parentEngagementId", ModelCommentConditionInput.this.parentEngagementId.value != 0 ? ((ModelIDInput) ModelCommentConditionInput.this.parentEngagementId.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCommentConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCommentConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCommentConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCommentConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCommentConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCommentConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCommentConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCommentConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCommentConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCommentConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCommentConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCommentConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCommentConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCommentConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCommentConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCommentConditionInput.this.not.value != 0 ? ((ModelCommentConditionInput) ModelCommentConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCommentConditionInput not() {
        return this.not.value;
    }

    public List<ModelCommentConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
