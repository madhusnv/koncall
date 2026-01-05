package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateStagedLeadDataInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> entityListId;
    private final Input<String> id;
    private final Input<String> leadCreatedAt;
    private final Input<String> logId;
    private final Input<String> mailFrom;
    private final Input<String> mailSubject;
    private final Input<String> mailTo;
    private final Input<String> messageDate;
    private final Input<String> messageId;
    private final Input<String> messageType;
    private final Input<String> network;
    private final Input<String> snippet;
    private final Input<List<String>> tags;
    private final Input<String> updatedAt;
    private final Input<String> viewedAt;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> network = Input.absent();
        private Input<String> messageType = Input.absent();
        private Input<String> logId = Input.absent();
        private Input<String> messageId = Input.absent();
        private Input<String> mailFrom = Input.absent();
        private Input<String> mailTo = Input.absent();
        private Input<String> mailSubject = Input.absent();
        private Input<String> snippet = Input.absent();
        private Input<String> messageDate = Input.absent();
        private Input<String> viewedAt = Input.absent();
        private Input<String> leadCreatedAt = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<String> entityListId = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateStagedLeadDataInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateStagedLeadDataInput(this.id, this.accountId, this.network, this.messageType, this.logId, this.messageId, this.mailFrom, this.mailTo, this.mailSubject, this.snippet, this.messageDate, this.viewedAt, this.leadCreatedAt, this.contactId, this.tags, this.entityListId, this.createdById, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
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

        public Builder entityListId(String str) {
            this.entityListId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder leadCreatedAt(String str) {
            this.leadCreatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder logId(String str) {
            this.logId = Input.fromNullable(str);
            return this;
        }

        public Builder mailFrom(String str) {
            this.mailFrom = Input.fromNullable(str);
            return this;
        }

        public Builder mailSubject(String str) {
            this.mailSubject = Input.fromNullable(str);
            return this;
        }

        public Builder mailTo(String str) {
            this.mailTo = Input.fromNullable(str);
            return this;
        }

        public Builder messageDate(String str) {
            this.messageDate = Input.fromNullable(str);
            return this;
        }

        public Builder messageId(String str) {
            this.messageId = Input.fromNullable(str);
            return this;
        }

        public Builder messageType(String str) {
            this.messageType = Input.fromNullable(str);
            return this;
        }

        public Builder network(String str) {
            this.network = Input.fromNullable(str);
            return this;
        }

        public Builder snippet(String str) {
            this.snippet = Input.fromNullable(str);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder viewedAt(String str) {
            this.viewedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateStagedLeadDataInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<List<String>> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18) {
        this.id = input;
        this.accountId = str;
        this.network = input2;
        this.messageType = input3;
        this.logId = input4;
        this.messageId = input5;
        this.mailFrom = input6;
        this.mailTo = input7;
        this.mailSubject = input8;
        this.snippet = input9;
        this.messageDate = input10;
        this.viewedAt = input11;
        this.leadCreatedAt = input12;
        this.contactId = input13;
        this.tags = input14;
        this.entityListId = input15;
        this.createdById = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    public String id() {
        return this.id.value;
    }

    public String leadCreatedAt() {
        return this.leadCreatedAt.value;
    }

    public String logId() {
        return this.logId.value;
    }

    public String mailFrom() {
        return this.mailFrom.value;
    }

    public String mailSubject() {
        return this.mailSubject.value;
    }

    public String mailTo() {
        return this.mailTo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateStagedLeadDataInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateStagedLeadDataInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateStagedLeadDataInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateStagedLeadDataInput.this.accountId);
                if (CreateStagedLeadDataInput.this.network.defined) {
                    inputFieldWriter.writeString("network", (String) CreateStagedLeadDataInput.this.network.value);
                }
                if (CreateStagedLeadDataInput.this.messageType.defined) {
                    inputFieldWriter.writeString("messageType", (String) CreateStagedLeadDataInput.this.messageType.value);
                }
                if (CreateStagedLeadDataInput.this.logId.defined) {
                    inputFieldWriter.writeString("logId", (String) CreateStagedLeadDataInput.this.logId.value);
                }
                if (CreateStagedLeadDataInput.this.messageId.defined) {
                    inputFieldWriter.writeString("messageId", (String) CreateStagedLeadDataInput.this.messageId.value);
                }
                if (CreateStagedLeadDataInput.this.mailFrom.defined) {
                    inputFieldWriter.writeString("mailFrom", (String) CreateStagedLeadDataInput.this.mailFrom.value);
                }
                if (CreateStagedLeadDataInput.this.mailTo.defined) {
                    inputFieldWriter.writeString("mailTo", (String) CreateStagedLeadDataInput.this.mailTo.value);
                }
                if (CreateStagedLeadDataInput.this.mailSubject.defined) {
                    inputFieldWriter.writeString("mailSubject", (String) CreateStagedLeadDataInput.this.mailSubject.value);
                }
                if (CreateStagedLeadDataInput.this.snippet.defined) {
                    inputFieldWriter.writeString("snippet", (String) CreateStagedLeadDataInput.this.snippet.value);
                }
                if (CreateStagedLeadDataInput.this.messageDate.defined) {
                    inputFieldWriter.writeString("messageDate", (String) CreateStagedLeadDataInput.this.messageDate.value);
                }
                if (CreateStagedLeadDataInput.this.viewedAt.defined) {
                    inputFieldWriter.writeString("viewedAt", (String) CreateStagedLeadDataInput.this.viewedAt.value);
                }
                if (CreateStagedLeadDataInput.this.leadCreatedAt.defined) {
                    inputFieldWriter.writeString("leadCreatedAt", (String) CreateStagedLeadDataInput.this.leadCreatedAt.value);
                }
                if (CreateStagedLeadDataInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateStagedLeadDataInput.this.contactId.value);
                }
                if (CreateStagedLeadDataInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateStagedLeadDataInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateStagedLeadDataInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateStagedLeadDataInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateStagedLeadDataInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) CreateStagedLeadDataInput.this.entityListId.value);
                }
                if (CreateStagedLeadDataInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateStagedLeadDataInput.this.createdById.value);
                }
                if (CreateStagedLeadDataInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateStagedLeadDataInput.this.createdAt.value);
                }
                if (CreateStagedLeadDataInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateStagedLeadDataInput.this.updatedAt.value);
                }
            }
        };
    }

    public String messageDate() {
        return this.messageDate.value;
    }

    public String messageId() {
        return this.messageId.value;
    }

    public String messageType() {
        return this.messageType.value;
    }

    public String network() {
        return this.network.value;
    }

    public String snippet() {
        return this.snippet.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String viewedAt() {
        return this.viewedAt.value;
    }
}
