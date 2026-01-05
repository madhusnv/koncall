package p001o;

import com.amplifyframework.datastore.generated.model.WebInitiatedCall;

/* loaded from: classes.dex */
public abstract class x5j {
    /* renamed from: e */
    public static s47 m55670e() {
        return uni.LB().d0(new gd()).d0(new hd()).C0(la1.BUFFER);
    }

    /* renamed from: f */
    public static /* synthetic */ void m55671f(WebInitiatedCall webInitiatedCall) {
    }

    /* renamed from: g */
    public static /* synthetic */ void m55672g(Throwable th) {
    }

    /* renamed from: h */
    public static /* synthetic */ void m55673h() {
    }

    /* renamed from: i */
    public static /* synthetic */ x8c m55674i(String str, String str2, l1 l1Var) {
        return l1Var.Mt(str, str2);
    }

    /* renamed from: j */
    public static void m55675j(String str, String str2) {
        String.format("calling logAndForgetWebInitiatedCall with parameters engagementId: %s and status: %s", str, str2);
        m55676k(str, str2).y0(i5f.m31599c()).h0(i5f.m31599c()).w0(new gu3() { // from class: o.t5j
            @Override // p001o.gu3
            public final void accept(Object obj) {
                x5j.m55671f((WebInitiatedCall) obj);
            }
        }, new gu3() { // from class: o.u5j
            @Override // p001o.gu3
            public final void accept(Object obj) {
                x5j.m55672g((Throwable) obj);
            }
        }, new jm() { // from class: o.v5j
            @Override // p001o.jm
            public final void run() {
                x5j.m55673h();
            }
        });
    }

    /* renamed from: k */
    public static x6c m55676k(final String str, final String str2) {
        return m55670e().h0().m55717M(new rl7() { // from class: o.w5j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return x5j.m55674i(str, str2, (l1) obj);
            }
        });
    }
}
