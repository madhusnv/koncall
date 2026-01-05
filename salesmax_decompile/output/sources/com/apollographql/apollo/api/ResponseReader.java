package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;

/* loaded from: classes5.dex */
public interface ResponseReader {

    public interface ConditionalTypeReader<T> {
        T read(String str, ResponseReader responseReader);
    }

    public interface ListItemReader {
        Boolean readBoolean();

        <T> T readCustomType(ScalarType scalarType);

        Double readDouble();

        Integer readInt();

        <T> List<T> readList(ListReader<T> listReader);

        Long readLong();

        <T> T readObject(ObjectReader<T> objectReader);

        String readString();
    }

    public interface ListReader<T> {
        T read(ListItemReader listItemReader);
    }

    public interface ObjectReader<T> {
        T read(ResponseReader responseReader);
    }

    Boolean readBoolean(ResponseField responseField);

    <T> T readConditional(ResponseField responseField, ConditionalTypeReader<T> conditionalTypeReader);

    <T> T readCustomType(ResponseField.CustomTypeField customTypeField);

    Double readDouble(ResponseField responseField);

    Integer readInt(ResponseField responseField);

    <T> List<T> readList(ResponseField responseField, ListReader<T> listReader);

    Long readLong(ResponseField responseField);

    <T> T readObject(ResponseField responseField, ObjectReader<T> objectReader);

    String readString(ResponseField responseField);
}
