package nw;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.e */
/* loaded from: classes3.dex */
public class C5155e implements InterfaceC5156f {

    /* renamed from: a */
    public final /* synthetic */ int f25230a = 0;

    /* renamed from: b */
    public Object f25231b;

    public /* synthetic */ C5155e() {
    }

    @Override // nw.InterfaceC5156f
    public String getContentType() {
        switch (this.f25230a) {
            case 0:
                return ((C5154d) this.f25231b).m10063c();
            default:
                return ((C5161k) AbstractC5158h.m10068b()).mo10069a(((File) this.f25231b).getName());
        }
    }

    @Override // nw.InterfaceC5156f
    public final InputStream getInputStream() {
        switch (this.f25230a) {
            case 0:
                return ((C5154d) this.f25231b).m10065e();
            default:
                return new FileInputStream((File) this.f25231b);
        }
    }

    @Override // nw.InterfaceC5156f
    public final String getName() {
        switch (this.f25230a) {
            case 0:
                return ((C5154d) this.f25231b).m10066f();
            default:
                return ((File) this.f25231b).getName();
        }
    }

    public C5155e(File file) {
        this.f25231b = file;
    }
}
