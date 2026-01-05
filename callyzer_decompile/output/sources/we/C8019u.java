package we;

import a2.AbstractC0030c;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.u */
/* loaded from: classes.dex */
public final class C8019u {

    /* renamed from: a */
    public final long f38539a;

    public C8019u(long j6) {
        this.f38539a = j6;
    }

    /* renamed from: a */
    public static C8019u m15168a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C8019u(Long.parseLong(jsonReader.nextString())) : new C8019u(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C8019u) && this.f38539a == ((C8019u) obj).f38539a;
    }

    public final int hashCode() {
        long j6 = this.f38539a;
        return ((int) ((j6 >>> 32) ^ j6)) ^ 1000003;
    }

    public final String toString() {
        return AbstractC0030c.m116g(this.f38539a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
