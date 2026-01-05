package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class MentionedEntitiesInput implements InputType {
    private final String entityId;
    private final MentionedEntityType entityType;

    public static final class Builder {
        private String entityId;
        private MentionedEntityType entityType;

        public MentionedEntitiesInput build() {
            Utils.checkNotNull(this.entityType, "entityType == null");
            Utils.checkNotNull(this.entityId, "entityId == null");
            return new MentionedEntitiesInput(this.entityType, this.entityId);
        }

        public Builder entityId(String str) {
            this.entityId = str;
            return this;
        }

        public Builder entityType(MentionedEntityType mentionedEntityType) {
            this.entityType = mentionedEntityType;
            return this;
        }
    }

    public MentionedEntitiesInput(MentionedEntityType mentionedEntityType, String str) {
        this.entityType = mentionedEntityType;
        this.entityId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String entityId() {
        return this.entityId;
    }

    public MentionedEntityType entityType() {
        return this.entityType;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MentionedEntitiesInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("entityType", MentionedEntitiesInput.this.entityType.name());
                inputFieldWriter.writeString("entityId", MentionedEntitiesInput.this.entityId);
            }
        };
    }
}
