package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDistributedEntityTypeListInput implements InputType {
    private final Input<DistributedEntityType> contains;
    private final Input<List<DistributedEntityType>> eq;
    private final Input<List<DistributedEntityType>> ne;
    private final Input<DistributedEntityType> notContains;

    public static final class Builder {
        private Input<List<DistributedEntityType>> eq = Input.absent();
        private Input<List<DistributedEntityType>> ne = Input.absent();
        private Input<DistributedEntityType> contains = Input.absent();
        private Input<DistributedEntityType> notContains = Input.absent();

        public ModelDistributedEntityTypeListInput build() {
            return new ModelDistributedEntityTypeListInput(this.eq, this.ne, this.contains, this.notContains);
        }

        public Builder contains(DistributedEntityType distributedEntityType) {
            this.contains = Input.fromNullable(distributedEntityType);
            return this;
        }

        public Builder eq(List<DistributedEntityType> list) {
            this.eq = Input.fromNullable(list);
            return this;
        }

        public Builder ne(List<DistributedEntityType> list) {
            this.ne = Input.fromNullable(list);
            return this;
        }

        public Builder notContains(DistributedEntityType distributedEntityType) {
            this.notContains = Input.fromNullable(distributedEntityType);
            return this;
        }
    }

    public ModelDistributedEntityTypeListInput(Input<List<DistributedEntityType>> input, Input<List<DistributedEntityType>> input2, Input<DistributedEntityType> input3, Input<DistributedEntityType> input4) {
        this.eq = input;
        this.ne = input2;
        this.contains = input3;
        this.notContains = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DistributedEntityType contains() {
        return this.contains.value;
    }

    public List<DistributedEntityType> eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDistributedEntityTypeListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDistributedEntityTypeListInput.this.eq.defined) {
                    inputFieldWriter.writeList("eq", ModelDistributedEntityTypeListInput.this.eq.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributedEntityTypeListInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDistributedEntityTypeListInput.this.eq.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((DistributedEntityType) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (ModelDistributedEntityTypeListInput.this.ne.defined) {
                    inputFieldWriter.writeList("ne", ModelDistributedEntityTypeListInput.this.ne.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDistributedEntityTypeListInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDistributedEntityTypeListInput.this.ne.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((DistributedEntityType) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (ModelDistributedEntityTypeListInput.this.contains.defined) {
                    inputFieldWriter.writeString("contains", ModelDistributedEntityTypeListInput.this.contains.value != 0 ? ((DistributedEntityType) ModelDistributedEntityTypeListInput.this.contains.value).name() : null);
                }
                if (ModelDistributedEntityTypeListInput.this.notContains.defined) {
                    inputFieldWriter.writeString("notContains", ModelDistributedEntityTypeListInput.this.notContains.value != 0 ? ((DistributedEntityType) ModelDistributedEntityTypeListInput.this.notContains.value).name() : null);
                }
            }
        };
    }

    public List<DistributedEntityType> ne() {
        return this.ne.value;
    }

    public DistributedEntityType notContains() {
        return this.notContains.value;
    }
}
