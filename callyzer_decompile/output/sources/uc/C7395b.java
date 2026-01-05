package uc;

import java.util.LinkedHashMap;
import java.util.Map;
import jc.AbstractC3745u;
import jc.C3733i;
import jc.h0;
import og.yd;
import ud.InterfaceC7400d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uc.b */
/* loaded from: classes.dex */
public final class C7395b implements InterfaceC7400d {

    /* renamed from: a */
    public h0 f35162a;

    /* renamed from: b */
    public final C3733i f35163b;

    /* renamed from: c */
    public AbstractC3745u f35164c;

    public C7395b(h0 h0Var, C3733i c3733i, AbstractC3745u abstractC3745u) {
        this.f35162a = h0Var;
        this.f35163b = c3733i;
        this.f35164c = abstractC3745u;
    }

    @Override // ud.InterfaceC7400d
    /* renamed from: m */
    public final Object mo296m() {
        h0 h0Var = this.f35162a;
        LinkedHashMap linkedHashMapM11067a = yd.m11067a((Map) this.f35163b.f482a);
        C3733i c3733i = new C3733i(1);
        ((Map) c3733i.f482a).putAll(linkedHashMapM11067a);
        return new C7395b(h0Var, c3733i, this.f35164c);
    }

    public final String toString() {
        return "HttpResponseBuilder(status=" + this.f35162a + ", headers=" + this.f35163b + ", body=" + this.f35164c + ')';
    }
}
