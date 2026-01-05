package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelChatBotConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelChatBotConditionInput>> and;
    private final Input<ModelStringInput> botType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> fallBackResponse;
    private final Input<ModelStringInput> generatedPrompt;
    private final Input<ModelStringInput> intent;
    private final Input<ModelIDInput> linkedFiles;
    private final Input<ModelStringInput> name;
    private final Input<ModelStringInput> nickName;
    private final Input<ModelChatBotConditionInput> not;
    private final Input<List<ModelChatBotConditionInput>> or;
    private final Input<ModelStringInput> preferredModel;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> systemContext;
    private final Input<ModelIDInput> testChannelId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> userContext;

    public static final class Builder {
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
        private Input<List<ModelChatBotConditionInput>> and = Input.absent();
        private Input<List<ModelChatBotConditionInput>> or = Input.absent();
        private Input<ModelChatBotConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelChatBotConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder botType(ModelStringInput modelStringInput) {
            this.botType = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelChatBotConditionInput build() {
            return new ModelChatBotConditionInput(this.accountId, this.name, this.nickName, this.description, this.intent, this.botType, this.userContext, this.systemContext, this.generatedPrompt, this.fallBackResponse, this.status, this.linkedFiles, this.createdById, this.updatedById, this.testChannelId, this.preferredModel, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelChatBotConditionInput modelChatBotConditionInput) {
            this.not = Input.fromNullable(modelChatBotConditionInput);
            return this;
        }

        public Builder or(List<ModelChatBotConditionInput> list) {
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

    public ModelChatBotConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<List<ModelChatBotConditionInput>> input19, Input<List<ModelChatBotConditionInput>> input20, Input<ModelChatBotConditionInput> input21) {
        this.accountId = input;
        this.name = input2;
        this.nickName = input3;
        this.description = input4;
        this.intent = input5;
        this.botType = input6;
        this.userContext = input7;
        this.systemContext = input8;
        this.generatedPrompt = input9;
        this.fallBackResponse = input10;
        this.status = input11;
        this.linkedFiles = input12;
        this.createdById = input13;
        this.updatedById = input14;
        this.testChannelId = input15;
        this.preferredModel = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.and = input19;
        this.or = input20;
        this.not = input21;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelChatBotConditionInput> and() {
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

    public ModelStringInput intent() {
        return this.intent.value;
    }

    public ModelIDInput linkedFiles() {
        return this.linkedFiles.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelChatBotConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelChatBotConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelChatBotConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelChatBotConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelChatBotConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.nickName.defined) {
                    inputFieldWriter.writeObject("nickName", ModelChatBotConditionInput.this.nickName.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.nickName.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelChatBotConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.intent.defined) {
                    inputFieldWriter.writeObject("intent", ModelChatBotConditionInput.this.intent.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.intent.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.botType.defined) {
                    inputFieldWriter.writeObject("botType", ModelChatBotConditionInput.this.botType.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.botType.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.userContext.defined) {
                    inputFieldWriter.writeObject("userContext", ModelChatBotConditionInput.this.userContext.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.userContext.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.systemContext.defined) {
                    inputFieldWriter.writeObject("systemContext", ModelChatBotConditionInput.this.systemContext.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.systemContext.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.generatedPrompt.defined) {
                    inputFieldWriter.writeObject("generatedPrompt", ModelChatBotConditionInput.this.generatedPrompt.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.generatedPrompt.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.fallBackResponse.defined) {
                    inputFieldWriter.writeObject("fallBackResponse", ModelChatBotConditionInput.this.fallBackResponse.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.fallBackResponse.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelChatBotConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.linkedFiles.defined) {
                    inputFieldWriter.writeObject("linkedFiles", ModelChatBotConditionInput.this.linkedFiles.value != 0 ? ((ModelIDInput) ModelChatBotConditionInput.this.linkedFiles.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelChatBotConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelChatBotConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelChatBotConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelChatBotConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.testChannelId.defined) {
                    inputFieldWriter.writeObject("testChannelId", ModelChatBotConditionInput.this.testChannelId.value != 0 ? ((ModelIDInput) ModelChatBotConditionInput.this.testChannelId.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.preferredModel.defined) {
                    inputFieldWriter.writeObject("preferredModel", ModelChatBotConditionInput.this.preferredModel.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.preferredModel.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelChatBotConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelChatBotConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelChatBotConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelChatBotConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelChatBotConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelChatBotConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelChatBotConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelChatBotConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelChatBotConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelChatBotConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelChatBotConditionInput.this.not.value != 0 ? ((ModelChatBotConditionInput) ModelChatBotConditionInput.this.not.value).marshaller() : null);
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

    public ModelChatBotConditionInput not() {
        return this.not.value;
    }

    public List<ModelChatBotConditionInput> or() {
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
