package nw;

import jakarta.activation.UnsupportedDataTypeException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.g */
/* loaded from: classes3.dex */
public final class C5157g implements InterfaceC5153c {

    /* renamed from: a */
    public InterfaceC5156f f25232a;

    /* renamed from: b */
    public InterfaceC5153c f25233b;

    @Override // nw.InterfaceC5153c
    public final Object getContent(InterfaceC5156f interfaceC5156f) {
        InterfaceC5153c interfaceC5153c = this.f25233b;
        return interfaceC5153c != null ? interfaceC5153c.getContent(interfaceC5156f) : interfaceC5156f.getInputStream();
    }

    @Override // nw.InterfaceC5153c
    public final void writeTo(Object obj, String str, OutputStream outputStream) throws UnsupportedDataTypeException {
        InterfaceC5153c interfaceC5153c = this.f25233b;
        if (interfaceC5153c != null) {
            interfaceC5153c.writeTo(obj, str, outputStream);
        } else {
            throw new UnsupportedDataTypeException("no DCH for content type " + this.f25232a.getContentType());
        }
    }
}
