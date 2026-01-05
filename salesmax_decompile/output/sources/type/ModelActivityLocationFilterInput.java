package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelActivityLocationFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelActivityLocationFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> lat;
    private final Input<ModelStringInput> lng;
    private final Input<ModelActivityLocationFilterInput> not;
    private final Input<List<ModelActivityLocationFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> lat = Input.absent();
        private Input<ModelStringInput> lng = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelActivityLocationFilterInput>> and = Input.absent();
        private Input<List<ModelActivityLocationFilterInput>> or = Input.absent();
        private Input<ModelActivityLocationFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelActivityLocationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelActivityLocationFilterInput build() {
            return new ModelActivityLocationFilterInput(this.id, this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder lat(ModelStringInput modelStringInput) {
            this.lat = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lng(ModelStringInput modelStringInput) {
            this.lng = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelActivityLocationFilterInput modelActivityLocationFilterInput) {
            this.not = Input.fromNullable(modelActivityLocationFilterInput);
            return this;
        }

        public Builder or(List<ModelActivityLocationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelActivityLocationFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelActivityLocationFilterInput>> input9, Input<List<ModelActivityLocationFilterInput>> input10, Input<ModelActivityLocationFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.engagementId = input3;
        this.lat = input4;
        this.lng = input5;
        this.ownerId = input6;
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

    public List<ModelActivityLocationFilterInput> and() {
        return this.and.value;
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

    public ModelStringInput lat() {
        return this.lat.value;
    }

    public ModelStringInput lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityLocationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityLocationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelActivityLocationFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelActivityLocationFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelActivityLocationFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelActivityLocationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelActivityLocationFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelActivityLocationFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.lat.defined) {
                    inputFieldWriter.writeObject("lat", ModelActivityLocationFilterInput.this.lat.value != 0 ? ((ModelStringInput) ModelActivityLocationFilterInput.this.lat.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.lng.defined) {
                    inputFieldWriter.writeObject("lng", ModelActivityLocationFilterInput.this.lng.value != 0 ? ((ModelStringInput) ModelActivityLocationFilterInput.this.lng.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelActivityLocationFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelActivityLocationFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelActivityLocationFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelActivityLocationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelActivityLocationFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelActivityLocationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelActivityLocationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelActivityLocationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityLocationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityLocationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityLocationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityLocationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelActivityLocationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityLocationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityLocationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityLocationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityLocationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelActivityLocationFilterInput.this.not.value != 0 ? ((ModelActivityLocationFilterInput) ModelActivityLocationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelActivityLocationFilterInput not() {
        return this.not.value;
    }

    public List<ModelActivityLocationFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
