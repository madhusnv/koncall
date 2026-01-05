package com.amplifyframework.core.model.temporal;

import com.amplifyframework.core.model.temporal.Temporal;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class GsonTemporalAdapters {

    public static final class DateAdapter implements JsonSerializer<Temporal.Date>, JsonDeserializer<Temporal.Date> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Temporal.Date deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            try {
                return new Temporal.Date(jsonElement.getAsString());
            } catch (IllegalArgumentException e) {
                throw new JsonParseException("Failed to deserialize " + jsonElement.getAsString() + " as a Temporal.Date due to " + e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Temporal.Date date, Type type2, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(date.format());
        }
    }

    public static final class DateTimeAdapter implements JsonSerializer<Temporal.DateTime>, JsonDeserializer<Temporal.DateTime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Temporal.DateTime deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            try {
                return new Temporal.DateTime(jsonElement.getAsString());
            } catch (IllegalArgumentException e) {
                throw new JsonParseException("Failed to deserialize " + jsonElement.getAsString() + " as a Temporal.DateTime due to " + e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Temporal.DateTime dateTime, Type type2, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(dateTime.format());
        }
    }

    public static final class JavaDateAdapter implements JsonSerializer<Date> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Date date, Type type2, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date));
        }
    }

    public static final class TimeAdapter implements JsonSerializer<Temporal.Time>, JsonDeserializer<Temporal.Time> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Temporal.Time deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            try {
                return new Temporal.Time(jsonElement.getAsString());
            } catch (IllegalArgumentException e) {
                throw new JsonParseException("Failed to deserialize " + jsonElement.getAsString() + " as a Temporal.Time due to " + e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Temporal.Time time, Type type2, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(time.format());
        }
    }

    public static final class TimestampAdapter implements JsonSerializer<Temporal.Timestamp>, JsonDeserializer<Temporal.Timestamp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Temporal.Timestamp deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            return new Temporal.Timestamp(jsonElement.getAsLong(), TimeUnit.SECONDS);
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Temporal.Timestamp timestamp, Type type2, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Long.valueOf(timestamp.getSecondsSinceEpoch()));
        }
    }

    private GsonTemporalAdapters() {
    }

    public static void register(GsonBuilder gsonBuilder) {
        Objects.requireNonNull(gsonBuilder);
        gsonBuilder.registerTypeAdapter(Temporal.Date.class, new DateAdapter());
        gsonBuilder.registerTypeAdapter(Temporal.DateTime.class, new DateTimeAdapter());
        gsonBuilder.registerTypeAdapter(Temporal.Timestamp.class, new TimestampAdapter());
        gsonBuilder.registerTypeAdapter(Temporal.Time.class, new TimeAdapter());
        gsonBuilder.registerTypeAdapter(Date.class, new JavaDateAdapter());
    }
}
