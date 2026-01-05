package mk;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import kk.AbstractC4103w;
import kk.C4088h;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.d */
/* loaded from: classes.dex */
public final class C4765d extends AbstractC4103w {

    /* renamed from: a */
    public volatile AbstractC4103w f23772a;

    /* renamed from: b */
    public final /* synthetic */ boolean f23773b;

    /* renamed from: c */
    public final /* synthetic */ boolean f23774c;

    /* renamed from: d */
    public final /* synthetic */ C4088h f23775d;

    /* renamed from: e */
    public final /* synthetic */ TypeToken f23776e;

    /* renamed from: f */
    public final /* synthetic */ C4766e f23777f;

    public C4765d(C4766e c4766e, boolean z6, boolean z10, C4088h c4088h, TypeToken typeToken) {
        this.f23777f = c4766e;
        this.f23773b = z6;
        this.f23774c = z10;
        this.f23775d = c4088h;
        this.f23776e = typeToken;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        if (this.f23773b) {
            c6564a.L0();
            return null;
        }
        AbstractC4103w abstractC4103wM8859f = this.f23772a;
        if (abstractC4103wM8859f == null) {
            abstractC4103wM8859f = this.f23775d.m8859f(this.f23777f, this.f23776e);
            this.f23772a = abstractC4103wM8859f;
        }
        return abstractC4103wM8859f.mo8851b(c6564a);
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        if (this.f23774c) {
            c6566c.mo10029J();
            return;
        }
        AbstractC4103w abstractC4103wM8859f = this.f23772a;
        if (abstractC4103wM8859f == null) {
            abstractC4103wM8859f = this.f23775d.m8859f(this.f23777f, this.f23776e);
            this.f23772a = abstractC4103wM8859f;
        }
        abstractC4103wM8859f.mo8852c(c6566c, obj);
    }
}
