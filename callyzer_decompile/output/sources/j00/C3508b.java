package j00;

import b00.C0525j;
import b00.C0526k;
import b00.C0529n;
import i00.InterfaceC3106k;
import iz.C3393z;
import iz.g0;
import iz.i0;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kk.AbstractC4103w;
import kk.C4088h;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;
import pg.h7;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j00.b */
/* loaded from: classes3.dex */
public final class C3508b implements InterfaceC3106k {

    /* renamed from: c */
    public static final C3393z f18379c;

    /* renamed from: a */
    public final C4088h f18380a;

    /* renamed from: b */
    public final AbstractC4103w f18381b;

    static {
        C5176n c5176n = C3393z.f18000e;
        f18379c = h7.m11676d("application/json; charset=UTF-8");
    }

    public C3508b(C4088h c4088h, AbstractC4103w abstractC4103w) {
        this.f18380a = c4088h;
        this.f18381b = abstractC4103w;
    }

    @Override // i00.InterfaceC3106k
    /* renamed from: b */
    public final Object mo2700b(Object obj) throws IOException {
        C0526k c0526k = new C0526k();
        C6566c c6566cM8860g = this.f18380a.m8860g(new OutputStreamWriter(new C0525j(c0526k), StandardCharsets.UTF_8));
        this.f18381b.mo8852c(c6566cM8860g, obj);
        c6566cM8860g.close();
        C0529n content = c0526k.mo1549o(c0526k.f3638b);
        int i10 = i0.f17889a;
        AbstractC4154l.m8923f(content, "content");
        return new g0(f18379c, content);
    }
}
