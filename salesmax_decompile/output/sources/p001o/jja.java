package p001o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes5.dex */
public abstract class jja {
    /* renamed from: a */
    public static jja m33876a(long j) {
        return new y41(j);
    }

    /* renamed from: b */
    public static jja m33877b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m33876a(Long.parseLong(jsonReader.nextString())) : m33876a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo33878c();
}
