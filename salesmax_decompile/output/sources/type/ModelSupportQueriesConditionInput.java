package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.actions.SearchIntents;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSupportQueriesConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelSupportQueriesConditionInput>> and;
    private final Input<ModelStringInput> category;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelSupportQueriesConditionInput> not;
    private final Input<List<ModelSupportQueriesConditionInput>> or;
    private final Input<ModelStringInput> query;
    private final Input<ModelStringInput> queryType;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> query = Input.absent();
        private Input<ModelStringInput> category = Input.absent();
        private Input<ModelStringInput> queryType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<List<ModelSupportQueriesConditionInput>> and = Input.absent();
        private Input<List<ModelSupportQueriesConditionInput>> or = Input.absent();
        private Input<ModelSupportQueriesConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelSupportQueriesConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelSupportQueriesConditionInput build() {
            return new ModelSupportQueriesConditionInput(this.accountId, this.userId, this.query, this.category, this.queryType, this.createdAt, this.and, this.or, this.not);
        }

        public Builder category(ModelStringInput modelStringInput) {
            this.category = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
            this.not = Input.fromNullable(modelSupportQueriesConditionInput);
            return this;
        }

        public Builder or(List<ModelSupportQueriesConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder query(ModelStringInput modelStringInput) {
            this.query = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder queryType(ModelStringInput modelStringInput) {
            this.queryType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelSupportQueriesConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<List<ModelSupportQueriesConditionInput>> input7, Input<List<ModelSupportQueriesConditionInput>> input8, Input<ModelSupportQueriesConditionInput> input9) {
        this.accountId = input;
        this.userId = input2;
        this.query = input3;
        this.category = input4;
        this.queryType = input5;
        this.createdAt = input6;
        this.and = input7;
        this.or = input8;
        this.not = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelSupportQueriesConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput category() {
        return this.category.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSupportQueriesConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSupportQueriesConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSupportQueriesConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSupportQueriesConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSupportQueriesConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelSupportQueriesConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelSupportQueriesConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelSupportQueriesConditionInput.this.query.defined) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, ModelSupportQueriesConditionInput.this.query.value != 0 ? ((ModelStringInput) ModelSupportQueriesConditionInput.this.query.value).marshaller() : null);
                }
                if (ModelSupportQueriesConditionInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelSupportQueriesConditionInput.this.category.value != 0 ? ((ModelStringInput) ModelSupportQueriesConditionInput.this.category.value).marshaller() : null);
                }
                if (ModelSupportQueriesConditionInput.this.queryType.defined) {
                    inputFieldWriter.writeObject("queryType", ModelSupportQueriesConditionInput.this.queryType.value != 0 ? ((ModelStringInput) ModelSupportQueriesConditionInput.this.queryType.value).marshaller() : null);
                }
                if (ModelSupportQueriesConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSupportQueriesConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSupportQueriesConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSupportQueriesConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSupportQueriesConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSupportQueriesConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSupportQueriesConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSupportQueriesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSupportQueriesConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSupportQueriesConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSupportQueriesConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSupportQueriesConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSupportQueriesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSupportQueriesConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSupportQueriesConditionInput.this.not.value != 0 ? ((ModelSupportQueriesConditionInput) ModelSupportQueriesConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSupportQueriesConditionInput not() {
        return this.not.value;
    }

    public List<ModelSupportQueriesConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput query() {
        return this.query.value;
    }

    public ModelStringInput queryType() {
        return this.queryType.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
