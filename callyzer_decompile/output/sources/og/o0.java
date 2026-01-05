package og;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements InterfaceC3778c {

    /* renamed from: a */
    public final /* synthetic */ int f26682a;

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        switch (this.f26682a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
                interfaceC3779d.mo8302a(p0.f26716g, entry.getKey());
                interfaceC3779d.mo8302a(p0.f26717h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
