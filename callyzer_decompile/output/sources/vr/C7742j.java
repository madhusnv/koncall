package vr;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import is.C3348b;
import java.util.List;
import java.util.Map;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import ls.C4513d;
import q1.C6080h;
import r1.C6431p;
import s2.C6734c;
import sq.C6908y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vr.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7742j implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37322a;

    /* renamed from: b */
    public final /* synthetic */ C3348b f37323b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f37324c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f37325d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2143g f37326e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2142f f37327f;

    /* renamed from: g */
    public final /* synthetic */ w0 f37328g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2141e f37329h;

    public /* synthetic */ C7742j(C3348b c3348b, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2143g interfaceC2143g, InterfaceC2142f interfaceC2142f, w0 w0Var, InterfaceC2141e interfaceC2141e, int i10) {
        this.f37322a = i10;
        this.f37323b = c3348b;
        this.f37324c = interfaceC2139c;
        this.f37325d = interfaceC2139c2;
        this.f37326e = interfaceC2143g;
        this.f37327f = interfaceC2142f;
        this.f37328g = w0Var;
        this.f37329h = interfaceC2141e;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f37322a) {
            case 0:
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                C3348b c3348b = this.f37323b;
                for (Map.Entry entry : c3348b.f17730r.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    LazyColumn.m12100r(null, (3 & 2) != 0 ? null : "Date", new C6734c(new C4513d(str, 2), true, -1172565155));
                    LazyColumn.m12099p(list.size(), new C6431p(19, new C7734b(2), list), new C6908y(list, 14), new C6734c(new C7750r(list, this.f37324c, c3348b, this.f37325d, this.f37326e, this.f37327f, this.f37328g, this.f37329h, 0), true, -1091073711));
                }
                if (c3348b.f17714b) {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC7733a.f37290c);
                } else {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC7733a.f37291d);
                }
                break;
            default:
                C6080h LazyColumn2 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn2, "$this$LazyColumn");
                C3348b c3348b2 = this.f37323b;
                List list2 = c3348b2.f17713a;
                LazyColumn2.m12099p(list2.size(), new C6431p(20, new C7734b(1), list2), new C6908y(list2, 15), new C6734c(new C7750r(list2, this.f37324c, c3348b2, this.f37325d, this.f37326e, this.f37327f, this.f37328g, this.f37329h, 1), true, -1091073711));
                if (c3348b2.f17714b) {
                    LazyColumn2.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC7733a.f37292e);
                } else {
                    LazyColumn2.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC7733a.f37293f);
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
