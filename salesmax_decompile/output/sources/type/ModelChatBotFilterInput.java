package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatBotFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatBotFilterInput>> and;
    private final Input<ModelStringInput> botType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> fallBackResponse;
    private final Input<ModelStringInput> generatedPrompt;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> intent;
    private final Input<ModelIDInput> linkedFiles;
    private final Input<ModelStringInput> name;
    private final Input<ModelStringInput> nickName;
    private final Input<ModelChatBotFilterInput> not;
    private final Input<List<ModelChatBotFilterInput>> or;
    private final Input<ModelStringInput> preferredModel;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> systemContext;
    private final Input<ModelIDInput> testChannelId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> userContext;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> nickName = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> intent = Input.absent();
        private Input<ModelStringInput> botType = Input.absent();
        private Input<ModelStringInput> userContext = Input.absent();
        private Input<ModelStringInput> systemContext = Input.absent();
        private Input<ModelStringInput> generatedPrompt = Input.absent();
        private Input<ModelStringInput> fallBackResponse = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelIDInput> linkedFiles = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelIDInput> testChannelId = Input.absent();
        private Input<ModelStringInput> preferredModel = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelChatBotFilterInput>> and = Input.absent();
        private Input<List<ModelChatBotFilterInput>> or = Input.absent();
        private Input<ModelChatBotFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatBotFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botType(ModelStringInput modelStringInput) {
            this.botType = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelChatBotFilterInput build() {
            return new ModelChatBotFilterInput(this.id, this.accountId, this.name, this.nickName, this.description, this.intent, this.botType, this.userContext, this.systemContext, this.generatedPrompt, this.fallBackResponse, this.status, this.linkedFiles, this.createdById, this.updatedById, this.testChannelId, this.preferredModel, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fallBackResponse(ModelStringInput modelStringInput) {
            this.fallBackResponse = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder generatedPrompt(ModelStringInput modelStringInput) {
            this.generatedPrompt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder intent(ModelStringInput modelStringInput) {
            this.intent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder linkedFiles(ModelIDInput modelIDInput) {
            this.linkedFiles = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder nickName(ModelStringInput modelStringInput) {
            this.nickName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelChatBotFilterInput modelChatBotFilterInput) {
            this.not = Input.fromNullable(modelChatBotFilterInput);
            return this;
        }

        public Builder or(List<ModelChatBotFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder preferredModel(ModelStringInput modelStringInput) {
            this.preferredModel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder systemContext(ModelStringInput modelStringInput) {
            this.systemContext = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder testChannelId(ModelIDInput modelIDInput) {
            this.testChannelId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder userContext(ModelStringInput modelStringInput) {
            this.userContext = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelChatBotFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelIDInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<List<ModelChatBotFilterInput>> input20, Input<List<ModelChatBotFilterInput>> input21, Input<ModelChatBotFilterInput> input22) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.nickName = input4;
        this.description = input5;
        this.intent = input6;
        this.botType = input7;
        this.userContext = input8;
        this.systemContext = input9;
        this.generatedPrompt = input10;
        this.fallBackResponse = input11;
        this.status = input12;
        this.linkedFiles = input13;
        this.createdById = input14;
        this.updatedById = input15;
        this.testChannelId = input16;
        this.preferredModel = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatBotFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput botType() {
        return this.botType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput fallBackResponse() {
        return this.fallBackResponse.value;
    }

    public ModelStringInput generatedPrompt() {
        return this.generatedPrompt.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput intent() {
        return this.intent.value;
    }

    public ModelIDInput linkedFiles() {
        return this.linkedFiles.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatBotFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatBotFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelChatBotFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelChatBotFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatBotFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatBotFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelChatBotFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.nickName.defined) {
                    inputFieldWriter.writeObject("nickName", ModelChatBotFilterInput.this.nickName.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.nickName.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelChatBotFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.intent.defined) {
                    inputFieldWriter.writeObject("intent", ModelChatBotFilterInput.this.intent.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.intent.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.botType.defined) {
                    inputFieldWriter.writeObject("botType", ModelChatBotFilterInput.this.botType.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.botType.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.userContext.defined) {
                    inputFieldWriter.writeObject("userContext", ModelChatBotFilterInput.this.userContext.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.userContext.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.systemContext.defined) {
                    inputFieldWriter.writeObject("systemContext", ModelChatBotFilterInput.this.systemContext.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.systemContext.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.generatedPrompt.defined) {
                    inputFieldWriter.writeObject("generatedPrompt", ModelChatBotFilterInput.this.generatedPrompt.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.generatedPrompt.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.fallBackResponse.defined) {
                    inputFieldWriter.writeObject("fallBackResponse", ModelChatBotFilterInput.this.fallBackResponse.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.fallBackResponse.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelChatBotFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.linkedFiles.defined) {
                    inputFieldWriter.writeObject("linkedFiles", ModelChatBotFilterInput.this.linkedFiles.value != 0 ? ((ModelIDInput) ModelChatBotFilterInput.this.linkedFiles.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelChatBotFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelChatBotFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelChatBotFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelChatBotFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.testChannelId.defined) {
                    inputFieldWriter.writeObject("testChannelId", ModelChatBotFilterInput.this.testChannelId.value != 0 ? ((ModelIDInput) ModelChatBotFilterInput.this.testChannelId.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.preferredModel.defined) {
                    inputFieldWriter.writeObject("preferredModel", ModelChatBotFilterInput.this.preferredModel.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.preferredModel.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatBotFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatBotFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatBotFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatBotFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatBotFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatBotFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatBotFilterInput.this.not.value != 0 ? ((ModelChatBotFilterInput) ModelChatBotFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelStringInput nickName() {
        return this.nickName.value;
    }

    public ModelChatBotFilterInput not() {
        return this.not.value;
    }

    public List<ModelChatBotFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput preferredModel() {
        return this.preferredModel.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput systemContext() {
        return this.systemContext.value;
    }

    public ModelIDInput testChannelId() {
        return this.testChannelId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput userContext() {
        return this.userContext.value;
    }
}
