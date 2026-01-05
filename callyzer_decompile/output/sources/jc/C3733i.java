package jc;

import ai.AbstractC0151h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.yd;
import ud.InterfaceC7400d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.i */
/* loaded from: classes.dex */
public final class C3733i extends AbstractC0151h implements InterfaceC7400d {

    /* renamed from: b */
    public final /* synthetic */ int f19577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3733i(int i10) {
        super(2);
        this.f19577b = i10;
    }

    /* renamed from: N */
    public C3739o m8274N() {
        Map values = (Map) this.f482a;
        AbstractC4154l.m8923f(values, "values");
        return new C3739o(values);
    }

    @Override // ud.InterfaceC7400d
    /* renamed from: m */
    public final Object mo296m() {
        switch (this.f19577b) {
            case 0:
                LinkedHashMap linkedHashMapM11067a = yd.m11067a((Map) this.f482a);
                C3733i c3733i = new C3733i(0);
                ((Map) c3733i.f482a).putAll(linkedHashMapM11067a);
                return c3733i;
            default:
                LinkedHashMap linkedHashMapM11067a2 = yd.m11067a((Map) this.f482a);
                C3733i c3733i2 = new C3733i(1);
                ((Map) c3733i2.f482a).putAll(linkedHashMapM11067a2);
                return c3733i2;
        }
    }

    public String toString() {
        switch (this.f19577b) {
            case 1:
                return "HeadersBuilder " + ((Map) this.f482a).entrySet() + ' ';
            default:
                return super.toString();
        }
    }
}
