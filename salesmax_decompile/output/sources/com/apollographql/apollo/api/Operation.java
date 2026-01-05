package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.Operation.Variables;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public interface Operation<D extends Data, T, V extends Variables> {
    public static final Variables EMPTY_VARIABLES = new Variables();

    public interface Data {
        ResponseFieldMarshaller marshaller();
    }

    public static class Variables {
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.apollographql.apollo.api.Operation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                }
            };
        }

        public Map<String, Object> valueMap() {
            return Collections.emptyMap();
        }
    }

    OperationName name();

    String operationId();

    String queryDocument();

    ResponseFieldMapper<D> responseFieldMapper();

    V variables();

    T wrapData(D d);
}
