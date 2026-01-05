package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCommentFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> activityId;
    private final Input<List<ModelCommentFilterInput>> and;
    private final Input<ModelStringInput> body;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelIDInput> id;
    private final Input<ModelCommentFilterInput> not;
    private final Input<List<ModelCommentFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> parentEngagementId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> body = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelIDInput> activityId = Input.absent();
        private Input<ModelIDInput> parentEngagementId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCommentFilterInput>> and = Input.absent();
        private Input<List<ModelCommentFilterInput>> or = Input.absent();
        private Input<ModelCommentFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder activityId(ModelIDInput modelIDInput) {
            this.activityId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelCommentFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder body(ModelStringInput modelStringInput) {
            this.body = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelCommentFilterInput build() {
            return new ModelCommentFilterInput(this.id, this.accountId, this.ownerId, this.body, this.engagementId, this.activityId, this.parentEngagementId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCommentFilterInput modelCommentFilterInput) {
            this.not = Input.fromNullable(modelCommentFilterInput);
            return this;
        }

        public Builder or(List<ModelCommentFilterInput> list) {
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

    public ModelCommentFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelCommentFilterInput>> input10, Input<List<ModelCommentFilterInput>> input11, Input<ModelCommentFilterInput> input12) {
        this.id = input;
        this.accountId = input2;
        this.ownerId = input3;
        this.body = input4;
        this.engagementId = input5;
        this.activityId = input6;
        this.parentEngagementId = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
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

    public List<ModelCommentFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCommentFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCommentFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCommentFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCommentFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCommentFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCommentFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelCommentFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelCommentFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.body.defined) {
                    inputFieldWriter.writeObject("body", ModelCommentFilterInput.this.body.value != 0 ? ((ModelStringInput) ModelCommentFilterInput.this.body.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelCommentFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelCommentFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.activityId.defined) {
                    inputFieldWriter.writeObject("activityId", ModelCommentFilterInput.this.activityId.value != 0 ? ((ModelIDInput) ModelCommentFilterInput.this.activityId.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeObject("parentEngagementId", ModelCommentFilterInput.this.parentEngagementId.value != 0 ? ((ModelIDInput) ModelCommentFilterInput.this.parentEngagementId.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCommentFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCommentFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCommentFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCommentFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCommentFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCommentFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCommentFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCommentFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCommentFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCommentFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCommentFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCommentFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCommentFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCommentFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCommentFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCommentFilterInput.this.not.value != 0 ? ((ModelCommentFilterInput) ModelCommentFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCommentFilterInput not() {
        return this.not.value;
    }

    public List<ModelCommentFilterInput> or() {
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
