package com.amplifyframework.datastore.syncengine;

import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class TimeBasedUuidTypeAdapter extends TypeAdapter<TimeBasedUuid> {
    public static void register(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(TimeBasedUuid.class, new TimeBasedUuidTypeAdapter());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public TimeBasedUuid read2(JsonReader jsonReader) {
        return TimeBasedUuid.fromString(jsonReader.nextString());
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, TimeBasedUuid timeBasedUuid) throws IOException {
        jsonWriter.jsonValue(timeBasedUuid.toString());
    }
}
