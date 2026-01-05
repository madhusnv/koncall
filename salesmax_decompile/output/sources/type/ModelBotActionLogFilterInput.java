package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelBotActionLogFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> actionId;
    private final Input<ModelStringInput> actionName;
    private final Input<List<ModelBotActionLogFilterInput>> and;
    private final Input<ModelIDInput> botId;
    private final Input<ModelStringInput> context;
    private final Input<ModelStringInput> errorMessage;
    private final Input<ModelIDInput> id;
    private final Input<ModelBotActionLogFilterInput> not;
    private final Input<List<ModelBotActionLogFilterInput>> or;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> timestamp;
    private final Input<ModelIDInput> triggerMessageId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> botId = Input.absent();
        private Input<ModelIDInput> actionId = Input.absent();
        private Input<ModelStringInput> actionName = Input.absent();
        private Input<ModelIDInput> triggerMessageId = Input.absent();
        private Input<ModelStringInput> context = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> errorMessage = Input.absent();
        private Input<ModelStringInput> timestamp = Input.absent();
        private Input<List<ModelBotActionLogFilterInput>> and = Input.absent();
        private Input<List<ModelBotActionLogFilterInput>> or = Input.absent();
        private Input<ModelBotActionLogFilterInput> not = Input.absent();

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

        public Builder and(List<ModelBotActionLogFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botId(ModelIDInput modelIDInput) {
            this.botId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelBotActionLogFilterInput build() {
            return new ModelBotActionLogFilterInput(this.id, this.accountId, this.botId, this.actionId, this.actionName, this.triggerMessageId, this.context, this.status, this.errorMessage, this.timestamp, this.and, this.or, this.not);
        }

        public Builder context(ModelStringInput modelStringInput) {
            this.context = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder errorMessage(ModelStringInput modelStringInput) {
            this.errorMessage = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelBotActionLogFilterInput modelBotActionLogFilterInput) {
            this.not = Input.fromNullable(modelBotActionLogFilterInput);
            return this;
        }

        public Builder or(List<ModelBotActionLogFilterInput> list) {
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

    public ModelBotActionLogFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<List<ModelBotActionLogFilterInput>> input11, Input<List<ModelBotActionLogFilterInput>> input12, Input<ModelBotActionLogFilterInput> input13) {
        this.id = input;
        this.accountId = input2;
        this.botId = input3;
        this.actionId = input4;
        this.actionName = input5;
        this.triggerMessageId = input6;
        this.context = input7;
        this.status = input8;
        this.errorMessage = input9;
        this.timestamp = input10;
        this.and = input11;
        this.or = input12;
        this.not = input13;
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

    public List<ModelBotActionLogFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBotActionLogFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBotActionLogFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelBotActionLogFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelBotActionLogFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelBotActionLogFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelBotActionLogFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.botId.defined) {
                    inputFieldWriter.writeObject("botId", ModelBotActionLogFilterInput.this.botId.value != 0 ? ((ModelIDInput) ModelBotActionLogFilterInput.this.botId.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.actionId.defined) {
                    inputFieldWriter.writeObject(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, ModelBotActionLogFilterInput.this.actionId.value != 0 ? ((ModelIDInput) ModelBotActionLogFilterInput.this.actionId.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.actionName.defined) {
                    inputFieldWriter.writeObject("actionName", ModelBotActionLogFilterInput.this.actionName.value != 0 ? ((ModelStringInput) ModelBotActionLogFilterInput.this.actionName.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.triggerMessageId.defined) {
                    inputFieldWriter.writeObject("triggerMessageId", ModelBotActionLogFilterInput.this.triggerMessageId.value != 0 ? ((ModelIDInput) ModelBotActionLogFilterInput.this.triggerMessageId.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.context.defined) {
                    inputFieldWriter.writeObject("context", ModelBotActionLogFilterInput.this.context.value != 0 ? ((ModelStringInput) ModelBotActionLogFilterInput.this.context.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelBotActionLogFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelBotActionLogFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.errorMessage.defined) {
                    inputFieldWriter.writeObject("errorMessage", ModelBotActionLogFilterInput.this.errorMessage.value != 0 ? ((ModelStringInput) ModelBotActionLogFilterInput.this.errorMessage.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.timestamp.defined) {
                    inputFieldWriter.writeObject("timestamp", ModelBotActionLogFilterInput.this.timestamp.value != 0 ? ((ModelStringInput) ModelBotActionLogFilterInput.this.timestamp.value).marshaller() : null);
                }
                if (ModelBotActionLogFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelBotActionLogFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionLogFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionLogFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionLogFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionLogFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelBotActionLogFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionLogFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionLogFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionLogFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionLogFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelBotActionLogFilterInput.this.not.value != 0 ? ((ModelBotActionLogFilterInput) ModelBotActionLogFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelBotActionLogFilterInput not() {
        return this.not.value;
    }

    public List<ModelBotActionLogFilterInput> or() {
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
