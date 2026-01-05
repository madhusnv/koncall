package com.amplifyframework.core.model.types;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class GsonJavaTypeAdapters {

    public static final class ClassTypeAdapterFactory implements TypeAdapterFactory {

        public static final class ClassTypeAdapter extends TypeAdapter<Class<?>> {
            private static Class<?> boxForPrimitiveLabel(String str) {
                str.hashCode();
                switch (str) {
                    case "double":
                        return Double.class;
                    case "int":
                        return Integer.class;
                    case "byte":
                        return Byte.class;
                    case "char":
                        return Character.class;
                    case "long":
                        return Long.class;
                    case "void":
                        return Void.class;
                    case "boolean":
                        return Boolean.class;
                    case "float":
                        return Float.class;
                    case "short":
                        return Short.class;
                    default:
                        throw new IllegalArgumentException("No primitive with name = " + str);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public Class<?> read2(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    try {
                        return Class.forName(strNextString);
                    } catch (ClassNotFoundException unused) {
                        return boxForPrimitiveLabel(strNextString);
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IOException("Unable to deserialize class for " + strNextString);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Class<?> cls) throws IOException {
                if (cls == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(cls.getName());
                }
            }
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (Class.class.isAssignableFrom(typeToken.getRawType())) {
                return new ClassTypeAdapter();
            }
            return null;
        }
    }

    public static final class StringDeserializer implements JsonDeserializer<String> {
        @Override // com.google.gson.JsonDeserializer
        public String deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (jsonElement.isJsonPrimitive()) {
                return jsonElement.getAsJsonPrimitive().getAsString();
            }
            if (jsonElement.isJsonObject()) {
                return jsonElement.toString();
            }
            throw new JsonParseException("Failed to parse String from " + jsonElement);
        }
    }

    private GsonJavaTypeAdapters() {
    }

    public static void register(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(String.class, new StringDeserializer()).registerTypeAdapterFactory(new ClassTypeAdapterFactory());
    }
}
