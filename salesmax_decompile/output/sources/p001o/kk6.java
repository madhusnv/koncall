package p001o;

import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class kk6 {

    /* renamed from: a */
    public final ByteArrayOutputStream f32328a;

    /* renamed from: b */
    public final DataOutputStream f32329b;

    public kk6() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f32328a = byteArrayOutputStream;
        this.f32329b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m35801b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] m35802a(EventMessage eventMessage) throws IOException {
        this.f32328a.reset();
        try {
            m35801b(this.f32329b, eventMessage.f8636a);
            String str = eventMessage.f8637b;
            if (str == null) {
                str = "";
            }
            m35801b(this.f32329b, str);
            this.f32329b.writeLong(eventMessage.f8638c);
            this.f32329b.writeLong(eventMessage.f8639d);
            this.f32329b.write(eventMessage.f8640e);
            this.f32329b.flush();
            return this.f32328a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
