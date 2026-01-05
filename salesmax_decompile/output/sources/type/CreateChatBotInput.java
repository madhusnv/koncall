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
public final class CreateChatBotInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> botType;
    private final Input<List<ChildIntentInput>> childIntentList;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> description;
    private final Input<String> fallBackResponse;
    private final Input<String> generatedPrompt;
    private final Input<String> id;
    private final Input<String> intent;
    private final Input<List<String>> linkedFiles;
    private final Input<String> name;
    private final Input<String> nickName;
    private final Input<String> preferredModel;
    private final Input<String> status;
    private final Input<String> systemContext;
    private final Input<String> testChannelId;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> userContext;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> nickName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> intent = Input.absent();
        private Input<String> botType = Input.absent();
        private Input<List<ChildIntentInput>> childIntentList = Input.absent();
        private Input<String> userContext = Input.absent();
        private Input<String> systemContext = Input.absent();
        private Input<String> generatedPrompt = Input.absent();
        private Input<String> fallBackResponse = Input.absent();
        private Input<String> status = Input.absent();
        private Input<List<String>> linkedFiles = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> testChannelId = Input.absent();
        private Input<String> preferredModel = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder botType(String str) {
            this.botType = Input.fromNullable(str);
            return this;
        }

        public CreateChatBotInput build() {
            return new CreateChatBotInput(this.id, this.accountId, this.name, this.nickName, this.description, this.intent, this.botType, this.childIntentList, this.userContext, this.systemContext, this.generatedPrompt, this.fallBackResponse, this.status, this.linkedFiles, this.createdById, this.updatedById, this.testChannelId, this.preferredModel, this.createdAt, this.updatedAt);
        }

        public Builder childIntentList(List<ChildIntentInput> list) {
            this.childIntentList = Input.fromNullable(list);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder fallBackResponse(String str) {
            this.fallBackResponse = Input.fromNullable(str);
            return this;
        }

        public Builder generatedPrompt(String str) {
            this.generatedPrompt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder intent(String str) {
            this.intent = Input.fromNullable(str);
            return this;
        }

        public Builder linkedFiles(List<String> list) {
            this.linkedFiles = Input.fromNullable(list);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder nickName(String str) {
            this.nickName = Input.fromNullable(str);
            return this;
        }

        public Builder preferredModel(String str) {
            this.preferredModel = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder systemContext(String str) {
            this.systemContext = Input.fromNullable(str);
            return this;
        }

        public Builder testChannelId(String str) {
            this.testChannelId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder userContext(String str) {
            this.userContext = Input.fromNullable(str);
            return this;
        }
    }

    public CreateChatBotInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<List<ChildIntentInput>> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<List<String>> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.nickName = input4;
        this.description = input5;
        this.intent = input6;
        this.botType = input7;
        this.childIntentList = input8;
        this.userContext = input9;
        this.systemContext = input10;
        this.generatedPrompt = input11;
        this.fallBackResponse = input12;
        this.status = input13;
        this.linkedFiles = input14;
        this.createdById = input15;
        this.updatedById = input16;
        this.testChannelId = input17;
        this.preferredModel = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String botType() {
        return this.botType.value;
    }

    public List<ChildIntentInput> childIntentList() {
        return this.childIntentList.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String description() {
        return this.description.value;
    }

    public String fallBackResponse() {
        return this.fallBackResponse.value;
    }

    public String generatedPrompt() {
        return this.generatedPrompt.value;
    }

    public String id() {
        return this.id.value;
    }

    public String intent() {
        return this.intent.value;
    }

    public List<String> linkedFiles() {
        return this.linkedFiles.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateChatBotInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateChatBotInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateChatBotInput.this.id.value);
                }
                if (CreateChatBotInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateChatBotInput.this.accountId.value);
                }
                if (CreateChatBotInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateChatBotInput.this.name.value);
                }
                if (CreateChatBotInput.this.nickName.defined) {
                    inputFieldWriter.writeString("nickName", (String) CreateChatBotInput.this.nickName.value);
                }
                if (CreateChatBotInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) CreateChatBotInput.this.description.value);
                }
                if (CreateChatBotInput.this.intent.defined) {
                    inputFieldWriter.writeString("intent", (String) CreateChatBotInput.this.intent.value);
                }
                if (CreateChatBotInput.this.botType.defined) {
                    inputFieldWriter.writeString("botType", (String) CreateChatBotInput.this.botType.value);
                }
                if (CreateChatBotInput.this.childIntentList.defined) {
                    inputFieldWriter.writeList("childIntentList", CreateChatBotInput.this.childIntentList.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatBotInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatBotInput.this.childIntentList.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ChildIntentInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateChatBotInput.this.userContext.defined) {
                    inputFieldWriter.writeString("userContext", (String) CreateChatBotInput.this.userContext.value);
                }
                if (CreateChatBotInput.this.systemContext.defined) {
                    inputFieldWriter.writeString("systemContext", (String) CreateChatBotInput.this.systemContext.value);
                }
                if (CreateChatBotInput.this.generatedPrompt.defined) {
                    inputFieldWriter.writeString("generatedPrompt", (String) CreateChatBotInput.this.generatedPrompt.value);
                }
                if (CreateChatBotInput.this.fallBackResponse.defined) {
                    inputFieldWriter.writeString("fallBackResponse", (String) CreateChatBotInput.this.fallBackResponse.value);
                }
                if (CreateChatBotInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateChatBotInput.this.status.value);
                }
                if (CreateChatBotInput.this.linkedFiles.defined) {
                    inputFieldWriter.writeList("linkedFiles", CreateChatBotInput.this.linkedFiles.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateChatBotInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateChatBotInput.this.linkedFiles.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateChatBotInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateChatBotInput.this.createdById.value);
                }
                if (CreateChatBotInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateChatBotInput.this.updatedById.value);
                }
                if (CreateChatBotInput.this.testChannelId.defined) {
                    inputFieldWriter.writeString("testChannelId", (String) CreateChatBotInput.this.testChannelId.value);
                }
                if (CreateChatBotInput.this.preferredModel.defined) {
                    inputFieldWriter.writeString("preferredModel", (String) CreateChatBotInput.this.preferredModel.value);
                }
                if (CreateChatBotInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateChatBotInput.this.createdAt.value);
                }
                if (CreateChatBotInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateChatBotInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String nickName() {
        return this.nickName.value;
    }

    public String preferredModel() {
        return this.preferredModel.value;
    }

    public String status() {
        return this.status.value;
    }

    public String systemContext() {
        return this.systemContext.value;
    }

    public String testChannelId() {
        return this.testChannelId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String userContext() {
        return this.userContext.value;
    }
}
