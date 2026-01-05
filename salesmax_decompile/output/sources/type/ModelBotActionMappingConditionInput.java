package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.notifications.internal.common.NotificationConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelBotActionMappingConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> actionId;
    private final Input<List<ModelBotActionMappingConditionInput>> and;
    private final Input<ModelIDInput> botId;
    private final Input<ModelStringInput> context;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelBooleanInput> isPaused;
    private final Input<ModelBotActionMappingConditionInput> not;
    private final Input<List<ModelBotActionMappingConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> botId = Input.absent();
        private Input<ModelIDInput> actionId = Input.absent();
        private Input<ModelStringInput> context = Input.absent();
        private Input<ModelBooleanInput> isPaused = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelBotActionMappingConditionInput>> and = Input.absent();
        private Input<List<ModelBotActionMappingConditionInput>> or = Input.absent();
        private Input<ModelBotActionMappingConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actionId(ModelIDInput modelIDInput) {
            this.actionId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelBotActionMappingConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botId(ModelIDInput modelIDInput) {
            this.botId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelBotActionMappingConditionInput build() {
            return new ModelBotActionMappingConditionInput(this.accountId, this.botId, this.actionId, this.context, this.isPaused, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder context(ModelStringInput modelStringInput) {
            this.context = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isPaused(ModelBooleanInput modelBooleanInput) {
            this.isPaused = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
            this.not = Input.fromNullable(modelBotActionMappingConditionInput);
            return this;
        }

        public Builder or(List<ModelBotActionMappingConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelBotActionMappingConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelBooleanInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelBotActionMappingConditionInput>> input8, Input<List<ModelBotActionMappingConditionInput>> input9, Input<ModelBotActionMappingConditionInput> input10) {
        this.accountId = input;
        this.botId = input2;
        this.actionId = input3;
        this.context = input4;
        this.isPaused = input5;
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

    public ModelIDInput actionId() {
        return this.actionId.value;
    }

    public List<ModelBotActionMappingConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput botId() {
        return this.botId.value;
    }

    public ModelStringInput context() {
        return this.context.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelBooleanInput isPaused() {
        return this.isPaused.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBotActionMappingConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBotActionMappingConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelBotActionMappingConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelBotActionMappingConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.botId.defined) {
                    inputFieldWriter.writeObject("botId", ModelBotActionMappingConditionInput.this.botId.value != 0 ? ((ModelIDInput) ModelBotActionMappingConditionInput.this.botId.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.actionId.defined) {
                    inputFieldWriter.writeObject(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, ModelBotActionMappingConditionInput.this.actionId.value != 0 ? ((ModelIDInput) ModelBotActionMappingConditionInput.this.actionId.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.context.defined) {
                    inputFieldWriter.writeObject("context", ModelBotActionMappingConditionInput.this.context.value != 0 ? ((ModelStringInput) ModelBotActionMappingConditionInput.this.context.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.isPaused.defined) {
                    inputFieldWriter.writeObject("isPaused", ModelBotActionMappingConditionInput.this.isPaused.value != 0 ? ((ModelBooleanInput) ModelBotActionMappingConditionInput.this.isPaused.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelBotActionMappingConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelBotActionMappingConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelBotActionMappingConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelBotActionMappingConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelBotActionMappingConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelBotActionMappingConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionMappingConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionMappingConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionMappingConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionMappingConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelBotActionMappingConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionMappingConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionMappingConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionMappingConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionMappingConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelBotActionMappingConditionInput.this.not.value != 0 ? ((ModelBotActionMappingConditionInput) ModelBotActionMappingConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelBotActionMappingConditionInput not() {
        return this.not.value;
    }

    public List<ModelBotActionMappingConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
