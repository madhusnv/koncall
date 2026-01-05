package p001o;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

/* loaded from: classes6.dex */
public abstract class uih {
    /* renamed from: a */
    public static final long m51641a(Reader reader, Writer writer, int i) throws IOException {
        sq8.m48649h(reader, "<this>");
        sq8.m48649h(writer, "out");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m51642b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m51641a(reader, writer, i);
    }

    /* renamed from: c */
    public static final byte[] m51643c(URL url) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(url, "<this>");
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            sq8.m48646e(inputStreamOpenStream);
            byte[] bArrM54802c = wq1.m54802c(inputStreamOpenStream);
            tb3.m49666a(inputStreamOpenStream, null);
            return bArrM54802c;
        } finally {
        }
    }

    /* renamed from: d */
    public static final String m51644d(Reader reader) {
        sq8.m48649h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m51642b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
