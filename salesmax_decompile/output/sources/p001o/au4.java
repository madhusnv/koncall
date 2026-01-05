package p001o;

import java.io.File;
import java.util.List;
import p001o.gjb;
import p001o.lu4;
import p001o.mu4;

/* loaded from: classes5.dex */
public class au4 implements mu4, lu4.InterfaceC15153a {

    /* renamed from: a */
    public final List f15240a;

    /* renamed from: b */
    public final t75 f15241b;

    /* renamed from: c */
    public final mu4.InterfaceC15433a f15242c;

    /* renamed from: d */
    public int f15243d;

    /* renamed from: e */
    public ic9 f15244e;

    /* renamed from: f */
    public List f15245f;

    /* renamed from: g */
    public int f15246g;

    /* renamed from: h */
    public volatile gjb.C13758a f15247h;

    /* renamed from: q */
    public File f15248q;

    public au4(t75 t75Var, mu4.InterfaceC15433a interfaceC15433a) {
        this(t75Var.m49503c(), t75Var, interfaceC15433a);
    }

    /* renamed from: a */
    public final boolean m17833a() {
        return this.f15246g < this.f15245f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (m17833a() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f15245f;
        r3 = r7.f15246g;
        r7.f15246g = r3 + 1;
        r7.f15247h = ((p001o.gjb) r0.get(r3)).mo18150b(r7.f15248q, r7.f15241b.m49520t(), r7.f15241b.m49506f(), r7.f15241b.m49511k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f15247h == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f15241b.m49521u(r7.f15247h.f25339c.mo18153a()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f15247h.f25339c.mo18155d(r7.f15241b.m49512l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f15247h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // p001o.mu4
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo17834b() {
        et7.m25571a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f15245f != null && m17833a()) {
                    break;
                }
                int i = this.f15243d + 1;
                this.f15243d = i;
                if (i >= this.f15240a.size()) {
                    return false;
                }
                ic9 ic9Var = (ic9) this.f15240a.get(this.f15243d);
                File fileMo42650b = this.f15241b.m49504d().mo42650b(new bu4(ic9Var, this.f15241b.m49516p()));
                this.f15248q = fileMo42650b;
                if (fileMo42650b != null) {
                    this.f15244e = ic9Var;
                    this.f15245f = this.f15241b.m49510j(fileMo42650b);
                    this.f15246g = 0;
                }
            } finally {
                et7.m25575e();
            }
        }
    }

    @Override // p001o.lu4.InterfaceC15153a
    /* renamed from: c */
    public void mo17835c(Exception exc) {
        this.f15242c.mo39690a(this.f15244e, exc, this.f15247h.f25339c, ez4.DATA_DISK_CACHE);
    }

    @Override // p001o.mu4
    public void cancel() {
        gjb.C13758a c13758a = this.f15247h;
        if (c13758a != null) {
            c13758a.f25339c.cancel();
        }
    }

    @Override // p001o.lu4.InterfaceC15153a
    /* renamed from: f */
    public void mo17836f(Object obj) {
        this.f15242c.mo39691c(this.f15244e, obj, this.f15247h.f25339c, ez4.DATA_DISK_CACHE, this.f15244e);
    }

    public au4(List list, t75 t75Var, mu4.InterfaceC15433a interfaceC15433a) {
        this.f15243d = -1;
        this.f15240a = list;
        this.f15241b = t75Var;
        this.f15242c = interfaceC15433a;
    }
}
