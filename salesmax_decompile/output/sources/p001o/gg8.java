package p001o;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import p001o.rs;

/* loaded from: classes2.dex */
public final class gg8 {

    /* renamed from: a */
    public final Fragment f25099a;

    /* renamed from: b */
    public InterfaceC13705a f25100b;

    /* renamed from: c */
    public final ws f25101c;

    /* renamed from: d */
    public final String f25102d;

    /* renamed from: o.gg8$a */
    public interface InterfaceC13705a {
        /* renamed from: a */
        void mo2826a(Uri uri);

        /* renamed from: b */
        void mo2827b();
    }

    public gg8(Fragment fragment, String str) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(str, "type");
        this.f25099a = fragment;
        ws wsVarRegisterForActivityResult = fragment.registerForActivityResult(new rs(), new ns() { // from class: o.fg8
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                gg8.m28575d(this.f23286a, (Uri) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f25101c = wsVarRegisterForActivityResult;
        this.f25102d = str;
    }

    /* renamed from: d */
    public static final void m28575d(gg8 gg8Var, Uri uri) {
        sq8.m48649h(gg8Var, "this$0");
        if (uri == null) {
            InterfaceC13705a interfaceC13705a = gg8Var.f25100b;
            if (interfaceC13705a != null) {
                interfaceC13705a.mo2827b();
                return;
            }
            return;
        }
        InterfaceC13705a interfaceC13705a2 = gg8Var.f25100b;
        if (interfaceC13705a2 != null) {
            interfaceC13705a2.mo2826a(uri);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Selected URI: ");
        sb.append(uri);
    }

    /* renamed from: b */
    public final void m28576b(InterfaceC13705a interfaceC13705a) {
        this.f25100b = interfaceC13705a;
        m28577c();
    }

    /* renamed from: c */
    public final void m28577c() {
        if (sq8.m48644c(this.f25102d, "picture_video")) {
            this.f25101c.m54945b(r7d.m46309a(rs.C16656b.f43994a));
        } else {
            this.f25101c.m54945b(r7d.m46309a(rs.C16657c.f43995a));
        }
    }

    public /* synthetic */ gg8(Fragment fragment, String str, int i, id5 id5Var) {
        this(fragment, (i & 2) != 0 ? "picture" : str);
    }
}
