package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelMentionUserMembershipConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelMentionUserMembershipConditionInput>> and;
    private final Input<ModelIDInput> commentId;
    private final Input<ModelIDInput> commentedById;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelAnnouncementInput> isAnnouncement;
    private final Input<ModelIDInput> mentionedUserId;
    private final Input<ModelMentionUserMembershipConditionInput> not;
    private final Input<List<ModelMentionUserMembershipConditionInput>> or;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> commentId = Input.absent();
        private Input<ModelIDInput> mentionedUserId = Input.absent();
        private Input<ModelAnnouncementInput> isAnnouncement = Input.absent();
        private Input<ModelIDInput> commentedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelMentionUserMembershipConditionInput>> and = Input.absent();
        private Input<List<ModelMentionUserMembershipConditionInput>> or = Input.absent();
        private Input<ModelMentionUserMembershipConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelMentionUserMembershipConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelMentionUserMembershipConditionInput build() {
            return new ModelMentionUserMembershipConditionInput(this.accountId, this.commentId, this.mentionedUserId, this.isAnnouncement, this.commentedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder commentId(ModelIDInput modelIDInput) {
            this.commentId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder commentedById(ModelIDInput modelIDInput) {
            this.commentedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isAnnouncement(ModelAnnouncementInput modelAnnouncementInput) {
            this.isAnnouncement = Input.fromNullable(modelAnnouncementInput);
            return this;
        }

        public Builder mentionedUserId(ModelIDInput modelIDInput) {
            this.mentionedUserId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelMentionUserMembershipConditionInput modelMentionUserMembershipConditionInput) {
            this.not = Input.fromNullable(modelMentionUserMembershipConditionInput);
            return this;
        }

        public Builder or(List<ModelMentionUserMembershipConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelMentionUserMembershipConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelAnnouncementInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelMentionUserMembershipConditionInput>> input8, Input<List<ModelMentionUserMembershipConditionInput>> input9, Input<ModelMentionUserMembershipConditionInput> input10) {
        this.accountId = input;
        this.commentId = input2;
        this.mentionedUserId = input3;
        this.isAnnouncement = input4;
        this.commentedById = input5;
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

    public List<ModelMentionUserMembershipConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput commentId() {
        return this.commentId.value;
    }

    public ModelIDInput commentedById() {
        return this.commentedById.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelAnnouncementInput isAnnouncement() {
        return this.isAnnouncement.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMentionUserMembershipConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMentionUserMembershipConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelMentionUserMembershipConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.commentId.defined) {
                    inputFieldWriter.writeObject("commentId", ModelMentionUserMembershipConditionInput.this.commentId.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipConditionInput.this.commentId.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.mentionedUserId.defined) {
                    inputFieldWriter.writeObject("mentionedUserId", ModelMentionUserMembershipConditionInput.this.mentionedUserId.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipConditionInput.this.mentionedUserId.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.isAnnouncement.defined) {
                    inputFieldWriter.writeObject("isAnnouncement", ModelMentionUserMembershipConditionInput.this.isAnnouncement.value != 0 ? ((ModelAnnouncementInput) ModelMentionUserMembershipConditionInput.this.isAnnouncement.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.commentedById.defined) {
                    inputFieldWriter.writeObject("commentedById", ModelMentionUserMembershipConditionInput.this.commentedById.value != 0 ? ((ModelIDInput) ModelMentionUserMembershipConditionInput.this.commentedById.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelMentionUserMembershipConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelMentionUserMembershipConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelMentionUserMembershipConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelMentionUserMembershipConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelMentionUserMembershipConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMentionUserMembershipConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMentionUserMembershipConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMentionUserMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelMentionUserMembershipConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelMentionUserMembershipConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelMentionUserMembershipConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelMentionUserMembershipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelMentionUserMembershipConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelMentionUserMembershipConditionInput.this.not.value != 0 ? ((ModelMentionUserMembershipConditionInput) ModelMentionUserMembershipConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelIDInput mentionedUserId() {
        return this.mentionedUserId.value;
    }

    public ModelMentionUserMembershipConditionInput not() {
        return this.not.value;
    }

    public List<ModelMentionUserMembershipConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
