package wr;

import du.C1823e;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4800k;
import qw.a0;
import yr.C8745d;
import yr.C8746e;
import yr.C8747f;
import yr.C8765x;
import yr.h0;
import yr.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wr.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8146b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f39024a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f39025b;

    public /* synthetic */ C8146b(int i10, InterfaceC2139c interfaceC2139c) {
        this.f39024a = i10;
        this.f39025b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f39024a) {
            case 0:
                C4800k it = (C4800k) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f39025b.invoke(new C8747f(it));
                break;
            case 1:
                this.f39025b.invoke(new C8746e(((Boolean) obj).booleanValue()));
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f39025b.invoke(bool);
                break;
            case 3:
                this.f39025b.invoke(new C8745d(((Boolean) obj).booleanValue()));
                break;
            case 4:
                String searchText = (String) obj;
                AbstractC4154l.m8923f(searchText, "searchText");
                this.f39025b.invoke(new C8765x(searchText));
                break;
            case 5:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                this.f39025b.invoke(it2);
                break;
            case 6:
                String searchText2 = (String) obj;
                AbstractC4154l.m8923f(searchText2, "searchText");
                this.f39025b.invoke(new h0(searchText2));
                break;
            case 7:
                String tag = (String) obj;
                AbstractC4154l.m8923f(tag, "tag");
                this.f39025b.invoke(new i0(tag));
                break;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f39025b.invoke(bool2);
                break;
            case 9:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f39025b.invoke(bool3);
                break;
            case 10:
                String screenName = (String) obj;
                AbstractC4154l.m8923f(screenName, "screenName");
                this.f39025b.invoke(screenName);
                break;
            case 11:
                this.f39025b.invoke(new C1823e(((Boolean) obj).booleanValue()));
                break;
            default:
                String it3 = (String) obj;
                AbstractC4154l.m8923f(it3, "it");
                this.f39025b.invoke(it3);
                break;
        }
        return a0.f30746a;
    }
}
