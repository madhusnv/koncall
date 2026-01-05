package ae;

import android.webkit.MimeTypeMap;
import b00.AbstractC0532q;
import b00.a0;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import uw.InterfaceC7559c;
import yd.C8632o;
import yd.EnumC8622e;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.i */
/* loaded from: classes.dex */
public final class C0128i implements InterfaceC0127h {

    /* renamed from: a */
    public final File f410a;

    public C0128i(File file) {
        this.f410a = file;
    }

    @Override // ae.InterfaceC0127h
    /* renamed from: a */
    public final Object mo300a(InterfaceC7559c interfaceC7559c) {
        String str = a0.f3585b;
        File file = this.f410a;
        C8632o c8632o = new C8632o(C8687a.m16038o(file), AbstractC0532q.f3663a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        AbstractC4154l.m8922e(name, "getName(...)");
        return new C0133n(c8632o, singleton.getMimeTypeFromExtension(AbstractC5178p.b0('.', name, "")), EnumC8622e.DISK);
    }
}
