package kr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.ja;
import i3.AbstractC3166c;
import im.EnumC3313o;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import k2.w0;
import qv.AbstractC6327b;
import qw.InterfaceC6355e;
import s2.C6734c;
import sq.g2;
import sv.C6956d;
import wr.AbstractC8154j;
import zr.C9032b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4193h implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21252a;

    /* renamed from: b */
    public final /* synthetic */ Object f21253b;

    /* renamed from: c */
    public final /* synthetic */ Object f21254c;

    /* renamed from: d */
    public final /* synthetic */ int f21255d;

    /* renamed from: e */
    public final /* synthetic */ Object f21256e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6355e f21257f;

    public /* synthetic */ C4193h(AbstractC3166c abstractC3166c, String str, String str2, InterfaceC2137a interfaceC2137a, int i10) {
        this.f21252a = 1;
        this.f21256e = abstractC3166c;
        this.f21253b = str;
        this.f21254c = str2;
        this.f21257f = interfaceC2137a;
        this.f21255d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21252a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4189d.m8935c((String) this.f21253b, (ArrayList) this.f21256e, (String) this.f21254c, (InterfaceC2139c) this.f21257f, (InterfaceC3962k) obj, C3953b.m8496A(this.f21255d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC6327b.m12358w((AbstractC3166c) this.f21256e, (String) this.f21253b, (String) this.f21254c, (InterfaceC2137a) this.f21257f, (InterfaceC3962k) obj, C3953b.m8496A(this.f21255d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC6327b.m12342g((C6956d) this.f21253b, (ja) this.f21254c, (w0) this.f21256e, (InterfaceC2137a) this.f21257f, (InterfaceC3962k) obj, C3953b.m8496A(this.f21255d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                g2.m13137O((InterfaceC2137a) this.f21253b, (C6734c) this.f21254c, (C6734c) this.f21256e, (C6734c) this.f21257f, (InterfaceC3962k) obj, C3953b.m8496A(this.f21255d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC8154j.m15324c((C9032b) this.f21253b, (List) this.f21254c, (EnumC3313o) this.f21256e, (InterfaceC2139c) this.f21257f, (InterfaceC3962k) obj, C3953b.m8496A(this.f21255d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C4193h(Object obj, Object obj2, Object obj3, InterfaceC6355e interfaceC6355e, int i10, int i11) {
        this.f21252a = i11;
        this.f21253b = obj;
        this.f21254c = obj2;
        this.f21256e = obj3;
        this.f21257f = interfaceC6355e;
        this.f21255d = i10;
    }

    public /* synthetic */ C4193h(String str, ArrayList arrayList, String str2, InterfaceC2139c interfaceC2139c, int i10) {
        this.f21252a = 0;
        this.f21253b = str;
        this.f21256e = arrayList;
        this.f21254c = str2;
        this.f21257f = interfaceC2139c;
        this.f21255d = i10;
    }
}
