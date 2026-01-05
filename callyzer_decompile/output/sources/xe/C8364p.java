package xe;

import a1.d0;
import cf.C0963a;
import cf.InterfaceC0965c;
import java.util.HashMap;
import s2.C6739h;
import ue.C7419a;
import ue.C7420b;
import ue.C7421c;
import ue.InterfaceC7423e;
import ue.InterfaceC7425g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.p */
/* loaded from: classes.dex */
public final class C8364p {

    /* renamed from: a */
    public final C8357i f40014a;

    /* renamed from: b */
    public final String f40015b;

    /* renamed from: c */
    public final C7421c f40016c;

    /* renamed from: d */
    public final InterfaceC7423e f40017d;

    /* renamed from: e */
    public final C8365q f40018e;

    public C8364p(C8357i c8357i, String str, C7421c c7421c, InterfaceC7423e interfaceC7423e, C8365q c8365q) {
        this.f40014a = c8357i;
        this.f40015b = str;
        this.f40016c = c7421c;
        this.f40017d = interfaceC7423e;
        this.f40018e = c8365q;
    }

    /* renamed from: a */
    public final void m15535a(C7419a c7419a, InterfaceC7425g interfaceC7425g) {
        InterfaceC7423e interfaceC7423e = this.f40017d;
        if (interfaceC7423e == null) {
            throw new NullPointerException("Null transformer");
        }
        C8365q c8365q = this.f40018e;
        InterfaceC0965c interfaceC0965c = c8365q.f40022c;
        C8357i c8357iM15533b = this.f40014a.m15533b(c7419a.f35226b);
        C6739h c6739h = new C6739h();
        c6739h.f32185f = new HashMap();
        c6739h.f32183d = Long.valueOf(c8365q.f40020a.getTime());
        c6739h.f32184e = Long.valueOf(c8365q.f40021b.getTime());
        c6739h.f32180a = this.f40015b;
        c6739h.f32182c = new C8360l(this.f40016c, (byte[]) interfaceC7423e.apply(c7419a.f35225a));
        c6739h.f32181b = null;
        C7420b c7420b = c7419a.f35227c;
        if (c7420b != null) {
            c6739h.f32186g = c7420b.f35228a;
        }
        C0963a c0963a = (C0963a) interfaceC0965c;
        c0963a.f5766b.execute(new d0(c0963a, c8357iM15533b, interfaceC7425g, c6739h.m12894b(), 1));
    }
}
