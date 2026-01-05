package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.actions.SearchIntents;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.QueryGetOverallAttendanceCountBodyInput;
import type.QueryGetOverallAttendanceCountQueryInput;

/* loaded from: classes7.dex */
public final class GetOverallAttendanceCountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetOverallAttendanceCount($query: QueryGetOverallAttendanceCountQueryInput, $body: QueryGetOverallAttendanceCountBodyInput) {\n  getOverallAttendanceCount(query: $query, body: $body) {\n    __typename\n    dayOfAttendance\n    marked\n    notMarked\n    onLeave\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetOverallAttendanceCount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetOverallAttendanceCount($query: QueryGetOverallAttendanceCountQueryInput, $body: QueryGetOverallAttendanceCountBodyInput) {\n  getOverallAttendanceCount(query: $query, body: $body) {\n    __typename\n    dayOfAttendance\n    marked\n    notMarked\n    onLeave\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryGetOverallAttendanceCountBodyInput body;
        private QueryGetOverallAttendanceCountQueryInput query;

        public Builder body(QueryGetOverallAttendanceCountBodyInput queryGetOverallAttendanceCountBodyInput) {
            this.body = queryGetOverallAttendanceCountBodyInput;
            return this;
        }

        public GetOverallAttendanceCountQuery build() {
            return new GetOverallAttendanceCountQuery(this.query, this.body);
        }

        public Builder query(QueryGetOverallAttendanceCountQueryInput queryGetOverallAttendanceCountQueryInput) {
            this.query = queryGetOverallAttendanceCountQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("getOverallAttendanceCount", "getOverallAttendanceCount", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final List<GetOverallAttendanceCount> getOverallAttendanceCount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetOverallAttendanceCount.Mapper getOverallAttendanceCountFieldMapper = new GetOverallAttendanceCount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<GetOverallAttendanceCount>() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public GetOverallAttendanceCount read(ResponseReader.ListItemReader listItemReader) {
                        return (GetOverallAttendanceCount) listItemReader.readObject(new ResponseReader.ObjectReader<GetOverallAttendanceCount>() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.Data.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public GetOverallAttendanceCount read(ResponseReader responseReader2) {
                                return Mapper.this.getOverallAttendanceCountFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }));
            }
        }

        public Data(List<GetOverallAttendanceCount> list) {
            this.getOverallAttendanceCount = list;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            List<GetOverallAttendanceCount> list = this.getOverallAttendanceCount;
            List<GetOverallAttendanceCount> list2 = ((Data) obj).getOverallAttendanceCount;
            return list == null ? list2 == null : list.equals(list2);
        }

        public List<GetOverallAttendanceCount> getOverallAttendanceCount() {
            return this.getOverallAttendanceCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<GetOverallAttendanceCount> list = this.getOverallAttendanceCount;
                this.$hashCode = (list == null ? 0 : list.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.getOverallAttendanceCount, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.Data.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((GetOverallAttendanceCount) obj).marshaller());
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getOverallAttendanceCount=" + this.getOverallAttendanceCount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetOverallAttendanceCount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("dayOfAttendance", "dayOfAttendance", null, true, CustomType.AWSDATE, Collections.emptyList()), ResponseField.forInt("marked", "marked", null, true, Collections.emptyList()), ResponseField.forInt("notMarked", "notMarked", null, true, Collections.emptyList()), ResponseField.forInt("onLeave", "onLeave", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String dayOfAttendance;
        final Integer marked;
        final Integer notMarked;
        final Integer onLeave;

        public static final class Mapper implements ResponseFieldMapper<GetOverallAttendanceCount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetOverallAttendanceCount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetOverallAttendanceCount.$responseFields;
                return new GetOverallAttendanceCount(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readInt(responseFieldArr[4]));
            }
        }

        public GetOverallAttendanceCount(String str, String str2, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.dayOfAttendance = str2;
            this.marked = num;
            this.notMarked = num2;
            this.onLeave = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String dayOfAttendance() {
            return this.dayOfAttendance;
        }

        public boolean equals(Object obj) {
            String str;
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetOverallAttendanceCount)) {
                return false;
            }
            GetOverallAttendanceCount getOverallAttendanceCount = (GetOverallAttendanceCount) obj;
            if (this.__typename.equals(getOverallAttendanceCount.__typename) && ((str = this.dayOfAttendance) != null ? str.equals(getOverallAttendanceCount.dayOfAttendance) : getOverallAttendanceCount.dayOfAttendance == null) && ((num = this.marked) != null ? num.equals(getOverallAttendanceCount.marked) : getOverallAttendanceCount.marked == null) && ((num2 = this.notMarked) != null ? num2.equals(getOverallAttendanceCount.notMarked) : getOverallAttendanceCount.notMarked == null)) {
                Integer num3 = this.onLeave;
                Integer num4 = getOverallAttendanceCount.onLeave;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.dayOfAttendance;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Integer num = this.marked;
                int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.notMarked;
                int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.onLeave;
                this.$hashCode = iHashCode4 ^ (num3 != null ? num3.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Integer marked() {
            return this.marked;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.GetOverallAttendanceCount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetOverallAttendanceCount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetOverallAttendanceCount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetOverallAttendanceCount.this.dayOfAttendance);
                    responseWriter.writeInt(responseFieldArr[2], GetOverallAttendanceCount.this.marked);
                    responseWriter.writeInt(responseFieldArr[3], GetOverallAttendanceCount.this.notMarked);
                    responseWriter.writeInt(responseFieldArr[4], GetOverallAttendanceCount.this.onLeave);
                }
            };
        }

        public Integer notMarked() {
            return this.notMarked;
        }

        public Integer onLeave() {
            return this.onLeave;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetOverallAttendanceCount{__typename=" + this.__typename + ", dayOfAttendance=" + this.dayOfAttendance + ", marked=" + this.marked + ", notMarked=" + this.notMarked + ", onLeave=" + this.onLeave + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryGetOverallAttendanceCountBodyInput body;
        private final QueryGetOverallAttendanceCountQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryGetOverallAttendanceCountQueryInput queryGetOverallAttendanceCountQueryInput, QueryGetOverallAttendanceCountBodyInput queryGetOverallAttendanceCountBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryGetOverallAttendanceCountQueryInput;
            this.body = queryGetOverallAttendanceCountBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryGetOverallAttendanceCountQueryInput);
            linkedHashMap.put("body", queryGetOverallAttendanceCountBodyInput);
        }

        public QueryGetOverallAttendanceCountBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetOverallAttendanceCountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public QueryGetOverallAttendanceCountQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetOverallAttendanceCountQuery(QueryGetOverallAttendanceCountQueryInput queryGetOverallAttendanceCountQueryInput, QueryGetOverallAttendanceCountBodyInput queryGetOverallAttendanceCountBodyInput) {
        this.variables = new Variables(queryGetOverallAttendanceCountQueryInput, queryGetOverallAttendanceCountBodyInput);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "5a0f46589738c0daa5eb5ec5df5b87f962c67173aea90c4aa2aa2898d8080ff2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetOverallAttendanceCount($query: QueryGetOverallAttendanceCountQueryInput, $body: QueryGetOverallAttendanceCountBodyInput) {\n  getOverallAttendanceCount(query: $query, body: $body) {\n    __typename\n    dayOfAttendance\n    marked\n    notMarked\n    onLeave\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Variables variables() {
        return this.variables;
    }
}
