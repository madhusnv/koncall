package lj;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import mj.C4759g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lj.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C4478a implements InterfaceC3778c {

    /* renamed from: a */
    public final /* synthetic */ int f22302a;

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        switch (this.f22302a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
                interfaceC3779d.mo8302a(C4759g.f23753g, entry.getKey());
                interfaceC3779d.mo8302a(C4759g.f23754h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
