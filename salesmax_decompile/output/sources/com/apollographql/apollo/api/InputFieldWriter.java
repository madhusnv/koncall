package com.apollographql.apollo.api;

/* loaded from: classes5.dex */
public interface InputFieldWriter {

    public interface ListItemWriter {
        void writeBoolean(Boolean bool);

        void writeCustom(ScalarType scalarType, Object obj);

        void writeDouble(Double d);

        void writeInt(Integer num);

        void writeLong(Long l);

        void writeObject(InputFieldMarshaller inputFieldMarshaller);

        void writeString(String str);
    }

    public interface ListWriter {
        void write(ListItemWriter listItemWriter);
    }

    void writeBoolean(String str, Boolean bool);

    void writeCustom(String str, ScalarType scalarType, Object obj);

    void writeDouble(String str, Double d);

    void writeInt(String str, Integer num);

    void writeList(String str, ListWriter listWriter);

    void writeLong(String str, Long l);

    void writeObject(String str, InputFieldMarshaller inputFieldMarshaller);

    void writeString(String str, String str2);
}
