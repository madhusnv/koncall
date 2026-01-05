package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSupportQueriesFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelSupportQueriesFilterInput>> and;
    private final Input<ModelStringInput> category;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> id;
    private final Input<ModelSupportQueriesFilterInput> not;
    private final Input<List<ModelSupportQueriesFilterInput>> or;
    private final Input<ModelStringInput> query;
    private final Input<ModelStringInput> queryType;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> query = Input.absent();
        private Input<ModelStringInput> category = Input.absent();
        private Input<ModelStringInput> queryType = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<List<ModelSupportQueriesFilterInput>> and = Input.absent();
        private Input<List<ModelSupportQueriesFilterInput>> or = Input.absent();
        private Input<ModelSupportQueriesFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelSupportQueriesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelSupportQueriesFilterInput build() {
            return new ModelSupportQueriesFilterInput(this.id, this.accountId, this.userId, this.query, this.category, this.queryType, this.createdAt, this.and, this.or, this.not);
        }

        public Builder category(ModelStringInput modelStringInput) {
            this.category = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelSupportQueriesFilterInput modelSupportQueriesFilterInput) {
            this.not = Input.fromNullable(modelSupportQueriesFilterInput);
            return this;
        }

        public Builder or(List<ModelSupportQueriesFilterInput> list) {
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

    public ModelSupportQueriesFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelSupportQueriesFilterInput>> input8, Input<List<ModelSupportQueriesFilterInput>> input9, Input<ModelSupportQueriesFilterInput> input10) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.query = input4;
        this.category = input5;
        this.queryType = input6;
        this.createdAt = input7;
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

    public List<ModelSupportQueriesFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput category() {
        return this.category.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSupportQueriesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSupportQueriesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelSupportQueriesFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelSupportQueriesFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSupportQueriesFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSupportQueriesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelSupportQueriesFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelSupportQueriesFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.query.defined) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, ModelSupportQueriesFilterInput.this.query.value != 0 ? ((ModelStringInput) ModelSupportQueriesFilterInput.this.query.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelSupportQueriesFilterInput.this.category.value != 0 ? ((ModelStringInput) ModelSupportQueriesFilterInput.this.category.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.queryType.defined) {
                    inputFieldWriter.writeObject("queryType", ModelSupportQueriesFilterInput.this.queryType.value != 0 ? ((ModelStringInput) ModelSupportQueriesFilterInput.this.queryType.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSupportQueriesFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSupportQueriesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSupportQueriesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSupportQueriesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSupportQueriesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSupportQueriesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSupportQueriesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSupportQueriesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSupportQueriesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSupportQueriesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSupportQueriesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSupportQueriesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSupportQueriesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSupportQueriesFilterInput.this.not.value != 0 ? ((ModelSupportQueriesFilterInput) ModelSupportQueriesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSupportQueriesFilterInput not() {
        return this.not.value;
    }

    public List<ModelSupportQueriesFilterInput> or() {
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
