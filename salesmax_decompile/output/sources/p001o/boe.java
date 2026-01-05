package p001o;

import java.io.File;
import java.util.List;
import p001o.gjb;
import p001o.lu4;
import p001o.mu4;

/* loaded from: classes5.dex */
public class boe implements mu4, lu4.InterfaceC15153a {

    /* renamed from: a */
    public final mu4.InterfaceC15433a f16630a;

    /* renamed from: b */
    public final t75 f16631b;

    /* renamed from: c */
    public int f16632c;

    /* renamed from: d */
    public int f16633d = -1;

    /* renamed from: e */
    public ic9 f16634e;

    /* renamed from: f */
    public List f16635f;

    /* renamed from: g */
    public int f16636g;

    /* renamed from: h */
    public volatile gjb.C13758a f16637h;

    /* renamed from: q */
    public File f16638q;

    /* renamed from: s */
    public coe f16639s;

    public boe(t75 t75Var, mu4.InterfaceC15433a interfaceC15433a) {
        this.f16631b = t75Var;
        this.f16630a = interfaceC15433a;
    }

    /* renamed from: a */
    public final boolean m19500a() {
        return this.f16636g < this.f16635f.size();
    }

    @Override // p001o.mu4
    /* renamed from: b */
    public boolean mo17834b() {
        et7.m25571a("ResourceCacheGenerator.startNext");
        try {
            List listM49503c = this.f16631b.m49503c();
            boolean z = false;
            if (listM49503c.isEmpty()) {
                return false;
            }
            List listM49513m = this.f16631b.m49513m();
            if (listM49513m.isEmpty()) {
                if (File.class.equals(this.f16631b.m49518r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f16631b.m49509i() + " to " + this.f16631b.m49518r());
            }
            while (true) {
                if (this.f16635f != null && m19500a()) {
                    this.f16637h = null;
                    while (!z && m19500a()) {
                        List list = this.f16635f;
                        int i = this.f16636g;
                        this.f16636g = i + 1;
                        this.f16637h = ((gjb) list.get(i)).mo18150b(this.f16638q, this.f16631b.m49520t(), this.f16631b.m49506f(), this.f16631b.m49511k());
                        if (this.f16637h != null && this.f16631b.m49521u(this.f16637h.f25339c.mo18153a())) {
                            this.f16637h.f25339c.mo18155d(this.f16631b.m49512l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i2 = this.f16633d + 1;
                this.f16633d = i2;
                if (i2 >= listM49513m.size()) {
                    int i3 = this.f16632c + 1;
                    this.f16632c = i3;
                    if (i3 >= listM49503c.size()) {
                        return false;
                    }
                    this.f16633d = 0;
                }
                ic9 ic9Var = (ic9) listM49503c.get(this.f16632c);
                Class cls = (Class) listM49513m.get(this.f16633d);
                this.f16639s = new coe(this.f16631b.m49502b(), ic9Var, this.f16631b.m49516p(), this.f16631b.m49520t(), this.f16631b.m49506f(), this.f16631b.m49519s(cls), cls, this.f16631b.m49511k());
                File fileMo42650b = this.f16631b.m49504d().mo42650b(this.f16639s);
                this.f16638q = fileMo42650b;
                if (fileMo42650b != null) {
                    this.f16634e = ic9Var;
                    this.f16635f = this.f16631b.m49510j(fileMo42650b);
                    this.f16636g = 0;
                }
            }
        } finally {
            et7.m25575e();
        }
    }

    @Override // p001o.lu4.InterfaceC15153a
    /* renamed from: c */
    public void mo17835c(Exception exc) {
        this.f16630a.mo39690a(this.f16639s, exc, this.f16637h.f25339c, ez4.RESOURCE_DISK_CACHE);
    }

    @Override // p001o.mu4
    public void cancel() {
        gjb.C13758a c13758a = this.f16637h;
        if (c13758a != null) {
            c13758a.f25339c.cancel();
        }
    }

    @Override // p001o.lu4.InterfaceC15153a
    /* renamed from: f */
    public void mo17836f(Object obj) {
        this.f16630a.mo39691c(this.f16634e, obj, this.f16637h.f25339c, ez4.RESOURCE_DISK_CACHE, this.f16639s);
    }
}
