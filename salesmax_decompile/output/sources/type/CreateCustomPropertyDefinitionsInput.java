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
public final class CreateCustomPropertyDefinitionsInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> description;
    private final String displayName;
    private final Input<Integer> displayOrder;
    private final Input<String> id;
    private final Input<Boolean> isArchived;
    private final Input<Boolean> isMultiple;
    private final boolean isSystemProperty;
    private final String parentObjectType;
    private final Input<List<CustomPropertyOptionsInput>> possibleValues;
    private final String propertyName;
    private final String scalarType;
    private final Input<String> updaedById;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String displayName;
        private boolean isSystemProperty;
        private String parentObjectType;
        private String propertyName;
        private String scalarType;
        private Input<String> id = Input.absent();
        private Input<Integer> displayOrder = Input.absent();
        private Input<String> description = Input.absent();
        private Input<Boolean> isMultiple = Input.absent();
        private Input<List<CustomPropertyOptionsInput>> possibleValues = Input.absent();
        private Input<Boolean> isArchived = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updaedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCustomPropertyDefinitionsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.propertyName, "propertyName == null");
            Utils.checkNotNull(this.displayName, "displayName == null");
            Utils.checkNotNull(this.scalarType, "scalarType == null");
            Utils.checkNotNull(this.parentObjectType, "parentObjectType == null");
            return new CreateCustomPropertyDefinitionsInput(this.id, this.accountId, this.propertyName, this.displayName, this.displayOrder, this.description, this.scalarType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.possibleValues, this.isArchived, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
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

        public Builder displayName(String str) {
            this.displayName = str;
            return this;
        }

        public Builder displayOrder(Integer num) {
            this.displayOrder = Input.fromNullable(num);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder isArchived(Boolean bool) {
            this.isArchived = Input.fromNullable(bool);
            return this;
        }

        public Builder isMultiple(Boolean bool) {
            this.isMultiple = Input.fromNullable(bool);
            return this;
        }

        public Builder isSystemProperty(boolean z) {
            this.isSystemProperty = z;
            return this;
        }

        public Builder parentObjectType(String str) {
            this.parentObjectType = str;
            return this;
        }

        public Builder possibleValues(List<CustomPropertyOptionsInput> list) {
            this.possibleValues = Input.fromNullable(list);
            return this;
        }

        public Builder propertyName(String str) {
            this.propertyName = str;
            return this;
        }

        public Builder scalarType(String str) {
            this.scalarType = str;
            return this;
        }

        public Builder updaedById(String str) {
            this.updaedById = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateCustomPropertyDefinitionsInput(Input<String> input, String str, String str2, String str3, Input<Integer> input2, Input<String> input3, String str4, Input<Boolean> input4, String str5, boolean z, Input<List<CustomPropertyOptionsInput>> input5, Input<Boolean> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10) {
        this.id = input;
        this.accountId = str;
        this.propertyName = str2;
        this.displayName = str3;
        this.displayOrder = input2;
        this.description = input3;
        this.scalarType = str4;
        this.isMultiple = input4;
        this.parentObjectType = str5;
        this.isSystemProperty = z;
        this.possibleValues = input5;
        this.isArchived = input6;
        this.createdById = input7;
        this.updaedById = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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

    public String displayName() {
        return this.displayName;
    }

    public Integer displayOrder() {
        return this.displayOrder.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isArchived() {
        return this.isArchived.value;
    }

    public Boolean isMultiple() {
        return this.isMultiple.value;
    }

    public boolean isSystemProperty() {
        return this.isSystemProperty;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCustomPropertyDefinitionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCustomPropertyDefinitionsInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCustomPropertyDefinitionsInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCustomPropertyDefinitionsInput.this.accountId);
                inputFieldWriter.writeString("propertyName", CreateCustomPropertyDefinitionsInput.this.propertyName);
                inputFieldWriter.writeString("displayName", CreateCustomPropertyDefinitionsInput.this.displayName);
                if (CreateCustomPropertyDefinitionsInput.this.displayOrder.defined) {
                    inputFieldWriter.writeInt("displayOrder", (Integer) CreateCustomPropertyDefinitionsInput.this.displayOrder.value);
                }
                if (CreateCustomPropertyDefinitionsInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) CreateCustomPropertyDefinitionsInput.this.description.value);
                }
                inputFieldWriter.writeString("scalarType", CreateCustomPropertyDefinitionsInput.this.scalarType);
                if (CreateCustomPropertyDefinitionsInput.this.isMultiple.defined) {
                    inputFieldWriter.writeBoolean("isMultiple", (Boolean) CreateCustomPropertyDefinitionsInput.this.isMultiple.value);
                }
                inputFieldWriter.writeString("parentObjectType", CreateCustomPropertyDefinitionsInput.this.parentObjectType);
                inputFieldWriter.writeBoolean("isSystemProperty", Boolean.valueOf(CreateCustomPropertyDefinitionsInput.this.isSystemProperty));
                if (CreateCustomPropertyDefinitionsInput.this.possibleValues.defined) {
                    inputFieldWriter.writeList("possibleValues", CreateCustomPropertyDefinitionsInput.this.possibleValues.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCustomPropertyDefinitionsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCustomPropertyDefinitionsInput.this.possibleValues.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((CustomPropertyOptionsInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateCustomPropertyDefinitionsInput.this.isArchived.defined) {
                    inputFieldWriter.writeBoolean("isArchived", (Boolean) CreateCustomPropertyDefinitionsInput.this.isArchived.value);
                }
                if (CreateCustomPropertyDefinitionsInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateCustomPropertyDefinitionsInput.this.createdById.value);
                }
                if (CreateCustomPropertyDefinitionsInput.this.updaedById.defined) {
                    inputFieldWriter.writeString("updaedById", (String) CreateCustomPropertyDefinitionsInput.this.updaedById.value);
                }
                if (CreateCustomPropertyDefinitionsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCustomPropertyDefinitionsInput.this.createdAt.value);
                }
                if (CreateCustomPropertyDefinitionsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCustomPropertyDefinitionsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String parentObjectType() {
        return this.parentObjectType;
    }

    public List<CustomPropertyOptionsInput> possibleValues() {
        return this.possibleValues.value;
    }

    public String propertyName() {
        return this.propertyName;
    }

    public String scalarType() {
        return this.scalarType;
    }

    public String updaedById() {
        return this.updaedById.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
