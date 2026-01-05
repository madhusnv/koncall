package p007h;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p008i.AbstractC3064a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h.h */
/* loaded from: classes.dex */
public final class C2756h extends AbstractC2751c {

    /* renamed from: a */
    public final /* synthetic */ int f15304a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC2757i f15305b;

    /* renamed from: c */
    public final /* synthetic */ String f15306c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC3064a f15307d;

    public /* synthetic */ C2756h(AbstractC2757i abstractC2757i, String str, AbstractC3064a abstractC3064a, int i10) {
        this.f15304a = i10;
        this.f15305b = abstractC2757i;
        this.f15306c = str;
        this.f15307d = abstractC3064a;
    }

    @Override // p007h.AbstractC2751c
    /* renamed from: a */
    public final void mo1274a(Object obj) {
        switch (this.f15304a) {
            case 0:
                AbstractC2757i abstractC2757i = this.f15305b;
                ArrayList arrayList = abstractC2757i.f15311d;
                LinkedHashMap linkedHashMap = abstractC2757i.f15309b;
                String str = this.f15306c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC3064a abstractC3064a = this.f15307d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC3064a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    abstractC2757i.mo5506b(iIntValue, abstractC3064a, obj);
                    return;
                } catch (Exception e2) {
                    arrayList.remove(str);
                    throw e2;
                }
            default:
                AbstractC2757i abstractC2757i2 = this.f15305b;
                ArrayList arrayList2 = abstractC2757i2.f15311d;
                LinkedHashMap linkedHashMap2 = abstractC2757i2.f15309b;
                String str2 = this.f15306c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC3064a abstractC3064a2 = this.f15307d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC3064a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    abstractC2757i2.mo5506b(iIntValue2, abstractC3064a2, obj);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }

    /* renamed from: b */
    public void m6749b() {
        this.f15305b.m6754f(this.f15306c);
    }
}
