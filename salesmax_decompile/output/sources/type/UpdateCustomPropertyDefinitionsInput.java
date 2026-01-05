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
public final class UpdateCustomPropertyDefinitionsInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<CustomDataType> dataType;
    private final Input<String> description;
    private final Input<String> displayName;
    private final Input<Integer> displayOrder;
    private final String id;
    private final Input<Boolean> isArchived;
    private final Input<Boolean> isMultiple;
    private final Input<Boolean> isSystemProperty;
    private final Input<String> parentObjectType;
    private final Input<List<CustomPropertyOptionsInput>> possibleValues;
    private final Input<String> propertyName;
    private final Input<String> scalarType;
    private final Input<String> updaedById;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> propertyName = Input.absent();
        private Input<String> displayName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> scalarType = Input.absent();
        private Input<CustomDataType> dataType = Input.absent();
        private Input<Boolean> isMultiple = Input.absent();
        private Input<String> parentObjectType = Input.absent();
        private Input<Boolean> isSystemProperty = Input.absent();
        private Input<List<CustomPropertyOptionsInput>> possibleValues = Input.absent();
        private Input<Boolean> isArchived = Input.absent();
        private Input<Integer> displayOrder = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updaedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCustomPropertyDefinitionsInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCustomPropertyDefinitionsInput(this.id, this.accountId, this.propertyName, this.displayName, this.description, this.scalarType, this.dataType, this.isMultiple, this.parentObjectType, this.isSystemProperty, this.possibleValues, this.isArchived, this.displayOrder, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder dataType(CustomDataType customDataType) {
            this.dataType = Input.fromNullable(customDataType);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder displayName(String str) {
            this.displayName = Input.fromNullable(str);
            return this;
        }

        public Builder displayOrder(Integer num) {
            this.displayOrder = Input.fromNullable(num);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
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

        public Builder isSystemProperty(Boolean bool) {
            this.isSystemProperty = Input.fromNullable(bool);
            return this;
        }

        public Builder parentObjectType(String str) {
            this.parentObjectType = Input.fromNullable(str);
            return this;
        }

        public Builder possibleValues(List<CustomPropertyOptionsInput> list) {
            this.possibleValues = Input.fromNullable(list);
            return this;
        }

        public Builder propertyName(String str) {
            this.propertyName = Input.fromNullable(str);
            return this;
        }

        public Builder scalarType(String str) {
            this.scalarType = Input.fromNullable(str);
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

    public UpdateCustomPropertyDefinitionsInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<CustomDataType> input6, Input<Boolean> input7, Input<String> input8, Input<Boolean> input9, Input<List<CustomPropertyOptionsInput>> input10, Input<Boolean> input11, Input<Integer> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16) {
        this.id = str;
        this.accountId = input;
        this.propertyName = input2;
        this.displayName = input3;
        this.description = input4;
        this.scalarType = input5;
        this.dataType = input6;
        this.isMultiple = input7;
        this.parentObjectType = input8;
        this.isSystemProperty = input9;
        this.possibleValues = input10;
        this.isArchived = input11;
        this.displayOrder = input12;
        this.createdById = input13;
        this.updaedById = input14;
        this.createdAt = input15;
        this.updatedAt = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public CustomDataType dataType() {
        return this.dataType.value;
    }

    public String description() {
        return this.description.value;
    }

    public String displayName() {
        return this.displayName.value;
    }

    public Integer displayOrder() {
        return this.displayOrder.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean isArchived() {
        return this.isArchived.value;
    }

    public Boolean isMultiple() {
        return this.isMultiple.value;
    }

    public Boolean isSystemProperty() {
        return this.isSystemProperty.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomPropertyDefinitionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCustomPropertyDefinitionsInput.this.id);
                if (UpdateCustomPropertyDefinitionsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCustomPropertyDefinitionsInput.this.accountId.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.propertyName.defined) {
                    inputFieldWriter.writeString("propertyName", (String) UpdateCustomPropertyDefinitionsInput.this.propertyName.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.displayName.defined) {
                    inputFieldWriter.writeString("displayName", (String) UpdateCustomPropertyDefinitionsInput.this.displayName.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateCustomPropertyDefinitionsInput.this.description.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.scalarType.defined) {
                    inputFieldWriter.writeString("scalarType", (String) UpdateCustomPropertyDefinitionsInput.this.scalarType.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.dataType.defined) {
                    inputFieldWriter.writeString("dataType", UpdateCustomPropertyDefinitionsInput.this.dataType.value != 0 ? ((CustomDataType) UpdateCustomPropertyDefinitionsInput.this.dataType.value).name() : null);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.isMultiple.defined) {
                    inputFieldWriter.writeBoolean("isMultiple", (Boolean) UpdateCustomPropertyDefinitionsInput.this.isMultiple.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeString("parentObjectType", (String) UpdateCustomPropertyDefinitionsInput.this.parentObjectType.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.isSystemProperty.defined) {
                    inputFieldWriter.writeBoolean("isSystemProperty", (Boolean) UpdateCustomPropertyDefinitionsInput.this.isSystemProperty.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.possibleValues.defined) {
                    inputFieldWriter.writeList("possibleValues", UpdateCustomPropertyDefinitionsInput.this.possibleValues.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCustomPropertyDefinitionsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCustomPropertyDefinitionsInput.this.possibleValues.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((CustomPropertyOptionsInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.isArchived.defined) {
                    inputFieldWriter.writeBoolean("isArchived", (Boolean) UpdateCustomPropertyDefinitionsInput.this.isArchived.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.displayOrder.defined) {
                    inputFieldWriter.writeInt("displayOrder", (Integer) UpdateCustomPropertyDefinitionsInput.this.displayOrder.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateCustomPropertyDefinitionsInput.this.createdById.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.updaedById.defined) {
                    inputFieldWriter.writeString("updaedById", (String) UpdateCustomPropertyDefinitionsInput.this.updaedById.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCustomPropertyDefinitionsInput.this.createdAt.value);
                }
                if (UpdateCustomPropertyDefinitionsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCustomPropertyDefinitionsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String parentObjectType() {
        return this.parentObjectType.value;
    }

    public List<CustomPropertyOptionsInput> possibleValues() {
        return this.possibleValues.value;
    }

    public String propertyName() {
        return this.propertyName.value;
    }

    public String scalarType() {
        return this.scalarType.value;
    }

    public String updaedById() {
        return this.updaedById.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
