package p001o;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p001o.qyc;

/* loaded from: classes2.dex */
public final class g07 implements qyc.InterfaceC16488a {

    /* renamed from: a */
    public final qyc.InterfaceC16488a f24325a;

    /* renamed from: b */
    public final List f24326b;

    public g07(qyc.InterfaceC16488a interfaceC16488a, List list) {
        this.f24325a = interfaceC16488a;
        this.f24326b = list;
    }

    @Override // p001o.qyc.InterfaceC16488a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f07 mo6958a(Uri uri, InputStream inputStream) {
        f07 f07Var = (f07) this.f24325a.mo6958a(uri, inputStream);
        List list = this.f24326b;
        return (list == null || list.isEmpty()) ? f07Var : (f07) f07Var.mo22238a(this.f24326b);
    }
}
