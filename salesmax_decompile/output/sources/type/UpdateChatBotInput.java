package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateChatBotInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> botType;
    private final Input<List<ChildIntentInput>> childIntentList;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> description;
    private final Input<String> fallBackResponse;
    private final Input<String> generatedPrompt;
    private final String id;
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
        private String id;
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

        public UpdateChatBotInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateChatBotInput(this.id, this.accountId, this.name, this.nickName, this.description, this.intent, this.botType, this.childIntentList, this.userContext, this.systemContext, this.generatedPrompt, this.fallBackResponse, this.status, this.linkedFiles, this.createdById, this.updatedById, this.testChannelId, this.preferredModel, this.createdAt, this.updatedAt);
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
            this.id = str;
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

    public UpdateChatBotInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<List<ChildIntentInput>> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<List<String>> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19) {
        this.id = str;
        this.accountId = input;
        this.name = input2;
        this.nickName = input3;
        this.description = input4;
        this.intent = input5;
        this.botType = input6;
        this.childIntentList = input7;
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
        return this.id;
    }

    public String intent() {
        return this.intent.value;
    }

    public List<String> linkedFiles() {
        return this.linkedFiles.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateChatBotInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateChatBotInput.this.id);
                if (UpdateChatBotInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateChatBotInput.this.accountId.value);
                }
                if (UpdateChatBotInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateChatBotInput.this.name.value);
                }
                if (UpdateChatBotInput.this.nickName.defined) {
                    inputFieldWriter.writeString("nickName", (String) UpdateChatBotInput.this.nickName.value);
                }
                if (UpdateChatBotInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateChatBotInput.this.description.value);
                }
                if (UpdateChatBotInput.this.intent.defined) {
                    inputFieldWriter.writeString("intent", (String) UpdateChatBotInput.this.intent.value);
                }
                if (UpdateChatBotInput.this.botType.defined) {
                    inputFieldWriter.writeString("botType", (String) UpdateChatBotInput.this.botType.value);
                }
                if (UpdateChatBotInput.this.childIntentList.defined) {
                    inputFieldWriter.writeList("childIntentList", UpdateChatBotInput.this.childIntentList.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatBotInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatBotInput.this.childIntentList.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ChildIntentInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateChatBotInput.this.userContext.defined) {
                    inputFieldWriter.writeString("userContext", (String) UpdateChatBotInput.this.userContext.value);
                }
                if (UpdateChatBotInput.this.systemContext.defined) {
                    inputFieldWriter.writeString("systemContext", (String) UpdateChatBotInput.this.systemContext.value);
                }
                if (UpdateChatBotInput.this.generatedPrompt.defined) {
                    inputFieldWriter.writeString("generatedPrompt", (String) UpdateChatBotInput.this.generatedPrompt.value);
                }
                if (UpdateChatBotInput.this.fallBackResponse.defined) {
                    inputFieldWriter.writeString("fallBackResponse", (String) UpdateChatBotInput.this.fallBackResponse.value);
                }
                if (UpdateChatBotInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateChatBotInput.this.status.value);
                }
                if (UpdateChatBotInput.this.linkedFiles.defined) {
                    inputFieldWriter.writeList("linkedFiles", UpdateChatBotInput.this.linkedFiles.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateChatBotInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateChatBotInput.this.linkedFiles.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateChatBotInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateChatBotInput.this.createdById.value);
                }
                if (UpdateChatBotInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateChatBotInput.this.updatedById.value);
                }
                if (UpdateChatBotInput.this.testChannelId.defined) {
                    inputFieldWriter.writeString("testChannelId", (String) UpdateChatBotInput.this.testChannelId.value);
                }
                if (UpdateChatBotInput.this.preferredModel.defined) {
                    inputFieldWriter.writeString("preferredModel", (String) UpdateChatBotInput.this.preferredModel.value);
                }
                if (UpdateChatBotInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateChatBotInput.this.createdAt.value);
                }
                if (UpdateChatBotInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateChatBotInput.this.updatedAt.value);
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
