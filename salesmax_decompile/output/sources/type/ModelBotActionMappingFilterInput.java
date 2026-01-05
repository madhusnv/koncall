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
public final class ModelBotActionMappingFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> actionId;
    private final Input<List<ModelBotActionMappingFilterInput>> and;
    private final Input<ModelIDInput> botId;
    private final Input<ModelStringInput> context;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isPaused;
    private final Input<ModelBotActionMappingFilterInput> not;
    private final Input<List<ModelBotActionMappingFilterInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> botId = Input.absent();
        private Input<ModelIDInput> actionId = Input.absent();
        private Input<ModelStringInput> context = Input.absent();
        private Input<ModelBooleanInput> isPaused = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelBotActionMappingFilterInput>> and = Input.absent();
        private Input<List<ModelBotActionMappingFilterInput>> or = Input.absent();
        private Input<ModelBotActionMappingFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actionId(ModelIDInput modelIDInput) {
            this.actionId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelBotActionMappingFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botId(ModelIDInput modelIDInput) {
            this.botId = Input.fromNullable(modelIDInput);
            return this;
        }

        public ModelBotActionMappingFilterInput build() {
            return new ModelBotActionMappingFilterInput(this.id, this.accountId, this.botId, this.actionId, this.context, this.isPaused, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder context(ModelStringInput modelStringInput) {
            this.context = Input.fromNullable(modelStringInput);
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

        public Builder isPaused(ModelBooleanInput modelBooleanInput) {
            this.isPaused = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelBotActionMappingFilterInput modelBotActionMappingFilterInput) {
            this.not = Input.fromNullable(modelBotActionMappingFilterInput);
            return this;
        }

        public Builder or(List<ModelBotActionMappingFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelBotActionMappingFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelBotActionMappingFilterInput>> input9, Input<List<ModelBotActionMappingFilterInput>> input10, Input<ModelBotActionMappingFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.botId = input3;
        this.actionId = input4;
        this.context = input5;
        this.isPaused = input6;
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

    public ModelIDInput actionId() {
        return this.actionId.value;
    }

    public List<ModelBotActionMappingFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isPaused() {
        return this.isPaused.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBotActionMappingFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBotActionMappingFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelBotActionMappingFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelBotActionMappingFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelBotActionMappingFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelBotActionMappingFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.botId.defined) {
                    inputFieldWriter.writeObject("botId", ModelBotActionMappingFilterInput.this.botId.value != 0 ? ((ModelIDInput) ModelBotActionMappingFilterInput.this.botId.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.actionId.defined) {
                    inputFieldWriter.writeObject(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, ModelBotActionMappingFilterInput.this.actionId.value != 0 ? ((ModelIDInput) ModelBotActionMappingFilterInput.this.actionId.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.context.defined) {
                    inputFieldWriter.writeObject("context", ModelBotActionMappingFilterInput.this.context.value != 0 ? ((ModelStringInput) ModelBotActionMappingFilterInput.this.context.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.isPaused.defined) {
                    inputFieldWriter.writeObject("isPaused", ModelBotActionMappingFilterInput.this.isPaused.value != 0 ? ((ModelBooleanInput) ModelBotActionMappingFilterInput.this.isPaused.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelBotActionMappingFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelBotActionMappingFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelBotActionMappingFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelBotActionMappingFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelBotActionMappingFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelBotActionMappingFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionMappingFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionMappingFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionMappingFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionMappingFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelBotActionMappingFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionMappingFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionMappingFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionMappingFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionMappingFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelBotActionMappingFilterInput.this.not.value != 0 ? ((ModelBotActionMappingFilterInput) ModelBotActionMappingFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelBotActionMappingFilterInput not() {
        return this.not.value;
    }

    public List<ModelBotActionMappingFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
