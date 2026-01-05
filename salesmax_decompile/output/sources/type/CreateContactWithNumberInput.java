package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateContactWithNumberInput implements InputType {
    private final Input<List<String>> contactNumbers;
    private final Input<CreateBusinessInputShort> createBusinessInput;
    private final Input<CreateContactInput> createContactInput;
    private final Input<Boolean> doNotCreateOnlyGet;
    private final Input<String> entityListId;
    private final Input<Boolean> forceDuplicate;
    private final Input<List<String>> updatableFields;
    private final Input<List<String>> whatsappContactNumbers;

    public static final class Builder {
        private Input<Boolean> forceDuplicate = Input.absent();
        private Input<CreateContactInput> createContactInput = Input.absent();
        private Input<CreateBusinessInputShort> createBusinessInput = Input.absent();
        private Input<List<String>> contactNumbers = Input.absent();
        private Input<List<String>> whatsappContactNumbers = Input.absent();
        private Input<String> entityListId = Input.absent();
        private Input<Boolean> doNotCreateOnlyGet = Input.absent();
        private Input<List<String>> updatableFields = Input.absent();

        public CreateContactWithNumberInput build() {
            return new CreateContactWithNumberInput(this.forceDuplicate, this.createContactInput, this.createBusinessInput, this.contactNumbers, this.whatsappContactNumbers, this.entityListId, this.doNotCreateOnlyGet, this.updatableFields);
        }

        public Builder contactNumbers(List<String> list) {
            this.contactNumbers = Input.fromNullable(list);
            return this;
        }

        public Builder createBusinessInput(CreateBusinessInputShort createBusinessInputShort) {
            this.createBusinessInput = Input.fromNullable(createBusinessInputShort);
            return this;
        }

        public Builder createContactInput(CreateContactInput createContactInput) {
            this.createContactInput = Input.fromNullable(createContactInput);
            return this;
        }

        public Builder doNotCreateOnlyGet(Boolean bool) {
            this.doNotCreateOnlyGet = Input.fromNullable(bool);
            return this;
        }

        public Builder entityListId(String str) {
            this.entityListId = Input.fromNullable(str);
            return this;
        }

        public Builder forceDuplicate(Boolean bool) {
            this.forceDuplicate = Input.fromNullable(bool);
            return this;
        }

        public Builder updatableFields(List<String> list) {
            this.updatableFields = Input.fromNullable(list);
            return this;
        }

        public Builder whatsappContactNumbers(List<String> list) {
            this.whatsappContactNumbers = Input.fromNullable(list);
            return this;
        }
    }

    public CreateContactWithNumberInput(Input<Boolean> input, Input<CreateContactInput> input2, Input<CreateBusinessInputShort> input3, Input<List<String>> input4, Input<List<String>> input5, Input<String> input6, Input<Boolean> input7, Input<List<String>> input8) {
        this.forceDuplicate = input;
        this.createContactInput = input2;
        this.createBusinessInput = input3;
        this.contactNumbers = input4;
        this.whatsappContactNumbers = input5;
        this.entityListId = input6;
        this.doNotCreateOnlyGet = input7;
        this.updatableFields = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> contactNumbers() {
        return this.contactNumbers.value;
    }

    public CreateBusinessInputShort createBusinessInput() {
        return this.createBusinessInput.value;
    }

    public CreateContactInput createContactInput() {
        return this.createContactInput.value;
    }

    public Boolean doNotCreateOnlyGet() {
        return this.doNotCreateOnlyGet.value;
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    public Boolean forceDuplicate() {
        return this.forceDuplicate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateContactWithNumberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateContactWithNumberInput.this.forceDuplicate.defined) {
                    inputFieldWriter.writeBoolean("forceDuplicate", (Boolean) CreateContactWithNumberInput.this.forceDuplicate.value);
                }
                if (CreateContactWithNumberInput.this.createContactInput.defined) {
                    inputFieldWriter.writeObject("createContactInput", CreateContactWithNumberInput.this.createContactInput.value != 0 ? ((CreateContactInput) CreateContactWithNumberInput.this.createContactInput.value).marshaller() : null);
                }
                if (CreateContactWithNumberInput.this.createBusinessInput.defined) {
                    inputFieldWriter.writeObject("createBusinessInput", CreateContactWithNumberInput.this.createBusinessInput.value != 0 ? ((CreateBusinessInputShort) CreateContactWithNumberInput.this.createBusinessInput.value).marshaller() : null);
                }
                if (CreateContactWithNumberInput.this.contactNumbers.defined) {
                    inputFieldWriter.writeList("contactNumbers", CreateContactWithNumberInput.this.contactNumbers.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactWithNumberInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactWithNumberInput.this.contactNumbers.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSPHONE, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateContactWithNumberInput.this.whatsappContactNumbers.defined) {
                    inputFieldWriter.writeList("whatsappContactNumbers", CreateContactWithNumberInput.this.whatsappContactNumbers.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactWithNumberInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactWithNumberInput.this.whatsappContactNumbers.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.AWSPHONE, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateContactWithNumberInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) CreateContactWithNumberInput.this.entityListId.value);
                }
                if (CreateContactWithNumberInput.this.doNotCreateOnlyGet.defined) {
                    inputFieldWriter.writeBoolean("doNotCreateOnlyGet", (Boolean) CreateContactWithNumberInput.this.doNotCreateOnlyGet.value);
                }
                if (CreateContactWithNumberInput.this.updatableFields.defined) {
                    inputFieldWriter.writeList("updatableFields", CreateContactWithNumberInput.this.updatableFields.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateContactWithNumberInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateContactWithNumberInput.this.updatableFields.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public List<String> updatableFields() {
        return this.updatableFields.value;
    }

    public List<String> whatsappContactNumbers() {
        return this.whatsappContactNumbers.value;
    }
}
