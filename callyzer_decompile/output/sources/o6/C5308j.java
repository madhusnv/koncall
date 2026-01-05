package o6;

import ex.InterfaceC2139c;
import java.io.Serializable;
import java.util.Iterator;
import uw.InterfaceC7559c;
import wj.C8090p;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.j */
/* loaded from: classes.dex */
public final class C5308j extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public Object f26064a;

    /* renamed from: b */
    public Serializable f26065b;

    /* renamed from: c */
    public Object f26066c;

    /* renamed from: d */
    public Object f26067d;

    /* renamed from: e */
    public Iterator f26068e;

    /* renamed from: f */
    public int f26069f;

    /* renamed from: g */
    public int f26070g;

    /* renamed from: h */
    public final /* synthetic */ C5321w f26071h;

    /* renamed from: j */
    public final /* synthetic */ C8090p f26072j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5308j(C5321w c5321w, C8090p c8090p, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f26071h = c5321w;
        this.f26072j = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new C5308j(this.f26071h, this.f26072j, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((C5308j) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5308j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
