package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelActivityLocationConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelActivityLocationConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> lat;
    private final Input<ModelStringInput> lng;
    private final Input<ModelActivityLocationConditionInput> not;
    private final Input<List<ModelActivityLocationConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> lat = Input.absent();
        private Input<ModelStringInput> lng = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelActivityLocationConditionInput>> and = Input.absent();
        private Input<List<ModelActivityLocationConditionInput>> or = Input.absent();
        private Input<ModelActivityLocationConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelActivityLocationConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelActivityLocationConditionInput build() {
            return new ModelActivityLocationConditionInput(this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelActivityLocationConditionInput modelActivityLocationConditionInput) {
            this.not = Input.fromNullable(modelActivityLocationConditionInput);
            return this;
        }

        public Builder or(List<ModelActivityLocationConditionInput> list) {
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

    public ModelActivityLocationConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelActivityLocationConditionInput>> input8, Input<List<ModelActivityLocationConditionInput>> input9, Input<ModelActivityLocationConditionInput> input10) {
        this.accountId = input;
        this.engagementId = input2;
        this.lat = input3;
        this.lng = input4;
        this.ownerId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
        this.and = input8;
        this.or = input9;
        this.not = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelActivityLocationConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    public ModelStringInput lat() {
        return this.lat.value;
    }

    public ModelStringInput lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelActivityLocationConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelActivityLocationConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelActivityLocationConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelActivityLocationConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelActivityLocationConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelActivityLocationConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.lat.defined) {
                    inputFieldWriter.writeObject("lat", ModelActivityLocationConditionInput.this.lat.value != 0 ? ((ModelStringInput) ModelActivityLocationConditionInput.this.lat.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.lng.defined) {
                    inputFieldWriter.writeObject("lng", ModelActivityLocationConditionInput.this.lng.value != 0 ? ((ModelStringInput) ModelActivityLocationConditionInput.this.lng.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelActivityLocationConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelActivityLocationConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelActivityLocationConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelActivityLocationConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelActivityLocationConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelActivityLocationConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelActivityLocationConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelActivityLocationConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityLocationConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityLocationConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityLocationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityLocationConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelActivityLocationConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelActivityLocationConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelActivityLocationConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelActivityLocationConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelActivityLocationConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelActivityLocationConditionInput.this.not.value != 0 ? ((ModelActivityLocationConditionInput) ModelActivityLocationConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelActivityLocationConditionInput not() {
        return this.not.value;
    }

    public List<ModelActivityLocationConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
