package fz;

import dz.C1865b;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.userauth.UserAuthException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fz.c */
/* loaded from: classes3.dex */
public final class C2406c extends AbstractC2404a {

    /* renamed from: d */
    public final C2408e f10891d;

    public C2406c(C2408e c2408e) {
        super("keyboard-interactive");
        this.f10891d = c2408e;
    }

    @Override // fz.AbstractC2404a
    /* renamed from: a */
    public final C5035o mo6078a() {
        C5035o c5035oMo6078a = super.mo6078a();
        byte[] bytes = "".getBytes(StandardCharsets.UTF_8);
        c5035oMo6078a.m9912g(bytes.length, bytes);
        StringBuilder sb2 = new StringBuilder();
        this.f10891d.getClass();
        for (String str : Collections.EMPTY_LIST) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(str);
        }
        c5035oMo6078a.m9917l(sb2.toString(), StandardCharsets.UTF_8);
        return c5035oMo6078a;
    }

    @Override // fz.AbstractC2404a
    /* renamed from: c */
    public final void mo6080c() {
        C2405b c2405b = this.f10891d.f10898b;
    }

    @Override // fz.AbstractC2404a, net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws UserAuthException {
        C2408e c2408e = this.f10891d;
        if (enumC5034n != EnumC5034n.USERAUTH_60) {
            super.mo5498h(enumC5034n, c5035o);
            throw null;
        }
        try {
            m6079b();
            String strM9929x = c5035o.m9929x();
            String strM9929x2 = c5035o.m9929x();
            c2408e.getClass();
            c2408e.f10899c.mo5828d("Challenge - name=`{}`; instruction=`{}`", strM9929x, strM9929x2);
            c5035o.m9929x();
            int iM9930y = (int) c5035o.m9930y();
            C2405b[] c2405bArr = new C2405b[iM9930y];
            for (int i10 = 0; i10 < iM9930y; i10++) {
                String strM9929x3 = c5035o.m9929x();
                boolean zM9923r = c5035o.m9923r();
                this.f10887a.mo5828d("Requesting response for challenge `{}`; echo={}", strM9929x3, Boolean.valueOf(zM9923r));
                c2405bArr[i10] = new C2405b((zM9923r || !c2408e.f10897a.matcher(strM9929x3).matches()) ? C2408e.f10896e : (char[]) c2408e.f10898b.f10890a.clone());
            }
            C5035o c5035o2 = new C5035o(EnumC5034n.USERAUTH_INFO_RESPONSE);
            c5035o2.m9918m(iM9930y);
            for (int i11 = 0; i11 < iM9930y; i11++) {
                c5035o2.m9915j(c2405bArr[i11].f10890a);
            }
            ((C1865b) this.f10889c.f42584c).f29508c.m14819i(c5035o2);
        } catch (Buffer$BufferException e2) {
            throw new UserAuthException(e2);
        }
    }
}
