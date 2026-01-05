package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;

/* loaded from: classes5.dex */
public interface ResponseWriter {

    public interface ListItemWriter {
        void writeBoolean(Object obj);

        void writeCustom(ScalarType scalarType, Object obj);

        void writeDouble(Object obj);

        void writeInt(Object obj);

        void writeLong(Object obj);

        void writeObject(ResponseFieldMarshaller responseFieldMarshaller);

        void writeString(Object obj);
    }

    public interface ListWriter {
        void write(Object obj, ListItemWriter listItemWriter);
    }

    void writeBoolean(ResponseField responseField, Boolean bool);

    void writeCustom(ResponseField.CustomTypeField customTypeField, Object obj);

    void writeDouble(ResponseField responseField, Double d);

    void writeInt(ResponseField responseField, Integer num);

    void writeList(ResponseField responseField, List list, ListWriter listWriter);

    void writeLong(ResponseField responseField, Long l);

    void writeObject(ResponseField responseField, ResponseFieldMarshaller responseFieldMarshaller);

    void writeString(ResponseField responseField, String str);
}
