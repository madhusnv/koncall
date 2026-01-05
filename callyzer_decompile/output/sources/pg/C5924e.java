package pg;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C5924e implements InterfaceC3778c {

    /* renamed from: b */
    public static final /* synthetic */ C5924e f28820b = new C5924e(0);

    /* renamed from: c */
    public static final /* synthetic */ C5924e f28821c = new C5924e(1);

    /* renamed from: a */
    public final /* synthetic */ int f28822a;

    public /* synthetic */ C5924e(int i10) {
        this.f28822a = i10;
    }

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        switch (this.f28822a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
                interfaceC3779d.mo8302a(C5925f.f28830g, entry.getKey());
                interfaceC3779d.mo8302a(C5925f.f28831h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
