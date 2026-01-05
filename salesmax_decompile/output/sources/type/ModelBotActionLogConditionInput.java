package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.notifications.internal.common.NotificationConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelBotActionLogConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> actionId;
    private final Input<ModelStringInput> actionName;
    private final Input<List<ModelBotActionLogConditionInput>> and;
    private final Input<ModelIDInput> botId;
    private final Input<ModelStringInput> context;
    private final Input<ModelStringInput> errorMessage;
    private final Input<ModelBotActionLogConditionInput> not;
    private final Input<List<ModelBotActionLogConditionInput>> or;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> timestamp;
    private final Input<ModelIDInput> triggerMessageId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> botId = Input.absent();
        private Input<ModelIDInput> actionId = Input.absent();
        private Input<ModelStringInput> actionName = Input.absent();
        private Input<ModelIDInput> triggerMessageId = Input.absent();
        private Input<ModelStringInput> context = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> errorMessage = Input.absent();
        private Input<ModelStringInput> timestamp = Input.absent();
        private Input<List<ModelBotActionLogConditionInput>> and = Input.absent();
        private Input<List<ModelBotActionLogConditionInput>> or = Input.absent();
        private Input<ModelBotActionLogConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actionId(ModelIDInput modelIDInput) {
            this.actionId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actionName(ModelStringInput modelStringInput) {
            this.actionName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelBotActionLogConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botId(ModelIDInput modelIDInput) {
            this.botId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelBotActionLogConditionInput build() {
            return new ModelBotActionLogConditionInput(this.accountId, this.botId, this.actionId, this.actionName, this.triggerMessageId, this.context, this.status, this.errorMessage, this.timestamp, this.and, this.or, this.not);
        }

        public Builder context(ModelStringInput modelStringInput) {
            this.context = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder errorMessage(ModelStringInput modelStringInput) {
            this.errorMessage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelBotActionLogConditionInput modelBotActionLogConditionInput) {
            this.not = Input.fromNullable(modelBotActionLogConditionInput);
            return this;
        }

        public Builder or(List<ModelBotActionLogConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder timestamp(ModelStringInput modelStringInput) {
            this.timestamp = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder triggerMessageId(ModelIDInput modelIDInput) {
            this.triggerMessageId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelBotActionLogConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelBotActionLogConditionInput>> input10, Input<List<ModelBotActionLogConditionInput>> input11, Input<ModelBotActionLogConditionInput> input12) {
        this.accountId = input;
        this.botId = input2;
        this.actionId = input3;
        this.actionName = input4;
        this.triggerMessageId = input5;
        this.context = input6;
        this.status = input7;
        this.errorMessage = input8;
        this.timestamp = input9;
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

    public ModelIDInput actionId() {
        return this.actionId.value;
    }

    public ModelStringInput actionName() {
        return this.actionName.value;
    }

    public List<ModelBotActionLogConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput botId() {
        return this.botId.value;
    }

    public ModelStringInput context() {
        return this.context.value;
    }

    public ModelStringInput errorMessage() {
        return this.errorMessage.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBotActionLogConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBotActionLogConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelBotActionLogConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelBotActionLogConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.botId.defined) {
                    inputFieldWriter.writeObject("botId", ModelBotActionLogConditionInput.this.botId.value != 0 ? ((ModelIDInput) ModelBotActionLogConditionInput.this.botId.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.actionId.defined) {
                    inputFieldWriter.writeObject(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, ModelBotActionLogConditionInput.this.actionId.value != 0 ? ((ModelIDInput) ModelBotActionLogConditionInput.this.actionId.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.actionName.defined) {
                    inputFieldWriter.writeObject("actionName", ModelBotActionLogConditionInput.this.actionName.value != 0 ? ((ModelStringInput) ModelBotActionLogConditionInput.this.actionName.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.triggerMessageId.defined) {
                    inputFieldWriter.writeObject("triggerMessageId", ModelBotActionLogConditionInput.this.triggerMessageId.value != 0 ? ((ModelIDInput) ModelBotActionLogConditionInput.this.triggerMessageId.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.context.defined) {
                    inputFieldWriter.writeObject("context", ModelBotActionLogConditionInput.this.context.value != 0 ? ((ModelStringInput) ModelBotActionLogConditionInput.this.context.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelBotActionLogConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelBotActionLogConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.errorMessage.defined) {
                    inputFieldWriter.writeObject("errorMessage", ModelBotActionLogConditionInput.this.errorMessage.value != 0 ? ((ModelStringInput) ModelBotActionLogConditionInput.this.errorMessage.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.timestamp.defined) {
                    inputFieldWriter.writeObject("timestamp", ModelBotActionLogConditionInput.this.timestamp.value != 0 ? ((ModelStringInput) ModelBotActionLogConditionInput.this.timestamp.value).marshaller() : null);
                }
                if (ModelBotActionLogConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelBotActionLogConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionLogConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionLogConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionLogConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionLogConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelBotActionLogConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionLogConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionLogConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionLogConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionLogConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelBotActionLogConditionInput.this.not.value != 0 ? ((ModelBotActionLogConditionInput) ModelBotActionLogConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelBotActionLogConditionInput not() {
        return this.not.value;
    }

    public List<ModelBotActionLogConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput timestamp() {
        return this.timestamp.value;
    }

    public ModelIDInput triggerMessageId() {
        return this.triggerMessageId.value;
    }
}
