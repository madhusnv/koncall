package com.skydoves.balloon.compose;

import com.skydoves.balloon.Balloon;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import w2.InterfaceC7879r;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.compose.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1421b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7216a;

    /* renamed from: b */
    public final /* synthetic */ Object f7217b;

    /* renamed from: c */
    public final /* synthetic */ Object f7218c;

    /* renamed from: d */
    public final /* synthetic */ Object f7219d;

    /* renamed from: e */
    public final /* synthetic */ Object f7220e;

    /* renamed from: f */
    public final /* synthetic */ Object f7221f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2141e f7222g;

    /* renamed from: h */
    public final /* synthetic */ Object f7223h;

    /* renamed from: j */
    public final /* synthetic */ int f7224j;

    /* renamed from: k */
    public final /* synthetic */ int f7225k;

    public /* synthetic */ C1421b(String str, String str2, Integer num, String str3, List list, int i10, String str4, InterfaceC2141e interfaceC2141e, int i11) {
        this.f7216a = 2;
        this.f7217b = str;
        this.f7218c = str2;
        this.f7219d = num;
        this.f7220e = str3;
        this.f7221f = list;
        this.f7224j = i10;
        this.f7223h = str4;
        this.f7222g = interfaceC2141e;
        this.f7225k = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7216a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BalloonKt.Balloon$lambda$14((InterfaceC7879r) this.f7217b, (Balloon.Builder) this.f7218c, this.f7219d, (InterfaceC2139c) this.f7220e, (InterfaceC2139c) this.f7221f, this.f7222g, (InterfaceC2142f) this.f7223h, this.f7224j, this.f7225k, (InterfaceC3962k) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BalloonKt.Balloon$lambda$32((InterfaceC7879r) this.f7217b, (Balloon.Builder) this.f7218c, this.f7219d, (InterfaceC2139c) this.f7220e, (InterfaceC2139c) this.f7221f, this.f7222g, (InterfaceC2142f) this.f7223h, this.f7224j, this.f7225k, (InterfaceC3962k) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16133d((String) this.f7217b, (String) this.f7218c, (Integer) this.f7219d, (String) this.f7220e, (List) this.f7221f, this.f7224j, (String) this.f7223h, this.f7222g, (InterfaceC3962k) obj, C3953b.m8496A(this.f7225k | 1));
                return a0.f30746a;
        }
    }

    public /* synthetic */ C1421b(InterfaceC7879r interfaceC7879r, Balloon.Builder builder, Object obj, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, int i10, int i11, int i12) {
        this.f7216a = i12;
        this.f7217b = interfaceC7879r;
        this.f7218c = builder;
        this.f7219d = obj;
        this.f7220e = interfaceC2139c;
        this.f7221f = interfaceC2139c2;
        this.f7222g = interfaceC2141e;
        this.f7223h = interfaceC2142f;
        this.f7224j = i10;
        this.f7225k = i11;
    }
}
