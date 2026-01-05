package nw;

import jakarta.activation.UnsupportedDataTypeException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.l */
/* loaded from: classes3.dex */
public final class C5162l implements InterfaceC5153c {

    /* renamed from: a */
    public Object f25242a;

    /* renamed from: b */
    public String f25243b;

    /* renamed from: c */
    public InterfaceC5153c f25244c;

    @Override // nw.InterfaceC5153c
    public final Object getContent(InterfaceC5156f interfaceC5156f) {
        return this.f25242a;
    }

    @Override // nw.InterfaceC5153c
    public final void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        InterfaceC5153c interfaceC5153c = this.f25244c;
        if (interfaceC5153c != null) {
            interfaceC5153c.writeTo(obj, str, outputStream);
            return;
        }
        if (obj instanceof byte[]) {
            outputStream.write((byte[]) obj);
            return;
        }
        if (!(obj instanceof String)) {
            throw new UnsupportedDataTypeException("no object DCH for MIME type " + this.f25243b);
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write((String) obj);
        outputStreamWriter.flush();
    }
}
